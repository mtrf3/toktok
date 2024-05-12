package com.ss.android.ugc.aweme.ml.api;

import X.C48048ItQ;
import X.C48049ItR;
import X.InterfaceC48047ItP;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class SmartFeedLoadMoreService implements ISmartFeedLoadMoreService {
    public static final C48049ItR Companion = new C48049ItR();
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public abstract /* synthetic */ void addVideoPlayEndReportData(HashMap<String, Object> hashMap, Aweme aweme, Integer num);

    public abstract /* synthetic */ void addVideoPlayEndReportData(JSONObject jSONObject, Aweme aweme, Integer num);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public abstract /* synthetic */ void checkAndInit();

    public abstract /* synthetic */ boolean enable();

    public abstract /* synthetic */ void ensureEvaluatorAvailable();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public abstract /* synthetic */ boolean isSmartFeedLoadMoreScene(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public abstract /* synthetic */ boolean needCheckLoadMore(int i, int i2, Aweme aweme);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public abstract /* synthetic */ void startSmartFeedLoadMoreJudge(Aweme aweme, InterfaceC48047ItP interfaceC48047ItP);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartFeedLoadMoreService instance() {
        Companion.getClass();
        return C48048ItQ.LIZ;
    }
}
