package com.ss.android.ugc.aweme.feed.assem.ability;

import X.C2K0;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes4.dex */
public interface IPanelUIAbility extends C2K0 {
    void enableSwipeToRefresh(boolean z);

    Aweme getSelectedAweme();

    boolean hasNextFeed();

    boolean hasNextFeedWithoutRequest();

    void openPinchToClearGuide(String str, String str2);

    void operatePauseButton(boolean z);
}
