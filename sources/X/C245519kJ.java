package X;

/* renamed from: X.9kJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245519kJ implements W6U {
    public final String LIZ;

    @Override // X.W6U
    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    @Override // X.W6U
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.W6U
    public final String toString() {
        return this.LIZ;
    }

    public C245519kJ(String str) {
        str.getClass();
        this.LIZ = str;
    }

    @Override // X.W6U
    public final boolean LIZIZ(android.net.Uri uri) {
        return this.LIZ.contains(uri.toString());
    }

    @Override // X.W6U
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C245519kJ) {
            return this.LIZ.equals(((C245519kJ) obj).LIZ);
        }
        return false;
    }
}
