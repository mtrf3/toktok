package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7kd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194757kd {
    public final long LIZ;
    public final Aweme LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C194757kd)) {
            return false;
        }
        C194757kd c194757kd = (C194757kd) obj;
        return this.LIZ == c194757kd.LIZ && o.LJ(this.LIZIZ, c194757kd.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (C16880lQ.LLJIJIL(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Bean(createdTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", aweme=");
        return C770830u.LIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C194757kd(long j, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LIZ = j;
        this.LIZIZ = aweme;
    }
}
