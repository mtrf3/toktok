package kotlin.jvm.internal;

import X.A90;
import X.AbstractC65781Prl;
import X.C0NB;
import X.C31824CeK;
import X.C68322mC;
import X.C70690Rok;
import X.C70691Rol;
import X.C71335Rz9;
import X.C71360RzY;
import X.C72991Skl;
import X.C76800UCe;
import X.C78983UzD;
import X.CN1;
import X.InterfaceC88472Yns;
import X.X1D;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* loaded from: classes13.dex */
public class AqS6S2300000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS6S2300000_12 aqS6S2300000_12, Object obj) {
        String str;
        String LJIJJLI;
        String schema = (String) obj;
        o.LJIIIZ(schema, "schema");
        ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) aqS6S2300000_12.l2;
        String str2 = aqS6S2300000_12.s0;
        CommonVideoAnchorModel commonVideoAnchorModel = ((C71335Rz9) aqS6S2300000_12.l3).LJLJJI;
        if (commonVideoAnchorModel != null) {
            str = commonVideoAnchorModel.getEventType();
        } else {
            str = null;
        }
        LJIJJLI = C71360RzY.LJIJJLI(schema, shopWindowAnchorModel, str2, commonVideoAnchorModel, true, str, aqS6S2300000_12.s1, (String) ((C68322mC) aqS6S2300000_12.l4).element, null, null);
        SmartRouter.buildRoute(((C71335Rz9) aqS6S2300000_12.l3).LJLILLLLZI, LJIJJLI).open();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS6S2300000_12 aqS6S2300000_12, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download onSuccess,");
        LIZ.append(C78983UzD.LJJIIJZLJL((C31824CeK) aqS6S2300000_12.l2));
        C0NB.LIZIZ("LiveReplayVideoClip", X1D.LIZIZ(LIZ));
        ((A90) aqS6S2300000_12.l3).LIZLLL(100.0f);
        ((A90) aqS6S2300000_12.l3).dismiss();
        C72991Skl.LIZIZ("finish", aqS6S2300000_12.s0);
        ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).Xl0((Context) aqS6S2300000_12.l4, C78983UzD.LJJIIJZLJL((C31824CeK) aqS6S2300000_12.l2), aqS6S2300000_12.s1, aqS6S2300000_12.s0, "", "", "1", "");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS6S2300000_12 aqS6S2300000_12, Object obj) {
        int i;
        Integer num;
        Integer num2;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        if (C70691Rol.LJIJJLI == 2) {
            logView.put("page_name", "shop_review");
            logView.put("shop_id", C70691Rol.LJIJJ);
        }
        logView.put("product_id", ((C70691Rol) aqS6S2300000_12.l2).LIZIZ);
        logView.put("filter_name", ((C70690Rok) aqS6S2300000_12.l3).LIZIZ);
        logView.put("filter_id", ((C70690Rok) aqS6S2300000_12.l3).LIZJ);
        logView.put("rank", Integer.valueOf(((C70690Rok) aqS6S2300000_12.l3).LIZ));
        ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) aqS6S2300000_12.l4;
        if (reviewFilterStruct != null && (num2 = reviewFilterStruct.count) != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        logView.put("review_cnt", Integer.valueOf(i));
        logView.put("cnt_perc", aqS6S2300000_12.s0);
        logView.put("biz_type", String.valueOf(((C70691Rol) aqS6S2300000_12.l2).LIZJ));
        String str = aqS6S2300000_12.s1;
        if (str != null) {
            logView.put("module_name", str);
        }
        C70691Rol c70691Rol = (C70691Rol) aqS6S2300000_12.l2;
        ReviewFilterStruct reviewFilterStruct2 = (ReviewFilterStruct) aqS6S2300000_12.l4;
        c70691Rol.getClass();
        if (reviewFilterStruct2 != null && (num = reviewFilterStruct2.type) != null) {
            C70691Rol.LIZ(logView, num.intValue());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS6S2300000_12 aqS6S2300000_12, Object obj) {
        String str;
        int i;
        Integer num;
        Integer num2;
        String str2;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        if (C70691Rol.LJIJJLI == 2) {
            logNode.put("page_name", "shop_review");
            logNode.put("shop_id", C70691Rol.LJIJJ);
        }
        logNode.put("product_id", ((C70691Rol) aqS6S2300000_12.l2).LIZIZ);
        ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) aqS6S2300000_12.l3;
        String str3 = "";
        if (reviewFilterStruct == null || (str = reviewFilterStruct.nameEng) == null) {
            str = "";
        }
        logNode.put("filter_name", str);
        ReviewFilterStruct reviewFilterStruct2 = (ReviewFilterStruct) aqS6S2300000_12.l3;
        if (reviewFilterStruct2 != null && (str2 = reviewFilterStruct2.filterId) != null) {
            str3 = str2;
        }
        logNode.put("filter_id", str3);
        Integer num3 = (Integer) aqS6S2300000_12.l4;
        if (num3 != null) {
            logNode.put("rank", Integer.valueOf(num3.intValue()));
        }
        String str4 = aqS6S2300000_12.s0;
        if (str4 != null) {
            logNode.put("module_name", str4);
        }
        ReviewFilterStruct reviewFilterStruct3 = (ReviewFilterStruct) aqS6S2300000_12.l3;
        if (reviewFilterStruct3 != null && (num2 = reviewFilterStruct3.count) != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        logNode.put("review_cnt", Integer.valueOf(i));
        logNode.put("cnt_perc", aqS6S2300000_12.s1);
        logNode.put("biz_type", String.valueOf(((C70691Rol) aqS6S2300000_12.l2).LIZJ));
        C70691Rol c70691Rol = (C70691Rol) aqS6S2300000_12.l2;
        ReviewFilterStruct reviewFilterStruct4 = (ReviewFilterStruct) aqS6S2300000_12.l3;
        c70691Rol.getClass();
        if (reviewFilterStruct4 != null && (num = reviewFilterStruct4.type) != null) {
            C70691Rol.LIZ(logNode, num.intValue());
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S2300000_12(C31824CeK c31824CeK, A90 a90, String str, Context context, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c31824CeK;
        this.l3 = a90;
        this.s0 = str;
        this.l4 = context;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S2300000_12(C70691Rol c70691Rol, C70690Rok c70690Rok, ReviewFilterStruct reviewFilterStruct, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c70691Rol;
        this.l3 = c70690Rok;
        this.l4 = reviewFilterStruct;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S2300000_12(C70691Rol c70691Rol, ReviewFilterStruct reviewFilterStruct, Integer num, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c70691Rol;
        this.l3 = reviewFilterStruct;
        this.l4 = num;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS6S2300000_12(ShopWindowAnchorModel shopWindowAnchorModel, ShopWindowAnchorModel shopWindowAnchorModel2, String str, C71335Rz9 c71335Rz9, String str2, C68322mC<String> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l2 = shopWindowAnchorModel;
        this.s0 = shopWindowAnchorModel2;
        this.l3 = str;
        this.s1 = c71335Rz9;
        this.l4 = str2;
    }
}
