package X;

import X.WAA;
import Y.ARunnableS50S0100000_14;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class WA5<T extends WAA> extends WA4<T> {
    public final WBE LIZIZ;
    public final ScheduledExecutorService LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public final WB1 LJFF;
    public final ARunnableS50S0100000_14 LJI;

    public final synchronized void LJ() {
        if (!this.LIZLLL) {
            this.LIZLLL = true;
            this.LIZJ.schedule(this.LJI, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // X.WA4, X.WAA
    public final boolean LIZ(int i, Canvas canvas, Drawable drawable) {
        this.LJ = this.LIZIZ.now();
        boolean LIZ = super.LIZ(i, canvas, drawable);
        LJ();
        return LIZ;
    }

    public WA5(WA0 wa0, WA0 wa02, WBE wbe, ScheduledExecutorService scheduledExecutorService) {
        super(wa0);
        this.LJI = new ARunnableS50S0100000_14(this, 239);
        this.LJFF = wa02;
        this.LIZIZ = wbe;
        this.LIZJ = scheduledExecutorService;
    }

    public WA5(WA0 wa0, WA0 wa02, WBE wbe, ScheduledExecutorService scheduledExecutorService, int i) {
        super(wa0);
        this.LJI = new ARunnableS50S0100000_14(this, 239);
        this.LJFF = wa02;
        this.LIZIZ = wbe;
        this.LIZJ = scheduledExecutorService;
    }
}
