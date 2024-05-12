package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFDialogAbility;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class LQB implements LM4 {
    public static boolean LJLJJLL = true;
    public final MainFragment LJLIL;
    public final LNP LJLILLLLZI;
    public final int LJLJI;
    public ImageView LJLJJI;
    public final String LJLJJL;

    @Override // X.LM4
    public final void LIZ() {
    }

    @Override // X.LM4
    public final void LIZJ() {
    }

    @Override // X.LM4
    public final void LJ(LMX lmx, int i) {
    }

    @Override // X.LM4
    public final void LJIIJ() {
    }

    @Override // X.LM4
    public final void LJIIL() {
    }

    @Override // X.LM4
    public final void LJIILJJIL() {
    }

    @Override // X.LM4
    public final void LJIIZILJ() {
    }

    @Override // X.LM4
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.LM4
    public final boolean enabled() {
        return true;
    }

    @Override // X.LM4
    public final void onCreate() {
        C73353Sqb.LJI().LJII();
        C73353Sqb.LJI().LJIIIZ(0L);
        EventBus.LIZJ().LJIILJJIL(this);
        long longValue = ((Number) C34710Djm.LJJJLIIL.getValue()).longValue();
        if (longValue != -1) {
            C37179EiV.LJFF.postDelayed(LQE.LJLIL, longValue);
        } else {
            C10K.LIZIZ(LQC.LJLIL, C38995FSd.LIZLLL(), null);
        }
        LiveOuterService.LJJJLL().LJJJJLL(false).LIZ(this.LJLJI, this.LJLJJI, true);
    }

    @Override // X.LM4
    public final void onPause() {
    }

    public final void LJI() {
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        LiveOuterService.LJJJLL().LJJJJLL(false).LIZ(this.LJLJI, this.LJLJJI, false);
    }

    @Override // X.LM4
    public final View LJII() {
        boolean z;
        int i = C35056DpM.LIZ;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        ImageView imageView = null;
        if (z || i == 1) {
            View inflatedLiveIcon = HomePageUIFrameServiceImpl.LIZ().getInflatedLiveIcon(this.LJLILLLLZI.getActivity());
            if (inflatedLiveIcon instanceof ImageView) {
                imageView = (ImageView) inflatedLiveIcon;
            }
            this.LJLJJI = imageView;
            if (((Boolean) C35183DrP.LJIIIIZZ.getValue()).booleanValue()) {
                return this.LJLJJI;
            }
        } else {
            View buildLiveIcon = HomePageUIFrameServiceImpl.LIZ().buildLiveIcon(this.LJLILLLLZI.getActivity());
            if (buildLiveIcon instanceof ImageView) {
                imageView = (ImageView) buildLiveIcon;
            }
            this.LJLJJI = imageView;
        }
        boolean LIZ = C52237Ken.LIZ();
        int LJIILL = C17N.LJIILL(24.0d);
        int LJIILL2 = C17N.LJIILL(44.0d);
        if (LIZ) {
            LJIILL = C17N.LJIILL(56.0d);
            LJIILL2 = C17N.LJIILL(56.0d);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJIILL, LJIILL2);
        if (!LIZ) {
            if (this.LJLJI == 8388627) {
                layoutParams.setMargins(C17N.LJIILL(16.0d), 0, 0, 0);
                layoutParams.setMarginStart(C17N.LJIILL(16.0d));
            } else {
                layoutParams.setMargins(0, 0, C17N.LJIILL(16.0d), 0);
                layoutParams.setMarginEnd(C17N.LJIILL(16.0d));
            }
        }
        ImageView imageView2 = this.LJLJJI;
        o.LJI(imageView2);
        imageView2.setLayoutParams(layoutParams);
        ImageView imageView3 = this.LJLJJI;
        o.LJI(imageView3);
        return imageView3;
    }

    @Override // X.LM4
    public final void onResume() {
        if (LJLJJLL) {
            LJLJJLL = false;
        }
    }

    @Override // X.LM4
    public final void onDestroyView() {
        EventBus.LIZJ().LJIJ(this);
        C73353Sqb.LJI().LIZJ();
    }

    @Override // X.LM4
    public final int LIZIZ() {
        return this.LJLJI;
    }

    @Override // X.LM4
    public final String getTag() {
        return this.LJLJJL;
    }

    public final void LIZLLL(LMH mode) {
        Integer valueOf;
        ImageView imageView;
        o.LJIIIZ(mode, "mode");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LIZ = R.raw.icon_live;
        Context context = this.LJLIL.getContext();
        if (context == null || (valueOf = C79045V0n.LJI(mode.getColorResId(), context)) == null) {
            valueOf = Integer.valueOf(mode.getDefaultColor());
        }
        c2068389v.LIZLLL = valueOf;
        c2068389v.LJFF = mode.getHasShadow();
        Context context2 = this.LJLIL.getContext();
        if (context2 != null && (imageView = this.LJLJJI) != null) {
            imageView.setImageDrawable(c2068389v.LIZ(context2));
        }
    }

    @Override // X.LM4
    public final void LJFF(View view) {
        MainFragment mainFragment;
        String str;
        IMFDialogAbility LJFF;
        IMFDialogAbility LJFF2;
        ImageView imageView = this.LJLJJI;
        if (imageView != null && imageView.getVisibility() == 0 && (mainFragment = this.LJLIL) != null && mainFragment.isViewValid()) {
            MainFragment mainFragment2 = this.LJLIL;
            ActivityC45651qj activityC45651qj = null;
            if (mainFragment2 == null || mainFragment2.mo49getActivity() == null) {
                return;
            }
            MainFragment mainFragment3 = this.LJLIL;
            if (mainFragment3 != null && (LJFF2 = C78929UyL.LJFF(mainFragment3)) != null && LJFF2.K0()) {
                return;
            }
            MainFragment mainFragment4 = this.LJLIL;
            if (mainFragment4 != null && (LJFF = C78929UyL.LJFF(mainFragment4)) != null && LJFF.E2()) {
                return;
            }
            if (this.LJLJI == 8388627) {
                str = "top_left";
            } else {
                str = "top_right";
            }
            LiveOuterService.LJJJLL().LJJJJLL(false).getClass();
            if (LQM.LIZIZ()) {
                if (System.currentTimeMillis() >= LQM.LJIL) {
                    LiveBubbleData liveBubbleData = LQM.LJFF;
                    if (liveBubbleData != null) {
                        liveBubbleData.setRoomData(null);
                    }
                } else {
                    LiveBubbleData liveBubbleData2 = LQM.LJFF;
                    LQM.LJI = liveBubbleData2;
                    if (liveBubbleData2 != null && liveBubbleData2.getRoomData() != null) {
                        LiveOuterService.LJJJLL().LJJJJLL(false).getClass();
                        LQM.LJIILIIL = str;
                        LQM.LJFF(0, 1);
                        return;
                    }
                }
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.mRoomsData.fromNewStyle = true;
            enterRoomConfig.mLogData.toplivePosition = str;
            C78688UuS.LJJJJL("homepage_hot");
            LiveOuterService.LJJJLL().LJJIZ().LJIILL();
            MainFragment mainFragment5 = this.LJLIL;
            if (mainFragment5 != null) {
                activityC45651qj = mainFragment5.mo49getActivity();
            }
            C78461Uqn.LIZIZ(activityC45651qj, enterRoomConfig, "homepage_hot");
        }
    }

    public final void LJIIIIZZ(boolean z) {
        if (!z) {
            LJI();
            return;
        }
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        LiveOuterService.LJJJLL().LJJJJLL(false).LIZ(this.LJLJI, this.LJLJJI, true);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLiveIconEntranceEnable(LQG event) {
        boolean z;
        String LJJIZ;
        HomeTabAbility LJIL;
        o.LJIIIZ(event, "event");
        C73353Sqb.LJI().LJIIJJI();
        if (event.LJLIL && BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin()) {
            z = true;
        } else {
            z = false;
        }
        LiveOuterService.LJJJLL().LJJIZ().LJJIJIIJIL();
        if (Live.getLiteService() == null) {
            LJJIZ = "";
        } else {
            LJJIZ = Live.getLiteService().LJJIZ();
        }
        if (o.LJ(LJJIZ, "live_tab_single") || o.LJ(LJJIZ, "live_tab_double")) {
            MainActivityScope LJJLIIIJILLIZJL = C78866UxK.LJJLIIIJILLIZJL(this.LJLIL);
            if (LJJLIIIJILLIZJL != null && (LJIL = C87277YNd.LJIL(LJJLIIIJILLIZJL)) != null) {
                LJIL.XZ();
            }
            z = false;
        } else if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", "homepage_hot");
            hashMap.put("_param_live_platform", "live");
            FMX.LJIIL("livesdk_live_merge_show", hashMap);
            C73353Sqb.LJI().LJIIIIZZ();
            LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL();
            if (C62046OWs.LJ("ttlive_homepage_toplives_entrance", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
                C54285LSf.LIZ.LIZ(0, "ttlive_homepage_toplives_entrance", C03660Ck.LIZJ("source", "for_you_feed_toplives"));
            }
        }
        C73345SqT LJI = C73353Sqb.LJI();
        C73343SqR.LJFF(LJI, null, 15);
        LJI.LIZLLL();
        LJIIIIZZ(z);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUserLoginSuccessfully(C175256uH c175256uH) {
        if (((Boolean) C35107DqB.LIZIZ.getValue()).booleanValue()) {
            LQ9.LIZ = System.currentTimeMillis();
        }
        if (!((Boolean) C35107DqB.LIZJ.getValue()).booleanValue() || c175256uH == null || 1 != c175256uH.LJLIL) {
            LJIIIIZZ(false);
        }
        LiveOuterService.LJJJLL().LJJIZ().LJJIJIIJIL();
        if (Live.getLiteService() == null) {
            return;
        }
        Live.getLiteService().e9();
    }

    public LQB(MainFragment mainFragment, LNP mIEnvironmentConfig) {
        o.LJIIIZ(mIEnvironmentConfig, "mIEnvironmentConfig");
        this.LJLIL = mainFragment;
        this.LJLILLLLZI = mIEnvironmentConfig;
        this.LJLJI = 8388627;
        this.LJLJJL = LMF.LIVE.getTag();
    }
}
