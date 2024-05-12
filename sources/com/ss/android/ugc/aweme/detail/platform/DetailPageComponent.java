package com.ss.android.ugc.aweme.detail.platform;

import X.AbstractActivityC164886dY;
import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C16970lZ;
import X.C174826ta;
import X.C175046tw;
import X.C178596zf;
import X.C188727au;
import X.C201667vm;
import X.C2068389v;
import X.C207668Da;
import X.C220488l2;
import X.C220858ld;
import X.C221108m2;
import X.C222578oP;
import X.C227768wm;
import X.C26045AKb;
import X.C2J0;
import X.C2KC;
import X.C2KM;
import X.C2MA;
import X.C2S6;
import X.C2U8;
import X.C35138Dqg;
import X.C3A5;
import X.C3SZ;
import X.C40443Fu3;
import X.C41379GLv;
import X.C47285Ih7;
import X.C50419JqZ;
import X.C52593KkX;
import X.C53816LAe;
import X.C54060LJo;
import X.C54081LKj;
import X.C54082LKk;
import X.C54990Li6;
import X.C55061LjF;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55274Lmg;
import X.C55281Lmn;
import X.C55310LnG;
import X.C55313LnJ;
import X.C55453LpZ;
import X.C55457Lpd;
import X.C55723Ltv;
import X.C55734Lu6;
import X.C56272It;
import X.C58704N2e;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C72Y;
import X.C73305Spp;
import X.C73306Spq;
import X.C76V;
import X.C78540Us4;
import X.C78983UzD;
import X.C78996UzQ;
import X.C7HV;
import X.C80796VnM;
import X.C84193Sd;
import X.C84763XOl;
import X.C8JC;
import X.C8RO;
import X.C98593tv;
import X.EF7;
import X.FMX;
import X.IDP;
import X.IWF;
import X.InterfaceC109364Qy;
import X.InterfaceC45541Hu5;
import X.InterfaceC46330IGg;
import X.InterfaceC49873Jhl;
import X.InterfaceC50391Jq7;
import X.InterfaceC51679KPz;
import X.InterfaceC51771KTn;
import X.InterfaceC54054LJi;
import X.InterfaceC55058LjC;
import X.InterfaceC55062LjG;
import X.InterfaceC55219Lln;
import X.InterfaceC55235Lm3;
import X.InterfaceC55317LnN;
import X.InterfaceC55336Lng;
import X.InterfaceC98813uH;
import X.JG5;
import X.JHI;
import X.KL2;
import X.KQ5;
import X.KQK;
import X.KUR;
import X.LFH;
import X.LKF;
import X.LM2;
import X.LRD;
import X.LYS;
import X.M89;
import X.OHQ;
import X.OSZ;
import X.QD3;
import X.V0N;
import X.X1D;
import X.Z9N;
import Y.ACListenerS28S0100000_8;
import Y.ARunnableS45S0100000_9;
import Y.IDCListenerS284S0100000_9;
import Y.IDDListenerS103S0200000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.component.ExploreStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.editpost.EditPostBizPermissionStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.camera.exp.DMCameraSafetyExperiment;
import com.ss.android.ugc.aweme.im.service.model.MediaSafetyModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.cell.im.safety.SafetyViewModel;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.detail.LegacyDetailAbilityDetail;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public class DetailPageComponent extends BasePanelUIComponent implements LegacyDetailAbilityDetail, IDetailPageAbility, KQK {
    public DetailPageFragment LJLJJI;
    public final C62822Ol8 LJLJJL;
    public ActivityC45651qj LJLJJLL;
    public final String LJLJL;
    public View LJLJLJ;
    public ViewStub LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public TuxIconView LJLLILLLL;
    public View LJLLJ;
    public ViewStub LJLLL;
    public ViewStub LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public M89 LJZ;
    public boolean LJZI;
    public DetailFragmentPanel LJZL;
    public boolean LL;
    public InterfaceC55336Lng LLD;
    public boolean LLF;
    public int LLFF;
    public ExploreStayTimeFragmentComponent LLFFF;
    public LKF LLFII;
    public Aweme LLFZ;
    public InterfaceC51679KPz LLI;
    public final C8RO LLIFFJFJJ;
    public ViewGroup LLII;
    public IFeedCleanAbility LLIIII;
    public final C55061LjF LLIIIILZ;
    public AnimatorSet LLIIIJ;
    public boolean LLIIIL;
    public final int LLIIIZ;
    public IRefreshAbility LLIIJI;
    public LoadMorePanelComponentTempHelper LLIIJLIL;
    public IPageStateAbility LLIIL;

    @Override // X.InterfaceC55112Lk4
    public final void LJJIJIL() {
        K3(4);
    }

    @Override // X.InterfaceC58812Sn
    public final /* synthetic */ void Lf() {
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final void P90() {
        C80796VnM viewPager;
        this.LL = false;
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel != null && (viewPager = detailFragmentPanel.getViewPager()) != null) {
            viewPager.setDisableScroll(true);
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return "detail_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final DetailPageComponent lk() {
        return this;
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    public DetailPageComponent() {
        new LinkedHashMap();
        this.LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 48));
        this.LJLJL = "action_remove_recommend_user_card";
        this.LJZ = new M89();
        this.LL = true;
        this.LLIFFJFJJ = new C8RO("DetailPageFragment");
        this.LLIIIILZ = new C55061LjF(this);
        this.LLIIIL = true;
        this.LLIIIZ = 150;
    }

    public final void C3() {
        View view;
        if (this.LJLLJ == null) {
            ViewStub viewStub = this.LJLLL;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            this.LJLLJ = view;
        }
        View view2 = this.LJLLJ;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 10), view2);
        }
        View view3 = this.LJLLJ;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(0);
    }

    public final String F3() {
        if (TextUtils.equals(this.LJZ.getFrom(), "from_duet_mode")) {
            return "duet";
        }
        if (TextUtils.equals(this.LJZ.getFrom(), "from_duet_mode_detail")) {
            return "original";
        }
        return "";
    }

    public final void H3() {
        if (C55723Ltv.LIZIZ.LJIJ().LJIJ(getFragment())) {
            View view = this.LJLLI;
            if (view != null) {
                view.setVisibility(4);
            }
            TuxIconView tuxIconView = this.LJLLILLLL;
            if (tuxIconView == null) {
                return;
            }
            tuxIconView.setVisibility(4);
            return;
        }
        String eventType = this.LJZ.getEventType();
        if (eventType != null && (o.LJ(eventType, "story_archive") || o.LJ(eventType, "web"))) {
            View view2 = this.LJLLI;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            TuxIconView tuxIconView2 = this.LJLLILLLL;
            if (tuxIconView2 == null) {
                return;
            }
            tuxIconView2.setVisibility(4);
            return;
        }
        View view3 = this.LJLLI;
        if (view3 != null) {
            view3.setVisibility(4);
        }
        TuxIconView tuxIconView3 = this.LJLLILLLL;
        if (tuxIconView3 == null) {
            return;
        }
        tuxIconView3.setVisibility(0);
    }

    public void I3() {
        View view;
        IFeedCleanAbility iFeedCleanAbility = this.LLIIII;
        if (iFeedCleanAbility != null) {
            iFeedCleanAbility.xT(this.LJLJLJ);
        }
        IFeedCleanAbility iFeedCleanAbility2 = this.LLIIII;
        if (iFeedCleanAbility2 != null) {
            iFeedCleanAbility2.xT(this.LLII);
        }
        IFeedCleanAbility iFeedCleanAbility3 = this.LLIIII;
        if (iFeedCleanAbility3 != null) {
            DetailFragmentPanel detailFragmentPanel = this.LJZL;
            if (detailFragmentPanel != null) {
                view = detailFragmentPanel.LLFZ;
            } else {
                view = null;
            }
            iFeedCleanAbility3.xT(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public void Jk() {
        InterfaceC55317LnN interfaceC55317LnN;
        String str;
        Integer num;
        Bundle arguments;
        NewFaceStickerBean stickerEntranceInfo;
        C80796VnM viewPager;
        if (TextUtils.equals(this.LJZ.getEventType(), "others_homepage")) {
            C2U8.LIZ(new C55281Lmn());
        }
        Aweme aweme = this.LLFZ;
        if (aweme != null && aweme.isAd()) {
            C58704N2e.LIZLLL("draw_ad", "search_return", aweme.getAwemeRawAd()).LJI();
        }
        if (this.LLFZ != null && this.LJZ.isFromEffectDiscover()) {
            C188727au c188727au = new C188727au();
            if (this.LJZ.isFromEffectDiscoverTab()) {
                c188727au.LJI("enter_from", "prop_page_discover");
            } else if (this.LJZ.isFromEffectDiscoverPanel()) {
                c188727au.LJI("enter_from", "video_shoot_page");
            }
            Aweme aweme2 = this.LLFZ;
            String str2 = null;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("group_id", str);
            DetailFragmentPanel detailFragmentPanel = this.LJZL;
            if (detailFragmentPanel != null && (viewPager = detailFragmentPanel.getViewPager()) != null) {
                num = Integer.valueOf(viewPager.getCurrentItem());
            } else {
                num = null;
            }
            c188727au.LJFF(num, "impr_position");
            Aweme aweme3 = this.LLFZ;
            if (aweme3 != null && aweme3.getStickerEntranceInfo() != null) {
                Aweme aweme4 = this.LLFZ;
                if (aweme4 != null && (stickerEntranceInfo = aweme4.getStickerEntranceInfo()) != null) {
                    str2 = stickerEntranceInfo.id;
                }
                c188727au.LJI("prop_id", str2);
            }
            if (this.LJZ.isFromEffectDiscoverPanel() && (arguments = getFragment().getArguments()) != null) {
                c188727au.LJI("creation_id", arguments.getString("creation_id", ""));
                c188727au.LJI("shoot_way", arguments.getString("shoot_way", ""));
                c188727au.LJI("shoot_tab_name", arguments.getString("shoot_tab_name", ""));
            }
            FMX.LJIIL("back_to_prop_discover_feed", c188727au.LIZ);
        }
        DetailFragmentPanel detailFragmentPanel2 = this.LJZL;
        if (detailFragmentPanel2 != null && (interfaceC55317LnN = detailFragmentPanel2.LLII) != null) {
            interfaceC55317LnN.R7();
        }
        LJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI() {
        C98593tv c98593tv;
        Fragment fragment;
        InterfaceC55058LjC interfaceC55058LjC;
        Fragment fragment2;
        SafetyViewModel safetyViewModel;
        Aweme LJIILJJIL;
        MediaSafetyModel dMMediaSafetyModel;
        int i;
        DetailFragmentPanel detailFragmentPanel;
        InterfaceC46330IGg playerManager;
        Long valueOf;
        if (this.LLFZ != null && this.LJZ.isFromSharedStory() && (detailFragmentPanel = this.LJZL) != null && (playerManager = detailFragmentPanel.getPlayerManager()) != null && (valueOf = Long.valueOf(playerManager.getCurrentPosition())) != null && valueOf.longValue() > 0 && this.LJZ.getPrevPanelId() > 0) {
            C55723Ltv.LIZIZ.LJII().LIZJ(this.LJZ.getPrevPanelId(), valueOf.longValue());
        }
        Aweme aweme = getAweme();
        String from = getFrom();
        if (aweme != null && from != null) {
            C55734Lu6 c55734Lu6 = C55734Lu6.LIZIZ;
            if (c55734Lu6.LJJJLIIL().LIZ()) {
                c55734Lu6.LJJJLIIL().LIZIZ(aweme, from);
            }
        }
        if (MSAdaptionService.LJIIL().LIZIZ(getActivity())) {
            SmartRoute buildRoute = SmartRouter.buildRoute(getActivity(), "//duo");
            buildRoute.withParam("duo_type", "duo_back");
            buildRoute.open();
            return;
        }
        if (N3() && (fragment2 = getFragment()) != null && (safetyViewModel = (SafetyViewModel) ViewModelProviders.of(fragment2).get(SafetyViewModel.class)) != null && (LJIILJJIL = C78996UzQ.LJIILJJIL(this.LLFZ)) != null && (dMMediaSafetyModel = LJIILJJIL.getDMMediaSafetyModel()) != null && !safetyViewModel.LJLILLLLZI && !safetyViewModel.LJLIL) {
            InterfaceC45541Hu5 cameraService = IMService.createIIMServicebyMonsterPlugin(false).getCameraService();
            if (dMMediaSafetyModel.isNudityMask() && dMMediaSafetyModel.isSafetyMask()) {
                i = 2;
            } else if (dMMediaSafetyModel.isNudityMask()) {
                i = 1;
            } else {
                i = 0;
            }
            cameraService.LIZLLL(i, safetyViewModel.LJLJI);
        }
        if (this.LJZ.getEnterChatParam() != null) {
            Serializable enterChatParam = this.LJZ.getEnterChatParam();
            if ((enterChatParam instanceof C98593tv) && (c98593tv = (C98593tv) enterChatParam) != null) {
                if (!c98593tv.isQuickChat()) {
                    IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LJFF(c98593tv);
                } else {
                    Activity[] activityStack = ActivityStack.getActivityStack();
                    o.LJIIIIZZ(activityStack, "getActivityStack()");
                    int length = activityStack.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        AbstractActivityC164886dY abstractActivityC164886dY = activityStack[i2];
                        if ((abstractActivityC164886dY instanceof InterfaceC55058LjC) && (interfaceC55058LjC = (InterfaceC55058LjC) abstractActivityC164886dY) != null) {
                            fragment = interfaceC55058LjC.getCurFragment();
                        } else {
                            fragment = null;
                        }
                        if (fragment instanceof InterfaceC54054LJi) {
                            if (abstractActivityC164886dY != 0) {
                                InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
                                c98593tv.setContext(abstractActivityC164886dY);
                                imChatService.LJFF(c98593tv);
                            }
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        ActivityC45651qj activity = getActivity();
        if (activity != null && (activity instanceof DetailActivity)) {
            ((DetailActivity) activity).LLFZ();
        }
        ActivityC45651qj activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        this.LLIFFJFJJ.LJIIIIZZ("[finishActivity]");
        M89 m89 = this.LJZ;
        if (m89 == null || !m89.isFromAdsActivity() || activity == null) {
            return;
        }
        activity.overridePendingTransition(R.anim.dk, R.anim.dk);
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final void LV() {
        C55313LnJ c55313LnJ;
        if (this.LJZL != null && !hasMore()) {
            return;
        }
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel != null && C72Y.LIZ() && (c55313LnJ = detailFragmentPanel.LLJILLL) != null && c55313LnJ.LJ && !c55313LnJ.LJI) {
            c55313LnJ.LIZIZ();
            return;
        }
        InterfaceC51679KPz interfaceC51679KPz = this.LLI;
        if (interfaceC51679KPz instanceof InterfaceC50391Jq7) {
            o.LJII(interfaceC51679KPz, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.operators.IDetailPageOperator.OnPreLoad");
            ((InterfaceC50391Jq7) interfaceC51679KPz).setPreLoad(true);
        } else {
            DetailFragmentPanel detailFragmentPanel2 = this.LJZL;
            if (detailFragmentPanel2 != null) {
                detailFragmentPanel2.LLIIIZ = true;
            }
        }
        K3(4);
    }

    public final boolean N3() {
        Aweme LJIILJJIL;
        MediaSafetyModel dMMediaSafetyModel;
        DMCameraSafetyExperiment.LIZ.getClass();
        if (!DMCameraSafetyExperiment.LIZLLL || (LJIILJJIL = C78996UzQ.LJIILJJIL(this.LLFZ)) == null || (dMMediaSafetyModel = LJIILJJIL.getDMMediaSafetyModel()) == null || !dMMediaSafetyModel.isSafeMode()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final Aweme O1() {
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel != null) {
            return detailFragmentPanel.O1();
        }
        return null;
    }

    public final void O3() {
        C73305Spp c73305Spp;
        ViewStub viewStub = this.LJLLLL;
        if (viewStub != null && this.LJLLLLLL != null) {
            viewStub.setLayoutResource(R.layout.alm);
            ViewStub viewStub2 = this.LJLLLL;
            if (viewStub2 != null) {
                viewStub2.inflate();
            }
            View view = this.LJLLLLLL;
            if (view != null && (c73305Spp = (C73305Spp) view.findViewById(R.id.n80)) != null) {
                C73306Spq c73306Spq = new C73306Spq();
                String string = c73305Spp.getContext().getString(R.string.paj);
                o.LJIIIIZZ(string, "statusView.context.getSt…R.string.private_account)");
                c73306Spq.LJFF = string;
                String string2 = c73305Spp.getContext().getString(R.string.pal);
                o.LJIIIIZZ(string2, "statusView.context.getSt…ing.private_account_desc)");
                c73306Spq.LJI = string2;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_large_lock;
                c2068389v.LJ = Integer.valueOf(R.attr.dm);
                c73306Spq.LIZ(c2068389v);
                c73305Spp.setStatus(c73306Spq);
            }
        }
        ActivityC45651qj activity = getActivity();
        if (activity != null) {
            C84193Sd.LIZ(activity).tv0(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final long Sb() {
        IDP idp;
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel == null || (idp = detailFragmentPanel.mPlayerController) == null) {
            return -1L;
        }
        return idp.LJJJJI(JHI.LIZ().LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final int Zg() {
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel != null) {
            return detailFragmentPanel.Zg();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final long aG() {
        String str;
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel == null) {
            return -1L;
        }
        Aweme O1 = detailFragmentPanel.O1();
        if (O1 != null) {
            str = O1.getAid();
        } else {
            str = "";
        }
        IDP idp = detailFragmentPanel.mPlayerController;
        if (idp == null) {
            return -1L;
        }
        return idp.LJJJJI(str);
    }

    @Override // X.NK1
    public final boolean cd() {
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel == null || !detailFragmentPanel.isShareDialogShowing()) {
            return false;
        }
        return true;
    }

    public final ActivityC45651qj getActivity() {
        if (this.LJLJJLL == null && KQ5.LIZ()) {
            this.LJLJJLL = getPanelContext().LIZ();
        }
        return this.LJLJJLL;
    }

    @Override // X.KQK
    public final Aweme getAweme() {
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel != null) {
            return detailFragmentPanel.LJJLJ();
        }
        return null;
    }

    public final Fragment getFragment() {
        return (Fragment) this.LJLJJL.getValue();
    }

    @Override // X.KQK
    public final String getFrom() {
        return this.LJZ.getFrom();
    }

    @Override // X.KQK
    public final KUR getStatusView() {
        IPageStateAbility iPageStateAbility = this.LLIIL;
        if (iPageStateAbility == null) {
            return null;
        }
        return iPageStateAbility.kp0();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final boolean hasMore() {
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel != null) {
            return detailFragmentPanel.hasMore();
        }
        return false;
    }

    @Override // X.InterfaceC58812Sn
    public final boolean mf() {
        InterfaceC51679KPz interfaceC51679KPz;
        InterfaceC51679KPz interfaceC51679KPz2 = this.LLI;
        if (interfaceC51679KPz2 == null || interfaceC51679KPz2.isLoading() || ((interfaceC51679KPz = this.LLI) != null && interfaceC51679KPz.cannotLoadMore())) {
            return false;
        }
        InterfaceC51679KPz interfaceC51679KPz3 = this.LLI;
        if (interfaceC51679KPz3 instanceof InterfaceC50391Jq7) {
            o.LJII(interfaceC51679KPz3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.operators.IDetailPageOperator.OnPreLoad");
            ((InterfaceC50391Jq7) interfaceC51679KPz3).setPreLoad(true);
        } else {
            DetailFragmentPanel detailFragmentPanel = this.LJZL;
            if (detailFragmentPanel != null) {
                detailFragmentPanel.LLIIIZ = true;
            }
        }
        return K3(4);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final boolean mq() {
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel != null) {
            return detailFragmentPanel.LJLLILLLL;
        }
        return false;
    }

    @Override // X.InterfaceC55292Lmy
    public final boolean sd() {
        InterfaceC51679KPz interfaceC51679KPz;
        InterfaceC51679KPz interfaceC51679KPz2 = this.LLI;
        if (interfaceC51679KPz2 == null || interfaceC51679KPz2.isLoading() || ((interfaceC51679KPz = this.LLI) != null && interfaceC51679KPz.cannotLoadLatest())) {
            return false;
        }
        InterfaceC51679KPz interfaceC51679KPz3 = this.LLI;
        if (!(interfaceC51679KPz3 instanceof InterfaceC51771KTn)) {
            return false;
        }
        if (interfaceC51679KPz3 instanceof InterfaceC50391Jq7) {
            o.LJII(interfaceC51679KPz3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.operators.IDetailPageOperator.OnPreLoad");
            ((InterfaceC50391Jq7) interfaceC51679KPz3).setPreLoad(true);
        } else {
            DetailFragmentPanel detailFragmentPanel = this.LJZL;
            if (detailFragmentPanel != null) {
                detailFragmentPanel.LLIIIZ = true;
            }
        }
        return K3(2);
    }

    public final Context E3() {
        Fragment fragment = getFragment();
        if (KQ5.LIZ()) {
            return getContext();
        }
        return fragment.getContext();
    }

    public final ActivityC45651qj L3() {
        ActivityC45651qj activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Fragment ");
        LIZ.append(this);
        LIZ.append(" not attached to an activity.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.C8W0, androidx.lifecycle.LifecycleOwner
    public final LifecycleRegistry getLifecycle() {
        if (KQ5.LIZ()) {
            return super.getLifecycle();
        }
        Lifecycle lifecycle = getFragment().getLifecycle();
        o.LJII(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
        return (LifecycleRegistry) lifecycle;
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        Context E3 = E3();
        ActivityC45651qj activity = getActivity();
        if (E3 != null && activity != null) {
            return C54081LKj.LIZ(E3, activity);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IViewPagerComponentAbility getViewPagerComponentAbility() {
        return C78540Us4.LJIIIZ(getFragment());
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        if (KQ5.LIZ()) {
            M3(true, false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        if (this.LJZ.isfollowSkyLight()) {
            LYS.LIZ = new LinkedHashMap();
            LYS.LIZIZ = new LinkedHashMap();
        }
        C40443Fu3.LIZ("detail_page").LIZIZ();
        this.LLIFFJFJJ.LJIIIIZZ("[onDestroy]");
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onDestroyView() {
        DetailFragmentPanel detailFragmentPanel;
        InterfaceC46330IGg playerManager;
        EventBus LIZJ = EventBus.LIZJ();
        if (LIZJ.LJI(this)) {
            LIZJ.LJIJ(this);
        }
        M89 m89 = this.LJZ;
        if (m89 != null && ujb.o.LJJJJIZL("from_profile_self", m89.getFrom(), true) && ujb.o.LJJJJIZL("output", this.LJZ.getTabName(), true) && ujb.o.LJJJJIZL("personal_homepage", this.LJZ.getEventType(), true)) {
            JG5.LIZ.postValue("self_detail_video_back");
        }
        DetailFragmentPanel detailFragmentPanel2 = this.LJZL;
        if (detailFragmentPanel2 != null) {
            detailFragmentPanel2.onDestroyView();
        }
        InterfaceC51679KPz interfaceC51679KPz = this.LLI;
        if (interfaceC51679KPz != null) {
            interfaceC51679KPz.unInit();
        }
        C47285Ih7.LIZIZ = false;
        if (C47285Ih7.LIZJ() && (detailFragmentPanel = this.LJZL) != null && (playerManager = detailFragmentPanel.getPlayerManager()) != null) {
            playerManager.release();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(getFragment(), null);
        C55096Ljo.LJIIJJI(LIZJ, this, IFeedFragmentAbility.class, null);
        C55096Ljo.LJIIJJI(LIZJ, this, LegacyDetailAbilityDetail.class, null);
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        String eventType = this.LJZ.getEventType();
        if (eventType != null && eventType.length() == 0) {
            eventType = "";
        }
        IScreenshotService LJIIIZ = ScreenShotService.LJIIIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(eventType);
        LIZ.append("_feed");
        LJIIIZ.LJI(X1D.LIZIZ(LIZ));
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        String eventType = this.LJZ.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        IScreenshotService LJIIIZ = ScreenShotService.LJIIIZ();
        LJIIIZ.LIZ(i0.LJFF(eventType, "_feed"), new C55310LnG(this, LJIIIZ, eventType));
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final ILoadMoreAbility PZ() {
        return this.LLIIJLIL;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IPageStateAbility RP() {
        return this.LLIIL;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final DetailFragmentPanel Wr() {
        return this.LJZL;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IRefreshAbility YE() {
        return this.LLIIJI;
    }

    @Override // X.KQK
    public final View getBackView() {
        return this.LJLLI;
    }

    @Override // X.KQK
    public final InterfaceC51679KPz getOperator() {
        return this.LLI;
    }

    @Override // X.C8W0, androidx.lifecycle.LifecycleOwner
    public final /* bridge */ /* synthetic */ Lifecycle getLifecycle() {
        return getLifecycle();
    }

    public InterfaceC51679KPz A3(AbstractC51036K1g<?, ?> abstractC51036K1g) {
        M89 m89 = this.LJZ;
        JediViewModel jediViewModel = C55457Lpd.LJLJL;
        C55457Lpd.LJLJL = null;
        return C55453LpZ.LIZIZ(m89, abstractC51036K1g, jediViewModel, getFragment());
    }

    public final boolean K3(int i) {
        Aweme i6;
        DetailFragmentPanel detailFragmentPanel;
        InterfaceC51679KPz interfaceC51679KPz = this.LLI;
        if (interfaceC51679KPz == null || interfaceC51679KPz.isLoading()) {
            this.LLIFFJFJJ.LJIIL("[request] operator is null");
            return false;
        }
        C8RO c8ro = this.LLIFFJFJJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[request] ");
        LIZ.append(i);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
        if (this.LJZ.isFromChatRoomPlaying()) {
            this.LJZ.setIsFromChatRoomPlaying(false);
            DetailFragmentPanel detailFragmentPanel2 = this.LJZL;
            if (detailFragmentPanel2 != null) {
                detailFragmentPanel2.postDelayed(new ARunnableS45S0100000_9(this, 24), 200L);
            }
        }
        if (TextUtils.equals("from_local", this.LJZ.getQueryAwemeMode()) && (i6 = AwemeService.LIZ().i6(this.LJZ.getAid())) != null && (detailFragmentPanel = this.LJZL) != null) {
            detailFragmentPanel.ZF(new OSZ<>(0, i6));
            return true;
        }
        if (this.LJZ.isShouldQueryMyStoryFromCache()) {
            Aweme LJI = C55723Ltv.LIZIZ.LJIL().LJI();
            DetailFragmentPanel detailFragmentPanel3 = this.LJZL;
            if (detailFragmentPanel3 != null) {
                detailFragmentPanel3.ZF(new OSZ<>(0, LJI));
                return true;
            }
        }
        try {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("detail_request_type", String.valueOf(i));
            c188727au.LJIIIZ("enter_from", this.LJZ.getEventType());
            FMX.LJIIL("detail_request", c188727au.LIZ);
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "detail_request_counter_exception");
        }
        InterfaceC51679KPz interfaceC51679KPz2 = this.LLI;
        if (interfaceC51679KPz2 != null) {
            M89 m89 = this.LJZ;
            interfaceC51679KPz2.request(i, m89, m89.getVideoType(), this.LJZI);
        }
        return true;
    }

    @Override // X.InterfaceC57302Ms
    public final boolean LJJIJLIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return deleteItem(aweme.getAid());
    }

    @Override // X.KQK
    public final void LLLLL(LKF lkf) {
        this.LLFII = lkf;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final boolean RZ(String str) {
        return deleteItem(str);
    }

    @Override // X.C2KG
    public final void b1(C2KC<Aweme> c2kc) {
        DetailFragmentPanel detailFragmentPanel;
        InterfaceC55062LjG adapter;
        List<Aweme> Q8;
        if ((this.LLI instanceof InterfaceC49873Jhl) && (detailFragmentPanel = this.LJZL) != null && (adapter = detailFragmentPanel.getAdapter()) != null && (Q8 = adapter.Q8()) != null) {
            InterfaceC51679KPz interfaceC51679KPz = this.LLI;
            o.LJII(interfaceC51679KPz, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.detail.ISearchDetailVideoSurveyInsertListener");
            ((InterfaceC49873Jhl) interfaceC51679KPz).ec(c2kc, Q8);
        }
    }

    @Override // X.InterfaceC57302Ms
    public final boolean deleteItem(String str) {
        InterfaceC51679KPz interfaceC51679KPz = this.LLI;
        boolean z = false;
        if (interfaceC51679KPz != null && str != null && o.LJ(Boolean.valueOf(interfaceC51679KPz.deleteItem(str)), Boolean.TRUE)) {
            z = true;
        }
        C8RO c8ro = this.LLIFFJFJJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[deleteItem] ");
        LIZ.append(str);
        LIZ.append(',');
        LIZ.append(z);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
        return z;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final boolean hasNextItem(int i) {
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel != null) {
            return detailFragmentPanel.hasNextItem(i);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final boolean oZ(AqS159S0100000_9 aqS159S0100000_9) {
        LKF lkf = this.LLFII;
        if (lkf != null && lkf.LJIILIIL()) {
            return true;
        }
        return ((Boolean) aqS159S0100000_9.invoke()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onAttach(Activity activity) {
        ActivityC45651qj activityC45651qj;
        if (activity instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) activity;
        } else {
            activityC45651qj = null;
        }
        this.LJLJJLL = activityC45651qj;
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(getFragment(), null);
        C55096Ljo.LJIIJJI(LIZJ, this, IFeedFragmentAbility.class, null);
        C55096Ljo.LJIIJJI(LIZJ, this, LegacyDetailAbilityDetail.class, null);
    }

    @QD3
    public void onBlockUserEvent(C175046tw c175046tw) {
        M89 m89;
        String str;
        if (((Boolean) C52593KkX.LIZ.getValue()).booleanValue() && (m89 = this.LJZ) != null && TextUtils.equals(m89.getEventType(), "personal_homepage") && c175046tw != null && c175046tw.LJLIL != null && getAweme() != null) {
            User user = c175046tw.LJLIL;
            String str2 = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            Aweme aweme = getAweme();
            if (aweme != null) {
                str2 = aweme.getAuthorUid();
            }
            if (!TextUtils.equals(str, str2)) {
                return;
            }
        }
        K3(1);
    }

    @QD3
    public void onCancelVideoCoverMaskEvent(C201667vm c201667vm) {
        if (this.LJZ.isStoryPage()) {
            H3();
        } else {
            v3(this.LLFZ);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        DetailFragmentPanel detailFragmentPanel;
        int i;
        InterfaceC55062LjG adapter;
        List<Aweme> Q8;
        String str;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 == null) {
            return;
        }
        String str2 = c207668Da2.LIZ;
        if (o.LJ(str2, "onBack")) {
            LJI();
            return;
        }
        Object obj = null;
        if (o.LJ(str2, this.LJLJL)) {
            Object obj2 = c207668Da2.LIZIZ;
            if (obj2 == null) {
                return;
            }
            String str3 = (String) obj2;
            DetailFragmentPanel detailFragmentPanel2 = this.LJZL;
            if (detailFragmentPanel2 != null && (adapter = detailFragmentPanel2.getAdapter()) != null && (Q8 = adapter.Q8()) != null && Q8.size() > 0) {
                int size = Q8.size();
                i = 0;
                while (i < size) {
                    if (ListProtector.get(Q8, i) != null) {
                        Aweme aweme = (Aweme) ListProtector.get(Q8, i);
                        if (aweme != null) {
                            str = aweme.getAid();
                        } else {
                            str = null;
                        }
                        if (TextUtils.equals(str, str3)) {
                            break;
                        }
                    }
                    i++;
                }
            }
            i = -1;
            DetailFragmentPanel detailFragmentPanel3 = this.LJZL;
            if (detailFragmentPanel3 == null) {
                return;
            }
            detailFragmentPanel3.onItemDeleted(i);
            return;
        }
        if (o.LJ(str2, "feed_transition_state")) {
            Object obj3 = c207668Da2.LIZIZ;
            if (obj3 != null) {
                obj = obj3;
            }
            o.LJIIIIZZ(obj, "kvData.getData()");
            boolean booleanValue = ((Boolean) obj).booleanValue();
            DetailFragmentPanel detailFragmentPanel4 = this.LJZL;
            if (detailFragmentPanel4 == null) {
                return;
            }
            C2MA curFeedViewHolder = detailFragmentPanel4.getCurFeedViewHolder();
            if (!(curFeedViewHolder instanceof InterfaceC55219Lln)) {
                return;
            }
            curFeedViewHolder.w8(booleanValue);
            return;
        }
        if (!o.LJ(str2, "feed_enter_transition_end") || (detailFragmentPanel = this.LJZL) == null) {
            return;
        }
        C2MA curFeedViewHolder2 = detailFragmentPanel.getCurFeedViewHolder();
        if (!(curFeedViewHolder2 instanceof InterfaceC55219Lln)) {
            return;
        }
        curFeedViewHolder2.LJIIJJI();
    }

    @QD3
    public void onDislikeAwemeEvent(C55274Lmg event) {
        String str;
        Boolean bool;
        Aweme aweme;
        List<PhotoModeImageUrlModel> imageList;
        o.LJIIIZ(event, "event");
        ActivityC45651qj activity = getActivity();
        if (activity == null || event.LJLJJL != activity.hashCode() || C63081OpJ.LJLJLLL(this.LLFZ) || event.LJLILLLLZI != 2) {
            return;
        }
        boolean z = event.LJLIL;
        C84193Sd.LIZ(activity).tv0(!z);
        String str2 = null;
        LRD.LIZ(activity).LJIIJ("long_press_layer", event.LJLIL, null);
        if (!z) {
            if (getAweme() == null) {
                return;
            }
            View view = this.LJLLI;
            if (view != null) {
                C178596zf.LIZ(view.getAlpha(), 1.0f, view);
            }
            Z9N.LIZIZ.LLJLLL(getFragment(), false);
            ShareExtServiceImpl.LJJLIIJ().LJIIJ(this.LLFZ);
            return;
        }
        View view2 = this.LJLLI;
        if (view2 != null) {
            C178596zf.LIZ(view2.getAlpha(), 0.0f, view2);
        }
        Z9N.LIZIZ.LLJLLL(getFragment(), true);
        int i = event.LJLJJLL;
        if (i != 0 && i != 4) {
            return;
        }
        Aweme aweme2 = this.LLFZ;
        if (aweme2 == null) {
            this.LLIFFJFJJ.LJIIL("[enterDislikeMode] aweme is null");
            return;
        }
        int LJIIJJI = KL2.LJIIJJI(EF7.LIZIZ());
        int LJIIIZ = KL2.LJIIIZ(EF7.LIZIZ());
        float f = 100;
        int i2 = (int) ((event.LJLJI * f) / LJIIJJI);
        int i3 = (int) ((event.LJLJJI * f) / LJIIIZ);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", aweme2.getAid());
        String str3 = "";
        if (aweme2.getAuthor() == null) {
            str = "";
        } else {
            str = aweme2.getAuthor().getUid();
        }
        c188727au.LJIIIZ("author_id", str);
        c188727au.LJIIIZ("content_type", C227768wm.LJ(aweme2));
        c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(aweme2)));
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel != null) {
            str3 = detailFragmentPanel.getEventType();
        }
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJIIIZ("enter_method", "detail");
        c188727au.LIZLLL(i2, "x");
        c188727au.LIZLLL(i3, "y");
        c188727au.LJIIIZ("from_group_id", C2KM.LIZ(C2S6.LIZ(E3()).getPreviousPage(), C2S6.LIZ(E3()).getFromGroupId()));
        Aweme aweme3 = this.LLFZ;
        if (aweme3 != null) {
            bool = Boolean.valueOf(aweme3.isSubOnlyVideo());
        } else {
            bool = null;
        }
        c188727au.LJFF(bool, "is_sub_only_video");
        if (aweme2.getAwemeType() == 150) {
            c188727au.LIZLLL(150, "aweme_type");
            PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                c188727au.LIZLLL(imageList.size(), "pic_cnt");
            }
        }
        DetailFragmentPanel detailFragmentPanel2 = this.LJZL;
        if (detailFragmentPanel2 != null) {
            aweme = detailFragmentPanel2.getCurrentPlayAweme();
        } else {
            aweme = null;
        }
        C222578oP.LIZIZ(c188727au, aweme, this.LJZ.getEventType(), this.LJZ.getFrom(), C84763XOl.LJIIIIZZ());
        if (getAweme() != null) {
            C220488l2 c220488l2 = C220488l2.LIZIZ;
            Aweme aweme4 = getAweme();
            DetailFragmentPanel detailFragmentPanel3 = this.LJZL;
            if (detailFragmentPanel3 != null) {
                detailFragmentPanel3.getEventType();
            }
            V0N.LJI(c188727au, aweme4);
            C222578oP.LIZJ(c220488l2.LJII(getAweme(), c188727au), getAweme(), null, null, 14);
        }
        if (C174826ta.LIZ()) {
            C76V.LIZ().LIZ(C227768wm.LIZIZ(getAweme()));
            c188727au.LIZLLL(0, "spammy_tag_cnt");
        }
        FMX.LJIIL("click_trans_layer", c188727au.LIZ);
        InterfaceC109364Qy LIZLLL = C7HV.LIZIZ.LIZLLL();
        String aid = aweme2.getAid();
        o.LJIIIIZZ(aid, "currentAweme.aid");
        LIZLLL.LJIIJJI(aid);
        if (getAweme() == null) {
            Context E3 = E3();
            if (E3 != null) {
                Fragment fragment = getFragment();
                Aweme aweme5 = getAweme();
                DetailFragmentPanel detailFragmentPanel4 = this.LJZL;
                if (detailFragmentPanel4 != null) {
                    str2 = detailFragmentPanel4.getEventType();
                }
                Dialog newOptionsDialog = BusinessComponentServiceUtils.newOptionsDialog(fragment, E3, aweme5, str2);
                o.LJIIIIZZ(newOptionsDialog, "newOptionsDialog(\n      …pe,\n                    )");
                if (event.LJLJJLL == 4) {
                    Window window = newOptionsDialog.getWindow();
                    if (window != null) {
                        window.clearFlags(2);
                    }
                    newOptionsDialog.setOnCancelListener(new IDCListenerS284S0100000_9(event, 2));
                }
                newOptionsDialog.setOnDismissListener(new IDDListenerS103S0200000_9(this, aweme2, 5));
                ShareExtServiceImpl.LJJLIIJ().LJJIJIL(aweme2);
                C16880lQ.LIZ(newOptionsDialog);
            }
        } else {
            DetailFragmentPanel detailFragmentPanel5 = this.LJZL;
            if (detailFragmentPanel5 != null) {
                detailFragmentPanel5.sendShowLongPressShareDialogEvent(new C56272It(i2, i3));
            }
            ShareExtServiceImpl.LJJLIIJ().LJJIJIL(aweme2);
        }
        this.LLIFFJFJJ.LJIIIIZZ("[enterDislikeMode]");
    }

    @QD3
    public void onDismissTitleTabEvent(LM2 event) {
        View view;
        ObjectAnimator ofFloat;
        AnimatorSet animatorSet;
        o.LJIIIZ(event, "event");
        if (this.LLIIIL != event.LJLIL && (view = this.LJLJLJ) != null) {
            AnimatorSet animatorSet2 = this.LLIIIJ;
            if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.LLIIIJ) != null) {
                animatorSet.cancel();
            }
            this.LLIIIL = event.LJLIL;
            this.LLIIIJ = new AnimatorSet();
            if (!event.LJLIL) {
                ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                o.LJIIIIZZ(ofFloat, "{\n                    Ob…1f, 0f)\n                }");
            } else {
                view.setVisibility(0);
                ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
                o.LJIIIIZZ(ofFloat, "{\n                    Ob…0f, 1f)\n                }");
            }
            AnimatorSet animatorSet3 = this.LLIIIJ;
            if (animatorSet3 != null) {
                long j = event.LJLILLLLZI;
                if (j == 0) {
                    j = this.LLIIIZ;
                }
                animatorSet3.setDuration(j);
            }
            AnimatorSet animatorSet4 = this.LLIIIJ;
            if (animatorSet4 != null) {
                animatorSet4.play(ofFloat);
            }
            AnimatorSet animatorSet5 = this.LLIIIJ;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
        }
    }

    @QD3
    public void onFeedFetchEvent(C54990Li6 event) {
        o.LJIIIZ(event, "event");
        if (TextUtils.equals("from_full_recommend", "from_cell_recommend")) {
            K3(4);
        }
    }

    @QD3
    public void onMobEnterFromEvent(C54060LJo c54060LJo) {
        ActivityC45651qj activity = getActivity();
        if (c54060LJo == null || this.LLD == null || activity == null) {
            return;
        }
        C3SZ.LIZ(activity).hv0(c54060LJo.LJLIL);
    }

    @QD3
    public void onMobRequestIdEvent(C2J0 c2j0) {
        ActivityC45651qj activity = getActivity();
        if (c2j0 == null || this.LLD == null || activity == null) {
            return;
        }
        C3SZ.LIZ(activity).LJLJLJ = c2j0.LJLIL;
    }

    @QD3
    public void onRefreshDetailEvent(C8JC c8jc) {
        K3(1);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final void rY(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 62 || this.LJZL == null) {
            return;
        }
        if (IWF.LJJLIIIIJ().isPlaying()) {
            IWF.LJJLIIIIJ().LJIILJJIL();
            DetailFragmentPanel detailFragmentPanel = this.LJZL;
            if (detailFragmentPanel != null) {
                detailFragmentPanel.showIvPlay();
                return;
            }
            return;
        }
        IWF.LJJLIIIIJ().LIZIZ();
        DetailFragmentPanel detailFragmentPanel2 = this.LJZL;
        if (detailFragmentPanel2 == null) {
            return;
        }
        detailFragmentPanel2.hideIvPlay();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KU4, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public void setUserVisibleHint(boolean z) {
        M3(z, true);
    }

    public final void v3(Aweme aweme) {
        ViewStub viewStub;
        ArrayMap arrayMap = new ArrayMap(4);
        if (C50419JqZ.LIZIZ(C78996UzQ.LJIILJJIL(aweme))) {
            View view = this.LJLZ;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        String eventType = this.LJZ.getEventType();
        o.LJI(eventType);
        arrayMap.put("enter_from", eventType);
        if (!TextUtils.isEmpty(this.LJZ.getTrendingEventId()) || o.LJ(this.LJZ.getEventType(), "trending_inflow_page")) {
            arrayMap.put("isTrending", "ture");
        }
        String tabName = this.LJZ.getTabName();
        if (!TextUtils.isEmpty(tabName)) {
            o.LJI(tabName);
            arrayMap.put("tab_name", tabName);
        }
        if (this.LJZ.isPlaylistCleanMode() && o.LJ(this.LJZ.getEventType(), "personal_homepage") && o.LJ(tabName, "collection")) {
            arrayMap.put("visibility_flags", "hide");
        }
        arrayMap.put("search_session_id", String.valueOf(this.LJZ.getSessionId()));
        String enterFromSub = this.LJZ.getEnterFromSub();
        String str = "";
        if (enterFromSub == null) {
            enterFromSub = "";
        }
        if (!TextUtils.isEmpty(enterFromSub)) {
            arrayMap.put("enter_from_sub", enterFromSub);
        }
        String preClickImprId = this.LJZ.getPreClickImprId();
        if (preClickImprId != null) {
            str = preClickImprId;
        }
        if (!TextUtils.isEmpty(str)) {
            arrayMap.put("preClickImprId", str);
        }
        if (getFragment() == null || aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return;
        }
        if (this.LJLJLJ != null) {
            CommentService LJJL = CommentServiceImpl.LJJL();
            View view2 = this.LJLJLJ;
            if (view2 != null) {
                viewStub = (ViewStub) view2.findViewById(R.id.nga);
            } else {
                viewStub = null;
            }
            if (LJJL.LJJJJJL(viewStub, this.LJZ, aweme)) {
                arrayMap.put("hasExposeComment", "true");
            }
        }
        x3(getFragment(), aweme, arrayMap);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final void wn(List<? extends Aweme> items) {
        o.LJIIIZ(items, "items");
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel != null) {
            detailFragmentPanel.LJLLILLLL(items);
        }
    }

    public final void M3(boolean z, boolean z2) {
        if (this.LJZL == null) {
            Bundle arguments = getFragment().getArguments();
            if (arguments != null) {
                Fragment fragment = getFragment();
                if (fragment instanceof DetailPageFragment) {
                    this.LJZ = ((DetailPageFragment) fragment).LJLJJI;
                }
                this.LJZI = arguments.getBoolean("extra_challenge_is_hashtag", false);
            } else {
                this.LJZ.setEventType("");
            }
            Fragment fragment2 = getFragment();
            if (fragment2 instanceof DetailPageFragment) {
                this.LJZL = ((DetailPageFragment) fragment2).LJLJI;
            }
        }
        if (z2) {
            DetailFragmentPanel detailFragmentPanel = this.LJZL;
            if (detailFragmentPanel != null) {
                detailFragmentPanel.setUserVisibleHint(z);
            }
        } else {
            DetailFragmentPanel detailFragmentPanel2 = this.LJZL;
            if (detailFragmentPanel2 != null) {
                detailFragmentPanel2.LLFF(z, false);
            }
        }
        if (z) {
            DetailFragmentPanel detailFragmentPanel3 = this.LJZL;
            if (detailFragmentPanel3 != null) {
                detailFragmentPanel3.LJLZ(!C220858ld.LJIIIIZZ(getAweme()));
            }
            DetailFragmentPanel detailFragmentPanel4 = this.LJZL;
            if (detailFragmentPanel4 != null) {
                detailFragmentPanel4.LJZ(true);
            }
            DetailFragmentPanel detailFragmentPanel5 = this.LJZL;
            if (detailFragmentPanel5 != null) {
                detailFragmentPanel5.tryResumePlay();
            }
        } else {
            DetailFragmentPanel detailFragmentPanel6 = this.LJZL;
            if (detailFragmentPanel6 != null) {
                detailFragmentPanel6.LJLZ(false);
            }
            DetailFragmentPanel detailFragmentPanel7 = this.LJZL;
            if (detailFragmentPanel7 != null) {
                detailFragmentPanel7.LJZ(false);
            }
        }
        C8RO c8ro = this.LLIFFJFJJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[setUserVisibleHint] ");
        LIZ.append(z);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
        ExploreStayTimeFragmentComponent exploreStayTimeFragmentComponent = this.LLFFF;
        if (exploreStayTimeFragmentComponent != null) {
            exploreStayTimeFragmentComponent.LJLJJL = z;
            if (z) {
                exploreStayTimeFragmentComponent.LJLJJI = SystemClock.elapsedRealtime();
            } else {
                exploreStayTimeFragmentComponent.LIZ();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x025c, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b7  */
    /* JADX WARN: Type inference failed for: r7v13, types: [X.KRE] */
    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 1659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.platform.DetailPageComponent.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final void ph(Music music, EditPostPermission editPostPermission) {
        o.LJIIIZ(music, "music");
        o.LJIIIZ(editPostPermission, OHQ.LIZ);
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel != null) {
            C2MA curViewHolder = detailFragmentPanel.getCurViewHolder();
            Aweme LJJLJ = detailFragmentPanel.LJJLJ();
            if (curViewHolder == null) {
                return;
            }
            if (curViewHolder instanceof VideoViewCell) {
                if (editPostPermission.getBizPermission() != null && !editPostPermission.getBizPermission().isEmpty()) {
                    EditPostPermission editPostPermission2 = LJJLJ.getEditPostPermission();
                    if (editPostPermission2 == null || editPostPermission2.getBizPermission() == null || editPostPermission2.getBizPermission().isEmpty()) {
                        LJJLJ.setEditPostPermission(editPostPermission);
                    } else {
                        for (EditPostBizPermissionStruct editPostBizPermissionStruct : editPostPermission.getBizPermission()) {
                            int bizType = editPostBizPermissionStruct.getBizType();
                            for (EditPostBizPermissionStruct editPostBizPermissionStruct2 : editPostPermission2.getBizPermission()) {
                                if (editPostBizPermissionStruct2.getBizType() == bizType) {
                                    editPostPermission2.getBizPermission().remove(editPostBizPermissionStruct2);
                                    editPostPermission2.getBizPermission().add(editPostBizPermissionStruct);
                                }
                            }
                        }
                        LJJLJ.setEditPostPermission(editPostPermission2);
                    }
                    C41379GLv.LIZIZ(LJJLJ.getAid(), LJJLJ.getEditPostPermission());
                }
                LJJLJ.setAddedSoundMusicInfo(music);
                LJJLJ.setMusic(music);
                if (LJJLJ.getVideo() != null) {
                    Video video = LJJLJ.getVideo();
                    if (video.getPlayAddr() != null && music.getPlayUrl() != null) {
                        video.getPlayAddr().setUri(music.getPlayUrl().getUri());
                        video.getPlayAddr().setUrlList(music.getPlayUrl().getUrlList());
                        video.getPlayAddr().setWidth(music.getPlayUrl().getWidth());
                        video.getPlayAddr().setHeight(music.getPlayUrl().getHeight());
                        video.getPlayAddr().setUrlKey(String.valueOf(music.getId()));
                    }
                    LJJLJ.setVideo(video);
                }
                AwemeService.LIZ().R1(LJJLJ);
                curViewHolder.E8(detailFragmentPanel.getCurIndex(), LJJLJ);
                detailFragmentPanel.mPlayerController.LLIILII(0, LJJLJ);
            }
            C26045AKb c26045AKb = new C26045AKb(detailFragmentPanel.LJLJLJ);
            c26045AKb.LJIIIIZZ(R.string.jkr);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LIZJ;
        String str;
        o.LJIIIZ(inflater, "inflater");
        ActivityC45651qj activity = getActivity();
        if (C72Y.LIZ() && C35138Dqg.LIZIZ()) {
            LIZJ = C16970lZ.LIZJ(R.layout.alh, activity, viewGroup, false);
            o.LJIIIIZZ(LIZJ, "{\n                AsyncI…          )\n            }");
        } else {
            LIZJ = C16970lZ.LIZJ(R.layout.alg, activity, viewGroup, false);
            o.LJIIIIZZ(LIZJ, "{\n                AsyncI…          )\n            }");
        }
        LFH.LIZIZ.LIZLLL().LJIILIIL();
        C53816LAe c53816LAe = C53816LAe.LIZ;
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel == null || (str = detailFragmentPanel.getSplitTag()) == null) {
            str = "";
        }
        LKF LIZ = c53816LAe.LIZ(LIZJ, getFragment(), str);
        this.LLFII = LIZ;
        return LIZ.LJIILJJIL();
    }

    public void x3(Fragment owner, Aweme aweme, Map map) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(aweme, "aweme");
        Z9N.LIZIZ.LJLJLLL(owner, aweme, map);
    }
}
