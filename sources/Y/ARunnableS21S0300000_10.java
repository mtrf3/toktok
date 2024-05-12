package Y;

import X.ActivityC45651qj;
import X.C16970lZ;
import X.C1DH;
import X.C222588oQ;
import X.C25600zU;
import X.C44416Hbw;
import X.C49151JQt;
import X.C4PN;
import X.C58655N0h;
import X.C58704N2e;
import X.C59316NPs;
import X.C59753Ncj;
import X.C59988NgW;
import X.C61878OQg;
import X.C62417Oeb;
import X.C62628Oi0;
import X.C62846OlW;
import X.C68322mC;
import X.C78765Uvh;
import X.C99J;
import X.C9U7;
import X.ED2;
import X.HWG;
import X.HWH;
import X.HWK;
import X.InterfaceC36488ETs;
import X.InterfaceC37146Ehy;
import X.InterfaceC88471Ynr;
import X.KL2;
import X.KR8;
import X.NIP;
import X.NN1;
import X.NOJ;
import X.NQ3;
import X.NR5;
import X.NRF;
import X.NWF;
import X.OIA;
import X.OL1;
import X.OL2;
import X.OL5;
import X.OL6;
import X.OL7;
import X.OLG;
import X.OLH;
import X.OVF;
import X.ViewOnClickListenerC62596OhU;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.LynxTemplateRender;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AbsAdPopUpWebPageAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AdPopUpWebPageAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.share.core.ui.campaign.ShareCampaignFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceRecordService;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class ARunnableS21S0300000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public final void LIZ$9() {
        TuxIconView view = (TuxIconView) this.l0;
        Drawable startDrawable = (Drawable) this.l1;
        Drawable endDrawable = (Drawable) this.l2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(startDrawable, "startDrawable");
        o.LJIIIZ(endDrawable, "endDrawable");
        Animator LIZJ = C62628Oi0.LIZJ(view, 1.0f, endDrawable, startDrawable);
        Animator LIZJ2 = C62628Oi0.LIZJ(view, 0.0f, startDrawable, endDrawable);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(LIZJ2).after(800L).after(LIZJ);
        animatorSet.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS21S0300000_10.LIZ$0():void");
    }

    public final void LIZ$1() {
        if (((View) this.l0).getMeasuredHeight() <= 0) {
            C59988NgW c59988NgW = (C59988NgW) this.l1;
            C59988NgW.LIZ(c59988NgW, (View) this.l0, c59988NgW.LJLJJI, c59988NgW.LJLJJL);
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt((C59988NgW) this.l1, "scrollOffset", ((C59988NgW) this.l2).getScrollOffset(), ((View) this.l0).getMeasuredHeight());
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new AUListenerS98S0100000_10((C59988NgW) this.l1, 0));
        ofInt.addListener(new ALAdapterS8S0200000_10((C59988NgW) this.l1, ofInt, 0));
        ofInt.start();
    }

    public final void LIZ$10() {
        OL1.LJIIJJI((Aweme) this.l0);
        OL2.LIZJ((Context) this.l1, (Aweme) this.l0, false);
        OLG.LIZLLL(OLG.LIZ, (Context) this.l1, null, (Aweme) this.l0, ED2.LIZ(((VSAProductCardsResponse.ProductDetail) this.l2).getProductId()), OL6.PRODUCT_CARD, true, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$11() {
        boolean z = false;
        OL2.LIZJ((Context) this.l0, (Aweme) ((C68322mC) this.l1).element, false);
        OL5 LIZLLL = OL1.LIZLLL((Aweme) ((C68322mC) this.l1).element);
        if (LIZLLL != null) {
            VSAProductCardsResponse.ProductCard productCard = LIZLLL.LJFF;
            Map<String, String> map = LIZLLL.LJI;
            OL6 ol6 = (OL6) this.l2;
            Integer adType = LIZLLL.LIZLLL.getAdType();
            int value = OL7.COMMERCIALIZE_PRODUCT_CARD.getValue();
            if (adType != null && adType.intValue() == value) {
                z = true;
            }
            OLH.LIZJ(productCard, map, ol6, z);
        }
    }

    public final void LIZ$2() {
        if (((View) this.l0).getMeasuredHeight() <= 0) {
            C59988NgW c59988NgW = (C59988NgW) this.l1;
            C59988NgW.LIZ(c59988NgW, (View) this.l0, c59988NgW.LJLJJI, c59988NgW.LJLJJL);
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt((C59988NgW) this.l1, "scrollOffset", ((C59988NgW) this.l2).getScrollOffset(), 0);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new AUListenerS98S0100000_10((C59988NgW) this.l1, 1));
        ofInt.addListener(new ALAdapterS8S0200000_10((C59988NgW) this.l1, ofInt, 1));
        ofInt.start();
    }

    public final void LIZ$3() {
        View view;
        int i;
        int i2;
        C62846OlW c62846OlW;
        if (!((Activity) this.l0).isFinishing()) {
            ViewOnClickListenerC62596OhU viewOnClickListenerC62596OhU = (ViewOnClickListenerC62596OhU) this.l1;
            Aweme aweme = (Aweme) this.l2;
            viewOnClickListenerC62596OhU.getClass();
            if (aweme != null && aweme.getAuthor() != null && aweme.getVideo() != null) {
                ViewOnClickListenerC62596OhU viewOnClickListenerC62596OhU2 = (ViewOnClickListenerC62596OhU) this.l1;
                viewOnClickListenerC62596OhU2.LJLJL = (Activity) this.l0;
                viewOnClickListenerC62596OhU2.show();
                ViewOnClickListenerC62596OhU viewOnClickListenerC62596OhU3 = (ViewOnClickListenerC62596OhU) this.l1;
                Aweme aweme2 = (Aweme) this.l2;
                viewOnClickListenerC62596OhU3.getClass();
                Aweme R1 = AwemeService.LIZ().R1(aweme2);
                viewOnClickListenerC62596OhU3.LJLL = R1;
                if (R1 != null && (c62846OlW = viewOnClickListenerC62596OhU3.LJLJLLL) != null && viewOnClickListenerC62596OhU3.LJLJL != null) {
                    C78765Uvh.LJI(c62846OlW, R1.getVideo().getCover(), (int) KL2.LIZJ(viewOnClickListenerC62596OhU3.LJLJL, 49.0f), (int) KL2.LIZJ(viewOnClickListenerC62596OhU3.LJLJL, 59.0f), null);
                }
                Aweme aweme3 = viewOnClickListenerC62596OhU3.LJLL;
                if (aweme3 != null && aweme3.isPrivate() && (view = viewOnClickListenerC62596OhU3.LJLJJLL) != null) {
                    TextView textView = (TextView) view.findViewById(R.id.mps);
                    TextView textView2 = (TextView) view.findViewById(R.id.m4m);
                    User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
                    if (textView == null || textView2 == null || currentUser == null) {
                        return;
                    }
                    Context context = textView.getContext();
                    boolean LJ = C62417Oeb.LJ(viewOnClickListenerC62596OhU3.LJLL);
                    int i3 = R.string.p8k;
                    if (LJ) {
                        if (C4PN.LIZ()) {
                            i2 = R.string.p8l;
                        } else {
                            i2 = R.string.pb7;
                        }
                        textView.setText(context.getString(i2));
                        if (!C4PN.LIZ()) {
                            i3 = R.string.pb6;
                        }
                        textView2.setText(context.getString(i3));
                        return;
                    }
                    if (C4PN.LIZ()) {
                        i = R.string.p8x;
                    } else {
                        i = R.string.pbc;
                    }
                    textView.setText(context.getString(i));
                    if (!C4PN.LIZ()) {
                        i3 = R.string.pbb;
                    }
                    textView2.setText(context.getString(i3));
                }
            }
        }
    }

    public final void LIZ$4() {
        if (((TTSVoiceRecordService) this.l0).LIZLLL && !((Activity) this.l1).isFinishing()) {
            TTSVoiceRecordService tTSVoiceRecordService = (TTSVoiceRecordService) this.l0;
            tTSVoiceRecordService.LIZIZ = HWG.LIZIZ((Activity) this.l1, HWK.VISIBLE, new OVF(tTSVoiceRecordService, (MusicModel) this.l2));
            HWH hwh = ((TTSVoiceRecordService) this.l0).LIZIZ;
            if (hwh != null) {
                hwh.setMessage(((Activity) this.l1).getString(R.string.rjz));
            }
        }
    }

    public final void LIZ$5() {
        C222588oQ c222588oQ;
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        if (KR8.LJIIIZ((InteractBottomBannerAssem) this.l0) || (c222588oQ = ((InteractBottomBannerAssem) this.l0).a1().LIZLLL) == null || (fragment = c222588oQ.LIZJ) == null || (mo49getActivity = fragment.mo49getActivity()) == null) {
            return;
        }
        C1DH.LJIILIIL().post(new ARunnableS21S0300000_10((InteractBottomBannerAssem) this.l0, C16970lZ.LIZLLL(mo49getActivity, ((Integer) this.l1).intValue()), (FeedBottomBannerConfig) this.l2, 7));
    }

    public final void LIZ$6() {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        Set set = (Set) this.l0;
        if (set != null && set.contains("play_2s")) {
            return;
        }
        Aweme aweme = ((C59316NPs) this.l1).LJLJLJ;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "play_2s", awemeRawAd);
        Aweme aweme2 = ((C59316NPs) this.l1).LJLJLJ;
        if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null && awemeRawAd2.isReshowAd()) {
            LIZLLL.LIZIZ(1, "is_reshow");
        }
        LIZLLL.LJI();
        ((NIP) this.l2).LJIJI(((C59316NPs) this.l1).LJLJLJ, "play_2s");
    }

    public final void LIZ$7() {
        AwemeRawAd awemeRawAd;
        Set set = (Set) this.l0;
        if (set != null && set.contains("play_6s")) {
            return;
        }
        C59316NPs c59316NPs = (C59316NPs) this.l1;
        Context context = c59316NPs.LJLLI;
        Aweme aweme = c59316NPs.LJLJLJ;
        NN1.LJJJJI(context, "play_6s", aweme, NN1.LJIIIZ(context, aweme));
        Aweme aweme2 = ((C59316NPs) this.l1).LJLJLJ;
        if (aweme2 != null) {
            awemeRawAd = aweme2.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C58704N2e.LIZLLL("draw_ad", "play_6s", awemeRawAd).LJI();
        ((NIP) this.l2).LJIJI(((C59316NPs) this.l1).LJLJLJ, "play_6s");
    }

    public final void LIZ$8() {
        View view = (View) this.l0;
        int dimensionPixelSize = ((ShareCampaignFragment) this.l2).getResources().getDimensionPixelSize(R.dimen.a74);
        C9U7 c9u7 = ((ShareCampaignFragment) this.l2).LJLIL;
        if (c9u7 != null) {
            C49151JQt.LIZ((C25600zU) this.l1, c9u7);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.setMargins(0, 0, 0, view.getHeight() + dimensionPixelSize);
        C9U7 c9u72 = ((ShareCampaignFragment) this.l2).LJLIL;
        if (c9u72 != null) {
            c9u72.setLayoutParams(layoutParams);
        }
    }

    public static final void run$0(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            aRunnableS21S0300000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            ((LynxTemplateRender) aRunnableS21S0300000_10.l2).LJIJJLI((byte[]) aRunnableS21S0300000_10.l0, (Map) aRunnableS21S0300000_10.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            aRunnableS21S0300000_10.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            ((NWF) aRunnableS21S0300000_10.l0).LJJ((NOJ) aRunnableS21S0300000_10.l1);
            ((AdPopUpWebPageAssem) ((AbsAdPopUpWebPageAssem) aRunnableS21S0300000_10.l2)).a4().LJLLI = ((NWF) aRunnableS21S0300000_10.l0).getActionMode().LIZJ;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            aRunnableS21S0300000_10.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            aRunnableS21S0300000_10.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            aRunnableS21S0300000_10.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            OL2.LIZJ((Context) aRunnableS21S0300000_10.l0, (Aweme) aRunnableS21S0300000_10.l1, false);
            OL5 ol5 = (OL5) aRunnableS21S0300000_10.l2;
            OLH.LIZJ(ol5.LJFF, ol5.LJI, OL6.SHOP_TAB_ICON, false);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            aRunnableS21S0300000_10.LIZ$11();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            ((OIA) aRunnableS21S0300000_10.l2).LIZ.LJIIJ((UpdatePackage) aRunnableS21S0300000_10.l0, (Throwable) aRunnableS21S0300000_10.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            ((OIA) aRunnableS21S0300000_10.l2).LIZ.LJFF((Map) aRunnableS21S0300000_10.l0, (Map) aRunnableS21S0300000_10.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            ((OIA) aRunnableS21S0300000_10.l2).LIZ.LIZ((UpdatePackage) aRunnableS21S0300000_10.l0, (Throwable) aRunnableS21S0300000_10.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            aRunnableS21S0300000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            ((OIA) aRunnableS21S0300000_10.l2).LIZ.LJI((UpdatePackage) aRunnableS21S0300000_10.l0, (Throwable) aRunnableS21S0300000_10.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            ((OIA) aRunnableS21S0300000_10.l2).LIZ.LIZLLL((Throwable) aRunnableS21S0300000_10.l1, (Map) aRunnableS21S0300000_10.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            C59753Ncj LJIIZILJ = ((NR5) aRunnableS21S0300000_10.l0).LJIIZILJ((NRF) aRunnableS21S0300000_10.l1, (Context) aRunnableS21S0300000_10.l2, null, C61878OQg.INSTANCE);
            if (LJIIZILJ != null) {
                LJIIZILJ.LIZ(C99J.CLICK);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$23(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            ((TuxIconView) aRunnableS21S0300000_10.l0).animate().scaleX(1.06f).scaleY(1.06f).setInterpolator((Interpolator) aRunnableS21S0300000_10.l1).setDuration(50L).withEndAction((Runnable) aRunnableS21S0300000_10.l2).start();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            ((TuxIconView) aRunnableS21S0300000_10.l0).animate().scaleX(0.0f).scaleY(0.0f).setDuration(150L).setInterpolator((Interpolator) aRunnableS21S0300000_10.l1).withEndAction((Runnable) aRunnableS21S0300000_10.l2).start();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            C44416Hbw.LIZ((LinearLayoutManager) aRunnableS21S0300000_10.l0, (List) aRunnableS21S0300000_10.l1, (InterfaceC88471Ynr) aRunnableS21S0300000_10.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            ((NQ3) aRunnableS21S0300000_10.l0).LIZ((View) aRunnableS21S0300000_10.l1, (Runnable) aRunnableS21S0300000_10.l2, false);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            aRunnableS21S0300000_10.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            InterfaceC36488ETs interfaceC36488ETs = (InterfaceC36488ETs) aRunnableS21S0300000_10.l0;
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZIZ((JSONObject) aRunnableS21S0300000_10.l1);
            }
            InterfaceC37146Ehy interfaceC37146Ehy = (InterfaceC37146Ehy) aRunnableS21S0300000_10.l2;
            if (interfaceC37146Ehy != null) {
                interfaceC37146Ehy.LIZIZ((JSONObject) aRunnableS21S0300000_10.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            aRunnableS21S0300000_10.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            aRunnableS21S0300000_10.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            if (!KR8.LJIIIZ((InteractBottomBannerAssem) aRunnableS21S0300000_10.l0)) {
                FeedBottomBannerView feedBottomBannerView = ((InteractBottomBannerAssem) aRunnableS21S0300000_10.l0).LLFII;
                if (feedBottomBannerView != null) {
                    View v = (View) aRunnableS21S0300000_10.l1;
                    o.LJIIIIZZ(v, "v");
                    feedBottomBannerView.setInteractionArea(v);
                }
                FeedBottomBannerConfig.Callback callback = ((FeedBottomBannerConfig) aRunnableS21S0300000_10.l2).interactionLayoutCallback;
                if (callback != null) {
                    View v2 = (View) aRunnableS21S0300000_10.l1;
                    o.LJIIIIZZ(v2, "v");
                    callback.onFinishedInflate(v2);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            aRunnableS21S0300000_10.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS21S0300000_10 aRunnableS21S0300000_10) {
        boolean LIZ;
        try {
            aRunnableS21S0300000_10.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS21S0300000_10(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
