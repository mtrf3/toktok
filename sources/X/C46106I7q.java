package X;

import kotlin.jvm.internal.o;

/* renamed from: X.I7q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46106I7q {
    public final String LIZ;
    public final C211668Sk LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46106I7q)) {
            return false;
        }
        C46106I7q c46106I7q = (C46106I7q) obj;
        return o.LJ(this.LIZ, c46106I7q.LIZ) && o.LJ(this.LIZIZ, c46106I7q.LIZIZ) && this.LIZJ == c46106I7q.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        C211668Sk c211668Sk = this.LIZIZ;
        int hashCode2 = (hashCode + (c211668Sk == null ? 0 : c211668Sk.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContainerInteractionModel(componentName=");
        LIZ.append(this.LIZ);
        LIZ.append(", animationModels=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isShow=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C46106I7q(String str, C211668Sk c211668Sk, boolean z) {
        this.LIZ = str;
        this.LIZIZ = c211668Sk;
        this.LIZJ = z;
    }
}
