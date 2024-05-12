package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.SVu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72214SVu implements InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final MIL LJLJJI;
    public final long[] LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72214SVu)) {
            return false;
        }
        C72214SVu c72214SVu = (C72214SVu) obj;
        return o.LJ(this.LJLIL, c72214SVu.LJLIL) && o.LJ(this.LJLILLLLZI, c72214SVu.LJLILLLLZI) && o.LJ(this.LJLJI, c72214SVu.LJLJI) && this.LJLJJI == c72214SVu.LJLJJI && o.LJ(this.LJLJJL, c72214SVu.LJLJJL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QnaProfileDetail(enterFrom=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", authorId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", qnaProfileMode=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", questionIds=");
        LIZ.append(Arrays.toString(this.LJLJJL));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LIZ() {
        if (this.LJLJJI == MIL.FYP_BANNER) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31);
        MIL mil = this.LJLJJI;
        int i = 0;
        if (mil == null) {
            hashCode = 0;
        } else {
            hashCode = mil.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        long[] jArr = this.LJLJJL;
        if (jArr != null) {
            i = Arrays.hashCode(jArr);
        }
        return i2 + i;
    }

    public C72214SVu(String str, String str2, String str3, MIL mil, long[] jArr) {
        HH1.LIZ(str, "enterFrom", str2, "enterMethod", str3, "authorId");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = mil;
        this.LJLJJL = jArr;
    }
}
