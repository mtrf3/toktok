package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4a6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111784a6 implements Comparable<C111784a6> {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final Long LJLJJLL;
    public boolean LJLJL = false;
    public final boolean LJLJLJ;

    public final int hashCode() {
        int i;
        int LIZ = C07250Qf.LIZ(this.LJLJJL, C07250Qf.LIZ(this.LJLJJI, (JBR.LIZJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31) + this.LJLJI) * 31, 31), 31);
        Long l = this.LJLJJLL;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        return LIZ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMReactionGroup(reaction=");
        LIZ.append(this.LJLIL);
        LIZ.append(", lastUpdateTime=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", reactionCount=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isSelf=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isAnimation=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", messageId=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", isReactionCountChange=");
        LIZ.append(this.LJLJL);
        LIZ.append(", isMsgFromSender=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C111784a6 c111784a6) {
        C111784a6 other = c111784a6;
        o.LJIIIZ(other, "other");
        boolean z = this.LJLJJI;
        if (z != other.LJLJJI) {
            if (!z) {
                return 1;
            }
            return -1;
        }
        return C66851QLn.LJI(this, other, new InterfaceC88472Yns[]{C111824aA.LJLIL, C111834aB.LJLIL});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C111784a6)) {
            return false;
        }
        C111784a6 c111784a6 = (C111784a6) obj;
        if (!o.LJ(this.LJLIL, c111784a6.LJLIL) || this.LJLJI != c111784a6.LJLJI || this.LJLJJI != c111784a6.LJLJJI || !o.LJ(this.LJLJJLL, c111784a6.LJLJJLL)) {
            return false;
        }
        return true;
    }

    public C111784a6(String str, long j, int i, boolean z, boolean z2, Long l, boolean z3) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = l;
        this.LJLJLJ = z3;
    }
}
