package X;

import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1L4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1L4 extends AbstractC07660Ru {
    public final long LIZ;
    public final List<C14H> LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1L4)) {
            return false;
        }
        C1L4 c1l4 = (C1L4) obj;
        return this.LIZ == c1l4.LIZ && o.LJ(this.LIZIZ, c1l4.LIZIZ) && this.LIZJ == c1l4.LIZJ;
    }

    public final int hashCode() {
        return AnonymousClass391.LIZIZ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchLyric(songId=");
        LIZ.append(this.LIZ);
        LIZ.append(", lyricLines=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", lyricsType=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C1L4(long j, List<C14H> lyricLines, int i) {
        o.LJIIIZ(lyricLines, "lyricLines");
        this.LIZ = j;
        this.LIZIZ = lyricLines;
        this.LIZJ = i;
    }
}
