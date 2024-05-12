package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C70666RoM;
import X.C70690Rok;
import X.C70691Rol;
import X.C71360RzY;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.ORZ;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectOption;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class AqS5S2201000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS5S2201000_12 aqS5S2201000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        Map<String, ? extends Object> map = ((ShopWindowAnchorModel) aqS5S2201000_12.l2).LIZ.promotionLogExtraInfo;
        if (map != null) {
            sendLog.LJ(map);
        }
        C71360RzY.LIZ(Integer.valueOf(aqS5S2201000_12.i4), aqS5S2201000_12.s0, aqS5S2201000_12.s1, (ShopWindowAnchorModel) aqS5S2201000_12.l2, (CommonVideoAnchorModel) aqS5S2201000_12.l3, sendLog);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS5S2201000_12 aqS5S2201000_12, Object obj) {
        List<ReviewAspectItem> list;
        ReviewAspectItem reviewAspectItem;
        ReviewAspectOption reviewAspectOption;
        String str;
        String str2;
        Integer num;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.put("click_area", aqS5S2201000_12.s0);
        logView.put("review_cnt", Integer.valueOf(C70691Rol.LJIILLIIL));
        logView.put("rank", Integer.valueOf(aqS5S2201000_12.i4));
        if (C70691Rol.LJIJJLI == 2) {
            logView.put("page_name", "shop_review");
            C70666RoM.LIZLLL(logView, aqS5S2201000_12.s1);
        } else {
            logView.put("page_name", "product_review");
        }
        logView.put("previous_page", "product_detail");
        C70666RoM.LJ(logView, (ReviewItemStruct) aqS5S2201000_12.l2, C70691Rol.LJIJ);
        C70690Rok c70690Rok = C70691Rol.LJIJ;
        if (c70690Rok != null) {
            String str3 = c70690Rok.LIZJ;
            if (str3 == null) {
                str3 = "";
            }
            logView.put("filter_id", str3);
            C70690Rok c70690Rok2 = C70691Rol.LJIJ;
            if (c70690Rok2 != null) {
                str2 = c70690Rok2.LIZIZ;
            } else {
                str2 = null;
            }
            logView.put("filter_name", String.valueOf(str2));
            C70690Rok c70690Rok3 = C70691Rol.LJIJ;
            if (c70690Rok3 != null && (num = c70690Rok3.LIZLLL) != null) {
                C70691Rol c70691Rol = (C70691Rol) aqS5S2201000_12.l3;
                int intValue = num.intValue();
                c70691Rol.getClass();
                C70691Rol.LIZ(logView, intValue);
            }
        }
        ReviewItemStruct.MainReview mainReview = ((ReviewItemStruct) aqS5S2201000_12.l2).review;
        if (mainReview != null && (list = mainReview.reviewAspectItems) != null && (reviewAspectItem = (ReviewAspectItem) ORZ.LJLLJ(list)) != null && (reviewAspectOption = reviewAspectItem.answer) != null && (str = reviewAspectOption.optionText) != null) {
            logView.put("fitness_info", str);
        }
        logView.put("biz_type", String.valueOf(((C70691Rol) aqS5S2201000_12.l3).LIZJ));
        logView.put("product_id", ((C70691Rol) aqS5S2201000_12.l3).LIZIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS5S2201000_12 aqS5S2201000_12, Object obj) {
        LaneParams update = (LaneParams) obj;
        o.LJIIIZ(update, "$this$update");
        update.putAll((HashMap) aqS5S2201000_12.l2);
        HashMap hashMap = (HashMap) aqS5S2201000_12.l3;
        if (hashMap != null) {
            update.putAll(hashMap);
        }
        update.plusAssign("error_message", aqS5S2201000_12.s0);
        update.plusAssign("error_code", aqS5S2201000_12.s1);
        update.plusAssign("preload_type", Integer.valueOf(aqS5S2201000_12.i4));
        update.plusAssign("is_success", "no");
        if (!update.containsKey((Object) "page_name")) {
            update.put("page_name", "product_detail");
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S2201000_12(int i, CommonVideoAnchorModel commonVideoAnchorModel, ShopWindowAnchorModel shopWindowAnchorModel, String str, String str2, int i2) {
        super(1);
        this.$t = i2;
        this.l2 = shopWindowAnchorModel;
        this.i4 = i;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = commonVideoAnchorModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S2201000_12(String str, int i, String str2, ReviewItemStruct reviewItemStruct, C70691Rol c70691Rol, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i4 = i;
        this.s1 = str2;
        this.l2 = reviewItemStruct;
        this.l3 = c70691Rol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS5S2201000_12(HashMap hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = hashMap;
        this.l3 = hashMap2;
        this.s0 = hashMap3;
        this.s1 = str;
        this.i4 = str2;
    }
}
