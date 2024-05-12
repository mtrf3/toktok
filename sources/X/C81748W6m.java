package X;

import java.util.List;

/* renamed from: X.W6m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81748W6m implements W6U {
    public final List<W6U> LIZ;

    @Override // X.W6U
    public final String LIZ() {
        return this.LIZ.get(0).LIZ();
    }

    @Override // X.W6U
    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    @Override // X.W6U
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiCacheKey:");
        LIZ.append(this.LIZ.toString());
        return X1D.LIZIZ(LIZ);
    }

    public C81748W6m(List<W6U> list) {
        this.LIZ = list;
    }

    @Override // X.W6U
    public final boolean LIZIZ(android.net.Uri uri) {
        for (int i = 0; i < this.LIZ.size(); i++) {
            if (this.LIZ.get(i).LIZIZ(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.W6U
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81748W6m) {
            return this.LIZ.equals(((C81748W6m) obj).LIZ);
        }
        return false;
    }
}
