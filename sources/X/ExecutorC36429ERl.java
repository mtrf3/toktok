package X;

import java.util.concurrent.Executor;

/* renamed from: X.ERl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ExecutorC36429ERl implements Executor {
    public static final ExecutorC36429ERl LJLIL = new ExecutorC36429ERl();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        HandlerThreadC36428ERk LIZIZ = HandlerThreadC36428ERk.LIZIZ();
        if (runnable != null) {
            LIZIZ.LIZJ().post(runnable);
        } else {
            LIZIZ.getClass();
        }
    }
}
