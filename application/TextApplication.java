package application;

public class TextApplication {
	public TextApplication(PollList polls) {
	}
	public void displayPollsBySeat(String[] partyNames) {
		System.out.println("Not implemented");
	}
	public static void main(String[] args) {
		int numOfSeats = 100;
		PollList polls = new PollList(4, numOfSeats);
		Factory factory = new Factory(numOfSeats);
		String[] partyNames = {"BQ","CPC","Green","Liberal","NDP","PPC","Rhinoceros"};
		factory.setPartyNames(partyNames);
		polls.addPoll(factory.createRandomPoll("Poll1"));
		polls.addPoll(factory.createRandomPoll("Poll2"));
		polls.addPoll(factory.createRandomPoll("Poll3"));
//		polls.addPoll(factory.createRandomPoll("Poll4"));
		
		TextApplication app = new TextApplication(polls);
		app.displayPollsBySeat(factory.getPartyNames());
	}

}
