package X;

import com.ss.android.ugc.aweme.search.ecommerce.ab.LynxMiddleViewPreloadConfig;

/* renamed from: X.9CE, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9CE {
    public static final LynxMiddleViewPreloadConfig LIZ = new LynxMiddleViewPreloadConfig(0, 4500L);

    public static LynxMiddleViewPreloadConfig LIZ() {
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            LynxMiddleViewPreloadConfig lynxMiddleViewPreloadConfig = LIZ;
            LJIIIZ.getClass();
            LynxMiddleViewPreloadConfig lynxMiddleViewPreloadConfig2 = (LynxMiddleViewPreloadConfig) FFL.LJIJ(true, "ec_middle_mall_preload", 31744, LynxMiddleViewPreloadConfig.class, lynxMiddleViewPreloadConfig);
            if (lynxMiddleViewPreloadConfig2 == null) {
                return new LynxMiddleViewPreloadConfig(0, 4500L);
            }
            return lynxMiddleViewPreloadConfig2;
        } catch (Exception unused) {
            return new LynxMiddleViewPreloadConfig(0, 4500L);
        }
    }
}
