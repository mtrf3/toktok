package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes16.dex */
public class XFM implements InterfaceC47978IsI {
    public final int LIZ;
    public volatile long LIZIZ;
    public volatile int LIZJ;
    public Exception LIZLLL;
    public final byte[] LJ;
    public volatile XFP LJFF;
    public final /* synthetic */ XFL LJI;

    @Override // X.InterfaceC47978IsI
    public final void execute() {
        XFS xfs;
        long j;
        String str;
        Iterator<XFS> it = this.LJI.LJIILIIL.iterator();
        do {
            xfs = null;
            if (!it.hasNext()) {
                break;
            } else {
                xfs = it.next();
            }
        } while (this.LIZ != xfs.LIZ);
        if (xfs == null) {
            if (this.LJI.LJIILIIL.isEmpty()) {
                XFL xfl = this.LJI;
                xfl.LJII(true, "[SliceConsume] createSliceIfNeed mMp4HeaderSize:%d", Long.valueOf(xfl.LJI));
                if (this.LJI.LJI > 0) {
                    j = this.LJI.LJI;
                } else {
                    this.LJI.LJII(true, "[SliceConsume] sliceModel=null consume wait", new Object[0]);
                    this.LJFF = XFP.CONSUME_WAIT_DATA;
                    return;
                }
            } else {
                j = (int) (this.LJI.LJIILIIL.getLast().LIZIZ + r0.LIZJ);
                if (this.LJI.LJII) {
                    if (this.LIZ == 0) {
                        this.LIZIZ = this.LJI.LJI;
                    } else if (j >= this.LJI.LJIILL.length()) {
                        this.LIZIZ = 0L;
                    }
                    j = 0;
                }
            }
            xfs = new XFS(this.LIZ, j, (int) this.LIZIZ);
        }
        long length = this.LJI.LJIILL.length();
        if (length == 0) {
            XFL xfl2 = this.LJI;
            StringBuilder LIZJ = V10.LIZJ("parallel_upload_file_delete_on_consume OutputFileLength:", length, " UploadStatus:");
            LIZJ.append(this.LJI.LJIIIIZZ);
            xfl2.LJII(true, X1D.LIZIZ(LIZJ), new Object[0]);
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("OutputFileLength", Long.valueOf(length));
            if (this.LJI.LJIIIIZZ == null) {
                str = "null";
            } else {
                str = this.LJI.LJIIIIZZ.toString();
            }
            c6bk.LIZ.put("UploadStatus", str);
            C43882HKc.LIZIZ("parallel_upload_file_delete_on_consume", c6bk.LJ());
        }
        try {
            if (((int) (xfs.LIZIZ + xfs.LIZJ)) > this.LJI.LJIILL.length()) {
                XFL xfl3 = this.LJI;
                if (xfl3.LJIIL <= 0) {
                    if (!xfl3.LJII) {
                        this.LJFF = XFP.CONSUME_WAIT_DATA;
                        return;
                    }
                    xfs.LIZJ = (int) (this.LJI.LJIILL.length() - xfs.LIZIZ);
                } else if (xfl3.LJII) {
                    xfs.LIZJ = (int) (this.LJI.LJIILL.length() - xfs.LIZIZ);
                } else {
                    if (xfs.LIZIZ + r10.LJIIL > this.LJI.LJIILL.length()) {
                        this.LJFF = XFP.CONSUME_WAIT_DATA;
                        return;
                    } else {
                        int length2 = (int) (this.LJI.LJIILL.length() - xfs.LIZIZ);
                        xfs.LIZJ = length2 - (length2 % 16);
                    }
                }
            }
            this.LIZJ = xfs.LIZJ;
            this.LJI.LJFF.seek(xfs.LIZIZ);
            int i = xfs.LIZJ;
            if (i < 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ArrayIndexOutOfBoundsException sliceModel.getOffset():");
                LIZ.append(xfs.LIZIZ);
                LIZ.append("  mOutputFile.length():");
                LIZ.append(this.LJI.LJIILL.length());
                C36922EeM.LJFF(new Exception(X1D.LIZIZ(LIZ)));
                LIZ(XFP.CONSUME_FAIL);
                return;
            }
            this.LJI.LJFF.read(this.LJ, 0, i);
            this.LJI.LJIILIIL.add(xfs);
            if (xfs.LIZIZ == 0 && xfs.LIZJ == 0) {
                LIZ(XFP.CONSUME_END);
            } else {
                LIZ(XFP.CONSUME_DONE);
            }
            this.LJI.LJII(false, "consume execute %d-%d", Long.valueOf(xfs.LIZIZ), Integer.valueOf((int) (xfs.LIZIZ + xfs.LIZJ)));
            this.LJI.LJII(true, "consume execute %d-%d", Long.valueOf(xfs.LIZIZ), Integer.valueOf((int) (xfs.LIZIZ + xfs.LIZJ)));
        } catch (IOException e) {
            this.LIZLLL = e;
            LIZ(XFP.CONSUME_FAIL);
        }
    }

    public final void LIZ(XFP xfp) {
        ((ReentrantLock) this.LJI.LIZJ).lock();
        this.LJFF = xfp;
        this.LJI.LIZLLL.signalAll();
        ((ReentrantLock) this.LJI.LIZJ).unlock();
    }

    public XFM(XFL xfl, int i, byte[] bArr, int i2) {
        this.LJI = xfl;
        this.LIZ = i;
        this.LJ = bArr;
        this.LIZIZ = i2;
    }
}
