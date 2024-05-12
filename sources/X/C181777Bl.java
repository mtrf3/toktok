package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7Bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C181777Bl implements C33Q {
    public final C50420Jqa LJLIL;
    public final AnonymousClass799 LJLILLLLZI;

    public C181777Bl() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C181777Bl)) {
            return false;
        }
        C181777Bl c181777Bl = (C181777Bl) obj;
        return o.LJ(this.LJLIL, c181777Bl.LJLIL) && o.LJ(this.LJLILLLLZI, c181777Bl.LJLILLLLZI);
    }

    public final int hashCode() {
        C50420Jqa c50420Jqa = this.LJLIL;
        int hashCode = (c50420Jqa == null ? 0 : c50420Jqa.hashCode()) * 31;
        AnonymousClass799 anonymousClass799 = this.LJLILLLLZI;
        return hashCode + (anonymousClass799 != null ? anonymousClass799.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowEventDispatchState(videoEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", syncLikeStateEvent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C181777Bl(C50420Jqa c50420Jqa, AnonymousClass799 anonymousClass799) {
        this.LJLIL = c50420Jqa;
        this.LJLILLLLZI = anonymousClass799;
    }
}
