package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.settings.AnchorPinCardConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.RxX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71235RxX extends AbstractC65781Prl implements InterfaceC65784Pro<AnchorPinCardConfig> {
    public static final C71235RxX LJLIL = new C71235RxX();

    public C71235RxX() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final AnchorPinCardConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        AnchorPinCardConfig anchorPinCardConfig = C71234RxW.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "anchor_show_pin_product_card", 31744, AnchorPinCardConfig.class, anchorPinCardConfig);
        if (LJIJ == 0) {
            C71234RxW.LIZ.getClass();
        } else {
            anchorPinCardConfig = LJIJ;
        }
        o.LJIIIIZZ(anchorPinCardConfig, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return anchorPinCardConfig;
    }
}
