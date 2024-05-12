package X;

import java.util.concurrent.Executor;

/* renamed from: X.Pc2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ExecutorC64806Pc2 implements Executor {
    public static volatile C64831PcR LJLIL;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        int i;
        if (runnable != null) {
            EnumC64807Pc3 enumC64807Pc3 = EnumC64807Pc3.NORMAL;
            if (runnable instanceof InterfaceRunnableC64808Pc4) {
                InterfaceRunnableC64808Pc4 interfaceRunnableC64808Pc4 = (InterfaceRunnableC64808Pc4) runnable;
                int priority = interfaceRunnableC64808Pc4.priority();
                if (priority == 0) {
                    enumC64807Pc3 = EnumC64807Pc3.LOW;
                } else if (1 != priority) {
                    if (2 == priority) {
                        enumC64807Pc3 = EnumC64807Pc3.HIGH;
                    } else if (3 == priority) {
                        enumC64807Pc3 = EnumC64807Pc3.IMMEDIATE;
                    }
                }
                z = interfaceRunnableC64808Pc4.isStreaming();
                i = interfaceRunnableC64808Pc4.LJJIIZI();
            } else {
                z = false;
                i = 0;
            }
            if (LJLIL == null) {
                if (C64831PcR.LIZJ == null) {
                    synchronized (C64831PcR.class) {
                        if (C64831PcR.LIZJ == null) {
                            C64831PcR.LIZJ = new C64831PcR();
                        }
                    }
                }
                LJLIL = C64831PcR.LIZJ;
            }
            C64834PcU c64834PcU = new C64834PcU("NetExecutor", enumC64807Pc3, i, runnable);
            if (z) {
                LJLIL.LIZIZ(c64834PcU);
            } else {
                LJLIL.LIZ(c64834PcU);
            }
        }
    }
}
