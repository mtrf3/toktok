package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal.SearchIntermediateAwemeInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jv6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50700Jv6 implements InterfaceC50315Jot {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final List<SearchIntermediateAwemeInfo> LJLJL;

    public C50700Jv6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50700Jv6)) {
            return false;
        }
        C50700Jv6 c50700Jv6 = (C50700Jv6) obj;
        return this.LJLIL == c50700Jv6.LJLIL && this.LJLILLLLZI == c50700Jv6.LJLILLLLZI && this.LJLJI == c50700Jv6.LJLJI && this.LJLJJI == c50700Jv6.LJLJJI && o.LJ(this.LJLJJL, c50700Jv6.LJLJJL) && o.LJ(this.LJLJJLL, c50700Jv6.LJLJJLL) && o.LJ(this.LJLJL, c50700Jv6.LJLJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LJLIL;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        if (!this.LJLILLLLZI) {
            i = 0;
        }
        int LIZJ = JBR.LIZJ(this.LJLJJI, JBR.LIZJ(this.LJLJI, (i2 + i) * 31, 31), 31);
        String str = this.LJLJJL;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (LIZJ + hashCode) * 31;
        String str2 = this.LJLJJLL;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return this.LJLJL.hashCode() + ((i4 + i3) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchIntermediateSuggestState(isLocked=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isFirstIntermediate=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", requestTime=");
        LIZ.append(this.LJLJI);
        LIZ.append(", appLaunchTime=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", blankPageEnterForm=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", blankPageEnterMethod=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", feedAwemeInfos=");
        return C1NE.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public /* synthetic */ C50700Jv6(int i) {
        this(false, true, 0L, 0L, "", "", new ArrayList());
    }

    public C50700Jv6(boolean z, boolean z2, long j, long j2, String str, String str2, List<SearchIntermediateAwemeInfo> feedAwemeInfos) {
        o.LJIIIZ(feedAwemeInfos, "feedAwemeInfos");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = feedAwemeInfos;
    }

    public static C50700Jv6 LIZ(C50700Jv6 c50700Jv6, boolean z, boolean z2, long j, long j2, String str, String str2, List list, int i) {
        List feedAwemeInfos = list;
        boolean z3 = z2;
        boolean z4 = z;
        String str3 = str2;
        long j3 = j;
        long j4 = j2;
        String str4 = str;
        if ((i & 1) != 0) {
            z4 = c50700Jv6.LJLIL;
        }
        if ((i & 2) != 0) {
            z3 = c50700Jv6.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            j3 = c50700Jv6.LJLJI;
        }
        if ((i & 8) != 0) {
            j4 = c50700Jv6.LJLJJI;
        }
        if ((i & 16) != 0) {
            str4 = c50700Jv6.LJLJJL;
        }
        if ((i & 32) != 0) {
            str3 = c50700Jv6.LJLJJLL;
        }
        if ((i & 64) != 0) {
            feedAwemeInfos = c50700Jv6.LJLJL;
        }
        c50700Jv6.getClass();
        o.LJIIIZ(feedAwemeInfos, "feedAwemeInfos");
        return new C50700Jv6(z4, z3, j3, j4, str4, str3, feedAwemeInfos);
    }
}
