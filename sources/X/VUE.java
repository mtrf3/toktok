package X;

import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class VUE implements Runnable {
    public final WeakReference<VUG> LJLIL;

    public final void LIZ() {
        int i;
        WeakReference<VUG> weakReference = this.LJLIL;
        if (weakReference != null && weakReference.get() != null && this.LJLIL.get().LJLLI != null) {
            VUG vug = this.LJLIL.get();
            if (vug.LLFII) {
                int realScrollX = vug.getRealScrollX();
                int realScrollY = vug.getRealScrollY();
                int i2 = vug.LLI;
                VUM vum = vug.LJLLI;
                if (!vug.LJLLLLLL) {
                    int i3 = realScrollY + i2;
                    vug.LJFF(realScrollX, i3, false);
                    if (vug.getMeasuredHeight() + i3 < vum.getMeasuredHeight()) {
                        vug.postDelayed(this, 16L);
                        return;
                    } else {
                        vug.LLFII = false;
                        return;
                    }
                }
                if (C16310kV.LIZLLL(vug) == 1) {
                    i = realScrollX - i2;
                } else {
                    i = realScrollX + i2;
                }
                vug.LJFF(i, realScrollY, false);
                if (i > 0 && vug.getMeasuredWidth() + i < vum.getMeasuredWidth()) {
                    vug.postDelayed(this, 16L);
                } else {
                    vug.LLFII = false;
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

    public VUE(VUG vug) {
        this.LJLIL = new WeakReference<>(vug);
    }
}
