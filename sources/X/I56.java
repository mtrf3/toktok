package X;

import Y.ACListenerS27S0100000_7;
import Y.AObserverS75S0100000_7;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.vesdk.VETimelineParams;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS11S0010000_6;
import kotlin.jvm.internal.AqS12S0010000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I56 extends AbstractC143775kb implements InterfaceC143795kd {
    public C46048I5k LJLIL;
    public VECutVideoPresenter LJLILLLLZI;
    public RecyclerView LJLJI;
    public I53 LJLJJI;
    public TextView LJLJJL;
    public View LJLJJLL;
    public FrameLayout LJLJL;
    public ImageView LJLJLJ;
    public ImageView LJLJLLL;
    public TextView LJLL;
    public FrameLayout LJLLI;
    public CutMultiVideoViewModel LJLLILLLL;
    public VideoEditViewModel LJLLJ;
    public CutVideoViewModel LJLLL;
    public VEVideoCutterViewModel LJLLLL;
    public CutVideoSpeedViewModel LJLLLLLL;
    public CutVideoBottomBarViewModel LJLZ;
    public CutVideoTitleBarViewModel LJZ;
    public CutVideoEditViewModel LJZI;
    public CutVideoPreviewViewModel LJZL;
    public CutVideoListViewModel LL;
    public boolean LLD;
    public boolean LLF;
    public View LLFF;
    public C15070iV<Integer, Integer> LLFFF;
    public AnimatorSet LLFII;
    public boolean LLFZ;
    public int LLI;
    public boolean LLII;
    public C46051I5n LLIIIILZ;
    public boolean LLIFFJFJJ = true;
    public final boolean LLIIII = true;

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

    public final VECutVideoPresenter LLJILJILJ() {
        VECutVideoPresenter vECutVideoPresenter = this.LJLILLLLZI;
        if (vECutVideoPresenter != null) {
            return vECutVideoPresenter;
        }
        o.LJIJI("presenter");
        throw null;
    }

    public final RecyclerView LLJJ() {
        RecyclerView recyclerView = this.LJLJI;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("videoRecyclerView");
        throw null;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        AnimatorSet animatorSet = this.LLFII;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C46051I5n c46051I5n = this.LLIIIILZ;
        if (c46051I5n != null) {
            ValueAnimator valueAnimator = c46051I5n.LJI;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = c46051I5n.LJI;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
    }

    public final void LLJILJIL(boolean z) {
        if (this.LLII) {
            return;
        }
        CutVideoEditViewModel cutVideoEditViewModel = this.LJZI;
        if (cutVideoEditViewModel != null) {
            boolean z2 = !z;
            cutVideoEditViewModel.setState(new AqS12S0010000_7(z2, 27));
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.LJZ;
            if (cutVideoTitleBarViewModel != null) {
                cutVideoTitleBarViewModel.Mv0(z2);
                CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.LJZ;
                if (cutVideoTitleBarViewModel2 != null) {
                    cutVideoTitleBarViewModel2.setState(new AqS12S0010000_7(z2, 29));
                    CutVideoPreviewViewModel cutVideoPreviewViewModel = this.LJZL;
                    if (cutVideoPreviewViewModel != null) {
                        cutVideoPreviewViewModel.setState(new AqS12S0010000_7(z2, 32));
                        return;
                    } else {
                        o.LJIJI("previewViewModel");
                        throw null;
                    }
                }
                o.LJIJI("titleBarViewModel");
                throw null;
            }
            o.LJIJI("titleBarViewModel");
            throw null;
        }
        o.LJIJI("cutVideoEditViewModel");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        VideoEditViewModel videoEditViewModel = this.LJLLJ;
        if (videoEditViewModel != null) {
            videoEditViewModel.LLFFF = new I5U(this);
            videoEditViewModel.LJLLL.observe(this, new AObserverS75S0100000_7(this, 78));
            VideoEditViewModel videoEditViewModel2 = this.LJLLJ;
            if (videoEditViewModel2 != null) {
                videoEditViewModel2.LJLLLL.observe(this, new AObserverS75S0100000_7(this, 80));
                VideoEditViewModel videoEditViewModel3 = this.LJLLJ;
                if (videoEditViewModel3 != null) {
                    videoEditViewModel3.LJLLLLLL.observe(this, new AObserverS75S0100000_7(this, 82));
                    VideoEditViewModel videoEditViewModel4 = this.LJLLJ;
                    if (videoEditViewModel4 != null) {
                        videoEditViewModel4.LJLZ.observe(this, new AObserverS75S0100000_7(this, 83));
                        CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLLILLLL;
                        if (cutMultiVideoViewModel != null) {
                            cutMultiVideoViewModel.LJLLI.observe(this, new AObserverS75S0100000_7(this, 85));
                            CutVideoListViewModel cutVideoListViewModel = this.LL;
                            if (cutVideoListViewModel == null) {
                                o.LJIJI("cutVideoListViewModel");
                                throw null;
                            }
                            subscribeEvent(cutVideoListViewModel, new TBT() { // from class: X.I5F
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((CutVideoListState) obj).getDeleteSegEvent();
                                }
                            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 66));
                            CutVideoListViewModel cutVideoListViewModel2 = this.LL;
                            if (cutVideoListViewModel2 == null) {
                                o.LJIJI("cutVideoListViewModel");
                                throw null;
                            }
                            subscribeEvent(cutVideoListViewModel2, new TBT() { // from class: X.I5G
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((CutVideoListState) obj).getUpdateSpeedCheckEvent();
                                }
                            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 50));
                            CutVideoListViewModel cutVideoListViewModel3 = this.LL;
                            if (cutVideoListViewModel3 == null) {
                                o.LJIJI("cutVideoListViewModel");
                                throw null;
                            }
                            selectNonNullSubscribe(cutVideoListViewModel3, new TBT() { // from class: X.I5D
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((CutVideoListState) obj).getSaveEnable();
                                }
                            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 52));
                            CutVideoListViewModel cutVideoListViewModel4 = this.LL;
                            if (cutVideoListViewModel4 == null) {
                                o.LJIJI("cutVideoListViewModel");
                                throw null;
                            }
                            selectNonNullSubscribe(cutVideoListViewModel4, new TBT() { // from class: X.I5E
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((CutVideoListState) obj).getCancelEnable();
                                }
                            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 55));
                            ImageView imageView = this.LJLJLJ;
                            if (imageView != null) {
                                C16880lQ.LJIILLIIL(imageView, new ACListenerS27S0100000_7(this, 102));
                                ImageView imageView2 = this.LJLJLLL;
                                if (imageView2 != null) {
                                    C16880lQ.LJIILLIIL(imageView2, new ACListenerS27S0100000_7(this, 103));
                                    return;
                                } else {
                                    o.LJIJI("ivCancel");
                                    throw null;
                                }
                            }
                            o.LJIJI("ivSave");
                            throw null;
                        }
                        o.LJIJI("cutMultiVideoViewModel");
                        throw null;
                    }
                    o.LJIJI("videoEditViewModel");
                    throw null;
                }
                o.LJIJI("videoEditViewModel");
                throw null;
            }
            o.LJIJI("videoEditViewModel");
            throw null;
        }
        o.LJIJI("videoEditViewModel");
        throw null;
    }

    public final void LLJJI(boolean z, boolean z2) {
        VideoSegment videoSegment;
        C46048I5k c46048I5k;
        if (z2 && (c46048I5k = this.LJLIL) != null && c46048I5k.LLD().size() == 0) {
            CutVideoViewModel cutVideoViewModel = this.LJLLL;
            if (cutVideoViewModel != null) {
                cutVideoViewModel.Pv0();
                return;
            } else {
                o.LJIJI("cutVideoViewModel");
                throw null;
            }
        }
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.LJZ;
        if (cutVideoTitleBarViewModel != null) {
            cutVideoTitleBarViewModel.setState(new AqS12S0010000_7(true, 30));
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.LJZ;
            if (cutVideoTitleBarViewModel2 != null) {
                cutVideoTitleBarViewModel2.setState(new AqS12S0010000_7(true, 31));
                CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.LJLZ;
                if (cutVideoBottomBarViewModel != null) {
                    cutVideoBottomBarViewModel.setState(new AqS12S0010000_7(false, 21));
                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.LJLZ;
                    if (cutVideoBottomBarViewModel2 != null) {
                        cutVideoBottomBarViewModel2.setState(new AqS12S0010000_7(false, 18));
                        CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.LJLZ;
                        if (cutVideoBottomBarViewModel3 != null) {
                            cutVideoBottomBarViewModel3.setState(new AqS12S0010000_7(false, 28));
                            CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = this.LJLZ;
                            if (cutVideoBottomBarViewModel4 != null) {
                                cutVideoBottomBarViewModel4.setState(new AqS12S0010000_7(this.LLD, 23));
                                CutVideoSpeedViewModel cutVideoSpeedViewModel = this.LJLLLLLL;
                                if (cutVideoSpeedViewModel != null) {
                                    cutVideoSpeedViewModel.setState(new AqS11S0010000_6(false, 4));
                                    CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.LJLLLLLL;
                                    if (cutVideoSpeedViewModel2 != null) {
                                        cutVideoSpeedViewModel2.setVisible(this.LLD);
                                        if (this.LLD) {
                                            CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.LJLLLLLL;
                                            if (cutVideoSpeedViewModel3 != null) {
                                                VideoEditViewModel videoEditViewModel = this.LJLLJ;
                                                if (videoEditViewModel != null) {
                                                    EnumC82528WaC LIZIZ = C82848WfM.LIZIZ(videoEditViewModel.nv0());
                                                    o.LJIIIIZZ(LIZIZ, "fromValue(videoEditViewModel.totalSpeed)");
                                                    cutVideoSpeedViewModel3.Mv0(LIZIZ);
                                                } else {
                                                    o.LJIJI("videoEditViewModel");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("speedViewModel");
                                                throw null;
                                            }
                                        }
                                        VECutVideoPresenter LLJILJILJ = LLJILJILJ();
                                        C44503HdL c44503HdL = LLJILJILJ.LJZL;
                                        VideoEditViewModel videoEditViewModel2 = LLJILJILJ.LJZI;
                                        if (videoEditViewModel2 != null) {
                                            List<VideoSegment> kv0 = videoEditViewModel2.kv0();
                                            C44505HdN c44505HdN = c44503HdL.LIZ;
                                            if (c44505HdN != null && (videoSegment = c44505HdN.LIZLLL) != null) {
                                                VETimelineParams vETimelineParams = c44505HdN.LIZIZ;
                                                int i = c44505HdN.LIZJ;
                                                o.LJIIIZ(vETimelineParams, "<this>");
                                                vETimelineParams.speed[i] = videoSegment.LJIIIIZZ();
                                                vETimelineParams.vTrimIn[i] = (int) videoSegment.LJIIIZ();
                                                vETimelineParams.vTrimOut[i] = (int) videoSegment.LJ();
                                                vETimelineParams.rotate[i] = C44513HdV.LIZJ(videoSegment.rotate);
                                                if (kv0 != null) {
                                                    int i2 = 0;
                                                    for (VideoSegment videoSegment2 : kv0) {
                                                        int i3 = i2 + 1;
                                                        if (i2 >= 0) {
                                                            vETimelineParams.enable[i2] = !videoSegment2.isDeleted;
                                                            i2 = i3;
                                                        } else {
                                                            C47261Igj.LJJJJJ();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                                c44505HdN.LIZ.LLJJIJIL(c44505HdN.LIZIZ);
                                                C46046I5i.LIZIZ(c44505HdN, 0.0f, 0.0f, 0.0f, 30);
                                            }
                                            CutVideoEditViewModel cutVideoEditViewModel = this.LJZI;
                                            if (cutVideoEditViewModel != null) {
                                                cutVideoEditViewModel.setState(C46033I4v.LJLIL);
                                                if (z2) {
                                                    CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLLILLLL;
                                                    if (cutMultiVideoViewModel != null) {
                                                        cutMultiVideoViewModel.LJLIL.setValue(new C15070iV<>(0, 0));
                                                    } else {
                                                        o.LJIJI("cutMultiVideoViewModel");
                                                        throw null;
                                                    }
                                                }
                                                ImageView imageView = this.LJLJLJ;
                                                if (imageView != null) {
                                                    imageView.setVisibility(8);
                                                    ImageView imageView2 = this.LJLJLLL;
                                                    if (imageView2 != null) {
                                                        imageView2.setVisibility(8);
                                                        FrameLayout frameLayout = this.LJLJL;
                                                        if (frameLayout != null) {
                                                            frameLayout.setVisibility(8);
                                                            TextView textView = this.LJLJJL;
                                                            if (textView != null) {
                                                                textView.setVisibility(0);
                                                                LLJJ().setVisibility(0);
                                                                TextView textView2 = this.LJLL;
                                                                if (textView2 != null) {
                                                                    textView2.setVisibility(4);
                                                                    if (this.LLFF != null && this.LLFFF != null) {
                                                                        LLJJ().getRootView().getViewTreeObserver().addOnPreDrawListener(new I59(this, z2));
                                                                    }
                                                                    CutVideoPreviewViewModel cutVideoPreviewViewModel = this.LJZL;
                                                                    if (cutVideoPreviewViewModel != null) {
                                                                        cutVideoPreviewViewModel.setState(C46023I4l.LJLIL);
                                                                        HC8.LJ(false, z, !z, z2, false);
                                                                        return;
                                                                    } else {
                                                                        o.LJIJI("previewViewModel");
                                                                        throw null;
                                                                    }
                                                                }
                                                                o.LJIJI("singleEditTitle");
                                                                throw null;
                                                            }
                                                            o.LJIJI("tvVideoSegmentDes");
                                                            throw null;
                                                        }
                                                        o.LJIJI("singleEditLayout");
                                                        throw null;
                                                    }
                                                    o.LJIJI("ivCancel");
                                                    throw null;
                                                }
                                                o.LJIJI("ivSave");
                                                throw null;
                                            }
                                            o.LJIJI("cutVideoEditViewModel");
                                            throw null;
                                        }
                                        o.LJIJI("videoEditViewModel");
                                        throw null;
                                    }
                                    o.LJIJI("speedViewModel");
                                    throw null;
                                }
                                o.LJIJI("speedViewModel");
                                throw null;
                            }
                            o.LJIJI("bottomBarViewModel");
                            throw null;
                        }
                        o.LJIJI("bottomBarViewModel");
                        throw null;
                    }
                    o.LJIJI("bottomBarViewModel");
                    throw null;
                }
                o.LJIJI("bottomBarViewModel");
                throw null;
            }
            o.LJIJI("titleBarViewModel");
            throw null;
        }
        o.LJIJI("titleBarViewModel");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.lyk);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.tvVideoSegmentDes)");
        this.LJLJJL = (TextView) requireViewById;
        View requireViewById2 = requireViewById(R.id.n45);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.videoRecyclerView)");
        this.LJLJI = (RecyclerView) requireViewById2;
        View requireViewById3 = requireViewById(R.id.a51);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.animTabDot)");
        this.LJLJJLL = requireViewById3;
        View requireViewById4 = requireViewById(R.id.k0n);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.singleEditLayout)");
        this.LJLJL = (FrameLayout) requireViewById4;
        View requireViewById5 = requireViewById(R.id.ewz);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.ivSave)");
        this.LJLJLJ = (ImageView) requireViewById5;
        View requireViewById6 = requireViewById(R.id.evz);
        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.ivCancel)");
        this.LJLJLLL = (ImageView) requireViewById6;
        View requireViewById7 = requireViewById(R.id.k0q);
        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.single_edit_title)");
        this.LJLL = (TextView) requireViewById7;
        View requireViewById8 = requireViewById(R.id.aqx);
        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.bottom_recyle_view)");
        this.LJLLI = (FrameLayout) requireViewById8;
        TextView textView = this.LJLJJL;
        C46048I5k c46048I5k = null;
        if (textView != null) {
            textView.setShadowLayer(2.0f, 0.0f, 0.0f, C04330Ez.LIZIZ(view.getContext(), R.color.ce));
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 80;
            view.setLayoutParams(layoutParams2);
            Activity activity = this.mActivity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LJLLILLLL = (CutMultiVideoViewModel) ViewModelProviders.of((ActivityC45651qj) activity).get(CutMultiVideoViewModel.class);
            Activity activity2 = this.mActivity;
            o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LJLLJ = (VideoEditViewModel) ViewModelProviders.of((ActivityC45651qj) activity2).get(VideoEditViewModel.class);
            Activity activity3 = this.mActivity;
            o.LJII(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LJLLL = (CutVideoViewModel) C0JT.LIZIZ((ActivityC45651qj) activity3, CutVideoViewModel.class, "JediViewModelProviders.o…deoViewModel::class.java]");
            Activity activity4 = this.mActivity;
            o.LJII(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LJLLLL = (VEVideoCutterViewModel) ViewModelProviders.of((ActivityC45651qj) activity4).get(VEVideoCutterViewModel.class);
            Activity activity5 = this.mActivity;
            o.LJII(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LJLLLLLL = (CutVideoSpeedViewModel) C0JT.LIZIZ((ActivityC45651qj) activity5, CutVideoSpeedViewModel.class, "of(activity as FragmentA…eedViewModel::class.java)");
            Activity activity6 = this.mActivity;
            o.LJII(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LJLZ = (CutVideoBottomBarViewModel) C0JT.LIZIZ((ActivityC45651qj) activity6, CutVideoBottomBarViewModel.class, "of(activity as FragmentA…BarViewModel::class.java)");
            Activity activity7 = this.mActivity;
            o.LJII(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LJZ = (CutVideoTitleBarViewModel) C0JT.LIZIZ((ActivityC45651qj) activity7, CutVideoTitleBarViewModel.class, "of(activity as FragmentA…BarViewModel::class.java)");
            Activity activity8 = this.mActivity;
            o.LJII(activity8, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LJZI = (CutVideoEditViewModel) C0JT.LIZIZ((ActivityC45651qj) activity8, CutVideoEditViewModel.class, "of(activity as FragmentA…ditViewModel::class.java)");
            Activity activity9 = this.mActivity;
            o.LJII(activity9, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LJZL = (CutVideoPreviewViewModel) C0JT.LIZIZ((ActivityC45651qj) activity9, CutVideoPreviewViewModel.class, "of(activity as FragmentA…iewViewModel::class.java)");
            Activity activity10 = this.mActivity;
            o.LJII(activity10, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LL = (CutVideoListViewModel) C0JT.LIZIZ((ActivityC45651qj) activity10, CutVideoListViewModel.class, "of(activity as FragmentA…istViewModel::class.java)");
            FrameLayout frameLayout = this.LJLLI;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                Activity requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                VideoEditViewModel videoEditViewModel = this.LJLLJ;
                if (videoEditViewModel != null) {
                    CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLLILLLL;
                    if (cutMultiVideoViewModel != null) {
                        C46051I5n c46051I5n = new C46051I5n(requireActivity, this, videoEditViewModel, cutMultiVideoViewModel);
                        this.LLIIIILZ = c46051I5n;
                        RecyclerView LLJJ = LLJJ();
                        View view2 = this.LJLJJLL;
                        if (view2 != null) {
                            c46051I5n.LIZ(LLJJ, view2, new C46058I5u(false, true, true), new I52(this));
                            AbstractC029409q adapter = LLJJ().getAdapter();
                            if (adapter instanceof C46048I5k) {
                                c46048I5k = (C46048I5k) adapter;
                            }
                            this.LJLIL = c46048I5k;
                            return;
                        }
                        o.LJIJI("animTabDot");
                        throw null;
                    }
                    o.LJIJI("cutMultiVideoViewModel");
                    throw null;
                }
                o.LJIJI("videoEditViewModel");
                throw null;
            }
            o.LJIJI("recyclerViewLayout");
            throw null;
        }
        o.LJIJI("tvVideoSegmentDes");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cbq, viewGroup, false, "inflater.inflate(R.layou…o_list, container, false)");
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
