package X;

import android.util.Pair;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public abstract class PEL {
    public final String LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final PE3 LIZLLL;

    public Pair<String, ?> LIZ() {
        return null;
    }

    public Pair<String, ?> LIZIZ(long j, long j2) {
        return null;
    }

    public abstract void LIZLLL(int i);

    public void LIZJ() {
        if (this.LIZIZ >= 0) {
            this.LIZIZ = 2;
            return;
        }
        throw new IllegalStateException("collector has destroyed, can not start.");
    }

    public PEL(int i, String str) {
        this.LIZ = str;
        this.LIZJ = i;
        C64125PEr LIZLLL = C64125PEr.LIZLLL();
        if (!((CopyOnWriteArrayList) LIZLLL.LIZ).contains(this)) {
            ((CopyOnWriteArrayList) LIZLLL.LIZ).add(this);
            if (LIZLLL.LIZJ) {
                LIZJ();
            }
        }
        this.LIZLLL = PD2.LIZ;
    }
}
