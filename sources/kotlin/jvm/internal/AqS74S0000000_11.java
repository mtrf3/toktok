package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.P8K;
import X.Q0E;
import X.Q1T;
import X.Q1U;
import android.os.Build;

/* loaded from: classes12.dex */
public class AqS74S0000000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS74S0000000_11 aqS74S0000000_11) {
        aqS74S0000000_11.invoke$0();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS74S0000000_11 aqS74S0000000_11) {
        aqS74S0000000_11.invoke$1();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public final void invoke$1() {
        Q1T.LIZIZ(Q1U.LJLIL);
    }

    public final void invoke$0() {
        Q0E.LIZIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S0000000_11(int i) {
        super(0);
        this.$t = i;
    }

    public static final Object invoke$1(AqS74S0000000_11 aqS74S0000000_11) {
        if (Build.VERSION.SDK_INT <= 22) {
            try {
                P8K p8k = new P8K();
                p8k.LIZ = 52428800L;
                p8k.LIZIZ = 52428800L;
                p8k.LIZJ = 52428800L;
                return p8k;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
