package com.bytedance.applog.util;

import X.C16880lQ;

/* loaded from: classes7.dex */
public class BlockHelper {
    public static volatile boolean LIZ;
    public static volatile int LIZIZ;

    public static void beginBlock() {
        LIZ = true;
        LIZIZ = 0;
    }

    public static void endBlock() {
        LIZ = false;
        LIZIZ = 0;
    }

    public static void tryBlock() {
        while (LIZ) {
            if (LIZ) {
                try {
                    if (LIZIZ < 100) {
                        Thread.sleep(100L);
                    } else {
                        LIZ = false;
                    }
                    LIZIZ++;
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } else {
                LIZIZ = 0;
            }
        }
    }
}
