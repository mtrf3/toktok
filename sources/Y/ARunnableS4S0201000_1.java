package Y;

import X.C105544Cg;
import X.C16880lQ;
import X.C34B;
import X.C3L3;
import X.C3L4;
import X.C58162Qa;
import X.C63081OpJ;
import X.C79045V0n;
import X.C80796VnM;
import X.InterfaceC88472Yns;
import X.KL2;
import X.NKZ;
import X.X1D;
import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedFragmentPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mention.ChatRoomMentionPanelAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerComponentTemp;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes2.dex */
public class ARunnableS4S0201000_1 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (((ViewPagerComponentTemp) this.l0).FQ() == 0) {
            FeedAdServiceImpl.LJJIJLIJ().LJIJ();
            C58162Qa.LIZ(NKZ.LIZ, ((BaseListFragmentPanel) this.l1).mAdapter.Q8(), this.i2);
            ((BaseListFragmentPanel) this.l1).mHandler.removeCallbacks(this);
            return;
        }
        ((BaseListFragmentPanel) this.l1).mHandler.postDelayed(this, 100L);
    }

    public final void LIZ$1() {
        Activity activity = ((FullFeedFragmentPanel) this.l1).activity;
        if (activity == null || activity.isFinishing() || this.i2 >= ((FullFeedFragmentPanel) this.l1).mAdapter.getCount() - 1 || ((FullFeedFragmentPanel) this.l1).mViewPager == null || C63081OpJ.LLIIII((Aweme) this.l0)) {
            return;
        }
        FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) this.l1;
        int i = this.i2 + 1;
        fullFeedFragmentPanel.mCurIndex = i;
        fullFeedFragmentPanel.mSetItem = true;
        fullFeedFragmentPanel.mViewPager.setCurrentItemWithDefaultVelocity(i);
    }

    public final void LIZ$2() {
        int i;
        ((ViewGroup) this.l0).getLocationOnScreen(((ChatRoomMentionPanelAssem) this.l1).LJLJL);
        int i2 = ((ChatRoomMentionPanelAssem) this.l1).LJLJL[1];
        if (i2 != 0 && ((ViewGroup) this.l0).getHeight() != (i = this.i2 - i2)) {
            ViewGroup viewGroup = (ViewGroup) this.l0;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = i;
                viewGroup.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public static final void run$0(ARunnableS4S0201000_1 aRunnableS4S0201000_1) {
        boolean LIZ;
        try {
            aRunnableS4S0201000_1.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS4S0201000_1 aRunnableS4S0201000_1) {
        boolean LIZ;
        try {
            aRunnableS4S0201000_1.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS4S0201000_1 aRunnableS4S0201000_1) {
        boolean LIZ;
        try {
            aRunnableS4S0201000_1.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS4S0201000_1 aRunnableS4S0201000_1) {
        boolean LIZ;
        try {
            Handler handler = (Handler) aRunnableS4S0201000_1.l0;
            if (handler == null) {
                try {
                    ((Callable) aRunnableS4S0201000_1.l1).call();
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
            Message obtainMessage = handler.obtainMessage(aRunnableS4S0201000_1.i2);
            try {
                obtainMessage.obj = ((Callable) aRunnableS4S0201000_1.l1).call();
            } catch (Exception e2) {
                obtainMessage.obj = e2;
            }
            ((Handler) aRunnableS4S0201000_1.l0).sendMessage(obtainMessage);
            return;
        } finally {
        }
        if (LIZ) {
        }
    }

    public static final void run$2(ARunnableS4S0201000_1 aRunnableS4S0201000_1) {
        boolean LIZ;
        try {
            FriendsFeedFragmentPanel friendsFeedFragmentPanel = (FriendsFeedFragmentPanel) aRunnableS4S0201000_1.l0;
            C80796VnM c80796VnM = friendsFeedFragmentPanel.mViewPager;
            if (c80796VnM != null) {
                friendsFeedFragmentPanel.mCurIndex = 0;
                if (aRunnableS4S0201000_1.i2 == 0) {
                    friendsFeedFragmentPanel.tryResumePlay((Aweme) aRunnableS4S0201000_1.l1);
                    ((FriendsFeedFragmentPanel) aRunnableS4S0201000_1.l0).mSetItem = false;
                } else {
                    friendsFeedFragmentPanel.mSetItem = true;
                    c80796VnM.LJJJ(0, true);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS4S0201000_1 aRunnableS4S0201000_1) {
        boolean LIZ;
        try {
            ((SessionListViewHolder) aRunnableS4S0201000_1.l0).P((C3L4) aRunnableS4S0201000_1.l1, aRunnableS4S0201000_1.i2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getFromUserAsync , avatar: ");
            LIZ2.append(((C3L3) ((C3L4) aRunnableS4S0201000_1.l1)).LJLJI);
            C34B.LJI("SessionListViewHolder", X1D.LIZIZ(LIZ2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS4S0201000_1 aRunnableS4S0201000_1) {
        boolean LIZ;
        try {
            ((InputMethodManager) aRunnableS4S0201000_1.l0).showSoftInput((View) aRunnableS4S0201000_1.l1, aRunnableS4S0201000_1.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS4S0201000_1 aRunnableS4S0201000_1) {
        boolean LIZ;
        try {
            if (((View) aRunnableS4S0201000_1.l0).getParent() != null) {
                Integer LJI = C79045V0n.LJI(aRunnableS4S0201000_1.i2, (Activity) aRunnableS4S0201000_1.l1);
                if (LJI != null) {
                    Activity activity = (Activity) aRunnableS4S0201000_1.l1;
                    int intValue = LJI.intValue();
                    Window window = activity.getWindow();
                    if (window != null) {
                        window.setNavigationBarColor(intValue);
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS4S0201000_1 aRunnableS4S0201000_1) {
        boolean LIZ;
        try {
            Layout layout = ((TextView) aRunnableS4S0201000_1.l0).getLayout();
            if (layout != null) {
                View view = (View) aRunnableS4S0201000_1.l1;
                int i = aRunnableS4S0201000_1.i2;
                if (layout.getLineCount() > 1) {
                    view.getLayoutParams().height = (int) KL2.LIZJ(view.getContext(), 60.0f);
                    view.requestLayout();
                } else {
                    view.getLayoutParams().height = i;
                    view.requestLayout();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS4S0201000_1 aRunnableS4S0201000_1) {
        boolean LIZ;
        try {
            Layout layout = ((TextView) aRunnableS4S0201000_1.l0).getLayout();
            if (layout != null) {
                View view = (View) aRunnableS4S0201000_1.l1;
                int i = aRunnableS4S0201000_1.i2;
                if (layout.getLineCount() > 1) {
                    view.getLayoutParams().height = (int) KL2.LIZJ(view.getContext(), 60.0f);
                    view.requestLayout();
                } else {
                    view.getLayoutParams().height = i;
                    view.requestLayout();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS4S0201000_1 aRunnableS4S0201000_1) {
        boolean LIZ;
        try {
            ((C105544Cg) aRunnableS4S0201000_1.l0).LL(aRunnableS4S0201000_1.i2, (RecyclerView) aRunnableS4S0201000_1.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS4S0201000_1 aRunnableS4S0201000_1) {
        boolean LIZ;
        try {
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cq9, C16880lQ.LLZIL(((View) aRunnableS4S0201000_1.l0).getContext()), null);
            View view = (View) aRunnableS4S0201000_1.l0;
            view.post(new ARunnableS2S0301000_1(view, aRunnableS4S0201000_1.i2, LLLZIIL, (InterfaceC88472Yns) aRunnableS4S0201000_1.l1, 4));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS4S0201000_1(View view, AqS169S0100000_3 aqS169S0100000_3, int i) {
        this.$t = i;
        this.l0 = view;
        this.i2 = R.id.n90;
        this.l1 = aqS169S0100000_3;
    }

    public ARunnableS4S0201000_1(InputMethodManager inputMethodManager, View view, int i) {
        this.$t = i;
        this.l0 = inputMethodManager;
        this.l1 = view;
        this.i2 = 0;
    }

    public ARunnableS4S0201000_1(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
