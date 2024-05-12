package X;

/* renamed from: X.1Cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29241Cu extends C0CS {
    public final C0CY LIZ = C0CY.LIZIZ;

    public final int hashCode() {
        return this.LIZ.hashCode() + (C29241Cu.class.getName().hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Failure {mOutputData=");
        LIZ.append(this.LIZ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C29241Cu.class != obj.getClass()) {
            return false;
        }
        return this.LIZ.equals(((C29241Cu) obj).LIZ);
    }
}
