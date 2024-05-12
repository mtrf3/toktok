package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y6Z {
    public final List<C86832Y6a> LIZ;
    public final List<C86832Y6a> LIZIZ;
    public final List<C86832Y6a> LIZJ;
    public final List<C86832Y6a> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y6Z)) {
            return false;
        }
        Y6Z y6z = (Y6Z) obj;
        return o.LJ(this.LIZ, y6z.LIZ) && o.LJ(this.LIZIZ, y6z.LIZIZ) && o.LJ(this.LIZJ, y6z.LIZJ) && o.LJ(this.LIZLLL, y6z.LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode() + AnonymousClass391.LIZIZ(this.LIZJ, AnonymousClass391.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Publishes(events=");
        LIZ.append(this.LIZ);
        LIZ.append(", checkFailed=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", clickPublish=");
        LIZ.append(this.LIZJ);
        LIZ.append(", unClickPublish=");
        return C1NE.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public Y6Z(List<C86832Y6a> events, List<C86832Y6a> checkFailed, List<C86832Y6a> list, List<C86832Y6a> list2) {
        o.LJIIIZ(events, "events");
        o.LJIIIZ(checkFailed, "checkFailed");
        this.LIZ = events;
        this.LIZIZ = checkFailed;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }
}
