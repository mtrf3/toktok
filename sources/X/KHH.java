package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KHH {
    public TypedByteArray LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    public KHH() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KHH)) {
            return false;
        }
        KHH khh = (KHH) obj;
        return o.LJ(this.LIZ, khh.LIZ) && o.LJ(this.LIZIZ, khh.LIZIZ) && o.LJ(this.LIZJ, khh.LIZJ) && o.LJ(this.LIZLLL, khh.LIZLLL);
    }

    public final int hashCode() {
        TypedByteArray typedByteArray = this.LIZ;
        int hashCode = (typedByteArray == null ? 0 : typedByteArray.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoSearchImageRequest(image=");
        LIZ.append(this.LIZ);
        LIZ.append(", imageTosUri=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", detection=");
        LIZ.append(this.LIZJ);
        LIZ.append(", detectionIdx=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public KHH(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }
}
