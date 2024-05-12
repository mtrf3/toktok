package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;

/* loaded from: classes15.dex */
public final class WA3 implements WBK {
    public static final Class<?> LJFF = WA3.class;
    public final AbstractC78853Ux7 LIZ;
    public final WBH LIZIZ;
    public final Bitmap.Config LIZJ;
    public final ExecutorService LIZLLL;
    public final SparseArray<Runnable> LJ = new SparseArray<>();

    public final void LIZ(WAF waf, WAA waa, int i) {
        int hashCode = (waa.hashCode() * 31) + i;
        synchronized (this.LJ) {
            if (this.LJ.get(hashCode) != null) {
                W58.LJIIJJI(LJFF, "Already scheduled decode job for frame %d", Integer.valueOf(i));
            } else {
                if (waf.LIZLLL(i)) {
                    W58.LJIIJJI(LJFF, "Frame %d is cached already.", Integer.valueOf(i));
                    return;
                }
                WA2 wa2 = new WA2(this, waa, waf, i, hashCode);
                this.LJ.put(hashCode, wa2);
                this.LIZLLL.execute(wa2);
            }
        }
    }

    public WA3(AbstractC78853Ux7 abstractC78853Ux7, C81837W9x c81837W9x, Bitmap.Config config, ExecutorService executorService) {
        this.LIZ = abstractC78853Ux7;
        this.LIZIZ = c81837W9x;
        this.LIZJ = config;
        this.LIZLLL = executorService;
    }
}
