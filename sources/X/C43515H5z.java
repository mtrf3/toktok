package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H5z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43515H5z {
    public final boolean LIZ;
    public final Object LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43515H5z)) {
            return false;
        }
        C43515H5z c43515H5z = (C43515H5z) obj;
        return o.LJ(this.LIZIZ, c43515H5z.LIZIZ) && Float.compare(this.LIZJ, c43515H5z.LIZJ) == 0 && this.LIZLLL == c43515H5z.LIZLLL;
    }

    public final int hashCode() {
        int i;
        Object obj = this.LIZIZ;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return C47959Irz.LIZIZ(this.LIZJ, i * 31, 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Progress(tag=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", progressRate=");
        LIZ.append(this.LIZJ);
        LIZ.append(", stageIndex=");
        return C08380Uo.LIZ(LIZ, this.LIZLLL, ")", LIZ);
    }

    public C43515H5z(float f, int i, Object tag) {
        boolean z;
        o.LJIIIZ(tag, "tag");
        this.LIZIZ = tag;
        this.LIZJ = f;
        this.LIZLLL = i;
        if (f >= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = z;
    }
}
