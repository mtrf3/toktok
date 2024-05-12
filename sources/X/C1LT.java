package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1LT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LT extends AbstractC07660Ru {
    public final long LIZ;
    public final List<C279917z> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1LT)) {
            return false;
        }
        C1LT c1lt = (C1LT) obj;
        return this.LIZ == c1lt.LIZ && o.LJ(this.LIZIZ, c1lt.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (C16880lQ.LLJIJIL(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateSongList(tabId=");
        LIZ.append(this.LIZ);
        LIZ.append(", songList=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C1LT(long j, List<C279917z> songList) {
        o.LJIIIZ(songList, "songList");
        this.LIZ = j;
        this.LIZIZ = songList;
    }
}
