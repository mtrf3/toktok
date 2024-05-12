package X;

import java.io.File;

/* loaded from: classes12.dex */
public final class PB3 {
    public volatile boolean LIZ;
    public File LIZIZ;

    public final synchronized void LIZ() {
        if (this.LIZ) {
            return;
        }
        try {
            File file = new File(O5Y.LJJIIZ(), "header");
            this.LIZIZ = file;
            if (!file.exists()) {
                this.LIZIZ.mkdirs();
            }
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("header store init error ");
            LIZ.append(th.toString());
            C64028PAy.LIZIZ("APM", X1D.LIZIZ(LIZ));
        }
        this.LIZ = true;
    }
}
