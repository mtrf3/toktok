package com.ss.android.ugc.aweme.legacy.api;

import X.AbstractC73638SvC;
import X.C221108m2;
import X.C36305EMr;
import X.C62822Ol8;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.KF2;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchSuggestWordsApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C36305EMr.LJLIL);

    /* loaded from: classes9.dex */
    public interface SuggestApi {
        @InterfaceC195787mI
        @E4T("/aweme/v1/suggest/guide/")
        AbstractC73638SvC<SuggestWordResponse> postSuggestSearchList(@InterfaceC64987Pex("business_id") String str, @InterfaceC64987Pex("from_group_id") String str2, @InterfaceC64987Pex("group_id") String str3, @InterfaceC64987Pex("pd") String str4, @InterfaceC64987Pex("history_list") String str5, @InterfaceC64987Pex("is_debug") String str6, @InterfaceC64987Pex("req_source") String str7, @InterfaceC64987Pex("src_material_id") String str8, @InterfaceC64987Pex("src_anchor_product_id") String str9, @InterfaceC64987Pex("src_live_room_id") String str10, @InterfaceC64987Pex("src_author_id") String str11);
    }

    public static AbstractC73638SvC LIZ(KF2 param) {
        boolean z;
        o.LJIIIZ(param, "param");
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-S_API>(...)");
        SuggestApi suggestApi = (SuggestApi) value;
        String str = param.LIZ;
        String LJJIFFI = CommonFeedApiService.LIZ().LJJIFFI();
        if (LJJIFFI == null || LJJIFFI.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJJIFFI = "";
        }
        String LJJIFFI2 = CommonFeedApiService.LIZ().LJJIFFI();
        if (LJJIFFI2 == null || LJJIFFI2.length() == 0) {
            LJJIFFI2 = "";
        }
        return suggestApi.postSuggestSearchList(str, LJJIFFI, LJJIFFI2, param.LIZIZ, SearchServiceImpl.LLLZI().LLLLIIIILLL(), param.LIZJ, param.LIZLLL, param.LJ, param.LJFF, param.LJI, param.LJII);
    }
}
