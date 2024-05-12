package X;

/* loaded from: classes15.dex */
public class VIE implements W6U {
    public final String LIZ;

    @Override // X.W6U
    public final int hashCode() {
        String str = this.LIZ;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // X.W6U
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.W6U
    public final String toString() {
        return this.LIZ;
    }

    public VIE(int i) {
        this.LIZ = KMP.LJ("anim://", i);
    }

    @Override // X.W6U
    public final boolean LIZIZ(android.net.Uri uri) {
        return uri.toString().startsWith(this.LIZ);
    }

    @Override // X.W6U
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VIE.class != obj.getClass()) {
            return false;
        }
        String str = this.LIZ;
        String str2 = ((VIE) obj).LIZ;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }
}
