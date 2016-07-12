
def rVowels(s: String, acc: String): String = {
  if (s.isEmpty) return acc;

  if ("aeiou".contains(s.head)) {
    return rVowels(s.tail, acc + s.head)
  } else {
    return rVowels(s.tail, acc)
  }
}

rVowels("aeiovvvu", "")