package com.ss.android.ugc.aweme.ml.api;

import X.InterfaceC48047ItP;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;

/* loaded from: classes9.dex */
public interface ISmartFeedLoadMoreService {
    void addVideoPlayEndReportData(HashMap<String, Object> hashMap, Aweme aweme, Integer num);

    void checkAndInit();

    boolean isSmartFeedLoadMoreScene(String str);

    boolean needCheckLoadMore(int i, int i2, Aweme aweme);

    void startSmartFeedLoadMoreJudge(Aweme aweme, InterfaceC48047ItP interfaceC48047ItP);
}
