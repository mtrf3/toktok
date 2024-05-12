package X;

import java.io.File;

/* loaded from: classes15.dex */
public class WED implements V1E {
    public boolean LIZ;
    public final /* synthetic */ WEA LIZIZ;

    public WED(WEA wea) {
        this.LIZIZ = wea;
    }

    @Override // X.V1E
    public final void LIZ(File file) {
        if (!this.LIZ && file.equals(this.LIZIZ.LIZJ)) {
            this.LIZ = true;
        }
    }

    @Override // X.V1E
    public final void LIZIZ(File file) {
        if (this.LIZ) {
            WEE LJIILL = this.LIZIZ.LJIILL(file);
            boolean z = false;
            if (LJIILL != null) {
                String str = LJIILL.LIZ;
                if (str == ".tmp") {
                    long lastModified = file.lastModified();
                    this.LIZIZ.LJII.getClass();
                    if (lastModified > System.currentTimeMillis() - WEA.LJIIIZ) {
                        return;
                    }
                } else {
                    if (str == ".cnt") {
                        z = true;
                    }
                    C32151Nz.LJIIIZ(z);
                    return;
                }
            }
        }
        C16880lQ.LLLZZIL(file);
    }

    @Override // X.V1E
    public final void LIZJ(File file) {
        if (!this.LIZIZ.LIZ.equals(file) && !this.LIZ) {
            C16880lQ.LLLZZIL(file);
        }
        if (this.LIZ && file.equals(this.LIZIZ.LIZJ)) {
            this.LIZ = false;
        }
    }
}
