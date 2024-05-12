package X;

import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Xq1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86057Xq1 implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final Date LJLJL;
    public final Date LJLJLJ;
    public final Date LJLJLLL;
    public final EnumC86081XqP LJLL;
    public final List<PNSNavButton> LJLLI;
    public final List<PNSHyperlink> LJLLILLLL;
    public final Boolean LJLLJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C86057Xq1() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8191, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C86057Xq1 copy$default(C86057Xq1 c86057Xq1, String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, Date date3, EnumC86081XqP enumC86081XqP, List list, List list2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c86057Xq1.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c86057Xq1.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str3 = c86057Xq1.LJLJI;
        }
        if ((i & 8) != 0) {
            str4 = c86057Xq1.LJLJJI;
        }
        if ((i & 16) != 0) {
            str5 = c86057Xq1.LJLJJL;
        }
        if ((i & 32) != 0) {
            str6 = c86057Xq1.LJLJJLL;
        }
        if ((i & 64) != 0) {
            date = c86057Xq1.LJLJL;
        }
        if ((i & 128) != 0) {
            date2 = c86057Xq1.LJLJLJ;
        }
        if ((i & 256) != 0) {
            date3 = c86057Xq1.LJLJLLL;
        }
        if ((i & 512) != 0) {
            enumC86081XqP = c86057Xq1.LJLL;
        }
        if ((i & 1024) != 0) {
            list = c86057Xq1.LJLLI;
        }
        if ((i & 2048) != 0) {
            list2 = c86057Xq1.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            bool = c86057Xq1.LJLLJ;
        }
        return c86057Xq1.copy(str, str2, str3, str4, str5, str6, date, date2, date3, enumC86081XqP, list, list2, bool);
    }

    public final C86057Xq1 copy(String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, Date date3, EnumC86081XqP indicatorType, List<PNSNavButton> list, List<PNSHyperlink> list2, Boolean bool) {
        o.LJIIIZ(indicatorType, "indicatorType");
        return new C86057Xq1(str, str2, str3, str4, str5, str6, date, date2, date3, indicatorType, list, list2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86057Xq1)) {
            return false;
        }
        C86057Xq1 c86057Xq1 = (C86057Xq1) obj;
        return o.LJ(this.LJLIL, c86057Xq1.LJLIL) && o.LJ(this.LJLILLLLZI, c86057Xq1.LJLILLLLZI) && o.LJ(this.LJLJI, c86057Xq1.LJLJI) && o.LJ(this.LJLJJI, c86057Xq1.LJLJJI) && o.LJ(this.LJLJJL, c86057Xq1.LJLJJL) && o.LJ(this.LJLJJLL, c86057Xq1.LJLJJLL) && o.LJ(this.LJLJL, c86057Xq1.LJLJL) && o.LJ(this.LJLJLJ, c86057Xq1.LJLJLJ) && o.LJ(this.LJLJLLL, c86057Xq1.LJLJLLL) && this.LJLL == c86057Xq1.LJLL && o.LJ(this.LJLLI, c86057Xq1.LJLLI) && o.LJ(this.LJLLILLLL, c86057Xq1.LJLLILLLL) && o.LJ(this.LJLLJ, c86057Xq1.LJLLJ);
    }

    public int hashCode() {
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
        Date date = this.LJLJL;
        int hashCode7 = (hashCode6 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.LJLJLJ;
        int hashCode8 = (hashCode7 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.LJLJLLL;
        int hashCode9 = (this.LJLL.hashCode() + ((hashCode8 + (date3 == null ? 0 : date3.hashCode())) * 31)) * 31;
        List<PNSNavButton> list = this.LJLLI;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<PNSHyperlink> list2 = this.LJLLILLLL;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.LJLLJ;
        return hashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "PNSAgeGateUIModel(header=" + ((Object) this.LJLIL) + ", title=" + ((Object) this.LJLILLLLZI) + ", nextBtnText=" + ((Object) this.LJLJI) + ", contentDesc=" + ((Object) this.LJLJJI) + ", imageUrl=" + ((Object) this.LJLJJL) + ", inputPlaceHolder=" + ((Object) this.LJLJJLL) + ", defaultDate=" + this.LJLJL + ", upperBound=" + this.LJLJLJ + ", lowerBound=" + this.LJLJLLL + ", indicatorType=" + this.LJLL + ", navButtons=" + this.LJLLI + ", hyperLinks=" + this.LJLLILLLL + ", canQuit=" + this.LJLLJ + ')';
    }

    public final Boolean getCanQuit() {
        return this.LJLLJ;
    }

    public final String getContentDesc() {
        return this.LJLJJI;
    }

    public final Date getDefaultDate() {
        return this.LJLJL;
    }

    public final String getHeader() {
        return this.LJLIL;
    }

    public final List<PNSHyperlink> getHyperLinks() {
        return this.LJLLILLLL;
    }

    public final String getImageUrl() {
        return this.LJLJJL;
    }

    public final EnumC86081XqP getIndicatorType() {
        return this.LJLL;
    }

    public final String getInputPlaceHolder() {
        return this.LJLJJLL;
    }

    public final Date getLowerBound() {
        return this.LJLJLLL;
    }

    public final List<PNSNavButton> getNavButtons() {
        return this.LJLLI;
    }

    public final String getNextBtnText() {
        return this.LJLJI;
    }

    public final String getTitle() {
        return this.LJLILLLLZI;
    }

    public final Date getUpperBound() {
        return this.LJLJLJ;
    }

    public C86057Xq1(String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, Date date3, EnumC86081XqP indicatorType, List<PNSNavButton> list, List<PNSHyperlink> list2, Boolean bool) {
        o.LJIIIZ(indicatorType, "indicatorType");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
        this.LJLJL = date;
        this.LJLJLJ = date2;
        this.LJLJLLL = date3;
        this.LJLL = indicatorType;
        this.LJLLI = list;
        this.LJLLILLLL = list2;
        this.LJLLJ = bool;
    }

    public /* synthetic */ C86057Xq1(String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, Date date3, EnumC86081XqP enumC86081XqP, List list, List list2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : date, (i & 128) != 0 ? null : date2, (i & 256) != 0 ? null : date3, (i & 512) != 0 ? EnumC86081XqP.HIDE : enumC86081XqP, (i & 1024) != 0 ? null : list, (i & 2048) != 0 ? null : list2, (i & 4096) == 0 ? bool : null);
    }
}
