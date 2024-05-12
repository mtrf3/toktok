package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.XeA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85322XeA {
    public static PoiSearchApi.PoiSearchRecallResult LIZ(String str) {
        if ((str == null || str.length() == 0) && (1 != 0 || str == null)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean optBoolean = jSONObject.optBoolean("cache_for_search", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("poi_group");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    double optDouble = optJSONObject.optDouble("center_latitude");
                    double optDouble2 = optJSONObject.optDouble("center_longitude");
                    C85322XeA c85322XeA = PoiSearchApi.PoiSearchRecallResult.Companion;
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("poi");
                    c85322XeA.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    if (optJSONArray2 != null) {
                        int length2 = optJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                            if (optJSONObject2 != null) {
                                arrayList2.add(new PoiData(optJSONObject2.optString("id"), optJSONObject2.optString("name"), optJSONObject2.optDouble("latitude"), optJSONObject2.optDouble("longitude"), optJSONObject2.optString("location"), optJSONObject2.optString("address"), optJSONObject2.optString("district"), optJSONObject2.optString("city"), optJSONObject2.optString("province"), optJSONObject2.optString("country"), optJSONObject2.optString("formatted_address"), optJSONObject2.optString("tel"), optJSONObject2.optString("distance"), optJSONObject2.optString("service_id"), optJSONObject2.optString("details"), null, null, Integer.valueOf(optJSONObject2.optInt("is_rtl", 0)), optJSONObject2.optString("hight_positions"), optJSONObject2.optString("display_category"), 98304, null));
                            }
                        }
                    }
                    arrayList.add(new PoiSearchApi.PoiGroup(optDouble, optDouble2, arrayList2));
                }
            }
        }
        return new PoiSearchApi.PoiSearchRecallResult(Integer.valueOf(jSONObject.optInt("status_code")), jSONObject.optString("status_msg"), jSONObject.optString("logid"), arrayList, Boolean.valueOf(optBoolean));
    }
}
