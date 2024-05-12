package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C43I;
import X.C49052JMy;
import X.C49559Jch;
import X.C50042JkU;
import X.C50043JkV;
import X.C50201Jn3;
import X.EnumC51721KRp;
import X.InterfaceC50639Ju7;
import X.InterfaceC88472Yns;
import X.JYC;
import X.JYD;
import X.KI0;
import X.X1D;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayState;
import defpackage.b0;
import java.util.Map;

/* loaded from: classes9.dex */
public class AqS32S0001000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

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
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS32S0001000_8(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS32S0001000_8 aqS32S0001000_8, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C49559Jch(aqS32S0001000_8.i0);
    }

    public static final Object invoke$1(AqS32S0001000_8 aqS32S0001000_8, Object obj) {
        ShoutoutsPlayState setState = (ShoutoutsPlayState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return setState.copy(aqS32S0001000_8.i0, EnumC51721KRp.DOWNLOADING);
    }

    public static final Object invoke$2(AqS32S0001000_8 aqS32S0001000_8, Object obj) {
        C50201Jn3 setState = (C50201Jn3) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C50201Jn3.LIZ(setState, 0, aqS32S0001000_8.i0, false, null, null, 3967);
    }

    public static final Object invoke$3(AqS32S0001000_8 aqS32S0001000_8, Object obj) {
        C50043JkV it = (C50043JkV) obj;
        o.LJIIIZ(it, "it");
        C50042JkU c50042JkU = it.LJLILLLLZI;
        int i = c50042JkU.LJLIL;
        int i2 = aqS32S0001000_8.i0;
        int i3 = c50042JkU.LJLILLLLZI;
        int i4 = 0;
        if (i2 > i3 || i > i2) {
            if (i2 > i3) {
                i4 = -1;
            } else {
                i4 = 1;
            }
        }
        return Integer.valueOf(i4);
    }

    public static final Object invoke$4(AqS32S0001000_8 aqS32S0001000_8, Object obj) {
        Map.Entry it = (Map.Entry) obj;
        o.LJIIIZ(it, "it");
        Integer LIZIZ = ((InterfaceC50639Ju7) it.getValue()).LIZIZ();
        boolean z = false;
        if (LIZIZ != null) {
            int intValue = LIZIZ.intValue();
            int i = aqS32S0001000_8.i0;
            if ((intValue & i) == i) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(AqS32S0001000_8 aqS32S0001000_8, Object obj) {
        JYD it = (JYD) obj;
        o.LJIIIZ(it, "it");
        JYC jyc = it.LIZIZ;
        int i = aqS32S0001000_8.i0;
        int i2 = jyc.LIZ;
        int i3 = jyc.LIZIZ;
        int i4 = 0;
        if (i > i3 || i2 > i) {
            if (i > i3) {
                i4 = -1;
            } else {
                i4 = 1;
            }
        }
        return Integer.valueOf(i4);
    }

    public static final Object invoke$6(AqS32S0001000_8 aqS32S0001000_8, Object obj) {
        C49052JMy setState = (C49052JMy) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C49052JMy.LIZ(setState, null, null, new C43I(Integer.valueOf(aqS32S0001000_8.i0)), null, 47);
    }

    public static final Object invoke$7(AqS32S0001000_8 aqS32S0001000_8, Object obj) {
        C49052JMy setState = (C49052JMy) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C49052JMy.LIZ(setState, null, new C43I(Integer.valueOf(aqS32S0001000_8.i0)), null, null, 61);
    }

    public static final Object invoke$8(AqS32S0001000_8 aqS32S0001000_8, Object obj) {
        KI0 setState = (KI0) obj;
        o.LJIIIZ(setState, "$this$setState");
        return KI0.LIZ(setState, aqS32S0001000_8.i0, null, null, false, null, null, 62);
    }

    public static final Object invoke$9(AqS32S0001000_8 aqS32S0001000_8, Object obj) {
        ((Number) obj).intValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Collection doesn't contain element at index ");
        throw new IndexOutOfBoundsException(b0.LIZJ(LIZ, aqS32S0001000_8.i0, '.', LIZ));
    }
}
