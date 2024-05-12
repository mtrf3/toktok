package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C92264a7w;
import X.C92273a85;
import X.InterfaceC88472Yns;
import com.bytedance.ies.foundation.base.BaseViewModel;
import java.util.Locale;
import ujb.s;

/* loaded from: classes20.dex */
public class IDqS2S0010000_31 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS2S0010000_31(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS2S0010000_31(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(IDqS2S0010000_31 iDqS2S0010000_31, Object obj) {
        BaseViewModel activityConfiguration = (BaseViewModel) obj;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(new IDqS4S0010000_31(iDqS2S0010000_31.z0, 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS2S0010000_31 iDqS2S0010000_31, Object obj) {
        BaseViewModel activityConfiguration = (BaseViewModel) obj;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(new IDqS4S0010000_31(iDqS2S0010000_31.z0, 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS2S0010000_31 iDqS2S0010000_31, Object obj) {
        BaseViewModel activityConfiguration = (BaseViewModel) obj;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(new IDqS4S0010000_31(iDqS2S0010000_31.z0, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS2S0010000_31 iDqS2S0010000_31, Object obj) {
        BaseViewModel activityConfiguration = (BaseViewModel) obj;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(new IDqS4S0010000_31(iDqS2S0010000_31.z0, 3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS2S0010000_31 iDqS2S0010000_31, Object obj) {
        boolean z;
        String str = (String) obj;
        boolean z2 = false;
        if (str != null) {
            boolean z3 = iDqS2S0010000_31.z0;
            if (s.LJJLIIIJJIZ(str, ':', 0, false, 6) < 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(z ^ z3)) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }

    public static final Object invoke$5(IDqS2S0010000_31 iDqS2S0010000_31, Object obj) {
        String it = (String) obj;
        if (iDqS2S0010000_31.z0) {
            return it;
        }
        o.LJIIIIZZ(it, "it");
        int LJJLIIIJJIZ = s.LJJLIIIJJIZ(it, '%', 0, false, 6);
        if (LJJLIIIJJIZ >= 0) {
            it = it.substring(0, LJJLIIIJJIZ);
            o.LJIIIIZZ(it, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Locale US = Locale.US;
        o.LJIIIIZZ(US, "US");
        String upperCase = it.toUpperCase(US);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    public static final Object invoke$6(IDqS2S0010000_31 iDqS2S0010000_31, Object obj) {
        C92264a7w setState = (C92264a7w) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C92264a7w.LIZ(setState, iDqS2S0010000_31.z0, null, false, null, null, 62);
    }

    public static final Object invoke$7(IDqS2S0010000_31 iDqS2S0010000_31, Object obj) {
        C92273a85 setState = (C92273a85) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C92273a85.LIZ(setState, null, iDqS2S0010000_31.z0, null, null, null, 29);
    }
}
