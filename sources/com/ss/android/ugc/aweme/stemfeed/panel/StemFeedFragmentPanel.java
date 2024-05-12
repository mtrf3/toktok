package com.ss.android.ugc.aweme.stemfeed.panel;

import X.AbstractC55082Lja;
import X.C2MA;
import X.C50420Jqa;
import X.C54502LaE;
import X.C80796VnM;
import X.IKK;
import X.InterfaceC2302191t;
import X.InterfaceC72642tA;
import X.LJK;
import X.LXS;
import X.LXU;
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
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class StemFeedFragmentPanel extends FullFeedFragmentPanel {
    public int LLIILZL;
    public boolean LLIIZ;

    public StemFeedFragmentPanel(String str) {
        super(str, 36);
        this.LLIILZL = -1;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCleanModeChangedEvent(IKK event) {
        Boolean bool;
        o.LJIIIZ(event, "event");
        LXS LIZ = LXU.LIZ();
        if (LIZ != null) {
            bool = Boolean.valueOf(LIZ.LJII);
        } else {
            bool = null;
        }
        C80796VnM c80796VnM = this.mViewPager;
        if (c80796VnM != null) {
            int childCount = c80796VnM.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C2MA curViewHolderByPosition = getCurViewHolderByPosition(i);
                if (curViewHolderByPosition != null) {
                    o.LJI(bool);
                    curViewHolderByPosition.b2(bool.booleanValue());
                }
            }
        }
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
        return new FullFeedPagerAdapter(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay) { // from class: X.3DF
            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
            public final String LJJIJLIJ() {
                return "stem_feed";
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
