package X;

import com.bytedance.common.utility.Logger;

/* renamed from: X.Pbq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class RunnableC64794Pbq implements Runnable {
    public final AbstractRunnableC64795Pbr LJLIL;

    public final void LIZ() {
        try {
            System.currentTimeMillis();
            this.LJLIL.run();
            Logger.debug();
            if (this.LJLIL.isLoop()) {
                return;
            }
        } catch (Throwable unused) {
            if (this.LJLIL.isLoop()) {
                return;
            }
        }
        C64793Pbp.LIZ(this.LJLIL.mTaskType).LIZIZ.remove(this.LJLIL);
        C64793Pbp.LIZ(this.LJLIL.mTaskType).LIZ.remove(this.LJLIL);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC64794Pbq(AbstractRunnableC64795Pbr abstractRunnableC64795Pbr) {
        this.LJLIL = abstractRunnableC64795Pbr;
    }
}
