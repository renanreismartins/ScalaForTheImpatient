def vowels(s: String, vowels: String = "aeiou") = for (c <- s if (vowels.contains(c))) yield c

vowels(s = "aeiovvvu")