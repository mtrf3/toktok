package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C70414RkI;
import X.C71360RzY;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Map;

/* loaded from: classes13.dex */
public class AqS0S3201000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i5;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AqS0S3201000_12 aqS0S3201000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("click_area", aqS0S3201000_12.s0);
        Map<String, ? extends Object> map = ((ShopWindowAnchorModel) aqS0S3201000_12.l3).LIZ.promotionLogExtraInfo;
        if (map != null) {
            sendLog.LJ(map);
        }
        C71360RzY.LIZ(Integer.valueOf(aqS0S3201000_12.i5), aqS0S3201000_12.s1, aqS0S3201000_12.s2, (ShopWindowAnchorModel) aqS0S3201000_12.l3, (CommonVideoAnchorModel) aqS0S3201000_12.l4, sendLog);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S3201000_12 aqS0S3201000_12, Object obj) {
        String str;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, ((C70414RkI) aqS0S3201000_12.l3).LIZIZ);
        sendLog.LIZJ("photo_id", aqS0S3201000_12.s0);
        sendLog.LIZJ("photo_id", aqS0S3201000_12.s0);
        sendLog.LIZJ("rank", Integer.valueOf(aqS0S3201000_12.i5));
        sendLog.LIZJ("review_id", aqS0S3201000_12.s1);
        sendLog.LIZJ("is_self", Integer.valueOf(o.LJ((Boolean) aqS0S3201000_12.l4, Boolean.TRUE) ? 1 : 0));
        String str2 = aqS0S3201000_12.s2;
        if (str2 != null) {
            sendLog.LIZJ("rate", str2);
        }
        C70414RkI c70414RkI = (C70414RkI) aqS0S3201000_12.l3;
        c70414RkI.getClass();
        if (c70414RkI.LJIJJ()) {
            str = "no_text";
        } else {
            str = "has_text";
        }
        sendLog.LIZJ("photo_show_type", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS0S3201000_12 aqS0S3201000_12, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS0S3201000_12.l3).LIZIZ);
        logNode.plusAssign("photo_id", aqS0S3201000_12.s0);
        logNode.plusAssign("rank", Integer.valueOf(aqS0S3201000_12.i5));
        String str2 = aqS0S3201000_12.s1;
        if (str2 != null) {
            logNode.plusAssign("review_id", str2);
        }
        logNode.plusAssign("is_self", Integer.valueOf(o.LJ((Boolean) aqS0S3201000_12.l4, Boolean.TRUE) ? 1 : 0));
        String str3 = aqS0S3201000_12.s2;
        if (str3 != null) {
            logNode.plusAssign("rate", str3);
        }
        C70414RkI c70414RkI = (C70414RkI) aqS0S3201000_12.l3;
        c70414RkI.getClass();
        if (c70414RkI.LJIJJ()) {
            str = "no_text";
        } else {
            str = "has_text";
        }
        logNode.plusAssign("photo_show_type", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS0S3201000_12 aqS0S3201000_12, Object obj) {
        String str;
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS0S3201000_12.l3).LIZIZ);
        sendLogReturnParams.LIZJ("photo_id", aqS0S3201000_12.s0);
        sendLogReturnParams.LIZJ("rank", Integer.valueOf(aqS0S3201000_12.i5));
        String str2 = aqS0S3201000_12.s1;
        if (str2 != null) {
            sendLogReturnParams.LIZJ("review_id", str2);
        }
        sendLogReturnParams.LIZJ("is_self", Integer.valueOf(o.LJ((Boolean) aqS0S3201000_12.l4, Boolean.TRUE) ? 1 : 0));
        String str3 = aqS0S3201000_12.s2;
        if (str3 != null) {
            sendLogReturnParams.LIZJ("rate", str3);
        }
        C70414RkI c70414RkI = (C70414RkI) aqS0S3201000_12.l3;
        c70414RkI.getClass();
        if (c70414RkI.LJIJJ()) {
            str = "no_text";
        } else {
            str = "has_text";
        }
        sendLogReturnParams.LIZJ("photo_show_type", str);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S3201000_12(int i, CommonVideoAnchorModel commonVideoAnchorModel, ShopWindowAnchorModel shopWindowAnchorModel, String str, String str2, String str3, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l3 = shopWindowAnchorModel;
        this.i5 = i;
        this.s1 = str2;
        this.s2 = str3;
        this.l4 = commonVideoAnchorModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S3201000_12(C70414RkI c70414RkI, String str, int i, String str2, Boolean bool, String str3, int i2) {
        super(1);
        this.$t = i2;
        this.l3 = c70414RkI;
        this.s0 = str;
        this.i5 = i;
        this.s1 = str2;
        this.l4 = bool;
        this.s2 = str3;
    }
}
