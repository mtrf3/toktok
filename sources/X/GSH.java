package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GSH {
    public final Class<?> LIZ;
    public final Class<?> LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GSH)) {
            return false;
        }
        GSH gsh = (GSH) obj;
        return o.LJ(this.LIZ, gsh.LIZ) && o.LJ(this.LIZIZ, gsh.LIZIZ) && this.LIZJ == gsh.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Key(handleClass=");
        LIZ.append(this.LIZ);
        LIZ.append(", annotationClass=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mustAnnotate=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public GSH(Class<?> cls, Class<?> cls2, boolean z) {
        this.LIZ = cls;
        this.LIZIZ = cls2;
        this.LIZJ = z;
    }
}
