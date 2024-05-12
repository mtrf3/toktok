package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8Mk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210108Mk implements C2K7 {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C210108Mk)) {
            return false;
        }
        C210108Mk c210108Mk = (C210108Mk) obj;
        return o.LJ(this.LJLIL, c210108Mk.LJLIL) && this.LJLILLLLZI == c210108Mk.LJLILLLLZI && this.LJLJI == c210108Mk.LJLJI;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.LJLIL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJLJI) + JBR.LIZJ(this.LJLILLLLZI, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryPlayProgressParam(sourceId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", position=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", duration=");
        return C47135Ieh.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C210108Mk(String str, long j, long j2) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }
}
