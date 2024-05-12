package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.G4M;
import X.G4N;
import X.InterfaceC88471Ynr;
import android.content.Intent;
import android.view.KeyEvent;

/* loaded from: classes7.dex */
public class AqS114S0101000_6 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS114S0101000_6(int i, Intent intent, int i2) {
        super(2);
        this.$t = i2;
        this.i1 = i;
        this.l0 = intent;
    }

    public static final Object invoke$0(AqS114S0101000_6 aqS114S0101000_6, Object obj, Object obj2) {
        G4N execute = (G4N) obj;
        o.LJIIIZ(execute, "$this$execute");
        execute.LJLILLLLZI.onActivityReenter(aqS114S0101000_6.i1, (Intent) aqS114S0101000_6.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS114S0101000_6 aqS114S0101000_6, Object obj, Object obj2) {
        boolean z;
        G4N execute = (G4N) obj;
        Boolean bool = (Boolean) obj2;
        o.LJIIIZ(execute, "$this$execute");
        G4M g4m = execute.LJLILLLLZI;
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (g4m.Ag()) {
            if (g4m.onKeyDown(aqS114S0101000_6.i1, (KeyEvent) aqS114S0101000_6.l0) || z) {
                z2 = true;
            }
            z = z2;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS114S0101000_6(int i, KeyEvent keyEvent, int i2) {
        super(2);
        this.$t = i2;
        this.i1 = i;
        this.l0 = keyEvent;
    }
}
