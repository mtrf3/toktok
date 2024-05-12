package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS6S0101000_2;
import Y.IDLListenerS190S0100000_2;
import android.R;
import android.animation.Animator;
import android.app.Activity;
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
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6JD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JD extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final C6JI LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C82632Wbs LJLL;
    public final C1548866a LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;

    static {
        TBT tbt = new TBT(C6JD.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C6JD.class, "editPollStickerApi", "getEditPollStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/poll/EditPollStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6JD.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6JD.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C6JD.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0, c65351Pkp), C61845OOz.LIZJ(C6JD.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6JD.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp)};
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
        return (InterfaceC147865rC) this.LJLJJL.LIZ(this, LJLLLL[2]);
    }

    public final InterfaceC147905rG LLJILJILJ() {
        return (InterfaceC147905rG) this.LJLJLJ.LIZ(this, LJLLLL[5]);
    }

    public final VideoPublishEditModel LLJJ() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJLLLL[3]);
    }

    public final C6JF LLJJI() {
        return (C6JF) this.LJLLILLLL.getValue();
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLL.LIZ(this, LJLLLL[6]);
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C6JI c6ji = LLJJI().LLIIJI;
        if (c6ji != null) {
            FrameLayout frameLayout = c6ji.LJLILLLLZI;
            if (frameLayout != null) {
                frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(new IDLListenerS190S0100000_2(c6ji.LJLJI, 12));
                Animator animator = c6ji.LJLLLLLL;
                if (animator != null) {
                    animator.cancel();
                }
            } else {
                o.LJIJI("root");
                throw null;
            }
        }
        ((InterfaceC152085y0) this.LJLJI.LIZ(this, LJLLLL[0])).LIZ((C6V4) this.LJLJLLL.getValue());
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        ((Handler) this.LJLLJ.getValue()).removeCallbacks((ARunnableS6S0101000_2) this.LJLLL.getValue());
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        LLJJI().getClass();
        ((Handler) this.LJLLJ.getValue()).postDelayed((ARunnableS6S0101000_2) this.LJLLL.getValue(), 200L);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLJILJIL().Z60().LIZIZ(this, new AObjectS84S0100000_2(this, 203));
        LLJILJIL().N4().observe(this, new AObserverS70S0100000_2(this, 121));
        C63R c63r = (C63R) this.LJLJJI.LIZ(this, LJLLLL[1]);
        if (c63r != null) {
            c63r.LJIIL(LLJILJIL().N4());
        }
        getEditPreviewApi().Kh().observe(this, new AObserverS70S0100000_2(this, 122));
        LLJJI().LJLLILLLL = new C6BO() { // from class: X.6JC
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
                if (C6JD.this.LLJJI().LJIILLIIL()) {
                    C6JD c6jd = C6JD.this;
                    ((C137965bE) c6jd.LJLJL.LIZ(c6jd, C6JD.LJLLLL[4])).LIZJ(C6JD.this.LLJJI().LLIIIL);
                }
            }

            @Override // X.C6BO
            public final void LIZJ() {
                C6JD.this.getEditPreviewApi().m70(false);
                C6JD.this.LLJJI().LJJIL();
                C6JD c6jd = C6JD.this;
                c6jd.getClass();
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("creation_id", c6jd.LLJJ().getCreationId());
                c145995oB.LJI("shoot_way", c6jd.LLJJ().mShootWay);
                c145995oB.LJI("content_type", H8F.LJII(c6jd.LLJJ()));
                c145995oB.LJI("content_source", H8F.LJI(c6jd.LLJJ()));
                c145995oB.LJI("enter_from", "video_edit_page");
                c145995oB.LJI("prop_id", c6jd.LLJJI().LLIIIL);
                FMX.LJIIL("poll_edit", c145995oB.LIZ);
                C6JD.this.LJLLI.LIZJ(3);
            }

            @Override // X.C6BO
            public final void LJIIIZ() {
                LIZJ();
            }

            @Override // X.C6BO
            public final void LJ(boolean z) {
                C6JD.this.LLJILJILJ().LIZLLL();
                if (z && !C6JD.this.LLJJI().LJIJJLI()) {
                    C6JD.this.getEditPreviewApi().U2(true, true, true);
                } else {
                    C6JD.this.getEditPreviewApi().U2(false, true, false);
                }
            }

            @Override // X.C6BO
            public final void LJFF(boolean z) {
                if (z) {
                    C6JD.this.LLJILJIL().R10(0);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C6BO
            public final void LJIIIIZZ(View view) {
                InterfaceC1549166d<?> interfaceC1549166d;
                o.LJIIIZ(view, "view");
                C6JD c6jd = C6JD.this;
                ((C63R) c6jd.LJLJJI.LIZ(c6jd, C6JD.LJLLLL[1])).LJIILIIL(true);
                if ((view instanceof InterfaceC1549166d) && (interfaceC1549166d = (InterfaceC1549166d) view) != null) {
                    C6JD.this.LLJILJILJ().K2(interfaceC1549166d);
                }
                C6JD.this.LJLLI.LJFF(3);
            }
        };
        LLJJI().LLFII = new C6BQ() { // from class: X.6JE
            @Override // X.C6BQ
            public final void LIZ(C156426By c156426By, C156426By c156426By2) {
                if (C6JD.this.LLJJI().LJIJJLI() && (c156426By2 instanceof C6JG)) {
                    InterfaceC147905rG LLJILJILJ = C6JD.this.LLJILJILJ();
                    View drawView = c156426By2.getDrawView();
                    o.LJII(drawView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView");
                    LLJILJILJ.I9((C6JH) drawView);
                    C6JD.this.LLJILJILJ().k();
                }
            }
        };
    }

    public C6JD(C6JI c6ji, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = c6ji;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = UCI.LJI(diContainer, InterfaceC152085y0.class, null);
        this.LJLJJI = UCI.LJI(diContainer, C63R.class, null);
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC147865rC.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJL = UCI.LJI(diContainer, C137965bE.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, InterfaceC147905rG.class, null);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 494));
        this.LJLL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLLI = new C1548866a(LLJJ());
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 497));
        this.LJLLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 496));
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 495));
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
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
            LLJJI().LJLLLLLL = size;
            LLJJI().LJIJJ(this.mActivity, frameLayout);
            ((InterfaceC152085y0) this.LJLJI.LIZ(this, LJLLLL[0])).LIZIZ((C6V4) this.LJLJLLL.getValue());
        }
        C6JF LLJJI = LLJJI();
        Activity activity = this.mActivity;
        o.LJI(activity);
        C6JI pollingStickerLayout = this.LJLIL;
        LLJJI.getClass();
        o.LJIIIZ(pollingStickerLayout, "pollingStickerLayout");
        LLJJI.LLIIJI = pollingStickerLayout;
        View findViewById = activity.findViewById(R.id.content);
        o.LJIIIIZZ(findViewById, "activity.findViewById(android.R.id.content)");
        FrameLayout frameLayout2 = (FrameLayout) findViewById;
        pollingStickerLayout.LJLILLLLZI = frameLayout2;
        frameLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS190S0100000_2(pollingStickerLayout.LJLJI, 12));
        C6JI c6ji = LLJJI.LLIIJI;
        if (c6ji != null) {
            c6ji.setOnCompleteListener(new AqS168S0100000_2(LLJJI, 667));
        }
        C6JI c6ji2 = LLJJI.LLIIJI;
        if (c6ji2 != null) {
            c6ji2.setBeforeChangeListener(new AqS133S0200000_2(LLJJI, pollingStickerLayout, 155));
        }
        LLJJI().LJJIJIIJI(getEditPreviewApi().Kh().getValue(), getEditPreviewApi());
        LLJJI().getClass();
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
