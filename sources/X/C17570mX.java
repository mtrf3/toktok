package X;

/* renamed from: X.0mX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17570mX {
    public int LIZ;
    public boolean LIZIZ;

    public C17570mX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17570mX)) {
            return false;
        }
        C17570mX c17570mX = (C17570mX) obj;
        return this.LIZ == c17570mX.LIZ && this.LIZIZ == c17570mX.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        boolean z = this.LIZIZ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtractFloatResult(endPosition=");
        LIZ.append(this.LIZ);
        LIZ.append(", endWithNegativeOrDot=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C17570mX(int i) {
        this.LIZ = 0;
        this.LIZIZ = false;
    }
}
