def vowels(s: String) = {
  var result = ""
  for (c <- s) {
    if ("aeiou".contains(c)) {
      result += c
    }
  }
  result
}

vowels("abcdefgi")