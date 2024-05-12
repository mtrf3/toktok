package X;

import kotlin.jvm.internal.o;

/* renamed from: X.702, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass702 implements C33Q {
    public final String LJLIL;
    public final Throwable LJLILLLLZI;

    public AnonymousClass702() {
        this((String) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass702)) {
            return false;
        }
        AnonymousClass702 anonymousClass702 = (AnonymousClass702) obj;
        return o.LJ(this.LJLIL, anonymousClass702.LJLIL) && o.LJ(this.LJLILLLLZI, anonymousClass702.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        Throwable th = this.LJLILLLLZI;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RequestState(status=");
        LIZ.append(this.LJLIL);
        LIZ.append(", e=");
        return C169696lJ.LIZLLL(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public AnonymousClass702(String status, Throwable th) {
        o.LJIIIZ(status, "status");
        this.LJLIL = status;
        this.LJLILLLLZI = th;
    }

    public /* synthetic */ AnonymousClass702(String str, int i) {
        this((i & 1) != 0 ? "" : str, (Throwable) null);
    }
}
