package X;

import Y.ACListenerS29S0100000_9;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class LR1 {
    public final ActivityC45651qj LIZ;
    public LR8 LIZIZ;
    public InterfaceC54232LQe LIZJ;
    public TabChangeManager LJ;
    public AbsFragment LJFF;
    public LRI LJI;
    public View LJII;
    public ScrollSwitchStateManager LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final AObserverS77S0100000_9 LJIILL;
    public final AObserverS77S0100000_9 LJIILLIIL;
    public C54274LRu LJIIZILJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(LR7.INSTANCE);
    public final C62822Ol8 LJIILJJIL = C221108m2.LIZIZ(C54248LQu.LJLIL);

    public final void LJ() {
        View LJIIJ;
        this.LJIIJ = true;
        IHomePageService iHomePageService = (IHomePageService) ServiceManager.get().getService(IHomePageService.class);
        View view = this.LJII;
        if (view != null) {
            Context context = view.getContext();
            o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            LLQ Xm0 = iHomePageService.getHomeTabViewModel((ActivityC45651qj) context).Xm0();
            if (Xm0 != null && (LJIIJ = Xm0.LJIIJ("NOTIFICATION")) != null) {
                LR8 lr8 = this.LIZIZ;
                o.LJI(lr8);
                LIZJ(lr8.LIZIZ(LJIIJ));
                if (this.LJIIIZ) {
                    LR8 lr82 = this.LIZIZ;
                    if (lr82 != null) {
                        lr82.setOnDismissListener(new LR2(this));
                    }
                } else if (C54362LVe.LJIILJJIL(275) > 0 && !this.LJIIIZ && (((FollowLiveBubbleConfig) this.LJIILJJIL.getValue()).expGroup == 2 || ((FollowLiveBubbleConfig) this.LJIILJJIL.getValue()).expGroup == 3)) {
                    C54246LQs c54246LQs = new C54246LQs();
                    c54246LQs.LJLIL = 2;
                    C2U8.LIZ(c54246LQs);
                }
                if (L0W.LIZ()) {
                    if (this.LJIIIZ) {
                        LRI lri = this.LJI;
                        if (lri != null) {
                            lri.onShow();
                        } else {
                            o.LJIJI("mNotificationCallback");
                            throw null;
                        }
                    }
                } else {
                    LRI lri2 = this.LJI;
                    if (lri2 != null) {
                        lri2.onShow();
                    } else {
                        o.LJIJI("mNotificationCallback");
                        throw null;
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("UnReadCountMonitor isShowNotifyPop: ");
                HH1.LIZIZ(LIZ, this.LJIIIZ, LIZ, "MainPageFragment");
                return;
            }
            throw new NullPointerException("tab NOTIFICATION not exsist");
        }
        o.LJIJI("mAnchorView");
        throw null;
    }

    public final void LIZ() {
        AbsFragment absFragment = this.LJFF;
        if (absFragment != null) {
            ActivityC45651qj mo49getActivity = absFragment.mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            LR8 LJIL = C55888Lwa.LIZIZ.LJIL(mo49getActivity);
            this.LIZIZ = LJIL;
            if (LJIL != null) {
                LJIL.setOutsideTouchable(true);
            }
            LR8 lr8 = this.LIZIZ;
            if (lr8 != null) {
                lr8.LIZIZ = new ACListenerS29S0100000_9(this, 191);
                lr8.setOnDismissListener(new LR9(this));
            }
            LR8 lr82 = this.LIZIZ;
            if (lr82 == null) {
                return;
            }
            lr82.LIZ = new ARunnableS45S0100000_9(this, 243);
            return;
        }
        o.LJIJI("mFragment");
        throw null;
    }

    public final void LIZIZ() {
        LR8 lr8;
        if (this.LJIIJ && (lr8 = this.LIZIZ) != null) {
            lr8.LIZ();
        }
    }

    public final void LIZLLL() {
        boolean z;
        if (this.LJIIL || (ActivityStack.getTopActivity() instanceof InterfaceC54245LQr)) {
            ((Handler) this.LIZLLL.getValue()).postDelayed(new ARunnableS45S0100000_9(this, 244), 1000L);
            return;
        }
        ActivityC45651qj activityC45651qj = this.LIZ;
        if ((activityC45651qj instanceof MainActivity) && activityC45651qj != null) {
            z = activityC45651qj.isDestroyed();
        } else {
            z = false;
        }
        if (!z && !AV1.LJIIJJI()) {
            if (C78966Uyw.LJJIJ().LIZIZ()) {
                C221018lt.LJFF("NotificationCVH", "checkShowNotification blocked by 16");
            } else if (this.LJIIJJI == 1) {
                C221018lt.LJFF("NotificationCVH", "checkShowNotification blocked by comment");
            } else {
                if (((RBX) HG3.LJIILL()).isLogin()) {
                    Keva repo = Keva.getRepo("account_security_keva_name");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("prior_to_safe_info_");
                    if (!C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, false)) {
                        InterfaceC54232LQe interfaceC54232LQe = this.LIZJ;
                        if (interfaceC54232LQe != null) {
                            if (interfaceC54232LQe.getToastVisibility() != 0 && !LRU.LIZIZ()) {
                                if (this.LJIILIIL) {
                                    C221018lt.LJFF("NotificationCVH", "checkShowNotification blocked by story");
                                } else {
                                    TabChangeManager tabChangeManager = this.LJ;
                                    if (tabChangeManager != null) {
                                        if (TextUtils.equals("NOTIFICATION", tabChangeManager.nv0())) {
                                            C221018lt.LJFF("NotificationCVH", "checkShowNotification blocked by inbox tab");
                                        } else {
                                            AbsFragment absFragment = this.LJFF;
                                            if (absFragment != null) {
                                                if (absFragment.isViewValid()) {
                                                    ScrollSwitchStateManager scrollSwitchStateManager = this.LJIIIIZZ;
                                                    if (scrollSwitchStateManager != null) {
                                                        if (!TextUtils.equals("page_profile", scrollSwitchStateManager.hv0())) {
                                                            if (this.LJIIIZ || this.LJIIJ) {
                                                                StringBuilder LIZ2 = X1D.LIZ();
                                                                LIZ2.append("checkShowNotification blocked by showing flag:");
                                                                LIZ2.append(this.LJIIIZ);
                                                                LIZ2.append(", ");
                                                                HH1.LIZIZ(LIZ2, this.LJIIJ, LIZ2, "NotificationCVH");
                                                            } else {
                                                                if (this.LIZIZ == null) {
                                                                    if (((Boolean) C59392Ut.LIZLLL.getValue()).booleanValue()) {
                                                                        C54274LRu c54274LRu = this.LJIIZILJ;
                                                                        if (c54274LRu == null) {
                                                                            AbsFragment absFragment2 = this.LJFF;
                                                                            if (absFragment2 != null) {
                                                                                C55537Lqv c55537Lqv = new C55537Lqv(new WeakReference(absFragment2.mo49getActivity()), "awemenotice_mus_new_popview_notification", LRL.LJLIL);
                                                                                C55537Lqv[] c55537LqvArr = new C55537Lqv[1];
                                                                                AbsFragment absFragment3 = this.LJFF;
                                                                                if (absFragment3 != null) {
                                                                                    c55537LqvArr[0] = new C55537Lqv(new WeakReference(absFragment3.mo49getActivity()), "awemenotice_mus_new_popview_notification_side", LRM.LJLIL);
                                                                                    ArrayList arrayList = new ArrayList();
                                                                                    arrayList.add(c55537Lqv);
                                                                                    arrayList.add(c55537LqvArr[0]);
                                                                                    C54277LRx c54277LRx = new C54277LRx(arrayList);
                                                                                    TimeUnit unit = TimeUnit.SECONDS;
                                                                                    o.LJIIIZ(unit, "unit");
                                                                                    c54274LRu = new C54274LRu(unit.toMillis(2L), c54277LRx);
                                                                                    this.LJIIZILJ = c54274LRu;
                                                                                } else {
                                                                                    o.LJIJI("mFragment");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("mFragment");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        c54274LRu.LIZ(new LRG(this));
                                                                        return;
                                                                    }
                                                                    LIZ();
                                                                }
                                                                try {
                                                                    LJ();
                                                                    return;
                                                                } catch (Exception e) {
                                                                    C16880lQ.LLLLIIL(e);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        o.LJIJI("mStateManager");
                                                        throw null;
                                                    }
                                                }
                                                C221018lt.LJFF("NotificationCVH", "checkShowNotification blocked by profile");
                                            } else {
                                                o.LJIJI("mFragment");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        o.LJIJI("mTabChangeManager");
                                        throw null;
                                    }
                                }
                            }
                        } else {
                            o.LJIJI("mPolicyNoticeToast");
                            throw null;
                        }
                    }
                }
                C221018lt.LJFF("NotificationCVH", "checkShowNotification blocked by privacy");
            }
        }
        if (L0W.LIZ()) {
            LRI lri = this.LJI;
            if (lri != null) {
                lri.onCancel();
                return;
            } else {
                o.LJIJI("mNotificationCallback");
                throw null;
            }
        }
        LRI lri2 = this.LJI;
        if (lri2 != null) {
            lri2.onDismiss();
        } else {
            o.LJIJI("mNotificationCallback");
            throw null;
        }
    }

    public LR1(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJIILL = new AObserverS77S0100000_9(this, 142);
        this.LJIILLIIL = new AObserverS77S0100000_9(this, 141);
    }

    public final void LIZJ(boolean z) {
        this.LJIIIZ = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set isShowNotifyPop: ");
        U26.LIZLLL(LIZ, this.LJIIIZ, LIZ, "NotificationCVH");
    }

    @QD3
    public final void onCommentDialogEvent(C174036sJ event) {
        o.LJIIIZ(event, "event");
        this.LJIIJJI = event.LJLIL;
    }
}
