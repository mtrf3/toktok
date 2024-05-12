package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.FII;
import X.InterfaceC88472Yns;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* loaded from: classes13.dex */
public class AqS0S1011000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public String s0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S1011000_12 aqS0S1011000_12, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        String str = aqS0S1011000_12.s0;
        if (str == null) {
            str = "";
        }
        logView.plusAssign("size_id", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(aqS0S1011000_12.i2 + 1);
        logView.plusAssign("rank", X1D.LIZIZ(LIZ));
        logView.plusAssign("module_name", "size_selection");
        logView.plusAssign("sale_prop_status", Integer.valueOf(aqS0S1011000_12.z1 ? 1 : 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S1011000_12 aqS0S1011000_12, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        String str = aqS0S1011000_12.s0;
        if (str == null) {
            str = "";
        }
        logView.plusAssign("size_id", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(aqS0S1011000_12.i2 + 1);
        logView.plusAssign("rank", X1D.LIZIZ(LIZ));
        logView.plusAssign("module_name", "size_selection");
        logView.plusAssign("sale_prop_status", Integer.valueOf(aqS0S1011000_12.z1 ? 1 : 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS0S1011000_12 aqS0S1011000_12, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("button_name", aqS0S1011000_12.s0);
        if (aqS0S1011000_12.z1) {
            str = "select";
        } else {
            str = "cancel";
        }
        logNode.plusAssign("select_type", str);
        FII.LIZIZ(aqS0S1011000_12.i2, 1, logNode, "item_order");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS0S1011000_12 aqS0S1011000_12, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        String str = aqS0S1011000_12.s0;
        if (str == null) {
            str = "";
        }
        logView.plusAssign("size_id", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(aqS0S1011000_12.i2 + 1);
        logView.plusAssign("rank", X1D.LIZIZ(LIZ));
        logView.plusAssign("module_name", "size_selection");
        logView.plusAssign("sale_prop_status", Integer.valueOf(aqS0S1011000_12.z1 ? 1 : 0));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S1011000_12(String str, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i2 = i;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S1011000_12(String str, boolean z, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.z1 = z;
        this.i2 = i;
    }
}
