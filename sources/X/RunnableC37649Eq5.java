package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import ujb.o;

/* renamed from: X.Eq5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37649Eq5 implements Runnable {
    public static final RunnableC37649Eq5 LJLIL = new RunnableC37649Eq5();

    public static void LIZ() {
        while (true) {
            ConcurrentLinkedQueue<EKE> concurrentLinkedQueue = C37651Eq7.LIZ;
            if (!concurrentLinkedQueue.isEmpty()) {
                EKE poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('(');
                    LIZ.append(C27328Ao0.LIZ(poll.LJ));
                    LIZ.append(") ");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    if (!o.LJJJLIIL(poll.LIZIZ, LIZIZ, false)) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(LIZIZ);
                        LIZ2.append(poll.LIZIZ);
                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                        kotlin.jvm.internal.o.LJIIIZ(LIZIZ2, "<set-?>");
                        poll.LIZIZ = LIZIZ2;
                    }
                    int i = poll.LIZJ;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    InterfaceC37650Eq6 interfaceC37650Eq6 = C37651Eq7.LIZJ;
                                    if (interfaceC37650Eq6 != null) {
                                        interfaceC37650Eq6.v(poll.LIZ, poll.LIZIZ, poll.LIZLLL);
                                    }
                                } else {
                                    InterfaceC37650Eq6 interfaceC37650Eq62 = C37651Eq7.LIZJ;
                                    if (interfaceC37650Eq62 != null) {
                                        interfaceC37650Eq62.e(poll.LIZ, poll.LIZIZ, poll.LIZLLL);
                                    }
                                }
                            } else {
                                InterfaceC37650Eq6 interfaceC37650Eq63 = C37651Eq7.LIZJ;
                                if (interfaceC37650Eq63 != null) {
                                    interfaceC37650Eq63.w(poll.LIZ, poll.LIZIZ, poll.LIZLLL);
                                }
                            }
                        } else {
                            InterfaceC37650Eq6 interfaceC37650Eq64 = C37651Eq7.LIZJ;
                            if (interfaceC37650Eq64 != null) {
                                interfaceC37650Eq64.i(poll.LIZ, poll.LIZIZ, poll.LIZLLL);
                            }
                        }
                    } else {
                        InterfaceC37650Eq6 interfaceC37650Eq65 = C37651Eq7.LIZJ;
                        if (interfaceC37650Eq65 != null) {
                            interfaceC37650Eq65.d(poll.LIZ, poll.LIZIZ, poll.LIZLLL);
                        }
                    }
                }
            } else {
                return;
            }
        }
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
}
