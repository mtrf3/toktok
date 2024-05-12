package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.EcReviewGlobalV2Model;

/* renamed from: X.RiL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70293RiL {
    public static final EcReviewGlobalV2Model LIZ;
    public static final boolean LIZIZ;

    static {
        new C70293RiL();
        boolean z = false;
        LIZ = new EcReviewGlobalV2Model(0, 1, null);
        if (((EcReviewGlobalV2Model) C221108m2.LIZIZ(C70294RiM.LJLIL).getValue()).enable == 1) {
            z = true;
        }
        LIZIZ = z;
    }

    public static final String LIZ() {
        if (LIZIZ) {
            return "us";
        }
        C53571L0t.LIZ.getClass();
        if (C53571L0t.LIZ()) {
            return "global";
        }
        return "sea";
    }
}
