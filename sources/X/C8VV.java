package X;

import Y.ARunnableS22S0200000_3;
import Y.ARunnableS39S0100000_3;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS70S0110000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.8VV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8VV {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static final void LJI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            interfaceC65784Pro.invoke();
        } else {
            LIZ.post(new ARunnableS39S0100000_3((InterfaceC65784Pro) interfaceC65784Pro, 144));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
    
        if (r6.LIZIZ.containsKey(new X.C62582cw(r2, r8.serviceKey())) == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, X.7C3] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.7C3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.ActivityC45651qj r12, X.InterfaceC88472Yns<? super com.bytedance.assem.arch.core.Assembler, X.C76800UCe> r13) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8VV.LIZIZ(X.1qj, X.Yns):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, X.7C3] */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.bytedance.assem.arch.core.AssemSupervisor, T] */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.bytedance.assem.arch.core.AssemSupervisor, T] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.7C3] */
    public static final void LIZJ(final UIAssem uIAssem, InterfaceC88472Yns<? super Assembler, C76800UCe> interfaceC88472Yns) {
        Assembler LIZ2;
        o.LJIIIZ(uIAssem, "<this>");
        boolean z = false;
        if (C214368bA.LJIJ) {
            ActivityC45651qj LIZ3 = C212428Vi.LIZ(uIAssem);
            if (LIZ3 == null) {
                return;
            }
            SZE.LIZ(String.valueOf(uIAssem.hashCode()), C65352Pkq.LIZ(C88504YoO.class));
            LIZ2 = C7EG.LIZ(LIZ3);
            final C68322mC c68322mC = new C68322mC();
            ?? lv0 = LIZ2.lv0(uIAssem);
            c68322mC.element = lv0;
            if (lv0 == 0) {
                c68322mC.element = new AssemSupervisor(uIAssem, LIZ3, new C8VU(LIZ2, uIAssem, uIAssem.getSupervisor().LJLJL), new C212348Va(LIZ2, uIAssem, uIAssem.getSupervisor().LJLJL));
                if (uIAssem.isContainerViewAssigned()) {
                    ((AssemSupervisor) c68322mC.element).LJLLL = uIAssem.getContainerView();
                } else {
                    uIAssem.addOnAssemContainerViewSetListener$assem_release(new InterfaceC212408Vg() { // from class: X.8VW
                        @Override // X.InterfaceC212408Vg
                        public final void LIZ(View view) {
                            o.LJIIIZ(view, "view");
                            UIAssem.this.removeOnAssemContainerViewSetListener$assem_release(this);
                            AssemSupervisor assemSupervisor = c68322mC.element;
                            if (assemSupervisor.LJLLL == null) {
                                assemSupervisor.LJLLL = view;
                            }
                        }
                    });
                }
                LIZ2.vv0(uIAssem, (AssemSupervisor) c68322mC.element);
                uIAssem.whenDestroy$assem_release(new ARunnableS22S0200000_3(LIZ2, uIAssem, 46));
                ((AssemSupervisor) c68322mC.element).LJLL = uIAssem.isAssemViewCreated$assem_release();
                z = true;
            }
            SZE.LIZIZ(C65352Pkq.LIZ(C88504YoO.class), String.valueOf(uIAssem.hashCode()), new AqS70S0110000_15(uIAssem, z, 1));
        } else {
            ActivityC45651qj LIZ4 = C212428Vi.LIZ(uIAssem);
            if (LIZ4 == null) {
                return;
            }
            SZE.LIZ(String.valueOf(uIAssem.hashCode()), C65352Pkq.LIZ(C88504YoO.class));
            LIZ2 = C7EG.LIZ(LIZ4);
            C68322mC c68322mC2 = new C68322mC();
            ?? jv0 = LIZ2.jv0(uIAssem);
            c68322mC2.element = jv0;
            if (jv0 == 0) {
                c68322mC2.element = new C7C3(LIZ2.jv0(uIAssem.getSupervisor().LJLJL));
                C8K7.LIZ("Data-Store", new AqS150S0200000_3(uIAssem, (UIAssem) c68322mC2, (C68322mC<C7C3>) 69), false);
                LIZ2.tv0(uIAssem, (C7C3) c68322mC2.element);
            }
            C8VA kv0 = LIZ2.kv0(uIAssem);
            if (kv0 == null) {
                kv0 = new C8VA(LIZ2.kv0(uIAssem.getSupervisor().LJLJL));
                LIZ2.uv0(uIAssem, kv0);
            }
            C34K c34k = new C34K();
            if (LIZ2.lv0(uIAssem) == null) {
                final AssemSupervisor LIZ5 = C8VT.LIZ(uIAssem, LIZ4, (C7C3) c68322mC2.element, kv0);
                c34k.element = true;
                if (uIAssem.isContainerViewAssigned()) {
                    LIZ5.LJLLL = uIAssem.getContainerView();
                } else {
                    uIAssem.addOnAssemContainerViewSetListener$assem_release(new InterfaceC212408Vg() { // from class: X.8VY
                        @Override // X.InterfaceC212408Vg
                        public final void LIZ(View view) {
                            o.LJIIIZ(view, "view");
                            UIAssem.this.removeOnAssemContainerViewSetListener$assem_release(this);
                            AssemSupervisor assemSupervisor = LIZ5;
                            if (assemSupervisor.LJLLL == null) {
                                assemSupervisor.LJLLL = view;
                            }
                        }
                    });
                }
                LIZ2.vv0(uIAssem, LIZ5);
                LJI(new AqS150S0200000_3(LIZ2, uIAssem, 70));
                LIZ5.LJLL = uIAssem.isAssemViewCreated$assem_release();
            }
            SZE.LIZIZ(C65352Pkq.LIZ(C88504YoO.class), String.valueOf(uIAssem.hashCode()), new AqS162S0200000_15(uIAssem, c34k, 69));
        }
        LJFF(LIZ2, interfaceC88472Yns);
    }

    public static final void LIZLLL(ReusedUIAssem<? extends C3C8> reusedUIAssem, InterfaceC88472Yns<? super Assembler, C76800UCe> init) {
        o.LJIIIZ(reusedUIAssem, "<this>");
        o.LJIIIZ(init, "init");
        C8VR.LIZ(reusedUIAssem, init);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.7C3] */
    /* JADX WARN: Type inference failed for: r0v51, types: [T, X.7C3] */
    public static final void LJ(C8VZ c8vz, InterfaceC88472Yns<? super Assembler, C76800UCe> interfaceC88472Yns) {
        AssemSupervisor lv0;
        AssemSupervisor lv02;
        C7C3 LIZJ;
        o.LJIIIZ(c8vz, "<this>");
        ActivityC45651qj activity = c8vz.getActivity();
        C8VA c8va = null;
        if (activity == null) {
            return;
        }
        SZE.LIZ(String.valueOf(c8vz.hashCode()), C65352Pkq.LIZ(C88504YoO.class));
        Assembler LIZ2 = C7EG.LIZ(activity);
        C8K7.LIZ("AssemList", new AqS150S0200000_3(LIZ2, c8vz, 64), false);
        C68322mC c68322mC = new C68322mC();
        ?? jv0 = LIZ2.jv0(c8vz);
        c68322mC.element = jv0;
        if (jv0 == 0) {
            LifecycleOwner GW = c8vz.GW();
            if (GW instanceof C8W0) {
                LifecycleOwner GW2 = c8vz.GW();
                o.LJII(GW2, "null cannot be cast to non-null type com.bytedance.assem.arch.core.Assem");
                LIZJ = ((C8W0) GW2).getSupervisor().LIZJ();
            } else if (GW instanceof Fragment) {
                LifecycleOwner GW3 = c8vz.GW();
                o.LJII(GW3, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                AssemSupervisor LIZIZ = C212428Vi.LIZIZ((Fragment) GW3);
                if (LIZIZ != null) {
                    LIZJ = LIZIZ.LIZJ();
                }
                LIZJ = null;
            } else if (GW instanceof ActivityC45651qj) {
                LifecycleOwner GW4 = c8vz.GW();
                o.LJII(GW4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) GW4;
                AssemSupervisor lv03 = C7EG.LIZ(activityC45651qj).lv0(activityC45651qj);
                if (lv03 != null) {
                    LIZJ = lv03.LIZJ();
                }
                LIZJ = null;
            } else if (GW instanceof C8VZ) {
                LifecycleOwner GW5 = c8vz.GW();
                o.LJII(GW5, "null cannot be cast to non-null type com.bytedance.assem.arch.reused.IAssembleComponent");
                C8VZ c8vz2 = (C8VZ) GW5;
                ActivityC45651qj activity2 = c8vz2.getActivity();
                if (activity2 != null && (lv02 = C7EG.LIZ(activity2).lv0(c8vz2)) != null) {
                    LIZJ = lv02.LIZJ();
                }
                LIZJ = null;
            } else {
                throw new IllegalStateException("Don't support this LifecycleOwner.");
            }
            c68322mC.element = new C7C3(LIZJ);
            C8K7.LIZ("Data-Store", new AqS150S0200000_3(c8vz, (C8VZ) c68322mC, (C68322mC<C7C3>) 65), false);
            LIZ2.tv0(c8vz, (C7C3) c68322mC.element);
        }
        C8VA kv0 = LIZ2.kv0(c8vz);
        if (kv0 == null) {
            LifecycleOwner GW6 = c8vz.GW();
            if (GW6 instanceof C8W0) {
                LifecycleOwner GW7 = c8vz.GW();
                o.LJII(GW7, "null cannot be cast to non-null type com.bytedance.assem.arch.core.Assem");
                c8va = ((C8W0) GW7).getSupervisor().LIZLLL();
            } else if (GW6 instanceof Fragment) {
                LifecycleOwner GW8 = c8vz.GW();
                o.LJII(GW8, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                AssemSupervisor LIZIZ2 = C212428Vi.LIZIZ((Fragment) GW8);
                if (LIZIZ2 != null) {
                    c8va = LIZIZ2.LIZLLL();
                }
            } else if (GW6 instanceof ActivityC45651qj) {
                LifecycleOwner GW9 = c8vz.GW();
                o.LJII(GW9, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) GW9;
                AssemSupervisor lv04 = C7EG.LIZ(activityC45651qj2).lv0(activityC45651qj2);
                if (lv04 != null) {
                    c8va = lv04.LIZLLL();
                }
            } else if (GW6 instanceof C8VZ) {
                LifecycleOwner GW10 = c8vz.GW();
                o.LJII(GW10, "null cannot be cast to non-null type com.bytedance.assem.arch.reused.IAssembleComponent");
                C8VZ c8vz3 = (C8VZ) GW10;
                ActivityC45651qj activity3 = c8vz3.getActivity();
                if (activity3 != null && (lv0 = C7EG.LIZ(activity3).lv0(c8vz3)) != null) {
                    c8va = lv0.LIZLLL();
                }
            } else {
                throw new IllegalStateException("Don't support this LifecycleOwner.");
            }
            kv0 = new C8VA(c8va);
            LIZ2.uv0(c8vz, kv0);
        }
        C34K c34k = new C34K();
        if (LIZ2.lv0(c8vz) == null) {
            AssemSupervisor LIZ3 = C8VT.LIZ(c8vz, c8vz.getActivity(), (C7C3) c68322mC.element, kv0);
            c34k.element = true;
            LIZ3.LJLLL = c8vz.getContainerView();
            LIZ2.vv0(c8vz, LIZ3);
            C8V7 c8v7 = C214368bA.LIZIZ;
            if (c8v7 != null) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("IAssembleComponent setAssemSupervisor: ");
                LIZ4.append(c8vz);
                LIZ4.append(", ");
                LIZ4.append(((ConcurrentHashMap) LIZ2.LJLIL).containsKey(c8vz));
                c8v7.log("AssemList", X1D.LIZIZ(LIZ4));
            }
            LJI(new AqS150S0200000_3(LIZ2, c8vz, 66));
        }
        C8K7.LIZ("AssemList", new AqS150S0200000_3(LIZ2, c8vz, 67), false);
        SZE.LIZIZ(C65352Pkq.LIZ(C88504YoO.class), String.valueOf(c8vz.hashCode()), new AqS162S0200000_15(c8vz, c34k, 67));
        LJFF(LIZ2, interfaceC88472Yns);
    }

    public static final void LJFF(Assembler container, InterfaceC88472Yns<? super Assembler, C76800UCe> init) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(init, "init");
        SZE.LJ(C65352Pkq.LIZ(C88494YoE.class), new SZD(), new AqS150S0200000_3(container, init, 59));
    }

    public static void LJIIIIZZ(Fragment fragment, C65776Prg c65776Prg) {
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(fragment);
        if (LIZIZ != null) {
            LIZIZ.LJIIIIZZ(null, c65776Prg);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        if (r5.LIZIZ.containsKey(new X.C62582cw(r2, r7.serviceKey())) == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, X.7C3] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.7C3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(final androidx.fragment.app.Fragment r14, boolean r15, X.InterfaceC88472Yns<? super com.bytedance.assem.arch.core.Assembler, X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8VV.LIZ(androidx.fragment.app.Fragment, boolean, X.Yns):void");
    }

    public static final boolean LJII(UIAssem uIAssem, InterfaceC65350Pko<? extends C8W0> clazz, String str) {
        o.LJIIIZ(uIAssem, "<this>");
        o.LJIIIZ(clazz, "clazz");
        AssemSupervisor LIZJ = C212428Vi.LIZJ(uIAssem);
        if (LIZJ != null) {
            return LIZJ.LJIIIIZZ(str, clazz);
        }
        return false;
    }
}
