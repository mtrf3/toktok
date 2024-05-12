package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.QvA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68540QvA {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZIZ(String str) {
        boolean z;
        Integer LIZ2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (LIZ2 = LIZ(str, "save_login")) == null) {
            return -1;
        }
        return LIZ2.intValue();
    }

    public static Keva LIZJ(String secUid) {
        o.LJIIIZ(secUid, "secUid");
        String str = "aweme_user_config_" + C68541QvB.LIZ.replace(s.LJZI(secUid).toString(), "");
        o.LJIIIIZZ(str, "StringBuilder()\n        …)\n            .toString()");
        Keva repo = Keva.getRepo(str);
        o.LJIIIIZZ(repo, "getRepo(repoName)");
        return repo;
    }

    public static Integer LIZ(String str, String str2) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        return Integer.valueOf(LIZJ(str).getInt(str2, -1));
    }

    public static final void LIZLLL(String str, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        LIZJ(str).storeInt("save_login", i);
    }
}
