package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.7BQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7BQ implements InterfaceC57784Mm4 {
    public final User LJLIL;
    public final C7BP LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7BQ)) {
            return false;
        }
        C7BQ c7bq = (C7BQ) obj;
        return o.LJ(this.LJLIL, c7bq.LJLIL) && o.LJ(this.LJLILLLLZI, c7bq.LJLILLLLZI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        C7BP c7bp = this.LJLILLLLZI;
        return hashCode + (c7bp == null ? 0 : c7bp.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedTaggedListItem(user=");
        LIZ.append(this.LJLIL);
        LIZ.append(", param=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C7BQ(User user, C7BP c7bp) {
        o.LJIIIZ(user, "user");
        this.LJLIL = user;
        this.LJLILLLLZI = c7bp;
    }
}
