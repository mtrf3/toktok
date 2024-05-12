package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MW7 {
    public Aweme LIZ;
    public long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MW7)) {
            return false;
        }
        MW7 mw7 = (MW7) obj;
        return o.LJ(this.LIZ, mw7.LIZ) && this.LIZIZ == mw7.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CacheInfo(data=");
        LIZ.append(this.LIZ);
        LIZ.append(", updateTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public MW7(long j, Aweme aweme) {
        this.LIZ = aweme;
        this.LIZIZ = j;
    }
}
