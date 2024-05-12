package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C70414RkI;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* loaded from: classes13.dex */
public class AqS0S3110000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;
    public boolean z4;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S3110000_12 aqS0S3110000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("is_success", Integer.valueOf(aqS0S3110000_12.z4 ? 1 : 0));
        Integer num = (Integer) aqS0S3110000_12.l3;
        if (num != null) {
            sendLog.LIZLLL("err_code", Integer.valueOf(num.intValue()));
        }
        String str = aqS0S3110000_12.s0;
        if (str != null) {
            sendLog.LIZLLL("err_msg", str);
        }
        String str2 = aqS0S3110000_12.s1;
        if (str2 != null) {
            sendLog.LIZLLL("url", str2);
        }
        String str3 = aqS0S3110000_12.s2;
        if (str3 != null) {
            sendLog.LIZLLL("schema", str3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S3110000_12 aqS0S3110000_12, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS0S3110000_12.l3).LIZIZ);
        logNode.plusAssign("photo_show_type", aqS0S3110000_12.s0);
        if (aqS0S3110000_12.z4) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        logNode.plusAssign("page_show_type", str);
        logNode.plusAssign("photo_id", aqS0S3110000_12.s1);
        String str2 = aqS0S3110000_12.s2;
        if (str2 == null) {
            str2 = "";
        }
        logNode.plusAssign("glide_info", str2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S3110000_12(C70414RkI c70414RkI, String str, boolean z, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = c70414RkI;
        this.s0 = str;
        this.z4 = z;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S3110000_12(Integer num, String str, String str2, String str3, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z4 = z;
        this.l3 = num;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
