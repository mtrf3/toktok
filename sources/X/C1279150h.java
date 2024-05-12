package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.50h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1279150h {
    public final int LIZ;
    public final List<C1280750x> LIZIZ;

    public C1279150h() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1279150h)) {
            return false;
        }
        C1279150h c1279150h = (C1279150h) obj;
        return this.LIZ == c1279150h.LIZ && o.LJ(this.LIZIZ, c1279150h.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        List<C1280750x> list = this.LIZIZ;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DropTrackState(num=");
        LIZ.append(this.LIZ);
        LIZ.append(", tracks=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C1279150h(int i) {
        this(0, null);
    }

    public C1279150h(int i, List<C1280750x> list) {
        this.LIZ = i;
        this.LIZIZ = list;
    }
}
