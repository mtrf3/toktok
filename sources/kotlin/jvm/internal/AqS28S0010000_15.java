package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.Y75;
import X.Y77;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes16.dex */
public class AqS28S0010000_15 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public boolean z0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS28S0010000_15 aqS28S0010000_15) {
        boolean z;
        if (Y75.LIZLLL || Y75.LJ) {
            z = true;
        } else {
            z = false;
        }
        Y75.LJFF = z;
        ArrayList<Y77> arrayList = Y75.LJI;
        boolean z2 = aqS28S0010000_15.z0;
        Iterator<Y77> it = arrayList.iterator();
        while (it.hasNext()) {
            Y77 next = it.next();
            if (z2) {
                next.LIZLLL();
            } else {
                next.LIZ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS28S0010000_15 aqS28S0010000_15) {
        boolean z;
        if (Y75.LIZLLL || Y75.LJ) {
            z = true;
        } else {
            z = false;
        }
        Y75.LJFF = z;
        ArrayList<Y77> arrayList = Y75.LJI;
        boolean z2 = aqS28S0010000_15.z0;
        Iterator<Y77> it = arrayList.iterator();
        while (it.hasNext()) {
            Y77 next = it.next();
            if (z2) {
                next.LIZJ();
            } else {
                next.LIZIZ();
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0010000_15(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
