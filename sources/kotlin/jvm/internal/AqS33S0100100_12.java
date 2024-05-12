package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C70414RkI;
import X.C70763Rpv;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.PdpV2Fragment;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes13.dex */
public class AqS33S0100100_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public Object l0;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS33S0100100_12 aqS33S0100100_12, Object obj) {
        PdpMainState setState = (PdpMainState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return PdpMainState.copy$default(setState, false, null, null, false, 0, null, (List) aqS33S0100100_12.l0, 0.0f, 0, null, 0, false, 2, Long.valueOf(aqS33S0100100_12.j1), null, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, -12353, null);
    }

    public static final Object invoke$1(AqS33S0100100_12 aqS33S0100100_12, Object obj) {
        PdpMainState setState = (PdpMainState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return PdpMainState.copy$default(setState, false, null, null, false, 0, null, (List) aqS33S0100100_12.l0, 0.0f, 0, null, 0, false, 3, Long.valueOf(aqS33S0100100_12.j1), null, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, -12353, null);
    }

    public static final Object invoke$2(AqS33S0100100_12 aqS33S0100100_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("page_name", "3rd_party_h5");
        ((PdpV2Fragment) aqS33S0100100_12.l0).getClass();
        logNode.plusAssign("previous_page", "product_detail");
        logNode.plusAssign("quit_type", "return");
        logNode.plusAssign("stay_time", Long.valueOf(aqS33S0100100_12.j1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS33S0100100_12 aqS33S0100100_12, Object obj) {
        String str;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        Aweme aweme = ((C70763Rpv) aqS33S0100100_12.l0).LIZ;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        logView.plusAssign("video_id", str);
        logView.plusAssign("duration", Long.valueOf(aqS33S0100100_12.j1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS33S0100100_12 aqS33S0100100_12, Object obj) {
        String str;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        Aweme aweme = ((C70763Rpv) aqS33S0100100_12.l0).LIZ;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        logView.plusAssign("video_id", str);
        logView.plusAssign("duration", Long.valueOf(aqS33S0100100_12.j1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS33S0100100_12 aqS33S0100100_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS33S0100100_12.l0).LIZIZ);
        logNode.plusAssign("duration", Long.valueOf(aqS33S0100100_12.j1));
        logNode.plusAssign("action_sheet_for", "sku");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS33S0100100_12 aqS33S0100100_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS33S0100100_12.l0).LIZIZ);
        logNode.plusAssign("duration", Long.valueOf(aqS33S0100100_12.j1));
        logNode.plusAssign("action_sheet_for", "sku");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS33S0100100_12(long j, PdpV2Fragment pdpV2Fragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = pdpV2Fragment;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS33S0100100_12(C70414RkI c70414RkI, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c70414RkI;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS33S0100100_12(C70763Rpv c70763Rpv, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c70763Rpv;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0000: IPUT (r6 I:int), (r2 I:kotlin.jvm.internal.AqS33S0100100_12) (LINE:50528256) kotlin.jvm.internal.AqS33S0100100_12.$t int, block:B:1:0x0000 */
    public AqS33S0100100_12(List list, List<? extends Object> list2, long j) {
        super(1);
        int i;
        this.$t = i;
        this.l0 = list;
        this.j1 = list2;
    }
}
