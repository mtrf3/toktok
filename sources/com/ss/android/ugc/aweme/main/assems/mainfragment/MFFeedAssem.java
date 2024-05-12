package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AV1;
import X.AbstractC48820JEa;
import X.ActivityC45651qj;
import X.C00F;
import X.C12460eI;
import X.C188727au;
import X.C188787b0;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C34710Djm;
import X.C35183DrP;
import X.C38995FSd;
import X.C47261Igj;
import X.C48841JEv;
import X.C54325LTt;
import X.C55096Ljo;
import X.C55274Lmg;
import X.C5H3;
import X.C61878OQg;
import X.C62814Ol0;
import X.C62822Ol8;
import X.DW0;
import X.EnumC221088m0;
import X.FMX;
import X.InterfaceC18010nF;
import X.InterfaceC36571c5;
import X.InterfaceC54151LNb;
import X.InterfaceC54152LNc;
import X.InterfaceC55102Lju;
import X.InterfaceC70422pa;
import X.KR8;
import X.LMK;
import X.LML;
import X.LMN;
import X.LNK;
import X.LNL;
import X.LNN;
import X.LNO;
import X.QD3;
import Y.AObserverS73S0200000_9;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFFeedAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.main.assems.mainfragment.protocol.IMFIconsProtocol;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import yq4.a;

/* loaded from: classes10.dex */
public final class MFFeedAssem extends UIContentAssem implements IMFFeedAbility, InterfaceC54151LNb, InterfaceC54152LNc, IMFIconsProtocol, InterfaceC55102Lju {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public boolean LJLJL;
    public final C5H3 LJLJLJ;
    public final LMK LJLJLLL;

    @Override // X.InterfaceC54151LNb
    public final void LLJJJJJIL(int i, Fragment fragment) {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1938039177) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC54151LNb
    public final void y(int i, boolean z) {
    }

