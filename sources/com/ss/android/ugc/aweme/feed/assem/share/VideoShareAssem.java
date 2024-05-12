package com.ss.android.ugc.aweme.feed.assem.share;

import X.AbstractChoreographerFrameCallbackC57253MdV;
import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.AnonymousClass806;
import X.AnonymousClass808;
import X.AnonymousClass843;
import X.C110614Vt;
import X.C16880lQ;
import X.C1DH;
import X.C202657xN;
import X.C202677xP;
import X.C202697xR;
import X.C204037zb;
import X.C204047zc;
import X.C204057zd;
import X.C204067ze;
import X.C204077zf;
import X.C204087zg;
import X.C204107zi;
import X.C204117zj;
import X.C204147zm;
import X.C204157zn;
import X.C204167zo;
import X.C204177zp;
import X.C204187zq;
import X.C204247zw;
import X.C204267zy;
import X.C2043580h;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C241249dQ;
import X.C33915DSt;
import X.C57252MdU;
import X.C5H3;
import X.C61328O5c;
import X.C61845OOz;
import X.C62822Ol8;
import X.C62846OlW;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C79004UzY;
import X.C8T7;
import X.C8YN;
import X.InterfaceC109344Qw;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import Y.IDCListenerS296S0100000_3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import o3.IDaS89S0000000_3;
import o3.h0;

/* loaded from: classes4.dex */
public class VideoShareAssem extends BaseCellSlotComponent<VideoShareAssem> implements View.OnClickListener, ComponentPriorityProtocol {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIILII;
    public ValueAnimator LLFII;
    public C2043580h LLFZ;
    public final C62822Ol8 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final InterfaceC115514g7 LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;
    public C204117zj LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public final C62822Ol8 LLIIL;

