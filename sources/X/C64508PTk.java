package X;

import java.io.File;
import java.io.InputStream;

/* renamed from: X.PTk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64508PTk implements InterfaceC63931P7f {
    public final /* synthetic */ C32420Cnw LIZ;
    public final /* synthetic */ C63932P7g LIZIZ;
    public final /* synthetic */ C64507PTj LIZJ;

    public final void LIZ(int i, Throwable th) {
        if (i == 416) {
            try {
                File LJIJI = C78934UyQ.LJIJI(this.LIZJ.LIZ(this.LIZ));
                if (LJIJI.exists()) {
                    C16880lQ.LLLZZIL(LJIJI);
                }
            } catch (Exception unused) {
            }
        }
        this.LIZJ.LIZIZ.LIZIZ(this.LIZ, new C32428Co4("download failed", th, this.LIZ, i, this.LIZIZ));
    }

    public final void LIZIZ(InputStream inputStream, long j) {
        try {
            String LIZ = this.LIZJ.LIZ(this.LIZ);
            File LJIJI = C78934UyQ.LJIJI(LIZ);
            this.LIZJ.LIZIZ(this.LIZ, inputStream, j, LJIJI);
            if (LJIJI.renameTo(new File(LIZ))) {
                this.LIZJ.LIZIZ.LIZJ(this.LIZ, LIZ);
            } else {
                C16880lQ.LLLZZIL(LJIJI);
                throw new Exception("rename file failed");
            }
        } catch (Exception e) {
            this.LIZJ.LIZIZ.LIZIZ(this.LIZ, new C32430Co6("write storage failed.", e, this.LIZ));
        }
    }

    public C64508PTk(C64507PTj c64507PTj, C32420Cnw c32420Cnw, C63932P7g c63932P7g) {
        this.LIZJ = c64507PTj;
        this.LIZ = c32420Cnw;
        this.LIZIZ = c63932P7g;
    }
}
