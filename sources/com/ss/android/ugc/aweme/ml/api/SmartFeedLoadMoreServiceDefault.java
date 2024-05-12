package com.ss.android.ugc.aweme.ml.api;

import X.InterfaceC48047ItP;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SmartFeedLoadMoreServiceDefault extends SmartFeedLoadMoreService {
    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public void addVideoPlayEndReportData(HashMap<String, Object> map, Aweme aweme, Integer num) {
        o.LJIIIZ(map, "map");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService
    public void addVideoPlayEndReportData(JSONObject jsonObject, Aweme aweme, Integer num) {
        o.LJIIIZ(jsonObject, "jsonObject");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService
    public boolean enable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService
    public void ensureEvaluatorAvailable() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public boolean isSmartFeedLoadMoreScene(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public boolean needCheckLoadMore(int i, int i2, Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public void startSmartFeedLoadMoreJudge(Aweme aweme, InterfaceC48047ItP callback) {
        o.LJIIIZ(callback, "callback");
    }
}
