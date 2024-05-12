package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C82636Wbw;
import X.InterfaceC65784Pro;
import X.InterfaceC82637Wbx;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class AqS27S0010000_14 extends AbstractC65781Prl implements InterfaceC65784Pro {
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

    public static final Object invoke$0(AqS27S0010000_14 aqS27S0010000_14) {
        boolean z;
        if (C82636Wbw.LIZLLL || C82636Wbw.LJ) {
            z = true;
        } else {
            z = false;
        }
        C82636Wbw.LJFF = z;
        ArrayList<InterfaceC82637Wbx> arrayList = C82636Wbw.LJI;
        boolean z2 = aqS27S0010000_14.z0;
        Iterator<InterfaceC82637Wbx> it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC82637Wbx next = it.next();
            if (z2) {
                next.LIZLLL();
            } else {
                next.LIZ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS27S0010000_14 aqS27S0010000_14) {
        boolean z;
        if (C82636Wbw.LIZLLL || C82636Wbw.LJ) {
            z = true;
        } else {
            z = false;
        }
        C82636Wbw.LJFF = z;
        ArrayList<InterfaceC82637Wbx> arrayList = C82636Wbw.LJI;
        boolean z2 = aqS27S0010000_14.z0;
        Iterator<InterfaceC82637Wbx> it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC82637Wbx next = it.next();
            if (z2) {
                next.LIZJ();
            } else {
                next.LIZIZ();
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0010000_14(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
