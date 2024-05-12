package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C55793Lv3;
import X.C56045Lz7;
import X.C71313Ryn;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;

/* loaded from: classes10.dex */
public class AqS1S2001000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS1S2001000_9 aqS1S2001000_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C55793Lv3.LIZ(sendLog);
        sendLog.LIZLLL("list_name", aqS1S2001000_9.s0);
        sendLog.LIZLLL("list_num", Integer.valueOf(aqS1S2001000_9.i2));
        sendLog.LIZLLL("enter_method", aqS1S2001000_9.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S2001000_9 aqS1S2001000_9, Object obj) {
        C27943Axv c27943Axv = (C27943Axv) obj;
        C71313Ryn.LIZLLL(c27943Axv, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "mall");
        FashionMallFragment.LJZ.getClass();
        String str = FashionMallFragment.LJZI;
        if (str == null) {
            str = "";
        }
        c27943Axv.LIZLLL("previous_page", str);
        C56045Lz7.LIZ.getClass();
        c27943Axv.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        String str2 = aqS1S2001000_9.s0;
        if (str2 != null && str2.length() > 0) {
            c27943Axv.LIZLLL("page_skin_type", aqS1S2001000_9.s0);
        }
        c27943Axv.LIZLLL("page_struc_type", aqS1S2001000_9.s1);
        c27943Axv.LIZLLL("request_type", Integer.valueOf(aqS1S2001000_9.i2));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S2001000_9(String str, int i, String str2, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i2 = i;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S2001000_9(String str, String str2, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.i2 = i;
    }
}
