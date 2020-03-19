package org.tillerino.osuApiModel;

import java.util.List;

import org.tillerino.osuApiModel.deserializer.Date;
import org.tillerino.osuApiModel.types.MillisSinceEpoch;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Represents one game played inside the room
 * @author Master-chan
 *
 */
@Data
public class OsuApiMultiplayerGame
{
	
	@SerializedName("game_id")
	private long gameId;
	
	@Date
	@MillisSinceEpoch
	@SerializedName("start_time")
	private long startTime;
	
	@Date
	@MillisSinceEpoch
	@SerializedName("end_time")
	private long endTime;
	
	@SerializedName("beatmap_id")
	private int beatmapId;
	
	/**
	 * This should probably represent what game mod was played (see: {@link GameModes} but it seems to be bugged: shows 0 everytime;
	 */
	@SerializedName("play_mode")
	private int playMode;
	
	/**
	 * I have 0 idea what it is, seems to always be 0
	 */
	@SerializedName("match_type")
	private int matchType;
	
	public static final int WIN_CONDITION_SCOREV1 = 0;
	public static final int WIN_CONDITION_ACCURACY = 1;
	public static final int WIN_CONDITION_COMBO = 2;
	public static final int WIN_CONDITION_SCOREV2 = 3;
	
	/**
	 * Win condition for the game: ScoreV1 = 0, Accuracy = 1, Combo = 2, ScoreV2 = 3
	 */
	@SerializedName("scoring_type")
	private int winCondition;
	
	public static final int TEAMS_HEADTOHEAD = 0;
	public static final int TEAMS_TAG_COOP = 1;
	public static final int TEAMS_TEAM_VS = 2;
	public static final int TEAMS_TAG_TEAM_VS = 3;
	
	/**
	 * How teams are composed: Head-to-head = 0, Tag Co-op = 1, Team VS = 2, Tag Team VS = 3
	 */
	@SerializedName("team_type")
	private int teamSettings;
	
	/**
	 * List of mods that were globally forced for the map, see: {@link Mods}
	 */
	@SerializedName("mods")
	private long forcedMods;
	
	/**
	 * Array of score object for each player. Not guaranteed to be sorted by slot.
	 */
	private List<OsuApiMultiplayerScore> scores;
	
}
