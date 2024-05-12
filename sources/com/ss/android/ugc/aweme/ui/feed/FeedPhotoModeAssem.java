package com.ss.android.ugc.aweme.ui.feed;

import X.C2044180n;
import X.C8VR;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedPhotoModeAssem extends FeedVideoAssem {
    public final C2044180n LLIFFJFJJ;

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS169S0100000_3(this, 511));
        super.onViewCreated(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedPhotoModeAssem(BaseFeedPageParams baseFeedPageParams, AqS153S0100000_3 aqS153S0100000_3, ConcurrentHashSet concurrentHashSet, C2044180n timeLogger) {
        super(baseFeedPageParams, aqS153S0100000_3, 6, concurrentHashSet);
        o.LJIIIZ(timeLogger, "timeLogger");
        new LinkedHashMap();
        this.LLIFFJFJJ = timeLogger;
    }
}
