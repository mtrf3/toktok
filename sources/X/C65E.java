package X;

import Y.AObserverS70S0100000_2;
import Y.ARunnableS5S0201000_2;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.hint.FTCStickerHintTextViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewState;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.65E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C65E extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final InterfaceC1546365b LJLILLLLZI;
    public final int LJLJI;
    public InterfaceC152085y0 LJLJJI;
    public C1545664u LJLJJL;
    public AnonymousClass655 LJLJJLL;
    public C65C LJLJL;
    public final C5H3 LJLJLJ;

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

    @Override // X.WM7
    public final void onDestroyView() {
        C65C c65c = this.LJLJL;
        if (c65c != null) {
            c65c.LIZJ().gQ();
            super.onDestroyView();
        } else {
            o.LJIJI("textStickerController");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        C65C c65c = this.LJLJL;
        if (c65c != null) {
            SafeHandler safeHandler = c65c.LLFII;
            if (safeHandler != null) {
                ARunnableS5S0201000_2 aRunnableS5S0201000_2 = c65c.LLFZ;
                if (aRunnableS5S0201000_2 != null) {
                    safeHandler.removeCallbacks(aRunnableS5S0201000_2);
                    return;
                } else {
                    o.LJIJI("mNonInfoStickerPlayingRefreshTask");
                    throw null;
                }
            }
            o.LJIJI("safeHandler");
            throw null;
        }
        o.LJIJI("textStickerController");
        throw null;
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        C65C c65c = this.LJLJL;
        if (c65c != null) {
            AnonymousClass655 anonymousClass655 = c65c.LJLJJLL;
            if (anonymousClass655 != null) {
                anonymousClass655.hide();
            }
            SafeHandler safeHandler = c65c.LLFII;
            if (safeHandler != null) {
                ARunnableS5S0201000_2 aRunnableS5S0201000_2 = c65c.LLFZ;
                if (aRunnableS5S0201000_2 != null) {
                    safeHandler.post(aRunnableS5S0201000_2);
                    return;
                } else {
                    o.LJIJI("mNonInfoStickerPlayingRefreshTask");
                    throw null;
                }
            }
            o.LJIJI("safeHandler");
            throw null;
        }
        o.LJIJI("textStickerController");
        throw null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        final C65C c65c = this.LJLJL;
        if (c65c != null) {
            C68M.LJIIJ().LJIJ(c65c.LJLJJI.getContext());
            JediViewModel LIZ = C163726bg.LIZJ(c65c.LJLJJI).LIZ(FTCEditTextStickerViewModel.class);
            o.LJIIIIZZ(LIZ, "SAAJediViewModelProvider…kerViewModel::class.java]");
            c65c.LJLLILLLL = (FTCEditTextStickerViewModel) LIZ;
            c65c.LJLLJ = (FTCStickerHintTextViewModel) C165706es.LJII(c65c.LJLJJI, null, 6).get(FTCStickerHintTextViewModel.class);
            C82632Wbs c82632Wbs = c65c.LJLLLL;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C65C.LLIIIJ;
            c65c.LLFII = new SafeHandler((WM7) c82632Wbs.LIZ(c65c, interfaceC74236TBoArr[1]));
            final FTCEditTextStickerViewModel LIZJ = c65c.LIZJ();
            c65c.LJLJI.LIZIZ(new C6V4(200, new WXC(LIZJ) { // from class: X.67X
                public final FTCEditTextStickerViewModel LIZ;

                {
                    this.LIZ = LIZJ;
                }

                @Override // X.C6P6, X.C6V2
                public final boolean LJJIIZI(MotionEvent event) {
                    o.LJIIIZ(event, "event");
                    return this.LIZ.LJJIIZI(event);
                }

                @Override // X.C6P6, X.C6V2
                public final boolean LJJIZ(float f) {
                    return this.LIZ.LJJIZ(f);
                }

                @Override // X.C6P6, X.C6V2
                public final boolean LJLI(C82537WaL detector) {
                    o.LJIIIZ(detector, "detector");
                    return this.LIZ.LJLI(detector);
                }

                @Override // X.C6P6, X.C6V2
                public final boolean LLLLLLLZIL(C82536WaK detector) {
                    o.LJIIIZ(detector, "detector");
                    return this.LIZ.LLLLLLLZIL(detector);
                }

                @Override // X.C6P6, X.C6V2
                public final boolean onDown(MotionEvent event) {
                    o.LJIIIZ(event, "event");
                    return this.LIZ.onDown(event);
                }

                @Override // X.C6P6, X.C6V2
                public final boolean onScale(ScaleGestureDetector scaleFactor) {
                    o.LJIIIZ(scaleFactor, "scaleFactor");
                    return this.LIZ.onScale(scaleFactor);
                }

                @Override // X.C6P6, X.C6V2
                public final boolean onScaleBegin(ScaleGestureDetector scaleFactor) {
                    o.LJIIIZ(scaleFactor, "scaleFactor");
                    return this.LIZ.onScaleBegin(scaleFactor);
                }

                @Override // X.C6P6, X.C6V2
                public final boolean onSingleTapConfirmed(MotionEvent e) {
                    o.LJIIIZ(e, "e");
                    return this.LIZ.onSingleTapConfirmed(e);
                }

                @Override // X.C6P6, X.C6V2
                public final boolean LJJLIL(C82537WaL detector, float f, float f2) {
                    o.LJIIIZ(detector, "detector");
                    return this.LIZ.LJJLIL(detector, f, f2);
                }

                @Override // X.C6P6, X.C6V2
                public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
                    o.LJIIIZ(e1, "e1");
                    o.LJIIIZ(e2, "e2");
                    return this.LIZ.onFling(e1, e2, f, f2);
                }

                @Override // X.C6P6, X.C6V2
                public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
                    o.LJIIIZ(e1, "e1");
                    o.LJIIIZ(e2, "e2");
                    return this.LIZ.onScroll(e1, e2, f, f2);
                }
            }));
            new C83547Wqd(c65c.LJLILLLLZI, null).LIZIZ(c65c);
            AnonymousClass655 anonymousClass655 = c65c.LJLJJLL;
            if (anonymousClass655 != null) {
                anonymousClass655.LJJJJJ();
            }
            c65c.LIZJ().Lv0().observe((WM7) c65c.LJLLLL.LIZ(c65c, interfaceC74236TBoArr[1]), new AObserverS70S0100000_2(c65c, 343));
            FTCEditTextStickerViewModel LIZJ2 = c65c.LIZJ();
            C65O c65o = new TBT() { // from class: X.65O
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getSticker2Top();
                }
            };
            C73165SnZ c73165SnZ = new C73165SnZ();
            c73165SnZ.LIZ = true;
            C73297Sph.LJ(c65c, LIZJ2, c65o, c73165SnZ, new AqS184S0100000_2(c65c, 108));
            FTCEditTextStickerViewModel LIZJ3 = c65c.LIZJ();
            C65U c65u = new TBT() { // from class: X.65U
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getDismissHitText();
                }
            };
            C73165SnZ c73165SnZ2 = new C73165SnZ();
            c73165SnZ2.LIZ = true;
            C73297Sph.LJIIJ(c65c, LIZJ3, c65u, c73165SnZ2, new AqS184S0100000_2(c65c, 110));
            FTCEditTextStickerViewModel LIZJ4 = c65c.LIZJ();
            C65K c65k = new TBT() { // from class: X.65K
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getAddSticker();
                }
            };
            C73165SnZ c73165SnZ3 = new C73165SnZ();
            c73165SnZ3.LIZ = true;
            C73297Sph.LJ(c65c, LIZJ4, c65k, c73165SnZ3, new AqS184S0100000_2(c65c, 107));
            FTCEditTextStickerViewModel LIZJ5 = c65c.LIZJ();
            C65T c65t = new TBT() { // from class: X.65T
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getTextStickerListener();
                }
            };
            C73165SnZ c73165SnZ4 = new C73165SnZ();
            c73165SnZ4.LIZ = true;
            C73297Sph.LJ(c65c, LIZJ5, c65t, c73165SnZ4, new AqS184S0100000_2(c65c, 109));
            FTCEditTextStickerViewModel LIZJ6 = c65c.LIZJ();
            C65V c65v = new TBT() { // from class: X.65V
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getChangeToTopListener();
                }
            };
            C73165SnZ c73165SnZ5 = new C73165SnZ();
            c73165SnZ5.LIZ = true;
            C73297Sph.LJ(c65c, LIZJ6, c65v, c73165SnZ5, new AqS184S0100000_2(c65c, 111));
            FTCEditTextStickerViewModel LIZJ7 = c65c.LIZJ();
            C65W c65w = new TBT() { // from class: X.65W
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getTimeClickListener();
                }
            };
            C73165SnZ c73165SnZ6 = new C73165SnZ();
            c73165SnZ6.LIZ = true;
            C73297Sph.LJ(c65c, LIZJ7, c65w, c73165SnZ6, new AqS184S0100000_2(c65c, 112));
            FTCEditTextStickerViewModel LIZJ8 = c65c.LIZJ();
            C65X c65x = new TBT() { // from class: X.65X
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getTextStickerEditListener();
                }
            };
            C73165SnZ c73165SnZ7 = new C73165SnZ();
            c73165SnZ7.LIZ = true;
            C73297Sph.LJ(c65c, LIZJ8, c65x, c73165SnZ7, new AqS184S0100000_2(c65c, 113));
            FTCEditTextStickerViewModel LIZJ9 = c65c.LIZJ();
            C65Y c65y = new TBT() { // from class: X.65Y
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getTextStickerMob();
                }
            };
            C73165SnZ c73165SnZ8 = new C73165SnZ();
            c73165SnZ8.LIZ = true;
            C73297Sph.LJ(c65c, LIZJ9, c65y, c73165SnZ8, new AqS184S0100000_2(c65c, 114));
            FTCEditTextStickerViewModel LIZJ10 = c65c.LIZJ();
            C65M c65m = new TBT() { // from class: X.65M
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getReloadStickerEvent();
                }
            };
            C73165SnZ c73165SnZ9 = new C73165SnZ();
            c73165SnZ9.LIZ = true;
            C73297Sph.LJIIJ(c65c, LIZJ10, c65m, c73165SnZ9, new AqS184S0100000_2(c65c, 100));
            FTCEditTextStickerViewModel LIZJ11 = c65c.LIZJ();
            C65N c65n = new TBT() { // from class: X.65N
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getTargetCanvasSize();
                }
            };
            C73165SnZ c73165SnZ10 = new C73165SnZ();
            c73165SnZ10.LIZ = true;
            C73297Sph.LJ(c65c, LIZJ11, c65n, c73165SnZ10, new AqS184S0100000_2(c65c, 101));
            FTCEditTextStickerViewModel LIZJ12 = c65c.LIZJ();
            C65P c65p = new TBT() { // from class: X.65P
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getUpdateLayoutSizeEvent();
                }
            };
            C73165SnZ c73165SnZ11 = new C73165SnZ();
            c73165SnZ11.LIZ = true;
            C73297Sph.LJ(c65c, LIZJ12, c65p, c73165SnZ11, new AqS184S0100000_2(c65c, 102));
            FTCEditTextStickerViewModel LIZJ13 = c65c.LIZJ();
            C65Q c65q = new TBT() { // from class: X.65Q
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getShowInputView();
                }
            };
            C73165SnZ c73165SnZ12 = new C73165SnZ();
            c73165SnZ12.LIZ = true;
            C73297Sph.LJ(c65c, LIZJ13, c65q, c73165SnZ12, new AqS184S0100000_2(c65c, 103));
            FTCEditTextStickerViewModel LIZJ14 = c65c.LIZJ();
            C65R c65r = new TBT() { // from class: X.65R
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getRemoveAllStickerEvent();
                }
            };
            C73165SnZ c73165SnZ13 = new C73165SnZ();
            c73165SnZ13.LIZ = true;
            C73297Sph.LJIIJ(c65c, LIZJ14, c65r, c73165SnZ13, new AqS184S0100000_2(c65c, 104));
            FTCEditTextStickerViewModel LIZJ15 = c65c.LIZJ();
            C65S c65s = new TBT() { // from class: X.65S
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getResetGuideViewVisibilityEvent();
                }
            };
            C73165SnZ c73165SnZ14 = new C73165SnZ();
            c73165SnZ14.LIZ = true;
            C73297Sph.LJIIJ(c65c, LIZJ15, c65s, c73165SnZ14, new AqS184S0100000_2(c65c, 105));
            C73297Sph.LIZLLL(c65c, c65c.LIZJ(), new TBT() { // from class: X.65J
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditTextStickerViewState) obj).getUpdateStickerTime();
                }
            }, new AqS184S0100000_2(c65c, 106));
            c65c.LJZL = new C65D(c65c);
            c65c.LJZ = new C65G(c65c);
            final C1545664u c1545664u = c65c.LJLJJL;
            c1545664u.setInputLayoutShowListener(new AnonymousClass645() { // from class: X.65F
                @Override // X.AnonymousClass645
                public final void dismiss() {
                    C65D c65d = C65C.this.LJZL;
                    if (c65d != null) {
                        c65d.dismiss();
                    }
                    C67P c67p = C65C.this.LJLLLLLL;
                    if (c67p != null) {
                        c67p.LJI();
                    }
                    c1545664u.LJIILIIL();
                }

                @Override // X.AnonymousClass645
                public final void show() {
                    C65D c65d = C65C.this.LJZL;
                    if (c65d != null) {
                        c65d.show();
                    }
                }
            });
            c1545664u.setTextStickerUpdateListener(new InterfaceC1546465c() { // from class: X.65Z
                @Override // X.InterfaceC1546465c
                public final void LIZ() {
                    C1545664u.this.LJIILIIL();
                }
            });
            c1545664u.setVisibleController(new InterfaceC156716Db() { // from class: X.65H
                @Override // X.InterfaceC156716Db
                public final void LIZ() {
                    c1545664u.LJIILIIL();
                }

                @Override // X.InterfaceC156716Db
                public final void LIZIZ() {
                    C65C c65c2 = C65C.this;
                    c65c2.LJFF(c65c2.LJLLLLLL);
                }
            });
            c65c.LIZLLL();
            c65c.LLFZ = new ARunnableS5S0201000_2(c65c, 7);
            return;
        }
        o.LJIJI("textStickerController");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public C65E(C82622Wbi diContainer, InterfaceC1546365b interfaceC1546365b, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = interfaceC1546365b;
        this.LJLJI = i;
        this.LJLJLJ = C269113v.LIZ(this, InterfaceC143655kP.class);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        C82622Wbi c82622Wbi = this.LJLIL;
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity;
        InterfaceC152085y0 interfaceC152085y0 = this.LJLJJI;
        if (interfaceC152085y0 != null) {
            FrameLayout frameLayout = (FrameLayout) container;
            C1545664u c1545664u = this.LJLJJL;
            if (c1545664u != null) {
                AnonymousClass655 anonymousClass655 = this.LJLJJLL;
                if (anonymousClass655 != null) {
                    this.LJLJL = new C65C(c82622Wbi, activityC45651qj, interfaceC152085y0, frameLayout, c1545664u, anonymousClass655, ((InterfaceC143655kP) this.LJLJLJ.getValue()).Kh(), this.LJLILLLLZI, this.LJLJI);
                    return new View(requireSceneContext());
                }
                o.LJIJI("deleteComponent");
                throw null;
            }
            o.LJIJI("inputLayout");
            throw null;
        }
        o.LJIJI("gestureService");
        throw null;
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
