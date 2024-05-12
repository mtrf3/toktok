package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel;

import X.C232609Ay;
import X.C33Q;
import X.C8YE;
import X.TB5;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SearchTranslationVM extends AssemViewModelWithItem<C232609Ay, Aweme> implements C8YE<C232609Ay, Aweme> {
    public static boolean LJLJI;
    public boolean LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C232609Ay(0);
    }

    @Override // X.C8YE
    public final Object b50(C33Q state, Object item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    public static JSONObject hv0(int i, Aweme aweme, TB5 cache) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(cache, "cache");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", aweme.getAid());
        jSONObject.put("language", cache.LIZIZ);
        jSONObject.put("url", cache.LJI);
        jSONObject.put("sub_id", i);
        jSONObject.put("expire", System.currentTimeMillis() + 259200000);
        jSONObject.put("language_id", 1);
        jSONObject.put("format", "webvtt");
        jSONObject.put("source", "MU");
        jSONObject.put("version", "");
        return jSONObject;
    }

    @Override // X.C8YE
    public final C232609Ay HU(C232609Ay state, Aweme item, List list) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return new C232609Ay(0);
    }
}
