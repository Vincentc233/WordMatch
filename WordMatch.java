public class WordMatch{

private String secret;

public WordMatch(String word)
{
    secret = word; 
}

public int scoreGuess(String guess)
{   
    int count = 0;
    for(int i = 0; i<secret.length()-guess.length()+1; i++){
        if(guess.equals(secret.substring(i, i+guess.length()))) count++;
    }
    return( count* guess.length()*guess.length());
}


public String findBetterGuess(String guess1, String guess2)
{ 
    if(this.scoreGuess(guess2) > this.scoreGuess(guess1)) return guess2;
    return guess1; 
}
}

