package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.ugc.android.editor.base.viewmodel.FunctionBarViewModel;
import com.ss.ugc.android.editor.bottom.functionbar.HorizontalFuncBarFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.52y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1286052y extends AnonymousClass503 implements C50Q {
    public final ActivityC45651qj LJLIL;
    public final int LJLILLLLZI;
    public final C53H LJLJI;
    public boolean LJLJJI;
    public AnonymousClass525 LJLJJL;
    public AnonymousClass526 LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;
    public InterfaceC1286152z LJLJLLL;
    public final ArrayList<AnonymousClass533> LJLL;
    public InterfaceC127724zo LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public AnonymousClass523 LJLLL;
    public AnonymousClass528 LJLLLL;
    public final AnonymousClass534 LJLLLLLL;

    @Override // X.C50Q
    public final void LIZIZ() {
        AnonymousClass523 LJFF;
        AnonymousClass528 anonymousClass528;
        InterfaceC1286152z interfaceC1286152z = this.LJLJLLL;
        if (interfaceC1286152z != null && (LJFF = interfaceC1286152z.LJFF()) != null && (anonymousClass528 = this.LJLLLL) != null) {
            anonymousClass528.LIZ(LJFF, null);
        }
    }

    @Override // X.C50Q
    public final void LJFF() {
        List<AnonymousClass523> value;
        HorizontalFuncBarFragment horizontalFuncBarFragment = this.LJLJI.LIZJ;
        if (!o.LJ(horizontalFuncBarFragment.wl().getCurrentFuncType(), "root_item") && (value = horizontalFuncBarFragment.wl().getRootFuncListState().getValue()) != null) {
            horizontalFuncBarFragment.xl(value);
            View view = horizontalFuncBarFragment.LJLJL;
            if (view != null) {
                view.setVisibility(8);
            }
            horizontalFuncBarFragment.LJLIL = true;
            horizontalFuncBarFragment.wl().dispatch(new AnonymousClass530());
        }
    }

    @Override // X.C50Q
    public final AnonymousClass525 LJI() {
        if (this.LJLJL) {
            AnonymousClass525 anonymousClass525 = this.LJLJJL;
            if (anonymousClass525 != null) {
                return anonymousClass525;
            }
            throw new IllegalStateException("functionManager is null.");
        }
        throw new IllegalStateException("You haven not init FunctionBarController yet.");
    }

    @Override // X.C50Q
    public final List<AnonymousClass523> LJII() {
        HorizontalFuncBarFragment horizontalFuncBarFragment = this.LJLJI.LIZJ;
        if (horizontalFuncBarFragment.LJLLILLLL && o.LJ(horizontalFuncBarFragment.LJLLJ.getValue(), Boolean.TRUE)) {
            C1296757b c1296757b = horizontalFuncBarFragment.LJLJJL;
            if (c1296757b != null) {
                return c1296757b.LJLIL;
            }
        } else {
            C1296757b c1296757b2 = horizontalFuncBarFragment.LJLJJI;
            if (c1296757b2 != null) {
                return c1296757b2.LJLIL;
            }
        }
        return null;
    }

    @Override // X.C50Q
    public final void LJIIIZ() {
        AnonymousClass523 LJI;
        AnonymousClass528 anonymousClass528;
        InterfaceC1286152z interfaceC1286152z = this.LJLJLLL;
        if (interfaceC1286152z != null && (LJI = interfaceC1286152z.LJI()) != null && (anonymousClass528 = this.LJLLLL) != null) {
            anonymousClass528.LIZ(LJI, null);
        }
    }

    public final boolean LJIILJJIL() {
        Fragment LJJJIL;
        if (this.LJLJLJ != null && (LJJJIL = this.LJLIL.getSupportFragmentManager().LJJJIL(this.LJLJLJ)) != null) {
            C2ND.LIZ(new AqS152S0100000_2(LJJJIL, 42), 0L);
            return true;
        }
        return false;
    }

    public final FunctionBarViewModel LJIILLIIL() {
        return (FunctionBarViewModel) this.LJLLILLLL.getValue();
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onDestroy() {
        this.LJLL.clear();
        C53H c53h = this.LJLJI;
        if (c53h.LIZJ.isAdded()) {
            FragmentManager supportFragmentManager = c53h.LIZ.getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            LIZ.LJJI(c53h.LIZJ);
            LIZ.LJII();
        }
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onHide() {
        if (this.LJLJL) {
        } else {
            throw new IllegalStateException("You haven not init FunctionBarController yet.");
        }
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onShow() {
        if (this.LJLJL) {
            C53H c53h = this.LJLJI;
            int i = this.LJLILLLLZI;
            ActivityC45651qj activity = this.LJLIL;
            c53h.getClass();
            o.LJIIIZ(activity, "activity");
            c53h.LIZLLL = Integer.valueOf(i);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            if (c53h.LIZJ.isAdded()) {
                LIZ.LJIIL(c53h.LIZJ);
            } else {
                LIZ.LIZIZ(i, c53h.LIZJ);
            }
            LIZ.LJII();
            return;
        }
        throw new IllegalStateException("You haven not init FunctionBarController yet.");
    }

    public final boolean LJIJ() {
        boolean z;
        AnonymousClass523 currentItem = LJIILLIIL().getCurrentItem();
        String currentFuncType = LJIILLIIL().getCurrentFuncType();
        boolean z2 = false;
        if (currentItem == null && o.LJ(currentFuncType, "root_item")) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC1286152z interfaceC1286152z = this.LJLJLLL;
        if (interfaceC1286152z != null) {
            z2 = interfaceC1286152z.LJ(currentItem, z);
        }
        return !z2;
    }

    @Override // X.C50Q
    public final boolean onBackPressed() {
        C52A c52a;
        if (LJIILJJIL()) {
            return true;
        }
        AnonymousClass528 anonymousClass528 = this.LJLLLL;
        if (anonymousClass528 != null && (c52a = anonymousClass528.LIZJ) != null) {
            c52a.LIZJ();
        }
        if (this.LJLJJLL == null) {
            return false;
        }
        return LJIIZILJ(LJIILLIIL().getCurrentItem());
    }

    @Override // X.C50Q
    public final C53H LJIILIIL() {
        return this.LJLJI;
    }

    @Override // X.C50Q
    public final void LIZJ(C1282051k c1282051k) {
        ArrayList<AnonymousClass523> LIZJ = c1282051k.LIZJ();
        LJIILLIIL().setRootFunctionList(LIZJ);
        AnonymousClass526 anonymousClass526 = this.LJLJJLL;
        if (anonymousClass526 == null) {
            return;
        }
        o.LJIIIZ(LIZJ, "<set-?>");
        anonymousClass526.LIZ = LIZJ;
    }

    @Override // X.C50Q
    public final void LIZLLL(C50M c50m) {
        if (!this.LJLL.contains(c50m)) {
            this.LJLL.add(c50m);
        }
    }

    @Override // X.C50Q
    public final void LJ(C53G c53g) {
        C53H c53h = this.LJLJI;
        c53h.getClass();
        HorizontalFuncBarFragment horizontalFuncBarFragment = c53h.LIZJ;
        horizontalFuncBarFragment.getClass();
        horizontalFuncBarFragment.LJLJJLL = c53g;
    }

    @Override // X.C50Q
    public final void LJIIIIZZ(AbstractC1282851s abstractC1282851s) {
        AnonymousClass528 anonymousClass528 = this.LJLLLL;
        if (anonymousClass528 != null) {
            anonymousClass528.LIZIZ.add(abstractC1282851s);
        }
    }

    @Override // X.C50Q
    public final void LJIIJJI(C127654zh c127654zh) {
        this.LJLLI = c127654zh;
    }

    public final void LJIILL(AnonymousClass523 anonymousClass523) {
        AnonymousClass525 anonymousClass525 = this.LJLJJL;
        if (anonymousClass525 != null) {
            LJIILLIIL().showChildList(anonymousClass523, anonymousClass525.LIZ(anonymousClass523));
        }
        Iterator<AnonymousClass533> it = this.LJLL.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(anonymousClass523);
        }
    }

    public final boolean LJIIZILJ(AnonymousClass523 anonymousClass523) {
        boolean z = false;
        if (LJIILLIIL().isRootState()) {
            return false;
        }
        AnonymousClass523 anonymousClass5232 = null;
        if (anonymousClass523 != null) {
            AnonymousClass523 anonymousClass5233 = anonymousClass523.LIZIZ;
            if (!(anonymousClass5233 instanceof AnonymousClass523) || anonymousClass5233 == null) {
                AnonymousClass526 anonymousClass526 = this.LJLJJLL;
                if (anonymousClass526 != null) {
                    anonymousClass5232 = anonymousClass526.LIZIZ(anonymousClass523);
                }
            } else {
                anonymousClass5232 = anonymousClass5233;
            }
        }
        InterfaceC127724zo interfaceC127724zo = this.LJLLI;
        if (interfaceC127724zo != null) {
            z = interfaceC127724zo.LIZ(LJIILLIIL().getLastFuncTypeState());
        }
        if (z) {
            Iterator<AnonymousClass533> it = this.LJLL.iterator();
            while (it.hasNext()) {
                it.next().LIZJ(anonymousClass5232);
            }
            return true;
        }
        if (anonymousClass523 == null) {
            LJFF();
        } else if (anonymousClass5232 == null) {
            LJFF();
        } else if (o.LJ(anonymousClass5232.LJ, "root_item")) {
            LJFF();
        } else {
            AnonymousClass525 anonymousClass525 = this.LJLJJL;
            if (anonymousClass525 != null) {
                anonymousClass525.LIZ.showChildList(anonymousClass5232, anonymousClass525.LIZ(anonymousClass5232));
            }
            this.LJLLL = anonymousClass523;
        }
        Iterator<AnonymousClass533> it2 = this.LJLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(anonymousClass5232);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.534] */
    public C1286052y(ActivityC45651qj activity, int i, int i2) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = i;
        this.LJLJI = new C53H(activity, this);
        this.LJLL = new ArrayList<>();
        this.LJLLILLLL = C221108m2.LIZIZ(AnonymousClass531.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(AnonymousClass532.LJLIL);
        this.LJLLLLLL = new Object(this) { // from class: X.534
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        ((java.util.ArrayList) r7.LJIIL).add(r4);
     */
    @Override // X.C50Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.bytedance.ies.nle.editor_jni.NLETrack r11, com.bytedance.ies.nle.editor_jni.NLETrackSlot r12, com.bytedance.ies.nle.editor_jni.NLETrack r13, com.bytedance.ies.nle.editor_jni.NLETrackSlot r14, X.QXX r15, boolean r16, boolean r17) {
        /*
            r10 = this;
            r2 = 0
            r3 = r12
            if (r3 == 0) goto L68
            X.525 r1 = r10.LJLJJL
            if (r1 == 0) goto L28
            if (r11 == 0) goto L28
            X.52z r0 = r10.LJLJLLL
            if (r0 == 0) goto L28
            X.523 r6 = r0.LIZLLL(r11, r3, r1)
            if (r6 == 0) goto L28
            java.lang.String r1 = r6.LJIIIZ
            if (r1 == 0) goto L22
            X.526 r0 = r10.LJLJJLL
            if (r0 == 0) goto L22
            X.523 r7 = r0.LIZ(r1)
            if (r7 != 0) goto L29
        L22:
            r0 = 1
            r10.LJLJJI = r0
            r10.LJIILL(r6)
        L28:
            return
        L29:
            r6.LIZIZ = r7
            java.util.ArrayList r0 = r6.LIZIZ()
            java.util.Iterator r5 = r0.iterator()
        L33:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r4 = r5.next()
            X.523 r4 = (X.AnonymousClass523) r4
            java.util.List<X.523> r0 = r7.LJIIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L47:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.523 r0 = (X.AnonymousClass523) r0
            java.lang.String r1 = r0.LJ
            java.lang.String r0 = r4.LJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L47
            if (r2 != 0) goto L33
        L60:
            java.util.List<X.523> r0 = r7.LJIIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            goto L33
        L68:
            com.ss.ugc.android.editor.base.viewmodel.FunctionBarViewModel r0 = r10.LJIILLIIL()
            X.523 r8 = r0.getCurrentItem()
            boolean r0 = r10.LJIJ()
            if (r0 == 0) goto L79
            r10.LJIILJJIL()
        L79:
            boolean r0 = r10.LJLJJI
            r1 = 0
            if (r0 == 0) goto L87
            X.523 r0 = r10.LJLLL
            if (r0 == 0) goto L85
            r10.LJLLL = r2
            r8 = r0
        L85:
            r10.LJLJJI = r1
        L87:
            if (r8 == 0) goto Ld3
            X.52z r2 = r10.LJLJLLL
            if (r2 == 0) goto Ld3
            com.ss.ugc.android.editor.base.viewmodel.FunctionBarViewModel r0 = r10.LJIILLIIL()
            java.lang.String r9 = r0.getLastFuncTypeState()
            r4 = r13
            r5 = r14
            r7 = r17
            r6 = r16
            boolean r0 = r2.LIZIZ(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto Ld3
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld3
            X.52z r0 = r10.LJLJLLL
            if (r0 == 0) goto Lb5
            boolean r0 = r0.LIZ(r8, r15)
            if (r0 != 0) goto L28
        Lb5:
            if (r8 == 0) goto L28
            X.523 r2 = r8.LIZIZ
            boolean r0 = r2 instanceof X.AnonymousClass523
            if (r0 == 0) goto L28
            if (r2 == 0) goto L28
            java.lang.String r1 = r2.LJ
            java.lang.String r0 = "root_item"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lce
            r10.LJFF()
            goto L28
        Lce:
            r10.LJIILL(r2)
            goto L28
        Ld3:
            r10.LJFF()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1286052y.LJIIL(com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.QXX, boolean, boolean):void");
    }
}
