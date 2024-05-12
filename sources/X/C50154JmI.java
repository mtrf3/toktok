package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal.SearchIntermediateAwemeInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.JmI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50154JmI implements InterfaceC50310Joo {
    public final SearchIntermediateAwemeInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50154JmI) && o.LJ(this.LIZ, ((C50154JmI) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchAddFeedAwemeAction(awemeInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C50154JmI(SearchIntermediateAwemeInfo awemeInfo) {
        o.LJIIIZ(awemeInfo, "awemeInfo");
        this.LIZ = awemeInfo;
    }
}
