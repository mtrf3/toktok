package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.FjJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39777FjJ {
    public final InterfaceC39779FjL LIZ;
    public boolean LIZIZ = false;
    public boolean LIZJ = false;
    public int LIZLLL = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39777FjJ)) {
            return false;
        }
        C39777FjJ c39777FjJ = (C39777FjJ) obj;
        return o.LJ(this.LIZ, c39777FjJ.LIZ) && this.LIZIZ == c39777FjJ.LIZIZ && this.LIZJ == c39777FjJ.LIZJ && this.LIZLLL == c39777FjJ.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + (this.LIZJ ? 1 : 0)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TaskWrapper(task=");
        LIZ.append(this.LIZ);
        LIZ.append(", isAsyncFinished=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", hasAsyncStarted=");
        LIZ.append(this.LIZJ);
        LIZ.append(", numExecuted=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C39777FjJ(InterfaceC39779FjL interfaceC39779FjL) {
        this.LIZ = interfaceC39779FjL;
    }
}
