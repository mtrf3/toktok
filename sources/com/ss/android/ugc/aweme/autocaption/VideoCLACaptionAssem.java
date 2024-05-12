package com.ss.android.ugc.aweme.autocaption;

import X.ACR;
import X.ACW;
import X.AGM;
import X.AK4;
import X.C16880lQ;
import X.C214348b8;
import X.C221108m2;
import X.C232749Bm;
import X.C232759Bn;
import X.C240999d1;
import X.C26045AKb;
import X.C2K0;
import X.C2U8;
import X.C2Y1;
import X.C34K;
import X.C36922EeM;
import X.C41032G8m;
import X.C47261Igj;
import X.C51029K0z;
import X.C52280KfU;
import X.C53146KtS;
import X.C53256KvE;
import X.C53379KxD;
import X.C55096Ljo;
import X.C5H3;
import X.C61845OOz;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69595RTb;
import X.C69596RTc;
import X.C6DJ;
import X.C76732zl;
import X.C79004UzY;
import X.C82682Wcg;
import X.C86645XzV;
import X.C86647XzX;
import X.C86652Xzc;
import X.C86661Xzl;
import X.C86670Xzu;
import X.C86671Xzv;
import X.C86672Xzw;
import X.C86673Xzx;
import X.C86674Xzy;
import X.C86675Xzz;
import X.C86677Y0b;
import X.C86682Y0g;
import X.C86699Y0x;
import X.C86700Y0y;
import X.C8LG;
import X.C8QI;
import X.C8T7;
import X.C8YN;
import X.C90193gN;
import X.EnumC86689Y0n;
import X.EnumC86698Y0w;
import X.EnumC86730Y2c;
import X.EnumC86777Y3x;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC74236TBo;
import X.InterfaceC82683Wch;
import X.KL2;
import X.L2D;
import X.QD3;
import X.RVC;
import X.TBT;
import X.VLK;
import X.WHL;
import X.X1D;
import X.Y00;
import X.Y03;
import X.Y04;
import X.Y05;
import X.Y08;
import X.Y0F;
import X.Y0L;
import X.Y0Q;
import X.Y0S;
import X.Y0T;
import X.Y0U;
import X.Y0V;
import X.Y0X;
import X.Y0Z;
import X.Y11;
import X.Y16;
import X.Y19;
import X.Y1B;
import X.Y1D;
import X.Y1F;
import X.Y1K;
import X.Y1R;
import X.Y2G;
import X.Y37;
import X.Z9N;
import Y.ALAdapterS12S0100000_15;
import Y.ALAdapterS6S0110000_15;
import Y.ARunnableS40S0100000_4;
import Y.AUListenerS102S0100000_15;
import Y.AUListenerS10S0102000_15;
import Y.AUListenerS15S0310000_15;
import Y.IDAListenerS82S0100000_15;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.cla.et.newet.SeeOriginalShowEvent;
import com.ss.android.ugc.aweme.cla.et.newet.SeeTranslationShowEvent;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.CLACaptionAbility;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS6S0600000_15;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes16.dex */
public final class VideoCLACaptionAssem extends BaseCellSlotComponent implements CLACaptionAbility, ComponentPriorityProtocol, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIZ;
    public final C62822Ol8 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public InterfaceC82683Wch LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public C86675Xzz LLIIIILZ;
    public boolean LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C62822Ol8 LLIILII;
    public final C62822Ol8 LLIILZL;

    static {
        TBT tbt = new TBT(VideoCLACaptionAssem.class, "translationViewModel", "getTranslationViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(VideoCLACaptionAssem.class, "claCaptionVM", "getClaCaptionVM()Lcom/ss/android/ugc/aweme/autocaption/VideoCLACaptionViewModel;", 0, c65351Pkp)};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.vg;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "left_container_cla_caption";
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1841867199) {
            return null;
        }
        return this;
    }

    public VideoCLACaptionAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(Y1K.LJLIL);
        this.LLFZ = z4().LIZJ(this);
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCLACaptionViewModel.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ, c240999d1, new AqS154S0100000_4(LIZ, 56), null, Y1F.INSTANCE, null, null);
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C232749Bm.INSTANCE);
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C232759Bn.INSTANCE);
        this.LLIIIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 220));
        this.LLIIIZ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 54));
        this.LLIIJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 217));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 55));
        this.LLIIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 216));
        this.LLIILII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 219));
        this.LLIILZL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 218));
    }

    public final void C4() {
        View view;
        C86675Xzz c86675Xzz = this.LLIIIILZ;
        Aweme aweme = null;
        if (c86675Xzz != null) {
            if (c86675Xzz.LIZIZ().LJ) {
                view = c86675Xzz.LIZIZ().LIZIZ.getToolTipTarget();
            } else {
                view = c86675Xzz.LIZJ().LJ.getToolTipTarget();
            }
        } else {
            view = null;
        }
        if (getContext() == null || !r4().wv0() || view == null) {
            return;
        }
        Context context = getContext();
        o.LJI(context);
        int i = -((int) KL2.LIZJ(context, 8.0f));
        VideoCLACaptionViewModel r4 = r4();
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(this, 221);
        AqS165S0100000_15 aqS165S0100000_152 = new AqS165S0100000_15(this, 222);
        AqS165S0100000_15 aqS165S0100000_153 = new AqS165S0100000_15(this, 223);
        AqS165S0100000_15 aqS165S0100000_154 = new AqS165S0100000_15(this, 224);
        r4.getClass();
        C34K c34k = new C34K();
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "anchor.context");
        C6DJ c6dj = new C6DJ(context2);
        c6dj.LIZ.LIZIZ = view;
        c6dj.LJIIIIZZ(view.getContext().getResources().getColor(R.color.cy));
        c6dj.LIZ.LJII = -1001L;
        c6dj.LJIIJJI(new AqS6S0600000_15(r4, c34k, aqS165S0100000_15, aqS165S0100000_152, aqS165S0100000_154, aqS165S0100000_153, 1));
        c6dj.LJII(new AqS165S0100000_15(r4, 779));
        c6dj.LJ(new AqS162S0100000_12(r4, 1048));
        c6dj.LIZ.LJFF = i;
        c6dj.LJFF();
        C82682Wcg c82682Wcg = c6dj.LIZ;
        c82682Wcg.LJIJJLI = true;
        c82682Wcg.LJIIIIZZ = C86652Xzc.LJLLL;
        c6dj.LJI(WHL.TOP);
        InterfaceC82683Wch LIZJ = c6dj.LIZJ();
        if (!c34k.element) {
            LIZJ = null;
        }
        this.LLI = LIZJ;
        if (LIZJ == null) {
            return;
        }
        LIZJ.show();
        if (C79004UzY.LJJIJIIJI(getContext())) {
            Y3().postDelayed(new ARunnableS40S0100000_4(this, 21), 300L);
        }
        if (!L2D.LIZ()) {
            return;
        }
        if (X7()) {
            VideoItemParams gv0 = r4().gv0();
            if (gv0 != null) {
                aweme = gv0.getAweme();
            }
            if (Y04.LIZIZ(aweme)) {
                Y2G.LIZIZ(getVScope(), SeeTranslationShowEvent.class, C47261Igj.LJJIJ(new C2Y1(1)), true);
                return;
            } else {
                Y2G.LIZIZ(getVScope(), SeeTranslationShowEvent.class, C47261Igj.LJJIJ(new C2Y1(1)), true);
                return;
            }
        }
        Y2G.LIZIZ(getVScope(), SeeOriginalShowEvent.class, C47261Igj.LJJIJ(new C2Y1(1)), true);
    }

    public final int q4() {
        if (((Y1B) this.LLIIJI.getValue()).LIZJ == VLK.TRAILING_AUTO_LANGUAGE_ICON) {
            return 0;
        }
        return 8;
    }

    public final VideoCLACaptionViewModel r4() {
        return (VideoCLACaptionViewModel) this.LLIFFJFJJ.LIZ(this, LLIIZ[1]);
    }

    public final VideoViewModel u4() {
        return (VideoViewModel) this.LLII.getValue();
    }

    public final ITranslationService z4() {
        return (ITranslationService) this.LLFII.getValue();
    }

    public final void B4() {
        Aweme aweme;
        r4().setState(C69595RTb.LJLIL);
        AK4.LIZ().LJIILL(true);
        if (C41032G8m.LIZ()) {
            VideoCLACaptionViewModel r4 = r4();
            r4.getClass();
            VideoItemParams gv0 = r4.gv0();
            if (gv0 != null) {
                aweme = gv0.getAweme();
            } else {
                aweme = null;
            }
            if (o.LJ(C86670Xzu.LIZ(aweme), Boolean.FALSE)) {
                AK4.LIZ().LJIIJJI(true);
            } else {
                AK4.LIZ().LJJJ(true);
            }
            C2U8.LIZ(new C86645XzV(true, r4().lv0(), EnumC86777Y3x.CLICK_SUBTITLE, false));
        } else if (AK4.LIZ().LJJI()) {
            D4(false);
        } else {
            AK4.LIZ().LJIL(true);
            AK4.LIZ().LJJIII(false);
            C2U8.LIZ(new C86645XzV(true, r4().lv0(), EnumC86777Y3x.CLICK_SUBTITLE, false));
        }
        r4().qv0(EnumC86777Y3x.CLICK_ICON, getContext(), true);
    }

    public final void E4() {
        if (r4().ov0() && r4().LLZLL() != EnumC86689Y0n.HIDDEN) {
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLIIIL.getValue();
            if (interactAreaCommonAbility != null && interactAreaCommonAbility.vp()) {
                InteractAreaCommonAbility interactAreaCommonAbility2 = (InteractAreaCommonAbility) this.LLIIIL.getValue();
                if (interactAreaCommonAbility2 != null) {
                    interactAreaCommonAbility2.zn("left_container_cla_caption", this, true);
                    return;
                }
                return;
            }
            InteractAreaCommonAbility interactAreaCommonAbility3 = (InteractAreaCommonAbility) this.LLIIIL.getValue();
            if (interactAreaCommonAbility3 == null) {
                return;
            }
            interactAreaCommonAbility3.U00(this, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        if (!C53256KvE.LIZ()) {
            C8YN.LJII(this, (AssemViewModel) this.LLFZ.LIZ(this, LLIIZ[0]), Y37.LJLIL, null, Y0L.LJLIL, 6);
        }
        C8YN.LJII(this, r4(), new TBT() { // from class: X.Rb4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((RVC) obj).LJLJJI;
            }
        }, null, Y0Q.LJLIL, 6);
        C8YN.LJII(this, r4(), new TBT() { // from class: X.Rb5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((RVC) obj).LJLIL);
            }
        }, null, C86677Y0b.LJLIL, 6);
        C8YN.LJII(this, r4(), new TBT() { // from class: X.Rb6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((RVC) obj).LJLJJL);
            }
        }, null, Y08.LJLIL, 6);
        C8YN.LJII(this, r4(), new TBT() { // from class: X.Rb3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((RVC) obj).LJLILLLLZI;
            }
        }, null, Y0V.LJLIL, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
    
        if (r4 != null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F4() {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem.F4():void");
    }

    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final EnumC86689Y0n LLZLL() {
        return r4().LLZLL();
    }

    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final boolean X7() {
        return r4().LJLLILLLL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void c4() {
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
            if (C8LG.LIZ()) {
                VideoCLACaptionViewModel r4 = r4();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(r4.LLIIIL);
                LIZ.append("T ");
                r4.vv0(X1D.LIZIZ(LIZ));
            }
        } else if (C8LG.LIZ()) {
            VideoCLACaptionViewModel r42 = r4();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(r42.LLIIIL);
            LIZ2.append("t ");
            r42.vv0(X1D.LIZIZ(LIZ2));
        }
        if (C52280KfU.LIZ()) {
            VideoCLACaptionViewModel r43 = r4();
            r43.getClass();
            if (!AK4.LIZ().LJI()) {
                r43.setState(C69596RTc.LJLIL);
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void e4() {
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
            if (C8LG.LIZ()) {
                VideoCLACaptionViewModel r4 = r4();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(r4.LLIIIL);
                LIZ.append("F ");
                r4.vv0(X1D.LIZIZ(LIZ));
                return;
            }
            return;
        }
        if (!C8LG.LIZ()) {
            return;
        }
        C16880lQ.LLZILL(Toast.makeText(getContext(), "Unselected with no event", 0));
        VideoCLACaptionViewModel r42 = r4();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(r42.LLIIIL);
        LIZ2.append("f ");
        r42.vv0(X1D.LIZIZ(LIZ2));
    }

    public final InterfaceC55235Lm3 getVScope() {
        if (C53146KtS.LIZ()) {
            return (InterfaceC55235Lm3) this.LLIIIZ.getValue();
        }
        return C55096Ljo.LJIIZILJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
        C62814Ol0.LJJIIJZLJL(getVScope(), ETParamsProvider.class, C47261Igj.LJJIJIL(this.LLIIL.getValue()));
        C62814Ol0.LJJIIJZLJL(getVScope(), ETParamsProvider.class, C47261Igj.LJJIJIL(this.LLIILII.getValue()));
        C62814Ol0.LJJIIJZLJL(getVScope(), ETParamsProvider.class, C47261Igj.LJJIJIL(this.LLIILZL.getValue()));
    }

    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final void t20() {
        r4().LLIIII = true;
    }

    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final void Ai(EnumC86730Y2c triggerMethod) {
        o.LJIIIZ(triggerMethod, "triggerMethod");
        r4().kv0(triggerMethod);
    }

    public final void D4(boolean z) {
        C86675Xzz c86675Xzz;
        VideoCLACaptionViewModel r4 = r4();
        r4.getClass();
        Z9N.LIZIZ.LLFZ();
        if (!ACW.LIZIZ() || r4.LJLLILLLL) {
            r4.LJLLL = z;
            AK4.LIZ().LJJIII(r4.LJLLL);
        }
        if (!z) {
            r4.kv0(EnumC86730Y2c.CLICK_EXPAND);
        }
        C2U8.LIZ(new C86647XzX(!r4.LJLLL));
        if (!r4().LJLLLL && (c86675Xzz = this.LLIIIILZ) != null) {
            r4().getClass();
            String mv0 = r4().mv0();
            int q4 = q4();
            C86652Xzc c86652Xzc = c86675Xzz.LIZJ().LJ;
            c86652Xzc.getClass();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 200);
            ofInt.setDuration(200);
            c86652Xzc.LJLJI = ofInt;
            if (!C90193gN.LIZ()) {
                c86652Xzc.LIZ(R.id.b5f).setPivotX(0.0f);
            }
            c86652Xzc.LIZ(R.id.b5f).setPivotY(c86652Xzc.LIZ(R.id.b5f).getHeight());
            if (!z) {
                c86652Xzc.LIZ(R.id.b5f).setAlpha(1.0f);
                c86652Xzc.LIZ(R.id.b5f).setScaleX(1.0f);
                c86652Xzc.LIZ(R.id.b5f).setScaleY(1.0f);
                boolean isEmpty = TextUtils.isEmpty(mv0);
                C76732zl c76732zl = new C76732zl();
                int i = C86652Xzc.LJLLLLLL;
                c76732zl.element = i;
                C76732zl c76732zl2 = new C76732zl();
                c76732zl2.element = C86652Xzc.LJLL;
                if (isEmpty) {
                    c86652Xzc.LIZ(R.id.b5e).setVisibility(8);
                    c86652Xzc.LIZ(R.id.b5d).setVisibility(8);
                    TuxTextView tuxTextView = c86652Xzc.LJLILLLLZI;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(8);
                    }
                    ((ImageView) c86652Xzc.LIZ(R.id.lk7)).setVisibility(8);
                } else {
                    c86652Xzc.LIZ(R.id.b5e).setVisibility(0);
                    c86652Xzc.LIZ(R.id.b5d).setVisibility(0);
                    ((ImageView) c86652Xzc.LIZ(R.id.lk7)).setVisibility(q4);
                    ((TextView) c86652Xzc.LIZ(R.id.b5d)).setText(mv0);
                    c86652Xzc.LIZ(R.id.b5f).measure(View.MeasureSpec.makeMeasureSpec(i, LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(0, 0));
                    c76732zl.element = c86652Xzc.LIZ(R.id.b5f).getMeasuredWidth();
                    c76732zl2.element = c86652Xzc.LIZ(R.id.b5f).getMeasuredHeight();
                    if (C90193gN.LIZ()) {
                        c86652Xzc.LIZ(R.id.b5f).setPivotX(c76732zl.element);
                    }
                    c86652Xzc.LIZ(R.id.b5f).setPivotY(c76732zl2.element);
                }
                if (c76732zl.element > 0 && c76732zl2.element > 0) {
                    ofInt.addUpdateListener(new AUListenerS15S0310000_15(c86652Xzc, isEmpty, c76732zl, c76732zl2, 1));
                }
                ofInt.addListener(new ALAdapterS12S0100000_15(c86652Xzc, 20));
            } else {
                int width = c86652Xzc.LIZ(R.id.b5f).getWidth();
                int height = c86652Xzc.LIZ(R.id.b5f).getHeight();
                if (C90193gN.LIZ()) {
                    c86652Xzc.LIZ(R.id.b5f).setPivotX(width);
                }
                ((ImageView) c86652Xzc.LIZ(R.id.bgr)).setVisibility(0);
                if (!C53379KxD.LIZ()) {
                    c86652Xzc.LIZ(R.id.bgr).setAlpha(0.0f);
                }
                if (width > 0 && height > 0) {
                    ofInt.addUpdateListener(new AUListenerS10S0102000_15(c86652Xzc, width, height, 1));
                }
                ofInt.addListener(new ALAdapterS6S0110000_15(c86652Xzc, c86652Xzc.LJLJJL, 0));
            }
            ofInt.start();
            Y0S LIZIZ = c86675Xzz.LIZIZ();
            ValueAnimator valueAnimator = LIZIZ.LIZJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            LIZIZ.LIZIZ.setCaptionControlIconAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(LIZIZ.LIZIZ.getCaptionControlIconAlpha(), 0.5f);
            ofFloat.setDuration(1500L);
            ofFloat.setStartDelay(3000L);
            ofFloat.addListener(new IDAListenerS82S0100000_15(LIZIZ, 3));
            ofFloat.addUpdateListener(new AUListenerS102S0100000_15(LIZIZ, 20));
            ofFloat.start();
            LIZIZ.LIZJ = ofFloat;
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        boolean z;
        BaseFeedPageParams baseFeedPageParams;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        E4();
        if (a1().LIZ == 28 && (baseFeedPageParams = a1().LJ) != null) {
            r4().LJLLILLLL = baseFeedPageParams.isOriginalCaption;
        }
        CaptionItemModel LJIIIIZZ = C86670Xzu.LJIIIIZZ(item.getAweme());
        if (LJIIIIZZ != null) {
            z = LJIIIIZZ.isAutoGenerated();
        } else {
            z = true;
        }
        getContainerView().setTag(C8QI.LJII, Boolean.valueOf(!z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.service.CLACaptionAbility
    public final boolean Md0(String str) {
        if (o.LJ(r4().lv0(), str) && ((RVC) r4().getState()).LJLJJL) {
            return true;
        }
        return false;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAutoGeneratedCaptionTempEvent(ACR event) {
        o.LJIIIZ(event, "event");
        F4();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAutoGeneratedCaptionToggleEvent(C86645XzV event) {
        Aweme aweme;
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme ");
        String str = event.LJLILLLLZI;
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(" trigger caption toggle from ");
        LIZ.append(event.LJLJI);
        LIZ.append("; isShown: ");
        LIZ.append(event.LJLIL);
        C36922EeM.LIZLLL(4, "ToggleCaption", X1D.LIZIZ(LIZ));
        if (C53379KxD.LIZ()) {
            if (o.LJ(event.LJLILLLLZI, r4().lv0()) && r4().wv0()) {
                VideoItemParams gv0 = r4().gv0();
                if (gv0 != null) {
                    aweme = gv0.getAweme();
                } else {
                    aweme = null;
                }
                if (C86670Xzu.LIZJ(aweme)) {
                    EnumC86777Y3x enumC86777Y3x = event.LJLJI;
                    boolean z = event.LJLIL;
                    AK4.LIZ();
                    if (z) {
                        if (enumC86777Y3x == EnumC86777Y3x.SHARE_PANEL) {
                            C26045AKb c26045AKb = new C26045AKb(Y3());
                            c26045AKb.LJIIIIZZ(R.string.gii);
                            c26045AKb.LJIIJ();
                        } else {
                            C26045AKb c26045AKb2 = new C26045AKb(Y3());
                            c26045AKb2.LJIIIIZZ(R.string.gig);
                            c26045AKb2.LJIIJ();
                        }
                    } else if (enumC86777Y3x == EnumC86777Y3x.SHARE_PANEL) {
                        C26045AKb c26045AKb3 = new C26045AKb(Y3());
                        c26045AKb3.LJIIIIZZ(R.string.gih);
                        c26045AKb3.LJIIJ();
                    } else {
                        C26045AKb c26045AKb4 = new C26045AKb(Y3());
                        c26045AKb4.LJIIIIZZ(R.string.gie);
                        c26045AKb4.LJIIJ();
                    }
                    if (event.LJLJJI) {
                        if (event.LJLIL) {
                            r4().qv0(event.LJLJI, getContext(), false);
                        } else {
                            r4().rv0(event.LJLJI, getContext());
                        }
                    }
                    if (event.LJLIL) {
                        Ai(EnumC86730Y2c.TOGGLE_ENABLE);
                    }
                }
            }
            if (C52280KfU.LIZ()) {
                r4().setState(C69596RTc.LJLIL);
            }
            r4().LJLLL = AK4.LIZ().LJI();
            F4();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAutogeneratedCaptionTurnoffPendingEvent(AGM event) {
        o.LJIIIZ(event, "event");
        F4();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShowSubtitleOptions(Y19 event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLIL, r4().lv0()) && event.LJLILLLLZI != null) {
            VideoCLACaptionViewModel r4 = r4();
            EnumC86777Y3x enterMethod = event.LJLJI;
            String str = event.LJLJJI;
            String str2 = event.LJLILLLLZI;
            if (str2 == null) {
                str2 = "";
            }
            int LJJJIL = C79004UzY.LJJJIL(getContext(), ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
            r4.getClass();
            o.LJIIIZ(enterMethod, "enterMethod");
            if (r4.wv0()) {
                C86661Xzl.LJIIZILJ(r4.nv0(), r4.LJLLILLLL, enterMethod, str2, str, r4.LLZLL(), null, null, null, LJJJIL, 224);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x018b, code lost:
    
        if (1 == 1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @X.QD3(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onVideoPlayEventLog(X.J8H r18) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem.onVideoPlayEventLog(X.J8H):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C86652Xzc c86652Xzc;
        boolean z;
        Aweme aweme;
        CaptionItemModel LIZLLL;
        o.LJIIIZ(view, "view");
        Y00 y00 = (Y00) Y3().findViewById(R.id.c4k);
        if (y00 != null && (c86652Xzc = (C86652Xzc) Y3().findViewById(R.id.h_z)) != null) {
            Context context = c86652Xzc.getContext();
            o.LJIIIIZZ(context, "oldCaptionView.context");
            r4().lv0();
            boolean pv0 = r4().pv0();
            VideoItemParams gv0 = r4().gv0();
            if (gv0 != null && (aweme = gv0.getAweme()) != null && (LIZLLL = Y04.LIZLLL(aweme)) != null && o.LJ(LIZLLL.getVersionType(), "20")) {
                z = true;
            } else {
                z = false;
            }
            r4().getClass();
            C86675Xzz c86675Xzz = new C86675Xzz(context, pv0, z, c86652Xzc, y00, new C86673Xzx(this), new Y03(this));
            Y0S LIZIZ = c86675Xzz.LIZIZ();
            Y00 y002 = LIZIZ.LIZIZ;
            y002.setDelegate(new C86682Y0g(y002, LIZIZ));
            if (LIZIZ.LIZJ == null) {
                LIZIZ.LIZIZ.setCaptionControlIconAlpha(0.5f);
            }
            Y1D LIZJ = c86675Xzz.LIZJ();
            LIZJ.LJ.setDelegate(new Y1R(LIZJ));
            c86675Xzz.LJI(r4().LLZLL());
            Context context2 = getContext();
            if (context2 != null && C79004UzY.LJJIJIIJI(context2)) {
                c86675Xzz.LJFF(EnumC86698Y0w.LANDSCAPE);
            } else if (C53379KxD.LIZ()) {
                c86675Xzz.LJFF(EnumC86698Y0w.PORTRAIT_FC2);
            } else {
                c86675Xzz.LJFF(EnumC86698Y0w.PORTRAIT_NON_FC2);
            }
            this.LLIIIILZ = c86675Xzz;
        }
        C8YN.LJII(this, u4(), new TBT() { // from class: X.9Bp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLLILLLL;
            }
        }, null, C86672Xzw.LJLIL, 6);
        C8YN.LJII(this, u4(), new TBT() { // from class: X.9Bq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLLJ;
            }
        }, null, C86674Xzy.LJLIL, 6);
        C8YN.LJII(this, u4(), new TBT() { // from class: X.NbG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLIL;
            }
        }, null, C86671Xzv.LJLIL, 6);
        C8YN.LJII(this, u4(), new TBT() { // from class: X.NYY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLILLLLZI;
            }
        }, null, Y05.LJLIL, 6);
        C8YN.LJII(this, u4(), new TBT() { // from class: X.NcQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJL;
            }
        }, null, Y0Z.LJLIL, 6);
        C8YN.LJII(this, u4(), new TBT() { // from class: X.NcR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJLJ;
            }
        }, null, Y16.LJLIL, 6);
        C8YN.LJII(this, u4(), new TBT() { // from class: X.O0S
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, Y0U.LJLIL, 6);
        C8YN.LJII(this, u4(), new TBT() { // from class: X.O0T
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, Y11.LJLIL, 6);
        C8YN.LJII(this, u4(), new TBT() { // from class: X.9Br
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LLFF;
            }
        }, null, Y0T.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.NcM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLJ;
            }
        }, null, Y0X.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.9ei
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJLJ;
            }
        }, null, Y0F.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.9Bo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJJLL;
            }
        }, null, C86699Y0x.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.NcO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJLLL;
            }
        }, null, C86700Y0y.LJLIL, 6);
        if (C53256KvE.LIZ()) {
            C8YN.LJII(this, (AssemViewModel) this.LLFZ.LIZ(this, LLIIZ[0]), Y37.LJLIL, null, Y0L.LJLIL, 6);
        }
    }

    public final void A4(String str, boolean z) {
        if (C8LG.LIZ()) {
            Context context = getContext();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onTranslationEvent ");
            LIZ.append(z);
            LIZ.append(' ');
            LIZ.append(str);
            C16880lQ.LLZILL(Toast.makeText(context, X1D.LIZIZ(LIZ), 0));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        E4();
    }
}
