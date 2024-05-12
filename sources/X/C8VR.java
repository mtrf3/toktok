package X;

import Y.ARunnableS22S0200000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.google.android.gms.common.ConnectionResult;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS70S0110000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.8VR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8VR {
    public static final <ASSEM extends ReusedUIAssem<? extends C3C8>> void LIZ(ASSEM assem, InterfaceC88472Yns<? super Assembler, C76800UCe> init) {
        ActivityC45651qj LIZ;
        OSZ osz;
        ActivityC45651qj LIZ2;
        o.LJIIIZ(assem, "<this>");
        o.LJIIIZ(init, "init");
        if (C214368bA.LJIJI) {
            SZE.LIZ(String.valueOf(assem.hashCode()), C65352Pkq.LIZ(C88504YoO.class));
            if (assem.getContext() instanceof ActivityC45651qj) {
                Context context = assem.getContext();
                o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                LIZ2 = (ActivityC45651qj) context;
            } else {
                LIZ2 = C212428Vi.LIZ(assem);
                if (LIZ2 == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            Assembler LIZ3 = C7EG.LIZ(LIZ2);
            AssemSupervisor lv0 = LIZ3.lv0(assem);
            if (lv0 != null) {
                SZE.LIZIZ(C65352Pkq.LIZ(C88504YoO.class), String.valueOf(assem.hashCode()), new AqS165S0100000_15((ReusedUIAssem) assem, (Object) 793));
                osz = new OSZ(LIZ3, lv0);
            } else {
                AssemSupervisor assemSupervisor = new AssemSupervisor(assem, LIZ2, new C8VU(LIZ3, assem, assem.getParent()), new C212348Va(LIZ3, assem, assem.getParent()));
                assemSupervisor.LJLLL = assem.getContainerView();
                LIZ3.vv0(assem, assemSupervisor);
                if (C214368bA.LJIILL) {
                    assem.whenDestroy$assem_release(new ARunnableS22S0200000_3(LIZ3, assem, 50));
                }
                OSZ osz2 = new OSZ(assemSupervisor, Boolean.TRUE);
                Object first = osz2.getFirst();
                SZE.LIZIZ(C65352Pkq.LIZ(C88504YoO.class), String.valueOf(assem.hashCode()), new AqS70S0110000_15((ReusedUIAssem) assem, (Object) ((Boolean) osz2.getSecond()).booleanValue(), true));
                osz = new OSZ(LIZ3, first);
            }
        } else {
            SZE.LIZ(String.valueOf(assem.hashCode()), C65352Pkq.LIZ(C88504YoO.class));
            if (assem.getContext() instanceof ActivityC45651qj) {
                Context context2 = assem.getContext();
                o.LJII(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                LIZ = (ActivityC45651qj) context2;
            } else {
                LIZ = C212428Vi.LIZ(assem);
                if (LIZ == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            Assembler LIZ4 = C7EG.LIZ(LIZ);
            C34K c34k = new C34K();
            C7C3 jv0 = LIZ4.jv0(assem);
            if (jv0 == null) {
                c34k.element = true;
                jv0 = new C7C3(LIZ4.jv0(assem.getParent()));
                LIZ4.tv0(assem, jv0);
                C8K7.LIZ("Data-Store", new AqS150S0200000_3((ReusedUIAssem) assem, (Object) jv0, (C7C3) 82), false);
            }
            C8VA kv0 = LIZ4.kv0(assem);
            if (kv0 == null) {
                kv0 = new C8VA(LIZ4.kv0(assem.getParent()));
                LIZ4.uv0(assem, kv0);
            }
            AssemSupervisor lv02 = LIZ4.lv0(assem);
            if (lv02 == null) {
                lv02 = C8VT.LIZ(assem, LIZ, jv0, kv0);
                lv02.LJLLL = assem.getContainerView();
                LIZ4.vv0(assem, lv02);
            }
            if (C214368bA.LJIILL) {
                C8VV.LJI(new AqS150S0200000_3(LIZ4, (ReusedUIAssem) assem, 81));
            }
            SZE.LIZIZ(C65352Pkq.LIZ(C88504YoO.class), String.valueOf(assem.hashCode()), new AqS162S0200000_15((ReusedUIAssem) assem, (Object) c34k, (C34K) 73));
            osz = new OSZ(LIZ4, lv02);
        }
        Assembler assembler = (Assembler) osz.getFirst();
        AssemSupervisor assemSupervisor2 = (AssemSupervisor) osz.getSecond();
        C8VV.LJFF(assembler, init);
        assemSupervisor2.LIZ(null);
    }

    public static final void LIZIZ(C3C8 c3c8, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ReusedUIAssem reusedUIAssem;
        C8V7 c8v7;
        if ((c3c8 instanceof ReusedUIAssem) && (reusedUIAssem = (ReusedUIAssem) c3c8) != null) {
            if (reusedUIAssem.LJLLLL) {
                interfaceC65784Pro.invoke();
                return;
            }
            if ((C214368bA.LJIILLIIL && reusedUIAssem.isDestroy$assem_release()) || (c8v7 = C214368bA.LIZIZ) == null) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reused assem: ");
            LIZ.append(reusedUIAssem);
            LIZ.append(" is not viewcreated!");
            String LIZIZ = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("reused assem: ");
            LIZ2.append(reusedUIAssem);
            LIZ2.append(" is not viewcreated!");
            c8v7.LIZ(new RuntimeException(X1D.LIZIZ(LIZ2)), LIZIZ);
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public static final <REUSED extends ReusedAssem<? extends C3C8>> void LIZJ(final REUSED reused, final InterfaceC65350Pko<? extends ReusedAssem<?>> clazz) {
        final long j;
        o.LJIIIZ(reused, "<this>");
        o.LJIIIZ(clazz, "clazz");
        C8XE c8xe = reused.LJLJLJ;
        if (c8xe != null) {
            j = c8xe.LJLJLJ;
        } else {
            j = 0;
        }
        C214368bA.LIZ().execute(new ARunnableS39S0100000_3(new Runnable() { // from class: X.8VQ
            public final void LIZ() {
                ActivityC45651qj LIZ;
                C8VP remove;
                ReusedAssem<?> reusedAssem;
                C73849Syb<C8X4> LJII;
                C8K7.LIZ("AssemList", new AqS150S0200000_3(ReusedAssem.this, clazz, (InterfaceC65350Pko<? extends ReusedAssem<?>>) 75), false);
                if (C63081OpJ.LJLIIL(ReusedAssem.this.getLifecycle())) {
                    C8K7.LIZ("AssemList", new AqS153S0100000_3(clazz, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED), false);
                    return;
                }
                ReusedAssem reusedAssem2 = ReusedAssem.this;
                if (reusedAssem2.getContext() instanceof ActivityC45651qj) {
                    Context context = reusedAssem2.getContext();
                    o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    LIZ = (ActivityC45651qj) context;
                } else {
                    LIZ = C212428Vi.LIZ(reusedAssem2);
                    if (LIZ == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                Assembler LIZ2 = C7EG.LIZ(LIZ);
                ReusedAssem reusedAssem3 = ReusedAssem.this;
                InterfaceC65350Pko<? extends ReusedAssem<?>> clazz2 = clazz;
                long j2 = j;
                LIZ2.getClass();
                o.LJIIIZ(reusedAssem3, "<this>");
                o.LJIIIZ(clazz2, "clazz");
                AssemSupervisor lv0 = LIZ2.lv0(reusedAssem3);
                if (lv0 == null || !lv0.LJLLILLLL.containsKey(clazz2) || (remove = lv0.LJLLILLLL.remove(clazz2)) == null) {
                    return;
                }
                C8W0 build = remove.build();
                if (!(build instanceof ReusedAssem) || (reusedAssem = (ReusedAssem) build) == null) {
                    return;
                }
                reusedAssem.active = true;
                if (C214368bA.LJIJJ) {
                    C212428Vi.LJ(new C8VO(lv0, reusedAssem, remove, reusedAssem3, j2));
                    return;
                }
                remove.LIZ();
                lv0.LJI(reusedAssem, null);
                C8XE c8xe2 = reusedAssem3.LJLJLJ;
                if (c8xe2 != null) {
                    c8xe2.LJIIJ(reusedAssem, j2);
                }
                reusedAssem.A3();
                C8XE c8xe3 = reusedAssem.LJLJLJ;
                if (c8xe3 != null && (LJII = c8xe3.LJII()) != null) {
                    LJII.onNext(new C8X4(C8X3.HOSTATTACH, reusedAssem));
                }
                lv0.LIZ(reusedAssem);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, 156));
    }
}
