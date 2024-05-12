package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7MW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7MW {
    public final Aweme LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7MW) && o.LJ(this.LIZ, ((C7MW) obj).LIZ);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimateItem(aweme=");
        return C770830u.LIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C7MW(Aweme aweme) {
        this.LIZ = aweme;
    }
}
