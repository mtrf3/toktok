package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Jqo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50434Jqo implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final Long LJLJL;

    public static /* synthetic */ C50434Jqo copy$default(C50434Jqo c50434Jqo, String str, String str2, String str3, String str4, String str5, String str6, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c50434Jqo.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c50434Jqo.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str3 = c50434Jqo.LJLJI;
        }
        if ((i & 8) != 0) {
            str4 = c50434Jqo.LJLJJI;
        }
        if ((i & 16) != 0) {
            str5 = c50434Jqo.LJLJJL;
        }
        if ((i & 32) != 0) {
            str6 = c50434Jqo.LJLJJLL;
        }
        if ((i & 64) != 0) {
            l = c50434Jqo.LJLJL;
        }
        return c50434Jqo.copy(str, str2, str3, str4, str5, str6, l);
    }

    public final C50434Jqo copy(String enterFrom, String enterMethod, String str, String str2, String str3, String str4, Long l) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        return new C50434Jqo(enterFrom, enterMethod, str, str2, str3, str4, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50434Jqo)) {
            return false;
        }
        C50434Jqo c50434Jqo = (C50434Jqo) obj;
        return o.LJ(this.LJLIL, c50434Jqo.LJLIL) && o.LJ(this.LJLILLLLZI, c50434Jqo.LJLILLLLZI) && o.LJ(this.LJLJI, c50434Jqo.LJLJI) && o.LJ(this.LJLJJI, c50434Jqo.LJLJJI) && o.LJ(this.LJLJJL, c50434Jqo.LJLJJL) && o.LJ(this.LJLJJLL, c50434Jqo.LJLJJLL) && o.LJ(this.LJLJL, c50434Jqo.LJLJL);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        String str = this.LJLJI;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LJLJJI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LJLJJL;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.LJLJJLL;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l = this.LJLJL;
        if (l != null) {
            i = l.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedEnterTakoParams(enterFrom=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", searchId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", searchKeyword=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", gid=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", feedBar=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", viewDurationSecond=");
        return JBR.LJ(LIZ, this.LJLJL, ')', LIZ);
    }

    public final String getEnterFrom() {
        return this.LJLIL;
    }

    public final String getEnterMethod() {
        return this.LJLILLLLZI;
    }

    public final String getFeedBar() {
        return this.LJLJJLL;
    }

    public final String getGid() {
        return this.LJLJJL;
    }

    public final String getSearchId() {
        return this.LJLJI;
    }

    public final String getSearchKeyword() {
        return this.LJLJJI;
    }

    public final Long getViewDurationSecond() {
        return this.LJLJL;
    }

    public C50434Jqo(String enterFrom, String enterMethod, String str, String str2, String str3, String str4, Long l) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = enterMethod;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = l;
    }

    public /* synthetic */ C50434Jqo(String str, String str2, String str3, String str4, String str5, String str6, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) == 0 ? l : null);
    }
}
