package X;

import Y.ARunnableS50S0100000_14;
import java.util.concurrent.ExecutionException;

/* renamed from: X.VWl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79875VWl extends Thread {
    public boolean LJLIL;
    public final /* synthetic */ C79876VWm LJLILLLLZI;

    public final void LIZ() {
        C79876VWm c79876VWm;
        C79877VWn<T> c79877VWn;
        while (!isInterrupted() && !this.LJLIL) {
            if (this.LJLILLLLZI.LJFF.isDone()) {
                try {
                    c79876VWm = this.LJLILLLLZI;
                    c79877VWn = (C79877VWn) c79876VWm.LJFF.get();
                } catch (InterruptedException | ExecutionException e) {
                    C79876VWm c79876VWm2 = this.LJLILLLLZI;
                    C79877VWn<T> c79877VWn2 = new C79877VWn<>(e);
                    if (c79876VWm2.LJI == null) {
                        c79876VWm2.LJI = c79877VWn2;
                        c79876VWm2.LJ.post(new ARunnableS50S0100000_14(c79876VWm2, 260));
                    } else {
                        throw new IllegalStateException("A task may only be set once.");
                    }
                }
                if (c79876VWm.LJI == null) {
                    c79876VWm.LJI = c79877VWn;
                    c79876VWm.LJ.post(new ARunnableS50S0100000_14(c79876VWm, 260));
                    this.LJLIL = true;
                    C79876VWm c79876VWm3 = this.LJLILLLLZI;
                    synchronized (c79876VWm3) {
                        C79875VWl c79875VWl = c79876VWm3.LIZIZ;
                        if (c79875VWl != null && c79875VWl.isAlive()) {
                            if (c79876VWm3.LIZJ.isEmpty() || c79876VWm3.LJI != null) {
                                c79876VWm3.LIZIZ.interrupt();
                                c79876VWm3.LIZIZ = null;
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
    public C79875VWl(C79876VWm c79876VWm) {
        super("LynxLottieTaskObserver");
        this.LJLILLLLZI = c79876VWm;
    }
}
