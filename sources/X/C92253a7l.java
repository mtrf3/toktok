package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Notice;
import kotlin.jvm.internal.o;

/* renamed from: X.a7l, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92253a7l implements C33Q {
    public final EnumC91916a2K LJLIL;
    public final EnumC91995a3b LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final Notice LJLJL;
    public final Boolean LJLJLJ;
    public final Boolean LJLJLLL;

    public C92253a7l() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92253a7l)) {
            return false;
        }
        C92253a7l c92253a7l = (C92253a7l) obj;
        return this.LJLIL == c92253a7l.LJLIL && this.LJLILLLLZI == c92253a7l.LJLILLLLZI && this.LJLJI == c92253a7l.LJLJI && o.LJ(this.LJLJJI, c92253a7l.LJLJJI) && o.LJ(this.LJLJJL, c92253a7l.LJLJJL) && o.LJ(this.LJLJJLL, c92253a7l.LJLJJLL) && o.LJ(this.LJLJL, c92253a7l.LJLJL) && o.LJ(this.LJLJLJ, c92253a7l.LJLJLJ) && o.LJ(this.LJLJLLL, c92253a7l.LJLJLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        EnumC91995a3b enumC91995a3b = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (enumC91995a3b == null ? 0 : enumC91995a3b.hashCode())) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (((hashCode2 + i) * 31) + this.LJLJJI.hashCode()) * 31;
        String str = this.LJLJJL;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJJLL;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Notice notice = this.LJLJL;
        int hashCode6 = (hashCode5 + (notice == null ? 0 : notice.hashCode())) * 31;
        Boolean bool = this.LJLJLJ;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJLJLLL;
        return hashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RepaymentViewState(loadingStatus=");
        LIZ.append(this.LJLIL);
        LIZ.append(", status=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", prepareLoading=");
        LIZ.append(this.LJLJI);
        LIZ.append(", statusImg=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", title=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", message=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", notice=");
        LIZ.append(this.LJLJL);
        LIZ.append(", showContinueToRepay=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", showCustomerService=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C92253a7l(int r11) {
        /*
            r10 = this;
            X.a2K r1 = X.EnumC91916a2K.LOADING
            X.a3b r2 = X.EnumC91995a3b.PENDING
            r3 = 0
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r0 = r10
            r6 = r5
            r7 = r5
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92253a7l.<init>(int):void");
    }

    public C92253a7l(EnumC91916a2K loadingStatus, EnumC91995a3b enumC91995a3b, boolean z, String statusImg, String str, String str2, Notice notice, Boolean bool, Boolean bool2) {
        o.LJIIIZ(loadingStatus, "loadingStatus");
        o.LJIIIZ(statusImg, "statusImg");
        this.LJLIL = loadingStatus;
        this.LJLILLLLZI = enumC91995a3b;
        this.LJLJI = z;
        this.LJLJJI = statusImg;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = notice;
        this.LJLJLJ = bool;
        this.LJLJLLL = bool2;
    }

    public static C92253a7l LIZ(C92253a7l c92253a7l, EnumC91916a2K enumC91916a2K, EnumC91995a3b enumC91995a3b, boolean z, String str, String str2, Notice notice, Boolean bool, Boolean bool2, int i) {
        String statusImg;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        EnumC91995a3b enumC91995a3b2 = enumC91995a3b;
        EnumC91916a2K loadingStatus = enumC91916a2K;
        boolean z2 = z;
        String str3 = str;
        String str4 = str2;
        Notice notice2 = notice;
        if ((i & 1) != 0) {
            loadingStatus = c92253a7l.LJLIL;
        }
        if ((i & 2) != 0) {
            enumC91995a3b2 = c92253a7l.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z2 = c92253a7l.LJLJI;
        }
        if ((i & 8) != 0) {
            statusImg = c92253a7l.LJLJJI;
        } else {
            statusImg = null;
        }
        if ((i & 16) != 0) {
            str3 = c92253a7l.LJLJJL;
        }
        if ((i & 32) != 0) {
            str4 = c92253a7l.LJLJJLL;
        }
        if ((i & 64) != 0) {
            notice2 = c92253a7l.LJLJL;
        }
        if ((i & 128) != 0) {
            bool4 = c92253a7l.LJLJLJ;
        }
        if ((i & 256) != 0) {
            bool3 = c92253a7l.LJLJLLL;
        }
        c92253a7l.getClass();
        o.LJIIIZ(loadingStatus, "loadingStatus");
        o.LJIIIZ(statusImg, "statusImg");
        return new C92253a7l(loadingStatus, enumC91995a3b2, z2, statusImg, str3, str4, notice2, bool4, bool3);
    }
}
