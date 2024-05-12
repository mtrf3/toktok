package X;

import Y.ARunnableS50S0100000_14;
import java.util.concurrent.ExecutionException;

/* renamed from: X.VWk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79874VWk extends Thread {
    public boolean LJLIL;
    public final /* synthetic */ C79873VWj LJLILLLLZI;

    public final void LIZ() {
        C79873VWj c79873VWj;
        C0GQ<T> c0gq;
        while (!isInterrupted() && !this.LJLIL) {
            if (this.LJLILLLLZI.LJFF.isDone()) {
                try {
                    c79873VWj = this.LJLILLLLZI;
                    c0gq = (C0GQ) c79873VWj.LJFF.get();
                } catch (InterruptedException | ExecutionException e) {
                    C79873VWj c79873VWj2 = this.LJLILLLLZI;
                    C0GQ<T> c0gq2 = new C0GQ<>(e);
                    if (c79873VWj2.LJI == null) {
                        c79873VWj2.LJI = c0gq2;
                        c79873VWj2.LJ.post(new ARunnableS50S0100000_14(c79873VWj2, 159));
                    } else {
                        throw new IllegalStateException("A task may only be set once.");
                    }
                }
                if (c79873VWj.LJI == null) {
                    c79873VWj.LJI = c0gq;
                    c79873VWj.LJ.post(new ARunnableS50S0100000_14(c79873VWj, 159));
                    this.LJLIL = true;
                    C79873VWj c79873VWj3 = this.LJLILLLLZI;
                    synchronized (c79873VWj3) {
                        C79874VWk c79874VWk = c79873VWj3.LIZIZ;
                        if (c79874VWk != null && c79874VWk.isAlive()) {
                            if (c79873VWj3.LIZJ.isEmpty() || c79873VWj3.LJI != null) {
                                c79873VWj3.LIZIZ.interrupt();
                                c79873VWj3.LIZIZ = null;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("A task may only be set once.");
                    break;
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79874VWk(C79873VWj c79873VWj) {
        super("LynxLottieTaskObserver");
        this.LJLILLLLZI = c79873VWj;
    }
}
