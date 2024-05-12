package X;

import com.bytedance.pumbaa.PumbaaServiceImpl;

/* renamed from: X.MuC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC58288MuC implements Runnable {
    public static final RunnableC58288MuC LJLIL = new RunnableC58288MuC();

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
