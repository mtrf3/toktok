package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Tfs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75236Tfs implements C33Q {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75236Tfs)) {
            return false;
        }
        C75236Tfs c75236Tfs = (C75236Tfs) obj;
        return this.LJLIL == c75236Tfs.LJLIL && this.LJLILLLLZI == c75236Tfs.LJLILLLLZI && this.LJLJI == c75236Tfs.LJLJI && o.LJ(this.LJLJJI, c75236Tfs.LJLJJI) && o.LJ(this.LJLJJL, c75236Tfs.LJLJJL) && o.LJ(this.LJLJJLL, c75236Tfs.LJLJJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.LJLILLLLZI;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (((i + i2) * 31) + (this.LJLJI ? 1 : 0)) * 31;
        String str = this.LJLJJI;
        int hashCode = (i3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJJL;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJLL;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorSharedBg(anchorEntranceEnable=");
        LIZ.append(this.LJLIL);
        LIZ.append(", anchorEntranceRedDotEnable=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", enable=");
        LIZ.append(this.LJLJI);
        LIZ.append(", stickerId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", imageUrl=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", imageFilePath=");
        return q.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public C75236Tfs(boolean z, String str, String str2, boolean z2, String str3, boolean z3) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
    }

    public static C75236Tfs LIZ(C75236Tfs c75236Tfs, boolean z, boolean z2, String str, String str2, String str3, int i) {
        boolean z3;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        boolean z4 = z;
        boolean z5 = z2;
        if ((i & 1) != 0) {
            z4 = c75236Tfs.LJLIL;
        }
        if ((i & 2) != 0) {
            z3 = c75236Tfs.LJLILLLLZI;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z5 = c75236Tfs.LJLJI;
        }
        if ((i & 8) != 0) {
            str6 = c75236Tfs.LJLJJI;
        }
        if ((i & 16) != 0) {
            str5 = c75236Tfs.LJLJJL;
        }
        if ((i & 32) != 0) {
            str4 = c75236Tfs.LJLJJLL;
        }
        c75236Tfs.getClass();
        return new C75236Tfs(z4, str6, str5, z3, str4, z5);
    }
}
