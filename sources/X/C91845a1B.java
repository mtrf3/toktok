package X;

import java.util.TimerTask;

/* renamed from: X.a1B, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91845a1B extends TimerTask {
    public final /* synthetic */ C92188a6i LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C92188a6i c92188a6i = this.LJLIL;
            c92188a6i.LJI.setValue(c92188a6i.LJ());
        } finally {
            if (LIZ) {
            }
        }
    }

    public C91845a1B(C92188a6i c92188a6i) {
        this.LJLIL = c92188a6i;
    }
}
