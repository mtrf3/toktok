package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NGX {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(NGY ngy, C59071NGh c59071NGh) {
        C59070NGg c59070NGg = new C59070NGg();
        c59070NGg.LJIIIIZZ(c59071NGh);
        String[] strArr = {"gecko_channel", WM7.SCENE_SERVICE, "reason"};
        if (ngy != null) {
            C58655N0h LJ = C58704N2e.LJ("hybrid_ad", "gecko_preload_status", String.valueOf(ngy.LIZ), ngy.LIZIZ, ngy.LIZJ);
            LJ.LIZ(c59070NGg.LJFF((String[]) Arrays.copyOf(strArr, 3)));
            Object LIZLLL = c59070NGg.LIZLLL("success");
            o.LJII(LIZLLL, "null cannot be cast to non-null type kotlin.Int");
            LJ.LIZIZ(LIZLLL, "success");
            Object LIZLLL2 = c59070NGg.LIZLLL("stage");
            o.LJII(LIZLLL2, "null cannot be cast to non-null type kotlin.Int");
            LJ.LIZIZ(LIZLLL2, "stage");
            Object LIZLLL3 = c59070NGg.LIZLLL("preload_duration");
            o.LJII(LIZLLL3, "null cannot be cast to non-null type kotlin.Long");
            LJ.LIZIZ(LIZLLL3, "preload_duration");
            Object LIZLLL4 = c59070NGg.LIZLLL("package_id");
            o.LJII(LIZLLL4, "null cannot be cast to non-null type kotlin.Long");
            LJ.LIZIZ(LIZLLL4, "package_id");
            Object LIZLLL5 = c59070NGg.LIZLLL("download_size");
            o.LJII(LIZLLL5, "null cannot be cast to non-null type kotlin.Long");
            LJ.LIZIZ(LIZLLL5, "download_size");
            LJ.LJI();
        }
        C58582Rq.LIZ("geckoPreloadStatus", "AdHybridEventManager");
    }
}
