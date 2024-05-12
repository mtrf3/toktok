package X;

import Y.AObserverS75S0100000_7;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I3t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46005I3t extends AbstractC151235wd implements InterfaceC143795kd, I53, InterfaceC44501HdJ, I5V {
    public final CreativeInfo LJLIL;
    public CutVideoViewModel LJLJLJ;
    public VideoEditViewModel LJLJLLL;
    public CutVideoTitleBarViewModel LJLL;
    public CutVideoBottomBarViewModel LJLLI;
    public CutVideoListViewModel LJLLILLLL;
    public CutVideoEditViewModel LJLLJ;
    public CutVideoPreviewViewModel LJLLL;
    public long LJLLLL;
    public boolean LJZ;
    public long LJZI;
    public boolean LJZL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 520));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 523));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 521));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 518));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 522));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 519));
    public final int LJLLLLLL = 3600000;
    public final ArrayList<ImportVideoInfo> LJLZ = new ArrayList<>();

    @Override // X.InterfaceC44501HdJ
    public final LifecycleOwner LJJJJLI() {
        return this;
    }

    @Override // X.InterfaceC44501HdJ
    public final void LLILZLL() {
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

    @Override // X.InterfaceC44501HdJ
    public final SurfaceView LJJIJ() {
        return ((C46017I4f) this.LJLILLLLZI.getValue()).LLJILJILJ();
    }

    @Override // X.InterfaceC44501HdJ
    public final void LJJIJIIJI() {
        CutVideoViewModel cutVideoViewModel = this.LJLJLJ;
        if (cutVideoViewModel != null) {
            if (cutVideoViewModel.Ov0()) {
                LLJILJIL().LLJILJIL().getClass();
            } else {
                ((C46007I3v) this.LJLJJI.getValue()).LLJILJILJ().getClass();
            }
            C145995oB c145995oB = new C145995oB();
            CutVideoViewModel cutVideoViewModel2 = this.LJLJLJ;
            if (cutVideoViewModel2 != null) {
                c145995oB.LJI("shoot_way", cutVideoViewModel2.Mv0().LJIIL);
                c145995oB.LJI("type", "1");
                CutVideoViewModel cutVideoViewModel3 = this.LJLJLJ;
                if (cutVideoViewModel3 != null) {
                    c145995oB.LIZ(cutVideoViewModel3.Mv0().LIZ.size(), "count");
                    long currentTimeMillis = System.currentTimeMillis();
                    CutVideoViewModel cutVideoViewModel4 = this.LJLJLJ;
                    if (cutVideoViewModel4 != null) {
                        c145995oB.LIZIZ(currentTimeMillis - cutVideoViewModel4.Mv0().LJJIJ, "duration");
                        GXR.LIZ("tool_performance_video_clip_first_frame", c145995oB.LIZ);
                        return;
                    } else {
                        o.LJIJI("cutVideoViewModel");
                        throw null;
                    }
                }
                o.LJIJI("cutVideoViewModel");
                throw null;
            }
            o.LJIJI("cutVideoViewModel");
            throw null;
        }
        o.LJIJI("cutVideoViewModel");
        throw null;
    }

    @Override // X.I53
    public final I50 LJJJ() {
        CutVideoViewModel cutVideoViewModel = this.LJLJLJ;
        if (cutVideoViewModel != null) {
            if (cutVideoViewModel.Ov0()) {
                return LLJILJIL().LLJILJIL().LLJILJILJ();
            }
            return ((C46007I3v) this.LJLJJI.getValue()).LLJILJILJ().LLJILJILJ();
        }
        o.LJIJI("cutVideoViewModel");
        throw null;
    }

    @Override // X.I53
    public final int LJJZZIII() {
        return ((C46017I4f) this.LJLILLLLZI.getValue()).LLJILJILJ().getMeasuredWidth();
    }

    @Override // X.InterfaceC44501HdJ
    public final void LJLLILLLL() {
        CutVideoViewModel cutVideoViewModel = this.LJLJLJ;
        if (cutVideoViewModel != null) {
            if (cutVideoViewModel.Ov0()) {
                CutVideoPreviewViewModel cutVideoPreviewViewModel = LLJILJIL().LJLJJI;
                if (cutVideoPreviewViewModel != null) {
                    cutVideoPreviewViewModel.setState(C46022I4k.LJLIL);
                    return;
                } else {
                    o.LJIJI("previewViewModel");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("cutVideoViewModel");
        throw null;
    }

    @Override // X.InterfaceC44501HdJ
    public final void LJLLJ() {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // X.I53
    public final int LJZI() {
        return ((C46017I4f) this.LJLILLLLZI.getValue()).LLJILJILJ().getMeasuredHeight();
    }

    @Override // X.InterfaceC44501HdJ
    public final int LL() {
        CutVideoEditViewModel cutVideoEditViewModel = this.LJLLJ;
        if (cutVideoEditViewModel != null) {
            return cutVideoEditViewModel.LJLJJLL;
        }
        o.LJIJI("cutVideoEditViewModel");
        throw null;
    }

    @Override // X.InterfaceC44501HdJ
    public final ActivityC45651qj LLJ() {
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (ActivityC45651qj) activity;
    }

    public final C46006I3u LLJILJIL() {
        return (C46006I3u) this.LJLJJL.getValue();
    }

    public final VECutVideoPresenter LLJILJILJ() {
        return (VECutVideoPresenter) this.LJLJL.getValue();
    }

    @Override // X.InterfaceC44501HdJ
    public final void LJIILJJIL() {
        LJJJ().LJII();
    }

    @Override // X.I5V
    public final float LJLIL() {
        return LJJJ().getSelectedTime();
    }

    @Override // X.InterfaceC44501HdJ
    public final long LLIIIL() {
        return LJJJ().getMaxCutDuration();
    }

    @Override // X.InterfaceC44501HdJ
    public final C15070iV<Long, Long> LLIIZ() {
        C15070iV<Long, Long> playBoundary = LJJJ().getPlayBoundary();
        o.LJIIIIZZ(playBoundary, "getVideoEditView().playBoundary");
        return playBoundary;
    }

    @Override // X.WM7
    public final void onAttach() {
        super.onAttach();
        VECutVideoPresenter LLJILJILJ = LLJILJILJ();
        Activity requireActivity = requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        LLJILJILJ.LIZ((ActivityC45651qj) requireActivity);
    }

    public C46005I3t(CreativeInfo creativeInfo) {
        this.LJLIL = creativeInfo;
    }

    public static final void LLJJ(boolean z) {
        GGO ggo;
        if (z) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(1108, ggo, EnumC42283Gid.PROGRESS_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJLLL = (VideoEditViewModel) ViewModelProviders.of((ActivityC45651qj) activity).get(VideoEditViewModel.class);
        Activity activity2 = this.mActivity;
        o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ViewModelProviders.of((ActivityC45651qj) activity2).get(CutMultiVideoViewModel.class);
        Activity activity3 = this.mActivity;
        o.LJII(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLL = (CutVideoTitleBarViewModel) C0JT.LIZIZ((ActivityC45651qj) activity3, CutVideoTitleBarViewModel.class, "of(activity as FragmentA…BarViewModel::class.java)");
        Activity activity4 = this.mActivity;
        o.LJII(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLLI = (CutVideoBottomBarViewModel) C0JT.LIZIZ((ActivityC45651qj) activity4, CutVideoBottomBarViewModel.class, "of(activity as FragmentA…BarViewModel::class.java)");
        Activity activity5 = this.mActivity;
        o.LJII(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLLILLLL = (CutVideoListViewModel) C0JT.LIZIZ((ActivityC45651qj) activity5, CutVideoListViewModel.class, "of(activity as FragmentA…istViewModel::class.java)");
        Activity activity6 = this.mActivity;
        o.LJII(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLLJ = (CutVideoEditViewModel) C0JT.LIZIZ((ActivityC45651qj) activity6, CutVideoEditViewModel.class, "of(activity as FragmentA…ditViewModel::class.java)");
        Activity activity7 = this.mActivity;
        o.LJII(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLLL = (CutVideoPreviewViewModel) C0JT.LIZIZ((ActivityC45651qj) activity7, CutVideoPreviewViewModel.class, "of(activity as FragmentA…iewViewModel::class.java)");
        CutVideoViewModel cutVideoViewModel = this.LJLJLJ;
        if (cutVideoViewModel == null) {
            o.LJIJI("cutVideoViewModel");
            throw null;
        }
        subscribeEvent(cutVideoViewModel, new TBT() { // from class: X.I4E
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((CutVideoState) obj).getQuitEvent();
            }
        }, new C73165SnZ<>(), new AqS189S0100000_7(this, 39));
        CutVideoViewModel cutVideoViewModel2 = this.LJLJLJ;
        if (cutVideoViewModel2 == null) {
            o.LJIJI("cutVideoViewModel");
            throw null;
        }
        subscribeEvent(cutVideoViewModel2, new TBT() { // from class: X.I4G
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((CutVideoState) obj).getNextEvent();
            }
        }, new C73165SnZ<>(), new AqS189S0100000_7(this, 40));
        VideoEditViewModel videoEditViewModel = this.LJLJLLL;
        if (videoEditViewModel != null) {
            videoEditViewModel.LJZ.observe(this, new AObserverS75S0100000_7(this, 69));
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.LJLLI;
            if (cutVideoBottomBarViewModel == null) {
                o.LJIJI("bottomBarViewModel");
                throw null;
            }
            selectNonNullSubscribe(cutVideoBottomBarViewModel, new TBT() { // from class: X.I5M
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((CutVideoBottomBarState) obj).getSelectTime();
                }
            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 42));
            CutVideoEditViewModel cutVideoEditViewModel = this.LJLLJ;
            if (cutVideoEditViewModel == null) {
                o.LJIJI("cutVideoEditViewModel");
                throw null;
            }
            selectNonNullSubscribe(cutVideoEditViewModel, new TBT() { // from class: X.I4S
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((CutVideoEditState) obj).isEditVideoLength();
                }
            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 45));
            return;
        }
        o.LJIJI("videoEditViewModel");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJLJ = (CutVideoViewModel) C0JT.LIZIZ((ActivityC45651qj) activity, CutVideoViewModel.class, "of(activity as FragmentA…deoViewModel::class.java)");
        show((WM7) this.LJLILLLLZI.getValue());
        show((WM7) this.LJLJI.getValue());
        CutVideoViewModel cutVideoViewModel = this.LJLJLJ;
        if (cutVideoViewModel != null) {
            if (cutVideoViewModel.Ov0()) {
                show(LLJILJIL());
                show((WM7) this.LJLJJLL.getValue());
                LLJILJILJ().LJLLILLLL = C78885Uxd.LIZIZ(true, false, false, false);
                return;
            } else {
                show((WM7) this.LJLJJI.getValue());
                show((WM7) this.LJLJJLL.getValue());
                return;
            }
        }
        o.LJIJI("cutVideoViewModel");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cbt, viewGroup, false, "null cannot be cast to non-null type android.widget.FrameLayout");
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
