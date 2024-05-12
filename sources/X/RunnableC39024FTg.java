package X;

import android.os.Process;

/* renamed from: X.FTg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39024FTg implements Runnable {
    public static final RunnableC39024FTg LJLIL = new RunnableC39024FTg();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Process.killProcess(Process.myPid());
        } finally {
            if (LIZ) {
            }
        }
    }
}
