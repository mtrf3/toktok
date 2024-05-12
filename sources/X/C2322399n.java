package X;

/* renamed from: X.99n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2322399n {
    public final int LIZ = 10;
    public final EnumC2322499o LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2322399n)) {
            return false;
        }
        C2322399n c2322399n = (C2322399n) obj;
        return this.LIZ == c2322399n.LIZ && this.LIZIZ == c2322399n.LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PriorityParameter(priority=");
        LIZ.append(this.LIZ);
        LIZ.append(", level=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C2322399n(EnumC2322499o enumC2322499o) {
        this.LIZIZ = enumC2322499o;
    }
}
