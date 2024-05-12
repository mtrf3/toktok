package X;

import Y.ALAdapterS1S0100000_2;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.AqS106S0300000_2;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6F7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6F7 extends C6F2 implements InterfaceC143795kd {
    public final VideoPublishEditModel LJLILLLLZI;
    public final InterfaceC147355qN LJLJI;
    public C6F2 LJLJJI;
    public C6FP LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final Queue<InterfaceC88472Yns<C6F2, C76800UCe>> LJLJLJ;
    public final Queue<InterfaceC88472Yns<C6F2, C76800UCe>> LJLJLLL;

    @Override // X.C6F2
    public final void LLJJJIL() {
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

    @Override // X.C6F2
    public final InterfaceC150315v9 LLJJIII() {
        return (InterfaceC150315v9) this.LJLJL.getValue();
    }

    @Override // X.C6F2
    public final void LLJJJJ() {
        LLJLLL(new AqS168S0100000_2(this, 509), false);
    }

    @Override // X.C6F2
    public final void LLJJLIIIJLLLLLLLZ(InterfaceC147475qZ interfaceC147475qZ) {
        VideoEditContainerScene videoEditContainerScene;
        WM7 wm7 = this.mParentScene;
        if ((wm7 instanceof VideoEditContainerScene) && (videoEditContainerScene = (VideoEditContainerScene) wm7) != null) {
            videoEditContainerScene.LLIIJLIL = interfaceC147475qZ;
        }
    }

    @Override // X.C6F2
    public final void LLJLIL(C6FD c6fd) {
        this.LJLJJL = c6fd;
    }

    @Override // X.C6F2
    public final void LLJLILLLLZIIL(C137965bE stickerChallengeManager) {
        o.LJIIIZ(stickerChallengeManager, "stickerChallengeManager");
        LLJLLL(new AqS133S0200000_2(this, stickerChallengeManager, 119), true);
    }

    public final void LLJZIJLIL(boolean z) {
        if (this.LJLJJI == null) {
            return;
        }
        if (z) {
            while (!this.LJLJLJ.isEmpty()) {
                C6F2 c6f2 = this.LJLJJI;
                if (c6f2 != null) {
                    ((InterfaceC88472Yns) ((LinkedList) this.LJLJLJ).poll()).invoke(c6f2);
                }
            }
            return;
        }
        while (!this.LJLJLLL.isEmpty()) {
            C6F2 c6f22 = this.LJLJJI;
            if (c6f22 != null) {
                ((InterfaceC88472Yns) ((LinkedList) this.LJLJLLL).poll()).invoke(c6f22);
            }
        }
    }

    public C6F7(VideoPublishEditModel videoPublishEditModel, InterfaceC147355qN mVideoSizeProvider) {
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        o.LJIIIZ(mVideoSizeProvider, "mVideoSizeProvider");
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = mVideoSizeProvider;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 856));
        this.LJLIL = new InterfaceC145495nN() { // from class: X.6FO
            public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 351));
            public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 350));
            public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 349));

            @Override // X.InterfaceC145495nN
            public final void A3() {
            }

            @Override // X.InterfaceC145495nN
            public final void B8(boolean z) {
            }

            @Override // X.InterfaceC145495nN
            public final void G() {
            }

            @Override // X.InterfaceC145495nN
            public final MusicModel LIZJ() {
                return null;
            }

            @Override // X.InterfaceC145495nN
            public final void V7(AVMusic aVMusic, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
            }

            @Override // X.InterfaceC145495nN
            public final void clearMusic() {
            }

            @Override // X.InterfaceC145495nN
            public final void o3() {
            }

            @Override // X.InterfaceC145495nN
            public final void q3(C145355n9 result) {
                o.LJIIIZ(result, "result");
            }

            @Override // X.InterfaceC145495nN
            public final void r3() {
            }

            @Override // X.InterfaceC145495nN
            public final void s3(boolean z) {
            }

            @Override // X.InterfaceC145495nN
            public final void t3(String str, AVMusic aVMusic, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6) {
            }

            @Override // X.InterfaceC145495nN
            public final void u3() {
            }

            @Override // X.InterfaceC145495nN
            public final void v3(MusicModel musicModel) {
            }

            @Override // X.InterfaceC145495nN
            public final void w3(String str, String str2) {
            }

            @Override // X.InterfaceC145495nN
            public final void x3() {
            }

            @Override // X.InterfaceC145495nN
            public final int y3() {
                return -1;
            }

            @Override // X.InterfaceC145495nN
            public final C0IB<C145425nG> n3() {
                return (C0IB) this.LJLJI.getValue();
            }

            @Override // X.InterfaceC145495nN
            public final C0IB<C145425nG> p3() {
                return (C0IB) this.LJLILLLLZI.getValue();
            }

            @Override // X.InterfaceC145495nN
            public final C0IB<C45927I0t<C145265n0>> z3() {
                return (C0IB) this.LJLIL.getValue();
            }
        };
        this.LJLJL = C221108m2.LIZIZ(C6FC.LJLIL);
        this.LJLJLJ = new LinkedList();
        this.LJLJLLL = new LinkedList();
    }

    @Override // X.C6F2
    public final void LLJJIJI(Runnable successCallback, boolean z) {
        o.LJIIIZ(successCallback, "successCallback");
        LLJLLL(new C6FA(this, z, successCallback), false);
    }

    @Override // X.C6F2
    public final void LLJJL(Effect effect, CustomStickerInfo info) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(info, "info");
        LLJLLL(new AqS106S0300000_2(this, effect, info, 12), false);
    }

    public final void LLJLLL(InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        if (z) {
            ((LinkedList) this.LJLJLJ).offer(interfaceC88472Yns);
        } else {
            ((LinkedList) this.LJLJLLL).offer(interfaceC88472Yns);
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.C6F2
    public final void LLJJIJIIJIL(Runnable successCallback, boolean z, boolean z2) {
        o.LJIIIZ(successCallback, "successCallback");
        LLJLLL(new C6F5(this, z, z2, successCallback), false);
    }

    @Override // X.C6F2, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        FrameLayout.LayoutParams layoutParams;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        final FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        if ((this.LJLJJLL.getValue() instanceof BaseScreenAdaptScene) && C53099Ksh.LIZIZ()) {
            AbstractC42651GoZ abstractC42651GoZ = (AbstractC42651GoZ) this.LJLJJLL.getValue();
            o.LJII(abstractC42651GoZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene");
            layoutParams = ((BaseScreenAdaptScene) abstractC42651GoZ).LLLFF().LJ(this.LJLJI.LIZLLL(), this.LJLJI.LJI());
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        frameLayout.setLayoutParams(layoutParams);
        if (this.LJLILLLLZI.importInfoList.size() > 0) {
            int i = 0;
            Bitmap mediaBlurThumbnail = C60903NvH.LJIIJJI().LJIIZILJ().getMediaBlurThumbnail(((ImportVideoInfo) ListProtector.get(this.LJLILLLLZI.importInfoList, 0)).getOriginImportPath());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getMediaBlurThumbnail:");
            LIZ.append(mediaBlurThumbnail);
            LIZ.append("  ");
            if (mediaBlurThumbnail != null) {
                i = mediaBlurThumbnail.getAllocationByteCount();
            }
            LIZ.append(i / 1024);
            LIZ.append(" KB");
            H78.LIZIZ("FakeEditRootScene", X1D.LIZIZ(LIZ));
            if (mediaBlurThumbnail != null) {
                frameLayout.setBackground(new BitmapDrawable(getResources(), mediaBlurThumbnail));
            }
        }
        final C34K c34k = new C34K();
        final C34K c34k2 = new C34K();
        C84363X9b.LIZ(frameLayout, new AqS149S0200000_2(this, c34k, 91));
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.6F8
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (frameLayout.getViewTreeObserver().isAlive() && frameLayout.getVisibility() != 0 && c34k.element) {
                    C34K c34k3 = c34k2;
                    if (!c34k3.element) {
                        c34k3.element = true;
                        H78.LIZIZ("FakeEditRootScene", "notify  FakeEditRootScene hidden");
                        C6FP c6fp = this.LJLJJL;
                        if (c6fp != null) {
                            C6FD c6fd = (C6FD) c6fp;
                            c6fd.LIZIZ.LLIILII.LLJJJ();
                            C6F2 c6f2 = c6fd.LIZ;
                            if (c6f2 != null) {
                                VideoEditContainerScene videoEditContainerScene = c6fd.LIZIZ;
                                videoEditContainerScene.getClass();
                                H7B.LIZ("try to load FakeEditRootScene. ");
                                videoEditContainerScene.remove(c6f2);
                            }
                        }
                        frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            }
        });
        LLJJLIIIJLLLLLLLZ(new InterfaceC147475qZ() { // from class: X.6F9
            @Override // X.InterfaceC147475qZ
            public final void LJIIIZ() {
                H78.LIZIZ("FakeEditRootScene", "should hide FakeEditRootScene");
                if (C53099Ksh.LIZIZ()) {
                    frameLayout.animate().setDuration(C00F.LIZ(31744, 0, "studio_editor_fake_scene_hide_duration", true)).alpha(0.0f).setListener(new ALAdapterS1S0100000_2(frameLayout, 32)).withLayer();
                } else {
                    frameLayout.setVisibility(8);
                }
            }
        });
        return frameLayout;
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

    @Override // X.C6F2
    public final void LLJJIJIL(Runnable successCallback, Runnable runnable, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(successCallback, "successCallback");
        LLJLLL(new C6F6(this, z, z2, z3, successCallback, runnable), false);
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
