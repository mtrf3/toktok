package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73122tw {
    public final List<Long> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C73122tw) && o.LJ(this.LIZ, ((C73122tw) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RandomSeedsWrapper(randomSeeds=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C73122tw(List<Long> randomSeeds) {
        o.LJIIIZ(randomSeeds, "randomSeeds");
        this.LIZ = randomSeeds;
    }
}
