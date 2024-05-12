package X;

/* renamed from: X.W5n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81723W5n implements W6U {
    public final W6U LIZ;
    public final int LIZIZ;

    @Override // X.W6U
    public final String LIZ() {
        return null;
    }

    @Override // X.W6U
    public final int hashCode() {
        return (this.LIZ.hashCode() * 1013) + this.LIZIZ;
    }

    @Override // X.W6U
    public final String toString() {
        C81254Vuk LIZIZ = C81256Vum.LIZIZ(this);
        LIZIZ.LIZIZ(this.LIZ, "imageCacheKey");
        LIZIZ.LIZIZ(String.valueOf(this.LIZIZ), "frameIndex");
        return LIZIZ.toString();
    }

    @Override // X.W6U
    public final boolean LIZIZ(android.net.Uri uri) {
        return this.LIZ.LIZIZ(uri);
    }

    @Override // X.W6U
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C81723W5n)) {
            return false;
        }
        C81723W5n c81723W5n = (C81723W5n) obj;
        if (this.LIZIZ == c81723W5n.LIZIZ && this.LIZ.equals(c81723W5n.LIZ)) {
            return true;
        }
        return false;
    }

    public C81723W5n(W6U w6u, int i) {
        this.LIZ = w6u;
        this.LIZIZ = i;
    }
}
