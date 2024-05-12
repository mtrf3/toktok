package X;

import com.facebook.Profile;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q5K implements InterfaceC66375Q3f {
    @Override // X.InterfaceC66375Q3f
    public final void LIZJ(Q4W q4w) {
    }

    @Override // X.InterfaceC66375Q3f
    public final void LIZIZ(JSONObject jSONObject) {
        String optString;
        android.net.Uri uri;
        android.net.Uri uri2 = null;
        if (jSONObject == null || (optString = jSONObject.optString("id")) == null) {
            return;
        }
        String optString2 = jSONObject.optString("link");
        String optString3 = jSONObject.optString("profile_picture", null);
        String optString4 = jSONObject.optString("first_name");
        String optString5 = jSONObject.optString("middle_name");
        String optString6 = jSONObject.optString("last_name");
        String optString7 = jSONObject.optString("name");
        if (optString2 != null) {
            uri = android.net.Uri.parse(optString2);
        } else {
            uri = null;
        }
        if (optString3 != null) {
            uri2 = android.net.Uri.parse(optString3);
        }
        Profile profile = new Profile(uri, uri2, optString, optString4, optString5, optString6, optString7);
        Profile.Companion.getClass();
        Q5L.LIZLLL.LIZ().LIZ(profile, true);
    }
}
