package X;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes15.dex */
public class VAU implements Runnable {
    public long LJLIL = -1;
    public final /* synthetic */ VAJ LJLILLLLZI;

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f3, code lost:
    
        if (r3 >= r1) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAU.LIZ():boolean");
    }

    public final void LIZIZ() {
        synchronized (this.LJLILLLLZI.LJJIIJ) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.LJLILLLLZI.LJJIJIL.get()) {
                this.LJLILLLLZI.LJIL.LIZ();
                this.LJLILLLLZI.LJJIJIL.set(false);
            }
            LIZJ();
            long j = this.LJLIL;
            if (j == -1 || uptimeMillis - j > this.LJLILLLLZI.LJIIIZ) {
                this.LJLIL = uptimeMillis;
                if (LIZ()) {
                    VAR var = this.LJLILLLLZI.LJJIII;
                    if (var != null) {
                        var.sendEmptyMessage(0);
                    }
                } else {
                    VAR var2 = this.LJLILLLLZI.LJJIII;
                    if (var2 != null) {
                        var2.sendEmptyMessage(1);
                    }
                }
            }
            VAJ vaj = this.LJLILLLLZI;
            Handler handler = vaj.LJJIIZ;
            if (handler != null) {
                vaj.getClass();
                handler.postAtTime(this, uptimeMillis + 100);
            }
        }
    }

    public final void LIZJ() {
        VAJ vaj = this.LJLILLLLZI;
        if (vaj.LJJIII != null) {
            synchronized (vaj.LJJJI) {
                if (this.LJLILLLLZI.LJJJIL.size() > 0) {
                    if (SystemClock.uptimeMillis() >= this.LJLILLLLZI.LJJJIL.get(0).LJLIL.longValue()) {
                        this.LJLILLLLZI.LJJIII.sendEmptyMessage(4);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public VAU(VAJ vaj) {
        this.LJLILLLLZI = vaj;
    }
}
