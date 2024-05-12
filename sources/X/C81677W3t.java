package X;

import kotlin.jvm.internal.o;

/* renamed from: X.W3t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81677W3t {
    public final String LIZ;
    public final C81678W3u LIZIZ;
    public final C81679W3v LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81677W3t)) {
            return false;
        }
        C81677W3t c81677W3t = (C81677W3t) obj;
        return o.LJ(this.LIZ, c81677W3t.LIZ) && o.LJ(this.LIZIZ, c81677W3t.LIZIZ) && o.LJ(this.LIZJ, c81677W3t.LIZJ) && this.LIZLLL == c81677W3t.LIZLLL;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        C81678W3u c81678W3u = this.LIZIZ;
        int hashCode2 = (hashCode + (c81678W3u == null ? 0 : c81678W3u.hashCode())) * 31;
        C81679W3v c81679W3v = this.LIZJ;
        return C16880lQ.LLJIJIL(this.LIZLLL) + ((hashCode2 + (c81679W3v != null ? c81679W3v.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowMediaCacheEntity(aid=");
        LIZ.append(this.LIZ);
        LIZ.append(", photoCache=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mixCache=");
        LIZ.append(this.LIZJ);
        LIZ.append(", createTimeInMills=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C81677W3t(String aid, C81678W3u c81678W3u, C81679W3v c81679W3v, long j) {
        o.LJIIIZ(aid, "aid");
        this.LIZ = aid;
        this.LIZIZ = c81678W3u;
        this.LIZJ = c81679W3v;
        this.LIZLLL = j;
    }

    public /* synthetic */ C81677W3t(String str, C81678W3u c81678W3u, C81679W3v c81679W3v, long j, int i) {
        this(str, (i & 2) != 0 ? null : c81678W3u, (i & 4) == 0 ? c81679W3v : null, (i & 8) != 0 ? 0L : j);
    }
}
