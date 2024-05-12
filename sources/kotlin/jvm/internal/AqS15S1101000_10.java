package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C58620MzY;
import X.C58684N1k;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.N1V;
import com.lynx.tasm.LynxError;

/* loaded from: classes11.dex */
public class AqS15S1101000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l1;
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

    public static final Object invoke$0(AqS15S1101000_10 aqS15S1101000_10, Object obj) {
        int i;
        String str;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        LynxError lynxError = (LynxError) aqS15S1101000_10.l1;
        if (lynxError != null) {
            i = lynxError.LIZ;
        } else {
            i = -1;
        }
        sendLog.LIZJ("err_code", Integer.valueOf(i));
        LynxError lynxError2 = (LynxError) aqS15S1101000_10.l1;
        if (lynxError2 != null) {
            str = lynxError2.LIZ();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sendLog.LIZJ("err_msg", str);
        sendLog.LIZJ("brick_name", Integer.valueOf(aqS15S1101000_10.i2));
        String str3 = aqS15S1101000_10.s0;
        if (str3 != null) {
            str2 = str3;
        }
        sendLog.LIZJ("brick_schema", str2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS15S1101000_10 aqS15S1101000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJIILJJIL, Integer.valueOf(((N1V) aqS15S1101000_10.l1).LIZIZ));
        logAd.LJII(C58684N1k.LJIILL, ((N1V) aqS15S1101000_10.l1).LJII);
        logAd.LJII(C58684N1k.LJJ, aqS15S1101000_10.s0);
        logAd.LJII(C58684N1k.LJJIJIL, Integer.valueOf(((N1V) aqS15S1101000_10.l1).LJIILLIIL));
        logAd.LJII(C58684N1k.LJJJJL, "iab");
        logAd.LJII(C58684N1k.LJJLIIIJ, Integer.valueOf(aqS15S1101000_10.i2));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S1101000_10(N1V n1v, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = n1v;
        this.s0 = str;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S1101000_10(LynxError lynxError, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = lynxError;
        this.i2 = i;
        this.s0 = str;
    }
}
