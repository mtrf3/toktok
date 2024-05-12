package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ION {
    public final long LIZ;
    public final String LIZIZ;
    public AwemeRawAd LIZJ;
    public long LIZLLL;
    public int LJ;

    public ION() {
        this(0L, (String) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ION)) {
            return false;
        }
        ION ion = (ION) obj;
        return this.LIZ == ion.LIZ && o.LJ(this.LIZIZ, ion.LIZIZ) && o.LJ(this.LIZJ, ion.LIZJ);
    }

    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        String str = this.LIZIZ;
        int hashCode = (LLJIJIL + (str == null ? 0 : str.hashCode())) * 31;
        AwemeRawAd awemeRawAd = this.LIZJ;
        return hashCode + (awemeRawAd != null ? awemeRawAd.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreloadDownloadMsg(creativeId=");
        LIZ.append(this.LIZ);
        LIZ.append(", logExtra=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", rawAd=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ ION(long j, String str, int i) {
        this((i & 2) != 0 ? "" : str, (i & 1) != 0 ? 0L : j, (AwemeRawAd) null);
    }

    public ION(String str, long j, AwemeRawAd awemeRawAd) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = awemeRawAd;
        this.LJ = -1;
    }
}
