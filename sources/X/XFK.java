package X;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes16.dex */
public class XFK implements InterfaceC47978IsI {
    public final H52 LIZ;
    public final /* synthetic */ XFL LIZIZ;

    @Override // X.InterfaceC47978IsI
    public final void execute() {
        ((ReentrantLock) this.LIZIZ.LIZJ).lock();
        this.LIZIZ.LIZLLL.signalAll();
        ((ReentrantLock) this.LIZIZ.LIZJ).unlock();
        H5B h5b = this.LIZIZ.LJIIIZ;
        if (h5b != null) {
            h5b.LIZ(this.LIZ);
        }
        ((ReentrantLock) this.LIZIZ.LIZ).lock();
        this.LIZIZ.LIZIZ.signalAll();
        ((ReentrantLock) this.LIZIZ.LIZ).unlock();
        RandomAccessFile randomAccessFile = this.LIZIZ.LJFF;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.LIZIZ.LIZ("raf.close();", new Object[0]);
            } catch (IOException e) {
                XFL xfl = this.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("raf.close() ");
                LIZ.append(e.getMessage());
                xfl.LIZ(X1D.LIZIZ(LIZ), new Object[0]);
            }
        }
        XFL xfl2 = this.LIZIZ;
        if (!xfl2.LJIJJLI && xfl2.LJIILL.exists()) {
            C16880lQ.LLLZZIL(this.LIZIZ.LJIILL);
        }
        this.LIZIZ.LJ.LIZ.quit();
    }

    public XFK(XFL xfl, H52 h52) {
        this.LIZIZ = xfl;
        this.LIZ = h52;
    }
}
