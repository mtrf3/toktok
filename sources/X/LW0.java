package X;

import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LW0 {
    public final String LIZ;
    public final FriendsFeedResponse LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LW0)) {
            return false;
        }
        LW0 lw0 = (LW0) obj;
        return o.LJ(this.LIZ, lw0.LIZ) && o.LJ(this.LIZIZ, lw0.LIZIZ) && this.LIZJ == lw0.LIZJ;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        FriendsFeedResponse friendsFeedResponse = this.LIZIZ;
        return C16880lQ.LLJIJIL(this.LIZJ) + ((hashCode + (friendsFeedResponse == null ? 0 : friendsFeedResponse.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FriendsFeeRespEntity(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", resp=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", createdTimeMillis=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public LW0(String uid, FriendsFeedResponse friendsFeedResponse, long j) {
        o.LJIIIZ(uid, "uid");
        this.LIZ = uid;
        this.LIZIZ = friendsFeedResponse;
        this.LIZJ = j;
    }
}
