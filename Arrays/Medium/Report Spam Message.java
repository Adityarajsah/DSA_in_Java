class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> bannedSet = new HashSet<>();

        for (int i = 0; i < bannedWords.length; i++) {
            bannedSet.add(bannedWords[i]);
        }

        
        int count = 0;
        
        
        for (int i = 0; i < message.length; i++) {
            if (bannedSet.contains(message[i])) {
                count++;
            }
           
            if (count >= 2) {
                return true;
            }
        }

        
        return false;
    }
}