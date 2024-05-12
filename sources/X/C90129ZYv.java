package X;

import java.util.TimerTask;

/* renamed from: X.ZYv, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90129ZYv extends TimerTask {
    public final /* synthetic */ C90130ZYw LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C90130ZYw c90130ZYw = this.LJLIL;
            c90130ZYw.LJ.LJJII(c90130ZYw.LIZ);
            C90130ZYw c90130ZYw2 = this.LJLIL;
            c90130ZYw2.LJ.LIZIZ.postDelayed(this, c90130ZYw2.LIZIZ);
        } finally {
            if (LIZ) {
            }
        }
    }

    public C90129ZYv(C90130ZYw c90130ZYw) {
        this.LJLIL = c90130ZYw;
    }
}
