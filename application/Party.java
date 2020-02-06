package application;

public class Party {
	private String name;
	private float seats;
	private float percent;
	
	public Party(String partyName) {
		name = partyName;
	}
	
	public Party(String partyName, float projectedNumberOfSeats, float projectedPercentageOfVotes) {
		name = partyName;
		seats = projectedNumberOfSeats;
		percent = projectedPercentageOfVotes;
	}
	
	public float getProjectedPercentageOfVotes() {
		return percent;
	}
	
	public String getName() {
		return name;
	}
	
	public void setProjectedPercentageOfVotes(float projectedPercentageOfVotes) {
		percent = projectedPercentageOfVotes;
	}

	public float getProjectedNumberOfSeats() {
		return seats;
	}

	public void setProjectedNumberOfSeats(float projectedNumberOfSeats) {
		seats = projectedNumberOfSeats;
	}

	@Override
	public String toString() {
		return name + " (" + percent + "% " + seats + ")";
	}
	
	public double projectedPercentOfSeats(int totalNumberOfSeats) {
		return 0.5;
	}
	
	public String textVisualizationBySeats(int maxStars, int starsNeededForMajority, double numOfSeatsPerStar) {
		return toString();
	}

	public String textVisualizationByVotes(int maxStars, int starsNeededForMajority, double percentOfVotesPerStar) {
		return toString();
	}
}
