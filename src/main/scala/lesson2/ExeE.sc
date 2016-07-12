
def rVowels(s: String, acc: String): String = {
  if (s.isEmpty) return acc;

  if ("aeiou".contains(s.head)) {
    return rVowels(s.tail, acc + s.head)
  } else {
    return rVowels(s.tail, acc)
  }
}

rVowels("aeiovvvu", "")





def rVowels2(s: String): String = {
  if (s.isEmpty) return "";

  if ("aeiou".contains(s.head)) {
    return s.head + rVowels2(s.tail);
  } else {
    return rVowels2(s.tail);
  }

}
rVowels2("aeiovvvu")