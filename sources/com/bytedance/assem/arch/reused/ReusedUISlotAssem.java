package com.bytedance.assem.arch.reused;

import X.C15X;
import X.C15Y;
import X.C16880lQ;
import X.C16950lX;
import X.C212428Vi;
import X.C212468Vm;
import X.C212488Vo;
import X.C212508Vq;
import X.C212518Vr;
import X.C212788Ws;
import X.C214368bA;
import X.C221108m2;
import X.C3C8;
import X.C5H3;
import X.C76800UCe;
import X.EnumC221088m0;
import X.InterfaceC212498Vp;
import X.InterfaceC65784Pro;
import X.X1D;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS6S0201000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class ReusedUISlotAssem<RECEIVER extends C3C8> extends ReusedUIAssem<RECEIVER> {
    public static final C5H3<Boolean> LLD;
    public static final C5H3<Boolean> LLF;
    public int LJLZ;
    public View LJZL;
    public C212518Vr LJZ = C212518Vr.LIZ;
    public final C5H3 LJZI = C221108m2.LIZ(EnumC221088m0.NONE, C212788Ws.INSTANCE);
    public final Queue<Runnable> LL = new LinkedList();

    public abstract int W3();

    public void Z3() {
    }

    public void a4() {
    }

    public void b4() {
    }

    public void c4() {
    }

    public void e4() {
    }

    static {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        LLD = C221108m2.LIZ(enumC221088m0, C212488Vo.LJLIL);
        LLF = C221108m2.LIZ(enumC221088m0, C212468Vm.LJLIL);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public void E3() {
        if (this.LJZL != null) {
            Y3().setVisibility(8);
        }
    }

    public final View Y3() {
        View view = this.LJZL;
        if (view != null) {
            return view;
        }
        o.LJIJI("contentView");
        throw null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onCreateView() {
        final View findViewById;
        C212508Vq c212508Vq;
        InterfaceC212498Vp interfaceC212498Vp;
        if (this.LJLLL && this.LJZL != null) {
            M3(getContainerView());
            N3(getContainerView());
            return;
        }
        boolean z = true;
        if (this.LJLZ != 0) {
            int W3 = W3();
            if (W3 != 0) {
                if (this.LJLLJ == null) {
                    z = false;
                }
                if (z) {
                    findViewById = getContainerView();
                } else {
                    View view = getSupervisor().LJLLL;
                    if (view == null || (findViewById = view.findViewById(this.LJLZ)) == null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("assem: ");
                        LIZ.append(this);
                        LIZ.append(", slotView is null");
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        LIZIZ.toString();
                        throw new IllegalStateException(LIZIZ);
                    }
                }
                if (findViewById instanceof ViewGroup) {
                    C212518Vr c212518Vr = this.LJZ;
                    if (o.LJ(c212518Vr, C212518Vr.LIZIZ)) {
                        Context context = getContext();
                        if (context != null) {
                            new C15Y(context).LIZ(W3, (ViewGroup) findViewById, new C15X() { // from class: X.8WH
                                @Override // X.C15X
                                public final void onInflateFinished(View v, int i, ViewGroup viewGroup) {
                                    o.LJIIIZ(v, "v");
                                    if (this.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                                        return;
                                    }
                                    ((ViewGroup) findViewById).addView(v);
                                    this.setContainerView(findViewById);
                                    ReusedUISlotAssem<RECEIVER> reusedUISlotAssem = this;
                                    reusedUISlotAssem.getClass();
                                    reusedUISlotAssem.LJZL = v;
                                    this.M3(v);
                                    this.N3(v);
                                }
                            });
                            return;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    if (o.LJ(c212518Vr, C212518Vr.LIZJ)) {
                        Context context2 = getContext();
                        if (context2 != null) {
                            View LIZ2 = C16950lX.LIZ(context2, W3, new FrameLayout(context2), false, -1);
                            if (LIZ2 == null) {
                                return;
                            }
                            ((ViewGroup) findViewById).addView(LIZ2);
                            this.LJLLJ = findViewById;
                            this.LJZL = LIZ2;
                            M3(LIZ2);
                            N3(LIZ2);
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (o.LJ(c212518Vr, C212518Vr.LIZLLL)) {
                        C214368bA.LIZ().execute(new ARunnableS6S0201000_3(W3, this, findViewById, 0));
                        return;
                    }
                    if (o.LJ(c212518Vr, C212518Vr.LIZ)) {
                        Context context3 = getContext();
                        if (context3 != null) {
                            ViewGroup viewGroup = (ViewGroup) findViewById;
                            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context3), W3, viewGroup, false);
                            if (LLLLIILL == null) {
                                return;
                            }
                            viewGroup.addView(LLLLIILL);
                            this.LJLLJ = findViewById;
                            this.LJZL = LLLLIILL;
                            M3(LLLLIILL);
                            N3(LLLLIILL);
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (!(c212518Vr instanceof C212508Vq)) {
                        return;
                    }
                    C212518Vr c212518Vr2 = this.LJZ;
                    if (!(c212518Vr2 instanceof C212508Vq) || (c212508Vq = (C212508Vq) c212518Vr2) == null || (interfaceC212498Vp = c212508Vq.LJ) == null) {
                        return;
                    }
                    Context context4 = getContext();
                    if (context4 != null) {
                        interfaceC212498Vp.LJ(context4, this.LJZ, W3, findViewById, new AqS134S0200000_3(findViewById, (View) this, 29));
                        return;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                "container must be a ViewGroup.".toString();
                throw new IllegalStateException("container must be a ViewGroup.");
            }
            "layoutId must be assigned.".toString();
            throw new IllegalStateException("layoutId must be assigned.");
        }
        "slotLayoutId must be assigned.".toString();
        throw new IllegalStateException("slotLayoutId must be assigned.");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onDestroy() {
        g4(new AqS153S0100000_3((ReusedUISlotAssem) this, 37));
        X3(new AqS153S0100000_3((ReusedUISlotAssem) this, 38));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onPause() {
        g4(new AqS153S0100000_3((ReusedUISlotAssem) this, 39));
        X3(new AqS153S0100000_3((ReusedUISlotAssem) this, 40));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onResume() {
        g4(new AqS153S0100000_3((ReusedUISlotAssem) this, 41));
        X3(new AqS153S0100000_3((ReusedUISlotAssem) this, 42));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onStart() {
        g4(new AqS153S0100000_3((ReusedUISlotAssem) this, 43));
        X3(new AqS153S0100000_3((ReusedUISlotAssem) this, 44));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onStop() {
        g4(new AqS153S0100000_3((ReusedUISlotAssem) this, 45));
        X3(new AqS153S0100000_3((ReusedUISlotAssem) this, 46));
    }

    public static final /* synthetic */ void O3(ReusedUISlotAssem reusedUISlotAssem) {
        super.onDestroy();
    }

    public static final /* synthetic */ void P3(ReusedUISlotAssem reusedUISlotAssem) {
        super.onPause();
    }

    public static final /* synthetic */ void Q3(ReusedUISlotAssem reusedUISlotAssem) {
        super.onResume();
    }

    public static final /* synthetic */ void R3(ReusedUISlotAssem reusedUISlotAssem) {
        super.onStart();
    }

    public static final /* synthetic */ void U3(ReusedUISlotAssem reusedUISlotAssem) {
        super.onStop();
    }

    public static void k4(InterfaceC65784Pro interfaceC65784Pro) {
        if (!C214368bA.LJ) {
            C212428Vi.LJ(new AqS153S0100000_3(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 48));
        }
    }

    public final void X3(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (C214368bA.LJ) {
            ((LinkedList) this.LL).add(new ARunnableS39S0100000_3((InterfaceC65784Pro) interfaceC65784Pro, 19));
            AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3((ReusedUISlotAssem) this, 36);
            if (this.LJLLLL) {
                aqS153S0100000_3.invoke();
            } else {
                this.LJLLLLLL.add(aqS153S0100000_3);
            }
        }
    }

    public final void g4(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (o.LJ(this.LJZ, C212518Vr.LIZLLL)) {
            C214368bA.LIZ().execute(new ARunnableS22S0200000_3(this, interfaceC65784Pro, 6));
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    public final void l4(C212518Vr value) {
        o.LJIIIZ(value, "value");
        C212518Vr c212518Vr = C212518Vr.LIZIZ;
        if (!o.LJ(value, c212518Vr) || !LLD.getValue().booleanValue()) {
            c212518Vr = C212518Vr.LIZJ;
            if (!o.LJ(value, c212518Vr) || !LLF.getValue().booleanValue()) {
                c212518Vr = C212518Vr.LIZLLL;
                if (!o.LJ(value, c212518Vr) || !LLF.getValue().booleanValue()) {
                    if (!(value instanceof C212508Vq)) {
                        value = C212518Vr.LIZ;
                    }
                    this.LJZ = value;
                }
            }
        }
        value = c212518Vr;
        this.LJZ = value;
    }
}
