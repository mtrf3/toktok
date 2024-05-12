package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class VUX implements Runnable {
    public final WeakReference<VUT> LJLIL;

    public final void LIZ() {
        if (this.LJLIL.get() != null) {
            VUT vut = this.LJLIL.get();
            int scrollY = vut.getScrollY();
            int scrollX = vut.LLIIII.getScrollX();
            if (!vut.LLIIIL ? vut.LLIL - scrollY != 0 : vut.LLILII - scrollX != 0) {
                vut.LLIL = scrollY;
                vut.LLILII = scrollX;
                vut.postDelayed(this, vut.LLILIL);
            } else {
                vut.LJIJJ(0);
                Iterator<VUZ> it = vut.LLIILII.iterator();
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

    public VUX(VUT vut) {
        this.LJLIL = new WeakReference<>(vut);
    }
}
