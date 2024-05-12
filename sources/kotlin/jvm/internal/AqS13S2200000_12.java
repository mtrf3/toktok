package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C1DF;
import X.C26867AgZ;
import X.C27943Axv;
import X.C70414RkI;
import X.C76800UCe;
import X.C78948Uye;
import X.C79234V7u;
import X.InterfaceC71003Rtn;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.SA3;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* loaded from: classes13.dex */
public class AqS13S2200000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS13S2200000_12 aqS13S2200000_12, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        SA3 sa3 = (SA3) aqS13S2200000_12.l2;
        String str2 = aqS13S2200000_12.s0;
        String str3 = aqS13S2200000_12.s1;
        Context context = (Context) aqS13S2200000_12.l3;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        PaymentResultProcess.payResultProcess$handleFailed(sa3, str2, str3, context, null, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS13S2200000_12 aqS13S2200000_12, Object it) {
        String str;
        ProductBase productBase;
        String str2;
        o.LJIIIZ(it, "it");
        Context context = ((View) aqS13S2200000_12.l2).getContext();
        o.LJIIIIZZ(context, "view.context");
        String str3 = aqS13S2200000_12.s0;
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ("enter_from", "pdp_search_data");
        oszArr[1] = new OSZ("enter_method", aqS13S2200000_12.s1);
        oszArr[2] = new OSZ("source_enter_from", "pdp_search_data");
        oszArr[3] = new OSZ("source_enter_method", aqS13S2200000_12.s1);
        ProductPackStruct productPackStruct = ((PdpViewModel) aqS13S2200000_12.l3).LJLJLLL;
        String str4 = "";
        if (productPackStruct == null || (str = productPackStruct.productId) == null) {
            str = "";
        }
        oszArr[4] = new OSZ("product_id", str);
        ProductPackStruct productPackStruct2 = ((PdpViewModel) aqS13S2200000_12.l3).LJLJLLL;
        if (productPackStruct2 != null && (productBase = productPackStruct2.baseInfo) != null && (str2 = productBase.title) != null) {
            str4 = str2;
        }
        oszArr[5] = new OSZ("search_keywords", str4);
        SmartRoute LIZIZ = C26867AgZ.LIZIZ(context, str3, C113554cx.LJJJLZIJ(oszArr), false);
        InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL((View) aqS13S2200000_12.l2);
        if (LJIILIIL != null) {
            C79234V7u.LJJIJIIJIL(LIZIZ, LJIILIIL, null);
        }
        LIZIZ.open();
        C70414RkI c70414RkI = ((PdpViewModel) aqS13S2200000_12.l3).LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJII(true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS13S2200000_12 aqS13S2200000_12, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS13S2200000_12.l2).LIZIZ);
        logNode.plusAssign("button_for", aqS13S2200000_12.s0);
        Boolean bool = (Boolean) aqS13S2200000_12.l3;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str = "yes";
            } else {
                str = "no";
            }
            logNode.put("is_add_new_shipping", str);
        }
        String str2 = aqS13S2200000_12.s1;
        if (str2 != null) {
            logNode.put("sub_page_name", str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS13S2200000_12 aqS13S2200000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, ((C70414RkI) aqS13S2200000_12.l2).LIZIZ);
        Object obj2 = aqS13S2200000_12.l3;
        if (obj2 != null) {
            sendLog.LIZJ("user_type", obj2);
        }
        String str = aqS13S2200000_12.s0;
        if (str != null) {
            sendLog.LIZJ("trigger_type", str);
        }
        String str2 = aqS13S2200000_12.s1;
        if (str2 != null) {
            sendLog.LIZJ("sale_price", str2);
        }
        C1DF.LIZJ(((C70414RkI) aqS13S2200000_12.l2).LIZIZ, false, sendLog, false, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2200000_12(C70414RkI c70414RkI, Object obj, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c70414RkI;
        this.l3 = obj;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2200000_12(C70414RkI c70414RkI, String str, Boolean bool, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c70414RkI;
        this.s0 = str;
        this.l3 = bool;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2200000_12(SA3 sa3, String str, String str2, Context context, int i) {
        super(1);
        this.$t = i;
        this.l2 = sa3;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2200000_12(View view, String str, String str2, PdpViewModel pdpViewModel, int i) {
        super(1);
        this.$t = i;
        this.l2 = view;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = pdpViewModel;
    }
}
