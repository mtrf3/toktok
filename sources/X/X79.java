package X;

import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes16.dex */
public final class X79 implements Runnable {
    public final /* synthetic */ File LJLIL;
    public final /* synthetic */ byte[] LJLILLLLZI;
    public final /* synthetic */ X7A LJLJI;
    public final /* synthetic */ File LJLJJI;
    public final /* synthetic */ C64333PMr LJLJJL;
    public final /* synthetic */ Boolean LJLJJLL;
    public final /* synthetic */ X78 LJLJL;

    public final void LIZ() {
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.LJLIL, "rw");
                try {
                    randomAccessFile.write(this.LJLILLLLZI);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    randomAccessFile.close();
                    randomAccessFile = new RandomAccessFile(new File(this.LJLJL.LIZ, "dso_manifest"), "rw");
                    try {
                        X7A x7a = this.LJLJI;
                        x7a.getClass();
                        randomAccessFile.writeByte(1);
                        randomAccessFile.writeInt(x7a.LIZ.length);
                        int i = 0;
                        while (true) {
                            X73[] x73Arr = x7a.LIZ;
                            if (i < x73Arr.length) {
                                randomAccessFile.writeUTF(x73Arr[i].LJLIL);
                                randomAccessFile.writeUTF(x7a.LIZ[i].LJLILLLLZI);
                                i++;
                            } else {
                                randomAccessFile.close();
                                SysUtil.LIZIZ(this.LJLJL.LIZ);
                                X78.LJIILIIL(this.LJLJJI, (byte) 1);
                                this.LJLJJL.close();
                                return;
                            }
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                this.LJLJJL.close();
                throw th;
            }
        } catch (IOException e) {
            if (this.LJLJJLL.booleanValue()) {
            } else {
                throw new RuntimeException(e);
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

    public X79(X78 x78, File file, byte[] bArr, X7A x7a, File file2, C64333PMr c64333PMr, Boolean bool) {
        this.LJLJL = x78;
        this.LJLIL = file;
        this.LJLILLLLZI = bArr;
        this.LJLJI = x7a;
        this.LJLJJI = file2;
        this.LJLJJL = c64333PMr;
        this.LJLJJLL = bool;
    }
}
