package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y54 {
    public final String LIZ;
    public final String LIZLLL;
    public final String LIZIZ = "homepage_now";
    public final String LIZJ = "show";
    public final String LJ = "close";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y54)) {
            return false;
        }
        Y54 y54 = (Y54) obj;
        return o.LJ(this.LIZ, y54.LIZ) && o.LJ(this.LIZIZ, y54.LIZIZ) && o.LJ(this.LIZJ, y54.LIZJ) && o.LJ(this.LIZLLL, y54.LIZLLL) && o.LJ(this.LJ, y54.LJ);
    }

    public final int hashCode() {
        return this.LJ.hashCode() + C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MobParams(eventName=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", actionTypeShow=");
        LIZ.append(this.LIZJ);
        LIZ.append(", actionTypeClick=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", actionTypeClose=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public Y54(String str, String str2) {
        this.LIZ = str;
        this.LIZLLL = str2;
    }
}