    public MFFeedAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 300));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 299));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 302));
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 303));
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 301));
        this.LJLJJLL = C221108m2.LIZIZ(LNN.LJLIL);
        this.LJLJLJ = C221108m2.LIZ(EnumC221088m0.NONE, LMN.LJLIL);
        this.LJLJLLL = new LMK(this);
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.protocol.IMFIconsProtocol
    public final List<LML> F2() {
        return C47261Igj.LJJIJ(this.LJLJLLL);
    }

    public final HomeViewPagerAbility v3() {
        return (HomeViewPagerAbility) this.LJLJI.getValue();
    }

    public final Fragment getCurrentFragment() {
        IMFAbility iMFAbility = (IMFAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IMFAbility.class, null);
        if (iMFAbility == null) {
            return null;
        }
        return iMFAbility.getCurrentFragment();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), IMFIconsProtocol.class, C47261Igj.LJJIJIL(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C48841JEv.LIZJ((InterfaceC70422pa) this.LJLJJLL.getValue(), null);
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        ((LNO) this.LJLJJI.getValue()).onPause();
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJI();
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        if (C212428Vi.LIZ(this) == null) {
            return;
        }
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
        o.LJIIIIZZ(this.LJLIL.getValue(), "<get-flRootContainer>(...)");
        iFeedDebugService.LJIIJ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFFeedAbility
    public final void refreshWhenBack() {
        FeedFragment feedFragment;
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment instanceof FeedFragment) && (feedFragment = (FeedFragment) currentFragment) != null && (feedFragment instanceof FeedRecommendFragment)) {
            if (C00F.LIZ(31744, 0, "back_refresh_to_next", false) == 1) {
                if (((Boolean) DW0.LIZ.getValue()).booleanValue()) {
                    ((FeedRecommendFragment) feedFragment).LJLL.advanceToNextItem(false);
                } else {
                    ((FeedRecommendFragment) feedFragment).LJLL.scrollToNext();
                }
                ((AbstractC48820JEa) this.LJLJLJ.getValue()).LJIIIIZZ("[refreshWhenBack], scrollToNext");
                return;
            }
            feedFragment.LJLJJLL = "press_back";
            feedFragment.Gz();
            getContext();
            FMX.LJIIIIZZ("click_back_fresh", "homepage_hot", 0L);
            ((AbstractC48820JEa) this.LJLJLJ.getValue()).LJIIIIZZ("[refreshWhenBack], refreshWithAnim");
        }
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.protocol.IMFIconsProtocol
    public final List<LML> X() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC54151LNb
    public final void LLLLILI(Bundle bundle) {
        FeedFragment feedFragment;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        String string = bundle.getString("fromStart", "");
        C188787b0 c188787b0 = Hox.LJLLI;
        String sv0 = c188787b0.LIZ(LIZ).sv0("HOME");
        String sv02 = c188787b0.LIZ(LIZ).sv0(sv0);
        if (o.LJ(string, "MainPage") || bundle.getBoolean(sv0)) {
            ((MainAnimViewModel) ViewModelProviders.of(LIZ).get(MainAnimViewModel.class)).LJLJJI.setValue(Boolean.FALSE);
            return;
        }
        if (!o.LJ(string, "RootNode") && !bundle.getBoolean(sv02)) {
            return;
        }
        Fragment currentFragment = getCurrentFragment();
        if (!(currentFragment instanceof FeedFragment) || (feedFragment = (FeedFragment) currentFragment) == null) {
            return;
        }
        feedFragment.Dl();
    }

    @Override // X.InterfaceC54151LNb
    public final void LLLLLLZ(Bundle args) {
        InterfaceC18010nF interfaceC18010nF;
        o.LJIIIZ(args, "args");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        InterfaceC36571c5 LIZLLL = C212428Vi.LIZLLL(this);
        if (!(LIZLLL instanceof InterfaceC18010nF) || (interfaceC18010nF = (InterfaceC18010nF) LIZLLL) == null) {
            return;
        }
        if (!LIZ.getIntent().getBooleanExtra("pre_mainactivity_first_enter", false)) {
            C12460eI.LJIIIIZZ(interfaceC18010nF, LIZ);
        }
        String string = args.getString("fromStart", "");
        C188787b0 c188787b0 = Hox.LJLLI;
        String sv0 = c188787b0.LIZ(LIZ).sv0("HOME");
        String sv02 = c188787b0.LIZ(LIZ).sv0(sv0);
        if (o.LJ(string, "MainPage") || args.getBoolean(sv0)) {
            x3(true);
            ((MainAnimViewModel) ViewModelProviders.of(LIZ).get(MainAnimViewModel.class)).LJLJJI.setValue(Boolean.TRUE);
        } else {
            if (!o.LJ(string, "RootNode") && !args.getBoolean(sv02)) {
                return;
            }
            x3(true);
            ((MainAnimViewModel) ViewModelProviders.of(LIZ).get(MainAnimViewModel.class)).LJLJJI.setValue(Boolean.TRUE);
        }
    }

    @QD3
    public final void onDislikeAwemeEvent(C55274Lmg event) {
        HomePageDataViewModel homePageDataViewModel;
        LiveData liveData;
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI == 1 && (homePageDataViewModel = (HomePageDataViewModel) this.LJLJJL.getValue()) != null && (liveData = (LiveData) homePageDataViewModel.LJLLILLLL.getValue()) != null) {
            liveData.postValue(Boolean.TRUE);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Fragment LIZLLL;
        Integer num;
        ViewGroup viewGroup;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Integer num2 = null;
        KR8.LJIIJ(this, new C54325LTt(this, null));
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null || (LIZLLL = C212428Vi.LIZLLL(this)) == null) {
            return;
        }
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
        o.LJIIIIZZ(this.LJLIL.getValue(), "<get-flRootContainer>(...)");
        iFeedDebugService.LIZLLL();
        HomeViewPagerAbility v3 = v3();
        if (v3 != null) {
            v3.addOnPageChangeListener(new LNK(this));
        }
        HomeViewPagerAbility v32 = v3();
        if (v32 != null) {
            v32.oD(new AObserverS73S0200000_9(this, LIZ, 3));
        }
        HomeViewPagerAbility v33 = v3();
        if (v33 != null) {
            num = Integer.valueOf(v33.LLLZZ(0));
        } else {
            num = null;
        }
        HomeViewPagerAbility v34 = v3();
        if (v34 != null) {
            num2 = Integer.valueOf(v34.U10());
        }
        this.LJLJL = o.LJ(num, num2);
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            GlobalAcViewModel LIZ2 = LNL.LIZ(LIZ);
            LIZ2.getClass();
            new WeakReference(LIZLLL);
            LIZ2.LJLIL = new WeakReference<>(viewGroup);
            LIZ2.LJLILLLLZI = new WeakReference<>(LIZ);
            LIZ.getLifecycle().addObserver(LIZ2.LJLJJLL);
            LIZ2.LJLJI.observe(LIZ, new AObserverS77S0100000_9(LIZ2, 94));
            if (((Boolean) C35183DrP.LJIIIZ.getValue()).booleanValue()) {
                if (!((Boolean) C34710Djm.LJJIIJZLJL.getValue()).booleanValue()) {
                    C38995FSd.LIZIZ().submit(new ARunnableS45S0100000_9(LIZ2, 190));
                }
            } else {
                LIZ2.gv0();
            }
            SpecActServiceImpl.LJJJIL().LIZJ(viewGroup, LIZLLL);
            SearchServiceImpl.LLLZI().LLIZ();
        }
    }

    public final void x3(boolean z) {
        LNO lno = (LNO) this.LJLJJI.getValue();
        if (lno != null) {
            SpecialTopicEntry LJI = LNO.LJI();
            if (lno.LJLIL != null && LJI != null && LJI.getEnable() && !TextUtils.isEmpty(LJI.getLandingRoute()) && !TextUtils.isEmpty(LJI.getIconUrl())) {
                if (!AV1.LJIIJJI() || LJI.getChildViewable()) {
                    String LLLLLZ = lno.LJLJI.LLLLLZ();
                    if (a.LJIJI().LIZ()) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", LLLLLZ);
                        c188727au.LJIIIZ("type", LJI.getEventName());
                        c188727au.LJIIIZ("url", LJI.getLandingRoute());
                        FMX.LJIIL("topic_entrance_show", c188727au.LIZ);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC54152LNc
    public final void LJJJJI(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
    }
}
