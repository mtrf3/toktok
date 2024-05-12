package X;

import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class GQC implements Runnable {
    public final WeakReference<GSU> LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            GSU gsu = this.LJLIL.get();
            if (gsu != null) {
                gsu.setSelection(gsu.getText().length());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public GQC(GSU gsu) {
        this.LJLIL = new WeakReference<>(gsu);
    }
}
