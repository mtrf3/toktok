package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public abstract class Q20 {
    public ArrayList<Q20> LIZ = new ArrayList<>();
    public int LIZIZ = Integer.MAX_VALUE;

    public final void LIZ(Q20 q20) {
        Iterator<Q20> it = this.LIZ.iterator();
        while (it.hasNext()) {
            if (it.next() == q20) {
                return;
            }
        }
        this.LIZ.add(q20);
    }

    public boolean LIZIZ(C66343Q1z c66343Q1z) {
        if (c66343Q1z.LIZIZ) {
            int i = this.LIZIZ;
            int i2 = c66343Q1z.LIZJ;
            if (i >= i2 && i2 != Integer.MAX_VALUE) {
                return false;
            }
        }
        return true;
    }

    public void LIZJ(C66343Q1z c66343Q1z) {
        if (LIZIZ(c66343Q1z)) {
            Iterator<Q20> it = this.LIZ.iterator();
            while (it.hasNext()) {
                Q20 next = it.next();
                next.LJ(c66343Q1z, this);
                next.LIZJ(c66343Q1z);
            }
        }
    }

    public Object LIZLLL(C66343Q1z c66343Q1z) {
        return Boolean.TRUE;
    }

    public void LJFF(int i) {
        this.LIZIZ = Math.min(this.LIZIZ, i);
    }

    public void LJ(C66343Q1z c66343Q1z, Q20 q20) {
        c66343Q1z.LIZ(this).LIZ = true;
    }
}
