package com.ss.android.ugc.aweme.main.uiApiImpl;

import X.AbstractC53892LDc;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C35183DrP;
import X.C36093EEn;
import X.C46117I8b;
import X.C54206LPe;
import X.C54297LSr;
import X.C55888Lwa;
import X.C58096Mr6;
import X.C62610Ohi;
import X.C84763XOl;
import X.C98823uI;
import X.EF7;
import X.InterfaceC55336Lng;
import X.LK1;
import X.LL8;
import X.LM4;
import X.LNZ;
import X.LPJ;
import X.LQB;
import X.ViewOnClickListenerC54068LJw;
import X.ViewOnLongClickListenerC46116I8a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopLeftIconInflate;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopRightIconInflate;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver;
import com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class HomePageUIFrameServiceImpl extends HomePageUIFrameServiceCommonImpl {
    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final Class<? extends Activity> getHomePageInflateActivityClass() {
        return MainActivity.class;
    }

    public static HomePageUIFrameService LIZ() {
        Object LIZ = C58096Mr6.LIZ(HomePageUIFrameService.class, false);
        if (LIZ != null) {
            return (HomePageUIFrameService) LIZ;
        }
        if (C58096Mr6.H2 == null) {
            synchronized (HomePageUIFrameService.class) {
                if (C58096Mr6.H2 == null) {
                    C58096Mr6.H2 = new HomePageUIFrameServiceImpl();
                }
            }
        }
        return C58096Mr6.H2;
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final void removeNoticeView() {
        ShareServiceImpl.LJJJLZIJ().LJJIFFI();
        C62610Ohi.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final void afterTabChangedInMainPageFragment(String str) {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (!TextUtils.equals("HOME", str) && LJIIIIZZ != null) {
            UgCommonServiceImpl.LJIJ().LJIILJJIL(LJIIIIZZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View buildInboxIcon(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return null;
        }
        C36093EEn.LIZ.getClass();
        return ((MainFragmentTopRightIconInflate) C36093EEn.LJI(MainFragmentTopRightIconInflate.class)).LIZLLL(7, activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View buildLiveIcon(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return null;
        }
        return LL8.LIZIZ(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View buildNoticeIcon(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().getDmEntranceView(activity, "homepage_hot");
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View buildProfileIcon(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return null;
        }
        C36093EEn.LIZ.getClass();
        return ((MainFragmentTopRightIconInflate) C36093EEn.LJI(MainFragmentTopRightIconInflate.class)).LIZLLL(8, activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final ImageView buildScanIcon(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (ImageView) LL8.LIZLLL(activity);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View buildSearchIcon(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return null;
        }
        return LL8.LJFF(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View buildSpecialIcon(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return null;
        }
        return LL8.LJI(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View dmEntranceView(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        C36093EEn.LIZ.getClass();
        return ((MainFragmentTopRightIconInflate) C36093EEn.LJI(MainFragmentTopRightIconInflate.class)).LIZLLL(3, activity);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[ORIG_RETURN, RETURN] */
    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class<? extends androidx.fragment.app.Fragment> getFragmentClass(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "tag"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1382453013: goto Le;
                case 2223327: goto L24;
                case 2614219: goto L2f;
                case 185242617: goto L3b;
                case 883457358: goto L4b;
                case 1055811561: goto L57;
                default: goto Lc;
            }
        Lc:
            r1 = 0
        Ld:
            return r1
        Le:
            java.lang.String r0 = "NOTIFICATION"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L17
            goto Lc
        L17:
            X.Lwa r0 = X.C55888Lwa.LIZIZ
            java.lang.Class r1 = r0.LJIIL()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<out androidx.fragment.app.Fragment>"
            kotlin.jvm.internal.o.LJII(r1, r0)
            goto Ld
        L24:
            java.lang.String r0 = "HOME"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            java.lang.Class<com.ss.android.ugc.aweme.main.MainFragment> r1 = com.ss.android.ugc.aweme.main.MainFragment.class
            goto Ld
        L2f:
            java.lang.String r0 = "USER"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L38
            goto Lc
        L38:
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2> r1 = com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2.class
            goto Ld
        L3b:
            java.lang.String r0 = "page_profile"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L44
            goto Lc
        L44:
            X.Z8A r0 = X.Z8A.LIZIZ
            java.lang.Class r1 = r0.getProfilePageFragmentClass()
            goto Ld
        L4b:
            java.lang.String r0 = "page_feed"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L54
            goto Lc
        L54:
            java.lang.Class<com.ss.android.ugc.aweme.main.MainPageFragment> r1 = com.ss.android.ugc.aweme.main.MainPageFragment.class
            goto Ld
        L57:
            java.lang.String r0 = "DISCOVER"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L60
            goto Lc
        L60:
            X.Lu6 r0 = X.C55734Lu6.LIZIZ
            java.lang.Class r1 = r0.LJJJJZI()
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl.getFragmentClass(java.lang.String):java.lang.Class");
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View getInflatedLiveIcon(ActivityC45651qj activityC45651qj) {
        ViewParent viewParent;
        ViewGroup viewGroup;
        C36093EEn.LIZ.getClass();
        MainFragmentTopLeftIconInflate mainFragmentTopLeftIconInflate = (MainFragmentTopLeftIconInflate) C36093EEn.LJI(MainFragmentTopLeftIconInflate.class);
        if (activityC45651qj == null) {
            return null;
        }
        mainFragmentTopLeftIconInflate.getClass();
        if (mainFragmentTopLeftIconInflate.LJLIL == null) {
            mainFragmentTopLeftIconInflate.LJLIL = LL8.LIZIZ(activityC45651qj);
            if (((Boolean) C35183DrP.LJIIIIZZ.getValue()).booleanValue()) {
                mainFragmentTopLeftIconInflate.LIZLLL();
            }
        }
        ImageView imageView = mainFragmentTopLeftIconInflate.LJLIL;
        if (imageView != null) {
            viewParent = imageView.getParent();
        } else {
            viewParent = null;
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            C16880lQ.LJLLL(mainFragmentTopLeftIconInflate.LJLIL, viewGroup);
        }
        ImageView imageView2 = mainFragmentTopLeftIconInflate.LJLIL;
        mainFragmentTopLeftIconInflate.LJLIL = null;
        o.LJII(imageView2, "null cannot be cast to non-null type android.widget.ImageView");
        return imageView2;
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View getInflatedSearchIcon(ActivityC45651qj activityC45651qj) {
        C36093EEn.LIZ.getClass();
        MainFragmentTopRightIconInflate mainFragmentTopRightIconInflate = (MainFragmentTopRightIconInflate) C36093EEn.LJI(MainFragmentTopRightIconInflate.class);
        if (activityC45651qj == null) {
            return null;
        }
        View LIZLLL = mainFragmentTopRightIconInflate.LIZLLL(4, activityC45651qj);
        if (LIZLLL == null) {
            return buildSearchIcon(activityC45651qj);
        }
        return LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View getInflatedSpecialIcon(ActivityC45651qj activityC45651qj) {
        C36093EEn.LIZ.getClass();
        MainFragmentTopRightIconInflate mainFragmentTopRightIconInflate = (MainFragmentTopRightIconInflate) C36093EEn.LJI(MainFragmentTopRightIconInflate.class);
        if (activityC45651qj == null) {
            return null;
        }
        View LIZLLL = mainFragmentTopRightIconInflate.LIZLLL(5, activityC45651qj);
        if (LIZLLL == null) {
            return buildSpecialIcon(activityC45651qj);
        }
        return LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View.OnLongClickListener getPublishLongClickListener(ActivityC45651qj context) {
        o.LJIIIZ(context, "context");
        return new ViewOnLongClickListenerC46116I8a(new C46117I8b(context));
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final AbstractC53892LDc getRootNode(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return LNZ.LIZIZ.getRootNode(activity);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final ImageView ivScanView(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        C36093EEn.LIZ.getClass();
        return (ImageView) ((MainFragmentTopRightIconInflate) C36093EEn.LJI(MainFragmentTopRightIconInflate.class)).LIZLLL(6, activity);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl
    public final void liveIconGenerator(LM4 liveIconGenerator) {
        LQB lqb;
        o.LJIIIZ(liveIconGenerator, "liveIconGenerator");
        if ((liveIconGenerator instanceof LQB) && (lqb = (LQB) liveIconGenerator) != null) {
            lqb.LJI();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View.OnClickListener getBottomClick(Context context, String tag) {
        View.OnClickListener LJIJI;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(tag, "tag");
        switch (tag.hashCode()) {
            case -1382453013:
                if (tag.equals("NOTIFICATION")) {
                    LJIJI = C55888Lwa.LIZIZ.LJIJI(context);
                    break;
                }
                LJIJI = null;
                break;
            case 2223327:
                if (tag.equals("HOME")) {
                    LJIJI = new ViewOnClickListenerC54068LJw(context);
                    break;
                }
                LJIJI = null;
                break;
            case 482617583:
                if (tag.equals("PUBLISH")) {
                    LJIJI = new BottomPublishObserver(context);
                    break;
                }
                LJIJI = null;
                break;
            case 1055811561:
                if (tag.equals("DISCOVER")) {
                    LJIJI = new LK1(context);
                    break;
                }
                LJIJI = null;
                break;
            default:
                LJIJI = null;
                break;
        }
        o.LJI(LJIJI);
        return LJIJI;
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final void openSessionListActivity(ActivityC45651qj activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        C98823uI.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getImChatService(), activity, bundle, false, null, 12);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final InterfaceC55336Lng obtainSwitchHelper(Context context, C54206LPe c54206LPe, C54297LSr c54297LSr) {
        o.LJIIIZ(context, "context");
        if (MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ())) {
            return new LPJ(context, c54206LPe, c54297LSr);
        }
        return null;
    }
}
