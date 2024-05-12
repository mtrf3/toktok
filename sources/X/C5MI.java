package X;

import kotlin.jvm.internal.AqS152S0100000_2;

/* renamed from: X.5MI, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5MI {
    public final InterfaceC65784Pro<InterfaceC153045zY> LIZ;

    public abstract void LIZIZ(C5RV c5rv);

    public abstract void LIZJ(C5RV c5rv);

    public C5MI(AqS152S0100000_2 aqS152S0100000_2) {
        this.LIZ = aqS152S0100000_2;
    }

    public final int LIZ(C5RV c5rv, int i) {
        InterfaceC153045zY invoke = this.LIZ.invoke();
        if (C5RV.LJ(c5rv)) {
            return i;
        }
        if (C5RV.LIZJ(c5rv) || C5RV.LIZLLL(c5rv)) {
            return invoke.LLFZ(i);
        }
        if (C5RV.LIZIZ(c5rv)) {
            return i;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("apply time effect: ");
        LIZ.append(c5rv);
        LIZ.append(" is not supported yet.");
        throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
    }

    public final int LIZLLL(C5RV c5rv, int i) {
        InterfaceC153045zY invoke = this.LIZ.invoke();
        if (C5RV.LJ(c5rv)) {
            return i;
        }
        if (C5RV.LIZJ(c5rv) || C5RV.LIZLLL(c5rv)) {
            return invoke.LLJJI(i);
        }
        if (C5RV.LIZIZ(c5rv)) {
            return i;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("apply time effect: ");
        LIZ.append(c5rv);
        LIZ.append(" is not supported yet.");
        throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
    }
}
