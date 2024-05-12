package X;

import Y.ACListenerS27S0100000_7;
import Y.AObserverS75S0100000_7;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS12S0010000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I55 extends AbstractC143775kb implements InterfaceC143795kd {
    public VECutVideoPresenter LJLIL;
    public I53 LJLILLLLZI;
    public TextView LJLJI;
    public ImageView LJLJJI;
    public C80364VgO LJLJJL;
    public ImageView LJLJJLL;
    public CutVideoBottomBarViewModel LJLJL;
    public CutVideoViewModel LJLJLJ;
    public VideoEditViewModel LJLJLLL;
    public CutVideoListViewModel LJLL;
    public CutVideoSpeedViewModel LJLLI;
    public CutMultiVideoViewModel LJLLILLLL;
    public CutVideoEditViewModel LJLLJ;

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

    public final I53 LLJILJIL() {
        I53 i53 = this.LJLILLLLZI;
        if (i53 != null) {
            return i53;
        }
        o.LJIJI("previewEditCallback");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJL = (CutVideoBottomBarViewModel) C0JT.LIZIZ((ActivityC45651qj) activity, CutVideoBottomBarViewModel.class, "of(activity as FragmentA…BarViewModel::class.java)");
        Activity activity2 = this.mActivity;
        o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJLJ = (CutVideoViewModel) C0JT.LIZIZ((ActivityC45651qj) activity2, CutVideoViewModel.class, "of(activity as FragmentA…deoViewModel::class.java)");
        Activity activity3 = this.mActivity;
        o.LJII(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJLLL = (VideoEditViewModel) ViewModelProviders.of((ActivityC45651qj) activity3).get(VideoEditViewModel.class);
        Activity activity4 = this.mActivity;
        o.LJII(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLL = (CutVideoListViewModel) C0JT.LIZIZ((ActivityC45651qj) activity4, CutVideoListViewModel.class, "of(activity as FragmentA…istViewModel::class.java)");
        Activity activity5 = this.mActivity;
        o.LJII(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLLI = (CutVideoSpeedViewModel) C0JT.LIZIZ((ActivityC45651qj) activity5, CutVideoSpeedViewModel.class, "of(activity as FragmentA…eedViewModel::class.java)");
        Activity activity6 = this.mActivity;
        o.LJII(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLLILLLL = (CutMultiVideoViewModel) ViewModelProviders.of((ActivityC45651qj) activity6).get(CutMultiVideoViewModel.class);
        Activity activity7 = this.mActivity;
        o.LJII(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLLJ = (CutVideoEditViewModel) C0JT.LIZIZ((ActivityC45651qj) activity7, CutVideoEditViewModel.class, "of(activity as FragmentA…ditViewModel::class.java)");
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.LJLJL;
        if (cutVideoBottomBarViewModel == null) {
            o.LJIJI("bottomBarViewModel");
            throw null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel, new TBT() { // from class: X.I5N
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getSelectTime();
            }
        }, new C73165SnZ<>(), new AqS189S0100000_7(this, 57));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.LJLJL;
        if (cutVideoBottomBarViewModel2 == null) {
            o.LJIJI("bottomBarViewModel");
            throw null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel2, new TBT() { // from class: X.I5P
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getSpeedVisible();
            }
        }, new C73165SnZ<>(), new AqS189S0100000_7(this, 60));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.LJLJL;
        if (cutVideoBottomBarViewModel3 == null) {
            o.LJIJI("bottomBarViewModel");
            throw null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel3, new TBT() { // from class: X.I5Q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getSpeedChecked();
            }
        }, new C73165SnZ<>(), new AqS189S0100000_7(this, 63));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = this.LJLJL;
        if (cutVideoBottomBarViewModel4 == null) {
            o.LJIJI("bottomBarViewModel");
            throw null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel4, new TBT() { // from class: X.I5R
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getRotateVisible();
            }
        }, new C73165SnZ<>(), new AqS189S0100000_7(this, 65));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel5 = this.LJLJL;
        if (cutVideoBottomBarViewModel5 == null) {
            o.LJIJI("bottomBarViewModel");
            throw null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel5, new TBT() { // from class: X.I5S
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getDeleteVisible();
            }
        }, new C73165SnZ<>(), new AqS189S0100000_7(this, 44));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel6 = this.LJLJL;
        if (cutVideoBottomBarViewModel6 == null) {
            o.LJIJI("bottomBarViewModel");
            throw null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel6, new TBT() { // from class: X.I5I
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getSpeedEnable();
            }
        }, new C73165SnZ<>(), new AqS189S0100000_7(this, 47));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel7 = this.LJLJL;
        if (cutVideoBottomBarViewModel7 == null) {
            o.LJIJI("bottomBarViewModel");
            throw null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel7, new TBT() { // from class: X.I5L
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getRotateEnable();
            }
        }, new C73165SnZ<>(), new AqS189S0100000_7(this, 49));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel8 = this.LJLJL;
        if (cutVideoBottomBarViewModel8 == null) {
            o.LJIJI("bottomBarViewModel");
            throw null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel8, new TBT() { // from class: X.I5O
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getDeleteEnable();
            }
        }, new C73165SnZ<>(), new AqS189S0100000_7(this, 51));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel9 = this.LJLJL;
        if (cutVideoBottomBarViewModel9 != null) {
            ((LiveData) cutVideoBottomBarViewModel9.LJLJJLL.getValue()).observe(this, new AObserverS75S0100000_7(this, 76));
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel10 = this.LJLJL;
            if (cutVideoBottomBarViewModel10 != null) {
                ((LiveData) cutVideoBottomBarViewModel10.LJLJL.getValue()).observe(this, new AObserverS75S0100000_7(this, 77));
                CutVideoViewModel cutVideoViewModel = this.LJLJLJ;
                if (cutVideoViewModel != null) {
                    if (!cutVideoViewModel.Ov0()) {
                        ImageView imageView = this.LJLJJI;
                        if (imageView != null) {
                            boolean z = false;
                            imageView.setVisibility(0);
                            VideoEditViewModel videoEditViewModel = this.LJLJLLL;
                            if (videoEditViewModel != null) {
                                if (videoEditViewModel.hv0()) {
                                    VideoEditViewModel videoEditViewModel2 = this.LJLJLLL;
                                    if (videoEditViewModel2 != null) {
                                        VideoSegment videoSegment = (VideoSegment) ListProtector.get(videoEditViewModel2.kv0(), 0);
                                        CutVideoBottomBarViewModel cutVideoBottomBarViewModel11 = this.LJLJL;
                                        if (cutVideoBottomBarViewModel11 != null) {
                                            if (this.LJLJLJ != null) {
                                                if ((!r0.Mv0().LJIILIIL) && I5H.LIZ(videoSegment)) {
                                                    z = true;
                                                }
                                                cutVideoBottomBarViewModel11.setState(new AqS12S0010000_7(z, 28));
                                            } else {
                                                o.LJIJI("cutVideoViewModel");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("bottomBarViewModel");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("videoEditViewModel");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("videoEditViewModel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("ivRotate");
                            throw null;
                        }
                    }
                    ImageView imageView2 = this.LJLJJLL;
                    if (imageView2 != null) {
                        C16880lQ.LJIILLIIL(imageView2, new ACListenerS27S0100000_7(this, 99));
                        C80364VgO c80364VgO = this.LJLJJL;
                        if (c80364VgO != null) {
                            c80364VgO.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS27S0100000_7(this, 100)));
                            ImageView imageView3 = this.LJLJJI;
                            if (imageView3 != null) {
                                C16880lQ.LJIILLIIL(imageView3, new ACListenerS27S0100000_7(this, 101));
                                return;
                            } else {
                                o.LJIJI("ivRotate");
                                throw null;
                            }
                        }
                        o.LJIJI("ivSpeed");
                        throw null;
                    }
                    o.LJIJI("ivDelete");
                    throw null;
                }
                o.LJIJI("cutVideoViewModel");
                throw null;
            }
            o.LJIJI("bottomBarViewModel");
            throw null;
        }
        o.LJIJI("bottomBarViewModel");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.lya);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.tvTime)");
        this.LJLJI = (TextView) requireViewById;
        View requireViewById2 = requireViewById(R.id.ewy);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.ivRotate)");
        this.LJLJJI = (ImageView) requireViewById2;
        View requireViewById3 = requireViewById(R.id.ex1);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.ivSpeed)");
        this.LJLJJL = (C80364VgO) requireViewById3;
        View requireViewById4 = requireViewById(R.id.ew9);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.ivDelete)");
        this.LJLJJLL = (ImageView) requireViewById4;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cbn, viewGroup, false, "inflater.inflate(R.layou…om_bar, container, false)");
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
