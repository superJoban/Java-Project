package application;

public class Poll {
	private String name;
	private Party[] parties;
	private int partiesInPoll;

	public Poll(String name, int maxNumberOfParties) {
		this.name = name; 
		parties = new Party[maxNumberOfParties];
	}
	
	public String getPollName() {
		return name;
	}
	
	public int getNumberOfParties() {
		return partiesInPoll;
	}
	public void addParty(Party aParty) {
		parties[partiesInPoll++] = aParty;
	}

	public Party getParty(String name) {
		return null;
	}
	
	public Party[] getPartiesSortedBySeats() {
		return parties;
	}

	public Party[] getPartiesSortedByVotes() {
		return parties;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
