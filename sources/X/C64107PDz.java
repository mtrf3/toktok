package X;

import java.util.Iterator;

/* renamed from: X.PDz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64107PDz implements PD3 {
    public final /* synthetic */ PE0 LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<PE2> it = this.LJLIL.LJI.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(System.currentTimeMillis());
        }
        if (this.LJLIL.LIZIZ) {
            this.LJLIL.LJ(this);
        }
    }

    @Override // X.PD3
    public final PD7 LJIJ() {
        return PD7.LIGHT_WEIGHT;
    }

    public C64107PDz(PE0 pe0) {
        this.LJLIL = pe0;
    }
}
