package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7gG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192047gG implements InterfaceC87283bg {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;

    public C192047gG() {
        this(false, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C192047gG)) {
            return false;
        }
        C192047gG c192047gG = (C192047gG) obj;
        return this.LJLIL == c192047gG.LJLIL && this.LJLILLLLZI == c192047gG.LJLILLLLZI && o.LJ(this.LJLJI, c192047gG.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.LJLILLLLZI ? 1 : 0)) * 31;
        String str = this.LJLJI;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(hasMoreCollection=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isOwnerOfCollection=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C192047gG(boolean z, boolean z2, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = str;
    }
}
