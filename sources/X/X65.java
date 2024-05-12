package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X65 {
    public final HashMap<String, String> LIZ;
    public final boolean LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        HashMap<String, String> hashMap = this.LIZ;
        if (hashMap == null) {
            hashCode = 0;
        } else {
            hashCode = hashMap.hashCode();
        }
        int i = hashCode * 31;
        boolean z = this.LIZIZ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerData(stickerTranslation=");
        LIZ.append(this.LIZ);
        LIZ.append(", translated=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X65)) {
            return false;
        }
        X65 x65 = (X65) obj;
        if (o.LJ(this.LIZ, x65.LIZ) && this.LIZIZ == x65.LIZIZ) {
            return true;
        }
        return false;
    }

    public X65(HashMap<String, String> hashMap, boolean z) {
        this.LIZ = hashMap;
        this.LIZIZ = z;
    }
}
