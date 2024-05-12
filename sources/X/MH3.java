package X;

import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MH3 {
    public final ChallengeDetail LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MH3)) {
            return false;
        }
        MH3 mh3 = (MH3) obj;
        return o.LJ(this.LIZ, mh3.LIZ) && this.LIZIZ == mh3.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChallengeDetailNode(challengeDetail=");
        LIZ.append(this.LIZ);
        LIZ.append(", timestamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public MH3(ChallengeDetail challengeDetail, long j) {
        this.LIZ = challengeDetail;
        this.LIZIZ = j;
    }
}
