package X;

import java.io.File;

/* renamed from: X.Ipq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47826Ipq implements Runnable {
    public final File LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C47756Ioi.LJIILLIIL(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47826Ipq(File file) {
        this.LJLIL = file;
    }
}
