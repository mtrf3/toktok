package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0fX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13230fX {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public abstract float[] LIZ(float[] fArr);

    public abstract float LIZIZ(int i);

    public abstract float LIZJ(int i);

    public boolean LIZLLL() {
        return false;
    }

    public abstract float[] LJ(float[] fArr);

    public int hashCode() {
        return JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(" (id=");
        LIZ.append(this.LIZJ);
        LIZ.append(", model=");
        LIZ.append((Object) C13210fV.LIZIZ(this.LIZIZ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(C65352Pkq.LIZ(getClass()), C65352Pkq.LIZ(obj.getClass()))) {
            return false;
        }
        AbstractC13230fX abstractC13230fX = (AbstractC13230fX) obj;
        if (this.LIZJ != abstractC13230fX.LIZJ || !o.LJ(this.LIZ, abstractC13230fX.LIZ)) {
            return false;
        }
        return C13210fV.LIZ(this.LIZIZ, abstractC13230fX.LIZIZ);
    }

    public AbstractC13230fX(String str, long j, int i) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i >= -1 && i <= 63) {
        } else {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
