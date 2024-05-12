package X;

import java.util.TimerTask;

/* renamed from: X.IoU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47742IoU extends TimerTask {
    public final /* synthetic */ C47736IoO LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C47739IoR c47739IoR = this.LJLIL.LIZLLL;
            if (c47739IoR != null) {
                c47739IoR.LIZLLL = 0;
                c47739IoR.LIZIZ("all", null);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public C47742IoU(C47736IoO c47736IoO) {
        this.LJLIL = c47736IoO;
    }
}
