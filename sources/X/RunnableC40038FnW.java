package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.FnW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC40038FnW implements Runnable {
    public static final RunnableC40038FnW LJLIL = new RunnableC40038FnW();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            new PthreadThread(RunnableC40037FnV.LJLIL, "LynxSettingsDownloader$schedule$2").start();
        } finally {
            if (LIZ) {
            }
        }
    }
}
