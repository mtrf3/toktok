package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class LUX {
    public static volatile LUX LJII;
    public boolean LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public LUW LJFF;
    public final List<LUY> LJI = new ArrayList();

    public static LUX LIZIZ() {
        if (LJII == null) {
            synchronized (LUX.class) {
                if (LJII == null) {
                    LJII = new LUX();
                }
            }
        }
        return LJII;
    }

    public final void LIZLLL() {
        if (!this.LIZ) {
            return;
        }
        if (this.LJFF.hasMessages(1)) {
            this.LJFF.removeMessages(1);
        }
        this.LJFF.sendEmptyMessageDelayed(1, 500L);
    }

    public final synchronized void LIZJ(LUY luy) {
        if (luy != null) {
            if (!((ArrayList) this.LJI).contains(luy)) {
                ((ArrayList) this.LJI).add(luy);
                if (this.LIZ) {
                    luy.LIZIZ(this.LIZLLL, this.LIZIZ);
                }
            }
        }
    }

    public final synchronized void LIZ(String str, String str2) {
        Iterator it = ((ArrayList) this.LJI).iterator();
        while (it.hasNext()) {
            ((LUY) it.next()).LIZIZ(str, str2);
        }
    }
}
