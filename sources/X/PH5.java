package X;

import android.view.Choreographer;

/* loaded from: classes12.dex */
public final class PH5 implements Choreographer.FrameCallback {
    public final /* synthetic */ PH4 LJLIL;

    public PH5(PH4 ph4) {
        this.LJLIL = ph4;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        PH4 ph4 = this.LJLIL;
        if (ph4.LJIIJ == -1) {
            ph4.LJIIJ = j;
        }
        ph4.getClass();
        PH4 ph42 = this.LJLIL;
        ph42.LJIIL++;
        if (ph42.LIZIZ) {
            C16880lQ.LLIIIJ().postFrameCallback(this);
        }
        PH4 ph43 = this.LJLIL;
        long j2 = ph43.LJIIJJI;
        if (j2 > 0) {
            long j3 = j - j2;
            if (j3 / 1000000 > 0) {
                synchronized (ph43) {
                    if (ph43.LJI.size() > 20000) {
                        ph43.LJI.poll();
                    }
                    ph43.LJI.add(Integer.valueOf(((int) j3) / 10000));
                }
            }
        }
        this.LJLIL.LJIIJJI = j;
    }
}
