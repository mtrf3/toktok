package X;

import android.graphics.Point;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JEJ {
    public final JE0 LIZ;
    public final Point LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JEJ)) {
            return false;
        }
        JEJ jej = (JEJ) obj;
        return this.LIZ == jej.LIZ && o.LJ(this.LIZIZ, jej.LIZIZ) && this.LIZJ == jej.LIZJ && Float.compare(this.LIZLLL, jej.LIZLLL) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Float.floatToIntBits(this.LIZLLL) + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RememberableWindowState(windowMode=");
        LIZ.append(this.LIZ);
        LIZ.append(", position=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", adhereToLeft=");
        LIZ.append(this.LIZJ);
        LIZ.append(", relativePositionY=");
        return C74221TAz.LIZLLL(LIZ, this.LIZLLL, ')', LIZ);
    }

    public JEJ(JE0 windowMode, Point position, boolean z, float f) {
        o.LJIIIZ(windowMode, "windowMode");
        o.LJIIIZ(position, "position");
        this.LIZ = windowMode;
        this.LIZIZ = position;
        this.LIZJ = z;
        this.LIZLLL = f;
    }
}
