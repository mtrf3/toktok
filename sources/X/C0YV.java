package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0YV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YV {
    public float LIZ;
    public boolean LIZIZ;
    public AbstractC09380Yk LIZJ;

    public C0YV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YV)) {
            return false;
        }
        C0YV c0yv = (C0YV) obj;
        return o.LJ(Float.valueOf(this.LIZ), Float.valueOf(c0yv.LIZ)) && this.LIZIZ == c0yv.LIZIZ && o.LJ(this.LIZJ, c0yv.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RowColumnParentData(weight=");
        LIZ.append(this.LIZ);
        LIZ.append(", fill=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", crossAxisAlignment=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.LIZ) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (floatToIntBits + i) * 31;
        AbstractC09380Yk abstractC09380Yk = this.LIZJ;
        if (abstractC09380Yk == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC09380Yk.hashCode();
        }
        return i2 + hashCode;
    }

    public C0YV(int i) {
        this.LIZ = 0.0f;
        this.LIZIZ = true;
        this.LIZJ = null;
    }
}
