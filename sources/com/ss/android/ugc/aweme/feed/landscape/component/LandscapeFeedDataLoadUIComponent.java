package com.ss.android.ugc.aweme.feed.landscape.component;

import android.view.View;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LandscapeFeedDataLoadUIComponent extends BasePanelUIComponent {
    public FeedSwipeRefreshLayout LJLJJI;

    public LandscapeFeedDataLoadUIComponent() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        FeedSwipeRefreshLayout feedSwipeRefreshLayout;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (view instanceof FeedSwipeRefreshLayout) {
            feedSwipeRefreshLayout = (FeedSwipeRefreshLayout) view;
        } else {
            feedSwipeRefreshLayout = null;
        }
        this.LJLJJI = feedSwipeRefreshLayout;
        if (feedSwipeRefreshLayout != null) {
            feedSwipeRefreshLayout.setEnabled(false);
        }
        FeedSwipeRefreshLayout feedSwipeRefreshLayout2 = this.LJLJJI;
        if (feedSwipeRefreshLayout2 != null) {
            feedSwipeRefreshLayout2.findViewById(R.id.g99);
        }
    }
}
