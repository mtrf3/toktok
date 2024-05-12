package X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.G4h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40923G4h implements OEF {
    public final RandomAccessFile LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public File LIZJ;
    public final String LIZLLL;

    @Override // X.OEF
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // X.OEF
    public final boolean LJJIFFI() {
        if (this.LIZLLL != null) {
            File file = new File(this.LIZLLL);
            boolean renameTo = this.LIZJ.renameTo(file);
            if (renameTo) {
                this.LIZJ = file;
            }
            return renameTo;
        }
        return false;
    }

    @Override // X.OEF
    public final void LJJII() {
        if (!this.LIZIZ.get()) {
        } else {
            throw new IOException("released!");
        }
    }

    @Override // X.OEF
    public final long length() {
        return this.LIZ.length();
    }

    @Override // X.OEF
    public final long position() {
        if (!this.LIZIZ.get()) {
            return this.LIZ.getFilePointer();
        }
        throw new IOException("released!");
    }

    @Override // X.OEF
    public final void release() {
        if (this.LIZIZ.getAndSet(true)) {
            return;
        }
        C78609UtB.LJJIIZI(this.LIZ);
    }

    @Override // X.OEF
    public final File LJJIII() {
        return this.LIZJ;
    }

    @Override // X.OEF
    public final void position(long j) {
        if (!this.LIZIZ.get()) {
            if (j < 0) {
                j = 0;
            }
            this.LIZ.seek(j);
            return;
        }
        throw new IOException("released!");
    }

    @Override // X.OEF
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // X.OEF
    public final synchronized long skip(long j) {
        if (!this.LIZIZ.get()) {
            if (((int) j) == j) {
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("too large:");
                LIZ.append(j);
                throw new IOException(X1D.LIZIZ(LIZ));
            }
        } else {
            throw new IOException("released!");
        }
        return this.LIZ.skipBytes(r3);
    }

    @Override // X.OEF
    public final void write(int i) {
        LJJI(0, new byte[]{(byte) i}, 1);
    }

    @Override // X.OEF
    public final void write(byte[] bArr) {
        LJJI(0, bArr, bArr.length);
    }

    public C40923G4h(File file, String str) {
        this.LIZJ = file;
        this.LIZLLL = str;
        boolean mkdirs = file.getParentFile().mkdirs();
        try {
            this.LIZ = new RandomAccessFile(file, "rw");
        } catch (Exception e) {
            boolean exists = file.getParentFile().exists();
            C78609UtB.LJJIIZI(this.LIZ);
            if (e instanceof FileNotFoundException) {
                boolean mkdirs2 = file.getParentFile().mkdirs();
                boolean exists2 = file.getParentFile().exists();
                try {
                    this.LIZ = new RandomAccessFile(file, "rw");
                    return;
                } catch (Exception unused) {
                    C78609UtB.LJJIIZI(this.LIZ);
                    StringBuilder LIZLLL = C00F.LIZLLL("create raf mSwap failed![2 dir mk:", mkdirs2, ",dir exist:+", exists2, ", dir mk:");
                    C76965UIn.LIZJ(LIZLLL, mkdirs, ",dir exist:+", exists, "] path: ");
                    LIZLLL.append(file.getAbsolutePath());
                    LIZLLL.append(" caused by: ");
                    LIZLLL.append(e.getMessage());
                    throw new IOException(X1D.LIZIZ(LIZLLL), e);
                }
            }
            StringBuilder LIZLLL2 = C00F.LIZLLL("create raf mSwap failed![1 dir mk:", mkdirs, ",dir exist:+", exists, "] path: ");
            LIZLLL2.append(file.getAbsolutePath());
            LIZLLL2.append(" caused by: ");
            LIZLLL2.append(e.getMessage());
            throw new IOException(X1D.LIZIZ(LIZLLL2), e);
        }
    }

    @Override // X.OEF
    public final int LJJI(int i, byte[] bArr, int i2) {
        if (!this.LIZIZ.get()) {
            if (bArr == null || bArr.length == 0 || i2 < 1 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                this.LIZ.write(bArr, i, i2);
            }
            return i2;
        }
        throw new IOException("released!");
    }

    @Override // X.OEF
    public final int read(byte[] bArr, int i, int i2) {
        int read;
        if (!this.LIZIZ.get()) {
            if (bArr == null || i2 < 1 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                read = this.LIZ.read(bArr, i, i2);
            }
            return read;
        }
        throw new IOException("released!");
    }
}
