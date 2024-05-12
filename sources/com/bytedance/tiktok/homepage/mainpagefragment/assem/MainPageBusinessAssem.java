package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C16880lQ;
import X.C178596zf;
import X.C188727au;
import X.C1JD;
import X.C212428Vi;
import X.C220488l2;
import X.C221008ls;
import X.C221108m2;
import X.C222578oP;
import X.C224888s8;
import X.C227768wm;
import X.C2K0;
import X.C2MA;
import X.C2U8;
import X.C40385Ft7;
import X.C40471FuV;
import X.C45804HyK;
import X.C53295Kvr;
import X.C53320KwG;
import X.C54060LJo;
import X.C54154LNe;
import X.C54174LNy;
import X.C54175LNz;
import X.C54214LPm;
import X.C54258LRe;
import X.C54409LWz;
import X.C54982Lhy;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55274Lmg;
import X.C55275Lmh;
import X.C57362MfG;
import X.C62822Ol8;
import X.C76W;
import X.C78605Ut7;
import X.C78841Uwv;
import X.C78866UxK;
import X.C79045V0n;
import X.C7ZV;
import X.C88545Yp3;
import X.C8DK;
import X.C8DO;
import X.C90M;
import X.C9T4;
import X.EnumC2049482o;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.FMX;
import X.IK3;
import X.IKC;
import X.InterfaceC55102Lju;
import X.JHL;
import X.JHM;
import X.LKR;
import X.LLQ;
import X.LNT;
import X.LO0;
import X.LO1;
import X.LQ7;
import X.LRD;
import X.OSZ;
import X.QD3;
import Y.ALAdapterS7S0200000_9;
import Y.AObserverS73S0200000_9;
import Y.AObserverS77S0100000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class MainPageBusinessAssem extends BaseMainPageFragmentUIAssem implements LO1, MainPageBusinessAbility, InterfaceC55102Lju {
    public C55275Lmh LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public C54258LRe LJLJJI;
    public final String LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final CopyOnWriteArrayList<Animator> LJLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -556924923) {
            return null;
        }
        return this;
    }

    public MainPageBusinessAssem() {
        new LinkedHashMap();
        this.LJLJJL = "Daily Mix";
        C221108m2.LIZIZ(new AqS159S0100000_9(this, 42));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 44));
        this.LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 43));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 45));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 49));
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 48));
        this.LJLLI = C221108m2.LIZIZ(LNT.LJLIL);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 47));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 46));
        this.LJLLL = new CopyOnWriteArrayList<>();
    }

    public final HomePageDataViewModel A3() {
        return (HomePageDataViewModel) this.LJLJJLL.getValue();
    }

    public final LLQ C3() {
        return (LLQ) this.LJLL.getValue();
    }

    public final TabChangeManager E3() {
        return (TabChangeManager) this.LJLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final String getEventType() {
        MainPageDataViewModel mainPageDataViewModel = (MainPageDataViewModel) this.LJLJLJ.getValue();
        if (mainPageDataViewModel != null) {
            return mainPageDataViewModel.LJLIL;
        }
        return null;
    }

    public final IHomePageService x3() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-homePageService>(...)");
        return (IHomePageService) value;
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final boolean y60() {
        return o.LJ(this.LJLJJL, "Daily Mix");
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void Fa() {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        OSZ osz;
        String str5;
        String str6;
        String str7;
        String str8;
        MainActivityScope LJJLIIIJJI;
        MainBusinessAbility LJIJJLI;
        MainActivityScope LJJLIIIJJI2;
        MainBusinessAbility LJIJJLI2;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        boolean md = x3().getHomeTabViewModel(LIZ).md();
        HomePageDataViewModel A3 = A3();
        boolean z2 = true;
        if (A3 != null && !A3.LJLL && getCurrentAweme() != null && (LIZ instanceof MainActivity)) {
            ((MainActivity) LIZ).flingToIndexChange(getCurrentAweme(), getContext());
        }
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme != null) {
            C76W c76w = new C76W();
            HomePageDataViewModel A32 = A3();
            String str9 = null;
            if (A32 != null) {
                str = A32.getEventType();
            } else {
                str = null;
            }
            c76w.LIZ("enter_from", str);
            HomePageDataViewModel A33 = A3();
            if (A33 != null && !A33.LJLL) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                getContext();
                ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
                if (LIZ2 != null && (LJJLIIIJJI2 = C78866UxK.LJJLIIIJJI(LIZ2)) != null && (LJIJJLI2 = C1JD.LJIJJLI(LJJLIIIJJI2)) != null) {
                    str3 = LJIJJLI2.fu0();
                } else {
                    str3 = null;
                }
                FMX.LJIIJ("slide_left", "left", str3, currentAweme.getAid(), c76w.LIZIZ());
                if (md) {
                    str4 = MainPageFragmentImpl.LJI().LJJLIIIJJI();
                } else {
                    HomePageDataViewModel A34 = A3();
                    if (A34 != null) {
                        str4 = A34.getEventType();
                    } else {
                        str4 = null;
                    }
                }
                if (C40471FuV.LIZ() && (LKR.LIZIZ(LIZ, "USER") || LKR.LIZIZ(LIZ, "NOTIFICATION"))) {
                    z2 = false;
                }
                if (str4 != null && z2) {
                    C220488l2 c220488l2 = C220488l2.LIZIZ;
                    C7ZV c7zv = new C7ZV();
                    c7zv.LIZLLL = str4;
                    if (!md) {
                        str6 = "slide_left";
                    } else {
                        str6 = "click_home";
                    }
                    c7zv.LJJLI = str6;
                    c7zv.LJJLIIJ = "";
                    c7zv.LJJLIL = "";
                    c7zv.LJJLIIIJLLLLLLLZ = "";
                    c7zv.LJJIIZI(0, currentAweme);
                    ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
                    if (LIZ3 != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LIZ3)) != null && (LJIJJLI = C1JD.LJIJJLI(LJJLIIIJJI)) != null) {
                        str7 = LJIJJLI.fu0();
                    } else {
                        str7 = null;
                    }
                    c7zv.LJJLIIIJJIZ = str7;
                    HomePageDataViewModel A35 = A3();
                    if (A35 != null) {
                        str8 = A35.LJLJLJ;
                    } else {
                        str8 = null;
                    }
                    c7zv.LJJLIIIJL = str8;
                    c7zv.LJJIIZ(getContext());
                    Object LJII = c220488l2.LJII(currentAweme, c7zv);
                    C222578oP.LIZJ(LJII, currentAweme, null, null, 14);
                    JHL jhl = (JHL) LJII;
                    if (C224888s8.LJ(str4)) {
                        jhl.LJJJJIZL = C224888s8.LIZJ();
                    }
                    JHM jhm = (JHM) LJII;
                    C78841Uwv.LIZJ(jhm, C227768wm.LIZIZ(currentAweme));
                    jhm.LJIILIIL();
                }
                if (currentAweme.getAwemeType() == 4003) {
                    osz = new OSZ(EnumC57366MfK.CARD, Boolean.TRUE);
                } else {
                    osz = new OSZ(EnumC57366MfK.ITEM, Boolean.FALSE);
                }
                EnumC57366MfK enumC57366MfK = (EnumC57366MfK) osz.getFirst();
                boolean booleanValue = ((Boolean) osz.getSecond()).booleanValue();
                String str10 = "homepage_friends";
                if (!o.LJ(v3(), "homepage_friends")) {
                    str10 = "homepage_hot";
                }
                C220488l2 c220488l22 = C220488l2.LIZIZ;
                C57362MfG c57362MfG = new C57362MfG();
                c57362MfG.LJJIIZI(str10);
                c57362MfG.LJJLI = enumC57366MfK;
                c57362MfG.LJJJJI();
                c57362MfG.LJJLIIIIJ = EnumC57365MfJ.ENTER_PROFILE;
                c57362MfG.LJJIIZ(currentAweme);
                c57362MfG.LJJIJIIJI(EnumC2049482o.SLIDE_LEFT);
                c57362MfG.LJJJJIZL(currentAweme.getAuthor());
                User author = currentAweme.getAuthor();
                if (author != null) {
                    str5 = author.getRequestId();
                } else {
                    str5 = null;
                }
                c57362MfG.LJJJJ(str5);
                c57362MfG.LJLI = booleanValue;
                Object LJII2 = c220488l22.LJII(currentAweme, c57362MfG);
                C222578oP.LIZJ(LJII2, currentAweme, null, null, 14);
                ((C57362MfG) LJII2).LJJIZ();
            }
            c76w.LIZ("group_id", currentAweme.getAid());
            c76w.LIZ("enter_method", "slide_left");
            HomePageDataViewModel A36 = A3();
            if (A36 != null) {
                str2 = A36.LJLJLJ;
            } else {
                str2 = null;
            }
            c76w.LIZ("request_id", str2);
            c76w.LIZ("enter_type", "normal_way");
            MobClick obtain = MobClick.obtain();
            obtain.setEventName("enter_detail");
            obtain.setLabelName("personal_homepage");
            User author2 = currentAweme.getAuthor();
            if (author2 != null) {
                str9 = author2.getUid();
            }
            obtain.setValue(str9);
            obtain.setJsonObject(c76w.LIZIZ());
            FMX.onEvent(obtain);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final C2MA Fi() {
        String str;
        Fragment mv0;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return null;
        }
        TabChangeManager LIZ2 = C116694i1.LIZ(LIZ);
        Fragment mv02 = LIZ2.mv0();
        if (mv02 instanceof MainFragment) {
            mv0 = ((MainFragment) mv02).w2();
        } else {
            if (mv02 != null) {
                str = mv02.getTag();
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, "FRIENDS_TAB")) {
                return null;
            }
            mv0 = LIZ2.mv0();
        }
        if (mv0 == null) {
            return null;
        }
        C2K0 LIZ3 = C55096Ljo.LIZ(C55230Lly.LIZJ(mv0, null), IFeedFragmentAbility.class, null);
        if (!(LIZ3 instanceof IHomeFeedFragmentAbility)) {
            LIZ3 = null;
        }
        IHomeFeedFragmentAbility iHomeFeedFragmentAbility = (IHomeFeedFragmentAbility) LIZ3;
        if (iHomeFeedFragmentAbility == null) {
            return null;
        }
        return iHomeFeedFragmentAbility.m30();
    }

    @Override // X.LO1
    public final void LLJJIJIIJIL() {
        RecommendFeedFragmentPanel recommendFeedFragmentPanel;
        Fragment mv0 = E3().mv0();
        if (mv0 instanceof MainFragment) {
            FeedFragment w2 = ((MainFragment) mv0).w2();
            if ((w2 instanceof FeedRecommendFragment) && (recommendFeedFragmentPanel = ((FeedRecommendFragment) w2).LJLL) != null) {
                recommendFeedFragmentPanel.hideAllGuide();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final boolean WH() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return false;
        }
        String nv0 = C116694i1.LIZ(LIZ).nv0();
        if (!o.LJ(nv0, "HOME") && !o.LJ(nv0, "FRIENDS_TAB")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void db0() {
        String str;
        boolean z;
        String str2;
        TabChangeManager E3 = E3();
        if (E3.mv0() instanceof MainFragment) {
            Fragment mv0 = E3.mv0();
            o.LJII(mv0, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainFragment");
            FeedFragment w2 = ((MainFragment) mv0).w2();
            if (o.LJ(LKR.LIZLLL, "USER")) {
                str = "personal_homepage";
            } else if (!o.LJ(LKR.LIZLLL, "NOTIFICATION")) {
                str = "others_homepage";
            } else {
                str = "notification_page";
            }
            LKR.LIZLLL = null;
            if (w2 instanceof FeedRecommendFragment) {
                LQ7 lq7 = new LQ7("enter_homepage_hot");
                lq7.LJIILLIIL = C54154LNe.LIZ(C212428Vi.LIZ(this), "profile_2_feed");
                lq7.LIZLLL = str;
                lq7.LJIJ = C227768wm.LJIIJJI(getCurrentAweme());
                lq7.LJIILLIIL(getCurrentAweme());
                lq7.LJIILIIL();
                if (C9T4.LIZIZ(getCurrentAweme())) {
                    C188727au c188727au = C221008ls.LIZ;
                    c188727au.getClass();
                    c188727au.LJIIIZ("enter_from", "others_homepage");
                    FMX.LJIIL("enter_homepage_from_other_profile", c188727au.LIZ);
                    C221008ls.LIZIZ(getCurrentAweme());
                    return;
                }
                return;
            }
            if (w2 instanceof FeedFollowFragment) {
                if (C53295Kvr.LIZ()) {
                    return;
                }
                LQ7 lq72 = new LQ7("enter_homepage_follow");
                lq72.LJIILLIIL = C54154LNe.LIZ(C212428Vi.LIZ(this), "profile_2_feed");
                lq72.LIZLLL = str;
                lq72.LJIJ = C227768wm.LJIIJJI(getCurrentAweme());
                lq72.LJIILLIIL(getCurrentAweme());
                C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
                if (c88545Yp3 != null) {
                    z = c88545Yp3.isConnected();
                } else {
                    z = false;
                }
                lq72.LJJIFFI = z;
                if (c88545Yp3 == null || (str2 = c88545Yp3.LJIILJJIL()) == null) {
                    str2 = "";
                }
                lq72.LJJII = str2;
                lq72.LJIILIIL();
                return;
            }
            if (w2 instanceof C90M) {
                LQ7 lq73 = new LQ7("enter_homepage_popular");
                lq73.LJIILLIIL = C54154LNe.LIZ(C212428Vi.LIZ(this), "profile_2_feed");
                lq73.LIZLLL = str;
                lq73.LJIJ = C227768wm.LJIIJJI(getCurrentAweme());
                lq73.LJIILLIIL(getCurrentAweme());
                lq73.LJIILIIL();
                return;
            }
            if (w2 instanceof C8DO) {
                LQ7 lq74 = new LQ7("enter_homepage_nearby");
                lq74.LJIILLIIL = C54154LNe.LIZ(C212428Vi.LIZ(this), "profile_2_feed");
                lq74.LIZLLL = str;
                lq74.LJIJ = C227768wm.LJIIJJI(getCurrentAweme());
                lq74.LJIILLIIL(getCurrentAweme());
                lq74.LJIILIIL();
                return;
            }
            if (!(w2 instanceof C8DK)) {
                return;
            }
            LQ7 lq75 = new LQ7("enter_homepage_live");
            lq75.LJIILLIIL = C54154LNe.LIZ(C212428Vi.LIZ(this), "profile_2_feed");
            lq75.LIZLLL = str;
            lq75.LJIJ = C227768wm.LJIIJJI(getCurrentAweme());
            lq75.LJIILLIIL(getCurrentAweme());
            lq75.LJIILIIL();
        }
    }

    public final Aweme getCurrentAweme() {
        MainActivityScope LJJLIIIJJI;
        MainBusinessAbility LJIJJLI;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LIZ)) != null && (LJIJJLI = C1JD.LJIJJLI(LJJLIIIJJI)) != null) {
            return LJIJJLI.getCurrentAweme();
        }
        return null;
    }

    @Override // X.LO1
    public final String getEnterFrom() {
        return v3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        C55275Lmh c55275Lmh = this.LJLIL;
        if (c55275Lmh != null) {
            EventBus.LIZJ().LJIJ(c55275Lmh);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final String ro() {
        return v3();
    }

    public final String v3() {
        MainActivity mainActivity;
        String enterFrom;
        if (MSAdaptionService.LJIIL().LIZIZ(C212428Vi.LIZ(this))) {
            return "homepage_hot";
        }
        if ((C212428Vi.LIZ(this) instanceof MainActivity) && (mainActivity = (MainActivity) C212428Vi.LIZ(this)) != null && (enterFrom = mainActivity.getEnterFrom()) != null) {
            return enterFrom;
        }
        return "";
    }

    @Override // X.LO1
    public final void LLD(boolean z) {
        float f;
        LLQ C3 = C3();
        if (C3 != null) {
            C3.LJJIJ(z, true);
        }
        View view = this.LJLILLLLZI;
        float f2 = 0.0f;
        if (view != null) {
            f = view.getAlpha();
        } else {
            f = 0.0f;
        }
        if (!z) {
            f2 = 1.0f;
        }
        C178596zf.LIZ(f, f2, view);
        F3(z, null, false);
    }

    @QD3
    public final void onComplianceDialogCheckEvent(IK3 ik3) {
        if (ik3 != null) {
            C54982Lhy.LJIIIIZZ = true;
            C2U8.LIZ(new IKC());
        }
    }

    @QD3
    public final void onDislikeAwemeEvent(C55274Lmg event) {
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI == 1) {
            if (event.LJLIL) {
                C55275Lmh c55275Lmh = this.LJLIL;
                if (c55275Lmh != null) {
                    c55275Lmh.LIZ.LLJJIJIIJIL();
                    c55275Lmh.LIZ.LLD(true);
                    return;
                }
                return;
            }
            C55275Lmh c55275Lmh2 = this.LJLIL;
            if (c55275Lmh2 == null) {
                return;
            }
            c55275Lmh2.LIZ.LLD(false);
        }
    }

    @QD3
    public final void onMobEnterFromEvent(C54060LJo event) {
        o.LJIIIZ(event, "event");
        MainPageDataViewModel mainPageDataViewModel = (MainPageDataViewModel) this.LJLJLJ.getValue();
        if (mainPageDataViewModel == null) {
            return;
        }
        String str = event.LJLIL;
        o.LJIIIIZZ(str, "event.eventType");
        mainPageDataViewModel.LJLIL = str;
    }

    @QD3
    public final void onRefreshEndEvent(C54409LWz event) {
        Context context;
        ActivityC45651qj LJJIFFI;
        LLQ Xm0;
        o.LJIIIZ(event, "event");
        if (!this._isViewValid) {
            return;
        }
        String str = event.LJLIL;
        if (str == null) {
            str = "HOME";
        }
        if ((o.LJ(str, "HOME") || o.LJ(str, "FRIENDS_TAB")) && (context = getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (Xm0 = x3().getHomeTabViewModel(LJJIFFI).Xm0()) != null) {
            Xm0.LJJI(str);
        }
    }

    @QD3
    public final void onShoutoutsOptOut(C54214LPm event) {
        o.LJIIIZ(event, "event");
        Context context = getContext();
        if (context != null) {
            Intent LIZ = C40385Ft7.LIZ(context);
            LIZ.putExtra("extra.from.shoutouts.opt.out", true);
            C16880lQ.LIZJ(context, LIZ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        HomePageDataViewModel A3;
        DataCenter dataCenter;
        MainPageDataViewModel mainPageDataViewModel;
        BaseScrollSwitchStateManager baseScrollSwitchStateManager;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLILLLLZI = view.findViewById(R.id.arm);
        View findViewById = view.findViewById(R.id.gc8);
        if (C53320KwG.LIZIZ()) {
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null && (findViewById = LIZ.findViewById(R.id.gbw)) != null) {
                findViewById.setVisibility(0);
            } else {
                findViewById = null;
            }
        }
        this.LJLJI = findViewById;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (A3 = A3()) != null && (dataCenter = (DataCenter) this.LJLJL.getValue()) != null && (mainPageDataViewModel = (MainPageDataViewModel) this.LJLJLJ.getValue()) != null) {
            this.LJLIL = new C55275Lmh(this, A3, mainPageDataViewModel.LJLIL, dataCenter, LIZLLL);
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null) {
            C54258LRe LIZ3 = LRD.LIZ(LIZ2);
            this.LJLJJI = LIZ3;
            LIZ3.LJIIIIZZ("swipe_up_guide", new C54174LNy(this));
            C54258LRe c54258LRe = this.LJLJJI;
            if (c54258LRe != null) {
                c54258LRe.LJIIIIZZ("not_interested_tutorial", new C54175LNz(this));
            }
        }
        ActivityC45651qj LIZ4 = C212428Vi.LIZ(this);
        if (LIZ4 != null && (baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) this.LJLLILLLL.getValue()) != null) {
            baseScrollSwitchStateManager.LJLLILLLL.observe(this, new AObserverS73S0200000_9(LIZ4, this, 9));
        }
        DataCenter dataCenter2 = (DataCenter) this.LJLJL.getValue();
        if (dataCenter2 != null) {
            dataCenter2.iv0("ENTER_DISLIKE_MODE", new AObserverS77S0100000_9(this, LiveTryModeCountDownThresholdSetting.DEFAULT), false);
            dataCenter2.iv0("setTabBackground", new AObserverS77S0100000_9(this, 121), false);
            dataCenter2.iv0("proformToTab", new AObserverS77S0100000_9(this, 122), true);
            dataCenter2.iv0("performClickTab", new AObserverS77S0100000_9(this, 123), true);
        }
        ActivityC45651qj LIZ5 = C212428Vi.LIZ(this);
        if (LIZ5 == null) {
            return;
        }
        Hox.LJLLI.LIZ(LIZ5).hv0("HOME", new LO0());
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void qQ(boolean z) {
        Integer LJI;
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.dw, C78605Ut7.LJII(context, !z))) != null) {
            int intValue = LJI.intValue();
            View view = this.LJLILLLLZI;
            if (view != null) {
                view.setBackgroundColor(intValue);
            }
        }
        if (C212428Vi.LIZ(this) instanceof MainActivity) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            o.LJII(LIZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
            ((MainActivity) LIZ).refreshSlideSwitchCanScrollRight();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void t9(boolean z) {
        Integer LJI;
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.dw, C78605Ut7.LJII(context, !z))) != null) {
            int intValue = LJI.intValue();
            View view = this.LJLILLLLZI;
            if (view != null) {
                view.setBackgroundColor(intValue);
            }
        }
    }

    public final void F3(boolean z, Animator animator, boolean z2) {
        Fragment mv0 = E3().mv0();
        if (mv0 != null && (mv0 instanceof MainFragment)) {
            int i = 0;
            float f = 0.0f;
            if (z2) {
                MainFragment mainFragment = (MainFragment) mv0;
                FrameLayout frameLayout = mainFragment.LJLJJLL;
                if (!z) {
                    f = 1.0f;
                }
                frameLayout.setAlpha(f);
                FrameLayout frameLayout2 = mainFragment.LJLJJLL;
                if (z) {
                    i = 4;
                }
                frameLayout2.setVisibility(i);
                return;
            }
            if (animator != null) {
                float[] fArr = new float[2];
                fArr[0] = ((MainFragment) mv0).LJLJJLL.getAlpha();
                if (!z) {
                    f = 1.0f;
                }
                fArr[1] = f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                ofFloat.setDuration(animator.getDuration());
                ofFloat.setInterpolator(animator.getInterpolator());
                ofFloat.setStartDelay(animator.getStartDelay());
                ofFloat.addUpdateListener(new AUListenerS97S0100000_9(mv0, 1));
                ofFloat.addListener(new ALAdapterS7S0200000_9(this, ofFloat, 0));
                this.LJLLL.add(ofFloat);
                ofFloat.start();
                return;
            }
            ViewPropertyAnimator animate = ((MainFragment) mv0).LJLJJLL.animate();
            if (!z) {
                f = 1.0f;
            }
            animate.alpha(f).setDuration(200L).start();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void Eb(boolean z, boolean z2, boolean z3, boolean z4, Animator animator, boolean z5) {
        MainPageSeekAbility mainPageSeekAbility;
        float f;
        int i;
        Iterator<Animator> it = this.LJLLL.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.LJLLL.clear();
        if (z2) {
            F3(z, animator, z5);
        }
        if (z3) {
            LLQ C3 = C3();
            if (C3 != null) {
                C3.LJJIJ(z, !z5);
            }
            float f2 = 0.0f;
            if (z5) {
                View view = this.LJLILLLLZI;
                if (view != null) {
                    if (!z) {
                        f2 = 1.0f;
                    }
                    view.setAlpha(f2);
                }
                LLQ C32 = C3();
                if (C32 != null) {
                    if (z) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    C32.LJJIJIIJI(i);
                }
            } else {
                View view2 = this.LJLILLLLZI;
                if (view2 != null) {
                    f = view2.getAlpha();
                } else {
                    f = 0.0f;
                }
                if (!z) {
                    f2 = 1.0f;
                }
                C178596zf.LIZ(f, f2, view2);
            }
        }
        if (z4 && (mainPageSeekAbility = (MainPageSeekAbility) this.LJLLJ.getValue()) != null) {
            mainPageSeekAbility.Vk(z);
        }
    }
}
