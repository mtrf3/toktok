package com.ss.android.ugc.aweme.feed.api;

import X.LAO;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes10.dex */
public interface IFeedModuleService {
    boolean canResumePlay();

    boolean fullscreenShowLive();

    Integer getInsertIndex(int i, Aweme aweme);

    void initLegoInflate();

    void maybeMonitorTimeSpend(Aweme aweme, Long l);

    LAO newTopNoticeFeedManager(Activity activity, View view);

    void refreshComment(Fragment fragment);
}
