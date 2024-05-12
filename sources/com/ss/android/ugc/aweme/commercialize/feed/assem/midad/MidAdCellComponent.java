package com.ss.android.ugc.aweme.commercialize.feed.assem.midad;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1DH;
import X.C1DJ;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C2K0;
import X.C45804HyK;
import X.C48716JAa;
import X.C48717JAb;
import X.C48718JAc;
import X.C48719JAd;
import X.C48723JAh;
import X.C48726JAk;
import X.C48727JAl;
import X.C48728JAm;
import X.C48730JAo;
import X.C48736JAu;
import X.C48737JAv;
import X.C48738JAw;
import X.C48739JAx;
import X.C55096Ljo;
import X.C58655N0h;
import X.C58704N2e;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C79045V0n;
import X.C8YN;
import X.EnumC223268pW;
import X.IWH;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.JAW;
import X.JAX;
import X.JAY;
import X.JAZ;
import X.JB2;
import X.JB4;
import X.JB5;
import X.JB6;
import X.JB7;
import X.JBN;
import X.KL2;
import X.KP0;
import X.Q8U;
import X.TBT;
import Y.ACListenerS28S0100000_8;
import Y.ARunnableS27S0200000_8;
import Y.IDLListenerS195S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class MidAdCellComponent extends BaseCellSlotComponent implements IMidAdCellAbility, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILIL;
    public final InterfaceC115514g7 LLFII;
    public final C5H3 LLFZ;
    public final C5H3 LLI;
    public final C5H3 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public VideoSeekBarMaskView LLIIJI;
    public boolean LLIIJLIL;
    public final JB2 LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public IWH LLIL;
    public boolean LLILII;

    static {
        TBT tbt = new TBT(MidAdCellComponent.class, "midAdViewModel", "getMidAdViewModel()Lcom/ss/android/ugc/aweme/commercialize/feed/assem/midad/MidAdVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLILIL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.a_x;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1138953562) {
            return null;
        }
        return this;
    }

    public MidAdCellComponent() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(MidAdVM.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, null, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 40), null, JB4.INSTANCE, null, null);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), JB5.INSTANCE);
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), JB6.INSTANCE);
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(FeedAdViewModel.class), JB7.INSTANCE);
        this.LLII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 38));
        this.LLIIII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 37));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 34));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 39));
        this.LLIIIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 35));
        this.LLIIIZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 36));
        this.LLIIL = new JB2();
    }

    public final MidAdVM A4() {
        return (MidAdVM) this.LLFII.LIZ(this, LLILIL[0]);
    }

    public final void q4() {
        int i;
        int i2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(KL2.LIZJ(r4().getContext(), 14.0f));
        ViewGroup r4 = r4();
        Context context = r4().getContext();
        o.LJIIIIZZ(context, "buttonContainerView.context");
        Integer LJI = C79045V0n.LJI(R.attr.d8, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        Context context2 = r4().getContext();
        o.LJIIIIZZ(context2, "buttonContainerView.context");
        Integer LJI2 = C79045V0n.LJI(R.attr.d6, context2);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        } else {
            i2 = 0;
        }
        KP0.LIZJ(r4, gradientDrawable, i, i2, 300L, null);
    }

    public final ViewGroup r4() {
        Object value = this.LLIIIL.getValue();
        o.LJIIIIZZ(value, "<get-buttonContainerView>(...)");
        return (ViewGroup) value;
    }

    public final TuxTextView u4() {
        Object value = this.LLIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-buttonTextView>(...)");
        return (TuxTextView) value;
    }

    public final IMidAdAbility z4() {
        return (IMidAdAbility) this.LLII.getValue();
    }

    public final void B4() {
        ViewGroup rootView;
        View findViewById;
        IMidAdAbility z4 = z4();
        if (z4 == null || (rootView = z4.getRootView()) == null || (findViewById = rootView.findViewById(R.id.su)) == null) {
            return;
        }
        C16880lQ.LJLLL(findViewById, rootView);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void JN() {
        IMidAdAbility z4;
        if (C1DJ.LJJ(A4().LJLJLLL) && (z4 = z4()) != null) {
            z4.LJJIIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void LJJJ() {
        Aweme aweme;
        String aid;
        if (C1DJ.LJIJJLI(A4().LJLJLLL) && (aweme = A4().LJLJLLL) != null && (aid = aweme.getAid()) != null) {
            JAY.LJ.add(aid);
        }
        MidAdVM A4 = A4();
        JB2 blockState = this.LLIIL;
        A4.getClass();
        o.LJIIIZ(blockState, "blockState");
        C1DH.LJJIJIIJI(new ARunnableS27S0200000_8(blockState, A4, 57));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void unBind() {
        MidAdVM A4 = A4();
        A4.setState(C48730JAo.LJLIL);
        A4.LJLLLL = false;
        A4.LJLLLLLL = false;
        A4.LJLLILLLL = false;
        A4.LJLZ = false;
        this.LLIIJLIL = false;
        this.LLIILZL = false;
        this.LLIIZ = false;
        JB2 jb2 = this.LLIIL;
        jb2.LIZ = false;
        jb2.LIZIZ = false;
        jb2.LIZJ = false;
        jb2.LIZLLL = false;
        jb2.LJ = false;
        jb2.LJFF = false;
        jb2.LJI = false;
        JAY.LJFF = null;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        A4().kv0(item.getAweme());
        C4(item.getAweme(), true);
        this.LLILII = false;
        JAY.LJFF = this;
        this.LLIL = JAY.LJII;
        JAY.LJII = null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void O00(boolean z) {
        this.LLIIL.LIZJ = z;
        D4(z, true);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void Us0(boolean z) {
        String str;
        if (C1DJ.LJIJJLI(A4().LJLJLLL)) {
            Aweme aweme = A4().LJLJLLL;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (JAY.LIZ(str)) {
                return;
            }
            this.LLIIL.LJFF = z;
            D4(z, true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        VideoSeekBarMaskView videoSeekBarMaskView;
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            videoSeekBarMaskView = (VideoSeekBarMaskView) LIZ.findViewById(R.id.gcb);
        } else {
            videoSeekBarMaskView = null;
        }
        this.LLIIJI = videoSeekBarMaskView;
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.KLp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, C213688a4.LJ(), C48723JAh.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.82E
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJL;
            }
        }, C213688a4.LJ(), JAX.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.8fj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJZL;
            }
        }, C213688a4.LJ(), C48717JAb.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.91T
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLLLLL;
            }
        }, C213688a4.LJ(), C48728JAm.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.8eY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LLD;
            }
        }, C213688a4.LJ(), C48727JAl.LJLIL, 4);
        C8YN.LJII(this, A4(), new TBT() { // from class: X.JBA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((JBB) obj).LJLJJLL;
            }
        }, C213688a4.LJ(), C48718JAc.INSTANCE, 4);
        C8YN.LJII(this, A4(), new TBT() { // from class: X.JB8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((JBB) obj).LJLIL;
            }
        }, C213688a4.LJ(), JAW.LJLIL, 4);
        C8YN.LJII(this, A4(), new TBT() { // from class: X.JBC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((JBB) obj).LJLILLLLZI;
            }
        }, C213688a4.LJ(), C48719JAd.INSTANCE, 4);
        C8YN.LJII(this, A4(), new TBT() { // from class: X.JBD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((JBB) obj).LJLJJI;
            }
        }, C213688a4.LJ(), JAZ.LJLIL, 4);
        C8YN.LJII(this, A4(), new TBT() { // from class: X.JBE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((JBB) obj).LJLJJL;
            }
        }, C213688a4.LJ(), C48716JAa.LJLIL, 4);
        C8YN.LJII(this, A4(), new TBT() { // from class: X.JB9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((JBB) obj).LJLJI;
            }
        }, C213688a4.LJ(), C48739JAx.INSTANCE, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.JBF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLLJ;
            }
        }, C213688a4.LJ(), C48736JAu.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.JBG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLLL;
            }
        }, C213688a4.LJ(), C48737JAv.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.JBH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLLLL;
            }
        }, C213688a4.LJ(), C48726JAk.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.JBI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLLILLLL;
            }
        }, C213688a4.LJ(), C48738JAw.LJLIL, 4);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void ue(boolean z) {
        this.LLIIL.LJ = z;
        D4(z, false);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void v10(boolean z) {
        if (z && !this.LLIIZ) {
            ViewGroup.LayoutParams layoutParams = r4().getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin += (int) KL2.LIZJ(getContext(), 40.0f);
            this.LLIIZ = true;
            r4().setLayoutParams(layoutParams2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility
    public final void wK(boolean z) {
        this.LLIIL.LIZ = z;
        D4(z, false);
    }

    public final void C4(Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd;
        EnumC223268pW enumC223268pW;
        Activity LJIJJ;
        View findViewById;
        Activity LJIJJ2;
        View findViewById2;
        if (z) {
            ViewGroup.LayoutParams layoutParams = r4().getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Context context = getContext();
            if (context != null && (LJIJJ2 = C45804HyK.LJIJJ(context)) != null && (findViewById2 = LJIJJ2.findViewById(R.id.j5x)) != null) {
                layoutParams2.topMargin = findViewById2.getHeight() + ((int) KL2.LIZJ(getContext(), 16.0f));
            }
            IAutoAScrollAbility iAutoAScrollAbility = (IAutoAScrollAbility) this.LLIIIILZ.getValue();
            if (iAutoAScrollAbility != null) {
                enumC223268pW = iAutoAScrollAbility.dl();
            } else {
                enumC223268pW = null;
            }
            if (enumC223268pW == EnumC223268pW.AUTO_SCROLL_STATE_START) {
                Context context2 = getContext();
                if (context2 != null && (LJIJJ = C45804HyK.LJIJJ(context2)) != null && (findViewById = LJIJJ.findViewById(R.id.aan)) != null) {
                    layoutParams2.topMargin = findViewById.getHeight() + ((int) KL2.LIZJ(getContext(), 8.0f)) + layoutParams2.topMargin;
                }
                this.LLIIZ = true;
            }
            r4().setLayoutParams(layoutParams2);
        }
        if (C1DJ.LJJ(aweme)) {
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                int skipAdTime = awemeRawAd.getSkipAdTime();
                TuxTextView u4 = u4();
                if (skipAdTime == -1) {
                    u4.setText(u4.getContext().getString(R.string.gdm));
                    C16880lQ.LJIIL(r4(), new ACListenerS28S0100000_8(this, 9));
                } else {
                    String string = u4.getContext().getString(R.string.gdn);
                    o.LJIIIIZZ(string, "context.getString(R.stri…d_ads_mid_roll_skip_ad_n)");
                    String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{String.valueOf(skipAdTime / 1000)}, 1));
                    o.LJIIIIZZ(LLLZ, "format(format, *args)");
                    u4.setText(LLLZ);
                    C16880lQ.LJIIL(r4(), null);
                }
                u4.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS195S0100000_8(this, 0));
                getContainerView().setVisibility(0);
                return;
            }
            return;
        }
        String string2 = u4().getContext().getString(R.string.gdl);
        o.LJIIIIZZ(string2, "buttonTextView.context.g…d_ads_mid_roll_countdown)");
        String LIZIZ = Q8U.LIZIZ(new Object[]{"5"}, 1, string2, "format(format, *args)");
        u4().setText(LIZIZ);
        u4().getViewTreeObserver().addOnGlobalLayoutListener(new JBN(this, LIZIZ));
        getContainerView().setVisibility(8);
        this.LLIILII = false;
        if (!z) {
            return;
        }
        B4();
    }

    public final void D4(boolean z, boolean z2) {
        AwemeRawAd awemeRawAd;
        if (this.LLIILII && z && C1DJ.LJIJJLI(A4().LJLJLLL)) {
            TuxTextView u4 = u4();
            String string = u4().getContext().getString(R.string.gdl);
            o.LJIIIIZZ(string, "buttonTextView.context.g…d_ads_mid_roll_countdown)");
            String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{"5"}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            u4.setText(LLLZ);
            getContainerView().setVisibility(8);
            this.LLIILII = false;
            A4().LJLLILLLL = false;
            if (z2) {
                Aweme aweme = A4().LJLL;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "show_fail", awemeRawAd);
                LIZLLL.LIZIZ(this.LLIIL.LIZ(), "fail_reason");
                LIZLLL.LJI();
            }
        }
    }
}
