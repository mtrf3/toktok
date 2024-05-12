package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Jd6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49584Jd6 implements KK7 {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final Integer LJLJJI;
    public final Boolean LJLJJL;
    public final String LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49584Jd6)) {
            return false;
        }
        C49584Jd6 c49584Jd6 = (C49584Jd6) obj;
        return o.LJ(this.LJLIL, c49584Jd6.LJLIL) && this.LJLILLLLZI == c49584Jd6.LJLILLLLZI && o.LJ(this.LJLJI, c49584Jd6.LJLJI) && o.LJ(this.LJLJJI, c49584Jd6.LJLJJI) && o.LJ(this.LJLJJL, c49584Jd6.LJLJJL) && o.LJ(this.LJLJJLL, c49584Jd6.LJLJJLL);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LJLILLLLZI) * 31;
        String str2 = this.LJLJI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LJLJJI;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LJLJJL;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.LJLJJLL;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    public C49584Jd6() {
        this("", 0, "", -1, Boolean.FALSE, "");
    }

    static {
        C17N.LJJJJLI().ut0().LIZIZ(C65352Pkq.LIZ(C49584Jd6.class), C49585Jd7.LJLIL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateSearchItemAction(implId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", originType=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLJI);
        LIZ.append(", rankInList=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isInMixSearch=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", docId=");
        return q.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public C49584Jd6(String str, int i, String str2, Integer num, Boolean bool, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = str2;
        this.LJLJJI = num;
        this.LJLJJL = bool;
        this.LJLJJLL = str3;
    }
}
