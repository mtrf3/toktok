package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MBK implements InterfaceC87283bg {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final M89 LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MBK)) {
            return false;
        }
        MBK mbk = (MBK) obj;
        return this.LJLIL == mbk.LJLIL && o.LJ(this.LJLILLLLZI, mbk.LJLILLLLZI) && o.LJ(this.LJLJI, mbk.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LJLILLLLZI;
        return this.LJLJI.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InitFeedParam(autoShowBillboard=");
        LIZ.append(this.LJLIL);
        LIZ.append(", entrance=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", param=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public MBK(M89 param, String str, boolean z) {
        o.LJIIIZ(param, "param");
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = param;
    }
}
