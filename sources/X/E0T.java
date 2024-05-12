package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E0T implements InterfaceC35522Dws {
    public final String LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0T)) {
            return false;
        }
        E0T e0t = (E0T) obj;
        return o.LJ(this.LIZ, e0t.LIZ) && Float.compare(this.LIZIZ, e0t.LIZIZ) == 0;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.LIZ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Float.floatToIntBits(this.LIZIZ) + (hashCode * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DownloadingState(url=");
        LIZ.append(this.LIZ);
        LIZ.append(", progress=");
        return C74221TAz.LIZLLL(LIZ, this.LIZIZ, ')', LIZ);
    }

    public E0T(String str, float f) {
        this.LIZ = str;
        this.LIZIZ = f;
    }
}
