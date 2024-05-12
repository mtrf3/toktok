package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Joa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50296Joa implements InterfaceC50315Jot {
    public final String LJLIL;
    public final Integer LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    public C50296Joa() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50296Joa)) {
            return false;
        }
        C50296Joa c50296Joa = (C50296Joa) obj;
        return o.LJ(this.LJLIL, c50296Joa.LJLIL) && o.LJ(this.LJLILLLLZI, c50296Joa.LJLILLLLZI) && o.LJ(this.LJLJI, c50296Joa.LJLJI) && o.LJ(this.LJLJJI, c50296Joa.LJLJJI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJI;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchCorrectWordState(newSugSessionID=");
        LIZ.append(this.LJLIL);
        LIZ.append(", correctWordType=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", correctWord=");
        LIZ.append(this.LJLJI);
        LIZ.append(", lastEnterMethod=");
        return q.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public C50296Joa(String str, Integer num, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = num;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }

    public static C50296Joa LIZ(C50296Joa c50296Joa, String str, Integer num, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = c50296Joa.LJLIL;
        }
        if ((i & 2) != 0) {
            num = c50296Joa.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str2 = c50296Joa.LJLJI;
        }
        if ((i & 8) != 0) {
            str3 = c50296Joa.LJLJJI;
        }
        c50296Joa.getClass();
        return new C50296Joa(str, num, str2, str3);
    }
}
