package X;

import Y.AObjectS22S0001000_6;
import Y.AObjectS23S0000000_6;
import Y.ARunnableS12S0101000_8;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.EXi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36582EXi {
    public static final ExecutorService LIZ;
    public static final Deque<Runnable> LIZIZ = new LinkedList();
    public static volatile boolean LIZJ = false;
    public static volatile int LIZLLL = 0;

    static {
        LIZ = C16880lQ.LLLLZ(1);
        if (((Boolean) DP5.LIZIZ.getValue()).booleanValue()) {
            LIZ = C38995FSd.LJFF();
        }
    }

    public static synchronized void LIZIZ() {
        synchronized (C36582EXi.class) {
            if (LIZJ) {
                return;
            }
            try {
                if (LIZLLL != 0) {
                    while (true) {
                        Deque<Runnable> deque = LIZIZ;
                        if (((LinkedList) deque).size() <= 0) {
                            break;
                        }
                        Runnable runnable = (Runnable) ((LinkedList) deque).pop();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    LIZJ = true;
                }
            } catch (NoSuchElementException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static void LIZ(int i) {
        boolean z;
        LIZLLL = i;
        if (i != 2 && i != 3) {
            if (i != 4) {
                return;
            }
            LIZIZ();
        } else {
            AObjectS23S0000000_6 aObjectS23S0000000_6 = new AObjectS23S0000000_6(7);
            AObjectS22S0001000_6 aObjectS22S0001000_6 = new AObjectS22S0001000_6(2, 8);
            if ((C33778DNm.LIZ() & 256) == 256) {
                z = true;
            } else {
                z = false;
            }
            E3F.LIZJ("InitPushFully_IDEL", aObjectS23S0000000_6, aObjectS22S0001000_6, z);
        }
    }

    public static void LIZJ(Runnable runnable) {
        LIZ.execute(new ARunnableS12S0101000_8(1, runnable, 0));
    }
}
