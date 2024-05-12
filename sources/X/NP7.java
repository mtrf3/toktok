package X;

import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NP7 {
    public final List<String> LIZ = new LinkedList();

    public final void LIZ(JSONObject jSONObject) {
        Object obj;
        if (jSONObject == null) {
            return;
        }
        jSONObject.optString("id", null);
        jSONObject.optString("source", null);
        jSONObject.optString("card_type", null);
        jSONObject.optString("pkg_name", null);
        jSONObject.optString("name", null);
        jSONObject.optString("download_url", null);
        jSONObject.optInt("is_ad", 0);
        jSONObject.optString("log_extra", null);
        jSONObject.optString("event_tag", "game_room_app_ad");
        jSONObject.optString("event_refer", null);
        jSONObject.optJSONObject("extra");
        jSONObject.optInt("support_multiple", 0);
        jSONObject.optString("group_id", null);
        jSONObject.optString("quick_app_url", "");
        jSONObject.optInt("download_mode", 0);
        jSONObject.optString("open_url", null);
        jSONObject.optString("source_avatar", null);
        jSONObject.optInt("auto_open", 0);
        jSONObject.optInt("is_landing_page_ad", 0);
        jSONObject.optInt("disable_download_dialog", 1);
        jSONObject.optInt("download_scene", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("click_track_url_list");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    obj = optJSONArray.get(i);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    obj = null;
                }
                if (obj instanceof String) {
                    ((LinkedList) this.LIZ).add(obj);
                }
            }
        }
    }
}
