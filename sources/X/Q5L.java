package X;

import android.content.Intent;
import com.facebook.Profile;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q5L {
    public static final Q5S LIZLLL = new Q5S();
    public static volatile Q5L LJ;
    public final C10760bY LIZ;
    public final C66422Q5a LIZIZ;
    public Profile LIZJ;

    public Q5L(C10760bY c10760bY, C66422Q5a c66422Q5a) {
        this.LIZ = c10760bY;
        this.LIZIZ = c66422Q5a;
    }

    public final void LIZ(Profile profile, boolean z) {
        Profile profile2 = this.LIZJ;
        this.LIZJ = profile;
        if (z) {
            if (profile != null) {
                C66422Q5a c66422Q5a = this.LIZIZ;
                c66422Q5a.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", profile.id);
                    jSONObject.put("first_name", profile.firstName);
                    jSONObject.put("middle_name", profile.middleName);
                    jSONObject.put("last_name", profile.lastName);
                    jSONObject.put("name", profile.name);
                    android.net.Uri uri = profile.linkUri;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    android.net.Uri uri2 = profile.pictureUri;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                    c66422Q5a.LIZ.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                this.LIZIZ.LIZ.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (profile2 == null) {
            if (profile == null) {
                return;
            }
        } else if (o.LJ(profile2, profile)) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
        this.LIZ.LIZJ(intent);
    }
}
