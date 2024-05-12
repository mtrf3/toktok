package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1EW;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* loaded from: classes13.dex */
public class AqS19S0000100_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S0000100_12(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AqS19S0000100_12 aqS19S0000100_12, Object obj) {
        PdpMainState setState = (PdpMainState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return PdpMainState.copy$default(setState, false, null, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, Long.valueOf(aqS19S0000100_12.j0), null, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, -8193, null);
    }

    public static final Object invoke$1(AqS19S0000100_12 aqS19S0000100_12, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("start_click_to_now", Long.valueOf(aqS19S0000100_12.j0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS19S0000100_12 aqS19S0000100_12, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("start_click_to_now", Long.valueOf(aqS19S0000100_12.j0));
        logView.plusAssign("is_v2", 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS19S0000100_12 aqS19S0000100_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        C1EW.LIZIZ(System.currentTimeMillis(), aqS19S0000100_12.j0, logNode, "duration");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS19S0000100_12 aqS19S0000100_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        C1EW.LIZIZ(System.currentTimeMillis(), aqS19S0000100_12.j0, logNode, "duration");
        return C76800UCe.LIZ;
    }
}
