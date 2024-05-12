package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89313ex implements C33Q {
    public final String LJLIL;
    public final boolean LJLILLLLZI;

    public C89313ex() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89313ex)) {
            return false;
        }
        C89313ex c89313ex = (C89313ex) obj;
        return o.LJ(this.LJLIL, c89313ex.LJLIL) && this.LJLILLLLZI == c89313ex.LJLILLLLZI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChatBusinessAccountState(baUid=");
        LIZ.append(this.LJLIL);
        LIZ.append(", triggeredGetStarted=");
        return C48339Iy7.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ C89313ex(int i) {
        this(null, false);
    }

    public C89313ex(String str, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
    }
}
