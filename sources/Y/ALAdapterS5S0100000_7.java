package Y;

import X.C29701Eo;
import X.C45474Ht0;
import X.C45668Hw8;
import X.C45737HxF;
import X.C45765Hxh;
import X.C46036I4y;
import X.C46048I5k;
import X.C78897Uxp;
import X.C79057V0z;
import X.EnumC45766Hxi;
import X.I02;
import X.I53;
import X.I56;
import X.InterfaceC45767Hxj;
import X.W5G;
import X.WM7;
import X.WMH;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import kotlin.jvm.internal.AqS11S0010000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ALAdapterS5S0100000_7 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationCancel$0(this, animator);
                return;
            case 3:
            case 6:
            case 7:
            case 10:
            default:
                super.onAnimationCancel(animator);
                return;
            case 4:
                onAnimationCancel$1(this, animator);
                return;
            case 5:
                onAnimationCancel$2(this, animator);
                return;
            case 8:
                onAnimationCancel$3(this, animator);
                return;
            case 9:
                onAnimationCancel$4(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationCancel$5(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                onAnimationEnd$7(this, animator);
                return;
            case 8:
                onAnimationEnd$8(this, animator);
                return;
            case 9:
                onAnimationEnd$9(this, animator);
                return;
            case 10:
                onAnimationEnd$10(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$11(this, animator);
                return;
            case 12:
                onAnimationEnd$12(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$13(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public ALAdapterS5S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animator) {
        super.onAnimationCancel(animator);
        ((View) aLAdapterS5S0100000_7.l0).setVisibility(8);
    }

    public static final void onAnimationCancel$1(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        View view = ((C45474Ht0) aLAdapterS5S0100000_7.l0).LJLL;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public static final void onAnimationCancel$2(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animator) {
        super.onAnimationCancel(animator);
        ((View) aLAdapterS5S0100000_7.l0).setVisibility(8);
    }

    public static final void onAnimationCancel$3(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C45765Hxh c45765Hxh = (C45765Hxh) aLAdapterS5S0100000_7.l0;
        c45765Hxh.LJLJJL = EnumC45766Hxi.NONE;
        View view = c45765Hxh.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(8);
        } else {
            o.LJIJI("autoCutBtn");
            throw null;
        }
    }

    public static final void onAnimationCancel$4(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C45765Hxh) aLAdapterS5S0100000_7.l0).LJLJJL = EnumC45766Hxi.NONE;
    }

    public static final void onAnimationCancel$5(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animator) {
        super.onAnimationCancel(animator);
        ((C45737HxF) aLAdapterS5S0100000_7.l0).LIZJ();
        ((C45737HxF) aLAdapterS5S0100000_7.l0).LJLJJL.setAlpha(1.0f);
        ((C45737HxF) aLAdapterS5S0100000_7.l0).LJLJLLL.setAlpha(0.0f);
    }

    public static final void onAnimationEnd$0(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C45668Hw8 c45668Hw8 = (C45668Hw8) aLAdapterS5S0100000_7.l0;
        if (!c45668Hw8.LJLLL) {
            return;
        }
        W5G w5g = c45668Hw8.LJLL;
        if (w5g != null) {
            w5g.bringToFront();
            AnimatorSet animatorSet = ((C45668Hw8) aLAdapterS5S0100000_7.l0).LJLLJ;
            if (animatorSet != null) {
                animatorSet.start();
                return;
            }
            return;
        }
        o.LJIJI("animCover2");
        throw null;
    }

    public static final void onAnimationEnd$1(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C45668Hw8 c45668Hw8 = (C45668Hw8) aLAdapterS5S0100000_7.l0;
        if (!c45668Hw8.LJLLL) {
            return;
        }
        W5G w5g = c45668Hw8.LJLJLLL;
        if (w5g != null) {
            w5g.bringToFront();
            AnimatorSet animatorSet = ((C45668Hw8) aLAdapterS5S0100000_7.l0).LJLLILLLL;
            if (animatorSet != null) {
                animatorSet.start();
                return;
            }
            return;
        }
        o.LJIJI("animCover1");
        throw null;
    }

    public static final void onAnimationEnd$10(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        WMH wmh;
        WMH wmh2;
        o.LJIIIZ(animation, "animation");
        ChooseMediaViewModel chooseMediaViewModel = ((MvChoosePhotoScene) aLAdapterS5S0100000_7.l0).LLLLLIL;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.Qv0(ClosingChooseMediaPageState.Closed.INSTANCE);
        }
        NavigationScene LJIL = C78897Uxp.LJIL((MvChoosePhotoScene) aLAdapterS5S0100000_7.l0);
        if (LJIL != null) {
            LJIL.LJLJL = null;
        }
        NavigationScene LJIL2 = C78897Uxp.LJIL((MvChoosePhotoScene) aLAdapterS5S0100000_7.l0);
        if (LJIL2 != null && C79057V0z.LJIILLIIL(LJIL2, (MvChoosePhotoScene) aLAdapterS5S0100000_7.l0)) {
            NavigationScene LJIL3 = C78897Uxp.LJIL((MvChoosePhotoScene) aLAdapterS5S0100000_7.l0);
            if (LJIL3 != null) {
                LJIL3.remove((MvChoosePhotoScene) aLAdapterS5S0100000_7.l0);
                return;
            }
            return;
        }
        WM7 wm7 = ((MvChoosePhotoScene) aLAdapterS5S0100000_7.l0).mParentScene;
        if (!(wm7 instanceof WMH) || (wmh = (WMH) wm7) == null || wmh.findSceneByTag("album_scene") == null) {
            return;
        }
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) aLAdapterS5S0100000_7.l0;
        WM7 wm72 = mvChoosePhotoScene.mParentScene;
        if (!(wm72 instanceof WMH) || (wmh2 = (WMH) wm72) == null) {
            return;
        }
        wmh2.remove(mvChoosePhotoScene);
    }

    public static final void onAnimationEnd$11(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animator) {
        super.onAnimationEnd(animator);
        ((C45737HxF) aLAdapterS5S0100000_7.l0).LIZJ();
        ((C45737HxF) aLAdapterS5S0100000_7.l0).LJLJJL.setAlpha(1.0f);
        ((C45737HxF) aLAdapterS5S0100000_7.l0).LJLJLLL.setAlpha(0.0f);
    }

    public static final void onAnimationEnd$12(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        Activity activity = ((I56) aLAdapterS5S0100000_7.l0).mActivity;
        if (activity != null && activity.isFinishing()) {
            return;
        }
        CutVideoSpeedViewModel cutVideoSpeedViewModel = ((I56) aLAdapterS5S0100000_7.l0).LJLLLLLL;
        if (cutVideoSpeedViewModel != null) {
            cutVideoSpeedViewModel.setState(new AqS11S0010000_6(true, 4));
            ((I56) aLAdapterS5S0100000_7.l0).LLJJ().setVisibility(8);
            ImageView imageView = ((I56) aLAdapterS5S0100000_7.l0).LJLJLJ;
            if (imageView != null) {
                imageView.setVisibility(0);
                ImageView imageView2 = ((I56) aLAdapterS5S0100000_7.l0).LJLJLLL;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    TextView textView = ((I56) aLAdapterS5S0100000_7.l0).LJLL;
                    if (textView != null) {
                        textView.setVisibility(0);
                        View view = ((I56) aLAdapterS5S0100000_7.l0).LJLJJLL;
                        if (view != null) {
                            view.setVisibility(4);
                            TextView textView2 = ((I56) aLAdapterS5S0100000_7.l0).LJLJJL;
                            if (textView2 != null) {
                                textView2.setVisibility(4);
                                C46048I5k c46048I5k = ((I56) aLAdapterS5S0100000_7.l0).LJLIL;
                                o.LJI(c46048I5k);
                                c46048I5k.LJLJJI = false;
                                I56 i56 = (I56) aLAdapterS5S0100000_7.l0;
                                CutVideoBottomBarViewModel cutVideoBottomBarViewModel = i56.LJLZ;
                                if (cutVideoBottomBarViewModel != null) {
                                    I53 i53 = i56.LJLJJI;
                                    if (i53 != null) {
                                        cutVideoBottomBarViewModel.Mv0(i53.LJJJ().getSelectedTime());
                                        return;
                                    } else {
                                        o.LJIJI("previewEditCallback");
                                        throw null;
                                    }
                                }
                                o.LJIJI("bottomBarViewModel");
                                throw null;
                            }
                            o.LJIJI("tvVideoSegmentDes");
                            throw null;
                        }
                        o.LJIJI("animTabDot");
                        throw null;
                    }
                    o.LJIJI("singleEditTitle");
                    throw null;
                }
                o.LJIJI("ivCancel");
                throw null;
            }
            o.LJIJI("ivSave");
            throw null;
        }
        o.LJIJI("speedViewModel");
        throw null;
    }

    public static final void onAnimationEnd$13(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C46036I4y) aLAdapterS5S0100000_7.l0).LLJILJILJ().setAlpha(1.0f);
    }

    public static final void onAnimationEnd$2(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animator) {
        super.onAnimationEnd(animator);
        ((View) aLAdapterS5S0100000_7.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$3(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ChooseMediaViewModel chooseMediaViewModel = ((MvChoosePhotoScene) aLAdapterS5S0100000_7.l0).LLLLLIL;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.Qv0(ClosingChooseMediaPageState.Closed.INSTANCE);
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        View view = ((C45474Ht0) aLAdapterS5S0100000_7.l0).LJLL;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public static final void onAnimationEnd$5(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animator) {
        super.onAnimationEnd(animator);
        ((View) aLAdapterS5S0100000_7.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$6(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ChooseMediaViewModel LJJLIIIJILLIZJL = ((I02) aLAdapterS5S0100000_7.l0).LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            LJJLIIIJILLIZJL.Sv0(OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE);
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ChooseMediaViewModel LJJLIIIJILLIZJL = ((I02) aLAdapterS5S0100000_7.l0).LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            LJJLIIIJILLIZJL.Qv0(ClosingChooseMediaPageState.Closed.INSTANCE);
        }
        ((I02) aLAdapterS5S0100000_7.l0).LJLL = false;
    }

    public static final void onAnimationEnd$8(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C45765Hxh c45765Hxh = (C45765Hxh) aLAdapterS5S0100000_7.l0;
        c45765Hxh.LJLJJL = EnumC45766Hxi.NONE;
        View view = c45765Hxh.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(8);
        } else {
            o.LJIJI("autoCutBtn");
            throw null;
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS5S0100000_7 aLAdapterS5S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (((C45765Hxh) aLAdapterS5S0100000_7.l0).LJLIL.LIZ.getBoolean("autocut_guide_should_show", true)) {
            ((C45765Hxh) aLAdapterS5S0100000_7.l0).LJLIL.LIZ.storeBoolean("autocut_guide_should_show", false);
            C45765Hxh c45765Hxh = (C45765Hxh) aLAdapterS5S0100000_7.l0;
            C29701Eo c29701Eo = c45765Hxh.LJLJI;
            if (c29701Eo != null) {
                c29701Eo.addAnimatorListener(new ALAdapterS5S0200000_7(c45765Hxh, c29701Eo, 1));
                c29701Eo.playAnimation();
                c45765Hxh.LJLJJL = EnumC45766Hxi.GUIDING;
                return;
            }
            return;
        }
        InterfaceC45767Hxj interfaceC45767Hxj = ((C45765Hxh) aLAdapterS5S0100000_7.l0).LJLJJI;
        if (interfaceC45767Hxj != null) {
            interfaceC45767Hxj.LIZ(false);
        }
        ((C45765Hxh) aLAdapterS5S0100000_7.l0).LJLJJL = EnumC45766Hxi.NONE;
    }
}
