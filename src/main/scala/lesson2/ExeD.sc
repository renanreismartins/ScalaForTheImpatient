

def vowels(s: String) = for (c <- s if ("aeiou".contains(c))) yield c


vowels("abcdefgi")

