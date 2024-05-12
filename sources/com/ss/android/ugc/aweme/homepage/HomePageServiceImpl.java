package com.ss.android.ugc.aweme.homepage;

import X.AXC;
import X.AXF;
import X.AXH;
import X.AbstractC2312495s;
import X.AbstractC53892LDc;
import X.ActivityC45651qj;
import X.C116694i1;
import X.C34710Djm;
import X.C35601Dy9;
import X.C54098LLa;
import X.C54102LLe;
import X.C54105LLh;
import X.C54133LMj;
import X.C54134LMk;
import X.C54218LPq;
import X.C54921Lgz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C57264Mdg;
import X.C66162ii;
import X.C66172ij;
import X.C75806Tp4;
import X.C84213Sf;
import X.DVX;
import X.EE1;
import X.EXV;
import X.FO6;
import X.FV4;
import X.FWX;
import X.InterfaceC36571c5;
import X.InterfaceC38852FMq;
import X.InterfaceC54054LJi;
import X.InterfaceC54080LKi;
import X.InterfaceC54099LLb;
import X.InterfaceC54132LMi;
import X.InterfaceC54150LNa;
import X.InterfaceC54434LXy;
import X.InterfaceC55381LoP;
import X.InterfaceC70422pa;
import X.LCQ;
import X.LCR;
import X.LEB;
import X.LGX;
import X.LL9;
import X.LLI;
import X.LLL;
import X.LLN;
import X.LLP;
import X.LLQ;
import X.LLR;
import X.LM8;
import X.LM9;
import X.LNV;
import X.LPP;
import X.LPZ;
import X.LUN;
import X.LUR;
import X.U4A;
import X.XIF;
import X.XKX;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.homepage.business.PreloadMainTask;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IFragmentMainPageIcon;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IPreDrawableInflate;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import com.ss.android.ugc.aweme.homepage.ui.slide.XTabScrollProfileVM;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.legoImpl.task.AntispamApiUploadTask;
import com.ss.android.ugc.aweme.legoImpl.task.MobLaunchEventTask;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import o3.IDaS91S0000000_9;
import o3.h0;

