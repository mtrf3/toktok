package X;

/* renamed from: X.0VQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VQ {
    public final android.net.Uri LIZ;
    public final boolean LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + (this.LIZIZ ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0VQ.class != obj.getClass()) {
            return false;
        }
        C0VQ c0vq = (C0VQ) obj;
        if (this.LIZIZ == c0vq.LIZIZ && this.LIZ.equals(c0vq.LIZ)) {
            return true;
        }
        return false;
    }

    public C0VQ(boolean z, android.net.Uri uri) {
        this.LIZ = uri;
        this.LIZIZ = z;
    }
}
