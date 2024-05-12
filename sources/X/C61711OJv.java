package X;

/* renamed from: X.OJv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61711OJv extends AbstractC61710OJu {
    public final long LIZ;

    public final int hashCode() {
        long j = this.LIZ;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogResponse{nextRequestWaitMillis=");
        return C0H1.LIZJ(LIZ, this.LIZ, "}", LIZ);
    }

    @Override // X.AbstractC61710OJu
    public final long LIZIZ() {
        return this.LIZ;
    }

    public C61711OJv(long j) {
        this.LIZ = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC61710OJu) && this.LIZ == ((AbstractC61710OJu) obj).LIZIZ()) {
            return true;
        }
        return false;
    }
}
