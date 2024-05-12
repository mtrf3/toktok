package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Tfr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75235Tfr implements C33Q {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public String LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75235Tfr)) {
            return false;
        }
        C75235Tfr c75235Tfr = (C75235Tfr) obj;
        return this.LJLIL == c75235Tfr.LJLIL && o.LJ(this.LJLILLLLZI, c75235Tfr.LJLILLLLZI) && o.LJ(this.LJLJI, c75235Tfr.LJLJI) && o.LJ(this.LJLJJI, c75235Tfr.LJLJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
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
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GuestSharedBg(enable=");
        LIZ.append(this.LJLIL);
        LIZ.append(", stickerId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", imageUrl=");
        LIZ.append(this.LJLJI);
        LIZ.append(", imageFilePath=");
        return q.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public C75235Tfr(boolean z, String str, String str2, String str3) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }
}
