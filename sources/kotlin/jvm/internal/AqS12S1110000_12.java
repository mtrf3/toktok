package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C70414RkI;
import X.C71313Ryn;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.SA3;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* loaded from: classes13.dex */
public class AqS12S1110000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS12S1110000_12 aqS12S1110000_12, Object obj) {
        String str;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, ((SA3) aqS12S1110000_12.l1).LJII);
        sendLog.LIZJ("page_name", PaymentResultProcess.INSTANCE.sourceToPageName(aqS12S1110000_12.s0));
        sendLog.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (aqS12S1110000_12.z2) {
            str = "app";
        } else {
            str = "h5";
        }
        sendLog.LIZJ("pay_route", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS12S1110000_12 aqS12S1110000_12, Object obj) {
        String str;
        int i;
        Integer num;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        boolean z = aqS12S1110000_12.z2;
        Response response = (Response) aqS12S1110000_12.l1;
        String str2 = aqS12S1110000_12.s0;
        if (z) {
            str = "save";
        } else {
            str = "unsave";
        }
        logView.plusAssign("save_type", str);
        if (response != null && response.isCodeOK()) {
            i = 1;
        } else {
            i = 0;
        }
        logView.plusAssign("is_success", Integer.valueOf(i));
        if (response != null) {
            if (!response.isCodeOK()) {
                num = Integer.valueOf(response.code);
            }
            logView.plusAssign("prompt_type", str2);
            return C76800UCe.LIZ;
        }
        num = null;
        logView.plusAssign("error_code", num);
        logView.plusAssign("prompt_type", str2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS12S1110000_12 aqS12S1110000_12, Object obj) {
        String str;
        String str2;
        C27943Axv c27943Axv = (C27943Axv) obj;
        C71313Ryn.LIZLLL(c27943Axv, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "video");
        if (aqS12S1110000_12.z2) {
            str = "yes";
        } else {
            str = "no";
        }
        c27943Axv.LIZLLL("is_single_anchor", str);
        c27943Axv.LIZLLL("click_opportunity", aqS12S1110000_12.s0);
        if (aqS12S1110000_12.z2) {
            str2 = "video_single_anchor";
        } else {
            str2 = "video_multi_anchor";
        }
        c27943Axv.LIZLLL("entrance_form", str2);
        c27943Axv.LIZLLL("anchor_show_type", "video_cart_tag");
        c27943Axv.LJ((Map) aqS12S1110000_12.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS12S1110000_12 aqS12S1110000_12, Object obj) {
        String str;
        C27943Axv c27943Axv = (C27943Axv) obj;
        C71313Ryn.LIZLLL(c27943Axv, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "video");
        if (aqS12S1110000_12.z2) {
            str = "yes";
        } else {
            str = "no";
        }
        c27943Axv.LIZLLL("is_single_anchor", str);
        String str2 = aqS12S1110000_12.s0;
        if (str2 == null) {
            if (aqS12S1110000_12.z2) {
                str2 = "video_single_anchor";
            } else {
                str2 = "video_multi_anchor";
            }
        }
        c27943Axv.LIZLLL("entrance_form", str2);
        c27943Axv.LIZLLL("anchor_show_type", "video_cart_tag");
        c27943Axv.LJ((Map) aqS12S1110000_12.l1);
        if (!aqS12S1110000_12.z2) {
            Object obj2 = ((Map) aqS12S1110000_12.l1).get("multi_anchor_display");
            if (obj2 == null) {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            c27943Axv.LIZLLL("multi_anchor_display", obj2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS12S1110000_12 aqS12S1110000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS12S1110000_12.l1).LIZIZ);
        ((C70414RkI) aqS12S1110000_12.l1).LIZJ(logNode);
        logNode.minus("is_success", Integer.valueOf(aqS12S1110000_12.z2 ? 1 : 0));
        logNode.minus("remind_name", aqS12S1110000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS12S1110000_12 aqS12S1110000_12, Object obj) {
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS12S1110000_12.l1).LIZIZ);
        ((C70414RkI) aqS12S1110000_12.l1).LIZLLL(sendLogReturnParams);
        sendLogReturnParams.LIZIZ("is_success", Integer.valueOf(aqS12S1110000_12.z2 ? 1 : 0));
        sendLogReturnParams.LIZIZ("remind_name", aqS12S1110000_12.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S1110000_12(C70414RkI c70414RkI, boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70414RkI;
        this.z2 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S1110000_12(SA3 sa3, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = sa3;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S1110000_12(String str, Map map, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.s0 = str;
        this.l1 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS12S1110000_12(boolean z, boolean z2, Response<Object> response, String str) {
        super(1);
        this.$t = str;
        this.z2 = z;
        this.l1 = z2;
        this.s0 = response;
    }
}
