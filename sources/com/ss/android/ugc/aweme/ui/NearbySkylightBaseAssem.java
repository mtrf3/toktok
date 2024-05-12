package com.ss.android.ugc.aweme.ui;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C214298b3;
import X.C40328FsC;
import X.C47704Ins;
import X.C54485LZx;
import X.C54570LbK;
import X.C54572LbM;
import X.C54573LbN;
import X.C54574LbO;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78847Ux1;
import X.C78866UxK;
import X.C78926UyI;
import X.C9BE;
import X.FMX;
import X.InterfaceC65784Pro;
import X.L8O;
import X.LJ1;
import X.LJ5;
import X.LJE;
import X.LSK;
import X.LZV;
import X.TBT;
import X.X1D;
import Y.ARunnableS45S0100000_9;
import Y.IDLListenerS196S0100000_9;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.panel.NearbyFeedFragmentPanel;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.aweme.vm.NearbyFeedListViewModel;
import com.ss.android.ugc.aweme.vm.NearbySkylightViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class NearbySkylightBaseAssem extends UISlotAssem {
    public static final /* synthetic */ int LLF = 0;
    public boolean LJLJLLL;
    public NearbyFeedFragmentPanel LJLL;
    public View LJLLI;
    public final C55749LuL LJLLILLLL;
    public C54570LbK LJLLJ;
    public final C214298b3 LJLLL;
    public AnimatorSet LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public final C214298b3 LJZI;
    public boolean LJZL;
    public LSK LL;
    public boolean LLD;

    public void K3() {
    }

    public abstract int N3();

    public abstract boolean O3();

    public NearbySkylightBaseAssem() {
        new LinkedHashMap();
        this.LJLLILLLL = new C55749LuL(C47704Ins.LIZJ(this, LZV.class, "NearbyFeedContentHierarchyData"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NearbySkylightViewModel.class);
        this.LJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 691), C54573LbN.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NearbyFeedListViewModel.class);
        this.LJZI = C78926UyI.LJ(this, LIZ2, c9be, new AqS159S0100000_9(LIZ2, 692), C54574LbO.INSTANCE, null);
        this.LLD = true;
    }

    public final float H3() {
        int LJJJJLI;
        getContainerView().measure(0, 0);
        int measuredHeight = getContainerView().getMeasuredHeight();
        View view = this.LJLLI;
        if (view == null || (LJJJJLI = view.getHeight()) <= 0) {
            Context context = getContainerView().getContext();
            o.LJIIIIZZ(context, "containerView.context");
            LJJJJLI = C63081OpJ.LJJJJLI(context);
        }
        ((NearbySkylightViewModel) this.LJLLL.getValue()).LJLILLLLZI = LJJJJLI;
        return ((getContainerView().getY() + measuredHeight) - LJJJJLI) + N3();
    }

    public final void M3() {
        ActivityC45651qj LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("showNearbyToast, toastEnable: ");
        LIZ2.append(NearbyTabConfig.LJII());
        L8O.LIZ(X1D.LIZIZ(LIZ2));
        if (NearbyTabConfig.LJII() && (LIZ = C212428Vi.LIZ(this)) != null) {
            C40328FsC.LIZLLL(LIZ, R.string.im3);
        }
    }

    public final void Q3() {
        LJ1 LJII;
        INearbyContentAssemAbility iNearbyContentAssemAbility;
        String str;
        if (!LJE.LIZIZ()) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null && (LJII = LJ5.LJII(LIZ)) != null && LJII.LJLJJLL && (iNearbyContentAssemAbility = (INearbyContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LIZ, null), INearbyContentAssemAbility.class, null)) != null) {
                RoamingLocationInfo LIZIZ = LJ5.LIZIZ(LIZ);
                if (LIZIZ == null || (str = LIZIZ.getManualRegionName()) == null) {
                    str = "";
                }
                iNearbyContentAssemAbility.Cd(str);
                return;
            }
            return;
        }
        getContainerView().postDelayed(new ARunnableS45S0100000_9(this, 104), 200L);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    public void I3(InterfaceC65784Pro interfaceC65784Pro) {
        if (!this.LJLJLLL) {
            return;
        }
        this.LJLJLLL = false;
        ((NearbySkylightViewModel) this.LJLLL.getValue()).LJLIL = false;
        C54485LZx.LIZ(false);
        P3(H3(), 0.0f, false, interfaceC65784Pro);
    }

    public void L3(boolean z) {
        if (this.LJLJLLL) {
            return;
        }
        if (z && !LJE.LIZIZ()) {
            return;
        }
        if (O3()) {
            FMX.onEventV3("turn_on_location_banner_show");
        }
        if (z) {
            LJE.LJFF();
        }
        getContainerView().setVisibility(0);
        this.LJLJLLL = true;
        ((NearbySkylightViewModel) this.LJLLL.getValue()).LJLIL = true;
        C54485LZx.LIZ(true);
        P3(0.0f, H3(), true, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        C54570LbK c54570LbK;
        View view2;
        View view3;
        TopTabAbility LJJLIIIJJIZ;
        C54570LbK c54570LbK2;
        Object parent;
        ViewTreeObserver viewTreeObserver;
        C54570LbK c54570LbK3;
        C54570LbK c54570LbK4;
        C54570LbK c54570LbK5;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View view4 = null;
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJZI.getValue(), new TBT() { // from class: X.LbL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54665Lcr) obj).getRefreshState();
            }
        }, null, new AqS175S0100000_9(this, 342), null, new AqS140S0200000_9(this, view, 36), 10, null);
        NearbyFeedFragmentPanel nearbyFeedFragmentPanel = ((LZV) this.LJLLILLLL.getValue()).LJLIL;
        this.LJLL = nearbyFeedFragmentPanel;
        if (nearbyFeedFragmentPanel != null) {
            c54570LbK = nearbyFeedFragmentPanel.LLILZ;
        } else {
            c54570LbK = null;
        }
        this.LJLLJ = c54570LbK;
        if (c54570LbK != null) {
            c54570LbK.setSkylightViewModel((NearbySkylightViewModel) this.LJLLL.getValue());
        }
        C54570LbK c54570LbK6 = this.LJLLJ;
        if (c54570LbK6 != null) {
            c54570LbK6.setCallBack(new AqS159S0100000_9(this, 690));
        }
        NearbyFeedFragmentPanel nearbyFeedFragmentPanel2 = this.LJLL;
        if (nearbyFeedFragmentPanel2 != null && (c54570LbK5 = nearbyFeedFragmentPanel2.LLILZ) != null) {
            view2 = c54570LbK5.findViewById(R.id.g99);
        } else {
            view2 = null;
        }
        this.LJLLLLLL = view2;
        NearbyFeedFragmentPanel nearbyFeedFragmentPanel3 = this.LJLL;
        if (nearbyFeedFragmentPanel3 != null && (c54570LbK4 = nearbyFeedFragmentPanel3.LLILZ) != null) {
            view3 = c54570LbK4.findViewById(R.id.lgd);
        } else {
            view3 = null;
        }
        this.LJLLI = view3;
        NearbyFeedFragmentPanel nearbyFeedFragmentPanel4 = this.LJLL;
        if (nearbyFeedFragmentPanel4 != null && (c54570LbK3 = nearbyFeedFragmentPanel4.LLILZ) != null) {
            view4 = c54570LbK3.findViewById(R.id.arj);
        }
        this.LJZ = view4;
        if (view4 != null && (viewTreeObserver = view4.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS196S0100000_9(this, 2));
        }
        NearbyFeedFragmentPanel nearbyFeedFragmentPanel5 = this.LJLL;
        if (nearbyFeedFragmentPanel5 != null && (c54570LbK2 = nearbyFeedFragmentPanel5.LLILZ) != null && (parent = c54570LbK2.getParent()) != null) {
            this.LJLZ = ((View) parent).findViewById(R.id.ark);
        }
        getContainerView().setVisibility(4);
        MainActivityScope LJJLIIIJ = C78866UxK.LJJLIIIJ(view);
        if (LJJLIIIJ != null && (LJJLIIIJJIZ = C78847Ux1.LJJLIIIJJIZ(LJJLIIIJ)) != null) {
            LJJLIIIJJIZ.na(new C54572LbM(this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P3(float r12, float r13, boolean r14, X.InterfaceC65784Pro r15) {
        /*
            r11 = this;
            r8 = r11
            X.LbK r5 = r8.LJLLJ
            if (r5 != 0) goto L6
            return
        L6:
            android.animation.AnimatorSet r0 = r8.LJLLLL
            if (r0 == 0) goto L10
            r0.cancel()
            X.C16880lQ.LJLJJL(r0)
        L10:
            r2 = 0
            r8.LJLLLL = r2
            r4 = 0
            r3 = 1
            r7 = r14
            if (r7 == 0) goto L49
            android.view.View r0 = r8.getContainerView()
            X.C17N.LJJLIIIJJI(r0)
            android.view.View r0 = r8.LJLLLLLL
            if (r0 != 0) goto Lbf
        L23:
            android.view.View r0 = r8.LJLLI
            if (r0 != 0) goto Lba
        L27:
            android.view.View r0 = r8.LJLZ
            if (r0 == 0) goto L2e
            X.C17N.LJJLIIIJJI(r0)
        L2e:
            android.view.View r0 = r8.LJLZ
            if (r0 == 0) goto L97
            int r0 = r0.getHeight()
            if (r0 != 0) goto L97
        L38:
            android.view.View r0 = r8.LJLZ
            if (r0 == 0) goto L42
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 != 0) goto L84
        L42:
            android.view.View r0 = r8.LJLZ
            if (r0 == 0) goto L49
            r0.requestLayout()
        L49:
            r0 = 2
            float[] r1 = new float[r0]
            r1[r4] = r12
            r6 = r13
            r1[r3] = r6
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r5, r0, r1)
            android.animation.AnimatorSet r0 = r8.LJLLLL
            if (r0 != 0) goto L62
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r8.LJLLLL = r0
        L62:
            android.animation.AnimatorSet r2 = r8.LJLLLL
            if (r2 == 0) goto L83
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            Y.ALAdapterS0S0310001_9 r4 = new Y.ALAdapterS0S0310001_9
            r10 = 0
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r2.addListener(r4)
            r2.play(r3)
            r2.start()
        L83:
            return
        L84:
            android.view.View r0 = r8.LJZ
            if (r0 == 0) goto L90
            int r0 = r0.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L90:
            int r0 = r2.intValue()
            r1.height = r0
            goto L42
        L97:
            android.view.View r0 = r8.LJLZ
            if (r0 == 0) goto Lb8
            int r0 = r0.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        La3:
            android.view.View r0 = r8.LJZ
            if (r0 == 0) goto Lb6
            int r0 = r0.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        Laf:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L49
            goto L38
        Lb6:
            r0 = r2
            goto Laf
        Lb8:
            r1 = r2
            goto La3
        Lba:
            r0.setBackground(r2)
            goto L27
        Lbf:
            r0.setBackground(r2)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem.P3(float, float, boolean, X.Pro):void");
    }
}
