import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Team>teams;
	private String name;
	
	public Player (String n){
		teams = new ArrayList<Team>();
		name = n;
	}
	
	public List<Team> getTeams(){
		return teams;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return name;
	}
}
