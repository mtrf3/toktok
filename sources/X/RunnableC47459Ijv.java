package X;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.Ijv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47459Ijv implements Runnable {
    public final C47458Iju LJLIL;
    public final C47461Ijx LJLILLLLZI;

    public final void LIZ() {
        synchronized (this.LJLIL) {
            C47461Ijx c47461Ijx = this.LJLILLLLZI;
            if (!c47461Ijx.LJFF) {
                this.LJLIL.LJLJJI.add(c47461Ijx);
            } else {
                ((LinkedBlockingQueue) this.LJLIL.LJLJJI).clear();
                ((LinkedBlockingQueue) this.LJLIL.LJLIL).clear();
                ((LinkedBlockingQueue) this.LJLIL.LJLIL).offer(c47461Ijx);
            }
            this.LJLIL.notify();
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

    public RunnableC47459Ijv(C47458Iju c47458Iju, C47461Ijx c47461Ijx) {
        this.LJLIL = c47458Iju;
        this.LJLILLLLZI = c47461Ijx;
    }
}
