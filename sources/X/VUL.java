package X;

import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class VUL implements Runnable {
    public final WeakReference<VUG> LJLIL;

    public final void LIZ() {
        boolean z;
        if (this.LJLIL.get() != null) {
            VUG vug = this.LJLIL.get();
            int scrollY = vug.getScrollY();
            int scrollX = vug.LJLLJ.getScrollX();
            if (!vug.LJLLLLLL ? vug.LLF - scrollY != 0 : vug.LLFF - scrollX != 0) {
                z = false;
            } else {
                z = true;
            }
            if (vug.LJLZ || !z) {
                vug.LLF = scrollY;
                vug.LLFF = scrollX;
                vug.postDelayed(this, 100L);
            } else {
                vug.LJ(0);
                VUP vup = vug.LJZL;
                if (vup != null) {
                    vup.LIZJ();
                }
                vug.LJLL.LJJIIZ();
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

    public VUL(VUG vug) {
        this.LJLIL = new WeakReference<>(vug);
    }
}
