package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.HorizontalLoadMoreMethod;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JeO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49664JeO implements InterfaceC73463SsN<String> {
    public final /* synthetic */ HorizontalLoadMoreMethod LJLIL;
    public final /* synthetic */ InterfaceC37146Ehy LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLILLLLZI.LIZ(-1, e.getMessage());
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        this.LJLIL.LJLIL = d;
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(String str) {
        DynamicPatch dynamicPatch;
        List<Aweme> awemeList;
        JSE jse;
        DynamicPatch dynamicPatch2;
        List<java.util.Map<?, ?>> awemeListRaw;
        String t = str;
        o.LJIIIZ(t, "t");
        try {
            SearchHorizontalData searchHorizontalData = (SearchHorizontalData) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), t, new C49665JeP().getType());
            if (searchHorizontalData != null) {
                List<? extends java.util.Map<?, ?>> list = searchHorizontalData.awemeListRaw;
                if (list != null && (jse = this.LJLIL.LJLILLLLZI) != null && (dynamicPatch2 = jse.LIZ) != null && (awemeListRaw = dynamicPatch2.getAwemeListRaw()) != null) {
                    awemeListRaw.addAll(list);
                }
                List<Aweme> LJ = searchHorizontalData.LJ();
                if (LJ != null) {
                    HorizontalLoadMoreMethod horizontalLoadMoreMethod = this.LJLIL;
                    String str2 = this.LJLJI;
                    String str3 = this.LJLJJI;
                    Iterator it = ((ArrayList) LJ).iterator();
                    while (it.hasNext()) {
                        Aweme aweme = (Aweme) it.next();
                        int hashCode = str2.hashCode();
                        if (hashCode != -975674851) {
                            if (hashCode != -852406647) {
                                if (hashCode == 496508917 && str2.equals("tt_trendingcontent")) {
                                    aweme.setSearchFeedType("SearchHotSpot");
                                    aweme.appendExtraParamUseInSearch("token_type", str2);
                                    aweme.appendExtraParamUseInSearch("search_result_id", str3);
                                }
                            } else if (str2.equals("tt_search_trending_automatic")) {
                                aweme.setSearchFeedType("SearchHotSpot");
                                aweme.appendExtraParamUseInSearch("token_type", str2);
                                aweme.appendExtraParamUseInSearch("search_result_id", str3);
                            }
                        } else if (str2.equals("tt_search_trending")) {
                            aweme.setSearchFeedType("SearchHotSpot");
                            aweme.appendExtraParamUseInSearch("token_type", str2);
                            aweme.appendExtraParamUseInSearch("search_result_id", str3);
                        }
                    }
                    JSE jse2 = horizontalLoadMoreMethod.LJLILLLLZI;
                    if (jse2 != null && (dynamicPatch = jse2.LIZ) != null && (awemeList = dynamicPatch.getAwemeList()) != null) {
                        awemeList.addAll(LJ);
                    }
                }
            }
            JSE jse3 = this.LJLIL.LJLILLLLZI;
            if (jse3 != null) {
                jse3.LJII = t;
            }
            this.LJLILLLLZI.onSuccess(t);
        } catch (C38333F2r e) {
            this.LJLILLLLZI.LIZ(-1, e.getMessage());
        }
    }

    public C49664JeO(HorizontalLoadMoreMethod horizontalLoadMoreMethod, InterfaceC37146Ehy interfaceC37146Ehy, String str, String str2) {
        this.LJLIL = horizontalLoadMoreMethod;
        this.LJLILLLLZI = interfaceC37146Ehy;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }
}
