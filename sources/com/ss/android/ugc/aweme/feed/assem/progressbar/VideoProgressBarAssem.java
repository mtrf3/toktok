package com.ss.android.ugc.aweme.feed.assem.progressbar;

import X.AnonymousClass961;
import X.C17N;
import X.C1DH;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C226178uD;
import X.C27740Aue;
import X.C34X;
import X.C35570Dxe;
import X.C51029K0z;
import X.C54838Lfe;
import X.C54840Lfg;
import X.C57092Lx;
import X.C59472Vb;
import X.C5H3;
import X.C5S7;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C81150Vt4;
import X.C86551Xxz;
import X.C86553Xy1;
import X.C86554Xy2;
import X.C86556Xy4;
import X.C86557Xy5;
import X.C86558Xy6;
import X.C86559Xy7;
import X.C86560Xy8;
import X.C86561Xy9;
import X.C86562XyA;
import X.C86563XyB;
import X.C86564XyC;
import X.C86565XyD;
import X.C86566XyE;
import X.C86571XyJ;
import X.C8T7;
import X.C8YN;
import X.EnumC221088m0;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ALAdapterS12S0100000_15;
import Y.ARunnableS50S0100000_14;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS65S0000000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class VideoProgressBarAssem extends BaseCellSlotComponent<VideoProgressBarAssem> implements ComponentPriorityProtocol {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIILII;
    public final C62822Ol8 LLFII;
    public final C5H3 LLFZ;
    public C81150Vt4 LLI;
    public C5S7 LLIFFJFJJ;
    public AnonymousClass961 LLII;
    public AnimatorSet LLIIII;
    public AnimatorSet LLIIIILZ;
    public AnimatorSet LLIIIJ;
    public final InterfaceC115514g7 LLIIIL;
    public final C5H3 LLIIIZ;
    public final C5H3 LLIIJI;
    public final C5H3 LLIIJLIL;
    public final C86551Xxz LLIIL;

    static {
        TBT tbt = new TBT(VideoProgressBarAssem.class, "progressBarVM", "getProgressBarVM()Lcom/ss/android/ugc/aweme/feed/assem/progressbar/VideoProgressBarViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIILII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.af5;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "bottom_container_video_progress_bar";
    }

    public VideoProgressBarAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 366));
        this.LLFZ = C221108m2.LIZ(EnumC221088m0.NONE, new AqS165S0100000_15(this, 365));
        C65776Prg LIZ = C65352Pkq.LIZ(VideoProgressBarViewModel.class);
        this.LLIIIL = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 354), null, C86556Xy4.INSTANCE, null, null);
        this.LLIIIZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C86564XyC.INSTANCE);
        this.LLIIJI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C86565XyD.INSTANCE);
        this.LLIIJLIL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C86554Xy2.INSTANCE);
        this.LLIIL = new C86551Xxz(this);
    }

    public final void B4() {
        C35570Dxe.LIZJ(this.LLII);
        if (C59472Vb.LLLLZ()) {
            AnonymousClass961 anonymousClass961 = this.LLII;
            if (anonymousClass961 != null) {
                anonymousClass961.setVisibility(4);
                anonymousClass961.LJLILLLLZI.setAlpha(0.0f);
                ValueAnimator valueAnimator = anonymousClass961.LJLJJI;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass961 anonymousClass9612 = this.LLII;
        if (anonymousClass9612 == null) {
            return;
        }
        anonymousClass9612.LIZLLL();
    }

    public final void C4() {
        if (this.LLFZ.getValue() instanceof C34X) {
            ComponentCallbacks2 componentCallbacks2 = (Activity) this.LLFZ.getValue();
            o.LJII(componentCallbacks2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.IKeyDownListenerActivity");
            ((C34X) componentCallbacks2).unRegisterActivityOnKeyDownListener(this.LLIIL);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C1DH.LJJIJIIJI(new ARunnableS50S0100000_14(this, 60));
    }

    public final void q4() {
        if (this.LLIFFJFJJ == null || this.LLI == null) {
            return;
        }
        AnimatorSet animatorSet = this.LLIIIJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C5S7 c5s7 = this.LLIFFJFJJ;
        if (c5s7 != null) {
            c5s7.setAlpha(0.0f);
        }
        C81150Vt4 c81150Vt4 = this.LLI;
        if (c81150Vt4 == null) {
            return;
        }
        c81150Vt4.setAlpha(1.0f);
    }

    public final VideoProgressBarViewModel r4() {
        return (VideoProgressBarViewModel) this.LLIIIL.LIZ(this, LLIILII[0]);
    }

    public final void u4() {
        ObjectAnimator objectAnimator;
        if (this.LLIFFJFJJ == null || this.LLI == null) {
            return;
        }
        if (this.LLIIIILZ == null && this.LLIIII == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.LLIIIJ = animatorSet;
        animatorSet.addListener(new ALAdapterS12S0100000_15(this, 7));
        AnimatorSet animatorSet2 = this.LLIIIJ;
        if (animatorSet2 != null) {
            C5S7 c5s7 = this.LLIFFJFJJ;
            ObjectAnimator objectAnimator2 = null;
            if (c5s7 != null) {
                objectAnimator = c5s7.getShowAnim();
            } else {
                objectAnimator = null;
            }
            AnimatorSet.Builder play = animatorSet2.play(objectAnimator);
            if (play != null) {
                C81150Vt4 c81150Vt4 = this.LLI;
                if (c81150Vt4 != null) {
                    objectAnimator2 = c81150Vt4.getHideVolumeAnim();
                }
                play.after(objectAnimator2);
            }
        }
        AnimatorSet animatorSet3 = this.LLIIIJ;
        if (animatorSet3 == null) {
            return;
        }
        animatorSet3.start();
    }

    public final void z4() {
        if (this.LLFZ.getValue() instanceof C34X) {
            ComponentCallbacks2 componentCallbacks2 = (Activity) this.LLFZ.getValue();
            o.LJII(componentCallbacks2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.IKeyDownListenerActivity");
            ((C34X) componentCallbacks2).registerActivityOnKeyDownListener(this.LLIIL);
        }
    }

    public final void A4() {
        C5S7 c5s7;
        C5S7 c5s72;
        r4().LJLJLLL = SystemClock.elapsedRealtime();
        if (((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme() == null) {
            return;
        }
        if (C54838Lfe.LJJI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) && (c5s72 = this.LLIFFJFJJ) != null) {
            c5s72.setVisibility(8);
        }
        if (!C54840Lfg.LJJZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) && ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getVideoControl() != null && ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getVideoControl().showProgressBar == 1) {
            C5S7 c5s73 = this.LLIFFJFJJ;
            if (c5s73 != null) {
                c5s73.setProgress(0);
            }
            if (((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getVideo() != null && (c5s7 = this.LLIFFJFJJ) != null) {
                c5s7.setMax(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getVideo().getDuration());
            }
            C27740Aue.LJIIIZ(0, this.LLIFFJFJJ);
            return;
        }
        C27740Aue.LJIIIZ(8, this.LLIFFJFJJ);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        C81150Vt4 c81150Vt4 = this.LLI;
        if (c81150Vt4 != null) {
            c81150Vt4.setOnAudioControlViewHideListener(new C86571XyJ(this));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLI = (C81150Vt4) view.findViewById(R.id.a_g);
        this.LLIFFJFJJ = (C5S7) view.findViewById(R.id.n72);
        this.LLII = (AnonymousClass961) view.findViewById(R.id.fs7);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C17N.LJIILL(1.0d));
        layoutParams.gravity = 80;
        if (C57092Lx.LIZ.LJIIIIZZ) {
            int LJIILL = C17N.LJIILL(8.0d);
            layoutParams.leftMargin = LJIILL;
            layoutParams.rightMargin = LJIILL;
        }
        view.setLayoutParams(layoutParams);
        C81150Vt4 c81150Vt4 = this.LLI;
        if (c81150Vt4 != null) {
            c81150Vt4.setOnAudioControlViewHideListener(new C86566XyE(this));
        }
        C8YN.LJII(this, (AssemViewModel) this.LLIIIZ.getValue(), new TBT() { // from class: X.8M3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLLL;
            }
        }, null, C86558Xy6.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIZ.getValue(), new TBT() { // from class: X.XyG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, new AqS65S0000000_15(this, 0), 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIZ.getValue(), new TBT() { // from class: X.XyF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, new AqS65S0000000_15(this, 1), 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIJI.getValue(), new TBT() { // from class: X.8Tm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C86559Xy7.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIIJI.getValue(), new TBT() { // from class: X.8mw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJLJ;
            }
        }, null, C86561Xy9.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIJI.getValue(), new TBT() { // from class: X.8fo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLJ;
            }
        }, null, C86562XyA.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIZ.getValue(), new TBT() { // from class: X.8gE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJL;
            }
        }, null, C86563XyB.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIJLIL.getValue(), new TBT() { // from class: X.8U6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLJLJ;
            }
        }, null, C86560Xy8.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIJLIL.getValue(), new TBT() { // from class: X.8UL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLJLLL;
            }
        }, null, C226178uD.LJLIL, 6);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIIJLIL.getValue(), new TBT() { // from class: X.8UC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLLI;
            }
        }, null, C86557Xy5.LJLIL, 6);
        C8YN.LJII(this, r4(), new TBT() { // from class: X.Vv8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C81277Vv7) obj).LJLJJI);
            }
        }, C213688a4.LIZLLL(), C86553Xy1.LJLIL, 4);
    }
}
