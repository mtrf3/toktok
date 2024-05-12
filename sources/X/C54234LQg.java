package X;

import Y.ARunnableS28S0200000_9;
import Y.ARunnableS45S0100000_9;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS65S0110000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.LQg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54234LQg {
    public static WeakReference<C54234LQg> LJIJJLI;
    public static boolean LJIL;
    public final ActivityC45651qj LIZ;
    public final View LIZIZ;
    public final AbsFragment LIZJ;
    public final LR1 LIZLLL;
    public final TabChangeManager LJ;
    public final InterfaceC54232LQe LJFF;
    public final ScrollSwitchStateManager LJI;
    public final MainAnimViewModel LJII;
    public C54241LQn LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public boolean LJIIJ;
    public ARunnableS45S0100000_9 LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public final boolean LJIILL;
    public final DmNoticeProxy LJIILLIIL;
    public boolean LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public final C62822Ol8 LJIJI;
    public final C54235LQh LJIJJ;

    public final void LIZ() {
        if (((Boolean) C88099Yhr.LJFF.getValue()).booleanValue()) {
            C38995FSd.LIZJ().execute(new ARunnableS45S0100000_9(this, 260));
            return;
        }
        OSZ<Boolean, Boolean> LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ.getFirst().booleanValue() || LJIIIIZZ.getSecond().booleanValue()) {
            LJIIJJI();
        } else {
            LJFF();
        }
    }

    public final Handler LIZJ() {
        return (Handler) this.LJIIIZ.getValue();
    }

    public final void LJ() {
        if (!this.LIZJ.isViewValid()) {
            return;
        }
        C221018lt.LJFF("MainPageFragment", "UnReadCountMonitor hideNotificationDot");
        LLQ Xm0 = LIZIZ().Xm0();
        if (Xm0 != null) {
            Xm0.LJIILL("NOTIFICATION");
        }
        if (C54362LVe.LJIIZILJ(0)) {
            C54362LVe.LIZIZ(0);
        }
        if (this.LIZJ.isViewValid() && C54362LVe.LJIIZILJ(12)) {
            C54362LVe.LIZIZ(12);
        }
        if (!this.LIZJ.isViewValid() || !C54362LVe.LJIIZILJ(1000)) {
            return;
        }
        C54362LVe.LIZIZ(1000);
    }

    public final void LJFF() {
        if (!this.LIZJ.isViewValid()) {
            return;
        }
        if (C54305LSz.LIZJ() || !LQU.LJFF) {
            LL5.LIZJ(this.LIZ, LIZIZ());
        }
        LJIL = false;
    }

    public final OSZ<Boolean, Boolean> LJIIIIZZ() {
        InterfaceC26386AXe interfaceC26386AXe;
        boolean needShowRedDotOnMyProfileMore = C86034Xpe.LIZIZ.needShowRedDotOnMyProfileMore();
        Boolean LIZ = SharePrefCache.inst().getEnableProfileActivityLink().LIZ();
        o.LJIIIIZZ(LIZ, "inst().enableProfileActivityLink.cache");
        boolean z = false;
        if (LIZ.booleanValue() && ((interfaceC26386AXe = (InterfaceC26386AXe) AXW.LIZ(this.LIZJ.getContext(), InterfaceC26386AXe.class)) == null || !TextUtils.equals(interfaceC26386AXe.LJIIJ(), "true"))) {
            z = true;
        }
        return new OSZ<>(Boolean.valueOf(needShowRedDotOnMyProfileMore), Boolean.valueOf(z));
    }

    public final void LJIIIZ() {
        if (this.LJIIZILJ) {
            return;
        }
        C221018lt.LJFF("NotificationTabMgr", "onDestroyView");
        EventBus.LIZJ().LJIJ(this);
        if (this.LJIIIIZZ != null) {
            HG3.LJIIL();
            IAccountService iAccountService = HG3.LJLJL;
            C54241LQn c54241LQn = this.LJIIIIZZ;
            o.LJI(c54241LQn);
            iAccountService.LJIILLIIL(c54241LQn);
        }
        ARunnableS45S0100000_9 aRunnableS45S0100000_9 = this.LJIIJJI;
        if (aRunnableS45S0100000_9 != null) {
            LIZJ().removeCallbacks(aRunnableS45S0100000_9);
        }
        LIZJ().removeCallbacks((Runnable) this.LJIJI.getValue());
        this.LJIIZILJ = true;
        LJIL = false;
    }

    public final void LJIIJ() {
        Handler LIZJ;
        this.LJIIJJI = new ARunnableS45S0100000_9(this, 262);
        this.LJIIJ = true;
        this.LIZLLL.LIZJ(false);
        ARunnableS45S0100000_9 aRunnableS45S0100000_9 = this.LJIIJJI;
        if (aRunnableS45S0100000_9 != null && (LIZJ = LIZJ()) != null) {
            LIZJ.postDelayed(aRunnableS45S0100000_9, 5000L);
        }
    }

    public final void LJIIJJI() {
        if (!this.LIZJ.isViewValid()) {
            return;
        }
        if (C54305LSz.LIZJ() || !LQU.LJFF) {
            LL5.LIZLLL(this.LIZ, LIZIZ());
        }
        LJIL = true;
    }

    public final InterfaceC54132LMi LIZIZ() {
        return ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).getHomeTabViewModel(this.LIZ);
    }

    public final void LIZLLL(C54251LQx event) {
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI == -1) {
            C54362LVe.LIZIZ(event.LJLIL);
        }
        LJIIL(EnumC54238LQk.INDICATOR);
        if (event.LJLIL == 1000) {
            EventBus.LIZJ().LJIILL(C54251LQx.class);
        }
    }

    public final void LJII(boolean z) {
        InterfaceC36571c5 Ja = this.LJ.Ja("NOTIFICATION");
        String nv0 = this.LJ.nv0();
        if (Ja instanceof AX8) {
            AX8 ax8 = (AX8) Ja;
            if (!ax8.L3()) {
                if (!o.LJ(nv0, "NOTIFICATION")) {
                    C114304eA.LIZIZ(new AqS65S0110000_9(this, z, 8));
                } else {
                    ax8.v0(MainPageFragmentImpl.LJI().LJJLIIIJJI());
                }
                C54362LVe.LIZIZ(260);
            }
        }
        C114304eA.LIZIZ(new AqS65S0110000_9(this, z, 8));
        C54362LVe.LIZIZ(260);
    }

    public final void LJIIL(EnumC54238LQk enumC54238LQk) {
        if (this.LJIIJ || this.LIZLLL.LJIIJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("showTabBadge(");
            LIZ.append(enumC54238LQk);
            LIZ.append(") blocked by: ");
            LIZ.append(this.LJIIJ);
            LIZ.append(", ");
            HH1.LIZIZ(LIZ, this.LIZLLL.LJIIJ, LIZ, "NotificationTabMgr");
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("showTabBadge(");
            LIZ2.append(enumC54238LQk);
            LIZ2.append(") blocked by un-login");
            C221018lt.LJFF("NotificationTabMgr", X1D.LIZIZ(LIZ2));
            LLQ Xm0 = LIZIZ().Xm0();
            if (Xm0 != null) {
                Xm0.LJIILL("NOTIFICATION");
                Xm0.LJ(-1, "NOTIFICATION");
                return;
            }
            return;
        }
        C54239LQl c54239LQl = C54239LQl.LIZIZ;
        int LIZJ = c54239LQl.LIZJ();
        Long l = null;
        if (LIZJ > 0) {
            LLQ Xm02 = LIZIZ().Xm0();
            if (Xm02 != null) {
                Xm02.LJIILL("NOTIFICATION");
                Xm02.LJ(LIZJ, "NOTIFICATION");
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("showTabBadge(");
            LIZ3.append(enumC54238LQk);
            LIZ3.append(") showNum, count=");
            LIZ3.append(LIZJ);
            C221018lt.LJFF("NotificationTabMgr", X1D.LIZIZ(LIZ3));
            LR4.LIZ(LIZJ, true);
            C10K.LIZIZ(new L70(LIZJ), C10K.LJI, null);
            LJI(LIZJ, 0, 0);
            return;
        }
        LLQ Xm03 = LIZIZ().Xm0();
        if (Xm03 != null) {
            Xm03.LJ(-1, "NOTIFICATION");
        }
        if (c54239LQl.LIZIZ()) {
            int LJIILIIL = C54362LVe.LJIILIIL(260);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("showTabBadge(");
            LIZ4.append(enumC54238LQk);
            LIZ4.append(") showDot, liveCount=");
            LIZ4.append(LJIILIIL);
            C221018lt.LJFF("NotificationTabMgr", X1D.LIZIZ(LIZ4));
            if (LJIILIIL > 0) {
                if (LIZJ().hasCallbacks((Runnable) this.LJIJI.getValue())) {
                    C221018lt.LIZ("NotificationTabMgr", "delayClearLiveUnread blocked, already has task");
                } else {
                    NoticeGroupAttrs LJIIIIZZ = C54362LVe.LJIIIIZZ(260);
                    if (LJIIIIZZ != null) {
                        l = LJIIIIZZ.aliveDuration;
                    }
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("delayClearLiveUnread, liveAlive=");
                    LIZ5.append(l);
                    C221018lt.LJFF("NotificationTabMgr", X1D.LIZIZ(LIZ5));
                    if (l != null && l.longValue() > 0) {
                        LIZJ().postDelayed((Runnable) this.LJIJI.getValue(), l.longValue() * 1000);
                    }
                }
            }
            LLQ Xm04 = LIZIZ().Xm0();
            if (Xm04 != null) {
                Xm04.LJJIJIIJIL("NOTIFICATION");
            }
            LR4.LIZ(LIZJ, true);
            LJI(0, 1, LJIILIIL);
            return;
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("showTabBadge(");
        LIZ6.append(enumC54238LQk);
        LIZ6.append(") showNothing");
        C221018lt.LJFF("NotificationTabMgr", X1D.LIZIZ(LIZ6));
        LLQ Xm05 = LIZIZ().Xm0();
        if (Xm05 == null) {
            return;
        }
        Xm05.LJIILL("NOTIFICATION");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDoubleClickInbox(C54110LLm event) {
        o.LJIIIZ(event, "event");
        C54239LQl c54239LQl = C54239LQl.LIZIZ;
        int LIZJ = c54239LQl.LIZJ();
        LinkedHashMap LIZ = C0JU.LIZ("enter_from", "notification_page");
        if (LIZJ > 0) {
            C132805Jc.LJFF(LIZ, "notice_type", "number_dot", LIZJ, "show_cnt");
        } else if (c54239LQl.LIZIZ()) {
            LIZ.put("notice_type", "yellow_dot");
            LIZ.put("show_cnt", CardStruct.IStatusCode.DEFAULT);
        } else {
            LIZ.put("show_cnt", CardStruct.IStatusCode.DEFAULT);
        }
        FMX.LIZIZ().execute(new ARunnableS45S0100000_9(LIZ, 261));
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNotificationIndicatorEvent(C54251LQx c54251LQx) {
        if (c54251LQx == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNotificationIndicator: [");
        LIZ.append(c54251LQx.LJLIL);
        LIZ.append(", ");
        LIZ.append(c54251LQx.LJLILLLLZI);
        LIZ.append(']');
        C221018lt.LIZ("NotificationTabMgr", X1D.LIZIZ(LIZ));
        ARunnableS28S0200000_9 aRunnableS28S0200000_9 = new ARunnableS28S0200000_9(c54251LQx, this, 86);
        if (((Boolean) C33763DMx.LIZLLL.getValue()).booleanValue()) {
            C36093EEn.LIZ.getClass();
            if (!EEZ.LIZIZ()) {
                C37179EiV.LIZ().postDelayed(aRunnableS28S0200000_9, 3000L);
                return;
            }
        }
        aRunnableS28S0200000_9.run();
    }

    public final void LJI(int i, int i2, int i3) {
        String str;
        if (i == 0 && i2 == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (i > 0 && (!this.LJIIL || i > this.LJIILJJIL)) {
            int i4 = this.LJIILJJIL;
            hashMap.put("notice_type", "number_dot");
            hashMap.put("show_cnt", String.valueOf(i));
            hashMap.put("previous_show_cnt", String.valueOf(i4));
            this.LJIILJJIL = i;
            this.LJIIL = true;
        } else if (i2 > 0 && !this.LJIILIIL) {
            hashMap.put("notice_type", "yellow_dot");
            this.LJIILIIL = true;
        }
        if (!hashMap.isEmpty()) {
            if (i3 > 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_live", str);
            FMX.LJIIL("message_notice_show", hashMap);
        }
    }

    public C54234LQg(ActivityC45651qj activityC45651qj, View view, AbsFragment fragment, LR1 lr1, TabChangeManager tabChangeManager, InterfaceC54232LQe interfaceC54232LQe, ScrollSwitchStateManager scrollSwitchStateManager, MainAnimViewModel mainAnimViewModel) {
        C54234LQg c54234LQg;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tabChangeManager, "tabChangeManager");
        this.LIZ = activityC45651qj;
        this.LIZIZ = view;
        this.LIZJ = fragment;
        this.LIZLLL = lr1;
        this.LJ = tabChangeManager;
        this.LJFF = interfaceC54232LQe;
        this.LJI = scrollSwitchStateManager;
        this.LJII = mainAnimViewModel;
        this.LJIIIZ = C221108m2.LIZIZ(C54237LQj.INSTANCE);
        this.LJIIJ = true;
        this.LJIILL = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("clear_red_point_cost", false);
        DmNoticeProxy LJI = DmNoticeProxyImpl.LJI();
        o.LJIIIIZZ(LJI, "get().getService(DmNoticeProxy::class.java)");
        this.LJIILLIIL = LJI;
        this.LJIJ = C221108m2.LIZIZ(C54236LQi.LJLIL);
        EventBus.LIZJ().LJIILJJIL(this);
        LJIL = false;
        LR4.LIZ = SystemClock.uptimeMillis();
        C55888Lwa.LIZIZ.LJIJJ();
        IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().onNoticeManagerInit();
        C221018lt.LJFF("NotificationTabMgr", "initView");
        WeakReference<C54234LQg> weakReference = LJIJJLI;
        if (weakReference != null && (c54234LQg = weakReference.get()) != null) {
            c54234LQg.LJIIIZ();
        }
        LJIJJLI = new WeakReference<>(this);
        this.LJIJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1063));
        this.LJIJJ = new C54235LQh(this, scrollSwitchStateManager, mainAnimViewModel, activityC45651qj);
    }
}
