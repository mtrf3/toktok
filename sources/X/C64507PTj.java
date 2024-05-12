package X;

import Y.ARunnableS22S0300000_11;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: X.PTj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64507PTj implements InterfaceC64510PTm<String> {
    public final InterfaceC63930P7e LIZ;
    public InterfaceC64509PTl<String> LIZIZ;
    public final InterfaceC32418Cnu LIZJ;

    public final String LIZ(C32420Cnw c32420Cnw) {
        String LJ = C78934UyQ.LJ(this.LIZJ.LIZIZ(c32420Cnw));
        File file = new File(LJ);
        if (file.exists() || file.mkdirs()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJ);
            LIZ.append(C38355F3n.LIZ(c32420Cnw.LIZJ[0]));
            return X1D.LIZIZ(LIZ);
        }
        throw new IOException(C0F0.LIZJ("mkdirs return false, dir=", file));
    }

    public C64507PTj(C63928P7c c63928P7c, InterfaceC32418Cnu interfaceC32418Cnu) {
        this.LIZ = c63928P7c;
        this.LIZJ = interfaceC32418Cnu;
    }

    @Override // X.InterfaceC64510PTm
    public final void LIZLLL(C32420Cnw c32420Cnw, InterfaceC64509PTl<String> interfaceC64509PTl) {
        this.LIZIZ = interfaceC64509PTl;
        C63932P7g c63932P7g = new C63932P7g(c32420Cnw.LIZ());
        try {
            File LJIJI = C78934UyQ.LJIJI(LIZ(c32420Cnw));
            if (LJIJI.exists()) {
                c63932P7g.LIZIZ = LJIJI.length();
            }
        } catch (Exception unused) {
        }
        InterfaceC63930P7e interfaceC63930P7e = this.LIZ;
        C64508PTk c64508PTk = new C64508PTk(this, c32420Cnw, c63932P7g);
        C63928P7c c63928P7c = (C63928P7c) interfaceC63930P7e;
        c63928P7c.getClass();
        String str = c63932P7g.LIZ;
        if (str == null || str.isEmpty()) {
            c64508PTk.LIZ(0, new IllegalArgumentException("request is not valid"));
        } else {
            c63928P7c.LIZ.submit(new ARunnableS22S0300000_11(c63928P7c, c63932P7g, c64508PTk, 9));
        }
    }

    public final void LIZIZ(C32420Cnw c32420Cnw, InputStream inputStream, long j, File file) {
        RandomAccessFile randomAccessFile;
        int exp;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                long length = randomAccessFile.length();
                if (length > 0) {
                    randomAccessFile.seek(length);
                }
                byte[] bArr = new byte[2048];
                long j2 = length + j;
                int i = 0;
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read >= 0) {
                            randomAccessFile.write(bArr, 0, read);
                            length += read;
                            if (j2 > 0) {
                                exp = (int) ((100 * length) / j2);
                            } else {
                                exp = (int) ((1.0d - Math.exp((-length) / 50000.0d)) * 100.0d);
                            }
                            if (exp != i) {
                                try {
                                    this.LIZIZ.LIZ(c32420Cnw, exp);
                                    i = exp;
                                } catch (Throwable th) {
                                    th = th;
                                    if (randomAccessFile != null) {
                                        try {
                                            randomAccessFile.close();
                                            inputStream.close();
                                        } catch (IOException e) {
                                            C16880lQ.LLLLIIL(e);
                                        }
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            try {
                                randomAccessFile.close();
                                inputStream.close();
                                return;
                            } catch (IOException e2) {
                                C16880lQ.LLLLIIL(e2);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }
}
