package X;

import Y.AObserverS75S0100000_7;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchIntroduceViewModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchState;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I3s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46004I3s extends AbstractC151235wd implements InterfaceC143795kd, I53, InterfaceC44501HdJ {
    public final CreativeInfo LJLIL;
    public CutVideoViewModel LJLILLLLZI;
    public CutVideoPreviewViewModel LJLJI;
    public CutVideoTitleBarViewModel LJLJJI;
    public VideoEditViewModel LJLJJL;
    public StitchIntroduceViewModel LJLJJLL;
    public VEVideoCutterViewModel LJLJL;
    public ProgressDialogC173686rk LJLJLJ;
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 429));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 430));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 426));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 427));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 428));

    @Override // X.InterfaceC44501HdJ
    public final LifecycleOwner LJJJJLI() {
        return this;
    }

    @Override // X.InterfaceC44501HdJ
    public final void LJLLILLLL() {
    }

    @Override // X.InterfaceC44501HdJ
    public final int LL() {
        return 0;
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
        return ((C46017I4f) this.LJLJLLL.getValue()).LLJILJILJ();
    }

    @Override // X.I53
    public final int LJJZZIII() {
        return ((C46017I4f) this.LJLJLLL.getValue()).LLJILJILJ().getMeasuredWidth();
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
        return ((C46017I4f) this.LJLJLLL.getValue()).LLJILJILJ().getMeasuredHeight();
    }

    @Override // X.InterfaceC44501HdJ
    public final ActivityC45651qj LLJ() {
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (ActivityC45651qj) activity;
    }

    public final C46008I3w LLJILJIL() {
        return (C46008I3w) this.LJLLI.getValue();
    }

    public final VECutVideoPresenter LLJILJILJ() {
        return (VECutVideoPresenter) this.LJLLJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLJJI() {
        long longValue;
        boolean z;
        String str;
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.LJLJJI;
        if (cutVideoTitleBarViewModel != null) {
            cutVideoTitleBarViewModel.Mv0(true);
            C135115Rz.LIZ(this.LJLJLJ);
            int i = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            LLJJ(false);
            if (C41877Gc5.LIZ.LIZIZ()) {
                H7B.LIZJ("stitch trim end, go to shoot fail, App in background");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("shoot_mode", 12);
            CutVideoViewModel cutVideoViewModel = this.LJLILLLLZI;
            if (cutVideoViewModel != null) {
                StitchParams stitchParams = cutVideoViewModel.Mv0().LJJIIZI;
                if (stitchParams == null) {
                    long j = 0;
                    Object[] objArr8 = objArr7 == true ? 1 : 0;
                    Object[] objArr9 = objArr6 == true ? 1 : 0;
                    Object[] objArr10 = objArr5 == true ? 1 : 0;
                    Object[] objArr11 = objArr4 == true ? 1 : 0;
                    Object[] objArr12 = objArr3 == true ? 1 : 0;
                    Object[] objArr13 = objArr2 == true ? 1 : 0;
                    Object[] objArr14 = objArr == true ? 1 : 0;
                    stitchParams = new StitchParams(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, objArr8, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr9, objArr10, j, j, objArr11, objArr12, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr13, objArr14, 8388607, 0 == true ? 1 : 0);
                }
                Long l = LJJJ().getPlayBoundary().LIZ;
                long j2 = 0;
                if (l == null) {
                    longValue = 0;
                } else {
                    longValue = l.longValue();
                }
                stitchParams.setStartTime(longValue);
                Long l2 = LJJJ().getPlayBoundary().LIZIZ;
                if (l2 != null) {
                    j2 = l2.longValue();
                }
                stitchParams.setEndTime(j2);
                if (stitchParams.isPGCMusic()) {
                    String creationId = this.LJLIL.getCreationId();
                    if (creationId == null) {
                        creationId = "";
                    }
                    long duration = stitchParams.getDuration();
                    long leftSeekingValue = LLJILJIL().LJJJ().getLeftSeekingValue();
                    if (stitchParams.getMusicStart() >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("shoot_way", "stitch");
                    c145995oB.LJI("enter_from", "video_stitch_page");
                    c145995oB.LJI("creation_id", creationId);
                    c145995oB.LJI("content_source", "shoot");
                    c145995oB.LJI("content_type", "video");
                    if (z) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c145995oB.LJI("pgc_stitched", str);
                    c145995oB.LIZIZ(duration, "duration");
                    c145995oB.LIZIZ(leftSeekingValue, "duration_begin_at");
                    FMX.LJIIL("stitch_next", c145995oB.LIZ);
                } else {
                    String creationId2 = this.LJLIL.getCreationId();
                    if (creationId2 == null) {
                        creationId2 = "";
                    }
                    long duration2 = stitchParams.getDuration();
                    long leftSeekingValue2 = LLJILJIL().LJJJ().getLeftSeekingValue();
                    C145995oB c145995oB2 = new C145995oB();
                    c145995oB2.LJI("shoot_way", "stitch");
                    c145995oB2.LJI("enter_from", "video_stitch_page");
                    c145995oB2.LJI("creation_id", creationId2);
                    c145995oB2.LJI("content_source", "shoot");
                    c145995oB2.LJI("content_type", "video");
                    c145995oB2.LIZIZ(duration2, "duration");
                    c145995oB2.LIZIZ(leftSeekingValue2, "duration_begin_at");
                    FMX.LJIIL("stitch_next", c145995oB2.LIZ);
                }
                if (!stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
                    I9T.LJFF(null);
                }
                intent.putExtra("enter_from", "video_stitch_page");
                intent.putExtra("music_origin", "stitch");
                C77412UZs.LJJIJIL(intent, this.LJLIL);
                intent.putExtra("shoot_way", "stitch");
                intent.putExtra("content_type", "video");
                intent.putExtra("content_source", "shoot");
                intent.putExtra("stitch_params", (Parcelable) stitchParams);
                intent.putExtra("enter_record_from_feed", stitchParams.getEnterRecordFromFeed());
                CutVideoViewModel cutVideoViewModel2 = this.LJLILLLLZI;
                if (cutVideoViewModel2 != null) {
                    DuetAndStitchRouterConfig duetAndStitchRouterConfig = cutVideoViewModel2.Mv0().LJIJ.initialModel.duetAndStitchRouterConfig;
                    if (duetAndStitchRouterConfig != null) {
                        intent.putExtra("duet_and_stitch_router_config", duetAndStitchRouterConfig);
                    }
                    intent.putExtra("aweme_music", stitchParams.getMusic());
                    Activity activity = this.mActivity;
                    if (activity == null) {
                        return;
                    }
                    HZV.LIZ().LJIL(activity, 1002, intent);
                    return;
                }
                o.LJIJI("cutVideoViewModel");
                throw null;
            }
            o.LJIJI("cutVideoViewModel");
            throw null;
        }
        o.LJIJI("titleBarViewModel");
        throw null;
    }

    @Override // X.InterfaceC44501HdJ
    public final void LJIILJJIL() {
        LLJILJIL().LJJJ().LJII();
    }

    @Override // X.InterfaceC44501HdJ
    public final void LJJIJIIJI() {
        LLJILJIL().LLJILJILJ().getClass();
    }

    @Override // X.I53
    public final I50 LJJJ() {
        return LLJILJIL().LJJJ();
    }

    @Override // X.InterfaceC44501HdJ
    public final long LLIIIL() {
        return LLJILJIL().LJJJ().getMaxCutDuration();
    }

    @Override // X.InterfaceC44501HdJ
    public final C15070iV<Long, Long> LLIIZ() {
        C15070iV<Long, Long> playBoundary = LLJILJIL().LJJJ().getPlayBoundary();
        o.LJIIIIZZ(playBoundary, "bottomScene.getVideoEditView().playBoundary");
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

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        if (C1537461q.LIZ.getBoolean("stitch_introduce_shown", false)) {
            StitchIntroduceViewModel stitchIntroduceViewModel = this.LJLJJLL;
            if (stitchIntroduceViewModel != null) {
                stitchIntroduceViewModel.Mv0();
                return;
            } else {
                o.LJIJI("stitchViewModel");
                throw null;
            }
        }
        StitchIntroduceViewModel stitchIntroduceViewModel2 = this.LJLJJLL;
        if (stitchIntroduceViewModel2 != null) {
            stitchIntroduceViewModel2.setState(I4N.LJLIL);
        } else {
            o.LJIJI("stitchViewModel");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
    }

    public C46004I3s(CreativeInfo creativeInfo) {
        this.LJLIL = creativeInfo;
    }

    public static final void LLJJ(boolean z) {
        GGO ggo;
        if (z) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(1109, ggo, EnumC42283Gid.PROGRESS_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ViewModelProviders.of((ActivityC45651qj) activity).get(CutMultiVideoViewModel.class);
        Activity activity2 = this.mActivity;
        o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJI = (CutVideoPreviewViewModel) C0JT.LIZIZ((ActivityC45651qj) activity2, CutVideoPreviewViewModel.class, "of(activity as FragmentA…iewViewModel::class.java)");
        Activity activity3 = this.mActivity;
        o.LJII(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJJI = (CutVideoTitleBarViewModel) C0JT.LIZIZ((ActivityC45651qj) activity3, CutVideoTitleBarViewModel.class, "of(activity as FragmentA…BarViewModel::class.java)");
        Activity activity4 = this.mActivity;
        o.LJII(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C0JT.LIZIZ((ActivityC45651qj) activity4, CutVideoBottomBarViewModel.class, "of(activity as FragmentA…BarViewModel::class.java)");
        Activity activity5 = this.mActivity;
        o.LJII(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        VideoEditViewModel videoEditViewModel = (VideoEditViewModel) ViewModelProviders.of((ActivityC45651qj) activity5).get(VideoEditViewModel.class);
        this.LJLJJL = videoEditViewModel;
        if (videoEditViewModel != null) {
            Activity activity6 = this.mActivity;
            o.LJII(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LJLJJLL = (StitchIntroduceViewModel) C0JT.LIZIZ((ActivityC45651qj) activity6, StitchIntroduceViewModel.class, "of(activity as FragmentA…uceViewModel::class.java)");
            Activity activity7 = this.mActivity;
            o.LJII(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LJLJL = (VEVideoCutterViewModel) ViewModelProviders.of((ActivityC45651qj) activity7).get(VEVideoCutterViewModel.class);
            CutVideoViewModel cutVideoViewModel = this.LJLILLLLZI;
            if (cutVideoViewModel == null) {
                o.LJIJI("cutVideoViewModel");
                throw null;
            }
            subscribeEvent(cutVideoViewModel, new TBT() { // from class: X.I4D
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((CutVideoState) obj).getQuitEvent();
                }
            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 27));
            CutVideoViewModel cutVideoViewModel2 = this.LJLILLLLZI;
            if (cutVideoViewModel2 == null) {
                o.LJIJI("cutVideoViewModel");
                throw null;
            }
            subscribeEvent(cutVideoViewModel2, new TBT() { // from class: X.I4F
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((CutVideoState) obj).getNextEvent();
                }
            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 28));
            StitchIntroduceViewModel stitchIntroduceViewModel = this.LJLJJLL;
            if (stitchIntroduceViewModel == null) {
                o.LJIJI("stitchViewModel");
                throw null;
            }
            subscribeEvent(stitchIntroduceViewModel, new TBT() { // from class: X.I4O
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((StitchState) obj).getShowIntroduceEvent();
                }
            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 29));
            StitchIntroduceViewModel stitchIntroduceViewModel2 = this.LJLJJLL;
            if (stitchIntroduceViewModel2 == null) {
                o.LJIJI("stitchViewModel");
                throw null;
            }
            subscribeEvent(stitchIntroduceViewModel2, new TBT() { // from class: X.I4P
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((StitchState) obj).getHideIntroduceEvent();
                }
            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 30));
            StitchIntroduceViewModel stitchIntroduceViewModel3 = this.LJLJJLL;
            if (stitchIntroduceViewModel3 == null) {
                o.LJIJI("stitchViewModel");
                throw null;
            }
            subscribeEvent(stitchIntroduceViewModel3, new TBT() { // from class: X.I4L
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((StitchState) obj).getQuitEvent();
                }
            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 26));
            VideoEditViewModel videoEditViewModel2 = this.LJLJJL;
            if (videoEditViewModel2 != null) {
                videoEditViewModel2.LJLJL.observe(this, new AObserverS75S0100000_7(this, 52));
                VideoEditViewModel videoEditViewModel3 = this.LJLJJL;
                if (videoEditViewModel3 != null) {
                    videoEditViewModel3.LJLL.observe(this, new AObserverS75S0100000_7(this, 53));
                    return;
                } else {
                    o.LJIJI("videoEditViewModel");
                    throw null;
                }
            }
            o.LJIJI("videoEditViewModel");
            throw null;
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
        this.LJLILLLLZI = (CutVideoViewModel) C0JT.LIZIZ((ActivityC45651qj) activity, CutVideoViewModel.class, "of(activity as FragmentA…deoViewModel::class.java)");
        show((WM7) this.LJLJLLL.getValue());
        show((WM7) this.LJLL.getValue());
        show(LLJILJIL());
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ceb, viewGroup, false, "null cannot be cast to non-null type android.widget.FrameLayout");
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
