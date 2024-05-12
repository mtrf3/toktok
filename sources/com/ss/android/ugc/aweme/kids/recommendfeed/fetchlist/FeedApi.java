package com.ss.android.ugc.aweme.kids.recommendfeed.fetchlist;

import X.AFI;
import X.AbstractC73672Svk;
import X.C47636Imm;
import X.C56662Kg;
import X.C69200RDw;
import X.C69682RWk;
import X.C73805Sxt;
import X.E6L;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsSettingsServiceImpl;

/* loaded from: classes10.dex */
public final class FeedApi {
    public static final RetrofitApi LIZ = (RetrofitApi) RetrofitFactory.LIZLLL().create(AFI.LIZ).create(RetrofitApi.class);

    /* loaded from: classes10.dex */
    public interface RetrofitApi {
        @E6L(2)
        @E8L("/tiktok/v1/kids/feed/")
        AbstractC73672Svk<C69200RDw> fetchRecommendFeed(@InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("pull_type") int i2, @InterfaceC64986Pew("volume") double d, @InterfaceC64986Pew("cached_item_num") Integer num, @InterfaceC64986Pew("cmpl_enc") String str);
    }

    public static C73805Sxt LIZ(int i) {
        if (C56662Kg.LIZ().LIZLLL) {
            C56662Kg.LIZ().LJFF("feed_request_to_feed_api", false);
            C56662Kg.LIZ().LIZJ("feed_compose_params", false);
        }
        if (C56662Kg.LIZ().LIZLLL) {
            C56662Kg.LIZ().LJFF("feed_compose_params", false);
            C56662Kg.LIZ().LIZIZ(System.currentTimeMillis(), "feed_api_to_net_api", false);
        }
        C73805Sxt LJJIJL = LIZ.fetchRecommendFeed(8, i, C47636Imm.LJII(2), 0, KidsSettingsServiceImpl.LJIIJJI().LIZJ()).LJJIJL(C69682RWk.LJLIL);
        if (C56662Kg.LIZ().LIZLLL) {
            C56662Kg.LIZ().LJFF("feed_net_api_to_feed_api", false);
            C56662Kg.LIZ().LIZJ("feed_api_to_ui_response", false);
        }
        return LJJIJL;
    }
}
