package com.ttnet.org.chromium.base;

import X.PDK;
import Y.ARunnableS15S0100100_11;
import Y.ARunnableS1S0000200_11;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.Thread;

/* loaded from: classes12.dex */
public class JavaHandlerThread {
    public final HandlerThread LIZ;
    public Throwable LIZIZ;

    private void joinThread() {
        while (true) {
            try {
                this.LIZ.join();
                return;
            } catch (InterruptedException unused) {
                if (0 != 0) {
                    return;
                }
            }
        }
    }

    private boolean isAlive() {
        return this.LIZ.isAlive();
    }

    private void listenForUncaughtExceptionsForTesting() {
        this.LIZ.setUncaughtExceptionHandler(new PDK(this));
    }

    private Throwable getUncaughtExceptionIfAny() {
        return this.LIZIZ;
    }

    private void quitThreadSafely(long j) {
        new Handler(this.LIZ.getLooper()).post(new ARunnableS15S0100100_11(j, this, 4));
        this.LIZ.getLooper().quitSafely();
    }

    public JavaHandlerThread(String str, int i) {
        this.LIZ = new HandlerThread(str, i);
    }

    public static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    private void startAndInitialize(long j, long j2) {
        if (this.LIZ.getState() == Thread.State.NEW) {
            this.LIZ.start();
        }
        new Handler(this.LIZ.getLooper()).post(new ARunnableS1S0000200_11(j, j2, 1));
    }
}
