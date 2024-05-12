package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27739Aud;
import X.C27943Axv;
import X.C70414RkI;
import X.C71010Rtu;
import X.C71313Ryn;
import X.C71360RzY;
import X.C71361RzZ;
import X.C71366Rze;
import X.C76800UCe;
import X.EnumC71103RvP;
import X.InterfaceC88472Yns;
import X.ORZ;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class AqS1S2400000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S2400000_12 aqS1S2400000_12, Object obj) {
        ShopWindowAnchorModel shopWindowAnchorModel;
        AwemeRawAd awemeRawAd;
        C27943Axv c27943Axv = (C27943Axv) obj;
        C71313Ryn.LIZLLL(c27943Axv, "$this$sendLog", "list_name", "video_shopping_list", "enter_list_form", "video_multi_anchor");
        CommonVideoAnchorModel commonVideoAnchorModel = (CommonVideoAnchorModel) aqS1S2400000_12.l2;
        int i = 0;
        if (commonVideoAnchorModel != null && o.LJ(commonVideoAnchorModel.isAd(), Boolean.TRUE) && (awemeRawAd = ((CommonVideoAnchorModel) aqS1S2400000_12.l2).getAwemeRawAd()) != null) {
            Long adId = awemeRawAd.getAdId();
            o.LJIIIIZZ(adId, "it.adId");
            c27943Axv.LIZLLL("ad_id", adId);
            Long creativeId = awemeRawAd.getCreativeId();
            o.LJIIIIZZ(creativeId, "it.creativeId");
            c27943Axv.LIZLLL("creative_id", creativeId);
        }
        List list = (List) aqS1S2400000_12.l3;
        if (list != null) {
            i = list.size();
        }
        c27943Axv.LIZLLL("product_cnt", Integer.valueOf(i));
        Long l = (Long) aqS1S2400000_12.l4;
        if (l != null) {
            c27943Axv.LIZLLL("stay_time", Integer.valueOf((int) l.longValue()));
        }
        Integer num = (Integer) aqS1S2400000_12.l5;
        if (num != null) {
            c27943Axv.LIZLLL("is_load_data", Integer.valueOf(num.intValue()));
        }
        String str = aqS1S2400000_12.s0;
        if (str != null) {
            c27943Axv.LIZLLL("quit_type", str);
        }
        List list2 = (List) aqS1S2400000_12.l3;
        if (list2 != null && (shopWindowAnchorModel = (ShopWindowAnchorModel) ORZ.LJLLLL(list2)) != null) {
            C71360RzY.LIZ(null, null, aqS1S2400000_12.s1, shopWindowAnchorModel, (CommonVideoAnchorModel) aqS1S2400000_12.l2, c27943Axv);
        }
        List list3 = (List) aqS1S2400000_12.l3;
        if (list3 != null) {
            C71361RzZ.LIZ.getClass();
            c27943Axv.LIZLLL("product_id", C71361RzZ.LJJ(list3));
            c27943Axv.LIZLLL("biz_type", C71366Rze.LIZLLL(list3));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S2400000_12 aqS1S2400000_12, Object obj) {
        String str;
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowExtraModel shopWindowExtraModel2;
        ShopWindowExtraModel shopWindowExtraModel3;
        ShopWindowExtraModel shopWindowExtraModel4;
        Aweme aweme;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        Object obj2 = ((Map) aqS1S2400000_12.l2).get("page_name");
        if (obj2 == null) {
            obj2 = "cart";
        }
        sendLog.LIZJ("page_name", obj2);
        Object obj3 = ((Map) aqS1S2400000_12.l2).get("author_id");
        Object obj4 = "";
        if (obj3 == null) {
            obj3 = "";
        }
        sendLog.LIZJ("author_id", obj3);
        Object obj5 = ((Map) aqS1S2400000_12.l2).get("entrance_form");
        if (obj5 == null) {
            obj5 = "video_multi_anchor";
        }
        sendLog.LIZJ("entrance_form", obj5);
        sendLog.LIZJ("source_page_type", "video");
        sendLog.LIZJ("previous_page", "video");
        Object obj6 = ((Map) aqS1S2400000_12.l2).get("group_id");
        Integer num = null;
        if (obj6 == null && ((aweme = (Aweme) aqS1S2400000_12.l3) == null || (obj6 = aweme.getGroupId()) == null)) {
            obj6 = "";
        }
        sendLog.LIZJ("source_content_id", obj6);
        Object obj7 = ((Map) aqS1S2400000_12.l2).get("product_id");
        if (obj7 == null && ((shopWindowExtraModel4 = (ShopWindowExtraModel) aqS1S2400000_12.l4) == null || (obj7 = shopWindowExtraModel4.productId) == null)) {
            obj7 = "";
        }
        sendLog.LIZJ("product_id", obj7);
        Object obj8 = ((Map) aqS1S2400000_12.l2).get("product_source");
        if (obj8 == null && ((shopWindowExtraModel3 = (ShopWindowExtraModel) aqS1S2400000_12.l4) == null || (obj8 = shopWindowExtraModel3.platform) == null)) {
            obj8 = "";
        }
        sendLog.LIZJ("product_source", obj8);
        Object obj9 = ((Map) aqS1S2400000_12.l2).get("source_from");
        if (obj9 == null && ((shopWindowExtraModel2 = (ShopWindowExtraModel) aqS1S2400000_12.l4) == null || (obj9 = shopWindowExtraModel2.sourceFrom) == null)) {
            obj9 = "";
        }
        sendLog.LIZJ("source_from", obj9);
        Object obj10 = ((Map) aqS1S2400000_12.l2).get("source");
        if (obj10 == null && ((shopWindowExtraModel = (ShopWindowExtraModel) aqS1S2400000_12.l4) == null || (obj10 = shopWindowExtraModel.source) == null)) {
            obj10 = "";
        }
        sendLog.LIZJ("source", obj10);
        sendLog.LIZJ("purchase_path", aqS1S2400000_12.s0);
        sendLog.LIZJ("entrance_info", C27739Aud.LJI(C71010Rtu.LIZ(C71010Rtu.LIZ, (Map) aqS1S2400000_12.l2)));
        Object obj11 = ((Map) aqS1S2400000_12.l2).get("track_id");
        if (obj11 == null) {
            obj11 = "";
        }
        sendLog.LIZJ("track_id", obj11);
        Object obj12 = ((Map) aqS1S2400000_12.l2).get("saleable_sku_num");
        if (obj12 == null) {
            obj12 = "";
        }
        sendLog.LIZJ("saleable_sku_num", obj12);
        String str2 = aqS1S2400000_12.s1;
        if (str2 != null) {
            sendLog.LIZJ("sku_id", str2);
        }
        Integer num2 = (Integer) aqS1S2400000_12.l5;
        if (num2 != null) {
            sendLog.LIZJ("quantity", Integer.valueOf(num2.intValue()));
        }
        Object obj13 = ((Map) aqS1S2400000_12.l2).get("video_shopping_list_style");
        if (obj13 == null) {
            obj13 = "";
        }
        sendLog.LIZJ("video_shopping_list_style", obj13);
        Object obj14 = ((Map) aqS1S2400000_12.l2).get("sale_price");
        if (obj14 == null) {
            obj14 = "";
        }
        sendLog.LIZJ("sale_price", obj14);
        Object obj15 = ((Map) aqS1S2400000_12.l2).get("original_price");
        if (obj15 == null) {
            obj15 = "";
        }
        sendLog.LIZJ("original_price", obj15);
        Object obj16 = ((Map) aqS1S2400000_12.l2).get("enter_from_info");
        if (obj16 == null) {
            obj16 = "";
        }
        sendLog.LIZJ("enter_from_info", obj16);
        Object obj17 = ((Map) aqS1S2400000_12.l2).get("original_price_value");
        if (obj17 != null) {
            obj4 = obj17;
        }
        sendLog.LIZJ("original_price_value", obj4);
        ShopWindowExtraModel shopWindowExtraModel5 = (ShopWindowExtraModel) aqS1S2400000_12.l4;
        if (shopWindowExtraModel5 != null) {
            num = shopWindowExtraModel5.productStatus;
        }
        int value = EnumC71103RvP.PRODUCT_STATUS_ON_SALES.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC71103RvP.PRODUCT_STATUS_STOCK.getValue();
            if (num == null || num.intValue() != value2) {
                str = "3";
            } else {
                str = "2";
            }
        } else {
            str = "1";
        }
        sendLog.LIZJ("product_type", str);
        Object obj18 = ((Map) aqS1S2400000_12.l2).get("rights_cnt");
        if (obj18 != null) {
            sendLog.LIZJ("rights_cnt", obj18);
        }
        Object obj19 = ((Map) aqS1S2400000_12.l2).get("rights_content");
        if (obj19 != null) {
            sendLog.LIZJ("rights_content", obj19);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS1S2400000_12 aqS1S2400000_12, Object obj) {
        Object obj2;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS1S2400000_12.l2).LIZIZ);
        logNode.plusAssign("button_for", aqS1S2400000_12.s0);
        Boolean bool = (Boolean) aqS1S2400000_12.l3;
        String str = "1";
        if (bool != null) {
            if (bool.booleanValue()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.put("is_clickable", obj2);
        }
        Boolean bool2 = (Boolean) aqS1S2400000_12.l4;
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.put("is_buy_with_coupon", str);
        }
        String str2 = aqS1S2400000_12.s1;
        if (str2 != null) {
            logNode.put("red_dot_type", str2);
        }
        Integer num = (Integer) aqS1S2400000_12.l5;
        if (num != null) {
            logNode.put("red_dot_number", Integer.valueOf(num.intValue()));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S2400000_12(ShopWindowExtraModel shopWindowExtraModel, Aweme aweme, Integer num, String str, Map map, int i) {
        super(1);
        this.$t = i;
        this.l2 = map;
        this.l3 = aweme;
        this.l4 = shopWindowExtraModel;
        this.s0 = "skip_pdp";
        this.s1 = str;
        this.l5 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S2400000_12(C70414RkI c70414RkI, String str, Boolean bool, Boolean bool2, String str2, Integer num, int i) {
        super(1);
        this.$t = i;
        this.l2 = c70414RkI;
        this.s0 = str;
        this.l3 = bool;
        this.l4 = bool2;
        this.s1 = str2;
        this.l5 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS1S2400000_12(CommonVideoAnchorModel commonVideoAnchorModel, CommonVideoAnchorModel commonVideoAnchorModel2, List<ShopWindowAnchorModel> list, Long l, Integer num, String str, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = commonVideoAnchorModel;
        this.l3 = commonVideoAnchorModel2;
        this.l4 = list;
        this.l5 = l;
        this.s0 = num;
        this.s1 = str;
    }
}
