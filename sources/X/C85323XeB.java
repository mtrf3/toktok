package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.XeB, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85323XeB {
    public static PoiSearchApi.PoiSearchResult LIZ(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        JSONArray optJSONArray = jSONObject.optJSONArray("poi");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new PoiData(optJSONObject.optString("id"), optJSONObject.optString("name"), optJSONObject.optDouble("latitude"), optJSONObject.optDouble("longitude"), optJSONObject.optString("location"), optJSONObject.optString("address"), optJSONObject.optString("district"), optJSONObject.optString("city"), optJSONObject.optString("province"), optJSONObject.optString("country"), optJSONObject.optString("formatted_address"), optJSONObject.optString("tel"), optJSONObject.optString("distance"), optJSONObject.optString("service_id"), optJSONObject.optString("details"), null, null, Integer.valueOf(optJSONObject.optInt("is_rtl", 0)), optJSONObject.optString("hight_positions"), optJSONObject.optString("display_category"), 98304, null));
                }
            }
        }
        return new PoiSearchApi.PoiSearchResult(jSONObject.optInt("total"), jSONObject.optInt("length"), jSONObject.optInt("page"), jSONObject.optInt("size"), jSONObject.optString("logid"), arrayList, Boolean.valueOf(jSONObject.optBoolean("cache_for_search")));
    }
}
