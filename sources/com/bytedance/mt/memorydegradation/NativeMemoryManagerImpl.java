package com.bytedance.mt.memorydegradation;

import X.C16880lQ;
import X.QXX;

/* loaded from: classes12.dex */
public class NativeMemoryManagerImpl extends QXX {
    public static boolean LJLILLLLZI;
    public long LJLIL;

    public static native long allocateMemory(long j);

    private native void freeMemory(long j);

    public final synchronized void LLLLZIL() {
        LLLLZLLIL();
        long j = this.LJLIL;
        if (j == 0) {
            return;
        }
        freeMemory(j);
        this.LJLIL = 0L;
        Runtime.getRuntime().gc();
    }

    public static synchronized void LLLLZLLIL() {
        synchronized (NativeMemoryManagerImpl.class) {
            if (LJLILLLLZI) {
                return;
            }
            C16880lQ.LLJJJIL("memorydegradation");
            LJLILLLLZI = true;
        }
    }

    public final synchronized void LLLLZ(long j) {
        LLLLZLLIL();
        if (this.LJLIL != 0) {
            return;
        }
        if (j <= 0) {
            return;
        }
        this.LJLIL = allocateMemory(j);
    }
}
