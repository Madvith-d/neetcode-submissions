class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char , int > mp1 ;
        unordered_map<char , int > mp2 ;
        for(char c : s){
            mp1[c]+=1;
        }

        for(char c : t){
            mp2[c]+=1;
        }
        if(mp1.size() != mp2.size() ) return false ;
        for(const auto& [key , value ] : mp1) {
            if(mp2.find(key) != mp2.end() && mp2[key] == value){
                continue;
            }else{
                return false;
            }
        }
        return true;

    }
};
