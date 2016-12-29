package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable {

	@Override
	public void attack() {
		// TODO Auto-generated method stub

	}
	String nickName;
	PokemonType type;
	int cp;
	public Pokemon(String nickName, PokemonType type, int cp) {
		super();
		this.nickName = nickName;
		this.type = type;
		this.cp = cp;
	}
	public PokemonType gettype(){
		return this.type;
	}
	public String getnickName(){
		return this.nickName;
	}
	public void setnickName(String nickName){
		this.nickName = nickName;
	}
	public void setcp(int cp){
		this.cp = cp;
	}

}
