package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.7WO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7WO implements C33Q {
    public final User LJLIL;

    public C7WO() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7WO) && o.LJ(this.LJLIL, ((C7WO) obj).LJLIL);
    }

    public final int hashCode() {
        User user = this.LJLIL;
        if (user == null) {
            return 0;
        }
        return user.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteCardState(user=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C7WO(User user) {
        this.LJLIL = user;
    }
}
