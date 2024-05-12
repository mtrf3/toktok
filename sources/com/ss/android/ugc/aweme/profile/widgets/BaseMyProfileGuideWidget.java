package com.ss.android.ugc.aweme.profile.widgets;

import X.AMS;
import X.ANE;
import X.AOI;
import X.AOJ;
import X.AOP;
import X.AOV;
import X.AOZ;
import X.AV1;
import X.ActivityC45651qj;
import X.C04330Ez;
import X.C10K;
import X.C110614Vt;
import X.C188727au;
import X.C199097rd;
import X.C221108m2;
import X.C235759Nb;
import X.C237259Sv;
import X.C255199zv;
import X.C26132ANk;
import X.C26135ANn;
import X.C26136ANo;
import X.C26142ANu;
import X.C45804HyK;
import X.C53765L8f;
import X.C55096Ljo;
import X.C55230Lly;
import X.C57092Lx;
import X.C5H3;
import X.C61328O5c;
import X.C61447O9r;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72818Shy;
import X.C72972SkS;
import X.C73156SnQ;
import X.C73318Sq2;
import X.C77125UOr;
import X.C87030YDq;
import X.C99W;
import X.C9KA;
import X.EnumC221088m0;
import X.FMX;
import X.HG3;
import X.InterfaceC72822Si2;
import X.OSJ;
import X.QD3;
import X.RBX;
import X.RBY;
import X.TBT;
import X.ViewOnClickListenerC226978vV;
import X.ViewOnClickListenerC252769w0;
import X.X1D;
import X.YFM;
import Y.ARunnableS23S0200000_4;
import Y.AgS119S0100000_1;
import Y.IDAListenerS231S0100000_4;
import Y.IDxS305S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.music.service.ProfileMusicTabService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.survey.SurveyAnswer;
import com.ss.android.ugc.aweme.profile.ui.v2.MyProfileAbility;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.survey.SurveyData;
import com.ss.android.ugc.common.component.fragment.ComponentFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.IDqS451S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import yq4.a;

/* loaded from: classes5.dex */
public class BaseMyProfileGuideWidget extends ProfileWidget implements InterfaceC72822Si2 {
    public final String LJLJI;
    public final ComponentFragment LJLJJI;
    public final C5H3 LJLJJL;
    public View LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public AOZ LJLLI;
    public final C5H3 LJLLILLLL;
    public View LJLLJ;
    public ObjectAnimator LJLLL;
    public View LJLLLL;
    public AnimatorSet LJLLLLLL;
    public final WidgetLifecycleAwareLazy LJLZ;
    public final C73318Sq2 LJZ;
    public Aweme LJZI;
    public ProfileAigcIntroFragment LJZL;

