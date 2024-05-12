package defpackage;

import X.FFL;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class r0 {
    public static final r0 LIZ = new r0();
    public static final HybridABApiRetrySetting LIZIZ = new HybridABApiRetrySetting(true, 3, 1500, 0, true, 3, true, false);

    public static HybridABApiRetrySetting LIZ() {
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            HybridABApiRetrySetting hybridABApiRetrySetting = LIZIZ;
            LJIIIZ.getClass();
            HybridABApiRetrySetting hybridABApiRetrySetting2 = (HybridABApiRetrySetting) FFL.LJIJ(true, "hybrid_ab_api_settings", 31744, HybridABApiRetrySetting.class, hybridABApiRetrySetting);
            if (hybridABApiRetrySetting2 != null) {
                hybridABApiRetrySetting = hybridABApiRetrySetting2;
            }
            o.LJIIIIZZ(hybridABApiRetrySetting, "{\n            ABManager.…ultRetrySetting\n        }");
            return hybridABApiRetrySetting;
        } catch (ClassCastException unused) {
            return LIZIZ;
        }
    }
}