/* loaded from: classes10.dex */
public final class HomePageServiceImpl implements IHomePageService {
    public final InterfaceC54099LLb homeTabTextManager = C54098LLa.LIZ;

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public void updateMainLooperServiceDoFrameHandler() {
        MainLooperOptService LJIIJ = MainLooperOptService.LJIIJ(null);
        o.LJIIIIZZ(LJIIJ, "getMainLooperOptServiceAndUpdate(null)");
        try {
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public void clearDrawableCache() {
        FO6.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public EE1 getAntispamApiUploadTask() {
        return new AntispamApiUploadTask();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public IFragmentMainPageIcon getFragmentMainPageIcon() {
        return new X2CFragmentMainPageIcon();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public LPZ getMainActivityProxy() {
        return new U4A();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public LCR getMainFragmentProxy() {
        return new LCQ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public LNV getMainPageFragmentProxy() {
        return new LLI();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public IPreDrawableInflate getPreDrawableInflate() {
        return new PreDrawableInflate();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public AXH getSafeMainTabPreferences() {
        return new AXF();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public LUN getHomePageBusiness() {
        return FWX.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public InterfaceC54099LLb getHomeTabTextManager() {
        return this.homeTabTextManager;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public LM8 getHomepageToolBar() {
        return LM9.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public LL9 getMainTabTextSizeHelper() {
        return LEB.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public InterfaceC38852FMq getMainTaskHolder() {
        return new InterfaceC38852FMq() { // from class: X.8I3
            public static PreloadMainTask LIZIZ;

            @Override // X.InterfaceC38852FMq
            public final EE1 LIZ(com.bytedance.hox.Hox hox) {
                PreloadMainTask preloadMainTask = LIZIZ;
                if (preloadMainTask == null) {
                    PreloadMainTask preloadMainTask2 = new PreloadMainTask(hox);
                    LIZIZ = preloadMainTask2;
                    return preloadMainTask2;
                }
                return preloadMainTask;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public InterfaceC55381LoP getUnloginSignUpUtils() {
        return AXC.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public LUR getX2CInflateCommitter() {
        return FV4.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public InterfaceC54132LMi getHomeTabViewModel(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return HomeTabViewModel.LJLJLLL.LIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public InterfaceC54150LNa getMainHelper(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return new C54921Lgz(activity);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public LifecycleRegistry getMainLifecycleRegistryWrapper(LifecycleOwner provider) {
        o.LJIIIZ(provider, "provider");
        return new C57264Mdg(provider);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public ITabStrip getMainTabStrip(FrameLayout viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
        return new MainTabStrip(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public AbstractC53892LDc getRootNode(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return new LGX(activity);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public LLN getScrollBasicChecker(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return new LLP(activity);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public InterfaceC54434LXy getSlideGuideViewModel(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        if (C54133LMj.LIZIZ()) {
            return C54133LMj.LIZ(activity);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public LPP getXTabScrollProfileVM(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (XTabScrollProfileVM) new ViewModelProvider(activity, new C84213Sf(activity)).get(XTabScrollProfileVM.class);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public boolean hasSocialNow2Tab(ActivityC45651qj activity) {
        boolean z;
        o.LJIIIZ(activity, "activity");
        HomeTabAbility homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activity, null), HomeTabAbility.class, null);
        if (homeTabAbility == null) {
            return false;
        }
        Iterator<BottomTabProtocol> it = homeTabAbility.ed().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BottomTabProtocol next = it.next();
            if (o.LJ(next.getTag(), "FRIENDS_TAB")) {
                if (next != null) {
                    z = true;
                }
            }
        }
        z = false;
        boolean LIZ = C54218LPq.LJLIL.LIZ();
        if (!z || !LIZ) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public LLQ initTabBarLogic(AbstractC2312495s mainBottomTabView) {
        o.LJIIIZ(mainBottomTabView, "mainBottomTabView");
        LLR llr = LLR.LIZJ;
        C54134LMk c54134LMk = (C54134LMk) mainBottomTabView;
        llr.getClass();
        LLR.LJIIIIZZ = c54134LMk;
        LLR.LJII = new C54105LLh(c54134LMk);
        if (LLR.LJIIIZ.LIZ()) {
            LLR.LJI = new C54102LLe(c54134LMk);
        }
        if (((Boolean) DVX.LJFF.getValue()).booleanValue()) {
            C35601Dy9.LIZIZ(LLR.LJIIIIZZ);
        } else {
            C35601Dy9.LIZ(new AqS159S0100000_9((View) LLR.LJIIIIZZ, 999));
        }
        c54134LMk.setOnTabVisibilityChangeListener(new C75806Tp4());
        c54134LMk.setImportantForAccessibility(1);
        c54134LMk.setFocusable(false);
        h0.LJIJI(c54134LMk, new IDaS91S0000000_9(3));
        return llr;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public boolean isProfileActiveInMain(ActivityC45651qj activityC45651qj) {
        return HomeTabViewModel.LJLJLLL.LIZIZ(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public void preloadMainActivityDrawable(Context context) {
        o.LJIIIZ(context, "context");
        if (((Boolean) C34710Djm.LJIIIZ.getValue()).booleanValue()) {
            FO6.LIZ(R.drawable.bnr, context);
            FO6.LIZ(R.drawable.nl, context);
            FO6.LIZ(R.drawable.a1n, context);
            FO6.LIZ(R.drawable.ava, context);
            FO6.LIZ(R.drawable.ajm, context);
            FO6.LIZ(R.drawable.avd, context);
            FO6.LIZ(R.drawable.aw6, context);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public EE1 getMobLaunchEventTask(boolean z, long j) {
        return new MobLaunchEventTask(z, j);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public LLN getScrollFullChecker(ActivityC45651qj activity, LLN scrollBasicChecker) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(scrollBasicChecker, "scrollBasicChecker");
        return new LLL(activity, scrollBasicChecker);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public boolean isPageActiveInMain(ActivityC45651qj activityC45651qj, int i) {
        InterfaceC54054LJi interfaceC54054LJi;
        InterfaceC36571c5 mv0 = C116694i1.LIZ(activityC45651qj).mv0();
        if ((mv0 instanceof InterfaceC54054LJi) && (interfaceC54054LJi = (InterfaceC54054LJi) mv0) != null) {
            return interfaceC54054LJi.Qc(i);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public void refreshXTabs(List<? extends InterfaceC54080LKi> topList, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(topList, "topList");
        if (activityC45651qj == null) {
            return;
        }
        XTabScrollProfileVM xTabScrollProfileVM = (XTabScrollProfileVM) new ViewModelProvider(activityC45651qj, new C84213Sf(activityC45651qj)).get(XTabScrollProfileVM.class);
        xTabScrollProfileVM.getClass();
        InterfaceC70422pa viewModelScope = ViewModelKt.getViewModelScope(xTabScrollProfileVM);
        XIF xif = EXV.LIZ;
        XKX.LIZLLL(viewModelScope, xif, null, new C66162ii(topList, xTabScrollProfileVM, null), 2);
        if (C54133LMj.LIZIZ()) {
            SlideGuideViewModel LIZ = C54133LMj.LIZ(activityC45651qj);
            LIZ.getClass();
            XKX.LIZLLL(ViewModelKt.getViewModelScope(LIZ), xif, null, new C66172ij(topList, LIZ, null), 2);
        }
    }
}
