package X;

import com.bytedance.keva.Keva;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Kzu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53546Kzu {
    public static final Keva LIZ;

    static {
        Keva repo = Keva.getRepo("algo_refresh_cache");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static String LIZ() {
        boolean z;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null || curUserId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "algo_refresh_status";
        }
        return i0.LJFF("algo_refresh_status", curUserId);
    }
}
