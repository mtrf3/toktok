package X;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes16.dex */
public class XFJ implements InterfaceC47978IsI {
    public final byte[] LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public volatile Exception LIZLLL;
    public final /* synthetic */ XFL LJ;

    @Override // X.InterfaceC47978IsI
    public final void execute() {
        XFL xfl;
        byte[] bArr;
        RandomAccessFile randomAccessFile = this.LJ.LJFF;
        if (randomAccessFile != null) {
            try {
                if (randomAccessFile.length() == 0) {
                    long j = this.LIZIZ;
                    if (j % 16 != 0) {
                        XFL xfl2 = this.LJ;
                        int i = (int) (16 - (j % 16));
                        xfl2.LJIIJ = i;
                        j += i;
                        xfl2.LJIIJJI = Arrays.copyOf(this.LIZ, i);
                    }
                    this.LJ.LJI = j;
                    XFL xfl3 = this.LJ;
                    xfl3.LIZ("Produce on empty file, mMp4HeaderSize:%d", Long.valueOf(xfl3.LJI));
                    if (this.LIZIZ == 0) {
                        C43150Gwc.LJIIIZ(100102, this.LJ.LJIJ, "");
                    }
                    int i2 = (int) j;
                    C43882HKc.LIZLLL(i2, "parallel_upload_ve_compile_first_offset", null, C48331Ixz.LJ());
                    this.LJ.LJFF.write(new byte[i2], 0, i2);
                    XFL xfl4 = this.LJ;
                    RandomAccessFile randomAccessFile2 = xfl4.LJFF;
                    byte[] bArr2 = this.LIZ;
                    int i3 = xfl4.LJIIJ;
                    randomAccessFile2.write(bArr2, i3, this.LIZJ - i3);
                } else {
                    this.LJ.LJFF.seek(this.LIZIZ);
                    this.LJ.LJFF.write(this.LIZ, 0, this.LIZJ);
                    if (this.LIZIZ == 0 && (bArr = (xfl = this.LJ).LJIIJJI) != null) {
                        xfl.LJFF.write(bArr, 0, xfl.LJIIJ);
                    }
                }
                this.LJ.LJIIJJI("write offset:%d size:%d", Long.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ));
            } catch (IOException e) {
                this.LIZLLL = e;
            } catch (ArrayIndexOutOfBoundsException unused) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ArrayIndexOutOfBoundsException: index out of bounds when producing data, mSize = ");
                LIZ.append(this.LIZJ);
                LIZ.append(", alignBias = ");
                LIZ.append(this.LJ.LJIIJ);
                C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
            }
        }
        ((ReentrantLock) this.LJ.LIZ).lock();
        this.LJ.LIZIZ.signalAll();
        ((ReentrantLock) this.LJ.LIZ).unlock();
    }

    public XFJ(XFL xfl, byte[] bArr, long j, int i) {
        this.LJ = xfl;
        this.LIZ = bArr;
        this.LIZIZ = j;
        this.LIZJ = i;
    }
}
