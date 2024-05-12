package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C27943Axv;
import X.C28112B1o;
import X.C70414RkI;
import X.C71677SBd;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class AqS19S2100000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS19S2100000_12 aqS19S2100000_12, Object obj) {
        Object obj2;
        Object obj3;
        HashMap logNode = (HashMap) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.put("coupon_zone", aqS19S2100000_12.s0);
        Map map = (Map) aqS19S2100000_12.l2;
        Object obj4 = null;
        if (map != null) {
            obj2 = map.get("coupon_id");
        } else {
            obj2 = null;
        }
        logNode.put("coupon_id", obj2);
        Map map2 = (Map) aqS19S2100000_12.l2;
        if (map2 != null) {
            obj3 = map2.get("coupon_type_id");
        } else {
            obj3 = null;
        }
        logNode.put("coupon_type_id", obj3);
        Map map3 = (Map) aqS19S2100000_12.l2;
        if (map3 != null) {
            obj4 = map3.get("coupon_type_info");
        }
        logNode.put("coupon_type_info", obj4);
        logNode.put("coupon_ignore_type", aqS19S2100000_12.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS19S2100000_12 aqS19S2100000_12, Object obj) {
        Object obj2;
        Object obj3;
        HashMap logNode = (HashMap) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.put("coupon_zone", aqS19S2100000_12.s0);
        Map map = (Map) aqS19S2100000_12.l2;
        Object obj4 = null;
        if (map != null) {
            obj2 = map.get("coupon_id");
        } else {
            obj2 = null;
        }
        logNode.put("coupon_id", obj2);
        Map map2 = (Map) aqS19S2100000_12.l2;
        if (map2 != null) {
            obj3 = map2.get("coupon_type_id");
        } else {
            obj3 = null;
        }
        logNode.put("coupon_type_id", obj3);
        Map map3 = (Map) aqS19S2100000_12.l2;
        if (map3 != null) {
            obj4 = map3.get("coupon_type_info");
        }
        logNode.put("coupon_type_info", obj4);
        logNode.put("click_area", aqS19S2100000_12.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS19S2100000_12 aqS19S2100000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, (Map) aqS19S2100000_12.l2);
        sendLog.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        sendLog.LIZJ("entry", aqS19S2100000_12.s0);
        sendLog.LIZJ("entry_name", aqS19S2100000_12.s1);
        sendLog.LIZJ("button_for", "orders");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS19S2100000_12 aqS19S2100000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, (Map) aqS19S2100000_12.l2);
        sendLog.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        sendLog.LIZJ("entry", aqS19S2100000_12.s0);
        sendLog.LIZJ("entry_name", aqS19S2100000_12.s1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static final Object invoke$4(AqS19S2100000_12 aqS19S2100000_12, Object obj) {
        ?? r5;
        C71677SBd it = (C71677SBd) obj;
        o.LJIIIZ(it, "it");
        Boolean bool = it.LJLLI;
        if (bool != null) {
            r5 = bool.booleanValue();
        } else {
            r5 = 0;
        }
        C28112B1o.LIZJ(aqS19S2100000_12.s0, C113554cx.LJJL(new OSZ("is_card_save", Integer.valueOf(it.LJLJJL ? 1 : 0)), new OSZ("payment_info_finish", aqS19S2100000_12.s1), new OSZ("is_use_shipping_address", Integer.valueOf((int) r5))), Boolean.valueOf(((CCDCAddCardViewModel) aqS19S2100000_12.l2).iv0().LJ), ((CCDCAddCardViewModel) aqS19S2100000_12.l2).iv0().LJFF.toString(), ((CCDCAddCardViewModel) aqS19S2100000_12.l2).iv0().LJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS19S2100000_12 aqS19S2100000_12, Object obj) {
        ProductReviewState setState = (ProductReviewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ProductReviewState.copy$default(setState, 0, null, null, null, null, null, null, null, null, 0, null, null, (Integer) aqS19S2100000_12.l2, aqS19S2100000_12.s0, aqS19S2100000_12.s1, null, null, null, null, 495615, null);
    }

    public static final Object invoke$6(AqS19S2100000_12 aqS19S2100000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS19S2100000_12.l2).LIZIZ);
        logNode.plusAssign("page_name", aqS19S2100000_12.s0);
        logNode.plusAssign("toast_name", "product_not_available");
        String str = aqS19S2100000_12.s1;
        if (str != null) {
            logNode.plusAssign("entrance_info", str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS19S2100000_12 aqS19S2100000_12, Object obj) {
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS19S2100000_12.l2).LIZIZ);
        sendLogReturnParams.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        sendLogReturnParams.LIZJ("page_name", aqS19S2100000_12.s0);
        sendLogReturnParams.LIZJ("toast_name", "product_not_available");
        String str = aqS19S2100000_12.s1;
        if (str != null) {
            sendLogReturnParams.LIZJ("entrance_info", str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS19S2100000_12 aqS19S2100000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS19S2100000_12.l2).LIZIZ);
        logNode.plusAssign("photo_id", aqS19S2100000_12.s0);
        logNode.plusAssign("photo_type", aqS19S2100000_12.s1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S2100000_12(C70414RkI c70414RkI, String str, int i) {
        super(1);
        this.$t = i;
        this.l2 = c70414RkI;
        this.s0 = "product_detail";
        this.s1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S2100000_12(String str, Map map, int i) {
        super(1);
        this.$t = i;
        this.l2 = map;
        this.s0 = "advanced_interactions";
        this.s1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S2100000_12(C70414RkI c70414RkI, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c70414RkI;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S2100000_12(Integer num, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = num;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S2100000_12(String str, String str2, CCDCAddCardViewModel cCDCAddCardViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = cCDCAddCardViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS19S2100000_12(String str, String str2, Map<String, ? extends Object> map, String str3) {
        super(1);
        this.$t = str3;
        this.s0 = str;
        this.l2 = str2;
        this.s1 = map;
    }
}
