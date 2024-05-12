package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBT implements InterfaceC13840gW<VNB, String> {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC13840gW
    public final String LIZ(VNB vnb) {
        C32631Pv c32631Pv;
        boolean z;
        VNB param = vnb;
        o.LJIIJ(param, "param");
        if (!C10820be.LJ(this.LIZ)) {
            C10820be.LJIIJJI(this.LIZ);
        }
        String LIZ = XBM.LIZ(this.LIZIZ);
        C84426XBm c84426XBm = new C84426XBm(param.LIZJ);
        if (LIZ != null) {
            if (C10820be.LJ(LIZ)) {
                C10820be.LJIILL(LIZ);
            }
            c32631Pv = C10820be.LJIIL(LIZ, false);
        } else {
            c32631Pv = null;
        }
        if (c32631Pv != null) {
            String str = this.LIZJ;
            if (str == null || ujb.o.LJJJJJL(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                XBM.LIZIZ(c84426XBm, c32631Pv, param.LIZLLL, new XEW(this));
                try {
                    c84426XBm.close();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (XBM.LJIIIIZZ(LIZ, this.LIZIZ, false)) {
                    return this.LIZIZ;
                }
                C12310e3.LIZIZ.getClass();
                C12310e3.LIZIZ("FileWriterPipeLine", "file rename failed", null);
                throw new C10850bh("FileWriter error");
            }
            String LIZJ = XBM.LIZJ(c84426XBm, c32631Pv, param.LIZLLL, new XEX(this));
            try {
                c84426XBm.close();
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
            if (o.LJ(LIZJ, this.LIZJ) && XBM.LJIIIIZZ(LIZ, this.LIZIZ, false)) {
                return this.LIZIZ;
            }
            C12310e3.LIZIZ.getClass();
            C12310e3.LIZIZ("FileWriterPipeLine", "md5 check failed", null);
            throw new XB2("MD5 not match");
        }
        throw new C10850bh("FileWriter error");
    }

    public XBT(String cacheDir, String outFilePath, String str) {
        o.LJIIJ(cacheDir, "cacheDir");
        o.LJIIJ(outFilePath, "outFilePath");
        this.LIZ = cacheDir;
        this.LIZIZ = outFilePath;
        this.LIZJ = str;
    }
}
