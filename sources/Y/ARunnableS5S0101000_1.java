package Y;

import X.C1034444e;
import X.C3GB;
import X.C4KC;
import X.C58042Po;
import X.C58162Qa;
import X.C58662Ry;
import X.C59171NKd;
import X.C59177NKj;
import X.C59181NKn;
import X.C78949Uyf;
import X.C80796VnM;
import X.NKM;
import X.NKP;
import X.OD6;
import X.ORZ;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMServiceProvider;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ARunnableS5S0101000_1 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void run$11(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        ((BaseListFragmentPanel) aRunnableS5S0101000_1.l0).lambda$partitionFrameExecPageSelected$4(aRunnableS5S0101000_1.i1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (((C58042Po) this.l0).LJLJL.isDestroy()) {
            return;
        }
        if (((C58042Po) this.l0).LJLJL.viewPagerComponent.FQ() == 0) {
            FeedAdServiceImpl.LJJIJLIJ().LJJIII();
            C58162Qa.LIZ(C59181NKn.LIZ, ((C58042Po) this.l0).LJLJL.mAdapter.Q8(), this.i1);
            ((C58042Po) this.l0).LJLJL.mHandler.removeCallbacks(this);
            return;
        }
        ((C58042Po) this.l0).LJLJL.mHandler.postDelayed(this, 100L);
    }

    public final void LIZ$1() {
        if (((C58042Po) this.l0).LJLJL.viewPagerComponent.FQ() == 0) {
            FeedAdServiceImpl.LJJIJLIJ().LJIIIZ();
            C58162Qa.LIZ(C59171NKd.LIZ, ((C58042Po) this.l0).LJLJL.mAdapter.Q8(), this.i1);
            ((C58042Po) this.l0).LJLJL.mHandler.removeCallbacks(this);
            return;
        }
        ((C58042Po) this.l0).LJLJL.mHandler.postDelayed(this, 100L);
    }

    public final void LIZ$2() {
        if (((C58042Po) this.l0).LJLJL.viewPagerComponent.FQ() == 0) {
            FeedAdServiceImpl.LJJIJLIJ().LJIILJJIL();
            C58162Qa.LIZ(NKM.LIZ, ((C58042Po) this.l0).LJLJL.mAdapter.Q8(), this.i1);
            ((C58042Po) this.l0).LJLJL.mHandler.removeCallbacks(this);
            return;
        }
        ((C58042Po) this.l0).LJLJL.mHandler.postDelayed(this, 100L);
    }

    public final void LIZ$3() {
        if (((C58042Po) this.l0).LJLJL.viewPagerComponent.FQ() == 0) {
            FeedAdServiceImpl.LJJIJLIJ().LIZJ();
            C58162Qa.LIZ(C59177NKj.LIZ, ((C58042Po) this.l0).LJLJL.mAdapter.Q8(), this.i1);
            ((C58042Po) this.l0).LJLJL.mHandler.removeCallbacks(this);
            return;
        }
        ((C58042Po) this.l0).LJLJL.mHandler.postDelayed(this, 100L);
    }

    public final void LIZ$4() {
        if (((C58042Po) this.l0).LJLJL.viewPagerComponent.FQ() == 0) {
            FeedAdServiceImpl.LJJIJLIJ().LJJIIJZLJL();
            C58162Qa.LIZ(C58662Ry.LIZ, ((C58042Po) this.l0).LJLJL.mAdapter.Q8(), this.i1);
            ((C58042Po) this.l0).LJLJL.mHandler.removeCallbacks(this);
            return;
        }
        ((C58042Po) this.l0).LJLJL.mHandler.postDelayed(this, 100L);
    }

    public final void LIZ$5() {
        FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) this.l0;
        if (fullFeedFragmentPanel.mCheckLoadMoreListener != null && fullFeedFragmentPanel.mCurIndex < fullFeedFragmentPanel.mAdapter.getCount() - ((FullFeedFragmentPanel) this.l0).LJJJLZIJ()) {
            FullFeedFragmentPanel fullFeedFragmentPanel2 = (FullFeedFragmentPanel) this.l0;
            if (fullFeedFragmentPanel2.mCurIndex >= fullFeedFragmentPanel2.mAdapter.getCount() - this.i1) {
                ((FullFeedFragmentPanel) this.l0).mCheckLoadMoreListener.mf();
            }
        }
    }

    public static final void run$0(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            ((C3GB) aRunnableS5S0101000_1.l0).getTitleTextView().setText(((C3GB) aRunnableS5S0101000_1.l0).LIZIZ(aRunnableS5S0101000_1.i1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            View view = (View) aRunnableS5S0101000_1.l0;
            if (view != null) {
                int i = aRunnableS5S0101000_1.i1;
                view.setPadding(0, i, 0, i);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            aRunnableS5S0101000_1.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        Window window;
        try {
            Activity LJIILL = C78949Uyf.LJIILL(((BaseChatRoomFragment) aRunnableS5S0101000_1.l0).getRootView().getContext());
            if (LJIILL != null && (window = LJIILL.getWindow()) != null) {
                window.setNavigationBarColor(aRunnableS5S0101000_1.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        Window window;
        try {
            Activity LJIILL = C78949Uyf.LJIILL(((BaseChatRoomFragment) aRunnableS5S0101000_1.l0).getRootView().getContext());
            if (LJIILL != null && (window = LJIILL.getWindow()) != null) {
                window.setNavigationBarColor(aRunnableS5S0101000_1.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            if (((C4KC) aRunnableS5S0101000_1.l0).LLIILZL.getMeasuredHeight() != aRunnableS5S0101000_1.i1) {
                ((C4KC) aRunnableS5S0101000_1.l0).LLIIZ.setMaxLines(1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            IMServiceProvider.INSTANCE.getInboxDmService().onReceiveUnreadCount((List) aRunnableS5S0101000_1.l0, aRunnableS5S0101000_1.i1, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            ((C1034444e) aRunnableS5S0101000_1.l0).LIZ(aRunnableS5S0101000_1.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        boolean z;
        try {
            MessageRequestsActivity messageRequestsActivity = (MessageRequestsActivity) aRunnableS5S0101000_1.l0;
            if (aRunnableS5S0101000_1.i1 == 0) {
                z = true;
            } else {
                z = false;
            }
            messageRequestsActivity.LLFZ(z, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            for (Map.Entry entry : ((Map) aRunnableS5S0101000_1.l0).entrySet()) {
                OD6.LJII(2, null, null, (String) entry.getKey(), ORZ.LLD((Iterable) entry.getValue(), ",", null, null, null, 62), aRunnableS5S0101000_1.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            View view = (View) aRunnableS5S0101000_1.l0;
            if (view != null) {
                int i = aRunnableS5S0101000_1.i1;
                view.setPadding(0, i, 0, i);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        DetailFragmentPanel detailFragmentPanel;
        C80796VnM c80796VnM;
        try {
            if (aRunnableS5S0101000_1.i1 < ((DetailFragmentPanel) aRunnableS5S0101000_1.l0).mAdapter.getCount() - 1 && (c80796VnM = (detailFragmentPanel = (DetailFragmentPanel) aRunnableS5S0101000_1.l0).mViewPager) != null) {
                int i = aRunnableS5S0101000_1.i1 + 1;
                detailFragmentPanel.mCurIndex = i;
                detailFragmentPanel.mSetItem = true;
                c80796VnM.setCurrentItemWithDefaultVelocity(i);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            if (((C58042Po) aRunnableS5S0101000_1.l0).LJLJL.mAdapter != null) {
                FeedAdServiceImpl.LJJIJLIJ().LJIIZILJ();
                C58162Qa.LIZ(NKP.LIZ, ((C58042Po) aRunnableS5S0101000_1.l0).LJLJL.mAdapter.Q8(), aRunnableS5S0101000_1.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            aRunnableS5S0101000_1.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            aRunnableS5S0101000_1.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            aRunnableS5S0101000_1.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            aRunnableS5S0101000_1.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS5S0101000_1 aRunnableS5S0101000_1) {
        boolean LIZ;
        try {
            aRunnableS5S0101000_1.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S0101000_1(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
