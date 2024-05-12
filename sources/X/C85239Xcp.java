package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import org.json.JSONObject;

/* renamed from: X.Xcp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85239Xcp {
    public static PoiSearchApi.PoiSearchResultWrapper LIZ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("code");
            C85323XeB c85323XeB = PoiSearchApi.PoiSearchResult.Companion;
            String optString = jSONObject.optString("data");
            c85323XeB.getClass();
            return new PoiSearchApi.PoiSearchResultWrapper(optInt, C85323XeB.LIZ(optString), jSONObject.optString("hint_main_title"), jSONObject.optString("hint_subtitle"));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
