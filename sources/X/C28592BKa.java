package X;

import com.bytedance.android.livesdk.livesetting.model.GeckoLiveGroupOpt;
import com.bytedance.android.livesdkapi.host.IHostResource;

/* renamed from: X.BKa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28592BKa {
    public static boolean LIZ;
    public static int LIZIZ = -1;
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C28598BKg.LJLIL);

    public static GeckoLiveGroupOpt LIZIZ() {
        return (GeckoLiveGroupOpt) LIZJ.getValue();
    }

    public static int LIZ() {
        GeckoLiveGroupOpt LIZIZ2 = LIZIZ();
        int i = 0;
        if (LIZIZ2 == null || !LIZIZ2.isEnable) {
            LIZIZ = 0;
        } else if (LIZIZ < 0) {
            GeckoLiveGroupOpt LIZIZ3 = LIZIZ();
            if (LIZIZ3 != null) {
                i = LIZIZ3.strategy;
            }
            LIZIZ = i;
        }
        return LIZIZ;
    }

    public static void LIZJ(int i) {
        if (LIZ() <= 0 || i != LIZ()) {
            return;
        }
        if (!LIZ) {
            LIZ = true;
            ((IHostResource) CN1.LIZ(IHostResource.class)).mo0();
        } else {
            if (LIZ() <= 0 || !LIZ) {
                return;
            }
            ((IHostResource) CN1.LIZ(IHostResource.class)).l60();
        }
    }
}
