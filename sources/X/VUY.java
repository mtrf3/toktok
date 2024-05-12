package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class VUY implements Runnable {
    public final WeakReference<VUU> LJLIL;

    public final void LIZ() {
        if (this.LJLIL.get() != null) {
            VUU vuu = this.LJLIL.get();
            int scrollY = vuu.getScrollY();
            int scrollX = vuu.LLIIII.getScrollX();
            if (!vuu.LLIIIL ? vuu.LLIL - scrollY != 0 : vuu.LLILII - scrollX != 0) {
                vuu.LLIL = scrollY;
                vuu.LLILII = scrollX;
                vuu.postDelayed(this, vuu.LLILIL);
            } else {
                vuu.LJIJJ(0);
                Iterator<InterfaceC79812VUa> it = vuu.LLIILII.iterator();
                while (it.hasNext()) {
                    it.next().LIZJ();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public VUY(VUU vuu) {
        this.LJLIL = new WeakReference<>(vuu);
    }
}
