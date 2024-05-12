package X;

import Y.AgS111S0200000_8;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.repo.SearchMixFeedCollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS31S1000000_8;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.JiR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49915JiR implements InterfaceC49794JgU {
    public static final /* synthetic */ int LLIIZ = 0;
    public SearchResultParam LJLIL;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public String LJLJL;
    public int LJLJLJ;
    public C50287JoR LJLJLLL;
    public int LJLLI;
    public Integer LJLLILLLL;
    public Integer LJLLJ;
    public Integer LJLLL;
    public int LJLLLL;
    public String LJZ;
    public String LJZI;
    public String LJZL;
    public String LL;
    public String LLD;
    public C50031JkJ LLF;
    public String LLFF;
    public int LLFFF;
    public int LLFII;
    public Integer LLI;
    public String LLIFFJFJJ;
    public String LLII;
    public String LLIIIJ;
    public String LLIIIL;
    public String LLIIIZ;
    public String LLIIL;
    public String LLIILII;
    public boolean LLIILZL;
    public String LJLILLLLZI = "";
    public String LJLJJLL = "";
    public String LJLL = "";
    public String LJLLLLLL = "";
    public String LJLZ = "";
    public final C62822Ol8 LLFZ = C221108m2.LIZIZ(C49933Jij.LJLIL);
    public Long LLIIII = 0L;
    public Long LLIIIILZ = 0L;
    public Integer LLIIJI = 0;
    public Integer LLIIJLIL = 0;

    public final C10K<SearchMixFeedList> LIZIZ() {
        LinkedHashMap<String, Integer> linkedHashMap;
        boolean z;
        LinkedHashMap<String, Integer> linkedHashMap2;
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        String LIZ;
        String str4;
        String str5;
        Integer num;
        String str6;
        ResearchFilterStruct researchFilterOption;
        SearchResultParam searchResultParam;
        String str7 = "";
        if (this.LJLJI == 0) {
            C49921JiX.LJ(this.LJLIL).LJII();
            C49923JiZ LIZLLL = C49922JiY.LIZLLL(this.LJLIL);
            LIZLLL.LIZLLL();
            o.LJ(LIZLLL, C49936Jim.LIZ);
            C49949Jiz c49949Jiz = C49950Jj0.LJFF;
            if (c49949Jiz.LIZJ == -1) {
                c49949Jiz.LIZJ = System.currentTimeMillis();
                c49949Jiz.LIZLLL = -1L;
            }
            C49951Jj1 c49951Jj1 = C49950Jj0.LJ;
            if (c49951Jj1.LIZJ == null) {
                c49951Jj1.LIZJ = 0;
                Object obj = 0;
                if (0 == null) {
                    obj = "";
                }
                c49951Jj1.LIZ(obj, "request_type");
            }
            C50139Jm3.LIZJ(C50605JtZ.LJIIJJI());
            SearchMixFeedCollectionTypeAdapterFactory.LJLIL = true;
            this.LLFF = C50236Jnc.LIZ().LIZIZ();
        } else {
            SearchMixFeedCollectionTypeAdapterFactory.LJLIL = false;
        }
        String str8 = this.LJLLLLLL;
        if (ujb.o.LJJJJJL(str8)) {
            str8 = "channel_unknown";
        }
        C50287JoR c50287JoR = this.LJLJLLL;
        if (c50287JoR == null || (linkedHashMap = c50287JoR.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("/SINGLE/ query[");
        LIZ2.append(this.LJLILLLLZI);
        LIZ2.append("] cursor[");
        LIZ2.append(this.LJLJI);
        LIZ2.append("] layout[");
        int i4 = this.LJLJI;
        linkedHashMap.isEmpty();
        if (this.LJLJJL == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ2.append(C50116Jlg.LIZ(i4, this.LJLL, z));
        LIZ2.append("] filters[");
        C50287JoR c50287JoR2 = this.LJLJLLL;
        if (c50287JoR2 != null) {
            linkedHashMap2 = c50287JoR2.activityToFieldMap();
        } else {
            linkedHashMap2 = null;
        }
        LIZ2.append(linkedHashMap2);
        LIZ2.append("] is_filter[");
        LIZ2.append(this.LJLLILLLL);
        LIZ2.append("] publish_time[");
        LIZ2.append(this.LJLLL);
        LIZ2.append("] sort_type[");
        LIZ2.append(this.LJLLJ);
        LIZ2.append(']');
        X1D.LIZIZ(LIZ2);
        if (C26015AIx.LIZLLL()) {
            str = C50560Jsq.LIZJ();
        } else {
            str = null;
        }
        SearchApiNew.RealApi LIZ3 = SearchApiNew.LIZ();
        String str9 = this.LJLILLLLZI;
        int i5 = this.LJLJI;
        int i6 = this.LJLJJI;
        String str10 = this.LJLL;
        int i7 = this.LJLLI;
        if (!TextUtils.isEmpty(this.LJLJJLL)) {
            str2 = this.LJLJJLL;
        } else {
            str2 = null;
        }
        String str11 = this.LJLJL;
        int i8 = this.LJLJLJ;
        if (!TextUtils.isEmpty(this.LJZL)) {
            str3 = this.LJZL;
        } else {
            str3 = null;
        }
        String str12 = this.LJZ;
        String str13 = this.LJZI;
        String str14 = this.LL;
        Integer num2 = this.LJLLILLLL;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        Integer num3 = this.LJLLL;
        if (num3 != null) {
            i2 = num3.intValue();
        } else {
            i2 = 0;
        }
        Integer num4 = this.LJLLJ;
        if (num4 != null) {
            i3 = num4.intValue();
        } else {
            i3 = 0;
        }
        String str15 = this.LJLZ;
        String str16 = this.LLD;
        if (str16 == null) {
            C50031JkJ c50031JkJ = this.LLF;
            if (c50031JkJ != null && (searchResultParam = c50031JkJ.LJIIZILJ) != null) {
                str16 = searchResultParam.getWordType();
            } else {
                str16 = null;
            }
        }
        String str17 = this.LLFF;
        if (str17 == null) {
            str17 = "";
        }
        LIZ = FLE.LIZ("other");
        SearchResultParam searchResultParam2 = this.LJLIL;
        if (searchResultParam2 != null) {
            str4 = searchResultParam2.getTrendingEventId();
        } else {
            str4 = null;
        }
        boolean LIZIZ = JQ2.LIZIZ();
        int i9 = this.LLFFF;
        int i10 = this.LLFII;
        String LJFF = C50293JoX.LJFF();
        C50287JoR c50287JoR3 = this.LJLJLLL;
        if (c50287JoR3 != null && (researchFilterOption = c50287JoR3.getResearchFilterOption()) != null) {
            str5 = researchFilterOption.getRequestContent();
        } else {
            str5 = null;
        }
        Integer num5 = this.LLI;
        String str18 = this.LLIFFJFJJ;
        int i11 = this.LJLJI;
        linkedHashMap.isEmpty();
        boolean z2 = true;
        if (this.LJLJJL != 1) {
            z2 = false;
        }
        String LIZ4 = C50116Jlg.LIZ(i11, this.LJLL, z2);
        String str19 = this.LLII;
        Long l = this.LLIIII;
        Integer valueOf = Integer.valueOf(this.LJLJJL);
        Long l2 = this.LLIIIILZ;
        if (!FunctionSupportService.INSTANCE.notSupport(IFunctionKey.AD)) {
            str7 = EU3.LIZLLL();
        }
        int LJIILIIL = a.LJIIJ().LJIILIIL();
        String LIZJ = a.LJIIZILJ().LIZJ();
        String str20 = this.LLIIIJ;
        String str21 = this.LLIIIL;
        String str22 = this.LLIIIZ;
        Integer num6 = this.LLIIJI;
        Integer num7 = this.LLIIJLIL;
        Integer valueOf2 = Integer.valueOf(C49627Jdn.LIZIZ() ? 1 : 0);
        String effectSDKVersion = AVExternalServiceImpl.LIZ().abilityService().effectService().getEffectSDKVersion();
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        SearchResultParam searchResultParam3 = this.LJLIL;
        if (searchResultParam3 != null) {
            str6 = searchResultParam3.getSugGenerateType();
        } else {
            str6 = null;
        }
        C10K<SearchMixFeedList> searchMTMixFeedList = LIZ3.searchMTMixFeedList(str9, i5, i6, str8, str10, i7, str2, str11, i8, 0, str3, str12, str13, str14, i, i2, i3, str15, str16, str17, LIZ, str4, LIZIZ ? 1 : 0, i9, i10, linkedHashMap, LJFF, str5, num5, str18, LIZ4, str19, l, valueOf, l2, str7, LJIILIIL, LIZJ, str, str20, str21, str22, num6, num7, valueOf2, effectSDKVersion, num, str6, C36033ECf.LIZJ("goods_view_action"));
        C10K LJFF2 = searchMTMixFeedList.LJFF(new AgS111S0200000_8(this, searchMTMixFeedList, 0));
        o.LJIIIIZZ(LJFF2, "fun call(): Task<SearchM…       it\n        }\n    }");
        return LJFF2;
    }

    public final C10K<QDX<SearchMixFeedList>> LIZJ() {
        LinkedHashMap<String, Integer> linkedHashMap;
        Object obj;
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        String LIZ;
        String str4;
        String str5;
        String str6;
        ResearchFilterStruct researchFilterOption;
        Object obj2;
        boolean z = true;
        Integer num = 1;
        String str7 = "";
        if (this.LJLJI == 0) {
            C49921JiX.LJ(this.LJLIL).LJII();
            C49923JiZ LIZLLL = C49922JiY.LIZLLL(this.LJLIL);
            LIZLLL.LIZLLL();
            o.LJ(LIZLLL, C49936Jim.LIZ);
            C49949Jiz c49949Jiz = C49950Jj0.LJFF;
            if (c49949Jiz.LIZJ == -1) {
                c49949Jiz.LIZJ = System.currentTimeMillis();
                c49949Jiz.LIZLLL = -1L;
                C49951Jj1 c49951Jj1 = C49950Jj0.LJ;
                if (c49951Jj1.LIZJ == null) {
                    c49951Jj1.LIZJ = num;
                    if (num == null) {
                        obj2 = "";
                    } else {
                        obj2 = num;
                    }
                    c49951Jj1.LIZ(obj2, "request_type");
                }
            }
            this.LJLZ = "";
            int LJIIJJI = C50605JtZ.LJIIJJI();
            UC7.LIZLLL("origin index", LJIIJJI);
            if (LJIIJJI < 0) {
                LJIIJJI = 0;
            }
            C50139Jm3.LIZJ(LJIIJJI);
        }
        SearchMixFeedCollectionTypeAdapterFactory.LJLIL = false;
        String str8 = this.LJLLLLLL;
        if (ujb.o.LJJJJJL(str8)) {
            str8 = "channel_unknown";
        }
        C50287JoR c50287JoR = this.LJLJLLL;
        if (c50287JoR == null || (linkedHashMap = c50287JoR.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        long j = 1000;
        String valueOf = String.valueOf(System.currentTimeMillis() / j);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("query", this.LJLILLLLZI);
        linkedHashMap2.put("channel", "general");
        linkedHashMap2.put("search_method", this.LJLL);
        linkedHashMap2.put("timestamp", Integer.valueOf((int) (System.currentTimeMillis() / j)));
        C36033ECf.LIZLLL("search_action", valueOf, linkedHashMap2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("/STREAM/ query[");
        LIZ2.append(this.LJLILLLLZI);
        LIZ2.append("] cursor[");
        LIZ2.append(this.LJLJI);
        LIZ2.append("] layout[");
        int i4 = this.LJLJI;
        linkedHashMap.isEmpty();
        if (this.LJLJJL != 1) {
            z = false;
        }
        LIZ2.append(C50116Jlg.LIZ(i4, this.LJLL, z));
        LIZ2.append("] filters[");
        C50287JoR c50287JoR2 = this.LJLJLLL;
        if (c50287JoR2 != null) {
            obj = c50287JoR2.activityToFieldMap();
        } else {
            obj = null;
        }
        LIZ2.append(obj);
        LIZ2.append("] is_filter[");
        LIZ2.append(this.LJLLILLLL);
        LIZ2.append("] publish_time[");
        LIZ2.append(this.LJLLL);
        LIZ2.append("] sort_type[");
        LIZ2.append(this.LJLLJ);
        LIZ2.append(']');
        X1D.LIZIZ(LIZ2);
        if (C26015AIx.LIZLLL()) {
            str = C50560Jsq.LIZJ();
        } else {
            str = null;
        }
        SearchApiNew.RealApi LIZ3 = SearchApiNew.LIZ();
        String str9 = this.LJLILLLLZI;
        int i5 = this.LJLJI;
        int i6 = this.LJLJJI;
        String str10 = this.LJLL;
        int i7 = this.LJLLI;
        if (!TextUtils.isEmpty(this.LJLJJLL)) {
            str2 = this.LJLJJLL;
        } else {
            str2 = null;
        }
        String str11 = this.LJLJL;
        int i8 = this.LJLJLJ;
        if (!TextUtils.isEmpty(this.LJZL)) {
            str3 = this.LJZL;
        } else {
            str3 = null;
        }
        String str12 = this.LJZ;
        String str13 = this.LJZI;
        String str14 = this.LL;
        Integer num2 = this.LJLLILLLL;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        Integer num3 = this.LJLLL;
        if (num3 != null) {
            i2 = num3.intValue();
        } else {
            i2 = 0;
        }
        Integer num4 = this.LJLLJ;
        if (num4 != null) {
            i3 = num4.intValue();
        } else {
            i3 = 0;
        }
        LIZ = FLE.LIZ("other");
        SearchResultParam searchResultParam = this.LJLIL;
        if (searchResultParam != null) {
            str4 = searchResultParam.getTrendingEventId();
        } else {
            str4 = null;
        }
        String LIZIZ = C50236Jnc.LIZ().LIZIZ();
        String str15 = this.LJLZ;
        String str16 = this.LLD;
        boolean LIZIZ2 = JQ2.LIZIZ();
        int i9 = this.LLFFF;
        int i10 = this.LLFII;
        String LJFF = C50293JoX.LJFF();
        int intValue = ((Number) this.LLFZ.getValue()).intValue();
        C50287JoR c50287JoR3 = this.LJLJLLL;
        if (c50287JoR3 != null && (researchFilterOption = c50287JoR3.getResearchFilterOption()) != null) {
            str5 = researchFilterOption.getRequestContent();
        } else {
            str5 = null;
        }
        Integer num5 = this.LLI;
        String str17 = this.LLIFFJFJJ;
        int i11 = this.LJLJI;
        linkedHashMap.isEmpty();
        boolean z2 = true;
        if (this.LJLJJL != 1) {
            z2 = false;
        }
        String LIZ4 = C50116Jlg.LIZ(i11, this.LJLL, z2);
        String str18 = this.LLII;
        Long l = this.LLIIII;
        Integer valueOf2 = Integer.valueOf(this.LJLJJL);
        Long l2 = this.LLIIIILZ;
        if (!FunctionSupportService.INSTANCE.notSupport(IFunctionKey.AD)) {
            str7 = EU3.LIZLLL();
        }
        int LJIILIIL = a.LJIIJ().LJIILIIL();
        String LIZJ = a.LJIIZILJ().LIZJ();
        String str19 = this.LLIIIJ;
        String str20 = this.LLIIIL;
        String str21 = this.LLIIIZ;
        Integer num6 = this.LLIIJI;
        Integer num7 = this.LLIIJLIL;
        Integer valueOf3 = Integer.valueOf(C49627Jdn.LIZIZ() ? 1 : 0);
        String effectSDKVersion = AVExternalServiceImpl.LIZ().abilityService().effectService().getEffectSDKVersion();
        if (!a.LJFF().LJJJJI()) {
            num = null;
        }
        String str22 = this.LLIILII;
        String str23 = this.LLIIL;
        SearchResultParam searchResultParam2 = this.LJLIL;
        if (searchResultParam2 != null) {
            str6 = searchResultParam2.getSugGenerateType();
        } else {
            str6 = null;
        }
        return LIZ3.searchMTMixFeedListByChunk(str9, i5, i6, str8, str10, i7, str2, str11, i8, 0, str3, str12, str13, str14, i, i2, i3, LIZ, str4, LIZIZ, str15, str16, LIZIZ2 ? 1 : 0, i9, i10, linkedHashMap, LJFF, intValue, str5, num5, str17, LIZ4, str18, l, valueOf2, l2, str7, LJIILIIL, LIZJ, str, str19, str20, str21, num6, num7, valueOf3, effectSDKVersion, num, str22, str23, str6, C36033ECf.LIZJ("goods_view_action"));
    }

    public final int hashCode() {
        int i;
        int i2;
        int LJ = (C79062V1e.LJ(this.LJLL, (C79062V1e.LJ(this.LJLJJLL, ((((((this.LJLILLLLZI.hashCode() * 31) + this.LJLJI) * 31) + this.LJLJJI) * 31) + this.LJLJJL) * 31, 31) + this.LJLJLJ) * 31, 31) + this.LJLLI) * 31;
        Integer num = this.LJLLILLLL;
        int i3 = -1;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        int i4 = (LJ + i) * 31;
        Integer num2 = this.LJLLJ;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = -1;
        }
        int i5 = (i4 + i2) * 31;
        Integer num3 = this.LJLLL;
        if (num3 != null) {
            i3 = num3.intValue();
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchMixFeedRequest(keyword='");
        sb.append(this.LJLILLLLZI);
        sb.append("', cursor=");
        sb.append(this.LJLJI);
        sb.append(", count=");
        sb.append(this.LJLJJI);
        sb.append(", pullRefresh=");
        sb.append(this.LJLJJL);
        sb.append(", searchId='");
        sb.append(this.LJLJJLL);
        sb.append("', correctType=");
        sb.append(this.LJLJLJ);
        sb.append(", searchSource='");
        sb.append(this.LJLL);
        sb.append("', hotSearchSource=");
        sb.append(this.LJLLI);
        sb.append(", sortType=");
        sb.append(this.LJLLJ);
        sb.append(", filterBy=");
        sb.append(this.LJLLL);
        sb.append(", clientWidth=");
        return UPJ.LIZLLL(sb, this.LJLLLL, ')');
    }

    static {
        Context LIZIZ = EF7.LIZIZ();
        if (C49939Jip.LIZ == 0) {
            C49939Jip.LIZ = C17N.LJJJJI(C60996Nwm.LJIIIIZZ(LIZIZ));
        }
        if (C49939Jip.LIZIZ == 0) {
            C49939Jip.LIZIZ = C17N.LJJJJI(C60996Nwm.LJ(LIZIZ));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(C49915JiR.class, obj.getClass())) {
            return false;
        }
        C49915JiR c49915JiR = (C49915JiR) obj;
        if (this.LJLJI == c49915JiR.LJLJI && this.LJLJJI == c49915JiR.LJLJJI && this.LJLJJL == c49915JiR.LJLJJL && this.LJLJLJ == c49915JiR.LJLJLJ && this.LJLLI == c49915JiR.LJLLI && o.LJ(this.LJLLJ, c49915JiR.LJLLJ) && o.LJ(this.LJLLL, c49915JiR.LJLLL) && o.LJ(this.LJLILLLLZI, c49915JiR.LJLILLLLZI) && o.LJ(this.LJLJJLL, c49915JiR.LJLJJLL) && o.LJ(this.LJLL, c49915JiR.LJLL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC49794JgU
    public final void LIZ(int i, String str) {
        this.LLIILZL = true;
        C49920JiW LJ = C49921JiX.LJ(this.LJLIL);
        LJ.LJI();
        LJ.LJIIJJI(2);
        LJ.LIZLLL();
        C49923JiZ LIZLLL = C49922JiY.LIZLLL(this.LJLIL);
        LIZLLL.LIZJ();
        LIZLLL.LJI(2);
        if (!o.LJ(LIZLLL, C49936Jim.LIZ)) {
            LIZLLL.LJIILIIL = i;
        }
        LIZLLL.LIZIZ();
        C49950Jj0.LIZLLL(new AqS31S1000000_8(str, 2));
    }
}
