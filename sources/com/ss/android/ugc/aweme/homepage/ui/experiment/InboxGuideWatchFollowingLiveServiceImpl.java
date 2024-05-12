package com.ss.android.ugc.aweme.homepage.ui.experiment;

import X.ActivityC45651qj;
import X.C84763XOl;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.homepage.business.IInboxGuideWatchFollowingLiveService;

/* loaded from: classes10.dex */
public final class InboxGuideWatchFollowingLiveServiceImpl implements IInboxGuideWatchFollowingLiveService {
    @Override // com.ss.android.ugc.aweme.homepage.business.IInboxGuideWatchFollowingLiveService
    public void jumpToFollowingTab() {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ instanceof ActivityC45651qj) {
            Hox.LJLLI.LIZ((ActivityC45651qj) LJIIIIZZ).Cv0(new Bundle(), "Following");
        }
    }
}
