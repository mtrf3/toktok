package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SI6 {
    public final String LIZ;
    public final String LIZIZ;
    public final android.net.Uri LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SI6)) {
            return false;
        }
        SI6 si6 = (SI6) obj;
        return o.LJ(this.LIZ, si6.LIZ) && o.LJ(this.LIZIZ, si6.LIZIZ) && o.LJ(this.LIZJ, si6.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarItem(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", url=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", imageUri=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        android.net.Uri uri = this.LIZJ;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return LJ + hashCode;
    }

    public SI6(String id, String url) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(url, "url");
        this.LIZ = id;
        this.LIZIZ = url;
        this.LIZJ = null;
    }
}
