package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7dQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190287dQ implements C33Q {
    public final Aweme LJLIL;

    public C190287dQ() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C190287dQ) && o.LJ(this.LJLIL, ((C190287dQ) obj).LJLIL);
    }

    public final int hashCode() {
        Aweme aweme = this.LJLIL;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiCollectBottomBarState(aweme=");
        return C770830u.LIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C190287dQ(Aweme aweme) {
        this.LJLIL = aweme;
    }
}
