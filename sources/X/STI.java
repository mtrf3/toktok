package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class STI implements C33Q {
    public final ST9 LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final Integer LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof STI)) {
            return false;
        }
        STI sti = (STI) obj;
        return this.LJLIL == sti.LJLIL && this.LJLILLLLZI == sti.LJLILLLLZI && this.LJLJI == sti.LJLJI && o.LJ(this.LJLJJI, sti.LJLJJI) && o.LJ(this.LJLJJL, sti.LJLJJL);
    }

    public final int hashCode() {
        int hashCode = ((((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31) + this.LJLJI) * 31;
        String str = this.LJLJJI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LJLJJL;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AigcProgressPageState(avatarStatus=");
        LIZ.append(this.LJLIL);
        LIZ.append(", percentage=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", statusCode=");
        LIZ.append(this.LJLJI);
        LIZ.append(", errorShowMsg=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", waitingTime=");
        return s0.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public /* synthetic */ STI(ST9 st9) {
        this(st9, 0, 0, null, null);
    }

    public STI(ST9 avatarStatus, int i, int i2, String str, Integer num) {
        o.LJIIIZ(avatarStatus, "avatarStatus");
        this.LJLIL = avatarStatus;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = str;
        this.LJLJJL = num;
    }
}
