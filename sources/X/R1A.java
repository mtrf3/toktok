package X;

import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public final class R1A implements InterfaceC67661Qgz, Runnable {
    public static final HandlerC67289Qaz LJLJJI = new HandlerC67289Qaz(C16880lQ.LLJJJJ());
    public static final SparseArray LJLJJL = new SparseArray(2);
    public static final AtomicInteger LJLJJLL = new AtomicInteger();
    public int LJLIL;
    public R18 LJLILLLLZI;
    public AbstractC67638Qgc LJLJI;

    public final void LIZ() {
        if (this.LJLJI != null && this.LJLILLLLZI != null) {
            LJLJJL.delete(this.LJLIL);
            LJLJJI.removeCallbacks(this);
            R18 r18 = this.LJLILLLLZI;
            if (r18 != null) {
                r18.LIZ(this.LJLJI);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LJLJJL.delete(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC67661Qgz
    public final void onComplete(AbstractC67638Qgc abstractC67638Qgc) {
        this.LJLJI = abstractC67638Qgc;
        LIZ();
    }
}
