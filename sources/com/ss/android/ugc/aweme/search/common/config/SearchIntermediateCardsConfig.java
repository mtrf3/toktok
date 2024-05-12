package com.ss.android.ugc.aweme.search.common.config;

import X.C34061DYj;
import X.C47261Igj;
import X.C50824Jx6;
import X.FHD;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.lynx.core.model.DynamicData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchIntermediateCardsConfig {
    public static DynamicDataList LIZ;
    public static final List<DynamicData> LIZIZ;

    static {
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = "aweme://lynxview/?channel=fe_tiktok_lynx_search_transfer&bundle=template.js&group=fe_tiktok_lynx_search_transfer&ab_params=show_most_visited_account,show_suggest_search_words,intermediate_show_trending_billboard,is_lynx_request_suggest";
        LIZIZ = C47261Igj.LJJIJIL(new DynamicData(0, dynamicPatch, 1, null));
    }

    public static List LIZ() {
        List<DynamicData> list;
        if (C34061DYj.LJLILLLLZI.LJJII()) {
            System.currentTimeMillis();
            FHD.LIZLLL().getClass();
            String LJII = FHD.LJII(0, "search_intermediate_schema", "aweme://lynxview/?channel=fe_tiktok_lynx_search_transfer&bundle=template.js&group=fe_tiktok_lynx_search_transfer&ab_params=show_most_visited_account,show_suggest_search_words,intermediate_show_trending_billboard,is_lynx_request_suggest", true);
            o.LJIIIIZZ(LJII, "getInstance().getStringV…SchemaConfig::class.java)");
            C50824Jx6.LIZ = LJII;
            if (TextUtils.isEmpty(LJII)) {
                C50824Jx6.LIZ = "aweme://lynxview/?channel=fe_tiktok_lynx_search_transfer&bundle=template.js&group=fe_tiktok_lynx_search_transfer&ab_params=show_most_visited_account,show_suggest_search_words,intermediate_show_trending_billboard,is_lynx_request_suggest";
            }
            System.currentTimeMillis();
            DynamicPatch dynamicPatch = new DynamicPatch();
            dynamicPatch.schema = C50824Jx6.LIZ;
            return C47261Igj.LJJIJIL(new DynamicData(0, dynamicPatch, 1, null));
        }
        System.currentTimeMillis();
        DynamicDataList dynamicDataList = (DynamicDataList) SettingsManager.LIZLLL().LJIIIIZZ("search_intermediate_config", DynamicDataList.class, LIZ);
        LIZ = dynamicDataList;
        if (dynamicDataList == null || (list = dynamicDataList.getDefaultConfigs()) == null) {
            list = LIZIZ;
        }
        System.currentTimeMillis();
        return list;
    }

    /* loaded from: classes9.dex */
    public static final class DynamicDataList implements Serializable {
        public static final int $stable = 8;

        @InterfaceC65349Pkn("data_list")
        public List<DynamicData> defaultConfigs = new ArrayList();

        public final List<DynamicData> getDefaultConfigs() {
            return this.defaultConfigs;
        }

        public final void setDefaultConfigs(List<DynamicData> list) {
            o.LJIIIZ(list, "<set-?>");
            this.defaultConfigs = list;
        }
    }
}
