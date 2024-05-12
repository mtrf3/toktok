package X;

import Y.ARunnableS43S0100000_7;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I3u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46006I3u extends AbstractC151235wd implements InterfaceC143795kd {
    public VECutVideoPresenter LJLIL;
    public I53 LJLILLLLZI;
    public VideoEditViewModel LJLJI;
    public CutVideoPreviewViewModel LJLJJI;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 516));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 517));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 515));

    public final void LLJJ() {
        List<VideoSegment> videoSegmentList;
        if (!C142455iT.LIZ(true)) {
            return;
        }
        if (H7G.LIZIZ() || LLJILJIL().LLJILJILJ().getMaxCutDuration() < 60000) {
            VideoEditViewModel videoEditViewModel = this.LJLJI;
            if (videoEditViewModel != null) {
                CutVideoContext value = videoEditViewModel.LLD.getValue();
                if (value != null && (videoSegmentList = value.getVideoSegmentList()) != null) {
                    ArrayList arrayList = new ArrayList(C32I.LJJL(videoSegmentList, 10));
                    Iterator<VideoSegment> it = videoSegmentList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(it.next().duration));
                    }
                    if (ORZ.LLILLJJLI(arrayList) > 60000) {
                        LLJILJIL().LLJILJILJ().post(new ARunnableS43S0100000_7(this, 118));
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("videoEditViewModel");
            throw null;
        }
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

    public final C46036I4y LLJILJIL() {
        return (C46036I4y) this.LJLJJL.getValue();
    }

    public final I56 LLJILJILJ() {
        return (I56) this.LJLJJLL.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJI = (VideoEditViewModel) ViewModelProviders.of((ActivityC45651qj) activity).get(VideoEditViewModel.class);
        Activity activity2 = this.mActivity;
        o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ViewModelProviders.of((ActivityC45651qj) activity2).get(VEVideoCutterViewModel.class);
        Activity activity3 = this.mActivity;
        o.LJII(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJJI = (CutVideoPreviewViewModel) C0JT.LIZIZ((ActivityC45651qj) activity3, CutVideoPreviewViewModel.class, "of(activity as FragmentA…iewViewModel::class.java)");
        show((WM7) this.LJLJL.getValue());
        show(LLJILJIL());
        show(LLJILJILJ());
        LLJJ();
        VideoEditViewModel videoEditViewModel = this.LJLJI;
        if (videoEditViewModel != null) {
            HC8.LIZJ(videoEditViewModel.kv0());
        } else {
            o.LJIJI("videoEditViewModel");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        show((WM7) this.LJLJL.getValue());
        show(LLJILJIL());
        show(LLJILJILJ());
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C0JT.LIZIZ((ActivityC45651qj) activity, CutVideoViewModel.class, "JediViewModelProviders.o…deoViewModel::class.java]");
        Activity activity2 = this.mActivity;
        o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C0JT.LIZIZ((ActivityC45651qj) activity2, CutVideoListViewModel.class, "of(activity as FragmentA…istViewModel::class.java)");
        Activity activity3 = this.mActivity;
        o.LJII(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C0JT.LIZIZ((ActivityC45651qj) activity3, CutVideoMultiBottomViewModel.class, "of(activity as FragmentA…tomViewModel::class.java)");
        Activity activity4 = this.mActivity;
        o.LJII(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C0JT.LIZIZ((ActivityC45651qj) activity4, CutVideoEditViewModel.class, "of(activity as FragmentA…ditViewModel::class.java)");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cbr, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) LLLLIILL;
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
