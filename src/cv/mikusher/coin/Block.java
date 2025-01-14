package cv.mikusher.coin;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

// https://www.ssaurel.com/blog/create-your-own-blockchain-in-30-minutes/
// https://medium.com/programmers-blockchain/create-simple-blockchain-java-tutorial-from-scratch-6eeed3cb03fa

public class Block {

	  private final int index, nonce;
	  private final long timestamp;
          private final String hash, previousHash, data;
		
	  public Block(int index, long timestamp, String previousHash, String data) {
	    this.index = index;
	    this.timestamp = timestamp;
	    this.previousHash = previousHash;
	    this.data = data;
	    nonce = 0;
	    hash = Block.calculateHash(Block.this);
	  }

	  public int getIndex() {
	    return index;
	  }

	  public long getTimestamp() {
	    return timestamp;
	  }

	  public String getHash() {
	    return hash;
	  }

	  public String getPreviousHash() {
	    return previousHash;
	  }

	  public String getData() {
	    return data;
	  }

	  public String str() {
	    return index + timestamp + previousHash + data + nonce;
	  }

          @Override
	  public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Block #").append(index).append(" [previousHash : ").append(previousHash).append(", ").
	    append("timestamp : ").append(new Date(timestamp)).append(", ").append("data : ").append(data).append(", ").
	    append("hash : ").append(hash).append("]");
	    return builder.toString();
	  }
		
	  public static String calculateHash(Block block) {
	    if (block != null) {
	      MessageDigest digest;

	      try {
	        digest = MessageDigest.getInstance("SHA-256");
	      } catch (NoSuchAlgorithmException e) {
	        return null;
	      }
				
	      String txt = block.str();
	      final byte bytes[] = digest.digest(txt.getBytes());
	      final StringBuilder builder = new StringBuilder();
				
	      for (final byte b : bytes) {
	        String hex = Integer.toHexString(0xff & b);

	        if (hex.length() == 1) {
	          builder.append('0');
	        }
					
	        builder.append(hex);
	      }
				
	      return builder.toString();
	    }
		  
	    return null;
	  }
		
	}