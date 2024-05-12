package X;

import java.util.UUID;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZ5 implements InterfaceC80653En {
    public final InterfaceC65784Pro<C49825Jgz> LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JZ5) && o.LJ(this.LJLIL, ((JZ5) obj).LJLIL);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchTopMixModelSource(searchTopMixModel=");
        return C06540Nm.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public JZ5(AqS158S0100000_8 aqS158S0100000_8) {
        this.LJLIL = aqS158S0100000_8;
        o.LJIIIIZZ(UUID.randomUUID().toString(), "randomUUID().toString()");
    }
}
