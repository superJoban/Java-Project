package application;

public class PollList {
	private Poll[] polls;
	private int numOfSeats;
	// The instance variable pollsInList should be removed and should not be included in your final version
	private int pollsInList;
	
	public PollList(int numOfPolls, int numOfSeats) {
		polls = new Poll[numOfPolls];
		this.numOfSeats = numOfSeats;
	}
	
	public int getNumOfSeats() {
		return numOfSeats;
	}

	public Poll[] getPolls() {
		return polls;
	}

	public void addPoll(Poll aPoll) {
		polls[pollsInList++] = aPoll;
	}
	
	public Poll getAggregatePoll(String[] partyNames) {
		return polls[0];
	}
	
}
