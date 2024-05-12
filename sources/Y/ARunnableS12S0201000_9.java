package Y;

import X.C113554cx;
import X.C141335gf;
import X.C2L0;
import X.C2U8;
import X.C3C5;
import X.C55937LxN;
import X.C56743MOt;
import X.C56818MRq;
import X.C76800UCe;
import X.C78983UzD;
import X.C80796VnM;
import X.EnumC55950Lxa;
import X.EnumC56033Lyv;
import X.InterfaceC57784Mm4;
import X.LE4;
import X.LXS;
import X.LXU;
import X.OSZ;
import X.WM7;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ARunnableS12S0201000_9 implements Runnable {
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        EcVideoGuideAssem ecVideoGuideAssem = (EcVideoGuideAssem) this.l0;
        EnumC56033Lyv actionType = (EnumC56033Lyv) this.l1;
        int i = this.i2;
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) ecVideoGuideAssem._$_findCachedViewById(R.id.cl3);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            LXS LIZ = LXU.LIZ();
            if (LIZ != null && LIZ.LIZ) {
                LIZ.LIZ = false;
                C2U8.LIZ(new C2L0());
            }
            o.LJIIIZ(actionType, "actionType");
            b.LJJIJIIJI("rd_tiktokec_shop_video_guide", C113554cx.LJJLIIIIJ(new OSZ(WM7.SCENE_SERVICE, Integer.valueOf(i)), new OSZ("stage", EnumC55950Lxa.VIDEO_GUIDE_DISMISS.getValue()), new OSZ("action_type", actionType.getValue())));
            C2U8.LIZ(new C55937LxN(LE4.HIDE));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void run$0(ARunnableS12S0201000_9 aRunnableS12S0201000_9) {
        ((DetailFragmentPanel) aRunnableS12S0201000_9.l0).LLIFFJFJJ(aRunnableS12S0201000_9.i2 + 1, (Aweme) aRunnableS12S0201000_9.l1);
    }

    public static final void run$1(ARunnableS12S0201000_9 aRunnableS12S0201000_9) {
        boolean LIZ;
        try {
            aRunnableS12S0201000_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS12S0201000_9 aRunnableS12S0201000_9) {
        boolean LIZ;
        try {
            FollowFeedFragmentPanelMT followFeedFragmentPanelMT = (FollowFeedFragmentPanelMT) aRunnableS12S0201000_9.l1;
            C80796VnM c80796VnM = followFeedFragmentPanelMT.mViewPager;
            if (c80796VnM != null) {
                followFeedFragmentPanelMT.mCurIndex = 0;
                if (aRunnableS12S0201000_9.i2 == 0) {
                    followFeedFragmentPanelMT.tryResumePlay((Aweme) aRunnableS12S0201000_9.l0);
                    ((FollowFeedFragmentPanelMT) aRunnableS12S0201000_9.l1).mSetItem = false;
                } else {
                    followFeedFragmentPanelMT.mSetItem = true;
                    c80796VnM.LJJJ(0, true);
                }
                FeedFollowFragment feedFollowFragment = ((FollowFeedFragmentPanelMT) aRunnableS12S0201000_9.l1).LLILII;
                if (feedFollowFragment != null) {
                    feedFollowFragment.Y9();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS12S0201000_9 aRunnableS12S0201000_9) {
        boolean LIZ;
        try {
            super/*com.bytedance.ext_power_list.AssemListViewModel*/.listAddItemAt(aRunnableS12S0201000_9.i2, (int) ((InterfaceC57784Mm4) aRunnableS12S0201000_9.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS12S0201000_9 aRunnableS12S0201000_9) {
        boolean LIZ;
        try {
            super/*com.bytedance.ext_power_list.AssemListViewModel*/.listAddItemAt(aRunnableS12S0201000_9.i2, (int) ((InterfaceC57784Mm4) aRunnableS12S0201000_9.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS12S0201000_9 aRunnableS12S0201000_9) {
        boolean LIZ;
        try {
            super/*com.bytedance.ext_power_list.AssemListViewModel*/.listAddItemAt(aRunnableS12S0201000_9.i2, (int) ((InterfaceC57784Mm4) aRunnableS12S0201000_9.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS12S0201000_9 aRunnableS12S0201000_9) {
        boolean LIZ;
        try {
            ((C56743MOt) aRunnableS12S0201000_9.l0).LJZL(aRunnableS12S0201000_9.i2, (MusNotice) aRunnableS12S0201000_9.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS12S0201000_9 aRunnableS12S0201000_9) {
        boolean LIZ;
        try {
            ((C56818MRq) aRunnableS12S0201000_9.l0).LJLLLLLL((BaseNotice) aRunnableS12S0201000_9.l1, aRunnableS12S0201000_9.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS12S0201000_9(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj2;
        this.i2 = i;
        this.l1 = obj;
    }
}
