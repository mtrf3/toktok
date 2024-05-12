package X;

import Y.ARunnableS47S0100000_11;
import android.os.Handler;
import com.facebook.GraphRequest;
import m43.u;

/* loaded from: classes12.dex */
public final class Q43 {
    public final Handler LIZ;
    public final GraphRequest LIZIZ;
    public final long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;

    public final void LIZ() {
        long j = this.LIZLLL;
        if (j > this.LJ) {
            BMV bmv = this.LIZIZ.LJ;
            long j2 = this.LJFF;
            if (j2 > 0 && (bmv instanceof Q48)) {
                Handler handler = this.LIZ;
                if (handler == null || Boolean.valueOf(handler.post(new ARunnableS47S0100000_11(bmv, j, j2, 122))) == null) {
                    ((Q48) bmv).LIZIZ();
                }
                this.LJ = this.LIZLLL;
            }
        }
    }

    public Q43(Handler handler, GraphRequest graphRequest) {
        this.LIZ = handler;
        this.LIZIZ = graphRequest;
        Q4J.LJI();
        this.LIZJ = u.LJI.get();
    }
}
