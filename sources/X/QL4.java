package X;

import Y.ARunnableS47S0100000_11;
import Y.IDHandlerS23S0100000_11;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class QL4 {
    public static final List<String> LJIIL = Collections.singletonList("TaskPresenter");
    public boolean LIZ;
    public volatile boolean LIZIZ;
    public QIS LJ;
    public IDHandlerS23S0100000_11 LJFF;
    public final QI7 LJI;
    public final QI3 LJIIIZ;
    public boolean LIZJ = true;
    public long LIZLLL = System.currentTimeMillis();
    public final List<QIS> LJII = new ArrayList();
    public boolean LJIIIIZZ = false;
    public final ARunnableS47S0100000_11 LJIIJ = new ARunnableS47S0100000_11(this, 156);
    public final ARunnableS47S0100000_11 LJIIJJI = new ARunnableS47S0100000_11(this, 157);

    public final Handler LIZ() {
        if (this.LJFF == null) {
            synchronized (this) {
                if (this.LJFF == null) {
                    this.LJFF = new IDHandlerS23S0100000_11(this, HandlerThreadC36428ERk.LIZIZ().getLooper(), 5);
                }
            }
        }
        return this.LJFF;
    }

    public final void LIZIZ(String str) {
        Handler LIZ = LIZ();
        LIZ.removeMessages(1);
        LIZ.sendMessageDelayed(Message.obtain(LIZ, 1, str), 5000L);
    }

    public QL4(QI3 qi3, C66758QHy c66758QHy, QI6 qi6) {
        this.LJIIIZ = qi3;
        this.LJI = new QI7(qi3, c66758QHy, qi6);
    }
}
