package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Jqn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50433Jqn implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final boolean LJLJLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50433Jqn() {
        /*
            r12 = this;
            r1 = 0
            r3 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r2 = r1
            r4 = r3
            r5 = r1
            r6 = r1
            r7 = r3
            r8 = r3
            r9 = r3
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50433Jqn.<init>():void");
    }

    public static /* synthetic */ C50433Jqn copy$default(C50433Jqn c50433Jqn, String str, String str2, boolean z, boolean z2, String str3, String str4, int i, int i2, boolean z3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = c50433Jqn.LJLIL;
        }
        if ((i3 & 2) != 0) {
            str2 = c50433Jqn.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            z = c50433Jqn.LJLJI;
        }
        if ((i3 & 8) != 0) {
            z2 = c50433Jqn.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            str3 = c50433Jqn.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            str4 = c50433Jqn.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            i = c50433Jqn.LJLJL;
        }
        if ((i3 & 128) != 0) {
            i2 = c50433Jqn.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            z3 = c50433Jqn.LJLJLLL;
        }
        return c50433Jqn.copy(str, str2, z, z2, str3, str4, i, i2, z3);
    }

    public final C50433Jqn copy(String str, String str2, boolean z, boolean z2, String str3, String str4, int i, int i2, boolean z3) {
        return new C50433Jqn(str, str2, z, z2, str3, str4, i, i2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50433Jqn)) {
            return false;
        }
        C50433Jqn c50433Jqn = (C50433Jqn) obj;
        return o.LJ(this.LJLIL, c50433Jqn.LJLIL) && o.LJ(this.LJLILLLLZI, c50433Jqn.LJLILLLLZI) && this.LJLJI == c50433Jqn.LJLJI && this.LJLJJI == c50433Jqn.LJLJJI && o.LJ(this.LJLJJL, c50433Jqn.LJLJJL) && o.LJ(this.LJLJJLL, c50433Jqn.LJLJJLL) && this.LJLJL == c50433Jqn.LJLJL && this.LJLJLJ == c50433Jqn.LJLJLJ && this.LJLJLLL == c50433Jqn.LJLJLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.LJLJJI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str3 = this.LJLJJL;
        int hashCode3 = (i4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJLL;
        return ((((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.LJLJL) * 31) + this.LJLJLJ) * 31) + (this.LJLJLLL ? 1 : 0);
    }

    /* renamed from: isFromComment, reason: collision with other method in class */
    public final boolean m23isFromComment() {
        return o.LJ("1", this.LJLJJL);
    }

    public final boolean isFromFeedSearchBar() {
        if (this.LJLJLJ != 0) {
            return true;
        }
        return false;
    }

    public final boolean isFromVideoDetail() {
        return o.LJ("1", this.LJLJJLL);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchCommonModel(enterFrom=");
        LIZ.append(this.LJLIL);
        LIZ.append(", previousPage=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", shouldShowScanView=");
        LIZ.append(this.LJLJI);
        LIZ.append(", shouldShowSug=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isFromComment=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isFromVideo=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", backPressFlag=");
        LIZ.append(this.LJLJL);
        LIZ.append(", feedSearchBarFlag=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", keepTabPosition=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJLLL, ')', LIZ);
    }

    public final int getBackPressFlag() {
        return this.LJLJL;
    }

    public final String getEnterFrom() {
        return this.LJLIL;
    }

    public final int getFeedSearchBarFlag() {
        return this.LJLJLJ;
    }

    public final boolean getKeepTabPosition() {
        return this.LJLJLLL;
    }

    public final String getPreviousPage() {
        return this.LJLILLLLZI;
    }

    public final boolean getShouldShowScanView() {
        return this.LJLJI;
    }

    public final boolean getShouldShowSug() {
        return this.LJLJJI;
    }

    public final String isFromVideo() {
        return this.LJLJJLL;
    }

    public final String isFromComment() {
        return this.LJLJJL;
    }

    public C50433Jqn(String str, String str2, boolean z, boolean z2, String str3, String str4, int i, int i2, boolean z3) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = i;
        this.LJLJLJ = i2;
        this.LJLJLLL = z3;
    }

    public /* synthetic */ C50433Jqn(String str, String str2, boolean z, boolean z2, String str3, String str4, int i, int i2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "discovery" : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? true : z, (i3 & 8) == 0 ? z2 : true, (i3 & 16) != 0 ? "" : str3, (i3 & 32) == 0 ? str4 : "", (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) == 0 ? z3 : false);
    }
}
