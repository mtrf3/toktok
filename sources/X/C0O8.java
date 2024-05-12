package X;

import java.util.ArrayList;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0O8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0O8 {
    public static C0OA LIZ() {
        return C0OF.LJFF((C0OA) C0OF.LIZIZ.LIZ(), null, false);
    }

    public static void LIZLLL() {
        boolean z;
        synchronized (C0OF.LIZJ) {
            if (C0OF.LJIIIIZZ.get().LJII != null) {
                z = true;
                if (!r0.isEmpty()) {
                }
            }
            z = false;
        }
        if (z) {
            C0OF.LJ(C48181uo.LJLIL);
        }
    }

    public static C1IK LIZJ(InterfaceC88471Ynr observer) {
        o.LJIIIZ(observer, "observer");
        C0OF.LJ(C0OF.LIZ);
        synchronized (C0OF.LIZJ) {
            ((ArrayList) C0OF.LJI).add(observer);
        }
        return new C1IK(observer);
    }

    public static Object LIZIZ(InterfaceC65784Pro block, InterfaceC88472Yns interfaceC88472Yns) {
        C0OA c41291jh;
        C1IE c1ie;
        o.LJIIIZ(block, "block");
        if (interfaceC88472Yns == null) {
            return block.invoke();
        }
        C0OA c0oa = (C0OA) C0OF.LIZIZ.LIZ();
        if (c0oa == null || (c0oa instanceof C1IE)) {
            if (c0oa instanceof C1IE) {
                c1ie = (C1IE) c0oa;
            } else {
                c1ie = null;
            }
            c41291jh = new C41291jh(c1ie, interfaceC88472Yns, null, true, false);
        } else {
            c41291jh = c0oa.LJIIZILJ(interfaceC88472Yns);
        }
        try {
            C0OA LJIIIIZZ = c41291jh.LJIIIIZZ();
            try {
                return block.invoke();
            } finally {
                C0OA.LJIILJJIL(LJIIIIZZ);
            }
        } finally {
            c41291jh.LIZJ();
        }
    }

    public static C1IE LJ(IDqS416S0100000 iDqS416S0100000, IDqS172S0200000 iDqS172S0200000) {
        C1IE c1ie;
        C1IE LJJIFFI;
        C0OA LJIIIIZZ = C0OF.LJIIIIZZ();
        if ((LJIIIIZZ instanceof C1IE) && (c1ie = (C1IE) LJIIIIZZ) != null && (LJJIFFI = c1ie.LJJIFFI(iDqS416S0100000, iDqS172S0200000)) != null) {
            return LJJIFFI;
        }
        "Cannot create a mutable snapshot of an read-only snapshot".toString();
        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
    }
}
