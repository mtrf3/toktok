package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C70053ReT;
import X.C70216Rh6;
import X.C76800UCe;
import X.FII;
import X.InterfaceC88472Yns;
import X.ORY;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpSkcViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;

/* loaded from: classes13.dex */
public class AqS5S1102000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public int i3;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AqS5S1102000_12 aqS5S1102000_12, Object obj) {
        int i;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("button_name", "sku_select");
        logNode.plusAssign("select_type", aqS5S1102000_12.s0);
        FII.LIZIZ(aqS5S1102000_12.i2, 1, logNode, "pdp_sku_attr_rank");
        FII.LIZIZ(aqS5S1102000_12.i3, 1, logNode, "pdp_sku_value_rank");
        C70216Rh6 c70216Rh6 = (C70216Rh6) aqS5S1102000_12.l1;
        if (c70216Rh6 != null && !c70216Rh6.LJ) {
            i = 1;
        } else {
            i = 0;
        }
        logNode.plusAssign("sale_prop_status", Integer.valueOf(i ^ 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS5S1102000_12 aqS5S1102000_12, Object obj) {
        int i;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("button_name", "sku_select");
        logNode.plusAssign("button_type", "select_attr");
        logNode.plusAssign("select_type", aqS5S1102000_12.s0);
        FII.LIZIZ(aqS5S1102000_12.i2, 1, logNode, "pdp_sku_attr_rank");
        FII.LIZIZ(aqS5S1102000_12.i3, 1, logNode, "pdp_sku_value_rank");
        C70216Rh6 c70216Rh6 = (C70216Rh6) aqS5S1102000_12.l1;
        if (c70216Rh6 != null && !c70216Rh6.LJ) {
            i = 1;
        } else {
            i = 0;
        }
        logNode.plusAssign("sale_prop_status", Integer.valueOf(i ^ 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS5S1102000_12 aqS5S1102000_12, Object obj) {
        int i;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("button_name", "sku_select");
        logNode.plusAssign("button_type", "select_attr");
        logNode.plusAssign("select_type", aqS5S1102000_12.s0);
        FII.LIZIZ(aqS5S1102000_12.i2, 1, logNode, "pdp_sku_attr_rank");
        FII.LIZIZ(aqS5S1102000_12.i3, 1, logNode, "pdp_sku_value_rank");
        C70216Rh6 c70216Rh6 = (C70216Rh6) aqS5S1102000_12.l1;
        if (c70216Rh6 != null && !c70216Rh6.LJ) {
            i = 1;
        } else {
            i = 0;
        }
        logNode.plusAssign("sale_prop_status", Integer.valueOf(i ^ 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS5S1102000_12 aqS5S1102000_12, Object obj) {
        String[] strArr;
        int i;
        MiniPdpSkcViewModel.SkcState it = (MiniPdpSkcViewModel.SkcState) obj;
        o.LJIIIZ(it, "it");
        List<String> list = it.getVo().LJFF;
        if (list != null) {
            strArr = (String[]) list.toArray(new String[0]);
        } else {
            strArr = null;
        }
        List<SaleProp> list2 = it.getVo().LIZ;
        if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        String[] LJ = C70053ReT.LJ(i, strArr);
        int length = LJ.length;
        int i2 = aqS5S1102000_12.i2;
        if (length > i2) {
            if (o.LJ(LJ[i2], aqS5S1102000_12.s0)) {
                LJ[aqS5S1102000_12.i2] = "";
            } else {
                LJ[aqS5S1102000_12.i2] = aqS5S1102000_12.s0;
            }
        } else {
            int i3 = aqS5S1102000_12.i3;
            Object[] objArr = new String[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                objArr[i4] = "";
            }
            for (int i5 = 0; i5 < i3; i5++) {
                Object LJJJJI = ORY.LJJJJI(i5, LJ);
                if (LJJJJI == null) {
                    LJJJJI = "";
                }
                objArr[i5] = LJJJJI;
            }
            if (o.LJ(objArr[aqS5S1102000_12.i2], aqS5S1102000_12.s0)) {
            }
        }
        MiniPdpSkcViewModel miniPdpSkcViewModel = (MiniPdpSkcViewModel) aqS5S1102000_12.l1;
        List LJJZZIII = ORY.LJJZZIII(LJ);
        miniPdpSkcViewModel.getClass();
        if (LJJZZIII != null) {
            miniPdpSkcViewModel.setState(new AqS143S0200000_12(miniPdpSkcViewModel, (MiniPdpSkcViewModel) LJJZZIII, (List<String>) 68));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS5S1102000_12 aqS5S1102000_12, Object obj) {
        int i;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("button_name", "sku_select");
        logView.plusAssign("select_type", aqS5S1102000_12.s0);
        FII.LIZIZ(aqS5S1102000_12.i2, 1, logView, "pdp_sku_attr_rank");
        FII.LIZIZ(aqS5S1102000_12.i3, 1, logView, "pdp_sku_value_rank");
        C70216Rh6 c70216Rh6 = (C70216Rh6) aqS5S1102000_12.l1;
        if (c70216Rh6 != null && !c70216Rh6.LJ) {
            i = 1;
        } else {
            i = 0;
        }
        logView.plusAssign("sale_prop_status", Integer.valueOf(i ^ 1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S1102000_12(int i, String str, int i2, MiniPdpSkcViewModel miniPdpSkcViewModel, int i3) {
        super(1);
        this.$t = i3;
        this.i2 = i;
        this.s0 = str;
        this.i3 = i2;
        this.l1 = miniPdpSkcViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S1102000_12(String str, int i, int i2, C70216Rh6 c70216Rh6, int i3) {
        super(1);
        this.$t = i3;
        this.s0 = str;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = c70216Rh6;
    }
}
