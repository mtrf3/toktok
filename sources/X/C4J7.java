package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.4J7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4J7 {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4J7)) {
            return false;
        }
        C4J7 c4j7 = (C4J7) obj;
        return o.LJ(this.LIZ, c4j7.LIZ) && o.LJ(this.LIZIZ, c4j7.LIZIZ) && this.LIZJ == c4j7.LIZJ;
    }

    public final int hashCode() {
        int hashCode;
        Aweme aweme = this.LIZ;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LIZJ) + C79062V1e.LJ(this.LIZIZ, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMAweme(aweme=");
        LIZ.append(this.LIZ);
        LIZ.append(", aid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", index=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C4J7(Aweme aweme, long j, String aid) {
        o.LJIIIZ(aid, "aid");
        this.LIZ = aweme;
        this.LIZIZ = aid;
        this.LIZJ = j;
    }
}
