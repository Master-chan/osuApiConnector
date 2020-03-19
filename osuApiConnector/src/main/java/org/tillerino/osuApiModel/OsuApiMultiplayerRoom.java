package org.tillerino.osuApiModel;

import java.util.List;

import org.tillerino.osuApiModel.deserializer.CustomGson;
import org.tillerino.osuApiModel.deserializer.Optional;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Represents multiplayer room with all games played in it;
 * @author Master-chan
 */
@Data
public class OsuApiMultiplayerRoom
{
	
	@SerializedName("match")
	private OsuApiMultiplayerMatch matchData;
	
	/**
	 * Array of maps that were played in the room; sorted by date, can be null or empty;
	 */
	@Optional
	private List<OsuApiMultiplayerGame> games;
	
	
	public static final Gson gson = CustomGson.wrap(true,
			OsuApiMultiplayerMatch.class,
			OsuApiMultiplayerGame.class);
    
    public static <T extends OsuApiMultiplayerRoom> T fromJsonObject(JsonObject o, Class<T> cls) {
    	return gson.fromJson(o, cls);
    }
	
}
