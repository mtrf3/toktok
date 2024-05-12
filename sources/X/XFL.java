package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.CRC32;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XFL {
    public final Lock LIZ;
    public final Condition LIZIZ;
    public final Lock LIZJ;
    public final Condition LIZLLL;
    public final C47977IsH LJ;
    public RandomAccessFile LJFF;
    public volatile long LJI;
    public volatile boolean LJII;
    public volatile L45 LJIIIIZZ;
    public H5B LJIIIZ;
    public int LJIIJ;
    public byte[] LJIIJJI;
    public final int LJIIL;
    public final LinkedList<XFS> LJIILIIL;
    public final String LJIILJJIL;
    public final File LJIILL;
    public final OFW LJIILLIIL;
    public int LJIIZILJ;
    public final String LJIJ;
    public final boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        r9.LJIIZILJ = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        throw new X.VLO("upload timeout");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJFF() {
        /*
            r9 = this;
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "StartGetHeaderSize"
            r9.LJII(r4, r0, r1)
            int r0 = r9.LIZJ()
            r3 = 1
            if (r0 >= 0) goto L1e
            long r1 = (long) r0
        L10:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3[r4] = r0
            java.lang.String r0 = "EndGetHeaderSize result:%d"
            r9.LJII(r4, r0, r3)
            return r1
        L1e:
            long r1 = r9.LJI
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L29
            long r1 = r9.LJI
            goto L10
        L29:
            X.XFO r6 = new X.XFO
            r6.<init>(r9)
            java.util.concurrent.locks.Lock r0 = r9.LIZJ
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            r0.lock()
        L35:
            X.IsH r0 = r9.LJ     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
            r0.LIZ(r6)     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
        L3a:
            java.util.concurrent.locks.Condition r5 = r9.LIZLLL     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
            r0 = 30
            boolean r1 = r5.await(r0, r2)     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
            X.9B5 r0 = r6.LIZ     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
            if (r0 == 0) goto L3a
            if (r1 == 0) goto L74
            int r0 = r9.LIZJ()     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
            if (r0 >= 0) goto L51
            goto L58
        L51:
            X.9B5 r1 = r6.LIZ     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
            X.9B5 r0 = X.C9B5.GET_HEADER_SIZE_WAIT     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
            if (r1 == r0) goto L35
            goto L61
        L58:
            long r1 = (long) r0
            java.util.concurrent.locks.Lock r0 = r9.LIZJ
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            r0.unlock()
            goto L10
        L61:
            java.util.concurrent.locks.Lock r0 = r9.LIZJ
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            r0.unlock()
            long r1 = r9.LJI
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L71
            r1 = -1
            goto L10
        L71:
            long r1 = r9.LJI
            goto L10
        L74:
            r0 = -1
            r9.LJIIZILJ = r0     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
            X.VLO r1 = new X.VLO     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
            java.lang.String r0 = "upload timeout"
            r1.<init>(r0)     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
            throw r1     // Catch: java.lang.InterruptedException -> L7f java.lang.Throwable -> L86
        L7f:
            r1 = move-exception
            X.VLO r0 = new X.VLO     // Catch: java.lang.Throwable -> L86
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L86:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r9.LIZJ
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XFL.LJFF():long");
    }

    public final synchronized void LJI() {
        if (this.LJIJJ) {
            return;
        }
        try {
            String parent = this.LJIILL.getParent();
            Objects.requireNonNull(parent);
            boolean mkdirs = new File(parent).mkdirs();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("create parent dir, result: ");
            LIZ.append(mkdirs);
            LJII(true, X1D.LIZIZ(LIZ), new Object[0]);
            C43070GvK.LIZ(this.LJIILL.getParent());
            String filePath = this.LJIILL.getPath();
            o.LJIIIZ(filePath, "filePath");
            C43070GvK.LIZ.add(filePath);
            if (this.LJIILL.exists()) {
                C16880lQ.LLLZZIL(this.LJIILL);
            }
            C78966Uyw.LJJJJZ(this.LJIILL);
            this.LJFF = new RandomAccessFile(this.LJIILL, "rw");
            LJII(false, "createFile,filePath:%s", this.LJIILL.getAbsolutePath());
            C60903NvH.LJIIJJI().getPublishService().LJJIIJ().getClass();
            C41777GaT.LIZ();
            this.LJIJJ = true;
        } catch (IOException e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ConcurrentUploadByFile, init output file failed, filePath: ");
            LIZ2.append(this.LJIILJJIL);
            LJII(true, X1D.LIZIZ(LIZ2), new Object[0]);
            XFR xfr = new XFR();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("init output file failed, filePath: ");
            LIZ3.append(this.LJIILJJIL);
            xfr.LIZ = X1D.LIZIZ(LIZ3);
            xfr.LIZIZ = e;
            xfr.LIZJ = 88880000;
            C41819Gb9 c41819Gb9 = new C41819Gb9(xfr.LIZ, xfr.LIZIZ);
            c41819Gb9.setErrorCode(xfr.LIZJ);
            throw c41819Gb9;
        }
    }

    public final void LIZIZ() {
        if (!this.LJIJJ) {
            LJII(true, "cancelUpload on not init OutputFile finish", new Object[0]);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop cancelUpload, currentStatus:");
        LIZ.append(this.LJIIIIZZ);
        LJII(true, X1D.LIZIZ(LIZ), new Object[0]);
        if (this.LJIIIIZZ != L45.UPLOADING) {
            return;
        }
        this.LJIIIIZZ = L45.UPLOAD_CANCEL;
        try {
            String filePath = this.LJIILL.getPath();
            o.LJIIIZ(filePath, "filePath");
            C43070GvK.LIZ.remove(filePath);
            this.LJ.LIZ(new XFK(this, H52.CANCEL));
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final int LIZJ() {
        if (L45.UPLOAD_FINISH.equals(this.LJIIIIZZ)) {
            return -1;
        }
        if (L45.UPLOAD_CANCEL.equals(this.LJIIIIZZ)) {
            return -2;
        }
        return 1;
    }

    public final void LJIIIZ(boolean z) {
        H52 h52;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop stopUpload, currentStatus:");
        LIZ.append(this.LJIIIIZZ);
        LJII(true, X1D.LIZIZ(LIZ), new Object[0]);
        if (this.LJIIIIZZ != L45.UPLOADING) {
            return;
        }
        this.LJIIIIZZ = L45.UPLOAD_FINISH;
        try {
            String filePath = this.LJIILL.getPath();
            o.LJIIIZ(filePath, "filePath");
            C43070GvK.LIZ.remove(filePath);
            C47977IsH c47977IsH = this.LJ;
            if (z) {
                h52 = H52.SUCCESS;
            } else {
                h52 = H52.FAILED;
            }
            c47977IsH.LIZ(new XFK(this, h52));
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public XFL(String str, String str2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZ = reentrantLock;
        this.LIZIZ = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.LIZJ = reentrantLock2;
        this.LIZLLL = reentrantLock2.newCondition();
        this.LJI = 0L;
        this.LJIIJ = 0;
        this.LJIIJJI = null;
        SettingsManager.LIZLLL().getClass();
        this.LJIIL = SettingsManager.LJ("concurrent_upload_min_dynamic_slice_size_kb", 0) * 1024;
        this.LJIILIIL = new LinkedList<>();
        this.LJIILLIIL = new OFW((Comparable) (-1L));
        this.LJIIZILJ = 0;
        this.LJIJJ = false;
        this.LJIJJLI = false;
        this.LJ = new C47977IsH();
        this.LJIILJJIL = str;
        this.LJIILL = new File(str);
        this.LJIJ = str2;
        this.LJIIIIZZ = L45.UPLOADING;
        this.LJIJI = GUW.LIZIZ();
    }

    public final void LIZ(String str, Object... objArr) {
        LJII(true, str, objArr);
    }

    public final long LJ(long j, long j2) {
        RandomAccessFile randomAccessFile;
        long value;
        int LIZJ = LIZJ();
        if (LIZJ < 0) {
            value = LIZJ;
        } else {
            if (((int) this.LJIILL.length()) >= j + j2) {
                CRC32 crc32 = new CRC32();
                RandomAccessFile randomAccessFile2 = null;
                try {
                    try {
                        randomAccessFile = new RandomAccessFile(this.LJIILL, "r");
                    } finally {
                        th = th;
                        if (randomAccessFile2 == null) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException e) {
                            C16880lQ.LLLLIIL(e);
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                }
                try {
                    randomAccessFile.seek(j);
                    byte[] bArr = new byte[2048];
                    long j3 = 0;
                    while (j3 < j2) {
                        randomAccessFile.read(bArr);
                        j3 += 2048;
                        crc32.update(bArr, 0, 2048 - ((int) Math.max(0L, j3 - j2)));
                    }
                    value = crc32.getValue();
                    try {
                        randomAccessFile.close();
                    } catch (IOException e3) {
                        C16880lQ.LLLLIIL(e3);
                    }
                } catch (IOException e4) {
                    e = e4;
                    randomAccessFile2 = randomAccessFile;
                    C16880lQ.LLLLIIL(e);
                    if (randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                        } catch (IOException e5) {
                            C16880lQ.LLLLIIL(e5);
                        }
                    }
                    value = -1;
                    LJIIJJI("GetCrc32 offset:%d length:%d result:%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(value));
                    return value;
                }
            }
            value = -1;
        }
        LJIIJJI("GetCrc32 offset:%d length:%d result:%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(value));
        return value;
    }

    public final void LJIIJJI(String str, Object... objArr) {
        LJII(false, str, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
    
        r9.LJIIZILJ = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        throw new X.VLO("upload timeout");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZLLL(int r10, byte[] r11, int r12) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XFL.LIZLLL(int, byte[], int):int");
    }

    public final void LJII(boolean z, String str, Object... objArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLLZI(Locale.US, str, objArr));
        LIZ.append(" hash:");
        LIZ.append(hashCode());
        LIZ.append(",publishId:");
        LIZ.append(this.LJIJ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (z) {
            FP1.LJ("ConcurrentUploadByFile:", LIZIZ);
        }
    }

    public final void LJIIIIZZ(byte[] bArr, long j, int i, boolean z) {
        LJIIJJI("produce offset:%d size:%d isFinish:%b", Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z));
        if (LIZJ() < 0) {
            return;
        }
        XFJ xfj = new XFJ(this, bArr, j, i);
        ((ReentrantLock) this.LIZ).lock();
        try {
            try {
                this.LJ.LIZ(xfj);
                this.LIZIZ.await();
                if (xfj.LIZLLL == null) {
                    ((ReentrantLock) this.LIZ).unlock();
                    this.LJII = z;
                    ((ReentrantLock) this.LIZJ).lock();
                    this.LIZLLL.signalAll();
                    ((ReentrantLock) this.LIZJ).unlock();
                    return;
                }
                throw new VLO(xfj.LIZLLL);
            } catch (InterruptedException e) {
                throw new VLO(e);
            }
        } catch (Throwable th) {
            ((ReentrantLock) this.LIZ).unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        r15.LJIIZILJ = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        throw new X.VLO("upload timeout");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIJ(long r16, byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XFL.LJIIJ(long, byte[], int, int):int");
    }
}
