package com.jpchar.structures;

import java.util.ArrayList;
import java.util.List;

public class KanaSyllabary {

	public static List<Syllable> syllabaryHiragana, syllabaryKatakana, kanji;
	
	public KanaSyllabary() {
		
		//Hiragana
		KanaSyllabary.syllabaryHiragana = new ArrayList<Syllable>();
		
		KanaSyllabary.syllabaryHiragana.add(new Syllable("a", 1, 3));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("i", 2, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("u", 3, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("e", 4, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("o", 5, 3));
		
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ka", 6, 3));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ki", 7, 3));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ku", 8, 1));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ke", 9, 3));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ko", 10, 2));
		
		KanaSyllabary.syllabaryHiragana.add(new Syllable("sa", 11, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("shi", 12, 1));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("su", 13, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("se", 14, 3));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("so", 15, 1));
		
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ta", 16, 3));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("chi", 17, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("tsu", 18, 1));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("te", 19, 1));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("to", 20, 2));
		
		KanaSyllabary.syllabaryHiragana.add(new Syllable("na", 21, 4));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ni", 22, 3));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("nu", 23, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ne", 24, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("no", 25, 1));
		
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ha", 26, 3));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("hi", 27, 1));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("fu", 28, 4));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("he", 29, 1));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ho", 30, 4));
		
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ma", 31, 3));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("mi", 32, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("mu", 33, 3));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("me", 34, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("mo", 35, 3));
		
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ya", 36, 3));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("yu", 37, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("yo", 38, 2));
		
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ra", 39, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ri", 40, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ru", 41, 1));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("re", 42, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("ro", 43, 1));
		
		KanaSyllabary.syllabaryHiragana.add(new Syllable("wa", 44, 2));
		KanaSyllabary.syllabaryHiragana.add(new Syllable("wo", 45, 3));
		
		KanaSyllabary.syllabaryHiragana.add(new Syllable("n", 46, 1));
		
		
		//Katakana
		KanaSyllabary.syllabaryKatakana = new ArrayList<Syllable>();
		
		KanaSyllabary.syllabaryKatakana.add(new Syllable("a", 1, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("i", 2, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("u", 3, 3));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("e", 4, 3));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("o", 5, 3));
		
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ka", 6, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ki", 7, 3));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ku", 8, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ke", 9, 3));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ko", 10, 2));
		
		KanaSyllabary.syllabaryKatakana.add(new Syllable("sa", 11, 3));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("shi", 12, 3));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("su", 13, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("se", 14, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("so", 15, 2));
		
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ta", 16, 3));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("chi", 17, 3));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("tsu", 18, 3));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("te", 19, 3));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("to", 20, 2));
		
		KanaSyllabary.syllabaryKatakana.add(new Syllable("na", 21, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ni", 22, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("nu", 23, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ne", 24, 4));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("no", 25, 1));
		
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ha", 26, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("hi", 27, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("fu", 28, 1));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("he", 29, 1));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ho", 30, 4));
		
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ma", 31, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("mi", 32, 3));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("mu", 33, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("me", 34, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("mo", 35, 3));
		
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ya", 36, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("yu", 37, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("yo", 38, 3));
		
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ra", 39, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ri", 40, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ru", 41, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("re", 42, 1));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("ro", 43, 3));
		
		KanaSyllabary.syllabaryKatakana.add(new Syllable("wa", 44, 2));
		KanaSyllabary.syllabaryKatakana.add(new Syllable("wo", 45, 3));
		
		KanaSyllabary.syllabaryKatakana.add(new Syllable("n", 46, 2));
		
		
		//Kanji
		KanaSyllabary.kanji = new ArrayList<Syllable>();
		
		KanaSyllabary.kanji.add(new Syllable("one", 1, 1));
		KanaSyllabary.kanji.add(new Syllable("two", 2, 2));
		KanaSyllabary.kanji.add(new Syllable("three", 3, 3));
		KanaSyllabary.kanji.add(new Syllable("four", 4, 5));
		KanaSyllabary.kanji.add(new Syllable("five", 5, 4));
		KanaSyllabary.kanji.add(new Syllable("six", 6, 4));
		KanaSyllabary.kanji.add(new Syllable("seven", 7, 2));
		KanaSyllabary.kanji.add(new Syllable("eight", 8, 2));
		KanaSyllabary.kanji.add(new Syllable("nine", 9, 2));
		KanaSyllabary.kanji.add(new Syllable("ten", 10, 2));
		
		KanaSyllabary.kanji.add(new Syllable("hundred", 11, 6));
		KanaSyllabary.kanji.add(new Syllable("thousand", 12, 3));
		KanaSyllabary.kanji.add(new Syllable("ten thousand", 13, 3));
		KanaSyllabary.kanji.add(new Syllable("father", 14, 4));
		KanaSyllabary.kanji.add(new Syllable("mother", 15, 5));
		KanaSyllabary.kanji.add(new Syllable("friend", 16, 4));
		KanaSyllabary.kanji.add(new Syllable("woman; female", 17, 3));
		KanaSyllabary.kanji.add(new Syllable("man; male", 18, 7));
		KanaSyllabary.kanji.add(new Syllable("person", 19, 2));
		KanaSyllabary.kanji.add(new Syllable("child", 20, 3));
		
		KanaSyllabary.kanji.add(new Syllable("sun; day", 21, 4));
		KanaSyllabary.kanji.add(new Syllable("moon; month", 22, 4));
		KanaSyllabary.kanji.add(new Syllable("fire; light", 23, 4));
		KanaSyllabary.kanji.add(new Syllable("water", 24, 4));
		KanaSyllabary.kanji.add(new Syllable("tree; wood", 25, 4));
		KanaSyllabary.kanji.add(new Syllable("gold; money", 26, 8));
		KanaSyllabary.kanji.add(new Syllable("earth; ground", 27, 3));
		KanaSyllabary.kanji.add(new Syllable("book; root", 28, 5));
		KanaSyllabary.kanji.add(new Syllable("rest; vavation", 29, 6));
		KanaSyllabary.kanji.add(new Syllable("word; language", 30, 14));
		
		KanaSyllabary.kanji.add(new Syllable("year", 31, 6));
		KanaSyllabary.kanji.add(new Syllable("noon", 32, 4));
		KanaSyllabary.kanji.add(new Syllable("before; in front of", 33, 9));
		KanaSyllabary.kanji.add(new Syllable("behind; after", 34, 9));
		KanaSyllabary.kanji.add(new Syllable("time; hour counter", 35, 10));
		KanaSyllabary.kanji.add(new Syllable("space; between", 36, 12));
		KanaSyllabary.kanji.add(new Syllable("every", 37, 6));
		KanaSyllabary.kanji.add(new Syllable("previous; ahead", 38, 6));
		KanaSyllabary.kanji.add(new Syllable("now", 39, 4));
		KanaSyllabary.kanji.add(new Syllable("what; how many", 40, 7));
		
		KanaSyllabary.kanji.add(new Syllable("top; above", 41, 3));
		KanaSyllabary.kanji.add(new Syllable("bottom; under", 42, 3));
		KanaSyllabary.kanji.add(new Syllable("left", 43, 5));
		KanaSyllabary.kanji.add(new Syllable("right", 44, 5));
		KanaSyllabary.kanji.add(new Syllable("north", 45, 5));
		KanaSyllabary.kanji.add(new Syllable("south", 46, 9));
		KanaSyllabary.kanji.add(new Syllable("east", 47, 8));
		KanaSyllabary.kanji.add(new Syllable("west", 48, 6));
		KanaSyllabary.kanji.add(new Syllable("outside; foreign", 49, 5));
		KanaSyllabary.kanji.add(new Syllable("name; fame", 50, 6));
		
		KanaSyllabary.kanji.add(new Syllable("high; tall", 51, 10));
		KanaSyllabary.kanji.add(new Syllable("small; little", 52, 3));
		KanaSyllabary.kanji.add(new Syllable("middle; inside", 53, 4));
		KanaSyllabary.kanji.add(new Syllable("great; big", 54, 3));
		KanaSyllabary.kanji.add(new Syllable("leader; long", 55, 8));
		KanaSyllabary.kanji.add(new Syllable("half", 56, 5));
		KanaSyllabary.kanji.add(new Syllable("part; to understand", 57, 4));
		KanaSyllabary.kanji.add(new Syllable("learning; science", 58, 8));
		KanaSyllabary.kanji.add(new Syllable("school", 59, 10));
		KanaSyllabary.kanji.add(new Syllable("birth; life", 60, 5));

		KanaSyllabary.kanji.add(new Syllable("mountain", 61, 3));
		KanaSyllabary.kanji.add(new Syllable("river; stream", 62, 3));
		KanaSyllabary.kanji.add(new Syllable("white", 63, 5));
		KanaSyllabary.kanji.add(new Syllable("heaven; sky", 64, 4));
		KanaSyllabary.kanji.add(new Syllable("rain", 65, 8));
		KanaSyllabary.kanji.add(new Syllable("electricity", 66, 13));
		KanaSyllabary.kanji.add(new Syllable("spirit; mind; energy", 67, 6));
		KanaSyllabary.kanji.add(new Syllable("vehicle; car", 68, 7));
		KanaSyllabary.kanji.add(new Syllable("country; nation", 69, 8));
		KanaSyllabary.kanji.add(new Syllable("circle; yen", 70, 4));
		
		KanaSyllabary.kanji.add(new Syllable("talk; story", 71, 13));
		KanaSyllabary.kanji.add(new Syllable("to hear; to ask", 72, 14));
		KanaSyllabary.kanji.add(new Syllable("eating; meal", 73, 9));
		KanaSyllabary.kanji.add(new Syllable("to read", 74, 14));
		KanaSyllabary.kanji.add(new Syllable("to come", 75, 7));
		KanaSyllabary.kanji.add(new Syllable("book; to write", 76, 10));
		KanaSyllabary.kanji.add(new Syllable("to show", 77, 7));
		KanaSyllabary.kanji.add(new Syllable("to go", 78, 6));
		KanaSyllabary.kanji.add(new Syllable("to go out; leave", 79, 5));
		KanaSyllabary.kanji.add(new Syllable("enter; to go in", 80, 2));
		
		KanaSyllabary.kanji.add(new Syllable("to meet", 81, 6));
		
	}	
}
