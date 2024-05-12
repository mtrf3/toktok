package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBZ implements InterfaceC13840gW<String, String> {
    public final String LIZ;

    public XBZ(String unzipDir) {
        o.LJIIJ(unzipDir, "unzipDir");
        this.LIZ = unzipDir;
    }

    @Override // X.InterfaceC13840gW
    public final String LIZ(String str) {
        boolean z;
        String param = str;
        o.LJIIJ(param, "param");
        String unzipFileFolderPath = this.LIZ;
        o.LJIIJ(unzipFileFolderPath, "unzipFileFolderPath");
        boolean z2 = false;
        if (!ujb.o.LJJJJJL(param) && !ujb.o.LJJJJJL(unzipFileFolderPath)) {
            String LIZ = XBM.LIZ(unzipFileFolderPath);
            if (LIZ == null || ujb.o.LJJJJJL(LIZ)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    C10820be.LJIILL(LIZ);
                    if (C10820be.LJIJI(param, LIZ) && XBM.LJIIIIZZ(LIZ, unzipFileFolderPath, false)) {
                        z2 = true;
                    } else {
                        C10820be.LJIILL(LIZ);
                        C10820be.LJIILL(unzipFileFolderPath);
                    }
                } catch (Exception e) {
                    try {
                        C10820be.LJIILL(LIZ);
                    } catch (Exception unused) {
                    }
                    try {
                        C10820be.LJIILL(unzipFileFolderPath);
                        throw e;
                    } catch (Exception unused2) {
                        throw e;
                    }
                }
            }
        }
        if (z2) {
            C10820be.LJIILL(param);
            return this.LIZ;
        }
        throw new XB6("unzip file failed!");
    }
}
