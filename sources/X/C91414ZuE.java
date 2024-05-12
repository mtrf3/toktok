package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.ZuE, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91414ZuE implements C33Q {
    public final int LJLIL;
    public final FollowStatus LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91414ZuE)) {
            return false;
        }
        C91414ZuE c91414ZuE = (C91414ZuE) obj;
        return this.LJLIL == c91414ZuE.LJLIL && o.LJ(this.LJLILLLLZI, c91414ZuE.LJLILLLLZI);
    }

    public final int hashCode() {
        int i = this.LJLIL * 31;
        FollowStatus followStatus = this.LJLILLLLZI;
        return i + (followStatus == null ? 0 : followStatus.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DspFollowState(action=");
        LIZ.append(this.LJLIL);
        LIZ.append(", followStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91414ZuE(int i, FollowStatus followStatus) {
        this.LJLIL = i;
        this.LJLILLLLZI = followStatus;
    }
}
