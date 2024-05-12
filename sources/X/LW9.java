package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class LW9 {
    public static int LIZ() {
        if (C35971E9v.LIZ() && o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE)) {
            return 1;
        }
        return 0;
    }

    public static void LIZIZ() {
        if (!C53295Kvr.LIZ() || C00F.LIZ(31744, 1, "tt_friends_following_merge_enable_preload", true) == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - C56662Kg.LIZ().LJIIJJI;
            C84340X8e c84340X8e = C84339X8d.LIZJ;
            LWA lwa = new LWA(elapsedRealtime, j);
            c84340X8e.getClass();
            C84340X8e.LIZIZ(lwa);
        }
    }

    public static void LIZJ(String str) {
        if (!((Boolean) LWC.LIZIZ.getValue()).booleanValue()) {
            PowerPreloadServiceImpl.LIZIZ().LIZ("/aweme/v2/follow/feed/", null);
        }
    }
}