    static {
        TBT tbt = new TBT(VideoShareAssem.class, "videoShareVM", "getVideoShareVM()Lcom/ss/android/ugc/aweme/feed/assem/share/VideoShareViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIILII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(VideoShareAssem.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0, c65351Pkp)};
    }

    public void C4() {
        C8YN.LJII(this, (AssemViewModel) this.LLII.LIZ(this, LLIILII[1]), new TBT() { // from class: X.7ya
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C203457yf) obj).LJLIL;
            }
        }, null, C204047zc.LJLIL, 6);
    }

    public void D4() {
        C8YN.LJII(this, z4(), new TBT() { // from class: X.7zr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C204237zv) obj).LJLJI;
            }
        }, null, C204267zy.LJLIL, 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int W3() {
        return R.layout.adc;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "right_container_share";
    }

    public VideoShareAssem() {
        new LinkedHashMap();
        this.LLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 366));
        C65776Prg LIZ = C65352Pkq.LIZ(VideoShareViewModel.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 363), null, C204157zn.INSTANCE, null, null);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(RightAreaContainerVM.class);
        this.LLII = C214348b8.LIZ(this, LIZ2, c241249dQ, new AqS153S0100000_3(LIZ2, 364), null, C204167zo.INSTANCE, null, null);
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C204177zp.INSTANCE);
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C204187zq.INSTANCE);
        this.LLIIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 365));
    }

    public final void A4() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator duration;
        if (C204147zm.LIZJ) {
            View findViewById = Y3().findViewById(R.id.jt3);
            if (findViewById != null && (animate = findViewById.animate()) != null && (scaleX = animate.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null && (duration = scaleY.setDuration(150L)) != null) {
                duration.start();
                return;
            }
            return;
        }
        Y3().findViewById(R.id.jt3).animate().scaleX(1.02f).scaleY(1.02f).setDuration(150L).withEndAction(new ARunnableS39S0100000_3(this, 69)).start();
    }

    public final void E4() {
        if (((Boolean) AnonymousClass808.LIZ.getValue()).booleanValue()) {
            C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 71));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void b4() {
        if (this.LLIIIZ) {
            this.LLIIIZ = false;
            InterfaceC109344Qw shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            C62846OlW c62846OlW = (C62846OlW) Y3().findViewById(R.id.jtf);
            o.LJIIIIZZ(c62846OlW, "contentView.share_iv");
            shareService.LJIILJJIL(LIZ, c62846OlW);
        }
    }

    public final C204117zj u4() {
        if (this.LLIIIJ == null) {
            C204117zj c204117zj = new C204117zj();
            this.LLIIIJ = c204117zj;
            Context context = getContext();
            boolean z = false;
            if (context != null && !C79004UzY.LJJIJIIJI(context)) {
                z = true;
            }
            c204117zj.LIZ = z;
        }
        return this.LLIIIJ;
    }

    public final VideoShareViewModel z4() {
        return (VideoShareViewModel) this.LLIFFJFJJ.LIZ(this, LLIILII[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void LLLZIIL() {
        z4().LJLL.LIZIZ(VideoShareViewModel.LJZI[0], null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    public void q4() {
        Context context = getContext();
        if (context != null && C79004UzY.LJJIJIIJI(context)) {
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII((ConstraintLayout) Y3().findViewById(R.id.jt3));
            anonymousClass064.LJIIIIZZ(Y3().findViewById(R.id.jtf).getId(), 4, Y3().findViewById(R.id.jt3).getId(), 4);
            anonymousClass064.LIZIZ((ConstraintLayout) Y3().findViewById(R.id.jt3));
        }
    }

    public final void r4() {
        ConstraintLayout constraintLayout = (ConstraintLayout) Y3().findViewById(R.id.jt3);
        if (constraintLayout != null) {
            E4();
            Animation animation = constraintLayout.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(constraintLayout, 70));
        }
        z4().mv0();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void a4() {
        r4();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        this.LLIIJI = false;
        this.LLIIJLIL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
        n3((VideoItemParams) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x037b, code lost:
    
        if (r15.equals("homepage_hot") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x039d, code lost:
    
        X.EF7.LIZIZ();
        X.FMX.LJI(0, "click_share_button", r15, r0.getAid(), r1.nv0(r0));
        r12 = X.C220488l2.LIZIZ;
        r8 = new X.C200757uJ();
        r8.LIZLLL = r15;
        r8.LJJIIZ(r0);
        r8.LJJLIIIJJI = (java.lang.String) r3.get("playlist_id", "");
        r8.LJJLIIIJILLIZJL = (java.lang.String) r3.get("playlist_id_key", "");
        r8.LJJLIIIJ = (java.lang.String) r3.get("playlist_type", "");
        r8.LJIILL = (java.lang.String) r3.get("tab_name", "");
        r8.LJIILLIIL = X.C227768wm.LJIIL(r1.LJLILLLLZI, r0);
        r3 = r0.getAuthor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03e7, code lost:
    
        if (r3 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03e9, code lost:
    
        r3 = r3.getUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03ed, code lost:
    
        if (r3 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03f0, code lost:
    
        r8.LJJLI = r3;
        r6 = r1.LJLJI;
        r3 = r1.gv0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03fa, code lost:
    
        if (r3 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03fc, code lost:
    
        r5 = r3.mFrom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03fe, code lost:
    
        com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel.lv0(r8, r0, r6, r5);
        r8.LJJZZI = X.C54838Lfe.LJI(r0);
        r8.LJJJJZ = X.C222578oP.LJFF(r0.getAuthor());
        r8.LJJZ = java.lang.Boolean.valueOf(X.C54838Lfe.LJJI(r0));
        r8.LJJZZIII = X.C222578oP.LJI(r0);
        r8.LJJLL = X.C79004UzY.LJJJIL(r1.getContext(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x042b, code lost:
    
        if (r4 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x042d, code lost:
    
        r1 = r4.isConnected();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0431, code lost:
    
        r8.LJL = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0433, code lost:
    
        if (r4 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0435, code lost:
    
        r1 = r4.LJIILJJIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0439, code lost:
    
        if (r1 != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x044e, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x043b, code lost:
    
        r8.LJLI = r2;
        com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel.kv0(r0, r8);
        X.V0N.LJIIIZ(r8, r0);
        ((X.JHM) r12.LJII(r0, r8)).LJIILIIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0450, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03ef, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0385, code lost:
    
        if (r15.equals("homepage_popular") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x038f, code lost:
    
        if (r15.equals("homepage_friends") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0399, code lost:
    
        if (r15.equals("homepage_nearby") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0177, code lost:
    
        if (r7 == 2004) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0576, code lost:
    
        if (X.C63081OpJ.LLFII(r0) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0241  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 1480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem.onClick(android.view.View):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View findViewById;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (C202677xP.LIZIZ()) {
            C16880lQ.LJIIJ(this, Y3());
        }
        C16880lQ.LJJJJJL((C62846OlW) Y3().findViewById(R.id.jtf), this);
        AnonymousClass806 anonymousClass806 = new AnonymousClass806(0.6f);
        if (IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIJJLI()) {
            anonymousClass806.LJLILLLLZI = IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJII();
            Y3().findViewById(R.id.jtf).setHapticFeedbackEnabled(false);
            Y3().findViewById(R.id.jtf).setOnLongClickListener(new IDCListenerS296S0100000_3(this, 7));
        }
        Y3().findViewById(R.id.jtf).setOnTouchListener(anonymousClass806);
        q4();
        C16880lQ.LJJJJI((TuxTextView) Y3().findViewById(R.id.jt6), this);
        C33915DSt.LJLIL.LJLIL(getContainerView().findViewById(R.id.jt6));
        C16880lQ.LJIIZILJ((LinearLayout) Y3().findViewById(R.id.c_x), this);
        C16880lQ.LJIL((ConstraintLayout) Y3().findViewById(R.id.jt3), this);
        h0.LJIJI(Y3().findViewById(R.id.c_x), new IDaS89S0000000_3(1));
        Context context = getContext();
        if (context != null && (findViewById = Y3().findViewById(R.id.ce6)) != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
            c110614Vt.LIZJ = C61328O5c.LIZJ(18);
            findViewById.setBackground(c110614Vt.LIZ(context));
        }
        C204117zj u4 = u4();
        if (u4 != null) {
            u4.LIZIZ = getContainerView();
            u4.LIZJ = Y3();
            u4.LIZLLL = (ConstraintLayout) Y3().findViewById(R.id.jt3);
            u4.LJFF = (TuxTextView) view.findViewById(R.id.jt6);
            u4.LJ = (C62846OlW) Y3().findViewById(R.id.jtf);
        }
        C4();
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.7zk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), C204107zi.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.7zl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), C204077zf.LJLIL, 4);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.7xM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLL;
            }
        }, null, C204067ze.LJLIL, 6);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.7xJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJLLL;
            }
        }, null, C204087zg.LJLIL, 6);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.7xK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLJL;
            }
        }, null, C204057zd.LJLIL, 6);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.7xL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLIL;
            }
        }, null, C202657xN.LJLIL, 6);
        C8YN.LJIIJ(this, z4(), new TBT() { // from class: X.7zs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C204237zv) obj).LJLJJLL;
            }
        }, new TBT() { // from class: X.7zt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C204237zv) obj).LJLILLLLZI;
            }
        }, null, C204247zw.LJLIL, 12);
        D4();
        C8YN.LJII(this, z4(), new TBT() { // from class: X.7zu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C204237zv) obj).LJLJJI;
            }
        }, null, C204037zb.LJLIL, 6);
        C8YN.LJII(this, z4(), new TBT() { // from class: X.7zZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C204237zv) obj).LJLJL;
            }
        }, C213688a4.LJ(), C202697xR.LJLIL, 4);
        if (AnonymousClass843.LIZ()) {
            C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 72));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: p4 */
    public final void n3(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        VideoShareViewModel z4 = z4();
        z4.LJLL.LIZIZ(VideoShareViewModel.LJZI[0], getContext());
    }

    public final void B4(float f, float f2, View view) {
        AbstractChoreographerFrameCallbackC57253MdV abstractChoreographerFrameCallbackC57253MdV;
        if (((Boolean) AnonymousClass808.LIZ.getValue()).booleanValue()) {
            ValueAnimator valueAnimator = this.LLFII;
            if (valueAnimator != null) {
                valueAnimator.end();
                C57252MdU.LIZ(this.LLFZ);
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
                this.LLFII = ofFloat;
                if (ofFloat != null) {
                    ofFloat.setDuration(600L);
                }
                ValueAnimator valueAnimator2 = this.LLFII;
                if (valueAnimator2 != null) {
                    valueAnimator2.setRepeatMode(2);
                }
                ValueAnimator valueAnimator3 = this.LLFII;
                if (valueAnimator3 != null) {
                    valueAnimator3.setRepeatCount(-1);
                }
                C2043580h c2043580h = new C2043580h((ConstraintLayout) view);
                this.LLFZ = c2043580h;
                ValueAnimator valueAnimator4 = this.LLFII;
                if (valueAnimator4 != null) {
                    valueAnimator4.addUpdateListener(c2043580h);
                }
            }
            ValueAnimator valueAnimator5 = this.LLFII;
            if (valueAnimator5 != null) {
                valueAnimator5.start();
            }
            C2043580h c2043580h2 = this.LLFZ;
            if (c2043580h2 != null && (abstractChoreographerFrameCallbackC57253MdV = (AbstractChoreographerFrameCallbackC57253MdV) C57252MdU.LIZ.getValue()) != null) {
                abstractChoreographerFrameCallbackC57253MdV.LIZ(c2043580h2);
                return;
            }
            return;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(600L);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        view.startAnimation(scaleAnimation);
    }
}
