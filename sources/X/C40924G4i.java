package X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.G4i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40924G4i implements OEF {
    public final long LIZ;
    public long LIZIZ;
    public final RandomAccessFile LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public File LJ;
    public final String LJFF;

    @Override // X.OEF
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // X.OEF
    public final boolean LJJIFFI() {
        if (this.LJFF != null) {
            File file = new File(this.LJFF);
            boolean renameTo = this.LJ.renameTo(file);
            if (renameTo) {
                this.LJ = file;
            }
            return renameTo;
        }
        return false;
    }

    @Override // X.OEF
    public final void LJJII() {
        if (!this.LIZLLL.get()) {
        } else {
            throw new IOException("released!");
        }
    }

    @Override // X.OEF
    public final long position() {
        if (!this.LIZLLL.get()) {
            return this.LIZIZ;
        }
        throw new IOException("released!");
    }

    @Override // X.OEF
    public final void release() {
        if (this.LIZLLL.getAndSet(true)) {
            return;
        }
        C78609UtB.LJJIIZI(this.LIZJ);
    }

    @Override // X.OEF
    public final File LJJIII() {
        return this.LJ;
    }

    @Override // X.OEF
    public final long length() {
        return this.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r4 > r1) goto L6;
     */
    @Override // X.OEF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void position(long r4) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.LIZLLL
            boolean r0 = r0.get()
            if (r0 != 0) goto L1e
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L17
        Le:
            r4 = r1
        Lf:
            r3.LIZIZ = r4
            java.io.RandomAccessFile r0 = r3.LIZJ
            r0.seek(r4)
            return
        L17:
            long r1 = r3.LIZ
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lf
            goto Le
        L1e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "released!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40924G4i.position(long):void");
    }

    @Override // X.OEF
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // X.OEF
    public final synchronized long skip(long j) {
        int skipBytes;
        if (!this.LIZLLL.get()) {
            int i = (int) j;
            if (i == j) {
                skipBytes = this.LIZJ.skipBytes(i);
                this.LIZIZ = this.LIZJ.getFilePointer();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("too large:");
                LIZ.append(j);
                throw new IOException(X1D.LIZIZ(LIZ));
            }
        } else {
            throw new IOException("released!");
        }
        return skipBytes;
    }

    @Override // X.OEF
    public final void write(int i) {
        LJJI(0, new byte[]{(byte) i}, 1);
    }

    @Override // X.OEF
    public final void write(byte[] bArr) {
        LJJI(0, bArr, bArr.length);
    }

    public C40924G4i(String str, File file, long j) {
        this.LIZ = j;
        this.LJ = file;
        this.LJFF = str;
        boolean mkdirs = file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.LIZJ = randomAccessFile;
            randomAccessFile.setLength(j);
        } catch (Exception e) {
            boolean exists = file.getParentFile().exists();
            C78609UtB.LJJIIZI(this.LIZJ);
            if (e instanceof FileNotFoundException) {
                boolean mkdirs2 = file.getParentFile().mkdirs();
                boolean exists2 = file.getParentFile().exists();
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                    this.LIZJ = randomAccessFile2;
                    randomAccessFile2.setLength(j);
                    return;
                } catch (Exception unused) {
                    C78609UtB.LJJIIZI(this.LIZJ);
                    StringBuilder LIZLLL = C00F.LIZLLL("create raf swap failed[2 dir mk:", mkdirs2, ",dir exist:+", exists2, ", dir mk:");
                    C76965UIn.LIZJ(LIZLLL, mkdirs, ",dir exist:+", exists, "]! path: ");
                    LIZLLL.append(file.getAbsolutePath());
                    LIZLLL.append(" caused by: ");
                    LIZLLL.append(e.getMessage());
                    throw new IOException(X1D.LIZIZ(LIZLLL), e);
                }
            }
            StringBuilder LIZLLL2 = C00F.LIZLLL("create raf swap failed[1 dir mk:", mkdirs, ",dir exist:+", exists, "]! path: ");
            LIZLLL2.append(file.getAbsolutePath());
            LIZLLL2.append(" caused by: ");
            LIZLLL2.append(e.getMessage());
            throw new IOException(X1D.LIZIZ(LIZLLL2), e);
        }
    }

    @Override // X.OEF
    public final int LJJI(int i, byte[] bArr, int i2) {
        if (!this.LIZLLL.get()) {
            if (bArr == null || bArr.length == 0 || i2 < 1 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                long j = this.LIZIZ;
                long j2 = this.LIZ;
                if (j == j2) {
                    return 0;
                }
                if (i2 + j > j2) {
                    i2 = (int) (j2 - j);
                }
                this.LIZJ.write(bArr, i, i2);
                this.LIZIZ += i2;
                return i2;
            }
        }
        throw new IOException("released!");
    }

    @Override // X.OEF
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.LIZLLL.get()) {
            if (bArr == null || i2 < 1 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                long j = this.LIZIZ;
                long j2 = this.LIZ;
                if (j == j2) {
                    return -1;
                }
                if (i2 + j > j2) {
                    i2 = (int) (j2 - j);
                }
                int read = this.LIZJ.read(bArr, i, i2);
                if (read == -1) {
                    return -1;
                }
                this.LIZIZ += read;
                return read;
            }
        }
        throw new IOException("released!");
    }
}
