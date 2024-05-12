package com.ss.android.ugc.aweme.feed.feedwidget;

import X.AbstractC86187Xs7;
import X.C207668Da;
import X.C86188Xs8;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* loaded from: classes16.dex */
public class FeedLiveWindowWidget extends AbsFeedWidget {
    public C86188Xs8 LJLJLLL;
    public View LJLL;

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget, com.ss.android.ugc.aweme.arch.widgets.GenericWidget
    /* renamed from: LJIILJJIL */
    public final void onChanged(C207668Da c207668Da) {
        super.onChanged(c207668Da);
        if (c207668Da != null) {
            Object obj = c207668Da.LIZIZ;
            Object obj2 = null;
            if (obj == null || !(obj instanceof VideoItemParams) || !"awesome_update_data".equals(c207668Da.LIZ)) {
                return;
            }
            Object obj3 = c207668Da.LIZIZ;
            if (obj3 != null) {
                obj2 = obj3;
            }
            VideoItemParams videoItemParams = (VideoItemParams) obj2;
            AbstractC86187Xs7 abstractC86187Xs7 = this.LJLJLJ;
            if (abstractC86187Xs7 == null || videoItemParams == null) {
                return;
            }
            abstractC86187Xs7.LJLIL = videoItemParams.getAweme();
            abstractC86187Xs7.LJLILLLLZI = videoItemParams.mEventType;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget
    public final C86188Xs8 LJIILL(View view) {
        C86188Xs8 c86188Xs8 = new C86188Xs8(view);
        this.LJLJLLL = c86188Xs8;
        this.LJLL = c86188Xs8.LJLJJL;
        return c86188Xs8;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget, com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C207668Da c207668Da) {
        onChanged(c207668Da);
    }
}
