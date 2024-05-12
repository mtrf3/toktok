package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.RelevantClip;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TranslateSearchDesc;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Jgx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49823Jgx extends AbstractC49793JgT<Aweme, SearchMix> {
    public static final /* synthetic */ int LJZL = 0;
    public int LJLLLLLL;
    public String LJZI;
    public final String LJLLLL = "";
    public String LJLZ = "video_search";
    public String LJZ = CardStruct.IStatusCode.DEFAULT;

    @Override // X.AbstractC49793JgT
    public final int LJIILL() {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((SearchMix) t).hasMore) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final void onModelBound() {
        super.onModelBound();
        if (this.LJZI != null) {
            C49603JdP.LIZLLL(this.LJZI, this.LJZ, getItems());
        }
    }

    @Override // X.AbstractC49793JgT
    public final void LJIJJ(List<? extends Aweme> list) {
        int i;
        super.LJIJJ(list);
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        this.LJLLLLLL = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC49793JgT, X.C8BS
    /* renamed from: LJIJJLI, reason: merged with bridge method [inline-methods] */
    public final void handleData(SearchMix searchMix) {
        boolean z;
        List<Aweme> awemeList;
        boolean z2;
        boolean z3;
        Aweme aweme;
        int i;
        String str;
        List<Float> list;
        Boolean bool;
        SearchAwemeInfo searchAwemeInfo;
        List<TranslateSearchDesc> list2;
        TranslateSearchDesc translateSearchDesc;
        super.handleData(searchMix);
        if (searchMix == 0 || C79004UzY.LJJIFFI(searchMix.getAwemeList())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            if (searchMix != 0) {
                List<Aweme> awemeList2 = searchMix.getAwemeList();
                if (awemeList2 != null) {
                    int size = awemeList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Object obj = ListProtector.get(searchMix.getAwemeList(), i2);
                        IAwemeService LIZ = AwemeService.LIZ();
                        if (LIZ != null) {
                            aweme = LIZ.R1((Aweme) obj);
                        } else {
                            aweme = null;
                        }
                        T t = this.mData;
                        if (t == 0 || ((SearchMix) t).getAwemeList() == null) {
                            i = 0;
                        } else {
                            i = ((SearchMix) this.mData).getAwemeList().size();
                        }
                        aweme.setRequestId(this.LJLLI);
                        if ((!((ArrayList) searchMix.LJI()).isEmpty()) && (searchAwemeInfo = (SearchAwemeInfo) ListProtector.get(searchMix.LJI(), i2)) != null && (list2 = searchAwemeInfo.translateSearchList) != null && (translateSearchDesc = (TranslateSearchDesc) ListProtector.get(list2, 0)) != null) {
                            aweme.setSearchDocTranslate(translateSearchDesc.searchDesc);
                            aweme.setSearchDocOriginLanguage(translateSearchDesc.originLanguage);
                        }
                        GlobalDoodleConfig globalDoodleConfig = searchMix.globalDoodleConfig;
                        if (globalDoodleConfig != null) {
                            str = globalDoodleConfig.getTnsBanType();
                        } else {
                            str = null;
                        }
                        if (o.LJ(str, "Pass")) {
                            aweme.appendExtraParamUseInSearch("is_search_video", "1");
                        }
                        IRequestIdService LJ = RequestIdService.LJ();
                        if (LJ != null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(aweme.getAid());
                            LIZ2.append('9');
                            LJ.LIZJ(i + i2, X1D.LIZIZ(LIZ2), this.LJLLI);
                        }
                        ListProtector.set(awemeList2, i2, aweme);
                        aweme.setAwemePosition(i2);
                        RelevantClip relevantClip = (RelevantClip) ORZ.LJLLLLLL(i2, searchMix.LJ());
                        if (relevantClip != null && (bool = relevantClip.enableSkipButton) != null) {
                            aweme.setVideoSkipEnableSkipButton(bool.booleanValue());
                        }
                        RelevantClip relevantClip2 = (RelevantClip) ORZ.LJLLLLLL(i2, searchMix.LJ());
                        if (relevantClip2 != null && (list = relevantClip2.relevantTimes) != null) {
                            aweme.setVideoSkipRelevantTime(list);
                        }
                    }
                    C49369JZd c49369JZd = C49369JZd.LIZ;
                    if (this.mListQueryType == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i3 = this.LJLLLLLL;
                    c49369JZd.getClass();
                    this.LJLLLLLL = C49369JZd.LJ(i3, z2, awemeList2);
                    int i4 = this.mListQueryType;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            LJIIIZ(awemeList2);
                            SearchMix searchMix2 = (SearchMix) this.mData;
                            if (searchMix2 != null) {
                                if (searchMix.hasMore && searchMix2.hasMore) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                searchMix2.hasMore = z3;
                                searchMix2.cursor = searchMix.cursor;
                            }
                        }
                    } else {
                        this.mData = searchMix;
                        LJIJJ(awemeList2);
                    }
                    if (this.LJZI != null) {
                        C49603JdP.LIZLLL(this.LJZI, this.LJZ, getItems());
                    }
                }
            } else {
                return;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMix;
                LJIIJJI();
            }
            T t2 = this.mData;
            if (t2 != 0) {
                ((SearchMix) t2).hasMore = false;
            }
        }
        if (searchMix == 0 || (awemeList = searchMix.getAwemeList()) == null || awemeList.isEmpty()) {
            return;
        }
        C7HV c7hv = C7HV.LIZIZ;
        List<Aweme> awemeList3 = searchMix.getAwemeList();
        o.LJIIIIZZ(awemeList3, "data.awemeList");
        c7hv.LIZJ(awemeList3, C7KB.OTHERS);
    }

    public final void LJIL(C50031JkJ c50031JkJ) {
        this.LJLIL = c50031JkJ.LJIIJJI;
        C50026JkE c50026JkE = new C50026JkE(this, c50031JkJ);
        c50026JkE.LJLILLLLZI = c50031JkJ.LJIIZILJ;
        this.LJLJJLL = c50026JkE;
        FGR.LIZIZ().LIZ(this.mHandler, c50026JkE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        C50031JkJ c50031JkJ;
        o.LJIIIZ(params, "params");
        Integer num = 1;
        String str = "";
        String str2 = null;
        int i = 0;
        if (params.length == 1) {
            String LJIIL = LJIIL(params);
            if (!isDataEmpty()) {
                i = ((SearchMix) this.mData).cursor;
            }
            long j = i;
            String str3 = this.LJLLJ;
            if (str3 != null) {
                str = str3;
            }
            C50287JoR c50287JoR = this.LJLIL;
            String LJIILJJIL = LJIILJJIL();
            int i2 = this.LJLL;
            String str4 = this.LJLLILLLL;
            String str5 = this.LJLZ;
            String str6 = this.LJLLLL;
            String str7 = this.LJLLL;
            if (!a.LJFF().LJJJJI()) {
                num = null;
            }
            SearchResultParam searchResultParam = this.LJLJJI;
            if (searchResultParam != null) {
                str2 = searchResultParam.getSugGenerateType();
            }
            c50031JkJ = new C50031JkJ(LJIIL, str4, str5, i2, 1, str, str7, j, 10, LJIILJJIL, c50287JoR, str6, null, null, null, null, null, num, str2, null, null, 1073733634, 3);
        } else {
            String LJIIL2 = LJIIL(params);
            if (!isDataEmpty()) {
                i = ((SearchMix) this.mData).cursor;
            }
            long j2 = i;
            String str8 = this.LJLLJ;
            if (str8 != null) {
                str = str8;
            }
            Object obj = params[3];
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            C50287JoR c50287JoR2 = (C50287JoR) params[4];
            String LJIILJJIL2 = LJIILJJIL();
            int i3 = this.LJLL;
            String str9 = this.LJLLILLLL;
            String str10 = this.LJLZ;
            String str11 = this.LJLLLL;
            String str12 = this.LJLLL;
            if (!a.LJFF().LJJJJI()) {
                num = null;
            }
            SearchResultParam searchResultParam2 = this.LJLJJI;
            if (searchResultParam2 != null) {
                str2 = searchResultParam2.getSugGenerateType();
            }
            c50031JkJ = new C50031JkJ(LJIIL2, str9, str10, i3, intValue, str, str12, j2, 10, LJIILJJIL2, c50287JoR2, str11, null, null, null, null, null, num, str2, null, null, 1073733634, 3);
        }
        LJIL(c50031JkJ);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        C50031JkJ c50031JkJ;
        o.LJIIIZ(params, "params");
        Integer num = 1;
        String str = null;
        if (params.length == 1) {
            String LJIIL = LJIIL(params);
            C50287JoR c50287JoR = this.LJLIL;
            String LJIILJJIL = LJIILJJIL();
            int i = this.LJLL;
            String str2 = this.LJLLILLLL;
            String str3 = this.LJLZ;
            String str4 = this.LJLLLL;
            String str5 = this.LJLLL;
            String LIZIZ = C50236Jnc.LIZ().LIZIZ();
            if (!a.LJFF().LJJJJI()) {
                num = null;
            }
            SearchResultParam searchResultParam = this.LJLJJI;
            if (searchResultParam != null) {
                str = searchResultParam.getSugGenerateType();
            }
            c50031JkJ = new C50031JkJ(LJIIL, str2, str3, i, 1, "", str5, 0L, 10, LJIILJJIL, c50287JoR, str4, null, null, null, LIZIZ, null, num, str, Long.valueOf(C17N.LJJJJLL().IO().LIZJ().LJLIL), null, 1073201154, 2);
        } else {
            String LJIIL2 = LJIIL(params);
            Object obj = params[3];
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            C50287JoR c50287JoR2 = (C50287JoR) params[4];
            String LJIILJJIL2 = LJIILJJIL();
            int i2 = this.LJLL;
            String str6 = this.LJLLILLLL;
            String str7 = this.LJLZ;
            String str8 = this.LJLLLL;
            String str9 = this.LJLLL;
            String LIZIZ2 = C50236Jnc.LIZ().LIZIZ();
            if (!a.LJFF().LJJJJI()) {
                num = null;
            }
            SearchResultParam searchResultParam2 = this.LJLJJI;
            if (searchResultParam2 != null) {
                str = searchResultParam2.getSugGenerateType();
            }
            c50031JkJ = new C50031JkJ(LJIIL2, str6, str7, i2, intValue, "", str9, 0L, 10, LJIILJJIL2, c50287JoR2, str8, null, null, null, LIZIZ2, null, num, str, Long.valueOf(C17N.LJJJJLL().IO().LIZJ().LJLIL), null, 1073201154, 2);
        }
        LJIL(c50031JkJ);
    }
}
