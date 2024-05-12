package X;

import com.bytedance.pumbaa.PumbaaServiceImpl;

/* renamed from: X.MuB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC58287MuB implements Runnable {
    public static final RunnableC58287MuB LJLIL = new RunnableC58287MuB();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            PumbaaServiceImpl.LJIILIIL().updateSettings();
        } finally {
            if (LIZ) {
            }
        }
    }
}
