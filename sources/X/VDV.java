package X;

import Y.ARunnableS50S0100000_14;
import android.os.Handler;
import java.util.HashSet;

/* loaded from: classes15.dex */
public final class VDV {
    public final FOZ LIZJ;
    public final VDO LIZLLL;
    public final long LJII;
    public final int LJIIIIZZ;
    public final java.util.Set<InterfaceC79372VDc> LIZ = new HashSet();
    public final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());
    public VDW LJ = null;
    public boolean LJFF = false;
    public int LJI = 0;

    public final void LIZ() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        FOZ foz = this.LIZJ;
        foz.LIZ.execute(new ARunnableS50S0100000_14(this, 208));
    }

    public VDV(FOZ foz, VDO vdo) {
        this.LJII = 10000L;
        this.LJIIIIZZ = 5;
        this.LIZJ = foz;
        this.LIZLLL = vdo;
        this.LJII = 10000L;
        this.LJIIIIZZ = 5;
    }
}
