package com.ss.android.ugc.aweme;

import X.ActivityC45651qj;
import X.EE1;

/* loaded from: classes2.dex */
public interface IWatchHistoryApi {
    void checkRecordThenHandleCache();

    EE1 getWatchHistoryInitTask();

    int recordWatchHistoryPermission();

    void tryRecordWatchHistory(String str);

    void tryShowWatchHistoryGuideIfNeed(ActivityC45651qj activityC45651qj, String str);
}
