package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KAC {
    public final C50948Jz6 LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KAC)) {
            return false;
        }
        KAC kac = (KAC) obj;
        return o.LJ(this.LIZ, kac.LIZ) && this.LIZIZ == kac.LIZIZ && this.LIZJ == kac.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C50948Jz6 c50948Jz6 = this.LIZ;
        int hashCode = (c50948Jz6 == null ? 0 : c50948Jz6.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + (this.LIZJ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcSugImmutableData(enterParam=");
        LIZ.append(this.LIZ);
        LIZ.append(", enableLogSample=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isAdapterCommon=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public KAC(C50948Jz6 c50948Jz6, boolean z) {
        boolean LIZJ = FMX.LIZJ("ttk_sug_success_rate");
        this.LIZ = c50948Jz6;
        this.LIZIZ = LIZJ;
        this.LIZJ = z;
    }
}
