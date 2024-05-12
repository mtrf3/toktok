package X;

import Y.AObserverS72S0100000_4;
import Y.AObserverS75S0100000_7;
import Y.IDAListenerS75S0100000_7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AqS74S1100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GVc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41620GVc {
    public static C41634GVq LIZ;
    public static C42041Gej LIZLLL;
    public static final int LIZIZ = C7MY.LIZIZ(16);
    public static final int LIZJ = C7MY.LIZIZ(58);
    public static final List<String> LJ = C47261Igj.LJII(SAAActivity.class.getName(), VideoPublishActivity.class.getName(), VideoRecordNewActivity.class.getName(), ChooseCoverActivity.class.getName(), ImagePublishPreviewActivity.class.getName(), VEVideoPublishPreviewActivity.class.getName(), "com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment", "com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment2", "miniapp.views.MiniAppListH5Activity", "miniapp.RecentlyUsedMicroAppActivity", "com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity", "detail.ui.LiveDetailActivity", "live.LiveFeedActivity", "story.shootvideo.record.StoryRecordActivity", "notification.FansDetailActivity", "notification.NotificationDetailActivity", "com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "com.ss.android.ugc.aweme.live.LivePlayActivity", "live.LivePlayActivity", "com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity", "com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "story.shootvideo.record.StoryRecordActivity", "com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "com.ss.android.ugc.aweme.detail.ui.PublishPreviewDetailActivity");
    public static final List<WeakReference<Activity>> LJFF = new ArrayList();
    public static final WeakHashMap<Activity, GVH> LJI = new WeakHashMap<>();
    public static boolean LJII = true;
    public static final java.util.Map<String, Integer> LJIIIIZZ = new LinkedHashMap();

    static {
        if (GVE.LIZ()) {
            C84763XOl.LIZLLL().LJJJJZI(GAU.LJLIL);
        }
    }

    public static void LIZJ() {
        if (LIZLLL == null) {
            C42041Gej c42041Gej = new C42041Gej(EF7.LIZIZ());
            LIZLLL = c42041Gej;
            c42041Gej.getState().LIZ.observeForever(new AObserverS72S0100000_4(c42041Gej, 37));
            c42041Gej.getState().LIZJ.observeForever(new AObserverS75S0100000_7(c42041Gej, 98));
            c42041Gej.getState().LIZLLL.observeForever(new AObserverS72S0100000_4(c42041Gej, 38));
            c42041Gej.getState().LJII.observeForever(new AObserverS75S0100000_7(c42041Gej, 99));
            c42041Gej.getState().LJIIIIZZ.observeForever(new AObserverS75S0100000_7(c42041Gej, 100));
            c42041Gej.getState().LJ.observeForever(new AObserverS75S0100000_7(c42041Gej, 101));
            c42041Gej.getState().LJFF.observeForever(new AObserverS75S0100000_7(c42041Gej, 102));
            c42041Gej.getState().LJI.observeForever(new AObserverS75S0100000_7(c42041Gej, 103));
            C42041Gej c42041Gej2 = LIZLLL;
            if (c42041Gej2 != null) {
                c42041Gej2.LIZJ();
            }
        }
    }

    public static void LIZIZ(String publishId) {
        PublishModel LJIILLIIL;
        o.LJIIIZ(publishId, "publishId");
        if (GTO.LIZ() && (LJIILLIIL = GUH.LJIILLIIL(publishId)) != null && GUH.LJIJI(null) && GUH.LJIJ(LJIILLIIL) && publishId.length() > 0) {
            C6QQ.LIZ(new AqS74S1100000_7(LJIILLIIL, publishId, 13));
        }
    }

    public static void LIZLLL(ActivityC45651qj activityC45651qj) {
        InterfaceC36571c5 interfaceC36571c5;
        FragmentManager supportFragmentManager;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        if (GTO.LIZ()) {
            C41634GVq c41634GVq = LIZ;
            if (c41634GVq == null || (mutableLiveData = c41634GVq.LJJIJIL) == null || !o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
                C42041Gej c42041Gej = LIZLLL;
                if (c42041Gej != null) {
                    c42041Gej.LIZJ();
                }
                C41634GVq c41634GVq2 = LIZ;
                if (c41634GVq2 != null && c41634GVq2.LJIILIIL != 0 && c41634GVq2.LJIIJJI != null) {
                    c41634GVq2.LIZJ(c41634GVq2.LIZIZ);
                    c41634GVq2.LJIILIIL = 0;
                }
                C41634GVq c41634GVq3 = LIZ;
                if (c41634GVq3 != null) {
                    C41634GVq.LIZIZ(c41634GVq3);
                }
                LJII = true;
                C42041Gej c42041Gej2 = LIZLLL;
                if (c42041Gej2 != null) {
                    c42041Gej2.LJFF(0);
                    return;
                }
                return;
            }
            C41634GVq c41634GVq4 = LIZ;
            if (c41634GVq4 == null || (mutableLiveData2 = c41634GVq4.LJJIJIL) == null) {
                return;
            }
            mutableLiveData2.observeForever(new C41621GVd());
            return;
        }
        if (activityC45651qj != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
            interfaceC36571c5 = supportFragmentManager.LJJJIL("publish");
        } else {
            interfaceC36571c5 = null;
        }
        if (!(interfaceC36571c5 instanceof IAVPublishService.PublishProgressFragment)) {
            return;
        }
        ((IAVPublishService.PublishProgressFragment) interfaceC36571c5).dismissAllowingStateLossNow();
    }

    public static void LJ(boolean z) {
        C42041Gej c42041Gej;
        C42041Gej c42041Gej2;
        int i;
        if (GUH.LJIILJJIL() > 0 && (c42041Gej = LIZLLL) != null && c42041Gej.getVisibility() == 8 && (c42041Gej2 = LIZLLL) != null && c42041Gej2.getParent() != null) {
            C42041Gej c42041Gej3 = LIZLLL;
            if (c42041Gej3 != null) {
                c42041Gej3.setVisibility(0);
                c42041Gej3.setAlpha(1.0f);
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity != null) {
                    LRD.LIZ(topActivity).LJIIIZ(true);
                }
            }
            JVD.LIZ(LIZLLL, C41624GVg.LJLIL);
            if (z && (LJII || !GVE.LIZ())) {
                C41634GVq c41634GVq = LIZ;
                if (c41634GVq != null) {
                    C41623GVf onEnd = C41623GVf.LJLIL;
                    o.LJIIIZ(onEnd, "onEnd");
                    int i2 = c41634GVq.LJIIZILJ + c41634GVq.LJIIIIZZ;
                    boolean z2 = GVX.LIZIZ;
                    if (!z2) {
                        i = C47135Ieh.LIZ(88, i2);
                    } else {
                        i = ((int) (i2 * 0.25d)) + i2;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    c41634GVq.LJIJ = ofFloat;
                    ofFloat.setDuration(300L);
                    ofFloat.addUpdateListener(new GVO(c41634GVq, i, i2, z2));
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat.addListener(new IDAListenerS75S0100000_7(onEnd, 2));
                    ofFloat.start();
                }
            } else {
                C42041Gej c42041Gej4 = LIZLLL;
                if (c42041Gej4 != null) {
                    c42041Gej4.LJ();
                }
            }
            LJII = false;
        }
    }

    public static void LJFF(ActivityC45651qj activityC45651qj, boolean z) {
        if (!((ArrayList) GUH.LJIIJ()).isEmpty()) {
            PublishModel LJIILLIIL = GUH.LJIILLIIL(GUH.LJIIL());
            if (LJIILLIIL != null && LJIILLIIL.disableProgressView) {
                return;
            }
            if (GTO.LIZ()) {
                LJ(z);
            } else {
                if (activityC45651qj == null) {
                    return;
                }
                InterfaceC36571c5 LJJJIL = activityC45651qj.getSupportFragmentManager().LJJJIL("publish");
                if (!(LJJJIL instanceof IAVPublishService.PublishProgressFragment)) {
                    return;
                }
                ((IAVPublishService.PublishProgressFragment) LJJJIL).show(z);
            }
        }
    }

    public static void LIZ(ActivityC45651qj activity, boolean z, int i) {
        int i2;
        int i3;
        boolean z2;
        C34363DeB initHide;
        boolean z3;
        boolean z4 = z;
        if ((i & 2) != 0) {
            z4 = false;
        }
        if ((i & 4) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        if ((i & 16) != 0) {
            if (C00F.LIZ(31744, 0, "studio_global_publish_progress", true) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if ((i & 32) != 0) {
            initHide = C34363DeB.LJLIL;
        } else {
            initHide = null;
        }
        if ((i & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(initHide, "initHide");
        C6QQ.LIZ(new GVP(i2, i3, activity, initHide, z2, z4, z3));
    }
}
