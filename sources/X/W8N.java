package X;

import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes15.dex */
public class W8N<V> {
    public final int LIZ;
    public final int LIZIZ;
    public final Queue LIZJ;
    public final boolean LIZLLL;
    public int LJ;

    public V LIZIZ() {
        return (V) ((LinkedList) this.LIZJ).poll();
    }

    public void LIZ(V v) {
        ((LinkedList) this.LIZJ).add(v);
    }

    public final void LIZJ(V v) {
        v.getClass();
        boolean z = false;
        if (this.LIZLLL) {
            if (this.LJ > 0) {
                z = true;
            }
            C32151Nz.LJIIIZ(z);
            this.LJ--;
            LIZ(v);
            return;
        }
        int i = this.LJ;
        if (i > 0) {
            this.LJ = i - 1;
            LIZ(v);
        } else {
            W58.LJIIIIZZ("BUCKET", "Tried to release value %s from an empty bucket!", v);
        }
    }

    public W8N(int i, int i2, int i3) {
        boolean z;
        boolean z2;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32151Nz.LJIIIZ(z2);
        C32151Nz.LJIIIZ(i3 >= 0);
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = new LinkedList();
        this.LJ = i3;
        this.LIZLLL = false;
    }
}
