package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C56580MIm;
import X.C58620MzY;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes10.dex */
public class AqS1S4000000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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

    public static final Object invoke$0(AqS1S4000000_9 aqS1S4000000_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("is_success", aqS1S4000000_9.s0);
        String str = aqS1S4000000_9.s1;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sendLog.LIZLLL("top_product_id", str);
        String str3 = aqS1S4000000_9.s2;
        if (str3 == null) {
            str3 = "";
        }
        sendLog.LIZLLL("error_info", str3);
        String str4 = aqS1S4000000_9.s3;
        if (str4 != null) {
            str2 = str4;
        }
        sendLog.LIZLLL("is_old_promotion", str2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S4000000_9 aqS1S4000000_9, Object obj) {
        C58620MzY log = (C58620MzY) obj;
        o.LJIIIZ(log, "$this$log");
        C56580MIm.LIZ.getClass();
        log.LJII(C56580MIm.LIZJ, aqS1S4000000_9.s0);
        log.LJII(C56580MIm.LIZIZ, aqS1S4000000_9.s1);
        log.LJII(C56580MIm.LIZLLL, aqS1S4000000_9.s2);
        log.LJII(C56580MIm.LJ, aqS1S4000000_9.s3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S4000000_9(String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = CardStruct.IStatusCode.DEFAULT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S4000000_9(String str, String str2, String str3, String str4, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
    }
}
