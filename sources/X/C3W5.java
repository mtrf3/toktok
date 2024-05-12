package X;

import com.ss.android.ugc.aweme.challenge.model.Segment;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3W5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W5 {
    public final User LIZ;
    public final int LIZIZ;
    public final List<Segment> LIZJ;

    public C3W5() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3W5)) {
            return false;
        }
        C3W5 c3w5 = (C3W5) obj;
        return o.LJ(this.LIZ, c3w5.LIZ) && this.LIZIZ == c3w5.LIZIZ && o.LJ(this.LIZJ, c3w5.LIZJ);
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        List<Segment> list = this.LIZJ;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SessionShareFriendModel(user=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", segments=");
        return C1NE.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C3W5(User user) {
        this.LIZ = user;
        this.LIZIZ = 3;
        this.LIZJ = null;
    }
}
