package X;

import Y.ACListenerS22S0101000_3;
import Y.ACListenerS34S0100000_14;
import Y.ACListenerS54S0000000_14;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeState;
import com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WUJ extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public FTCEditStickerViewModel LJLJI;
    public FTCEditVolumeViewModel LJLJJI;
    public ViewGroup LJLJJL;
    public WUK LJLJJLL;
    public final C5H3 LJLJL;
    public FrameLayout LJLJLJ;

    static {
        TBT tbt = new TBT(WUJ.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final VideoPublishEditModel LLJILJIL() {
        return (VideoPublishEditModel) this.LJLILLLLZI.LIZ(this, LJLJLLL[0]);
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJL.getValue();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public WUJ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJL = C269113v.LIZ(this, InterfaceC143655kP.class);
    }

    public final void LLJILJILJ(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C173616rd c173616rd;
        C173616rd c173616rd2;
        WUK wuk = this.LJLJJLL;
        if (wuk != null) {
            float f = 100;
            int i = (int) (LLJILJIL().musicVolume * f);
            wuk.LJII = i;
            if (wuk.LJIIIZ && (c173616rd2 = wuk.LIZJ) != null) {
                c173616rd2.setProgress(i);
            }
            WUK wuk2 = this.LJLJJLL;
            if (wuk2 != null) {
                int i2 = (int) (LLJILJIL().voiceVolume * f);
                wuk2.LJIIIIZZ = i2;
                if (wuk2.LJIIIZ && (c173616rd = wuk2.LIZIZ) != null) {
                    c173616rd.setProgress(i2);
                }
                if ((!LLJILJIL().isFastImport && !LLJILJIL().isCutSameVideoType() && !LLJILJIL().hasOriginalSound()) || LLJILJIL().isMuted) {
                    if (LLJILJIL().isUseMusicBeforeEdit()) {
                        WUK wuk3 = this.LJLJJLL;
                        if (wuk3 != null) {
                            if (LLJILJIL().getMMusicPath() != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            wuk3.LIZ(z4);
                            wuk3.LIZIZ(false);
                        } else {
                            o.LJIJI("volumeHelper");
                            throw null;
                        }
                    } else {
                        WUK wuk4 = this.LJLJJLL;
                        if (wuk4 != null) {
                            wuk4.LIZ(true);
                            wuk4.LIZIZ(false);
                        } else {
                            o.LJIJI("volumeHelper");
                            throw null;
                        }
                    }
                } else if (LLJILJIL().isStitchMode()) {
                    WUK wuk5 = this.LJLJJLL;
                    if (wuk5 != null) {
                        wuk5.LIZ(true);
                        StitchParams stitchParams = LLJILJIL().stitchParams;
                        if (stitchParams != null) {
                            z3 = stitchParams.getEnableMic();
                        } else {
                            z3 = true;
                        }
                        wuk5.LIZIZ(z3);
                    } else {
                        o.LJIJI("volumeHelper");
                        throw null;
                    }
                } else {
                    WUK wuk6 = this.LJLJJLL;
                    if (wuk6 != null) {
                        if (LLJILJIL().getMMusicPath() != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        wuk6.LIZ(z2);
                        wuk6.LIZIZ(true);
                    } else {
                        o.LJIJI("volumeHelper");
                        throw null;
                    }
                }
                if (z) {
                    WUK wuk7 = this.LJLJJLL;
                    if (wuk7 != null) {
                        wuk7.LIZLLL(true);
                    } else {
                        o.LJIJI("volumeHelper");
                        throw null;
                    }
                }
                getEditPreviewApi().U2(false, false, false);
                return;
            }
            o.LJIJI("volumeHelper");
            throw null;
        }
        o.LJIJI("volumeHelper");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        int i;
        View view;
        String string;
        super.onActivityCreated(bundle);
        JediViewModel LIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(FTCEditVolumeViewModel.class);
        o.LJIIIIZZ(LIZ, "of(this).get(FTCEditVolumeViewModel::class.java)");
        this.LJLJJI = (FTCEditVolumeViewModel) LIZ;
        JediViewModel LIZ2 = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(FTCEditStickerViewModel.class);
        o.LJIIIIZZ(LIZ2, "of(this).get(\n          …el::class.java,\n        )");
        this.LJLJI = (FTCEditStickerViewModel) LIZ2;
        this.LJLJJLL = new WUK(LLJILJIL());
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this);
        WUK wuk = this.LJLJJLL;
        if (wuk != null) {
            Activity activity = this.mActivity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            wuk.LJI = (ActivityC45651qj) activity;
            wuk.LJIILIIL = LIZIZ;
            WUK wuk2 = this.LJLJJLL;
            if (wuk2 != null) {
                wuk2.LJIILL = this.LJLJLJ;
                ViewGroup viewGroup = this.LJLJJL;
                if (viewGroup != null) {
                    wuk2.LIZ = viewGroup;
                    if (LLJILJIL().isMuted) {
                        i = 0;
                    } else {
                        i = (int) (WUK.LJIIZILJ * 100.0f);
                    }
                    wuk2.LJIIIIZZ = i;
                    WUK wuk3 = this.LJLJJLL;
                    if (wuk3 != null) {
                        if (!wuk3.LJIIIZ) {
                            wuk3.LJIILLIIL = false;
                            View view2 = wuk3.LIZ;
                            if (view2 != null) {
                                wuk3.LIZIZ = (C173616rd) view2.findViewById(R.id.jkb);
                                wuk3.LIZJ = (C173616rd) wuk3.LIZ.findViewById(R.id.jkc);
                                wuk3.LIZIZ.setDisplayPercent(true);
                                wuk3.LIZJ.setDisplayPercent(true);
                                wuk3.LIZLLL = (TextView) wuk3.LIZ.findViewById(R.id.mdg);
                                wuk3.LJ = (TextView) wuk3.LIZ.findViewById(R.id.mdh);
                                wuk3.LJFF = wuk3.LIZ.findViewById(R.id.f02);
                                wuk3.LIZIZ.setMax((int) (WUK.LJIJ * 100.0f));
                                wuk3.LIZJ.setMax((int) (WUK.LJIJJ * 100.0f));
                            }
                            C173616rd c173616rd = wuk3.LIZJ;
                            if (c173616rd != null) {
                                c173616rd.setOnSeekBarChangeListener(new WUL(wuk3));
                                wuk3.LIZIZ.setOnSeekBarChangeListener(new WUM(wuk3));
                                View view3 = wuk3.LJFF;
                                if (view3 != null) {
                                    C16880lQ.LJIIJ(new ACListenerS34S0100000_14(wuk3, 79), view3);
                                }
                                if (wuk3.LJIILLIIL && (view = wuk3.LJIILL) != null) {
                                    C16880lQ.LJIIJ(new ACListenerS22S0101000_3(4, wuk3, 4), view);
                                    View view4 = wuk3.LIZ;
                                    if (view4 != null) {
                                        C16880lQ.LJIIJ(new ACListenerS54S0000000_14(0), view4);
                                    }
                                }
                            }
                            wuk3.LJIIIZ = true;
                        }
                        WUK wuk4 = this.LJLJJLL;
                        if (wuk4 != null) {
                            wuk4.LJIIJJI = new WUP(this);
                            wuk4.LJIIL = new WUN(this);
                            FTCEditVolumeViewModel fTCEditVolumeViewModel = this.LJLJJI;
                            if (fTCEditVolumeViewModel == null) {
                                o.LJIJI("mVolumeViewModel");
                                throw null;
                            }
                            selectNonNullSubscribe(fTCEditVolumeViewModel, new TBT() { // from class: X.W2Z
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((FTCEditVolumeState) obj).getMusicTitle();
                                }
                            }, new C73165SnZ<>(), new AqS196S0100000_14(this, 4));
                            FTCEditVolumeViewModel fTCEditVolumeViewModel2 = this.LJLJJI;
                            if (fTCEditVolumeViewModel2 == null) {
                                o.LJIJI("mVolumeViewModel");
                                throw null;
                            }
                            selectNonNullSubscribe(fTCEditVolumeViewModel2, new TBT() { // from class: X.W2a
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((FTCEditVolumeState) obj).getVoiceTitle();
                                }
                            }, new C73165SnZ<>(), new AqS196S0100000_14(this, 5));
                            FTCEditVolumeViewModel fTCEditVolumeViewModel3 = this.LJLJJI;
                            if (fTCEditVolumeViewModel3 == null) {
                                o.LJIJI("mVolumeViewModel");
                                throw null;
                            }
                            selectNonNullSubscribe(fTCEditVolumeViewModel3, new TBT() { // from class: X.W2Y
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((FTCEditVolumeState) obj).getMusicVolume();
                                }
                            }, new C73165SnZ<>(), new AqS196S0100000_14(this, 6));
                            FTCEditVolumeViewModel fTCEditVolumeViewModel4 = this.LJLJJI;
                            if (fTCEditVolumeViewModel4 != null) {
                                String string2 = getString(R.string.b4_);
                                o.LJIIIIZZ(string2, "getString(R.string.accompany)");
                                fTCEditVolumeViewModel4.L3(string2);
                                FTCEditVolumeViewModel fTCEditVolumeViewModel5 = this.LJLJJI;
                                if (fTCEditVolumeViewModel5 != null) {
                                    if (LLJILJIL().isStitchMode()) {
                                        string = getString(R.string.fl7);
                                        o.LJIIIIZZ(string, "getString(R.string.edit_stitch_your_audio)");
                                    } else {
                                        string = getString(R.string.hzr);
                                        o.LJIIIIZZ(string, "getString(R.string.man_voice)");
                                    }
                                    fTCEditVolumeViewModel5.t(string);
                                    LLJILJILJ(false);
                                    return;
                                }
                                o.LJIJI("mVolumeViewModel");
                                throw null;
                            }
                            o.LJIJI("mVolumeViewModel");
                            throw null;
                        }
                        o.LJIJI("volumeHelper");
                        throw null;
                    }
                    o.LJIJI("volumeHelper");
                    throw null;
                }
                o.LJIJI("volumeLayout");
                throw null;
            }
            o.LJIJI("volumeHelper");
            throw null;
        }
        o.LJIJI("volumeHelper");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cd9, viewGroup, false, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.LJLJLJ = frameLayout;
        View findViewById = frameLayout.findViewById(R.id.g29);
        o.LJIIIIZZ(findViewById, "parentLayout!!.findViewById(R.id.ll_change_volume)");
        this.LJLJJL = (ViewGroup) findViewById;
        FrameLayout frameLayout2 = this.LJLJLJ;
        o.LJI(frameLayout2);
        return frameLayout2;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
