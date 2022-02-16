package quizlet;

import java.util.ArrayList;
import java.util.Arrays;

public class Matching
	{
		static int index;
		public static void match()
			{
				System.out.println("Match the term with it's definition");
				int[] indexArray = new int[QuizletRunner.numOfCards];

				for (int i = 0; i < QuizletRunner.numOfCards; i++)
					{
						
						index = (int) (Math.random() * QuizletRunner.Flashcards.size());
						
						if (Arrays.asList(indexArray).contains(index))
							{
								index = (int) (Math.random() * QuizletRunner.Flashcards.size());
								System.out.println(index);
							} 
						
						else if (!Arrays.asList(indexArray).contains(index))
							{
								indexArray[i]=index;
							}
						

						//System.out.print((i + 1) + ". ");
						//System.out.println((quizletRunner.Flashcards.get(indexArray[i]).getTerm()));

					}

			}

	}
