package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* loaded from: classes13.dex */
public class AqS2S3000000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S3000000_12(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = "video_add_link";
        this.s1 = str;
        this.s2 = "video_edit_page";
    }

    public static final Object invoke$0(AqS2S3000000_12 aqS2S3000000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        String str = aqS2S3000000_12.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sendLog.LIZJ("payment_reference", str);
        String str3 = aqS2S3000000_12.s1;
        if (str3 == null) {
            str3 = "";
        }
        sendLog.LIZJ("page_name", str3);
        String str4 = aqS2S3000000_12.s2;
        if (str4 != null) {
            str2 = str4;
        }
        sendLog.LIZJ("error_code", str2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S3000000_12 aqS2S3000000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        sendLog.LIZJ("page_name", aqS2S3000000_12.s0);
        sendLog.LIZJ("toast_name", aqS2S3000000_12.s1);
        sendLog.LIZJ("previous_page", aqS2S3000000_12.s2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS2S3000000_12 aqS2S3000000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("actionsheet_name", aqS2S3000000_12.s0);
        logNode.plusAssign("default_option", aqS2S3000000_12.s1);
        logNode.plusAssign("option_name", aqS2S3000000_12.s2);
        logNode.plusAssign("button_name", "done");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S3000000_12(String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