    public OSJ[] LJIIJ(MyProfileGuideState myProfileGuideState, ProfileState profileState) {
        o.LJIIIZ(profileState, "profileState");
        o.LJIIIZ(myProfileGuideState, "myProfileGuideState");
        return new OSJ[0];
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.ProfileWidget, com.bytedance.widget.Widget
    public void onCreate() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super.onCreate();
        long currentTimeMillis = System.currentTimeMillis();
        EventBus.LIZJ().LJIILJJIL(this);
        C72818Shy.LIZLLL("profile_artist_highlight_guide_click", this);
        ProfileViewModel LIZ = LIZ();
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 628);
        LIZ.getClass();
        JediViewModel.wv0(LIZ, new TBT() { // from class: X.AOF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProfileState) obj).getTriggerCopyrightViolationSnackBarEvent();
            }
        }, null, new AqS170S0100000_4(aqS170S0100000_4, 957), 2, null);
        C73156SnQ.LJIIJ(this, LIZ(), new TBT() { // from class: X.ANx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProfileState) obj).isPostAwemeEmpty();
            }
        }, new TBT() { // from class: X.ANt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProfileState) obj).getLoadAvatar();
            }
        }, new TBT() { // from class: X.ANw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProfileState) obj).isFromMain();
            }
        }, new TBT() { // from class: X.ANy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProfileState) obj).getCurrentDownloadSetting();
            }
        }, new C26142ANu(this));
        C73156SnQ.LJIIIIZZ(this, LIZ(), new TBT() { // from class: X.ANr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileState) obj).getOnHiddenChanged());
            }
        }, new AqS186S0100000_4(this, 174));
        C73156SnQ.LJIIL(this, LJI(), new AqS186S0100000_4(this, 175));
        C73156SnQ.LJIIIZ(this, LIZ(), new TBT() { // from class: X.ANq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileState) obj).getOnHiddenChanged());
            }
        }, new TBT() { // from class: X.ANv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProfileState) obj).isFromMain();
            }
        }, new TBT() { // from class: X.ANs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileState) obj).isFirstNodeShow());
            }
        }, new IDqS451S0100000_4(this, 5));
        if (a.LJIILL().LJIJ()) {
            LJI().Hv0(C26135ANn.LJLIL);
        } else if (((RBY) HG3.LJIILL()).isChildrenMode()) {
            LJI().Hv0(C26136ANo.LJLIL);
        } else {
            AOV.LIZ().LIZ = new AOJ(LJI());
            AOV.LIZ().LIZJ();
            ProfileMusicTabService.LJIJJLI().LJIIZILJ(new ANE(LJI()));
        }
        C87030YDq.LIZIZ.needShowDiskManagerGuideView().LIZ(new IDxS305S0100000_4(this, 14));
        ViewGroup.LayoutParams layoutParams2 = null;
        C10K.LIZJ(new Callable() { // from class: X.9uT
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Keva repo = Keva.getRepo("keva_repo_profile_component");
                int i = repo.getInt("show_yt_removed_toast", -1);
                if (i == 1) {
                    repo.storeInt("show_yt_removed_toast", 0);
                }
                return Integer.valueOf(i);
            }
        }).LJ(new AgS119S0100000_1(this, 1), C10K.LJIIIIZZ, null);
        MyProfileGuideViewModel myProfileGuideViewModel = LJI();
        o.LJIIIZ(myProfileGuideViewModel, "myProfileGuideViewModel");
        AOI.LIZIZ = new WeakReference<>(myProfileGuideViewModel);
        C57092Lx.LIZ.getClass();
        int LIZ2 = C61447O9r.LIZ();
        if (C53765L8f.LJIIJJI()) {
            LIZ2 = 0;
        }
        ViewOnClickListenerC252769w0 LJFF = LJFF();
        if (LJFF != null) {
            layoutParams = LJFF.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams2.bottomMargin = LIZ2;
        }
        ViewOnClickListenerC226978vV LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            layoutParams2 = LIZLLL.getLayoutParams();
        }
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.bottomMargin = LIZ2;
        }
        ViewOnClickListenerC226978vV LIZLLL2 = LIZLLL();
        if (LIZLLL2 != null) {
            LIZLLL2.setNoticeBackgroundColor(C04330Ez.LIZIZ(C77125UOr.LIZJ(this), R.color.cz));
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (!C237259Sv.LJI) {
            C237259Sv.LJI = true;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("profile_attributes", C237259Sv.LJIIIIZZ);
            c188727au.LJIIIZ("report_scene", "profile_popup_init");
            c188727au.LJ(currentTimeMillis2, "page_popup_init_cost_time");
            FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.ProfileWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZIZ() {
        int i;
        AOZ aoz = this.LJLLI;
        int i2 = 0;
        if (aoz != null && aoz.LJLLLL) {
            o.LJI(aoz);
            View view = aoz.LJLILLLLZI;
            if (view != null) {
                view.setVisibility(8);
            }
            aoz.LIZ();
            aoz.LJLLLL = false;
            AOV LIZ = AOV.LIZ();
            AOZ aoz2 = this.LJLLI;
            o.LJI(aoz2);
            SurveyData surveyData = aoz2.LJLLILLLL;
            if (surveyData != null) {
                i = surveyData.dialogId;
            } else {
                i = 0;
            }
            AOZ aoz3 = this.LJLLI;
            o.LJI(aoz3);
            SurveyData surveyData2 = aoz3.LJLLILLLL;
            if (surveyData2 != null) {
                i2 = surveyData2.originId;
            }
            SurveyAnswer surveyAnswer = new SurveyAnswer(3, i, i2);
            LIZ.getClass();
            AOV.LIZIZ(surveyAnswer);
        }
    }

    public final ViewOnClickListenerC252769w0 LIZJ() {
        View view = this.contentView;
        o.LJI(view);
        View findViewById = view.findViewById(R.id.n_g);
        o.LJIIIIZZ(findViewById, "contentView!!.findViewBy…bind_phone_number_notice)");
        return (ViewOnClickListenerC252769w0) findViewById;
    }

    public final ViewOnClickListenerC226978vV LIZLLL() {
        View view = this.contentView;
        o.LJI(view);
        return (ViewOnClickListenerC226978vV) view.findViewById(R.id.nao);
    }

    public final ViewOnClickListenerC252769w0 LJFF() {
        View view = this.contentView;
        o.LJI(view);
        return (ViewOnClickListenerC252769w0) view.findViewById(R.id.nbq);
    }

    public final MyProfileGuideViewModel LJI() {
        return (MyProfileGuideViewModel) this.LJLZ.getValue();
    }

    public final void LJIIIIZZ() {
        if (this.LJLJJLL != null) {
            return;
        }
        View inflate = ((ViewStub) this.LJLJJL.getValue()).inflate();
        this.LJLJJLL = inflate;
        C57092Lx.LIZ.getClass();
        int LIZ = C61447O9r.LIZ();
        if (C53765L8f.LJIIJJI()) {
            LIZ = 0;
        }
        C45804HyK.LJJL(LIZ, inflate);
        View view = this.LJLJJLL;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public final boolean LJIIIZ() {
        MyProfileAbility myProfileAbility = (MyProfileAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this.LJLJJI, null), MyProfileAbility.class, null);
        if (myProfileAbility != null) {
            return myProfileAbility.isFromMain();
        }
        return false;
    }

    public final void LJIILJJIL() {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(C77125UOr.LIZJ(this));
        if (LJJIFFI == null) {
            return;
        }
        AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().showSurveyBannerInProfilePage(C235759Nb.LIZ(LJJIFFI), (ViewStub) this.LJLJLLL.getValue(), R.id.i6t, LJJIFFI);
    }

    public final void LJIILLIIL() {
        ActivityC45651qj LIZJ = C77125UOr.LIZJ(this);
        LJIIIIZZ();
        View view = this.LJLJJLL;
        if (view == null) {
            return;
        }
        view.setLayerType(2, null);
        Animation loadAnimation = AnimationUtils.loadAnimation(LIZJ, R.anim.es);
        loadAnimation.setRepeatMode(2);
        loadAnimation.setRepeatCount(-1);
        loadAnimation.setAnimationListener(new IDAListenerS231S0100000_4(this, 1));
        View view2 = this.LJLJJLL;
        if (view2 != null) {
            view2.startAnimation(loadAnimation);
        }
    }

    public final void LJIIZILJ() {
        boolean z;
        ViewOnClickListenerC252769w0 LJFF;
        ViewOnClickListenerC252769w0 LJFF2;
        ViewOnClickListenerC252769w0 LJFF3 = LJFF();
        if (LJFF3 != null && LJFF3.getVisibility() == 0) {
            C26132ANk LIZ = C26132ANk.LIZ();
            if (LIZ.LIZJ.getInt("show_bar_time", 0) >= LIZ.LIZIZ) {
                z = true;
            } else {
                z = false;
            }
            if (z && (LJFF2 = LJFF()) != null) {
                LJFF2.setVisibility(8);
            }
            C26132ANk LIZ2 = C26132ANk.LIZ();
            LIZ2.LIZJ.storeInt("show_bar_time", LIZ2.LIZJ.getInt("show_bar_time", 0) + 1);
            C26132ANk LIZ3 = C26132ANk.LIZ();
            if (LIZ3.LIZJ.getInt("show_bar_time", 0) < LIZ3.LIZIZ || (LJFF = LJFF()) == null) {
                return;
            }
            LJFF.setVisibility(8);
        }
    }

    @Override // com.bytedance.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        AOV.LIZ().LIZ = null;
        EventBus.LIZJ().LJIJ(this);
        C72818Shy.LJII("profile_artist_highlight_guide_click", this);
        IProfileMusicTabService LJIJJLI = ProfileMusicTabService.LJIJJLI();
        if (LJIJJLI != null) {
            LJIJJLI.LJIIJJI();
        }
        this.LJZ.LIZLLL();
    }

    @Override // com.bytedance.widget.Widget
    public final void onPause() {
        Animation animation;
        Animation animation2;
        super.onPause();
        View view = this.LJLJJLL;
        if (view != null && (animation2 = view.getAnimation()) != null) {
            animation2.cancel();
            animation2.reset();
        }
        ObjectAnimator objectAnimator = this.LJLLL;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.pause();
        }
        View view2 = this.LJLLLL;
        if (view2 != null && (animation = view2.getAnimation()) != null) {
            animation.cancel();
            animation.reset();
        }
        AnimatorSet animatorSet = this.LJLLLLLL;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.pause();
        }
    }

    @Override // com.bytedance.widget.Widget
    public void onResume() {
        View view;
        Animation animation;
        View view2;
        super.onResume();
        View view3 = this.LJLJJLL;
        if (view3 != null && view3.getVisibility() == 0) {
            LJIILLIIL();
        }
        ObjectAnimator objectAnimator = this.LJLLL;
        if (objectAnimator != null && (view2 = this.LJLLJ) != null && view2.getVisibility() == 0 && objectAnimator.isPaused()) {
            objectAnimator.resume();
        }
        View view4 = this.LJLLLL;
        if (view4 != null && view4.getVisibility() == 0 && (animation = view4.getAnimation()) != null) {
            animation.start();
        }
        AnimatorSet animatorSet = this.LJLLLLLL;
        if (animatorSet != null && (view = this.LJLLLL) != null && view.getVisibility() == 0 && animatorSet.isPaused()) {
            animatorSet.resume();
        }
        LJIIZILJ();
    }

    public static void LJIIL(boolean z) {
        Keva repo = Keva.getRepo("account_security_keva_name");
        StringBuilder LJFF = C72972SkS.LJFF("prior_to_safe_info", '_');
        LJFF.append(((RBX) HG3.LJIILL()).getCurUserId());
        repo.storeBoolean(X1D.LIZIZ(LJFF), z);
        YFM.LIZIZ.postSafeInfoNoticeEvent(z);
    }

    public final void LJIIJJI(int i) {
        if (i == 0) {
            View view = this.LJLJJLL;
            if (view != null && view.getVisibility() == 0) {
                return;
            }
            LJIIIIZZ();
            View view2 = this.LJLJJLL;
            if (view2 != null) {
                view2.setVisibility(i);
                view2.setScaleX(0.8f);
                view2.setScaleY(0.8f);
                LJIILLIIL();
                return;
            }
            return;
        }
        View view3 = this.LJLJJLL;
        if (view3 != null) {
            view3.setVisibility(i);
            View view4 = this.LJLJJLL;
            if (view4 != null) {
                view4.clearAnimation();
            }
        }
    }

    public final boolean LJIILIIL(ProfileState profileState) {
        User curUser;
        o.LJIIIZ(profileState, "profileState");
        if (AV1.LJIIJJI() || !LJIIIZ()) {
            return false;
        }
        Boolean isPostAwemeEmpty = profileState.isPostAwemeEmpty();
        Boolean bool = Boolean.TRUE;
        if (((!o.LJ(isPostAwemeEmpty, bool) || (curUser = ((RBX) HG3.LJIILL()).getCurUser()) == null || curUser.getAwemeCount() != 0) && (!AOP.LIZ || !o.LJ(profileState.isPostAwemeEmptyWhenPrivateShow(), bool))) || !C255199zv.LJIILL() || a.LJ().LJ(1)) {
            return false;
        }
        return true;
    }

    public final void LJIILL(View view) {
        ViewOnClickListenerC252769w0 viewOnClickListenerC252769w0;
        this.LJLLLL = view;
        if (view != null) {
            view.post(new ARunnableS23S0200000_4(this, view, 16));
        }
        if (C99W.LIZ) {
            View view2 = this.LJLLLL;
            if (!(view2 instanceof ViewOnClickListenerC226978vV)) {
                view2 = null;
            }
            if (view2 != null) {
                View findViewById = view2.findViewById(R.id.h41);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(12);
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.ct);
                Context context = view2.getContext();
                o.LJIIIIZZ(context, "it.context");
                findViewById.setBackground(c110614Vt.LIZ(context));
            }
            View view3 = this.LJLLLL;
            if ((view3 instanceof ViewOnClickListenerC252769w0) && (viewOnClickListenerC252769w0 = (ViewOnClickListenerC252769w0) view3) != null) {
                View LIZ = viewOnClickListenerC252769w0.LIZ(R.id.h3w);
                C110614Vt c110614Vt2 = new C110614Vt();
                c110614Vt2.LIZJ = C61328O5c.LIZJ(12);
                c110614Vt2.LIZIZ = Integer.valueOf(R.attr.ct);
                Context context2 = viewOnClickListenerC252769w0.getContext();
                o.LJIIIIZZ(context2, "it.context");
                LIZ.setBackground(c110614Vt2.LIZ(context2));
                viewOnClickListenerC252769w0.LIZ(R.id.ezm).getClass();
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onProfilePageScrolledEvent(C9KA event) {
        o.LJIIIZ(event, "event");
        View view = this.contentView;
        o.LJI(view);
        View findViewById = view.findViewById(R.id.n_b);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        IProfileMusicTabService LJIJJLI;
        if (o.LJ(c199097rd.LJLIL, "profile_artist_highlight_guide_click") && (LJIJJLI = ProfileMusicTabService.LJIJJLI()) != null) {
            LJIJJLI.LJIIIIZZ(c199097rd);
        }
    }

    public BaseMyProfileGuideWidget(ComponentFragment fragment, ViewGroup contentView) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(contentView, "contentView");
        this.contentView = contentView;
        this.LJLJJI = fragment;
        this.LJLJI = "BaseMyProfileGuieWidget";
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, new AqS154S0100000_4(this, 712));
        this.LJLJL = C221108m2.LIZ(enumC221088m0, new AqS154S0100000_4(this, 713));
        this.LJLJLJ = C221108m2.LIZ(enumC221088m0, new AqS154S0100000_4(this, 709));
        this.LJLJLLL = C221108m2.LIZ(enumC221088m0, new AqS154S0100000_4(this, 710));
        this.LJLL = C221108m2.LIZ(enumC221088m0, new AqS154S0100000_4(this, 714));
        this.LJLLILLLL = C221108m2.LIZ(enumC221088m0, new AqS154S0100000_4(this, 711));
        C65776Prg LIZ = C65352Pkq.LIZ(MyProfileGuideViewModel.class);
        AqS151S0200000_4 aqS151S0200000_4 = new AqS151S0200000_4(this, LIZ, 17);
        this.LJLZ = new WidgetLifecycleAwareLazy(this, aqS151S0200000_4, new AqS64S0400000_4(this, aqS151S0200000_4, LIZ, AMS.INSTANCE, 16));
        this.LJZ = new C73318Sq2();
    }
}
