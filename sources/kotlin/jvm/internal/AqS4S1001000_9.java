package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C56045Lz7;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;

/* loaded from: classes10.dex */
public class AqS4S1001000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public String s0;

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

    public static final Object invoke$0(AqS4S1001000_9 aqS4S1001000_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        FashionMallFragment.LJZ.getClass();
        String str = FashionMallFragment.LJZI;
        if (str == null) {
            str = "";
        }
        sendLog.LIZLLL("previous_page", str);
        sendLog.LIZLLL("status", Integer.valueOf(aqS4S1001000_9.i1));
        String str2 = aqS4S1001000_9.s0;
        if (str2 != null) {
            sendLog.LIZLLL("page_type", str2);
        }
        sendLog.LJ(C56045Lz7.LIZJ());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS4S1001000_9 aqS4S1001000_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("error_code", Integer.valueOf(aqS4S1001000_9.i1));
        sendLog.LIZLLL("error_msg", aqS4S1001000_9.s0);
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        sendLog.LJ(C56045Lz7.LIZJ());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S1001000_9(int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }
}
