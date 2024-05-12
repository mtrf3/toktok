package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C69947Rcl;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;

/* loaded from: classes13.dex */
public class AqS3S0000001_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public float f0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0000001_12(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AqS3S0000001_12 aqS3S0000001_12, Object obj) {
        PdpMainState setState = (PdpMainState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return PdpMainState.copy$default(setState, false, null, null, false, 0, null, null, aqS3S0000001_12.f0, 0, null, 0, false, null, null, null, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, -129, null);
    }

    public static final Object invoke$1(AqS3S0000001_12 aqS3S0000001_12, Object obj) {
        C69947Rcl setState = (C69947Rcl) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C69947Rcl.L(setState, false, 0, 0, false, aqS3S0000001_12.f0, false, 95);
    }
}
