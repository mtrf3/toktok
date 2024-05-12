package com.ss.android.ugc.aweme.translation.ui;

import X.AC1;
import X.AnonymousClass843;
import X.AnonymousClass925;
import X.C06460Ne;
import X.C150165uu;
import X.C162476Zf;
import X.C16880lQ;
import X.C17N;
import X.C1DH;
import X.C214348b8;
import X.C221108m2;
import X.C240999d1;
import X.C2K0;
import X.C2L4;
import X.C2Y1;
import X.C33940DTs;
import X.C36922EeM;
import X.C41032G8m;
import X.C47261Igj;
import X.C51029K0z;
import X.C52929Kpx;
import X.C52951KqJ;
import X.C53146KtS;
import X.C53256KvE;
import X.C55096Ljo;
import X.C5H3;
import X.C60102Xm;
import X.C61845OOz;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C76965UIn;
import X.C79004UzY;
import X.C7FC;
import X.C85054XZq;
import X.C86670Xzu;
import X.C86712Y1k;
import X.C86717Y1p;
import X.C86718Y1q;
import X.C86723Y1v;
import X.C86726Y1y;
import X.C86727Y1z;
import X.C86728Y2a;
import X.C86775Y3v;
import X.C8LG;
import X.C8QI;
import X.C8YN;
import X.C96T;
import X.C96U;
import X.EnumC79547VJv;
import X.EnumC86688Y0m;
import X.IQE;
import X.IUQ;
import X.InterfaceC115514g7;
import X.InterfaceC54035LIp;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC60152Xr;
import X.InterfaceC74236TBo;
import X.KL2;
import X.QD3;
import X.TBT;
import X.X1D;
import X.Y0N;
import X.Y0Y;
import X.Y1X;
import X.Y1Y;
import X.Y21;
import X.Y22;
import X.Y24;
import X.Y2B;
import X.Y2C;
import X.Y2G;
import X.Y30;
import X.Y31;
import X.Y38;
import Y.ACListenerS35S0100000_15;
import Y.ARunnableS51S0100000_15;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.cla.et.newet.SeeTranslationShowEvent;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes16.dex */
public final class TranslationStatusAssem extends BaseCellSlotComponent implements C96U, TranslationAbility, View.OnAttachStateChangeListener, InterfaceC55102Lju, C2L4 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILII;
    public ViewGroup LLFII;
    public LinearLayout LLFZ;
    public TuxTextView LLI;
    public TuxTextView LLIFFJFJJ;
    public TuxTextView LLII;
    public ObjectAnimator LLIIII;
    public final C5H3 LLIIIILZ;
    public final C5H3 LLIIIJ;
    public C86775Y3v LLIIIL;
    public final InterfaceC115514g7 LLIIIZ;
    public final InterfaceC115514g7 LLIIJI;
    public Y1Y LLIIJLIL;
    public boolean LLIIL;
    public final C62822Ol8 LLIILII;
    public final C62822Ol8 LLIILZL;
    public final TranslationStatusAssem$descExpandModeProtocol$1 LLIIZ;
    public final TranslationStatusAssem$translationParamsProvider$1 LLIL;

    static {
        TBT tbt = new TBT(TranslationStatusAssem.class, "translationStatusViewModel", "getTranslationStatusViewModel()Lcom/ss/android/ugc/aweme/translation/viewmodel/TranslationStatusViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLILII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(TranslationStatusAssem.class, "dubbinStatusViewModel", "getDubbinStatusViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0, c65351Pkp)};
    }

    public final void D4() {
        C8YN.LJIIJ(this, u4(), new TBT() { // from class: X.Y2s
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((Y24) obj).LJLIL;
            }
        }, new TBT() { // from class: X.Y2k
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((Y24) obj).LJLJI);
            }
        }, null, C86723Y1v.LJLIL, 12);
        C8YN.LJII(this, u4(), new TBT() { // from class: X.Y2t
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((Y24) obj).LJLIL;
            }
        }, null, Y22.LJLIL, 6);
        C8YN.LJIIJ(this, u4(), new TBT() { // from class: X.Y2u
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((Y24) obj).LJLIL;
            }
        }, new TBT() { // from class: X.Y2n
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((Y24) obj).LJLJJL);
            }
        }, null, C86717Y1p.LJLIL, 12);
        C8YN.LJII(this, u4(), new TBT() { // from class: X.Y2o
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((Y24) obj).LJLJJI);
            }
        }, null, Y21.LJLIL, 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ad4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -574489147) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem$descExpandModeProtocol$1] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem$translationParamsProvider$1] */
    public TranslationStatusAssem() {
        new LinkedHashMap();
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), Y30.INSTANCE);
        this.LLIIIJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), Y31.INSTANCE);
        this.LLIIIZ = C85054XZq.LIZ(this);
        this.LLIIJI = C86718Y1q.LIZIZ.LJ(this, C240999d1.LIZ);
        this.LLIILII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 660));
        this.LLIILZL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 661));
        this.LLIIZ = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem$descExpandModeProtocol$1
            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                TranslationStatusAssem translationStatusAssem = TranslationStatusAssem.this;
                if (translationStatusAssem.LLFFF == 0) {
                    translationStatusAssem.Y3().setVisibility(0);
                }
            }
        };
        this.LLIL = new ETParamsProvider<C60102Xm>() { // from class: com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem$translationParamsProvider$1
            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
            public final C60102Xm t() {
                String value;
                TranslationStatusAssem translationStatusAssem = TranslationStatusAssem.this;
                translationStatusAssem.getClass();
                if (C41032G8m.LIZ()) {
                    value = EnumC79547VJv.AUTO.getValue();
                } else if (translationStatusAssem.LLIIL && translationStatusAssem.u4().ov0()) {
                    value = EnumC79547VJv.AUTO.getValue();
                } else {
                    value = EnumC79547VJv.CLICK.getValue();
                }
                return new C60102Xm(value);
            }

            @Override // com.ss.android.tracker.event.EventParamsProtocol
            public final InterfaceC54035LIp getParam() {
                if (d2(C60102Xm.class)) {
                    return t();
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            public final boolean d2(Class<? extends InterfaceC60152Xr> clazz) {
                o.LJIIIZ(clazz, "clazz");
                if (!o.LJ(clazz, C60102Xm.class)) {
                    return false;
                }
                return true;
            }
        };
    }

    public final void B4() {
        TuxTextView tuxTextView = this.LLI;
        if (tuxTextView != null) {
            tuxTextView.setAlpha(1.0f);
        }
        TuxTextView tuxTextView2 = this.LLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setVisibility(8);
        }
        TuxTextView tuxTextView3 = this.LLIFFJFJJ;
        if (tuxTextView3 != null) {
            tuxTextView3.setVisibility(8);
        }
        LinearLayout linearLayout = this.LLFZ;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final void C4() {
        Y2G.LJ(SeeTranslationShowEvent.class, getVScope(), C47261Igj.LJJIJ(new C2Y1(0)), 4);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Trigger aid ");
        LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAid());
        LIZ.append(" turn back original source");
        C36922EeM.LIZLLL(4, "TranslationStatusView", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final boolean N00() {
        Object obj;
        ViewGroup viewGroup = this.LLFII;
        Object obj2 = null;
        if (viewGroup != null) {
            obj = viewGroup.getTag(C8QI.LJ);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            obj2 = obj;
        }
        return o.LJ(obj2, "is_avoided");
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(TranslationStatusScope.class);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final boolean pa0() {
        return !(this.LLIIJLIL instanceof Y1X);
    }

    public final TranslationStatusViewModel u4() {
        return (TranslationStatusViewModel) this.LLIIIZ.LIZ(this, LLILII[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final IQE xr() {
        IQE iqe;
        Y1Y y1y = this.LLIIJLIL;
        if (y1y == null || (iqe = y1y.LIZ) == null) {
            return IQE.INITIALIZED;
        }
        return iqe;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        if (!C53256KvE.LIZ()) {
            D4();
        }
        C1DH.LJJIJIIJI(new ARunnableS51S0100000_15(this, 51));
        if (C52951KqJ.LIZ() && AnonymousClass925.LIZ()) {
            C8YN.LJII(this, (AssemViewModel) this.LLIIJI.LIZ(this, LLILII[1]), new TBT() { // from class: X.Y2l
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((Y2S) obj).LJLILLLLZI);
                }
            }, null, C86728Y2a.LJLIL, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void Y80() {
        TranslationStatusViewModel.LLI = ((Y24) u4().getState()).LJLIL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        EventBus.LIZJ().LJIJ(this);
        TranslationStatusViewModel u4 = u4();
        u4.LJLLL.LIZLLL();
        if (C52929Kpx.LIZ()) {
            u4.sv0();
        }
    }

    public final InterfaceC55235Lm3 getVScope() {
        if (C53146KtS.LIZ()) {
            return (InterfaceC55235Lm3) this.LLIILII.getValue();
        }
        return C55096Ljo.LJIIZILJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
        C62814Ol0.LJJIIJZLJL(getVScope(), ETParamsProvider.class, C47261Igj.LJJIJIL(this.LLIL));
        if (AnonymousClass843.LIZIZ()) {
            C62814Ol0.LJJIIJZLJL(getVScope(), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLIIZ));
        }
    }

    public final void z4() {
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
    }

    @Override // X.InterfaceC150175uv
    public final ObjectAnimator a() {
        return this.LLIIII;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void b4() {
        z4();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void c4() {
        z4();
    }

    @Override // X.InterfaceC150175uv
    public final void B1(ObjectAnimator objectAnimator) {
        this.LLIIII = objectAnimator;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void N3(View view) {
        o.LJIIIZ(view, "view");
        if (C52951KqJ.LIZ()) {
            q4(40.0d);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void Rk0(boolean z) {
        TranslationStatusViewModel u4 = u4();
        if (!z) {
            u4.setState(Y38.LJLIL);
        } else {
            u4.getClass();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void SS(Y2B requestType) {
        o.LJIIIZ(requestType, "requestType");
        if (this.LLIIJLIL instanceof Y0N) {
            E4(requestType, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void V4(Y2B requestType) {
        o.LJIIIZ(requestType, "requestType");
        A4(requestType, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void f00(String str) {
        ViewGroup viewGroup = this.LLFII;
        if (viewGroup != null) {
            viewGroup.setTag(C8QI.LJ, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r1 == true) goto L20;
     */
    @X.QD3(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onShowCaptionPanelEvent(X.Y1A r9) {
        /*
            r8 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r1 = r9.LJLIL
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r8)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            boolean r0 = X.C06460Ne.LJ(r0, r1)
            if (r0 == 0) goto L62
            android.content.Context r0 = r8.getContext()
            if (r0 == 0) goto L73
            android.app.Activity r0 = X.C45804HyK.LJIJJ(r0)
        L1d:
            int r1 = java.lang.System.identityHashCode(r0)
            int r0 = r9.LJLJJI
            if (r1 != r0) goto L62
            X.Y3v r2 = r8.LLIIIL
            if (r2 != 0) goto L65
            X.1qj r2 = X.C212428Vi.LIZ(r8)
            if (r2 == 0) goto L4a
            X.Y3v r1 = new X.Y3v
            X.Lm3 r3 = r8.getVScope()
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r8)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.getAweme()
            java.lang.String r5 = r9.LJLILLLLZI
            X.Y3x r6 = r9.LJLJI
            X.Yns<java.lang.Boolean, X.UCe> r7 = r9.LJLJJL
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.LLIIIL = r1
        L4a:
            X.Y3v r3 = r8.LLIIIL
            if (r3 == 0) goto L62
            com.ss.android.ugc.aweme.service.ICLACaptionService r2 = X.IQD.LIZ()
            X.1qj r0 = X.C212428Vi.LIZ(r8)
            if (r0 == 0) goto L63
            boolean r1 = X.C78886Uxe.LJJIJLIJ(r0)
            r0 = 1
            if (r1 != r0) goto L63
        L5f:
            r2.LJIIL(r3, r0)
        L62:
            return
        L63:
            r0 = 0
            goto L5f
        L65:
            java.lang.String r0 = r9.LJLILLLLZI
            r2.LJLJI = r0
            X.Y3x r1 = r9.LJLJI
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.LJLJJI = r1
            goto L4a
        L73:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem.onShowCaptionPanelEvent(X.Y1A):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView;
        o.LJIIIZ(view, "view");
        if (view instanceof ViewGroup) {
            if (C8LG.LIZ()) {
                Y3().setBackgroundColor(-65536);
            }
            C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.MEY
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJI;
                }
            }, null, C86712Y1k.LJLIL, 6);
            C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.MEZ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJJI;
                }
            }, null, C86726Y1y.LJLIL, 6);
            C8YN.LJII(this, (AssemViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.MEF
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJLJLJ;
                }
            }, null, C86727Y1z.LJLIL, 6);
            if (C53256KvE.LIZ()) {
                D4();
            }
            if (Y3() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) Y3();
                Context context = getContext();
                this.LLFII = viewGroup;
                if (context != null) {
                    TuxTextView LIZ = C96T.LIZ(context);
                    this.LLI = LIZ;
                    LIZ.setText(R.string.qfs);
                    TuxTextView tuxTextView2 = this.LLI;
                    if (tuxTextView2 != null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 16;
                        tuxTextView2.setLayoutParams(layoutParams);
                    }
                    TuxTextView tuxTextView3 = this.LLI;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setGravity(16);
                    }
                    C7FC.LIZIZ(this.LLI);
                    if (C8LG.LIZ() && (tuxTextView = this.LLI) != null) {
                        tuxTextView.setBackgroundColor(-16711936);
                    }
                    LinearLayout linearLayout = new LinearLayout(context);
                    this.LLFZ = linearLayout;
                    linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                    LinearLayout linearLayout2 = this.LLFZ;
                    if (linearLayout2 != null) {
                        linearLayout2.setOrientation(0);
                    }
                    ImageView imageView = new ImageView(context);
                    C150165uu.LIZIZ(this, imageView);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
                    layoutParams2.gravity = 16;
                    imageView.setLayoutParams(layoutParams2);
                    LinearLayout linearLayout3 = this.LLFZ;
                    if (linearLayout3 != null) {
                        linearLayout3.addView(imageView);
                    }
                    TuxTextView LIZ2 = C96T.LIZ(context);
                    this.LLII = LIZ2;
                    LIZ2.setText(R.string.bxp);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams3.leftMargin = (int) KL2.LIZJ(context, 6.0f);
                    layoutParams3.gravity = 16;
                    TuxTextView tuxTextView4 = this.LLII;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setLayoutParams(layoutParams3);
                    }
                    LinearLayout linearLayout4 = this.LLFZ;
                    if (linearLayout4 != null) {
                        linearLayout4.addView(this.LLII);
                    }
                    TuxTextView LIZ3 = C96T.LIZ(context);
                    this.LLIFFJFJJ = LIZ3;
                    LIZ3.setText(R.string.qfr);
                    TuxTextView tuxTextView5 = this.LLIFFJFJJ;
                    if (tuxTextView5 != null) {
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams4.gravity = 16;
                        tuxTextView5.setLayoutParams(layoutParams4);
                    }
                    TuxTextView tuxTextView6 = this.LLIFFJFJJ;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setGravity(16);
                    }
                    C7FC.LIZIZ(this.LLIFFJFJJ);
                    viewGroup.addView(this.LLIFFJFJJ);
                    viewGroup.addView(this.LLFZ);
                    viewGroup.addView(this.LLI);
                }
                TuxTextView tuxTextView7 = this.LLI;
                if (tuxTextView7 != null) {
                    C16880lQ.LJJJJI(tuxTextView7, new ACListenerS35S0100000_15(this, 245));
                }
                TuxTextView tuxTextView8 = this.LLIFFJFJJ;
                if (tuxTextView8 != null) {
                    C16880lQ.LJJJJI(tuxTextView8, new ACListenerS35S0100000_15(this, 246));
                }
                B4();
                if (C33940DTs.LIZ == 0) {
                    return;
                }
                z4();
                return;
            }
            throw new IllegalArgumentException("must pass the view group!!");
        }
        throw new IllegalArgumentException("must pass the view group!!");
    }

    public final void q4(double d) {
        TuxTextView tuxTextView = this.LLI;
        if (tuxTextView != null) {
            tuxTextView.setPaddingRelative(C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), C17N.LJIILL(4.0d), C17N.LJIILL(d), C17N.LJIILL(4.0d));
        }
        TuxTextView tuxTextView2 = this.LLIFFJFJJ;
        if (tuxTextView2 != null) {
            tuxTextView2.setPaddingRelative(C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), C17N.LJIILL(4.0d), C17N.LJIILL(d), C17N.LJIILL(4.0d));
        }
        LinearLayout linearLayout = this.LLFZ;
        if (linearLayout != null) {
            linearLayout.setPaddingRelative(C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), C17N.LJIILL(4.0d), C17N.LJIILL(d), C17N.LJIILL(4.0d));
        }
    }

    public final View r4(Y1Y y1y) {
        if (y1y instanceof Y0Y) {
            return this.LLI;
        }
        if (y1y instanceof IUQ) {
            return this.LLFZ;
        }
        if (y1y instanceof Y0N) {
            return this.LLIFFJFJJ;
        }
        if ((y1y instanceof Y1X) || y1y == null) {
            return null;
        }
        throw new C162476Zf();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void updateCaptionTranslation(AC1 event) {
        Y2B y2b;
        o.LJIIIZ(event, "event");
        if (C06460Ne.LJ((VideoItemParams) C51029K0z.LJIILLIIL(this), event.LJLIL) && !C79004UzY.LJJIJIIJI(getContext())) {
            if (C41032G8m.LIZ()) {
                y2b = Y2B.COMBINE_ENTRANCE_MASTER_TOGGLE;
            } else {
                y2b = Y2B.TOOLTIP;
            }
            if (event.LJLILLLLZI) {
                A4(y2b, true);
            } else {
                if (!(this.LLIIJLIL instanceof Y0N)) {
                    return;
                }
                E4(y2b, true);
            }
        }
    }

    public final void A4(Y2B y2b, boolean z) {
        if (this.LLIIJLIL instanceof Y0Y) {
            switch (Y2C.LIZ[y2b.ordinal()]) {
                case 1:
                    C86670Xzu.LJIJ().LJJIIZ(EnumC86688Y0m.NONE);
                    E4(y2b, z);
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    E4(y2b, z);
                    return;
                default:
                    return;
            }
        }
        if (!C41032G8m.LIZ()) {
            return;
        }
        u4().rv0(y2b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E4(X.Y2B r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem.E4(X.Y2B, boolean):void");
    }
}
