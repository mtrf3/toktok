package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* renamed from: X.C6g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30782C6g {
    public final Long LIZ;
    public final User LIZIZ;

    public C30782C6g() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30782C6g)) {
            return false;
        }
        C30782C6g c30782C6g = (C30782C6g) obj;
        return o.LJ(this.LIZ, c30782C6g.LIZ) && o.LJ(this.LIZIZ, c30782C6g.LIZIZ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        User user = this.LIZIZ;
        return hashCode + (user != null ? user.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewSubscriberData(time=");
        LIZ.append(this.LIZ);
        LIZ.append(", subscriberInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C30782C6g(Long l, User user) {
        this.LIZ = l;
        this.LIZIZ = user;
    }
}
