package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7to, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200447to implements InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final InterfaceC65784Pro<Long> LJLJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C200447to() {
        /*
            r8 = this;
            r1 = 0
            r7 = 127(0x7f, float:1.78E-43)
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200447to.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C200447to)) {
            return false;
        }
        C200447to c200447to = (C200447to) obj;
        return o.LJ(this.LJLIL, c200447to.LJLIL) && o.LJ(this.LJLILLLLZI, c200447to.LJLILLLLZI) && o.LJ(this.LJLJI, c200447to.LJLJI) && o.LJ(this.LJLJJI, c200447to.LJLJJI) && o.LJ(this.LJLJJL, c200447to.LJLJJL) && o.LJ(this.LJLJJLL, c200447to.LJLJJLL) && o.LJ(this.LJLJL, c200447to.LJLJL);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        InterfaceC65784Pro<Long> interfaceC65784Pro = this.LJLJL;
        return hashCode6 + (interfaceC65784Pro != null ? interfaceC65784Pro.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoDiggHierarchyData(previousPage=");
        LIZ.append(this.LJLIL);
        LIZ.append(", fromGroupId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", previousPagePosition=");
        LIZ.append(this.LJLJI);
        LIZ.append(", creationId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", challengeId=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", parentTagId=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", infoProvider=");
        return C06540Nm.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    public /* synthetic */ C200447to(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (InterfaceC65784Pro<Long>) null);
    }

    public C200447to(String str, String str2, String str3, String str4, String str5, String str6, InterfaceC65784Pro<Long> interfaceC65784Pro) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
        this.LJLJL = interfaceC65784Pro;
    }
}
