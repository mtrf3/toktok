package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.9Mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235539Mf {
    public static final Keva LIZ;

    public static boolean LIZ() {
        Keva keva = LIZ;
        if (keva != null) {
            return keva.getBoolean("profile_v2_show_bio_hint", true);
        }
        return false;
    }

    static {
        try {
            LIZ = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "ProfileV2Preferences", 0);
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SharedPreferencesAnnotatedManager getSP failed ");
            LIZ2.append(th.getMessage());
            C36922EeM.LJ(X1D.LIZIZ(LIZ2));
        }
    }
}
