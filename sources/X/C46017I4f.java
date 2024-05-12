package X;

import Y.ACListenerS27S0100000_7;
import Y.AObserverS75S0100000_7;
import Y.ARunnableS43S0100000_7;
import Y.IDCListenerS299S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I4f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46017I4f extends AbstractC143775kb implements InterfaceC143795kd {
    public VECutVideoPresenter LJLIL;
    public SurfaceView LJLILLLLZI;
    public ImageView LJLJI;
    public FrameLayout LJLJJI;
    public FrameLayout LJLJJL;
    public VEVideoCutterViewModel LJLJJLL;
    public CutMultiVideoViewModel LJLJL;
    public VideoEditViewModel LJLJLJ;
    public CutVideoViewModel LJLJLLL;
    public CutVideoPreviewViewModel LJLL;
    public CutVideoSpeedViewModel LJLLI;
    public final Handler LJLLILLLL = new Handler();
    public final ARunnableS43S0100000_7 LJLLJ = new ARunnableS43S0100000_7(this, LiveTryModeCountDownThresholdSetting.DEFAULT);

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

    public final SurfaceView LLJILJILJ() {
        SurfaceView surfaceView = this.LJLILLLLZI;
        if (surfaceView != null) {
            return surfaceView;
        }
        o.LJIJI("videoSurface");
        throw null;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLLILLLL.removeCallbacks(this.LJLLJ);
    }

    public final float LLJILJIL(int i) {
        FrameLayout frameLayout = this.LJLJJI;
        if (frameLayout != null) {
            Context context = frameLayout.getContext();
            o.LJIIIIZZ(context, "context");
            return context.getResources().getDimensionPixelSize(R.dimen.a5b) + ((i - ((int) C44729Hgz.LJIIL(context, 32.0f))) / 2);
        }
        o.LJIJI("videoLayout");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJL = (CutMultiVideoViewModel) ViewModelProviders.of((ActivityC45651qj) activity).get(CutMultiVideoViewModel.class);
        Activity activity2 = this.mActivity;
        o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJLJ = (VideoEditViewModel) ViewModelProviders.of((ActivityC45651qj) activity2).get(VideoEditViewModel.class);
        Activity activity3 = this.mActivity;
        o.LJII(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJJLL = (VEVideoCutterViewModel) ViewModelProviders.of((ActivityC45651qj) activity3).get(VEVideoCutterViewModel.class);
        Activity activity4 = this.mActivity;
        o.LJII(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLL = (CutVideoPreviewViewModel) C0JT.LIZIZ((ActivityC45651qj) activity4, CutVideoPreviewViewModel.class, "of(activity as FragmentA…iewViewModel::class.java)");
        Activity activity5 = this.mActivity;
        o.LJII(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C0JT.LIZIZ((ActivityC45651qj) activity5, CutVideoMultiBottomViewModel.class, "of(activity as FragmentA…tomViewModel::class.java)");
        Activity activity6 = this.mActivity;
        o.LJII(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLLI = (CutVideoSpeedViewModel) C0JT.LIZIZ((ActivityC45651qj) activity6, CutVideoSpeedViewModel.class, "of(activity as FragmentA…eedViewModel::class.java)");
        VEVideoCutterViewModel vEVideoCutterViewModel = this.LJLJJLL;
        String str = null;
        if (vEVideoCutterViewModel != null) {
            vEVideoCutterViewModel.gv0().observe(this, new AObserverS75S0100000_7(this, 73));
            CutVideoPreviewViewModel cutVideoPreviewViewModel = this.LJLL;
            if (cutVideoPreviewViewModel == null) {
                o.LJIJI("previewViewModel");
                throw null;
            }
            subscribeEvent(cutVideoPreviewViewModel, new TBT() { // from class: X.I4g
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((CutVideoPreviewState) obj).getRestartProgress();
                }
            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 53));
            CutVideoPreviewViewModel cutVideoPreviewViewModel2 = this.LJLL;
            if (cutVideoPreviewViewModel2 == null) {
                o.LJIJI("previewViewModel");
                throw null;
            }
            selectNonNullSubscribe(cutVideoPreviewViewModel2, new TBT() { // from class: X.I4h
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((CutVideoPreviewState) obj).getSurfaceEnable();
                }
            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 56));
            CutVideoPreviewViewModel cutVideoPreviewViewModel3 = this.LJLL;
            if (cutVideoPreviewViewModel3 == null) {
                o.LJIJI("previewViewModel");
                throw null;
            }
            subscribeEvent(cutVideoPreviewViewModel3, new TBT() { // from class: X.I4i
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((CutVideoPreviewState) obj).getResetSurfaceSizeEvent();
                }
            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 59));
            CutVideoPreviewViewModel cutVideoPreviewViewModel4 = this.LJLL;
            if (cutVideoPreviewViewModel4 == null) {
                o.LJIJI("previewViewModel");
                throw null;
            }
            subscribeEvent(cutVideoPreviewViewModel4, new TBT() { // from class: X.I4j
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((CutVideoPreviewState) obj).getUpdateBottomMarginEvent();
                }
            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 61));
            CutVideoViewModel cutVideoViewModel = this.LJLJLLL;
            if (cutVideoViewModel != null) {
                if (!cutVideoViewModel.Ov0()) {
                    VideoEditViewModel videoEditViewModel = this.LJLJLJ;
                    if (videoEditViewModel != null) {
                        if (videoEditViewModel.hv0()) {
                            VideoEditViewModel videoEditViewModel2 = this.LJLJLJ;
                            if (videoEditViewModel2 != null) {
                                VideoSegment videoSegment = (VideoSegment) ListProtector.get(videoEditViewModel2.kv0(), 0);
                                C157236Fb.LIZ.LJII(Math.min(videoSegment.width, videoSegment.height), Math.max(videoSegment.width, videoSegment.height), LLJILJILJ());
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
                    FrameLayout frameLayout = this.LJLJJI;
                    if (frameLayout != null) {
                        frameLayout.post(new ARunnableS43S0100000_7(this, 119));
                    } else {
                        o.LJIJI("videoLayout");
                        throw null;
                    }
                }
                LLJILJILJ().setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS27S0100000_7(this, 104)));
                CutVideoViewModel cutVideoViewModel2 = this.LJLJLLL;
                if (cutVideoViewModel2 != null) {
                    if (cutVideoViewModel2.Nv0() != null) {
                        CutVideoViewModel cutVideoViewModel3 = this.LJLJLLL;
                        if (cutVideoViewModel3 != null) {
                            LibraryMaterialInfoSv Nv0 = cutVideoViewModel3.Nv0();
                            if (Nv0 != null) {
                                str = Nv0.getId();
                            }
                            if (C78685UuP.LJJJZ(str)) {
                                LLJILJILJ().setOnLongClickListener(new IDCListenerS299S0100000_7(this, 0));
                                return;
                            }
                            return;
                        }
                        o.LJIJI("cutVideoViewModel");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("cutVideoViewModel");
                throw null;
            }
            o.LJIJI("cutVideoViewModel");
            throw null;
        }
        o.LJIJI("veVideoCutterViewModel");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.n46);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.videoSurface)");
        this.LJLILLLLZI = (SurfaceView) requireViewById;
        View requireViewById2 = requireViewById(R.id.ewl);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.ivPlay)");
        this.LJLJI = (ImageView) requireViewById2;
        View requireViewById3 = requireViewById(R.id.n6e);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.video_layout)");
        this.LJLJJI = (FrameLayout) requireViewById3;
        View requireViewById4 = requireViewById(R.id.n4t);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.video_control_layout)");
        this.LJLJJL = (FrameLayout) requireViewById4;
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        CutVideoViewModel cutVideoViewModel = (CutVideoViewModel) C0JT.LIZIZ((ActivityC45651qj) activity, CutVideoViewModel.class, "JediViewModelProviders.o…deoViewModel::class.java]");
        this.LJLJLLL = cutVideoViewModel;
        if (cutVideoViewModel.Ov0()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            int LJIIL = (int) C44729Hgz.LJIIL(requireActivity, 56.0f);
            marginLayoutParams.topMargin = LJIIL;
            marginLayoutParams.topMargin = C81184Vtc.LJFF(this.mActivity) + LJIIL;
            Activity requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            marginLayoutParams.bottomMargin = (int) C44729Hgz.LJIIL(requireActivity2, 270.0f);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cbs, viewGroup, false, "inflater.inflate(R.layou…review, container, false)");
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
