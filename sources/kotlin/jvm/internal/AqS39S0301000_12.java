package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C188727au;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.S0Q;
import X.S1E;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;

/* loaded from: classes13.dex */
public class AqS39S0301000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS39S0301000_12 aqS39S0301000_12) {
        ((S0Q) ((S1E) aqS39S0301000_12.l0)).LJJJJJ((ShopWindowAnchorModel) aqS39S0301000_12.l1, (C188727au) aqS39S0301000_12.l2, aqS39S0301000_12.i3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS39S0301000_12 aqS39S0301000_12) {
        ((S0Q) ((S1E) aqS39S0301000_12.l0)).LJJJJJ((ShopWindowAnchorModel) aqS39S0301000_12.l1, (C188727au) aqS39S0301000_12.l2, aqS39S0301000_12.i3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS39S0301000_12(S1E s1e, ShopWindowAnchorModel shopWindowAnchorModel, C188727au c188727au, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = s1e;
        this.l1 = shopWindowAnchorModel;
        this.l2 = c188727au;
        this.i3 = i;
    }
}
