package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KFN implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public final long LJLJLJ;
    public final int LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public final String LJLLILLLL;
    public final String LJLLJ;
    public final String LJLLL;
    public final String LJLLLL;
    public final String LJLLLLLL;
    public final String LJLZ;
    public final String LJZ;
    public final String LJZI;
    public final String LJZL;
    public final String LL;
    public final int LLD;
    public final Integer LLF;
    public final String LLFF;
    public final String LLFFF;
    public String LLFII;
    public String LLFZ;
    public String LLI;
    public String LLIFFJFJJ;
    public C50287JoR LLII;

    public static /* synthetic */ KFN copy$default(KFN kfn, String str, String str2, String str3, int i, int i2, String str4, String str5, long j, int i3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i4, Integer num, String str18, String str19, int i5, Object obj) {
        String str20 = str;
        String str21 = str8;
        String str22 = str7;
        String str23 = str6;
        int i6 = i3;
        long j2 = j;
        String str24 = str3;
        String str25 = str2;
        String str26 = str9;
        int i7 = i;
        int i8 = i2;
        String str27 = str4;
        String str28 = str5;
        String str29 = str18;
        Integer num2 = num;
        int i9 = i4;
        String str30 = str17;
        String str31 = str16;
        String str32 = str11;
        String str33 = str10;
        String str34 = str12;
        String str35 = str13;
        String str36 = str14;
        String str37 = str19;
        String str38 = str15;
        if ((i5 & 1) != 0) {
            str20 = kfn.LJLIL;
        }
        if ((i5 & 2) != 0) {
            str25 = kfn.LJLILLLLZI;
        }
        if ((i5 & 4) != 0) {
            str24 = kfn.LJLJI;
        }
        if ((i5 & 8) != 0) {
            i7 = kfn.LJLJJI;
        }
        if ((i5 & 16) != 0) {
            i8 = kfn.LJLJJL;
        }
        if ((i5 & 32) != 0) {
            str27 = kfn.LJLJJLL;
        }
        if ((i5 & 64) != 0) {
            str28 = kfn.LJLJL;
        }
        if ((i5 & 128) != 0) {
            j2 = kfn.LJLJLJ;
        }
        if ((i5 & 256) != 0) {
            i6 = kfn.LJLJLLL;
        }
        if ((i5 & 512) != 0) {
            str23 = kfn.LJLL;
        }
        if ((i5 & 1024) != 0) {
            str22 = kfn.LJLLI;
        }
        if ((i5 & 2048) != 0) {
            str21 = kfn.LJLLILLLL;
        }
        if ((i5 & 4096) != 0) {
            str26 = kfn.LJLLJ;
        }
        if ((i5 & FileUtils.BUFFER_SIZE) != 0) {
            str33 = kfn.LJLLL;
        }
        if ((i5 & 16384) != 0) {
            str32 = kfn.LJLLLL;
        }
        if ((32768 & i5) != 0) {
            str34 = kfn.LJLLLLLL;
        }
        if ((65536 & i5) != 0) {
            str35 = kfn.LJLZ;
        }
        if ((131072 & i5) != 0) {
            str36 = kfn.LJZ;
        }
        if ((262144 & i5) != 0) {
            str38 = kfn.LJZI;
        }
        if ((524288 & i5) != 0) {
            str31 = kfn.LJZL;
        }
        if ((1048576 & i5) != 0) {
            str30 = kfn.LL;
        }
        if ((2097152 & i5) != 0) {
            i9 = kfn.LLD;
        }
        if ((4194304 & i5) != 0) {
            num2 = kfn.LLF;
        }
        if ((8388608 & i5) != 0) {
            str29 = kfn.LLFF;
        }
        if ((i5 & 16777216) != 0) {
            str37 = kfn.LLFFF;
        }
        String str39 = str29;
        String str40 = str37;
        return kfn.copy(str20, str25, str24, i7, i8, str27, str28, j2, i6, str23, str22, str21, str26, str33, str32, str34, str35, str36, str38, str31, str30, i9, num2, str39, str40);
    }

    public final KFN copy(String keyword, String searchSource, String source, int i, int i2, String searchId, String str, long j, int i3, String enterFrom, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i4, Integer num, String str13, String str14) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(searchSource, "searchSource");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(enterFrom, "enterFrom");
        return new KFN(keyword, searchSource, source, i, i2, searchId, str, j, i3, enterFrom, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, i4, num, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KFN)) {
            return false;
        }
        KFN kfn = (KFN) obj;
        return o.LJ(this.LJLIL, kfn.LJLIL) && o.LJ(this.LJLILLLLZI, kfn.LJLILLLLZI) && o.LJ(this.LJLJI, kfn.LJLJI) && this.LJLJJI == kfn.LJLJJI && this.LJLJJL == kfn.LJLJJL && o.LJ(this.LJLJJLL, kfn.LJLJJLL) && o.LJ(this.LJLJL, kfn.LJLJL) && this.LJLJLJ == kfn.LJLJLJ && this.LJLJLLL == kfn.LJLJLLL && o.LJ(this.LJLL, kfn.LJLL) && o.LJ(this.LJLLI, kfn.LJLLI) && o.LJ(this.LJLLILLLL, kfn.LJLLILLLL) && o.LJ(this.LJLLJ, kfn.LJLLJ) && o.LJ(this.LJLLL, kfn.LJLLL) && o.LJ(this.LJLLLL, kfn.LJLLLL) && o.LJ(this.LJLLLLLL, kfn.LJLLLLLL) && o.LJ(this.LJLZ, kfn.LJLZ) && o.LJ(this.LJZ, kfn.LJZ) && o.LJ(this.LJZI, kfn.LJZI) && o.LJ(this.LJZL, kfn.LJZL) && o.LJ(this.LL, kfn.LL) && this.LLD == kfn.LLD && o.LJ(this.LLF, kfn.LLF) && o.LJ(this.LLFF, kfn.LLFF) && o.LJ(this.LLFFF, kfn.LLFFF);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int LJ = C79062V1e.LJ(this.LJLJJLL, (((C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31) + this.LJLJJI) * 31) + this.LJLJJL) * 31, 31);
        String str = this.LJLJL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJLL, (JBR.LIZJ(this.LJLJLJ, (LJ + hashCode) * 31, 31) + this.LJLJLLL) * 31, 31);
        String str2 = this.LJLLI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LJ2 + hashCode2) * 31;
        String str3 = this.LJLLILLLL;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.LJLLJ;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str5 = this.LJLLL;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str6 = this.LJLLLL;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str7 = this.LJLLLLLL;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str8 = this.LJLZ;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        String str9 = this.LJZ;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        String str10 = this.LJZI;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        String str11 = this.LJZL;
        if (str11 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str11.hashCode();
        }
        int i11 = (i10 + hashCode11) * 31;
        String str12 = this.LL;
        if (str12 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str12.hashCode();
        }
        int i12 = (((i11 + hashCode12) * 31) + this.LLD) * 31;
        Integer num = this.LLF;
        if (num == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num.hashCode();
        }
        int i13 = (i12 + hashCode13) * 31;
        String str13 = this.LLFF;
        if (str13 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str13.hashCode();
        }
        int i14 = (i13 + hashCode14) * 31;
        String str14 = this.LLFFF;
        if (str14 != null) {
            i = str14.hashCode();
        }
        return i14 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EcSearchRequestParam(keyword=");
        sb.append(this.LJLIL);
        sb.append(", searchSource=");
        sb.append(this.LJLILLLLZI);
        sb.append(", source=");
        sb.append(this.LJLJI);
        sb.append(", hotSearch=");
        sb.append(this.LJLJJI);
        sb.append(", correctType=");
        sb.append(this.LJLJJL);
        sb.append(", searchId=");
        sb.append(this.LJLJJLL);
        sb.append(", lastSearchId=");
        sb.append(this.LJLJL);
        sb.append(", cursor=");
        sb.append(this.LJLJLJ);
        sb.append(", count=");
        sb.append(this.LJLJLLL);
        sb.append(", enterFrom=");
        sb.append(this.LJLL);
        sb.append(", searchChannel=");
        sb.append(this.LJLLI);
        sb.append(", sugTagText=");
        sb.append(this.LJLLILLLL);
        sb.append(", sugType=");
        sb.append(this.LJLLJ);
        sb.append(", sugQueryState=");
        sb.append(this.LJLLL);
        sb.append(", sugCreatorId=");
        sb.append(this.LJLLLL);
        sb.append(", attachProducts=");
        sb.append(this.LJLLLLLL);
        sb.append(", trafficSourceList=");
        sb.append(this.LJLZ);
        sb.append(", sugShopId=");
        sb.append(this.LJZ);
        sb.append(", originIsMallTab=");
        sb.append(this.LJZI);
        sb.append(", ecSearchSessionId=");
        sb.append(this.LJZL);
        sb.append(", chunkSizeList=");
        sb.append(this.LL);
        sb.append(", isFilterSearch=");
        sb.append(this.LLD);
        sb.append(", pageType=");
        sb.append(this.LLF);
        sb.append(", apiVersion=");
        sb.append(this.LLFF);
        sb.append(", searchSessionId=");
        return C07670Rv.LIZIZ(sb, this.LLFFF, ')');
    }

    public final String getApiVersion() {
        return this.LLFF;
    }

    public final String getAttachProducts() {
        return this.LJLLLLLL;
    }

    public final String getChunkSizeList() {
        return this.LL;
    }

    public final String getCmplEnc() {
        return this.LLI;
    }

    public final int getCorrectType() {
        return this.LJLJJL;
    }

    public final int getCount() {
        return this.LJLJLLL;
    }

    public final long getCursor() {
        return this.LJLJLJ;
    }

    public final String getEcSearchSessionId() {
        return this.LJZL;
    }

    public final String getEnterFrom() {
        return this.LJLL;
    }

    public final C50287JoR getFilterOption() {
        return this.LLII;
    }

    public final int getHotSearch() {
        return this.LJLJJI;
    }

    public final String getKeyword() {
        return this.LJLIL;
    }

    public final String getLastSearchId() {
        return this.LJLJL;
    }

    public final String getOriginIsMallTab() {
        return this.LJZI;
    }

    public final Integer getPageType() {
        return this.LLF;
    }

    public final String getSearchChannel() {
        return this.LJLLI;
    }

    public final String getSearchContext() {
        return this.LLIFFJFJJ;
    }

    public final String getSearchId() {
        return this.LJLJJLL;
    }

    public final String getSearchSessionId() {
        return this.LLFFF;
    }

    public final String getSearchSource() {
        return this.LJLILLLLZI;
    }

    public final String getSource() {
        return this.LJLJI;
    }

    public final String getSugCreatorId() {
        return this.LJLLLL;
    }

    public final String getSugQueryState() {
        return this.LJLLL;
    }

    public final String getSugShopId() {
        return this.LJZ;
    }

    public final String getSugTagText() {
        return this.LJLLILLLL;
    }

    public final String getSugType() {
        return this.LJLLJ;
    }

    public final String getTrafficSourceList() {
        return this.LJLZ;
    }

    public final String getUserActions() {
        return this.LLFZ;
    }

    public final String getUserRtActs() {
        return this.LLFII;
    }

    public final int isFilterSearch() {
        return this.LLD;
    }

    public final boolean isSame(KFN requestParam) {
        o.LJIIIZ(requestParam, "requestParam");
        return o.LJ(this, requestParam);
    }

    public final void setCmplEnc(String str) {
        this.LLI = str;
    }

    public final void setFilterOption(C50287JoR c50287JoR) {
        this.LLII = c50287JoR;
    }

    public final void setLastSearchId(String str) {
        this.LJLJL = str;
    }

    public final void setSearchContext(String str) {
        this.LLIFFJFJJ = str;
    }

    public final void setSearchId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJJLL = str;
    }

    public final void setUserActions(String str) {
        this.LLFZ = str;
    }

    public final void setUserRtActs(String str) {
        this.LLFII = str;
    }

    public KFN(String keyword, String searchSource, String source, int i, int i2, String searchId, String str, long j, int i3, String enterFrom, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i4, Integer num, String str13, String str14) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(searchSource, "searchSource");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = keyword;
        this.LJLILLLLZI = searchSource;
        this.LJLJI = source;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = searchId;
        this.LJLJL = str;
        this.LJLJLJ = j;
        this.LJLJLLL = i3;
        this.LJLL = enterFrom;
        this.LJLLI = str2;
        this.LJLLILLLL = str3;
        this.LJLLJ = str4;
        this.LJLLL = str5;
        this.LJLLLL = str6;
        this.LJLLLLLL = str7;
        this.LJLZ = str8;
        this.LJZ = str9;
        this.LJZI = str10;
        this.LJZL = str11;
        this.LL = str12;
        this.LLD = i4;
        this.LLF = num;
        this.LLFF = str13;
        this.LLFFF = str14;
        this.LLFZ = "";
        this.LLIFFJFJJ = "";
    }

    public /* synthetic */ KFN(String str, String str2, String str3, int i, int i2, String str4, String str5, long j, int i3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i4, Integer num, String str18, String str19, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? "" : str4, (i5 & 64) != 0 ? null : str5, (i5 & 128) != 0 ? 0L : j, (i5 & 256) != 0 ? 0 : i3, (i5 & 512) == 0 ? str6 : "", (i5 & 1024) != 0 ? null : str7, (i5 & 2048) != 0 ? null : str8, (i5 & 4096) != 0 ? null : str9, (i5 & FileUtils.BUFFER_SIZE) != 0 ? null : str10, (i5 & 16384) != 0 ? null : str11, (32768 & i5) != 0 ? null : str12, (65536 & i5) != 0 ? null : str13, (131072 & i5) != 0 ? null : str14, (262144 & i5) != 0 ? null : str15, (524288 & i5) != 0 ? null : str16, (1048576 & i5) != 0 ? null : str17, (2097152 & i5) != 0 ? 0 : i4, (4194304 & i5) != 0 ? null : num, str18, (i5 & 16777216) == 0 ? str19 : null);
    }
}
