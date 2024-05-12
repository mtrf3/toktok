package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.795, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass795 {
    public final String LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;

    public AnonymousClass795() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass795)) {
            return false;
        }
        AnonymousClass795 anonymousClass795 = (AnonymousClass795) obj;
        return o.LJ(this.LIZ, anonymousClass795.LIZ) && o.LJ(this.LIZIZ, anonymousClass795.LIZIZ) && o.LJ(this.LIZJ, anonymousClass795.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Aweme aweme = this.LIZIZ;
        return this.LIZJ.hashCode() + ((hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LikeParams(aid=");
        LIZ.append(this.LIZ);
        LIZ.append(", aweme=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ AnonymousClass795(int i) {
        this("", null, "");
    }

    public AnonymousClass795(String aid, Aweme aweme, String enterFrom) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = aid;
        this.LIZIZ = aweme;
        this.LIZJ = enterFrom;
    }
}
