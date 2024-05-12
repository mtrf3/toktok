package X;

import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sa5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72329Sa5 implements InterfaceC57784Mm4 {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C72329Sa5) && o.LJ(this.LJLIL, ((C72329Sa5) obj).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrackItem(onViewAttach=");
        return C06540Nm.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C72329Sa5(AqS162S0100000_12 aqS162S0100000_12) {
        this.LJLIL = aqS162S0100000_12;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
