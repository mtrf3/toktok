package X;

import com.ss.ttvideoengine.utils.EngineThreadPool;

/* renamed from: X.Is4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47964Is4 implements Runnable {
    public final Runnable LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.run();
            EngineThreadPool._finished(this);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47964Is4(Runnable runnable) {
        this.LJLIL = runnable;
    }
}
