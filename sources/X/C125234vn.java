package X;

/* renamed from: X.4vn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125234vn {
    public final boolean LIZ;
    public final EnumC125274vr LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125234vn)) {
            return false;
        }
        C125234vn c125234vn = (C125234vn) obj;
        return this.LIZ == c125234vn.LIZ && this.LIZIZ == c125234vn.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        EnumC125274vr enumC125274vr = this.LIZIZ;
        return i + (enumC125274vr == null ? 0 : enumC125274vr.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MagicResponse(isSuccess=");
        LIZ.append(this.LIZ);
        LIZ.append(", magicErrorCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C125234vn(boolean z, EnumC125274vr enumC125274vr) {
        this.LIZ = z;
        this.LIZIZ = enumC125274vr;
    }
}
