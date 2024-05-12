package X;

import com.ss.android.ugc.feed.platform.panel.pip.RecommendFeedPipComponent;

/* loaded from: classes9.dex */
public final class JCR implements InterfaceC55066LjK {
    public final /* synthetic */ RecommendFeedPipComponent LIZ;

    @Override // X.InterfaceC55066LjK
    public final void onEmpty() {
        JCQ jcq = this.LIZ.LJLLI;
        if (jcq != null) {
            jcq.onEmpty();
        }
        this.LIZ.LJLLI = null;
    }

    @Override // X.InterfaceC55066LjK
    public final void onFailed() {
        JCQ jcq = this.LIZ.LJLLI;
        if (jcq != null) {
            jcq.onError();
        }
        this.LIZ.LJLLI = null;
    }

    public JCR(RecommendFeedPipComponent recommendFeedPipComponent) {
        this.LIZ = recommendFeedPipComponent;
    }
}
