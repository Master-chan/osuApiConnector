package org.tillerino.osuApiModel;

import org.tillerino.osuApiModel.deserializer.Date;
import org.tillerino.osuApiModel.types.MillisSinceEpoch;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Holds "match" object from multiplayer endpoint API
 * @author Master-chan
 *
 */
@Data
public class OsuApiMultiplayerMatch
{
	
	@SerializedName("match_id")
	private long matchId;
	
	@SerializedName("name")
	private String matchName;
	
	@Date
	@MillisSinceEpoch
	@SerializedName("start_time")
	private long startTime;
	
	/**
	 * Can be null if room isn't closed yet;
	 */
	@Date
	@MillisSinceEpoch
	@SerializedName("end_time")
	private long endTime;
}
