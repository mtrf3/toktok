package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27766Av4;
import X.C69698RXa;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryState;

/* loaded from: classes13.dex */
public class AqS1S0011000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public boolean z0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S0011000_12 aqS1S0011000_12, Object obj) {
        PdpMainState setState = (PdpMainState) obj;
        o.LJIIIZ(setState, "$this$setState");
        int i = setState.getFocusTabAction().LIZ;
        int i2 = aqS1S0011000_12.i1;
        if (i != i2) {
            return PdpMainState.copy$default(setState, false, null, null, false, 0, null, null, 0.0f, 0, new C27766Av4(i2, aqS1S0011000_12.z0), 0, false, null, null, null, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, -513, null);
        }
        return setState;
    }

    public static final Object invoke$1(AqS1S0011000_12 aqS1S0011000_12, Object obj) {
        C69698RXa c69698RXa;
        ReviewGalleryState setState = (ReviewGalleryState) obj;
        o.LJIIIZ(setState, "$this$setState");
        C69698RXa curReviewItem = setState.getCurReviewItem();
        if (curReviewItem != null) {
            c69698RXa = C69698RXa.LIZ(curReviewItem, Integer.valueOf(aqS1S0011000_12.i1), Boolean.valueOf(aqS1S0011000_12.z0));
        } else {
            c69698RXa = null;
        }
        return ReviewGalleryState.copy$default(setState, null, null, null, null, null, null, 0, null, false, 0, 0, 0, null, null, false, c69698RXa, null, 98303, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0011000_12(int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.z0 = z;
    }
}
