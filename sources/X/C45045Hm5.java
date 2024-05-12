package X;

import com.ss.android.ugc.aweme.property.bytebench.FrontFlashByteBenchStrategy;

/* renamed from: X.Hm5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45045Hm5 implements InterfaceC45046Hm6 {
    public static final /* synthetic */ C45045Hm5 LJIILJJIL = new C45045Hm5();
    public static final FrontFlashByteBenchStrategy LJIILL;

    static {
        FrontFlashByteBenchStrategy frontFlashByteBenchStrategy;
        InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(EF7.LJIIIZ);
        if (LIZIZ != null) {
            frontFlashByteBenchStrategy = (FrontFlashByteBenchStrategy) LIZIZ.LJIILJJIL(FrontFlashByteBenchStrategy.class);
        } else {
            frontFlashByteBenchStrategy = null;
        }
        LJIILL = frontFlashByteBenchStrategy;
    }

    public final int frontFlashStyle() {
        FrontFlashByteBenchStrategy frontFlashByteBenchStrategy = LJIILL;
        if (frontFlashByteBenchStrategy != null) {
            return frontFlashByteBenchStrategy.frontFlashStyle();
        }
        return 0;
    }
}
