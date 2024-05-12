package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V19 {
    public static final boolean LIZ() {
        if (C00F.LIZ(31744, 0, "studio_direct_shoot_always_land_upload_tab", true) != 1 || !V1A.LIZ() || !LIZIZ()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ() {
        if (o.LJ(((RBX) HG3.LJIILL()).getCurUser().getPredictedAgeGroup(), "4") || o.LJ(((RBX) HG3.LJIILL()).getCurUser().getPredictedAgeGroup(), "5")) {
            return true;
        }
        return false;
    }
}
