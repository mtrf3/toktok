package X;

import Y.AObserverS75S0100000_7;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I4y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46036I4y extends AbstractC143775kb implements InterfaceC143795kd {
    public final boolean LJLIL;
    public VECutVideoPresenter LJLILLLLZI;
    public I50 LJLJI;
    public TextView LJLJJI;
    public FrameLayout LJLJJL;
    public final C6HV LJLJJLL;
    public VideoEditViewModel LJLJL;
    public VEVideoCutterViewModel LJLJLJ;
    public CutVideoBottomBarViewModel LJLJLLL;
    public CutMultiVideoViewModel LJLL;
    public CutVideoViewModel LJLLI;
    public CutVideoEditViewModel LJLLILLLL;
    public CutVideoListViewModel LJLLJ;
    public CutVideoSpeedViewModel LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public Boolean LJLZ;
    public String LJZ;
    public final boolean LJZI;
    public long LJZL;

    public C46036I4y() {
        this(false, 3);
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

    public final VECutVideoPresenter LLJILJIL() {
        VECutVideoPresenter vECutVideoPresenter = this.LJLILLLLZI;
        if (vECutVideoPresenter != null) {
            return vECutVideoPresenter;
        }
        o.LJIJI("presenter");
        throw null;
    }

    public final I50 LLJILJILJ() {
        I50 i50 = this.LJLJI;
        if (i50 != null) {
            return i50;
        }
        o.LJIJI("videoEditView");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        VideoEditViewModel videoEditViewModel = this.LJLJL;
        if (videoEditViewModel != null) {
            videoEditViewModel.LJLIL.observe(this, new AObserverS75S0100000_7(this, 81));
            VideoEditViewModel videoEditViewModel2 = this.LJLJL;
            if (videoEditViewModel2 != null) {
                videoEditViewModel2.LJLILLLLZI.observe(this, new AObserverS75S0100000_7(this, 86));
                VideoEditViewModel videoEditViewModel3 = this.LJLJL;
                if (videoEditViewModel3 != null) {
                    videoEditViewModel3.LJLJJI.observe(this, new AObserverS75S0100000_7(this, 88));
                    VideoEditViewModel videoEditViewModel4 = this.LJLJL;
                    if (videoEditViewModel4 != null) {
                        videoEditViewModel4.LJLJI.observe(this, new AObserverS75S0100000_7(this, 90));
                        VideoEditViewModel videoEditViewModel5 = this.LJLJL;
                        if (videoEditViewModel5 != null) {
                            videoEditViewModel5.LJLJJLL.observe(this, new AObserverS75S0100000_7(this, 92));
                            VideoEditViewModel videoEditViewModel6 = this.LJLJL;
                            if (videoEditViewModel6 != null) {
                                videoEditViewModel6.LJLJJL.observe(this, new AObserverS75S0100000_7(this, 65));
                                VideoEditViewModel videoEditViewModel7 = this.LJLJL;
                                if (videoEditViewModel7 != null) {
                                    videoEditViewModel7.LJLJL.observe(this, new AObserverS75S0100000_7(this, 66));
                                    VideoEditViewModel videoEditViewModel8 = this.LJLJL;
                                    if (videoEditViewModel8 != null) {
                                        videoEditViewModel8.LJLL.observe(this, new AObserverS75S0100000_7(this, 67));
                                        VideoEditViewModel videoEditViewModel9 = this.LJLJL;
                                        if (videoEditViewModel9 != null) {
                                            videoEditViewModel9.LJZI.observe(this, new AObserverS75S0100000_7(this, 68));
                                            VideoEditViewModel videoEditViewModel10 = this.LJLJL;
                                            if (videoEditViewModel10 != null) {
                                                videoEditViewModel10.LJLLI.observe(this, new AObserverS75S0100000_7(this, 70));
                                                VideoEditViewModel videoEditViewModel11 = this.LJLJL;
                                                if (videoEditViewModel11 != null) {
                                                    videoEditViewModel11.LJLLILLLL.observe(this, new AObserverS75S0100000_7(this, 71));
                                                    VideoEditViewModel videoEditViewModel12 = this.LJLJL;
                                                    if (videoEditViewModel12 != null) {
                                                        videoEditViewModel12.LJLLJ.observe(this, new AObserverS75S0100000_7(this, 72));
                                                        VideoEditViewModel videoEditViewModel13 = this.LJLJL;
                                                        if (videoEditViewModel13 != null) {
                                                            videoEditViewModel13.LJLJLJ.observe(this, new AObserverS75S0100000_7(this, 74));
                                                            VideoEditViewModel videoEditViewModel14 = this.LJLJL;
                                                            if (videoEditViewModel14 != null) {
                                                                videoEditViewModel14.LJLJLLL.observe(this, new AObserverS75S0100000_7(this, 75));
                                                                CutVideoEditViewModel cutVideoEditViewModel = this.LJLLILLLL;
                                                                if (cutVideoEditViewModel == null) {
                                                                    o.LJIJI("cutVideoEditViewModel");
                                                                    throw null;
                                                                }
                                                                subscribeEvent(cutVideoEditViewModel, new TBT() { // from class: X.I4w
                                                                    @Override // X.TBT, X.TBZ, X.TBW
                                                                    public final Object get(Object obj) {
                                                                        return ((CutVideoEditState) obj).getUpdatePlayBoundaryEvent();
                                                                    }
                                                                }, new C73165SnZ<>(), new AqS189S0100000_7(this, 54));
                                                                CutVideoEditViewModel cutVideoEditViewModel2 = this.LJLLILLLL;
                                                                if (cutVideoEditViewModel2 == null) {
                                                                    o.LJIJI("cutVideoEditViewModel");
                                                                    throw null;
                                                                }
                                                                selectNonNullSubscribe(cutVideoEditViewModel2, new TBT() { // from class: X.I4x
                                                                    @Override // X.TBT, X.TBZ, X.TBW
                                                                    public final Object get(Object obj) {
                                                                        return ((CutVideoEditState) obj).getEditEnable();
                                                                    }
                                                                }, new C73165SnZ<>(), new AqS189S0100000_7(this, 58));
                                                                VideoEditViewModel videoEditViewModel15 = this.LJLJL;
                                                                if (videoEditViewModel15 != null) {
                                                                    videoEditViewModel15.LJZL.observe(this, new AObserverS75S0100000_7(this, 79));
                                                                    VideoEditViewModel videoEditViewModel16 = this.LJLJL;
                                                                    if (videoEditViewModel16 != null) {
                                                                        videoEditViewModel16.LL.observe(this, new AObserverS75S0100000_7(this, 84));
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
        o.LJIJI("videoEditViewModel");
        throw null;
    }

    public C46036I4y(boolean z, boolean z2) {
        boolean z3;
        this.LJLIL = z2;
        this.LJLJJLL = new C6HV(0L, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing, null);
        this.LJLZ = Boolean.FALSE;
        this.LJZ = "";
        if (z && H7G.LIZIZ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJZI = z3;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        Integer materialProvider;
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJL = (VideoEditViewModel) ViewModelProviders.of((ActivityC45651qj) activity).get(VideoEditViewModel.class);
        Activity activity2 = this.mActivity;
        o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJLJ = (VEVideoCutterViewModel) ViewModelProviders.of((ActivityC45651qj) activity2).get(VEVideoCutterViewModel.class);
        Activity activity3 = this.mActivity;
        o.LJII(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJLLL = (CutVideoBottomBarViewModel) C0JT.LIZIZ((ActivityC45651qj) activity3, CutVideoBottomBarViewModel.class, "of(activity as FragmentA…BarViewModel::class.java)");
        Activity activity4 = this.mActivity;
        o.LJII(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLLI = (CutVideoViewModel) C0JT.LIZIZ((ActivityC45651qj) activity4, CutVideoViewModel.class, "of(activity as FragmentA…deoViewModel::class.java)");
        Activity activity5 = this.mActivity;
        o.LJII(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLL = (CutMultiVideoViewModel) ViewModelProviders.of((ActivityC45651qj) activity5).get(CutMultiVideoViewModel.class);
        Activity activity6 = this.mActivity;
        o.LJII(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLLILLLL = (CutVideoEditViewModel) C0JT.LIZIZ((ActivityC45651qj) activity6, CutVideoEditViewModel.class, "JediViewModelProviders.o…ditViewModel::class.java]");
        Activity activity7 = this.mActivity;
        o.LJII(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLLJ = (CutVideoListViewModel) C0JT.LIZIZ((ActivityC45651qj) activity7, CutVideoListViewModel.class, "of(activity as FragmentA…istViewModel::class.java)");
        Activity activity8 = this.mActivity;
        o.LJII(activity8, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLLL = (CutVideoSpeedViewModel) C0JT.LIZIZ((ActivityC45651qj) activity8, CutVideoSpeedViewModel.class, "of(activity as FragmentA…eedViewModel::class.java)");
        View requireViewById = requireViewById(R.id.n41);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.videoEditView)");
        this.LJLJI = (I50) requireViewById;
        if ((LLJILJILJ() instanceof C82866Wfe) && this.LJLIL) {
            LLJILJILJ().setLayoutDirection(0);
        }
        CutVideoViewModel cutVideoViewModel = this.LJLLI;
        if (cutVideoViewModel != null) {
            C43585H8r Mv0 = cutVideoViewModel.Mv0();
            String str = Mv0.LIZIZ;
            ArrayList<MediaModel> arrayList = Mv0.LIZ;
            if (TextUtils.isEmpty(str) && arrayList.isEmpty()) {
                CutVideoViewModel cutVideoViewModel2 = this.LJLLI;
                if (cutVideoViewModel2 != null) {
                    cutVideoViewModel2.Pv0();
                } else {
                    o.LJIJI("cutVideoViewModel");
                    throw null;
                }
            } else {
                LLJILJILJ().setMaxVideoLength(C44689HgL.LIZJ());
                LLJILJILJ().LJLIL = true;
                if (Mv0.LJIILIIL) {
                    LLJILJILJ().LJLIL = false;
                    LLJILJILJ().setMaxVideoLength(Mv0.LJIILL);
                }
                if (Mv0.LJIILJJIL) {
                    LLJILJILJ().LJLIL = false;
                    LLJILJILJ().setMaxVideoLength(Mv0.LJIILL);
                }
                if (Mv0.LIZJ) {
                    LLJILJILJ().LJLIL = false;
                    LLJILJILJ().setMinVideoLength(1000L);
                    LLJILJILJ().setMaxVideoLength(5000L);
                    LLJILJILJ().setExtractFramesInRoughMode(false);
                } else if (Mv0.LJIJJLI || Mv0.LJIL) {
                    LLJILJILJ().LJLIL = false;
                    LLJILJILJ().setMinVideoLength(500L);
                    LibraryMaterialInfoSv libraryMaterialInfoSv = Mv0.LJJIJIIJIL;
                    if (libraryMaterialInfoSv == null || (materialProvider = libraryMaterialInfoSv.getMaterialProvider()) == null || materialProvider.intValue() != 2) {
                        CutVideoViewModel cutVideoViewModel3 = this.LJLLI;
                        if (cutVideoViewModel3 != null) {
                            j = cutVideoViewModel3.Mv0().LIZLLL;
                        } else {
                            o.LJIJI("cutVideoViewModel");
                            throw null;
                        }
                    } else {
                        CutVideoViewModel cutVideoViewModel4 = this.LJLLI;
                        if (cutVideoViewModel4 != null) {
                            j = Math.min(cutVideoViewModel4.Mv0().LIZLLL, 10000L);
                        } else {
                            o.LJIJI("cutVideoViewModel");
                            throw null;
                        }
                    }
                    LLJILJILJ().setMaxVideoLength(j);
                    CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLL;
                    if (cutMultiVideoViewModel != null) {
                        CutVideoViewModel cutVideoViewModel5 = this.LJLLI;
                        if (cutVideoViewModel5 != null) {
                            cutMultiVideoViewModel.LJLLLL = cutVideoViewModel5.Mv0().LJ;
                            LLJILJILJ().setExtractFramesInRoughMode(false);
                        } else {
                            o.LJIJI("cutVideoViewModel");
                            throw null;
                        }
                    } else {
                        o.LJIJI("cutMultiVideoViewModel");
                        throw null;
                    }
                } else if (Mv0.LJJ) {
                    LLJILJILJ().LJLIL = false;
                    LLJILJILJ().setMinVideoLength(1000L);
                    I50 LLJILJILJ = LLJILJILJ();
                    CutVideoViewModel cutVideoViewModel6 = this.LJLLI;
                    if (cutVideoViewModel6 != null) {
                        LLJILJILJ.setMaxVideoLength(cutVideoViewModel6.Mv0().LIZLLL);
                        CutMultiVideoViewModel cutMultiVideoViewModel2 = this.LJLL;
                        if (cutMultiVideoViewModel2 != null) {
                            CutVideoViewModel cutVideoViewModel7 = this.LJLLI;
                            if (cutVideoViewModel7 != null) {
                                cutMultiVideoViewModel2.LJLLLL = cutVideoViewModel7.Mv0().LJ;
                            } else {
                                o.LJIJI("cutVideoViewModel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("cutMultiVideoViewModel");
                            throw null;
                        }
                    } else {
                        o.LJIJI("cutVideoViewModel");
                        throw null;
                    }
                } else {
                    LLJILJILJ().setExtractFramesInRoughMode(true);
                }
                LLJILJILJ().setExtractFramesInRoughMode(true);
                if (!TextUtils.isEmpty(str)) {
                    I50 LLJILJILJ2 = LLJILJILJ();
                    ViewModelProvider LJIIIIZZ = C165706es.LJIIIIZZ(this, null, null, 6);
                    CutMultiVideoViewModel cutMultiVideoViewModel3 = this.LJLL;
                    if (cutMultiVideoViewModel3 != null) {
                        if (!LLJILJILJ2.LJFF(this, LJIIIIZZ, cutMultiVideoViewModel3, str)) {
                            CutVideoViewModel cutVideoViewModel8 = this.LJLLI;
                            if (cutVideoViewModel8 != null) {
                                cutVideoViewModel8.Pv0();
                            } else {
                                o.LJIJI("cutVideoViewModel");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("cutMultiVideoViewModel");
                        throw null;
                    }
                } else {
                    I50 LLJILJILJ3 = LLJILJILJ();
                    ViewModelProvider LJIIIIZZ2 = C165706es.LJIIIIZZ(this, null, null, 6);
                    CutMultiVideoViewModel cutMultiVideoViewModel4 = this.LJLL;
                    if (cutMultiVideoViewModel4 != null) {
                        LLJILJILJ3.LJI(this, LJIIIIZZ2, cutMultiVideoViewModel4, arrayList);
                        I50 LLJILJILJ4 = LLJILJILJ();
                        if (arrayList.size() <= 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        LLJILJILJ4.setEditViewHeight(z);
                    } else {
                        o.LJIJI("cutMultiVideoViewModel");
                        throw null;
                    }
                }
                CutVideoEditViewModel cutVideoEditViewModel = this.LJLLILLLL;
                if (cutVideoEditViewModel != null) {
                    cutVideoEditViewModel.LJLJJLL = LLJILJILJ().getEditState();
                    CutVideoViewModel cutVideoViewModel9 = this.LJLLI;
                    if (cutVideoViewModel9 != null) {
                        if (!cutVideoViewModel9.Ov0()) {
                            VideoEditViewModel videoEditViewModel = this.LJLJL;
                            if (videoEditViewModel != null) {
                                if (videoEditViewModel.hv0()) {
                                    CutVideoViewModel cutVideoViewModel10 = this.LJLLI;
                                    if (cutVideoViewModel10 != null) {
                                        if (cutVideoViewModel10.Mv0().LJIILIIL) {
                                            HC8.LIZJ = "prop_customized_video";
                                        }
                                        CutVideoViewModel cutVideoViewModel11 = this.LJLLI;
                                        if (cutVideoViewModel11 != null) {
                                            if (!cutVideoViewModel11.Mv0().LIZJ) {
                                                VideoEditViewModel videoEditViewModel2 = this.LJLJL;
                                                if (videoEditViewModel2 != null) {
                                                    HC8.LIZJ(videoEditViewModel2.kv0());
                                                } else {
                                                    o.LJIJI("videoEditViewModel");
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            o.LJIJI("cutVideoViewModel");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("cutVideoViewModel");
                                        throw null;
                                    }
                                } else {
                                    CutVideoViewModel cutVideoViewModel12 = this.LJLLI;
                                    if (cutVideoViewModel12 != null) {
                                        cutVideoViewModel12.Pv0();
                                    } else {
                                        o.LJIJI("cutVideoViewModel");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("videoEditViewModel");
                                throw null;
                            }
                        }
                        this.LJLLLLLL = Mv0.LJIIZILJ.getCreationId();
                        this.LJLLLL = Mv0.LJIIL;
                        this.LJLZ = Boolean.valueOf(Mv0.LJJ);
                        this.LJZ = Mv0.LJJI;
                    } else {
                        o.LJIJI("cutVideoViewModel");
                        throw null;
                    }
                } else {
                    o.LJIJI("cutVideoEditViewModel");
                    throw null;
                }
            }
            if (this.LJZI) {
                View requireViewById2 = requireViewById(R.id.jmy);
                o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.self_adaption_toast)");
                this.LJLJJI = (TextView) requireViewById2;
                View requireViewById3 = requireViewById(R.id.v0);
                o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.adaption_toast_layout)");
                this.LJLJJL = (FrameLayout) requireViewById3;
                CutVideoViewModel cutVideoViewModel13 = this.LJLLI;
                if (cutVideoViewModel13 != null) {
                    if (!cutVideoViewModel13.Ov0()) {
                        Drawable LIZJ = C78127UlP.LIZJ(0, 1459617792, 0, SFS.LJI(2.0d));
                        TextView textView = this.LJLJJI;
                        if (textView != null) {
                            textView.setBackground(LIZJ);
                        } else {
                            o.LJIJI("selfAdaptionToast");
                            throw null;
                        }
                    }
                    ((AbstractViewOnTouchListenerC82865Wfd) LLJILJILJ()).setSelfAdaptiontoastAnimListener(new C46037I4z(this));
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

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C46036I4y(boolean r3, int r4) {
        /*
            r2 = this;
            r0 = r4 & 1
            if (r0 == 0) goto Le
            r1 = 1
        L5:
            r0 = r4 & 2
            if (r0 == 0) goto La
            r3 = 0
        La:
            r2.<init>(r1, r3)
            return
        Le:
            r1 = 0
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46036I4y.<init>(boolean, int):void");
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (this.LJZI) {
            View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cbp, container, false);
            o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…o_just, container, false)");
            return LLLLIILL;
        }
        View LLLLIILL2 = C16880lQ.LLLLIILL(inflater, R.layout.cbo, container, false);
        o.LJIIIIZZ(LLLLIILL2, "inflater.inflate(R.layou…o_edit, container, false)");
        return LLLLIILL2;
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
