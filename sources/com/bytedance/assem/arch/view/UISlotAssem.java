package com.bytedance.assem.arch.view;

import X.C15X;
import X.C15Y;
import X.C16880lQ;
import X.C16950lX;
import X.C212458Vl;
import X.C212478Vn;
import X.C212508Vq;
import X.C212518Vr;
import X.C212528Vs;
import X.C221108m2;
import X.C5H3;
import X.EnumC221088m0;
import X.InterfaceC212498Vp;
import X.X1D;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class UISlotAssem extends UIAssem {
    public static final C212528Vs LJLJJLL = new Object() { // from class: X.8Vs
    };
    public static final C5H3<Boolean> LJLJL;
    public static final C5H3<Boolean> LJLJLJ;
    public int LJLIL;
    public C15Y LJLILLLLZI;
    public LayoutInflater LJLJI;
    public C212518Vr LJLJJI = C212518Vr.LIZ;
    public View LJLJJL;

    public static /* synthetic */ void A3() {
    }

    public static /* synthetic */ void C3() {
    }

    public abstract int v3();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8Vs] */
    static {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        LJLJL = C221108m2.LIZ(enumC221088m0, C212478Vn.LJLIL);
        LJLJLJ = C221108m2.LIZ(enumC221088m0, C212458Vl.LJLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onCreateView() {
        C212508Vq c212508Vq;
        InterfaceC212498Vp interfaceC212498Vp;
        if (this.LJLIL != 0) {
            View view = getSupervisor().LJLLL;
            if (view != null) {
                final View findViewById = view.findViewById(this.LJLIL);
                if (findViewById != null) {
                    if (findViewById instanceof ViewGroup) {
                        if (this.LJLJJL != null) {
                            ((ViewGroup) findViewById).addView(x3());
                            setContainerView(findViewById);
                            handleOnViewCreated(x3());
                            return;
                        }
                        int v3 = v3();
                        if (v3 != 0) {
                            C212518Vr c212518Vr = this.LJLJJI;
                            if (o.LJ(c212518Vr, C212518Vr.LIZIZ)) {
                                C15Y c15y = this.LJLILLLLZI;
                                if (c15y == null) {
                                    Context context = getContext();
                                    if (context != null) {
                                        c15y = new C15Y(context);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                                c15y.LIZ(v3, (ViewGroup) findViewById, new C15X() { // from class: X.8Vk
                                    @Override // X.C15X
                                    public final void onInflateFinished(View v, int i, ViewGroup viewGroup) {
                                        o.LJIIIZ(v, "v");
                                        if (this.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                                            return;
                                        }
                                        ((ViewGroup) findViewById).addView(v);
                                        this.E3(v);
                                        this.setContainerView(findViewById);
                                        this.handleOnViewCreated(v);
                                    }
                                });
                                return;
                            }
                            if (o.LJ(c212518Vr, C212518Vr.LIZJ)) {
                                Context context2 = getContext();
                                if (context2 != null) {
                                    View LIZ = C16950lX.LIZ(context2, v3, new FrameLayout(context2), false, -1);
                                    if (LIZ == null) {
                                        return;
                                    }
                                    ((ViewGroup) findViewById).addView(LIZ);
                                    E3(LIZ);
                                    setContainerView(findViewById);
                                    handleOnViewCreated(LIZ);
                                    return;
                                }
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            if (o.LJ(c212518Vr, C212518Vr.LIZ)) {
                                LayoutInflater layoutInflater = this.LJLJI;
                                if (layoutInflater == null) {
                                    Context context3 = getContext();
                                    if (context3 != null) {
                                        layoutInflater = C16880lQ.LLZIL(context3);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) findViewById;
                                View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, v3, viewGroup, false);
                                if (LLLLIILL == null) {
                                    return;
                                }
                                viewGroup.addView(LLLLIILL);
                                E3(LLLLIILL);
                                setContainerView(findViewById);
                                handleOnViewCreated(LLLLIILL);
                                return;
                            }
                            if (!(c212518Vr instanceof C212508Vq)) {
                                return;
                            }
                            C212518Vr c212518Vr2 = this.LJLJJI;
                            if (!(c212518Vr2 instanceof C212508Vq) || (c212508Vq = (C212508Vq) c212518Vr2) == null || (interfaceC212498Vp = c212508Vq.LJ) == null) {
                                return;
                            }
                            Context context4 = getContext();
                            if (context4 != null) {
                                interfaceC212498Vp.LJ(context4, this.LJLJJI, v3, findViewById, new AqS134S0200000_3(findViewById, this, 30));
                                return;
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("layoutId must be assigned. in ");
                        LIZ2.append(this);
                        String LIZIZ = X1D.LIZIZ(LIZ2);
                        LIZIZ.toString();
                        throw new IllegalStateException(LIZIZ);
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("container must be a ViewGroup in ");
                    LIZ3.append(this);
                    String LIZIZ2 = X1D.LIZIZ(LIZ3);
                    LIZIZ2.toString();
                    throw new IllegalStateException(LIZIZ2);
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("find view is null in ");
                LIZ4.append(this);
                LIZ4.append(", id: ");
                LIZ4.append(this.LJLIL);
                String LIZIZ3 = X1D.LIZIZ(LIZ4);
                LIZIZ3.toString();
                throw new IllegalStateException(LIZIZ3);
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("container view in supervisor is null in ");
            LIZ5.append(this);
            String LIZIZ4 = X1D.LIZIZ(LIZ5);
            LIZIZ4.toString();
            throw new IllegalStateException(LIZIZ4);
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("slotLayoutId must be assigned in ");
        LIZ6.append(this);
        LIZ6.append('.');
        String LIZIZ5 = X1D.LIZIZ(LIZ6);
        LIZIZ5.toString();
        throw new IllegalStateException(LIZIZ5);
    }

    public final View x3() {
        View view = this.LJLJJL;
        if (view != null) {
            return view;
        }
        o.LJIJI("contentView");
        throw null;
    }

    public final void E3(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLJJL = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (com.bytedance.assem.arch.view.UISlotAssem.LJLJLJ.getValue().booleanValue() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (com.bytedance.assem.arch.view.UISlotAssem.LJLJL.getValue().booleanValue() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r3 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F3(X.C212518Vr r3) {
        /*
            r2 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            X.8Vr r1 = X.C212518Vr.LIZIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r1)
            if (r0 == 0) goto L24
            X.8Vs r0 = com.bytedance.assem.arch.view.UISlotAssem.LJLJJLL
            r0.getClass()
            X.5H3<java.lang.Boolean> r0 = com.bytedance.assem.arch.view.UISlotAssem.LJLJL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
        L20:
            r3 = r1
        L21:
            r2.LJLJJI = r3
            return
        L24:
            X.8Vr r1 = X.C212518Vr.LIZJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r1)
            if (r0 == 0) goto L40
            X.8Vs r0 = com.bytedance.assem.arch.view.UISlotAssem.LJLJJLL
            r0.getClass()
            X.5H3<java.lang.Boolean> r0 = com.bytedance.assem.arch.view.UISlotAssem.LJLJLJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L40
            goto L20
        L40:
            boolean r0 = r3 instanceof X.C212508Vq
            if (r0 == 0) goto L45
            goto L21
        L45:
            X.8Vr r3 = X.C212518Vr.LIZ
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.assem.arch.view.UISlotAssem.F3(X.8Vr):void");
    }
}
