package X;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes16.dex */
public class XFN implements InterfaceC47978IsI {
    public final long LIZ;
    public final byte[] LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public volatile int LJ;
    public Exception LJFF;
    public volatile XFP LJI;
    public final /* synthetic */ XFL LJII;

    @Override // X.InterfaceC47978IsI
    public final void execute() {
        int length = (int) this.LJII.LJIILL.length();
        if (!this.LJII.LJII) {
            if (this.LIZJ > length) {
                this.LJI = XFP.CONSUME_WAIT_DATA;
                return;
            } else {
                LIZIZ(length);
                return;
            }
        }
        if (this.LIZ < length) {
            LIZIZ(length);
        } else {
            LIZ(XFP.CONSUME_END);
        }
    }

    public final void LIZ(XFP xfp) {
        ((ReentrantLock) this.LJII.LIZJ).lock();
        this.LJI = xfp;
        this.LJII.LIZLLL.signalAll();
        ((ReentrantLock) this.LJII.LIZJ).unlock();
    }

    public final void LIZIZ(int i) {
        long min = Math.min(this.LIZLLL, i) - this.LIZ;
        if (min > 16) {
            min -= min % 16;
        }
        this.LJ = (int) min;
        RandomAccessFile randomAccessFile = this.LJII.LJFF;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(this.LIZ);
                this.LJII.LJFF.read(this.LIZIZ, 0, this.LJ);
                LIZ(XFP.CONSUME_DONE);
            } catch (IOException e) {
                this.LJFF = e;
                LIZ(XFP.CONSUME_FAIL);
            }
        }
    }

    public XFN(XFL xfl, long j, byte[] bArr, int i, int i2) {
        this.LJII = xfl;
        this.LIZ = j;
        this.LIZIZ = bArr;
        this.LIZLLL = i + j;
        this.LIZJ = j + i2;
    }
}
