package X;

import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import defpackage.b0;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class LQU {
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(LM1.LJLIL);
    public static boolean LJFF;
    public final MainPageFragment LIZ;
    public final TabChangeManager LIZIZ;
    public final C54229LQb LIZJ;
    public final C54234LQg LIZLLL;

    public final InterfaceC54132LMi LIZ() {
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        if (mo49getActivity != null) {
            return ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).getHomeTabViewModel(mo49getActivity);
        }
        return null;
    }

    public final void LIZIZ() {
        C54234LQg c54234LQg;
        C54229LQb c54229LQb;
        if (!this.LIZ.isViewValid()) {
            return;
        }
        int LIZIZ = LL5.LIZIZ();
        if (LIZIZ != 1) {
            if (LIZIZ == 2) {
                ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
                if (mo49getActivity != null) {
                    LL5.LIZ(mo49getActivity, LIZ(), 0);
                }
                LJFF = false;
            }
        } else {
            ActivityC45651qj mo49getActivity2 = this.LIZ.mo49getActivity();
            if (mo49getActivity2 != null) {
                LL5.LIZJ(mo49getActivity2, LIZ());
            }
            LJFF = false;
        }
        if (ENR.LIZ()) {
            if (C54229LQb.LJ && (c54229LQb = this.LIZJ) != null) {
                c54229LQb.LIZ();
                return;
            }
            return;
        }
        if (!C54234LQg.LJIL || (c54234LQg = this.LIZLLL) == null) {
            return;
        }
        c54234LQg.LIZ();
    }

    public final boolean LIZJ() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current bottom tab: ");
        TabChangeManager tabChangeManager = this.LIZIZ;
        String str2 = null;
        if (tabChangeManager != null) {
            str = tabChangeManager.nv0();
        } else {
            str = null;
        }
        b0.LJFF(LIZ, str, LIZ, "PNCTBPresentManager");
        TabChangeManager tabChangeManager2 = this.LIZIZ;
        if (tabChangeManager2 != null) {
            str2 = tabChangeManager2.nv0();
        }
        return o.LJ(str2, "USER");
    }

    public static void LIZLLL(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("notice_type", "red_dot");
        c188727au.LJIIIZ("notice_reason", str);
        FMX.LJIIL("me_notice_show", c188727au.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @X.QD3(sticky = true, threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNoticeCountChangeEvent(X.AV5 r20) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LQU.onNoticeCountChangeEvent(X.AV5):void");
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onProfileTabClicked(C54109LLl event) {
        MainActivityScope LJJLIIIJJI;
        IMFToolBarAbility LJIJJ;
        LLQ Xm0;
        o.LJIIIZ(event, "event");
        if (LL5.LIZIZ() == 1 || LL5.LIZIZ() == 2) {
            C221018lt.LJFF("PNCTBPresentManager", "profile tab is click");
            C54261LRh.LJI(true);
            LIZIZ();
            ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
            if (C53765L8f.LJIIJJI()) {
                InterfaceC54132LMi LIZ = LIZ();
                if (LIZ == null || (Xm0 = LIZ.Xm0()) == null || !Xm0.LJIIZILJ("USER")) {
                    return;
                }
            } else if (mo49getActivity == null || (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(mo49getActivity)) == null || (LJIJJ = C78923UyF.LJIJJ(LJJLIIIJJI)) == null || !LJIJJ.Oo()) {
                return;
            }
            C2313996h.LIZ().storeLong("profile_tab_last_show_time", 0L);
            C2313996h.LIZ().storeLong("profile_tab_last_click_time", System.currentTimeMillis());
        }
    }

    public LQU(MainPageFragment fragment, TabChangeManager tabChangeManager, C54229LQb c54229LQb, C54234LQg c54234LQg) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = fragment;
        this.LIZIZ = tabChangeManager;
        this.LIZJ = c54229LQb;
        this.LIZLLL = c54234LQg;
        EventBus.LIZJ().LJIILJJIL(this);
        LJFF = false;
    }

    public static void LJ(LQU lqu, int i, boolean z, int i2) {
        ActivityC45651qj mo49getActivity;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!lqu.LIZ.isViewValid()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showType: ");
        LIZ.append(LL5.LIZIZ());
        C221018lt.LJFF("PNCTBPresentManager", X1D.LIZIZ(LIZ));
        int LIZIZ = LL5.LIZIZ();
        if (LIZIZ != 1) {
            if (LIZIZ != 2) {
                return;
            }
            if ((C54229LQb.LJ || C54234LQg.LJIL) && (mo49getActivity = lqu.LIZ.mo49getActivity()) != null) {
                LL5.LIZJ(mo49getActivity, lqu.LIZ());
            }
            ActivityC45651qj mo49getActivity2 = lqu.LIZ.mo49getActivity();
            if (mo49getActivity2 != null) {
                LL5.LIZ(mo49getActivity2, lqu.LIZ(), i);
            }
            LJFF = true;
            return;
        }
        if (i > 0 || z) {
            ActivityC45651qj mo49getActivity3 = lqu.LIZ.mo49getActivity();
            if (mo49getActivity3 != null) {
                LL5.LIZLLL(mo49getActivity3, lqu.LIZ());
            }
        } else {
            ActivityC45651qj mo49getActivity4 = lqu.LIZ.mo49getActivity();
            if (mo49getActivity4 != null) {
                LL5.LIZJ(mo49getActivity4, lqu.LIZ());
            }
        }
        LJFF = true;
    }
}
