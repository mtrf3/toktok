package com.ss.android.ugc.aweme.topicfeed.panel;

import X.AbstractC55082Lja;
import X.C50420Jqa;
import X.C54502LaE;
import X.InterfaceC2302191t;
import X.InterfaceC54489La1;
import X.InterfaceC72642tA;
import X.LJK;
import X.QD3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopicFeedFragmentPanel extends FullFeedFragmentPanel implements InterfaceC54489La1 {
    public int LLIILZL;
    public boolean LLIIZ;

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void handlePageResume() {
        super.handlePageResume();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void handlePageStop(boolean z) {
        super.handlePageStop(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1.LIZIZ(getPageType()) == true) goto L9;
     */
    @X.QD3(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCleanModeChangedEvent(X.LXT r5) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            int r1 = r5.LJLIL
            int r0 = r4.getPageType()
            if (r1 == r0) goto Le
            return
        Le:
            X.LXS r1 = X.LXU.LIZ()
            r3 = 0
            if (r1 == 0) goto L36
            int r0 = r4.getPageType()
            boolean r0 = r1.LIZIZ(r0)
            r2 = 1
            if (r0 != r2) goto L36
        L20:
            X.VnM r0 = r4.mViewPager
            if (r0 == 0) goto L38
            int r1 = r0.getChildCount()
        L28:
            if (r3 >= r1) goto L38
            X.2MA r0 = r4.getCurViewHolderByPosition(r3)
            if (r0 == 0) goto L33
            r0.b2(r2)
        L33:
            int r3 = r3 + 1
            goto L28
        L36:
            r2 = 0
            goto L20
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topicfeed.panel.TopicFeedFragmentPanel.onCleanModeChangedEvent(X.LXT):void");
    }

    @QD3
    public final void onFeedRefreshEvent(LJK ljk) {
        int i;
        if (ljk != null) {
            i = ljk.LJLIL;
        } else {
            i = -1;
        }
        this.LLIILZL = i;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onRenderFirstFrame(String str) {
        super.onRenderFirstFrame(str);
        if (!this.LLIIZ) {
            this.LLIIZ = true;
            String eventType = getEventType();
            o.LJIIIIZZ(eventType, "eventType");
            C54502LaE.LIZLLL(eventType, null, 6);
        }
    }

    public TopicFeedFragmentPanel(String str, int i) {
        super(str, i);
        this.LLIILZL = -1;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void J5(List<? extends Aweme> list, boolean z) {
        super.J5(list, z);
        if (z) {
            ILoadMoreAbility iLoadMoreAbility = this.loadMoreAbility;
            if (iLoadMoreAbility != null) {
                iLoadMoreAbility.resetLoadMoreState();
                return;
            }
            return;
        }
        ILoadMoreAbility iLoadMoreAbility2 = this.loadMoreAbility;
        if (iLoadMoreAbility2 != null) {
            iLoadMoreAbility2.showLoadMoreEmpty();
        }
        ILoadMoreAbility iLoadMoreAbility3 = this.loadMoreAbility;
        if (iLoadMoreAbility3 == null) {
            return;
        }
        iLoadMoreAbility3.fy();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void j0(List<? extends Aweme> list, boolean z) {
        super.j0(list, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final AbstractC55082Lja createFeedPagerAdapter(final Context context, final LayoutInflater inflater, final InterfaceC72642tA<C50420Jqa> listener, final Fragment fragment, final View.OnTouchListener tapTouchListener, final BaseFeedPageParams baseFeedPageParams, final InterfaceC2302191t iHandlePlay) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        return new FullFeedPagerAdapter(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay) { // from class: X.3DE
            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
            public final String LJJIJLIJ() {
                return "topic_feed";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
                o.LJIIIZ(context, "context");
                o.LJIIIZ(inflater, "inflater");
                o.LJIIIZ(listener, "listener");
                o.LJIIIZ(fragment, "fragment");
                o.LJIIIZ(tapTouchListener, "tapTouchListener");
                o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
                o.LJIIIZ(iHandlePlay, "iHandlePlay");
            }
        };
    }
}
