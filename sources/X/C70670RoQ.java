package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.ReviewConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.RoQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70670RoQ extends AbstractC65781Prl implements InterfaceC65784Pro<ReviewConfig> {
    public static final C70670RoQ LJLIL = new C70670RoQ();

    public C70670RoQ() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final ReviewConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        ReviewConfig reviewConfig = C70669RoP.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "ecommerce_review_config", 31744, ReviewConfig.class, reviewConfig);
        if (LJIJ == 0) {
            C70669RoP.LIZ.getClass();
        } else {
            reviewConfig = LJIJ;
        }
        o.LJIIIIZZ(reviewConfig, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return reviewConfig;
    }
}
