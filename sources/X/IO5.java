package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchDoFrameBalanceConfig;

/* loaded from: classes9.dex */
public final class IO5 {
    public static final SearchDoFrameBalanceConfig LIZ = new SearchDoFrameBalanceConfig(0, null, 3, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(IO6.LJLIL);

    public static SearchDoFrameBalanceConfig LIZ() {
        return (SearchDoFrameBalanceConfig) LIZIZ.getValue();
    }

    public static final void LIZIZ() {
        if (LIZ().maxThreshold > 0) {
            C232469Ak.LIZ.LJ(LIZ().scene, new C94I(LIZ().maxThreshold));
        }
    }

    public static final void LIZJ() {
        if (LIZ().maxThreshold > 0) {
            C232469Ak.LJFF(LIZ().scene);
        }
    }
}
