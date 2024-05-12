package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9m8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246649m8 implements InterfaceC87283bg {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C246649m8)) {
            return false;
        }
        C246649m8 c246649m8 = (C246649m8) obj;
        return this.LJLIL == c246649m8.LJLIL && o.LJ(this.LJLILLLLZI, c246649m8.LJLILLLLZI) && o.LJ(this.LJLJI, c246649m8.LJLJI) && o.LJ(this.LJLJJI, c246649m8.LJLJJI) && o.LJ(this.LJLJJL, c246649m8.LJLJJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
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
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJI;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJL;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AigcProgressInitData(isLite=");
        LIZ.append(this.LJLIL);
        LIZ.append(", requestParam=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", styleParam=");
        LIZ.append(this.LJLJI);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", enterStatus=");
        return q.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public C246649m8(boolean z, String str, String str2, String str3, String str4) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
    }
}
