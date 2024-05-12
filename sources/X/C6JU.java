package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS13S0300000_2;
import Y.ARunnableS6S0101000_2;
import Y.IDLListenerS190S0100000_2;
import android.R;
import android.animation.Animator;
import android.app.Activity;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6JU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JU extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final InterfaceC152085y0 LJLIL;
    public final ViewOnClickListenerC158316Jf LJLILLLLZI;
    public final C82622Wbi LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C1548866a LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;

    static {
        TBT tbt = new TBT(C6JU.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C6JU.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0, c65351Pkp), C61845OOz.LIZJ(C6JU.class, "editLiveCDStickerApi", "getEditLiveCDStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/livecd/EditLiveCDStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6JU.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6JU.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0, c65351Pkp)};
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

    public final InterfaceC147865rC LLJILJIL() {
        return (InterfaceC147865rC) this.LJLJL.LIZ(this, LJLLLL[3]);
    }

    public final InterfaceC147905rG LLJILJILJ() {
        return (InterfaceC147905rG) this.LJLJLJ.LIZ(this, LJLLLL[4]);
    }

    public final C6JV LLJJ() {
        return (C6JV) this.LJLLI.getValue();
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJLLL.getValue();
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = LLJJ().LLIIIILZ;
        if (viewOnClickListenerC158316Jf != null) {
            FrameLayout frameLayout = viewOnClickListenerC158316Jf.LJLILLLLZI;
            if (frameLayout != null) {
                frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(new IDLListenerS190S0100000_2(viewOnClickListenerC158316Jf.LJLJLJ, 1));
                Animator animator = viewOnClickListenerC158316Jf.LJZI;
                if (animator != null) {
                    animator.cancel();
                }
            } else {
                o.LJIJI("root");
                throw null;
            }
        }
        this.LJLIL.LIZ((C6V4) this.LJLLILLLL.getValue());
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        this.LJLILLLLZI.LJI();
        ((Handler) this.LJLLJ.getValue()).removeCallbacks((ARunnableS6S0101000_2) this.LJLLL.getValue());
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        LLJJ().getClass();
        ((Handler) this.LJLLJ.getValue()).postDelayed((ARunnableS6S0101000_2) this.LJLLL.getValue(), 200L);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getEditPreviewApi().Kh().observe(this, new AObserverS70S0100000_2(this, 117));
        LLJILJIL().Z60().LIZIZ(this, new AObjectS84S0100000_2(this, 201));
        LLJILJIL().N4().observe(this, new AObserverS70S0100000_2(this, 118));
        ((C63Q) this.LJLJJLL.LIZ(this, LJLLLL[2])).LJIIL(LLJILJIL().N4());
        LLJJ().LJLLILLLL = new C6BO() { // from class: X.6JT
            @Override // X.C6BO
            public final void LIZ() {
            }

            @Override // X.C6BO
            public final void LIZLLL() {
            }

            @Override // X.C6BO
            public final /* synthetic */ void LJI() {
            }

            @Override // X.C6BO
            public final void LJII() {
            }

            @Override // X.C6BO
            public final void LIZIZ() {
                if (C6JU.this.LLJJ().LJIILLIIL()) {
                    C6JU c6ju = C6JU.this;
                    ((C137965bE) c6ju.LJLJJL.LIZ(c6ju, C6JU.LJLLLL[1])).LIZJ(C6JU.this.LLJJ().LLII);
                }
            }

            @Override // X.C6BO
            public final void LIZJ() {
                C6JU.this.getEditPreviewApi().m70(false);
                C6JV LLJJ = C6JU.this.LLJJ();
                LLJJ.LLIIIJ = true;
                LLJJ.LLI.U2(false, false, false);
                ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = LLJJ.LLIIIILZ;
                if (viewOnClickListenerC158316Jf != null) {
                    float height = LLJJ.LJLIL.getHeight();
                    float top = LLJJ.LJLIL.getTop();
                    PointF pointF = viewOnClickListenerC158316Jf.LJLLLLLL;
                    pointF.x = height;
                    pointF.y = top;
                }
                LLJJ.LJIIZILJ();
                C156426By c156426By = LLJJ.LJLL;
                if (c156426By instanceof C6JW) {
                    o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
                    C158326Jg baseView = ((C6JW) c156426By).getBaseView();
                    C156426By c156426By2 = LLJJ.LJLL;
                    o.LJII(c156426By2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
                    ((C6JW) c156426By2).LLIIJLIL = r1.LJLJL.getMeasuredHeight();
                    C6JY c6jy = new C6JY();
                    c6jy.LJLJJLL = 0;
                    c6jy.LJLJI = C6BL.LJIILJJIL(LLJJ.LJLL.getRotateAngle());
                    c6jy.LJLIL = LLJJ.LJLL.getContentView().getScaleX();
                    c6jy.LJLILLLLZI = LLJJ.LJLL.getContentView().getScaleY();
                    c6jy.LJLJJI = LLJJ.LJLIL.getX() + LLJJ.LJLL.getContentView().getX();
                    c6jy.LJLJJL = LLJJ.LJLIL.getY() + LLJJ.LJLL.getContentView().getY();
                    ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf2 = LLJJ.LLIIIILZ;
                    if (viewOnClickListenerC158316Jf2 != null) {
                        viewOnClickListenerC158316Jf2.post(new ARunnableS13S0300000_2(LLJJ, baseView, c6jy, 20));
                    }
                }
                C6JU.this.getClass();
                C6JU.this.LJLL.LIZJ(10);
            }

            @Override // X.C6BO
            public final void LJIIIZ() {
                LIZJ();
            }

            @Override // X.C6BO
            public final void LJ(boolean z) {
                C6JU.this.LLJILJILJ().LIZLLL();
                if (z && !C6JU.this.LLJJ().LJIJJLI()) {
                    C6JU.this.getEditPreviewApi().U2(true, true, true);
                } else {
                    C6JU.this.getEditPreviewApi().U2(false, true, false);
                }
            }

            @Override // X.C6BO
            public final void LJFF(boolean z) {
                if (z) {
                    C6JU.this.LLJILJIL().R10(3);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C6BO
            public final void LJIIIIZZ(View view) {
                InterfaceC1549166d<?> interfaceC1549166d;
                o.LJIIIZ(view, "view");
                C6JU c6ju = C6JU.this;
                ((C63Q) c6ju.LJLJJLL.LIZ(c6ju, C6JU.LJLLLL[2])).LJIILIIL(true);
                if ((view instanceof InterfaceC1549166d) && (interfaceC1549166d = (InterfaceC1549166d) view) != null) {
                    C6JU.this.LLJILJILJ().K2(interfaceC1549166d);
                }
                C6JU.this.LJLL.LJFF(10);
            }
        };
        LLJJ().LLFII = new C6BQ() { // from class: X.6JX
            @Override // X.C6BQ
            public final void LIZ(C156426By c156426By, C156426By c156426By2) {
                if (C6JU.this.LLJJ().LJIJJLI() && (c156426By2 instanceof C6JW)) {
                    InterfaceC147905rG LLJILJILJ = C6JU.this.LLJILJILJ();
                    View drawView = c156426By2.getDrawView();
                    o.LJII(drawView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView");
                    LLJILJILJ.I9((C158326Jg) drawView);
                    C6JU.this.LLJILJILJ().k();
                }
            }
        };
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public C6JU(InterfaceC152085y0 interfaceC152085y0, ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = interfaceC152085y0;
        this.LJLILLLLZI = viewOnClickListenerC158316Jf;
        this.LJLJI = diContainer;
        C82632Wbs LJI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJI = LJI;
        this.LJLJJL = UCI.LJI(diContainer, C137965bE.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, C63Q.class, null);
        this.LJLJL = UCI.LJI(diContainer, InterfaceC147865rC.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, InterfaceC147905rG.class, null);
        this.LJLJLLL = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLL = new C1548866a((VideoPublishEditModel) LJI.LIZ(this, LJLLLL[0]));
        this.LJLLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 487));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 484));
        this.LJLLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 486));
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 485));
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        FrameLayout frameLayout = (FrameLayout) container;
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value != null) {
            VESize size = value.LLILZ();
            o.LJIIIZ(size, "size");
            LLJJ().LJLLLLLL = size;
            LLJJ().LJIJJ(this.mActivity, frameLayout);
            this.LJLIL.LIZIZ((C6V4) this.LJLLILLLL.getValue());
        }
        C6JV LLJJ = LLJJ();
        Activity activity = this.mActivity;
        o.LJI(activity);
        ViewOnClickListenerC158316Jf liveCDEditStickerLayout = this.LJLILLLLZI;
        LLJJ.getClass();
        o.LJIIIZ(liveCDEditStickerLayout, "liveCDEditStickerLayout");
        LLJJ.LLIIIILZ = liveCDEditStickerLayout;
        liveCDEditStickerLayout.setLiveCDStickerController(LLJJ);
        ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = LLJJ.LLIIIILZ;
        if (viewOnClickListenerC158316Jf != null) {
            View findViewById = activity.findViewById(R.id.content);
            o.LJIIIIZZ(findViewById, "activity.findViewById(android.R.id.content)");
            FrameLayout frameLayout2 = (FrameLayout) findViewById;
            viewOnClickListenerC158316Jf.LJLILLLLZI = frameLayout2;
            frameLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS190S0100000_2(viewOnClickListenerC158316Jf.LJLJLJ, 1));
        }
        ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf2 = LLJJ.LLIIIILZ;
        if (viewOnClickListenerC158316Jf2 != null) {
            viewOnClickListenerC158316Jf2.setOnCompleteListener(new AqS184S0100000_2(LLJJ, 81));
        }
        ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf3 = LLJJ.LLIIIILZ;
        if (viewOnClickListenerC158316Jf3 != null) {
            viewOnClickListenerC158316Jf3.setBeforeChangeListener(new AqS133S0200000_2(LLJJ, liveCDEditStickerLayout, 144));
        }
        LLJJ().LJJIJIIJI(getEditPreviewApi().Kh().getValue(), getEditPreviewApi());
        LLJJ().getClass();
        ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf4 = this.LJLILLLLZI;
        VideoPublishEditModel model = (VideoPublishEditModel) this.LJLJJI.LIZ(this, LJLLLL[0]);
        viewOnClickListenerC158316Jf4.getClass();
        o.LJIIIZ(model, "model");
        viewOnClickListenerC158316Jf4.LLF = new C158296Jd(model, viewOnClickListenerC158316Jf4);
        return new View(requireSceneContext());
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
