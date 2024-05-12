package X;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.twitter.sdk.android.core.TwitterSession;

/* renamed from: X.PjO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65262PjO implements InterfaceC65274Pja<TwitterSession> {
    public final Gson LIZ = new Gson();

    @Override // X.InterfaceC65274Pja
    public final String LIZ(TwitterSession twitterSession) {
        TwitterSession twitterSession2 = twitterSession;
        if (twitterSession2 != null && twitterSession2.authToken != 0) {
            try {
                return this.LIZ.LJIILL(twitterSession2);
            } catch (Exception e) {
                C44432HcC LIZIZ = C65265PjR.LIZIZ();
                e.getMessage();
                LIZIZ.getClass();
            }
        }
        return "";
    }

    @Override // X.InterfaceC65274Pja
    public final TwitterSession LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return (TwitterSession) this.LIZ.LJI(str, TwitterSession.class);
            } catch (Exception e) {
                C44432HcC LIZIZ = C65265PjR.LIZIZ();
                e.getMessage();
                LIZIZ.getClass();
            }
        }
        return null;
    }
}
