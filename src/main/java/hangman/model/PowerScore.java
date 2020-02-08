package hangman.model;

import hangman.exception.hangmanException;

public class PowerScore implements GameScore {

	
	/**
	 * @pre inicia con 0 puntos
	 * @pos condicion actual del puntaje
	 * @param correctCount 
	 * @param incorrectCount 
	 * @return ans 
	 * @throws NEGATIVE_VALUE_EXCEPTION, cuando el valor es negativo
	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount)throws hangmanException {
		if(correctCount< 0 || incorrectCount< 0) {
			throw new hangmanException(hangmanException.NEGATIVE_VALUE_EXCEPTION);
		}
		return 0;
	}

}
