package X;

import Y.ACListenerS34S0100000_14;
import Y.ARunnableS18S0101000_14;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.recorder.voicechange.slideslip.rv.CenterLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WZJ extends WLP<WZN, WZC> {
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public RecyclerView LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public TuxTextView LJLLJ;
    public TDV LJLLL;
    public TuxIconView LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public TuxTextView LJZ;
    public View LJZI;
    public RecyclerView LLF;
    public View LLFF;
    public View LLFFF;
    public final UYT LJLILLLLZI = new UYT(new WZK(this), new UYV(this), new TBU(this) { // from class: X.UYW
        @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
        public final Object get() {
            return ((WZJ) this.receiver).LL;
        }

        @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
        public final void set(Object obj) {
            ((WZJ) this.receiver).LL = (AbstractC77373UYf) obj;
        }
    });
    public final C80109VcH LJLJI = new C80109VcH();
    public final WZI LJLJJI = new WZI(this);
    public final WZY LJLJJL = new WZY(this);
    public final CopyOnWriteArrayList<AbstractC77373UYf> LJZL = new CopyOnWriteArrayList<>();
    public AbstractC77373UYf LL = C77375UYh.LIZ;
    public String LLD = "STATE_PREVIEW_EMPTY";
    public final C167676i3 LLFII = new C167676i3();
    public final C168216iv LLFZ = new AbstractC167696i5() { // from class: X.6iv
        @Override // X.AbstractC167696i5
        public final List<C167736i9> LJLLLLLL(int i) {
            return null;
        }

        @Override // X.AbstractC167696i5
        public final void LJZ(RecyclerView.ViewHolder holder, C167736i9 c167736i9) {
            o.LJIIIZ(holder, "holder");
        }

        @Override // X.AbstractC167696i5
        public final RecyclerView.ViewHolder LJZI(ViewGroup parent, int i, C167726i8 clickListener) {
            o.LJIIIZ(parent, "parent");
            o.LJIIIZ(clickListener, "clickListener");
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.ji, parent, false);
            o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) LLLLIILL;
            View findViewById = frameLayout.findViewById(R.id.kgn);
            SmartImageView smartImageView = (SmartImageView) frameLayout.findViewById(R.id.f2e);
            TuxTextView tuxTextView = (TuxTextView) frameLayout.findViewById(R.id.m64);
            int min = Math.min(SFS.LJI(60.0d), (int) (C143205jg.LJ() * 0.14d));
            View findViewById2 = frameLayout.findViewById(R.id.cg0);
            o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.download_progress_vc)");
            TDV tdv = (TDV) findViewById2;
            smartImageView.getLayoutParams().width = min;
            smartImageView.getLayoutParams().height = min;
            tdv.getLayoutParams().width = min;
            tdv.getLayoutParams().height = min;
            tuxTextView.setHorizontalFadingEdgeEnabled(true);
            tuxTextView.setFadingEdgeLength((int) KL2.LIZJ(tuxTextView.getContext(), 4.0f));
            findViewById.getLayoutParams().width = SFS.LJI(8.0d) + min;
            findViewById.getLayoutParams().height = findViewById.getLayoutParams().width;
            C168996kB c168996kB = new C168996kB(frameLayout, smartImageView, tuxTextView, findViewById, clickListener, tdv);
            c168996kB.LJLLLL = new C169026kE(findViewById, tdv);
            return c168996kB;
        }
    };
    public final WZH LLI = new WZH(this);

    @Override // X.WLP
    public final void LLJILJIL() {
    }

    @Override // X.WLP
    public final void LLJJ() {
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WZX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WZN) obj).LJIIIIZZ;
            }
        }, null, new AqS179S0100000_13(this, 341), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WZS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WZN) obj).LJIIIZ;
            }
        }, null, new AqS180S0100000_14(this, 263), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WZV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WZN) obj).LJIIJ;
            }
        }, null, new AqS180S0100000_14(this, 264), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WZM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((WZN) obj).LJIIJJI);
            }
        }, null, new AqS180S0100000_14(this, 265), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WZT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WZN) obj).LJI;
            }
        }, null, new AqS180S0100000_14(this, 266), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WZU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WZN) obj).LJII;
            }
        }, null, new AqS180S0100000_14(this, 267), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WZW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WZN) obj).LIZ;
            }
        }, null, new AqS179S0100000_13(this, 340), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WZO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((WZN) obj).LIZJ);
            }
        }, null, new AqS180S0100000_14(this, 268), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WZP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((WZN) obj).LIZLLL);
            }
        }, null, new AqS180S0100000_14(this, 269), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WZQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((WZN) obj).LJ);
            }
        }, null, new AqS175S0100000_9(this, 358), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WZR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((WZN) obj).LJFF);
            }
        }, null, new AqS175S0100000_9(this, 359), 2, null);
    }

    @Override // X.WLP
    public final void LLJJI() {
    }

    @Override // X.WLP
    public final void LLJILJILJ() {
        View view = this.LJLL;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 62), view);
            View view2 = this.LJLLI;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 63), view2);
                View view3 = this.LLFFF;
                if (view3 != null) {
                    C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 64), view3);
                    View view4 = this.LLFF;
                    if (view4 != null) {
                        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 65), view4);
                        return;
                    } else {
                        o.LJIJI("panelTouchOutsideView");
                        throw null;
                    }
                }
                o.LJIJI("panelCancelView");
                throw null;
            }
            o.LJIJI("bottomExpandView");
            throw null;
        }
        o.LJIJI("bottomCloseView");
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r5.equals("STATE_PREVIEW_NONE") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        r8.LLFII.LJIILLIIL(0);
        r8.LLFII.LJIILJJIL(false);
        r8.LLFII.LJIILL(-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r5.equals("STATE_PREVIEW_EMPTY") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        if (r5.equals("STATE_PREVIEW_CANCEL") == false) goto L15;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x003b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJIJI() {
        /*
            r8 = this;
            java.lang.String r0 = r8.LLD
            r8.LLJJIJIIJIL(r0)
            java.lang.String r5 = r8.LLD
            X.6i3 r0 = r8.LLFII
            X.6i5 r7 = r0.LIZIZ
            r1 = 0
            r2 = -1
            if (r7 == 0) goto L36
            java.util.ArrayList<X.6i9> r0 = r7.LJLJI
            java.util.Iterator r6 = r0.iterator()
            r4 = 0
        L16:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r3 = r6.next()
            int r0 = r4 + 1
            if (r4 < 0) goto L2e
            X.6i9 r3 = (X.C167736i9) r3
            r3.LJIIIIZZ = r2
            r3.LJIIJ = r1
            r3.LJIIIZ = r2
            r4 = r0
            goto L16
        L2e:
            X.C47261Igj.LJJJJJ()
            r0 = 0
            throw r0
        L33:
            r7.notifyDataSetChanged()
        L36:
            int r0 = r5.hashCode()
            r3 = 1
            switch(r0) {
                case -1826711939: goto L4e;
                case -801864056: goto L57;
                case -788856563: goto L60;
                case -661951831: goto L79;
                case -486572477: goto L92;
                case 843601023: goto Lac;
                default: goto L3e;
            }
        L3e:
            X.6i3 r0 = r8.LLFII
            r0.LJIILLIIL(r1)
            X.6i3 r0 = r8.LLFII
            r0.LJIILJJIL(r1)
            X.6i3 r0 = r8.LLFII
            r0.LJIILL(r2)
        L4d:
            return
        L4e:
            java.lang.String r0 = "STATE_PREVIEW_NONE"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto Lb5
            goto L3e
        L57:
            java.lang.String r0 = "STATE_PREVIEW_EMPTY"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto Lb5
            goto L3e
        L60:
            java.lang.String r0 = "STATE_PREVIEW_SPEAK"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L69
            goto L3e
        L69:
            X.6i3 r0 = r8.LLFII
            r0.LJIILLIIL(r3)
            X.6i3 r0 = r8.LLFII
            r0.LJIILJJIL(r3)
            X.6i3 r0 = r8.LLFII
            r0.LJIILL(r2)
            goto L4d
        L79:
            java.lang.String r0 = "STATE_PREVIEW_PLAYING"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L82
            goto L3e
        L82:
            X.6i3 r0 = r8.LLFII
            r0.LJIILLIIL(r1)
            X.6i3 r0 = r8.LLFII
            r0.LJIILJJIL(r1)
            X.6i3 r0 = r8.LLFII
            r0.LJIILL(r1)
            goto L4d
        L92:
            java.lang.String r0 = "STATE_PREVIEW_PREVIEW"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L9b
            goto L3e
        L9b:
            X.6i3 r1 = r8.LLFII
            r0 = 2
            r1.LJIILLIIL(r0)
            X.6i3 r0 = r8.LLFII
            r0.LJIILJJIL(r3)
            X.6i3 r0 = r8.LLFII
            r0.LJIILL(r2)
            goto L4d
        Lac:
            java.lang.String r0 = "STATE_PREVIEW_CANCEL"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto Lb5
            goto L3e
        Lb5:
            X.6i3 r0 = r8.LLFII
            r0.LJIILLIIL(r1)
            X.6i3 r0 = r8.LLFII
            r0.LJIILJJIL(r1)
            X.6i3 r0 = r8.LLFII
            r0.LJIILL(r2)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WZJ.LLJJIJI():void");
    }

    public final void LLJJIJIL() {
        int LJLLLLLL = this.LJLILLLLZI.LJLLLLLL(this.LL);
        int size = this.LJLILLLLZI.LJLJLJ.size();
        if (size > 0 && LJLLLLLL >= 0 && size > LJLLLLLL) {
            RecyclerView recyclerView = this.LJLJLLL;
            if (recyclerView != null) {
                recyclerView.post(new ARunnableS18S0101000_14(LJLLLLLL, this, 11));
            } else {
                o.LJIJI("bottomRecyclerView");
                throw null;
            }
        }
        LLJJIJI();
    }

    public final void LLJJJ() {
        AbstractC77373UYf abstractC77373UYf = this.LL;
        if (abstractC77373UYf instanceof C77374UYg) {
            this.LLFII.LJIIIIZZ();
        } else if (abstractC77373UYf instanceof C77372UYe) {
            this.LLFII.LJIILIIL(C86793Y4n.LJIJJ(abstractC77373UYf));
            this.LLFII.LJIIJJI();
        }
        LLJJIJI();
    }

    @Override // X.WLP
    public final void initView() {
        super.initView();
        View requireViewById = requireViewById(R.id.kwd);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.svc_bottom_layout)");
        this.LJLJJLL = requireViewById;
        View requireViewById2 = requireViewById(R.id.kwe);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.svc_panel_layout)");
        this.LJLJL = requireViewById2;
        View requireViewById3 = requireViewById(R.id.j7z);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.root_slide_slip_vc)");
        this.LJLJLJ = requireViewById3;
        View requireViewById4 = requireViewById(R.id.j_l);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.rv_slide_slip_vc)");
        RecyclerView recyclerView = (RecyclerView) requireViewById4;
        this.LJLJLLL = recyclerView;
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        recyclerView.setAdapter(this.LJLILLLLZI);
        recyclerView.setLayoutManager(new CenterLayoutManager(requireActivity));
        this.LJLJI.LIZIZ(recyclerView);
        recyclerView.LJIIJJI(this.LJLJJI);
        recyclerView.LJII(new C4KW(C7MY.LIZIZ(1), C47135Ieh.LIZ(30, C143205jg.LJ() / 2)), -1);
        View requireViewById5 = requireViewById(R.id.j7_);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.root_close_x_mark_vc)");
        this.LJLL = requireViewById5;
        View requireViewById6 = requireViewById(R.id.j7f);
        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.root_expand_vc_panel_vc)");
        this.LJLLI = requireViewById6;
        View requireViewById7 = requireViewById(R.id.cfo);
        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.download_background_vc)");
        this.LJLLILLLL = requireViewById7;
        View requireViewById8 = requireViewById(R.id.jmp);
        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.selected_vc_name_vc)");
        this.LJLLJ = (TuxTextView) requireViewById8;
        View requireViewById9 = requireViewById(R.id.cg0);
        o.LJIIIIZZ(requireViewById9, "requireViewById(R.id.download_progress_vc)");
        this.LJLLL = (TDV) requireViewById9;
        View requireViewById10 = requireViewById(R.id.lb5);
        o.LJIIIIZZ(requireViewById10, "requireViewById(R.id.tiv_speak_state_vc)");
        this.LJLLLL = (TuxIconView) requireViewById10;
        View requireViewById11 = requireViewById(R.id.lb4);
        o.LJIIIIZZ(requireViewById11, "requireViewById(R.id.tiv_preview_state_svc)");
        this.LJLLLLLL = requireViewById11;
        View requireViewById12 = requireViewById(R.id.n2o);
        o.LJIIIIZZ(requireViewById12, "requireViewById(R.id.vad_tips_guide_container)");
        this.LJLZ = requireViewById12;
        View requireViewById13 = requireViewById(R.id.n2p);
        o.LJIIIIZZ(requireViewById13, "requireViewById(R.id.vad_tips_guide_text)");
        this.LJZ = (TuxTextView) requireViewById13;
        View requireViewById14 = requireViewById(R.id.n2q);
        o.LJIIIIZZ(requireViewById14, "requireViewById(R.id.vad_tips_guide_wave)");
        this.LJZI = requireViewById14;
        View requireViewById15 = requireViewById(R.id.n36);
        o.LJIIIIZZ(requireViewById15, "requireViewById(R.id.vc_touch_outside)");
        this.LLFF = requireViewById15;
        View requireViewById16 = requireViewById(R.id.bes);
        o.LJIIIIZZ(requireViewById16, "requireViewById(R.id.clear_vc)");
        this.LLFFF = requireViewById16;
        o.LJIIIIZZ(requireViewById(R.id.laq), "requireViewById(R.id.title_vc)");
        View requireViewById17 = requireViewById(R.id.ndp);
        o.LJIIIIZZ(requireViewById17, "requireViewById(R.id.voice_filter_layout_vc)");
        ViewGroup viewGroup = (ViewGroup) requireViewById17;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = C7MY.LIZIZ(0);
        viewGroup.setLayoutParams(marginLayoutParams);
        requireSceneContext();
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(4);
        C167676i3 c167676i3 = this.LLFII;
        Context context = this.mView.getContext();
        o.LJIIIIZZ(context, "view.context");
        RecyclerView LIZLLL = c167676i3.LIZLLL(context, gridLayoutManager, new AbstractC030309z() { // from class: X.4am
            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view, RecyclerView recyclerView2, C0AC c0ac) {
                int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView2, "parent", c0ac, "state", view);
                if (LIZJ == -1) {
                    return;
                }
                GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
                int i = gridLayoutManager2.LLIIIL;
                gridLayoutManager2.LLIILII.LJFF(LIZJ);
                GridLayoutManager.this.LLIILII.LJ(LIZJ, i);
                if (LIZJ < i) {
                    rect.top = C7MY.LIZIZ(16);
                }
            }
        });
        if (LIZLLL == null) {
            return;
        }
        this.LLF = LIZLLL;
        LIZLLL.getRecycledViewPool().setMaxRecycledViews(0, 16);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, C7MY.LIZIZ(268));
        layoutParams2.setMarginStart((int) (C143205jg.LJ() * 0.02d));
        layoutParams2.setMarginEnd((int) (C143205jg.LJ() * 0.02d));
        RecyclerView recyclerView2 = this.LLF;
        if (recyclerView2 != null) {
            viewGroup.addView(recyclerView2, layoutParams2);
            this.LLFII.LJFF(this.LLFZ);
            this.LLFII.LJIIJ(this.LLI);
            return;
        }
        o.LJIJI("panelRecyclerView");
        throw null;
    }

    @Override // X.WLP, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLFII.onDestroy();
    }

    @Override // X.WLP, X.AbstractC56012Ht
    public final void onHide() {
        super.onHide();
    }

    @Override // X.WLP, X.AbstractC56012Ht
    public final void onShow() {
        super.onShow();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0128, code lost:
    
        if (r10.equals("STATE_PREVIEW_CANCEL") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (r10.equals("STATE_PREVIEW_NONE") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x012c, code lost:
    
        r0 = r9.LJLLILLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x012e, code lost:
    
        if (r0 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0130, code lost:
    
        X.C87277YNd.LJJIJIIJI(r0, false);
        r0 = r9.LJLLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0135, code lost:
    
        if (r0 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0137, code lost:
    
        X.C87277YNd.LJJIJIIJI(r0, false);
        r0 = r9.LJLLLLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013c, code lost:
    
        if (r0 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013e, code lost:
    
        X.C87277YNd.LJJIJIIJI(r0, false);
        r0 = r9.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0143, code lost:
    
        if (r0 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0145, code lost:
    
        X.C87277YNd.LJJIJIIJI(r0, false);
        r0 = r9.LJLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014a, code lost:
    
        if (r0 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014c, code lost:
    
        X.C87277YNd.LJJIJIIJI(r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b1, code lost:
    
        kotlin.jvm.internal.o.LJIJI("circleProcessView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b5, code lost:
    
        kotlin.jvm.internal.o.LJIJI("selectedTextView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b9, code lost:
    
        kotlin.jvm.internal.o.LJIJI("selectedPreviewIconStateView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01bd, code lost:
    
        kotlin.jvm.internal.o.LJIJI("selectedSpeakerIconStateView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c1, code lost:
    
        kotlin.jvm.internal.o.LJIJI("selectedBgView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        if (r10.equals("STATE_PREVIEW_EMPTY") == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJIJIIJIL(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WZJ.LLJJIJIIJIL(java.lang.String):void");
    }
}
