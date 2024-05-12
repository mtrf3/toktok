package X;

import com.bytedance.keva.Keva;

/* loaded from: classes16.dex */
public final class Y7P implements Runnable {
    public final /* synthetic */ Y7O LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public Y7P(Y7O y7o, long j, String str) {
        this.LJLIL = y7o;
        this.LJLILLLLZI = j;
        this.LJLJI = str;
    }

    public final void LIZ() {
        Y7O y7o = this.LJLIL;
        if (y7o.LJ > this.LJLILLLLZI || !y7o.LJI.compareAndSet(false, true)) {
            return;
        }
        if (this.LJLIL.LJFF.get()) {
            this.LJLIL.LJI.set(false);
            Y7O y7o2 = this.LJLIL;
            y7o2.LJII(y7o2.LJI(), this.LJLJI);
            return;
        }
        Keva keva = Y7O.LJII;
        keva.storeStringJustDisk(this.LJLIL.LIZIZ, this.LJLJI);
        Y7O y7o3 = this.LJLIL;
        long LJI = y7o3.LJI() + 1;
        y7o3.LJ = LJI;
        StringBuilder LIZ = X1D.LIZ();
        keva.storeLong(JBR.LJFF(LIZ, y7o3.LIZIZ, "_version", LIZ), LJI);
        this.LJLIL.LJI.set(false);
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
}
