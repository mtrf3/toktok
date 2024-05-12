package com.bytedance.touchpoint.core.pendant.manager;

import X.AbstractC247499nV;
import X.C10K;
import X.C213688a4;
import X.C221108m2;
import X.C247519nX;
import X.C247539nZ;
import X.C247599nf;
import X.C247669nm;
import X.C247679nn;
import X.C249479qh;
import X.C249519ql;
import X.C249549qo;
import X.C249599qt;
import X.C249919rP;
import X.C249929rQ;
import X.C249969rU;
import X.C249999rX;
import X.C250109ri;
import X.C250349s6;
import X.C250369s8;
import X.C250379s9;
import X.C250429sE;
import X.C250729si;
import X.C5H3;
import X.C8YN;
import X.C95J;
import X.C96Q;
import X.C9OT;
import X.EnumC221088m0;
import X.InterfaceC249619qv;
import X.InterfaceC249899rN;
import X.InterfaceC249909rO;
import X.InterfaceC88472Yns;
import X.TBT;
import X.ViewOnClickListenerC250989t8;
import X.X1D;
import Y.ACallableS107S0100000_4;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.touchpoint.core.model.Bubble;
import com.bytedance.touchpoint.core.model.NormalPendant;
import com.bytedance.touchpoint.core.model.TimerPendant;
import com.bytedance.touchpoint.core.model.TouchPoint;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SpecActPendantManager extends BasePendantManager implements InterfaceC249619qv, View.OnClickListener {
    public static final C5H3 LJLLJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C250109ri.LJLIL);
    public boolean LJLLILLLL = true;

    public SpecActPendantManager() {
        C8YN.LJII(this, (AssemViewModel) this.LJLJLJ.getValue(), new TBT() { // from class: X.9Oo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C236009Oa) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 8), 4);
        C8YN.LJII(this, (AssemViewModel) this.LJLJLJ.getValue(), new TBT() { // from class: X.9P2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236009Oa) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 9), 4);
    }

    public static boolean LJJIL() {
        C249969rU c249969rU = (C249969rU) C95J.LIZ(1);
        if (c249969rU != null) {
            return c249969rU.LJ();
        }
        return false;
    }

    @Override // X.InterfaceC249619qv
    public final void LJIJJLI() {
        InterfaceC249909rO LJJI = LJJI();
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if ((abstractC247499nV != null && abstractC247499nV.LJIILLIIL()) || LJJI == null || !LJJI.LJIJJLI() || !LJJI.LJJIJ()) {
            return;
        }
        ((C250369s8) C250349s6.LIZIZ.getValue()).LIZ(LJJI, 0);
    }

    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager
    public final void LJJIII() {
        C249479qh LIZ = C247679nn.LIZ();
        if (LIZ.LJLILLLLZI) {
            if (LIZ.LJLIL == null) {
                LIZ.LJLIL = C247669nm.LIZ();
            }
            if (C247539nZ.LIZ().LJJIIJZLJL() && C247599nf.LIZ().LJJIIJ()) {
                SpecActPendantManager specActPendantManager = LIZ.LJLIL;
                if (specActPendantManager != null) {
                    specActPendantManager.LJIILL("non_tracker", "finished", 0, false, false);
                    return;
                }
                return;
            }
            C249479qh.LJJII();
            if (!C247539nZ.LIZ().LJJIIJZLJL()) {
                C249519ql LIZ2 = C247539nZ.LIZ();
                if (!LIZ2.LJZ) {
                    return;
                }
                if (LIZ2.LJLLLLLL == null) {
                    LIZ2.LJLLLLLL = C247669nm.LIZ();
                }
                LIZ2.LJJIIZ();
                return;
            }
            if (C247599nf.LIZ().LJJIIJ()) {
                return;
            }
            C249549qo LIZ3 = C247599nf.LIZ();
            if (LIZ3.LJZ) {
                if (LIZ3.LJLLLLLL == null) {
                    LIZ3.LJLLLLLL = C247669nm.LIZ();
                }
                LIZ3.LJJIIJZLJL();
            }
            C249599qt c249599qt = (C249599qt) C249599qt.LL.getValue();
            if (!c249599qt.LJZI || c249599qt.LJLLLLLL != null) {
                return;
            }
            c249599qt.LJLLLLLL = C247669nm.LIZ();
        }
    }

    public final void LJJJJI() {
        InterfaceC249909rO LJJI = LJJI();
        if (LJJI == null || !LJJI.LJIJJLI() || !LJJI.LJIJ()) {
            return;
        }
        Iterator<InterfaceC249899rN> it = C250349s6.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC249899rN next = it.next();
            if (next instanceof C250429sE) {
                next.LIZ(LJJI, 0);
            }
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC249619qv
    public final void LJIILJJIL() {
        TimerPendant timerPendant;
        String str;
        List<String> arrayList;
        String str2;
        TimerPendant timerPendant2;
        TimerPendant timerPendant3;
        C9OT c9ot = this.LJLIL;
        if (c9ot == null || (timerPendant = c9ot.LJLILLLLZI) == null || (str = timerPendant.rewardLottieName) == null || str.length() == 0) {
            return;
        }
        C9OT c9ot2 = this.LJLIL;
        if (c9ot2 == null || (timerPendant3 = c9ot2.LJLILLLLZI) == null || (arrayList = timerPendant3.awardTextBGColor) == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList.isEmpty() || arrayList.size() < 2) {
            arrayList.add("#FF6C89");
            arrayList.add("#FE2C55");
        }
        InterfaceC249909rO LJJI = LJJI();
        C9OT c9ot3 = this.LJLIL;
        if (c9ot3 == null || (timerPendant2 = c9ot3.LJLILLLLZI) == null || (str2 = timerPendant2.rewardText) == null) {
            str2 = "";
        }
        LJJI.LJIILLIIL(str2, arrayList);
        InterfaceC249909rO LJJI2 = LJJI();
        if (LJJI2 == null || !LJJI2.LJIJJLI() || !LJJI2.LJJIJ() || LJJI2.LJJIJIL() || !LJJI2.LJIJ() || LJJI2.LJIIJJI()) {
            return;
        }
        Iterator<InterfaceC249899rN> it = C250349s6.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC249899rN next = it.next();
            if (next instanceof C250379s9) {
                next.LIZ(LJJI2, 0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r13 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r0 = r1.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r14 = r0.shrinkLottieName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r14 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        r0 = r1.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        r15 = r0.breathLottieName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        if (r15 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r4 = LJJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r4 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        ((X.ViewOnClickListenerC250989t8) r4).LIZLLL(r17.LJLIL);
        r6 = r17.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r6 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        r0 = r6.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r4 = r0.activityId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (r4 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        r0 = r6.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        r0 = r0.lottieFileMd5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        r0 = LJJIFFI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        r0 = (X.C251589u6) ((X.C249999rX) r0).LIZ.getValue();
        r7 = r0.LIZIZ(r4, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r13.length() <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        if (r6 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
    
        r10 = r0.LIZIZ(r4, r5, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0097, code lost:
    
        if (r14.length() <= 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0099, code lost:
    
        r11 = r0.LIZIZ(r4, r5, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
        if (r15.length() <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
    
        r16 = r0.LIZIZ(r4, r5, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
    
        r0 = (X.C251629uA) r0.LIZ.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b1, code lost:
    
        r8 = r0.LIZJ(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c7, code lost:
    
        if (r7 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c9, code lost:
    
        if (r8 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
    
        r0 = LJJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d0, code lost:
    
        if (r0 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d2, code lost:
    
        r6 = ((X.ViewOnClickListenerC250989t8) r0).LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d6, code lost:
    
        if (r6 == 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d8, code lost:
    
        r6.LIZIZ(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e1, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.bytedance.touchpoint.ui.pendant.SpecActWidget");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b6, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b9, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x008d, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0086, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c0, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.bytedance.touchpoint.core.pendant.fileloader.PendantResourceLoader");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0066, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0067, code lost:
    
        if (r6 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c6, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.bytedance.touchpoint.ui.pendant.SpecActWidget");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e2, code lost:
    
        r0 = LJJIFFI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e6, code lost:
    
        if (r0 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e8, code lost:
    
        ((X.C249999rX) r0).LIZ.getValue().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f9, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.bytedance.touchpoint.core.pendant.fileloader.PendantResourceLoader");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0040, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x003c, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x003d, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0039, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0035, code lost:
    
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.9rh] */
    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager.LJJII():void");
    }

    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager
    public final ViewOnClickListenerC250989t8 LJJIIJ() {
        ViewOnClickListenerC250989t8 viewOnClickListenerC250989t8 = new ViewOnClickListenerC250989t8();
        viewOnClickListenerC250989t8.LJLJJI = this;
        return viewOnClickListenerC250989t8;
    }

    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager
    public final C249999rX LJJIIJZLJL() {
        return (C249999rX) C249999rX.LIZLLL.getValue();
    }

    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager
    public final boolean LJJIIZI() {
        NormalPendant normalPendant;
        String str;
        C9OT c9ot = this.LJLIL;
        if (c9ot != null && (normalPendant = c9ot.LJLIL) != null && (str = normalPendant.lottieFileZip) != null) {
            return C96Q.LIZ(str);
        }
        return false;
    }

    public final boolean LJJJJ() {
        int i;
        int i2;
        final String str;
        final String str2;
        final int i3;
        NormalPendant normalPendant;
        NormalPendant normalPendant2;
        NormalPendant normalPendant3;
        if (!LJJJIL(this.LJLLI)) {
            return false;
        }
        C249969rU c249969rU = (C249969rU) C95J.LIZ(1);
        if (c249969rU != null && c249969rU.LIZLLL()) {
            return false;
        }
        if (!LJJI().LJIJ()) {
            if (C249919rP.LJFF(this.LJLIL) && C249919rP.LJ(this.LJLIL)) {
                int i4 = this.LJLJJI;
                int LIZLLL = C249919rP.LIZLLL(this.LJLIL);
                if (LIZLLL == 0 || i4 >= LIZLLL) {
                    InterfaceC249909rO LJJI = LJJI();
                    int i5 = this.LJLJJI;
                    C9OT c9ot = this.LJLIL;
                    if (c9ot != null && (normalPendant3 = c9ot.LJLIL) != null) {
                        i = normalPendant3.dismissAfter;
                    } else {
                        i = 0;
                    }
                    if (LJJI.LJJI(i5, i)) {
                        int i6 = this.LJLJJI;
                        C9OT c9ot2 = this.LJLIL;
                        if (c9ot2 != null && (normalPendant2 = c9ot2.LJLIL) != null) {
                            i2 = normalPendant2.dismissAfter;
                        } else {
                            i2 = 0;
                        }
                        if (i6 == i2) {
                            final String LIZJ = C249919rP.LIZJ(c9ot2);
                            final String LIZ = C249919rP.LIZ(this.LJLIL, "non_tracker");
                            if (o.LJ(this.LJLLI, "ForYou")) {
                                str = "homepage_hot";
                            } else {
                                str = "homepage_follow";
                            }
                            C249969rU c249969rU2 = (C249969rU) C95J.LIZ(1);
                            if (c249969rU2 == null || (str2 = c249969rU2.LIZIZ()) == null) {
                                str2 = "";
                            }
                            final String LJJIJIL = LJJIJIL("non_tracker");
                            C9OT c9ot3 = this.LJLIL;
                            if (c9ot3 != null && (normalPendant = c9ot3.LJLIL) != null) {
                                i3 = normalPendant.dismissAfter;
                            } else {
                                i3 = 0;
                            }
                            C10K.LIZJ(new Callable() { // from class: X.9nY
                                public final /* synthetic */ String LJLIL = "non_tracker";
                                public final /* synthetic */ int LJLILLLLZI = 0;
                                public final /* synthetic */ String LJLJI = "finished";

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    String str3;
                                    String str4;
                                    InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                                    String str5 = null;
                                    if (interfaceC247459nR != null) {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.put("widget_name", this.LJLIL);
                                        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                                        if (abstractC247499nV != null) {
                                            str3 = abstractC247499nV.LJIIIZ();
                                        } else {
                                            str3 = null;
                                        }
                                        linkedHashMap.put("page", str3);
                                        linkedHashMap.put("is_selected", String.valueOf(this.LJLILLLLZI));
                                        linkedHashMap.put("position", this.LJLJI);
                                        linkedHashMap.put("event_keyword", LIZJ);
                                        linkedHashMap.put("activity_name", LIZ);
                                        linkedHashMap.put("status", LJJIJIL);
                                        linkedHashMap.put("vv_cnt", String.valueOf(i3));
                                        linkedHashMap.put("is_login", String.valueOf(C247509nW.LIZIZ()));
                                        AbstractC247499nV abstractC247499nV2 = (AbstractC247499nV) C95J.LIZ(0);
                                        if (abstractC247499nV2 != null) {
                                            str4 = abstractC247499nV2.LJIIJ();
                                        } else {
                                            str4 = null;
                                        }
                                        linkedHashMap.put("region", str4);
                                        linkedHashMap.put("enter_from", str);
                                        linkedHashMap.put("group_id", str2);
                                        interfaceC247459nR.LIZIZ("widget_time_tracker_disappear", linkedHashMap);
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    Integer valueOf = Integer.valueOf(i3);
                                    String str6 = LJJIJIL;
                                    TouchPoint LIZJ2 = C2MW.LIZ().LIZJ(1, null);
                                    if (LIZJ2 != null) {
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                        linkedHashMap3.put("touch_point_id", String.valueOf(LIZJ2.touchPointId));
                                        linkedHashMap3.put("touch_point_name", LIZJ2.touchPointName);
                                        linkedHashMap3.put("launch_plan_id", String.valueOf(LIZJ2.launchPlanId));
                                        linkedHashMap3.put("touch_point_ab_versions", String.valueOf(LIZJ2.abVersions));
                                        AbstractC247499nV abstractC247499nV3 = (AbstractC247499nV) C95J.LIZ(0);
                                        if (abstractC247499nV3 != null) {
                                            str5 = abstractC247499nV3.LJIIJ();
                                        }
                                        linkedHashMap3.put("region", str5);
                                        if (valueOf != null) {
                                            linkedHashMap3.put("vv_cnt", String.valueOf(valueOf.intValue()));
                                        }
                                        if (str6 != null) {
                                            linkedHashMap3.put("status", str6);
                                        }
                                        java.util.Map<String, String> map = LIZJ2.customEventParams;
                                        if (map != null) {
                                            linkedHashMap3.putAll(map);
                                        }
                                        linkedHashMap3.putAll(linkedHashMap2);
                                        InterfaceC247459nR interfaceC247459nR2 = C95J.LIZ;
                                        if (interfaceC247459nR2 != null) {
                                            interfaceC247459nR2.LIZIZ("touch_point_dismiss", linkedHashMap3);
                                        }
                                    }
                                    return C76800UCe.LIZ;
                                }
                            });
                        }
                    }
                }
            }
            return false;
        }
        if (!LJJI().LJJIZ()) {
            return true;
        }
        return LJJIL();
    }

    @Override // X.InterfaceC249619qv
    public final void LIZIZ() {
        LJJI().LIZIZ();
    }

    @Override // X.InterfaceC249619qv
    public final boolean LJIIJJI() {
        return LJJI().LJIIJJI();
    }

    @Override // X.InterfaceC249619qv
    public final void LJIILIIL() {
        LJJI().LJIILIIL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r0.length() == 0) goto L26;
     */
    @Override // X.InterfaceC249619qv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIL() {
        /*
            r4 = this;
            X.9rO r0 = r4.LJJI()
            boolean r0 = r0.LJIJ()
            java.lang.String r1 = ""
            if (r0 == 0) goto L21
            X.9OT r0 = r4.LJLIL
            if (r0 == 0) goto L19
            com.bytedance.touchpoint.core.model.TimerPendant r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L19
            java.lang.String r0 = r0.timerJumpLink
            if (r0 == 0) goto L19
        L18:
            r1 = r0
        L19:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L2e
            r0 = 0
            return r0
        L21:
            X.9OT r0 = r4.LJLIL
            if (r0 == 0) goto L19
            com.bytedance.touchpoint.core.model.NormalPendant r0 = r0.LJLIL
            if (r0 == 0) goto L19
            java.lang.String r0 = r0.normalJumpLink
            if (r0 == 0) goto L19
            goto L18
        L2e:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            java.lang.String r3 = "enter_from"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r3)
            if (r0 == 0) goto L40
            int r0 = r0.length()
            if (r0 != 0) goto L54
        L40:
            android.net.Uri$Builder r2 = r1.buildUpon()
            java.lang.String r1 = r4.LJLLI
            java.lang.String r0 = "ForYou"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L59
            java.lang.String r0 = "homepage_hot"
        L50:
            android.net.Uri$Builder r1 = r2.appendQueryParameter(r3, r0)
        L54:
            java.lang.String r0 = r1.toString()
            return r0
        L59:
            java.lang.String r0 = "homepage_follow"
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager.LJIL():java.lang.String");
    }

    public final boolean LJJIJL() {
        return LJJI().LJIJJLI();
    }

    public final boolean LJJIJLIJ() {
        return LJJI().LJIJ();
    }

    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager
    public final boolean LJJIJ() {
        return this.LJLILLLLZI;
    }

    public final void LJJJI() {
        LJJIJIIJIL();
    }

    @Override // X.InterfaceC249619qv
    public final void LIZJ(int i) {
        LJJI().LIZJ(i);
    }

    @Override // X.InterfaceC249619qv
    public final void LJI(int i) {
        LJJI().LJI(i);
    }

    @Override // X.InterfaceC249619qv
    public final void LJIIIIZZ(boolean z) {
        LJJI().LJIIIIZZ(z);
    }

    @Override // X.InterfaceC249619qv
    public final void LJIIJ(String content) {
        o.LJIIIZ(content, "content");
        LJJI().LJIIJ(content);
    }

    public final String LJJIJIL(String str) {
        if (o.LJ(str, "non_tracker")) {
            if (!LJJI().LJJII()) {
                return "unfold";
            }
        } else if (!LJJI().LJJIJIL()) {
            if (LJJI().LJIIJJI()) {
                return "unfold";
            }
            return "coin";
        }
        return "fold";
    }

    public final void LJJIZ(String str) {
        String str2;
        String str3;
        String str4;
        C249969rU c249969rU = (C249969rU) C95J.LIZ(1);
        String str5 = "";
        if (c249969rU == null || (str2 = c249969rU.LIZIZ()) == null) {
            str2 = "";
        }
        if (o.LJ(this.LJLLI, "ForYou")) {
            str3 = "homepage_hot";
        } else {
            str3 = "homepage_follow";
        }
        if (o.LJ(str, "non_tracker")) {
            str5 = String.valueOf(LJJI().LJJIJL());
        }
        C247679nn.LIZ().getClass();
        if (C249479qh.LJJIIJ()) {
            str4 = "ongoing";
        } else {
            str4 = "finished";
        }
        C247519nX.LJFF(str4, str, str2, LJJIL() ? 1 : 0, "widget", this.LJLIL, str3, this.LJLJI, LJJIJIL(str), this.LJLJJL, str5);
    }

    public final boolean LJJJIL(String str) {
        NormalPendant normalPendant;
        if (o.LJ("For You", str)) {
            return true;
        }
        if (!o.LJ("Following", str)) {
            return false;
        }
        if (LJJI().LJIJ()) {
            return true;
        }
        C9OT c9ot = this.LJLIL;
        if (c9ot != null && (normalPendant = c9ot.LJLIL) != null) {
            return normalPendant.showInFollow;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        C9OT c9ot;
        NormalPendant normalPendant;
        String str2;
        boolean z;
        NormalPendant normalPendant2;
        Map<String, String> map;
        String str3;
        Context context;
        TimerPendant timerPendant;
        C9OT c9ot2;
        TimerPendant timerPendant2;
        C9OT c9ot3;
        TimerPendant timerPendant3;
        if (view == null || !LJJI().LJJIJ()) {
            return;
        }
        if (LJJI().LJIJ()) {
            str = "tracker";
        } else {
            str = "non_tracker";
        }
        if (!LJJI().LJIJ() ? (c9ot = this.LJLIL) == null || (normalPendant = c9ot.LJLIL) == null || (str2 = normalPendant.LIZIZ) == null : (c9ot3 = this.LJLIL) == null || (timerPendant3 = c9ot3.LJLILLLLZI) == null || (str2 = timerPendant3.LIZIZ) == null) {
            str2 = "";
        }
        if (LJJI().LJIJ() && (c9ot2 = this.LJLIL) != null && (timerPendant2 = c9ot2.LJLILLLLZI) != null) {
            z = timerPendant2.needLoginGate;
        } else {
            z = false;
        }
        if (LJJI().LJIJ()) {
            C9OT c9ot4 = this.LJLIL;
            if (c9ot4 != null && (timerPendant = c9ot4.LJLILLLLZI) != null) {
                map = timerPendant.LJ;
            }
            map = null;
        } else {
            C9OT c9ot5 = this.LJLIL;
            if (c9ot5 != null && (normalPendant2 = c9ot5.LJLIL) != null) {
                map = normalPendant2.LJ;
            }
            map = null;
        }
        if (view.getId() == R.id.g_i || view.getId() == R.id.jsg) {
            C250349s6.LIZIZ(LJJI().LJIL(), "ok");
        }
        LJJIZ(str);
        InterfaceC249909rO widget = LJJI();
        o.LJIIIZ(widget, "widget");
        if (widget.LJIJ()) {
            str3 = "CLICK_DYNAMIC_PENDANT";
        } else {
            str3 = "CLICK_STATIC_PENDANT";
        }
        Iterator<InterfaceC249899rN> it = C250349s6.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(str3, widget);
        }
        String LJIL = LJIL();
        if (LJIL == null || (context = getContext()) == null) {
            return;
        }
        C250729si.LIZ(context, LJIL, str2, map, z);
    }

    @Override // X.InterfaceC249619qv
    public final void LJIIIZ(boolean z, boolean z2) {
        if (LJJI().LJIJJLI() && LJJI().LJIIJJI()) {
            LJJI().LJIIIZ(z, z2);
        }
    }

    @Override // X.InterfaceC249619qv
    public final void LJIIL(int i, int i2) {
        LJJI().LJIIL(i, i2);
    }

    public final void LJJJ(final int i, final String str, final String pendantPosition) {
        o.LJIIIZ(pendantPosition, "pendantPosition");
        C10K.LIZJ(new Callable() { // from class: X.9o2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2;
                String str3;
                int i2;
                String str4;
                String LIZIZ;
                String str5 = "";
                if (!o.LJ(str, "non_tracker")) {
                    str2 = "";
                } else {
                    str2 = String.valueOf(SpecActPendantManager.this.LJJI().LJJIJL());
                }
                C9OT c9ot = SpecActPendantManager.this.LJLIL;
                String str6 = str;
                int i3 = i;
                String str7 = pendantPosition;
                String LIZJ = C249919rP.LIZJ(c9ot);
                String LIZ = C249919rP.LIZ(SpecActPendantManager.this.LJLIL, str);
                if (o.LJ(SpecActPendantManager.this.LJLLI, "ForYou")) {
                    str3 = "homepage_hot";
                } else {
                    str3 = "homepage_follow";
                }
                C249969rU c249969rU = (C249969rU) C95J.LIZ(1);
                if (c249969rU != null && (LIZIZ = c249969rU.LIZIZ()) != null) {
                    str5 = LIZIZ;
                }
                SpecActPendantManager specActPendantManager = SpecActPendantManager.this;
                boolean z = specActPendantManager.LJLJI;
                String LJJIJIL = specActPendantManager.LJJIJIL(str);
                int i4 = SpecActPendantManager.this.LJLJJL;
                HH1.LIZ(str6, "widgetName", str7, "pendantPosition", str2, "subType");
                InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                if (interfaceC247459nR != null) {
                    LinkedHashMap LIZ2 = C0JU.LIZ("widget_name", str6);
                    AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                    String str8 = null;
                    if (abstractC247499nV != null) {
                        str4 = abstractC247499nV.LJIIIZ();
                    } else {
                        str4 = null;
                    }
                    C132805Jc.LJFF(LIZ2, "page", str4, i3, "is_selected");
                    LIZ2.put("position", str7);
                    LIZ2.put("event_keyword", LIZJ);
                    LIZ2.put("activity_name", LIZ);
                    LIZ2.put("status", LJJIJIL);
                    LIZ2.put("vv_cnt", String.valueOf(i4));
                    LIZ2.put("is_login", String.valueOf(C247509nW.LIZIZ()));
                    AbstractC247499nV abstractC247499nV2 = (AbstractC247499nV) C95J.LIZ(0);
                    if (abstractC247499nV2 != null) {
                        str8 = abstractC247499nV2.LJIIJ();
                    }
                    LIZ2.put("region", str8);
                    LIZ2.put("enter_from", str3);
                    LIZ2.put("group_id", str5);
                    interfaceC247459nR.LIZIZ("widget_time_tracker_show", LIZ2);
                }
                if (o.LJ(str6, "non_tracker")) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                C247519nX.LJIIJJI(i2, new LinkedHashMap(), null, Integer.valueOf(i4), LJJIJIL, str2);
                if (z && o.LJ(str6, "non_tracker")) {
                    C10K.LIZJ(new ACallableS107S0100000_4(c9ot, 4));
                }
                return C76800UCe.LIZ;
            }
        });
    }

    @Override // X.InterfaceC249619qv
    public final void LJII(boolean z, int i, InterfaceC88472Yns interfaceC88472Yns, boolean z2, boolean z3) {
        LJJI().LJII(z, i, interfaceC88472Yns, z2, z3);
    }

    @Override // X.InterfaceC249619qv
    public final void LJIILL(String str, String str2, int i, boolean z, boolean z2) {
        if (!LJJI().LJIJJLI()) {
            return;
        }
        boolean z3 = false;
        this.LJLJJI = 0;
        this.LJLJJL = 0;
        if (z) {
            z3 = this.LJLILLLLZI;
        }
        LJJI().LJIILL(z3, z2, new C249929rQ(this, z3, i, str2));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x007e. Please report as an issue. */
    @Override // X.InterfaceC249619qv
    public final void LJIILLIIL(int i, String taskId, boolean z, String templateValue, String str) {
        Boolean bool;
        Boolean bool2;
        boolean z2;
        o.LJIIIZ(taskId, "taskId");
        o.LJIIIZ(templateValue, "templateValue");
        InterfaceC249909rO LJJI = LJJI();
        if (LJJI == null || !LJJI.LJIJJLI() || !LJJI.LJJIJ() || LJJI.LJJIJIL()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("widget status does not match(isBound:");
            Boolean bool3 = null;
            if (LJJI != null) {
                bool = Boolean.valueOf(LJJI.LJIJJLI());
            } else {
                bool = null;
            }
            LIZ.append(bool);
            LIZ.append(", isShowing:");
            if (LJJI != null) {
                bool2 = Boolean.valueOf(LJJI.LJJIJ());
            } else {
                bool2 = null;
            }
            LIZ.append(bool2);
            LIZ.append(", isShrink:");
            if (LJJI != null) {
                bool3 = Boolean.valueOf(LJJI.LJJIJIL());
            }
            LIZ.append(bool3);
            LIZ.append("), return.");
            X1D.LIZIZ(LIZ);
            return;
        }
        Bubble LIZ2 = C250349s6.LIZ(i, taskId);
        if (LIZ2 == null) {
            return;
        }
        Bubble LJIL = LJJI.LJIL();
        int i2 = LIZ2.bubbleType;
        String str2 = "";
        if (i2 != 9) {
            switch (i2) {
                case 12:
                case 14:
                    if (LJJI.LJIIJJI()) {
                        LJJI.LJJIIZI(LIZ2, templateValue, str, z);
                        z2 = true;
                        break;
                    }
                    z2 = false;
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                case 15:
                    if (LJJI.LJIIJJI()) {
                        LJJI.LJJIIJ(LIZ2, templateValue);
                        z2 = true;
                        break;
                    }
                    z2 = false;
                    break;
                default:
                    if (!LJJI.LJIJ() && !LJJI.LJJII()) {
                        String str3 = LIZ2.longContent;
                        if (str3 == null) {
                            str3 = "";
                        }
                        LJJI.LJIILJJIL(str3, "watch_video", LIZ2);
                        z2 = true;
                        break;
                    }
                    z2 = false;
                    break;
            }
        } else {
            if (LJJI.LJIJ()) {
                String str4 = LIZ2.longContent;
                if (str4 == null) {
                    str4 = "";
                }
                LJJI.LJJIL(str4, LIZ2, true, null);
                z2 = true;
            }
            z2 = false;
        }
        String str5 = LIZ2.LIZIZ;
        if (str5 == null || str5.length() == 0 || !z2) {
            return;
        }
        int i3 = LIZ2.bubbleType;
        if ((i3 == 13 || i3 == 15) && LJIL != null && LJIL.bubbleType == i3) {
            return;
        }
        C247519nX c247519nX = C247519nX.LIZ;
        int i4 = LIZ2.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String valueOf = String.valueOf(LIZ2.bubbleType);
        if (valueOf != null) {
            str2 = valueOf;
        }
        linkedHashMap.put("sub_type", str2);
        linkedHashMap.put("vv_cnt", String.valueOf(C247669nm.LIZ().LJLJJL));
        linkedHashMap.put("task_key", taskId);
        C247519nX.LJIIL(c247519nX, i4, linkedHashMap, null, null, 60);
    }
}
