package StringcompreessorProblem;

public class StringCompression {
    
    public static String compress(String s) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
                compressed.append(s.charAt(i - 1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }
        return compressed.toString();
    }
    
    public static String optimizeCompression(String s) {
        StringBuilder optimized = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            
            while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                count = count * 10 + (s.charAt(++i) - '0');
            }
            
            if (count == 1) {
                optimized.append(ch); 
            } else {
                optimized.append(ch).append(count);
            }
        }
        return optimized.toString();
    }
    
    public static String decompress(String s) {
        StringBuilder decompressed = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            
            while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                count = count * 10 + (s.charAt(++i) - '0');
            }
            
            decompressed.append(String.valueOf(ch).repeat(Math.max(1, count)));
        }
        return decompressed.toString();
    }
    
    // Test Cases
    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String compressed = compress(input);
        String optimized = optimizeCompression(compressed);
        String decompressed = decompress(optimized);
        
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressed);
        System.out.println("Optimized Compression: " + optimized);
        System.out.println("Decompressed: " + decompressed);
        
       
    }
}

