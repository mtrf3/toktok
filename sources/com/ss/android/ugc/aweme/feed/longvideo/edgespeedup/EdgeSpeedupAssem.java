package com.ss.android.ugc.aweme.feed.longvideo.edgespeedup;

import X.AnonymousClass843;
import X.C113554cx;
import X.C183477Hz;
import X.C212428Vi;
import X.C214348b8;
import X.C220858ld;
import X.C221108m2;
import X.C224888s8;
import X.C2313195z;
import X.C2K0;
import X.C2U8;
import X.C34514Dgc;
import X.C3ZH;
import X.C47261Igj;
import X.C50420Jqa;
import X.C51029K0z;
import X.C55096Ljo;
import X.C55990LyE;
import X.C56457MDt;
import X.C5H3;
import X.C61996OUu;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C7I0;
import X.C7I1;
import X.C8OB;
import X.C8YN;
import X.C98273tP;
import X.DZ1;
import X.EnumC55993LyH;
import X.IFH;
import X.IWF;
import X.InterfaceC55102Lju;
import X.ME3;
import X.ME5;
import X.ME6;
import X.ME7;
import X.ME9;
import X.MEA;
import X.OSZ;
import X.TBT;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class EdgeSpeedupAssem extends BaseCellSlotComponent implements EdgeSpeedupAbility, InterfaceC55102Lju {
    public final C5H3 LLFII;
    public final C5H3 LLFZ;
    public final C62822Ol8 LLI;
    public C55990LyE LLIFFJFJJ;
    public C2313195z LLII;
    public ME3 LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public float LLIIIL;
    public long LLIIIZ;
    public int LLIIJI;
    public C7I0 LLIIJLIL;
    public View LLIIL;
    public int LLIILII;
    public final EdgeSpeedupAssem$descExpandModeProtocol$1 LLIILZL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aap;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1248994953) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem$descExpandModeProtocol$1] */
    public EdgeSpeedupAssem() {
        new LinkedHashMap();
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), ME9.INSTANCE);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), MEA.INSTANCE);
        this.LLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 229));
        this.LLIIIL = 1.0f;
        this.LLIIJLIL = C7I0.INVALID_ZONE;
        this.LLIILII = 8;
        this.LLIILZL = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem$descExpandModeProtocol$1
            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                EdgeSpeedupAssem edgeSpeedupAssem = EdgeSpeedupAssem.this;
                if (edgeSpeedupAssem.LLFFF == 0) {
                    edgeSpeedupAssem.Y3().setVisibility(0);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
        if (AnonymousClass843.LIZIZ()) {
            C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLIILZL));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    public final boolean sM() {
        return this.LLIIIJ;
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    public final void Zt0(boolean z) {
        int i;
        int i2;
        HashMap hashMap;
        if (!this.LLIIIJ) {
            return;
        }
        this.LLIIIJ = false;
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ("speedup_duration", Long.valueOf(System.currentTimeMillis() - this.LLIIIZ));
        oszArr[1] = new OSZ("edges_shown_cnt", Integer.valueOf(this.LLIIJI));
        Video video = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getVideo();
        if (video != null) {
            i = video.getDuration();
        } else {
            i = 0;
        }
        oszArr[2] = new OSZ("item_duration", Integer.valueOf(i));
        oszArr[3] = new OSZ("prev_speed_mode", Float.valueOf(this.LLIIIL));
        if (!C224888s8.LJFF(false) && z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        oszArr[4] = new OSZ("is_auto_scroll", Integer.valueOf(i2));
        Map LJJL = C113554cx.LJJL(oszArr);
        if (!(LJJL instanceof HashMap) || (hashMap = (HashMap) LJJL) == null) {
            hashMap = new HashMap();
        }
        C98273tP.LIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, this.LLIIJLIL.getMethod(), 2.0f, hashMap);
        C2313195z c2313195z = this.LLII;
        if (c2313195z != null) {
            c2313195z.LIZLLL();
        }
        C55990LyE c55990LyE = this.LLIFFJFJJ;
        if (c55990LyE != null) {
            AnimatorSet animatorSet = c55990LyE.LJLJJL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = c55990LyE.LJLJJI;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
        }
        q4(true);
        C50420Jqa c50420Jqa = new C50420Jqa(76, new C56457MDt(false));
        c50420Jqa.LJLZ = System.identityHashCode(C212428Vi.LIZ(this));
        C2U8.LIZ(c50420Jqa);
        IWF.LJJLIIIIJ().LJFF(this.LLIIIL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        VideoViewCellRootView videoViewCellRootView;
        o.LJIIIZ(view, "view");
        if (!C8OB.LIZ()) {
            return;
        }
        this.LLIFFJFJJ = (C55990LyE) view.findViewById(R.id.j3g);
        if (!(!C34514Dgc.LIZ)) {
            this.LLII = (C2313195z) view.findViewById(R.id.lf5);
        }
        View containerView = getContainerView();
        getContainerView().getWidth();
        ME3 me3 = new ME3(containerView);
        me3.LJLJLJ = this;
        this.LLIIII = me3;
        ViewParent parent = getContainerView().getParent();
        if ((parent instanceof VideoViewCellRootView) && (videoViewCellRootView = (VideoViewCellRootView) parent) != null) {
            videoViewCellRootView.setEdgeSpeedupListener(this.LLIIII);
        }
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.MEB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJLJ;
            }
        }, null, ME5.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.MEC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLJ;
            }
        }, null, ME7.LJLIL, 6);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.ME8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, ME6.LJLIL, 6);
        super.onViewCreated(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1 == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q4(boolean r9) {
        /*
            r8 = this;
            X.8O4 r0 = r8.a1()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r0.LJ
            r6 = 0
            if (r0 == 0) goto L88
            boolean r1 = r0.isPlayListCleanMode()
            r0 = 1
            if (r1 != r0) goto L88
        L10:
            r7 = 0
            if (r0 == 0) goto L59
        L13:
            X.Lm3 r1 = X.C55096Ljo.LJIIZILJ(r8)
            java.lang.Class<com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility> r0 = com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility.class
            X.2K0 r0 = X.C55096Ljo.LIZ(r1, r0, r7)
            com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility r0 = (com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility) r0
            if (r0 == 0) goto L24
            r0.dQ(r9)
        L24:
            android.view.View r0 = r8.LLIIL
            if (r0 != 0) goto L40
            androidx.fragment.app.Fragment r0 = X.C212428Vi.LIZLLL(r8)
            if (r0 == 0) goto L3e
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L3e
            X.LWM r0 = X.LWM.LIZIZ
            int r0 = r0.LJIILIIL()
            android.view.View r7 = r1.findViewById(r0)
        L3e:
            r8.LLIIL = r7
        L40:
            android.view.View r1 = r8.LLIIL
            if (r1 == 0) goto L55
            if (r9 != 0) goto L4c
            int r0 = r1.getVisibility()
            r8.LLIILII = r0
        L4c:
            int r0 = r8.LLIILII
            if (r0 != 0) goto L55
            if (r9 == 0) goto L56
        L52:
            r1.setVisibility(r6)
        L55:
            return
        L56:
            r6 = 8
            goto L52
        L59:
            X.Lm3 r1 = X.C55096Ljo.LJIIZILJ(r8)
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility> r0 = com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility.class
            X.2K0 r5 = X.C55096Ljo.LIZ(r1, r0, r7)
            com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility r5 = (com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility) r5
            if (r5 == 0) goto L7a
            X.8T5 r4 = X.C8T5.ALL
            X.MEE r0 = new X.MEE
            r0.<init>()
            X.8Sk r3 = new X.8Sk
            android.view.animation.Interpolator r2 = r0.LIZ
            r0 = 200(0xc8, double:9.9E-322)
            r3.<init>(r0, r2)
            r5.D3(r4, r9, r3)
        L7a:
            X.Ol8 r0 = r8.LLI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility r0 = (com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility) r0
            if (r0 == 0) goto L13
            r0.da(r9)
            goto L13
        L88:
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem.q4(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    public final void B30(float f, float f2) {
        boolean z;
        EnumC55993LyH enumC55993LyH;
        if (this.LLIIIJ) {
            return;
        }
        this.LLIIIZ = System.currentTimeMillis();
        this.LLIIIJ = true;
        Context context = getContext();
        if (context != null) {
            new C61996OUu(context).LIZ(0);
        }
        C50420Jqa c50420Jqa = new C50420Jqa(76, new C56457MDt(true));
        c50420Jqa.LJLZ = System.identityHashCode(C212428Vi.LIZ(this));
        C2U8.LIZ(c50420Jqa);
        q4(false);
        C2313195z c2313195z = this.LLII;
        if (c2313195z != null) {
            c2313195z.LIZJ();
        }
        this.LLIIJI = 0;
        this.LLIIJLIL = C183477Hz.LIZ(f, f2, getContainerView().getWidth(), getContainerView().getHeight());
        Keva keva = C3ZH.LIZ;
        int i = keva.getInt("ripple_shown_count", 0);
        if (i >= 3) {
            z = false;
        } else {
            keva.storeInt("ripple_shown_count", i + 1);
            z = true;
        }
        if (z) {
            this.LLIIJI = 2;
            C55990LyE c55990LyE = this.LLIFFJFJJ;
            if (c55990LyE != null) {
                c55990LyE.setRippleType(EnumC55993LyH.BOTH_SIDE_RIPPLE);
            }
            C55990LyE c55990LyE2 = this.LLIFFJFJJ;
            if (c55990LyE2 != null) {
                c55990LyE2.LIZIZ();
            }
        } else if (DZ1.LIZ) {
            this.LLIIJI = 1;
            C55990LyE c55990LyE3 = this.LLIFFJFJJ;
            if (c55990LyE3 != null) {
                int i2 = C7I1.LIZ[this.LLIIJLIL.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        enumC55993LyH = EnumC55993LyH.NONE_RIPPLE;
                    } else {
                        enumC55993LyH = EnumC55993LyH.RIGHT_RIPPLE;
                    }
                } else {
                    enumC55993LyH = EnumC55993LyH.LEFT_RIPPLE;
                }
                c55990LyE3.setRippleType(enumC55993LyH);
            }
            C55990LyE c55990LyE4 = this.LLIFFJFJJ;
            if (c55990LyE4 != null) {
                c55990LyE4.LIZIZ();
            }
        }
        this.LLIIIL = IWF.LJJLIIIIJ().getSpeed();
        IWF.LJJLIIIIJ().LJFF(2.0f);
        try {
            if (IWF.LJJLIIIIJ().isPaused()) {
                IWF.LJJLIIIIJ().LIZIZ();
            }
        } catch (Exception unused) {
        }
        C3ZH.LIZ.storeBoolean("already_shown_edge_speed_guide", true);
    }

    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    public final boolean oJ(float f, float f2) {
        if (!this.LLIIIILZ || !C8OB.LIZ() || C183477Hz.LIZ(f, f2, getContainerView().getWidth(), getContainerView().getHeight()) == C7I0.INVALID_ZONE || !IFH.LIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) || C220858ld.LJIIIIZZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
            return false;
        }
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLI.getValue();
        if (iVideoCellAbility != null && iVideoCellAbility.S()) {
            return false;
        }
        return true;
    }
}
