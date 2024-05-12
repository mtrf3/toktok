package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ckh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC32219Ckh implements Runnable {
    public final C32218Ckg LJLIL;

    public final void LIZ() {
        List<C32218Ckg> list = C32217Ckf.LIZIZ;
        synchronized (list) {
            if (((ArrayList) list).remove(this.LJLIL)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("timeout, remove ");
                LIZ.append(this.LJLIL.LIZIZ);
                C32444CoK.LIZ("StickerGiftTracker", X1D.LIZIZ(LIZ));
                C32217Ckf c32217Ckf = C32217Ckf.LIZ;
                C32218Ckg c32218Ckg = this.LJLIL;
                c32217Ckf.getClass();
                C32217Ckf.LIZ(c32218Ckg, null, 2020, "timeout");
            }
        }
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

    public RunnableC32219Ckh(C32218Ckg c32218Ckg) {
        this.LJLIL = c32218Ckg;
    }
}
