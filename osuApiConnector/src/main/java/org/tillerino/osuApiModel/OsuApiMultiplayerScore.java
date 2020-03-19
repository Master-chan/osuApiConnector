package org.tillerino.osuApiModel;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Represents a score that player got on a map in multiplayer lobby
 * @author Master-chan
 *
 */
@Data
public class OsuApiMultiplayerScore
{
	/**
	 * Slot in the lobby, starts from 0
	 */
	private int slot;
	
	/**
	 * Player team. If head-to-head its always 0, if team mode is enabled 1 is blue and 2 is red
	 */
	private int team;
	
	@SerializedName("user_id")
	private int playerOsuId;
	
	private long score;
	
	@SerializedName("maxcombo")
	private int maxCombo;
	
	/**
	 * Should probably correspond to letter ranks but always shows 0
	 */
	private int rank;
	
	private int count300;
	private int count100;
	private int count50;
	
	@SerializedName("countmiss")
	private int countMiss;
	
	@SerializedName("countkatu")
	private int countKatu;
	
	@SerializedName("countgeki")
	private int countGeki;
	
	private int perfect;
	
	@SerializedName("pass")
	private int passed;
	
	/**
	 * Mods enabled for this specific player on See {@link Mods}
	 */
	@SerializedName("enabled_mods")
	private long enabledMods;
	
}
