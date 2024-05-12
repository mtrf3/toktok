package X;

/* renamed from: X.1Cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29261Cw extends C0CS {
    public final C0CY LIZ;

    public C29261Cw() {
        this(C0CY.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode() + (C29261Cw.class.getName().hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Success {mOutputData=");
        LIZ.append(this.LIZ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C29261Cw(C0CY c0cy) {
        this.LIZ = c0cy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C29261Cw.class != obj.getClass()) {
            return false;
        }
        return this.LIZ.equals(((C29261Cw) obj).LIZ);
    }
}
