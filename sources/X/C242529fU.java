package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9fU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242529fU implements C33Q {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    public C242529fU() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C242529fU)) {
            return false;
        }
        C242529fU c242529fU = (C242529fU) obj;
        return this.LJLIL == c242529fU.LJLIL && o.LJ(this.LJLILLLLZI, c242529fU.LJLILLLLZI) && o.LJ(this.LJLJI, c242529fU.LJLJI);
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
        int i = r0 * 31;
        String str = this.LJLILLLLZI;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StateControlMediaState(visible=");
        LIZ.append(this.LJLIL);
        LIZ.append(", text=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", url=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C242529fU(int i) {
        this(false, "", "");
    }

    public C242529fU(boolean z, String str, String str2) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
