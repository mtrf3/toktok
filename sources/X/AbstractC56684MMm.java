package X;

import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: X.MMm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC56684MMm {
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public volatile AtomicInteger LIZ = new AtomicInteger(0);
    public String LJ = "";
    public String LJFF = "";

    public abstract JSONObject LIZ();

    public abstract JSONObject LIZIZ();

    public abstract JSONObject LIZJ();

    public void LIZLLL() {
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = "";
        this.LJFF = "";
        this.LIZ.set(0);
    }

    public abstract String LJ();

    public final boolean LJFF() {
        return this.LIZ.compareAndSet(0, 1);
    }

    public final boolean LJI() {
        if (this.LIZ.get() == 1) {
            return true;
        }
        return false;
    }

    public final void LJII() {
        if (this.LIZ.compareAndSet(1, 2)) {
            C09900aA.LJI(LJ(), LIZ(), LIZJ(), LIZIZ());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SLI EventName: ");
            LIZ.append(LJ());
            LIZ.append(" \n Category: ");
            LIZ.append(LIZ());
            LIZ.append(" \n Metric: ");
            LIZ.append(LIZJ());
            LIZ.append("  ExtraLog: ");
            LIZ.append(LIZIZ());
            C221018lt.LIZ("ISLIReportTracker", X1D.LIZIZ(LIZ));
            LIZLLL();
        }
    }
}
