package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AU9 implements L4O {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AU9)) {
            return false;
        }
        AU9 au9 = (AU9) obj;
        return this.LJLIL == au9.LJLIL && this.LJLILLLLZI == au9.LJLILLLLZI && o.LJ(this.LJLJI, au9.LJLJI);
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

    @Override // X.L4O
    public final String getString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C65352Pkq.LIZ(AU9.class).LJFF());
        LIZ.append(this.LJLIL);
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarProfileState(hasBadge=");
        LIZ.append(this.LJLIL);
        LIZ.append(", hasOverlay=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", frameUrl=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public AU9(boolean z, boolean z2, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = str;
    }
}
