package com.bytedance.geckox.buffer.impl;

import X.C16880lQ;
import X.C45804HyK;
import X.OEF;
import X.V3N;
import android.content.Context;
import com.bytedance.librarian.Librarian;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public class MMapBuffer implements OEF {
    public final long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public File LJ;
    public final String LJFF;

    private native long nCreate(String str, long j);

    private native int nFlush(long j, long j2);

    private native void nRead(long j, long j2, byte[] bArr, int i, int i2);

    private native int nRelease(long j, long j2);

    private native void nWrite(long j, long j2, byte[] bArr, int i, int i2);

    @Override // X.OEF
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    static {
        Context context = V3N.LJLIL;
        if (context == null) {
            C16880lQ.LLJJJIL("buffer");
        } else {
            Librarian.LJFF(context, "buffer");
        }
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
            nFlush(this.LIZIZ, this.LIZ);
            return;
        }
        throw new IOException("released!");
    }

    @Override // X.OEF
    public final long position() {
        if (!this.LIZLLL.get()) {
            return this.LIZJ;
        }
        throw new IOException("released!");
    }

    @Override // X.OEF
    public final void release() {
        if (this.LIZLLL.getAndSet(true)) {
            return;
        }
        nRelease(this.LIZIZ, this.LIZ);
        this.LIZIZ = 0L;
    }

    public final void finalize() {
        super.finalize();
        try {
            release();
        } catch (Exception e) {
            C45804HyK.LJJLIIIJJIZ(e);
        }
    }

    @Override // X.OEF
    public final File LJJIII() {
        return this.LJ;
    }

    @Override // X.OEF
    public final long length() {
        return this.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
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
            if (r0 != 0) goto L19
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L12
        Le:
            r4 = r1
        Lf:
            r3.LIZJ = r4
            return
        L12:
            long r1 = r3.LIZ
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lf
            goto Le
        L19:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "released!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.buffer.impl.MMapBuffer.position(long):void");
    }

    @Override // X.OEF
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // X.OEF
    public final synchronized long skip(long j) {
        if (!this.LIZLLL.get()) {
            if (j <= 0) {
                return 0L;
            }
            long j2 = this.LIZJ;
            long j3 = j + j2;
            this.LIZJ = j3;
            if (j3 < 0) {
                this.LIZJ = 0L;
            } else {
                long j4 = this.LIZ;
                if (j3 > j4) {
                    this.LIZJ = j4;
                }
            }
            return this.LIZJ - j2;
        }
        throw new IOException("released!");
    }

    @Override // X.OEF
    public final void write(int i) {
        LJJI(0, new byte[]{(byte) i}, 1);
    }

    @Override // X.OEF
    public final void write(byte[] bArr) {
        LJJI(0, bArr, bArr.length);
    }

    public MMapBuffer(String str, File file, long j) {
        this.LIZ = j;
        this.LJ = file;
        this.LJFF = str;
        file.getParentFile().mkdirs();
        this.LIZIZ = nCreate(file.getAbsolutePath(), j);
    }

    @Override // X.OEF
    public final int LJJI(int i, byte[] bArr, int i2) {
        int i3 = i2;
        if (!this.LIZLLL.get()) {
            if (bArr == null || bArr.length == 0 || i3 < 1 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i3 > bArr.length) {
                i3 = bArr.length - i;
            }
            synchronized (this) {
                long j = this.LIZJ;
                long j2 = this.LIZ;
                if (j == j2) {
                    return 0;
                }
                if (i3 + j > j2) {
                    i3 = (int) (j2 - j);
                }
                nWrite(this.LIZIZ, j, bArr, i, i3);
                this.LIZJ += i3;
                return i3;
            }
        }
        throw new IOException("released!");
    }

    @Override // X.OEF
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i2;
        if (!this.LIZLLL.get()) {
            if (bArr == null || i3 < 1 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i3 > bArr.length) {
                i3 = bArr.length - i;
            }
            synchronized (this) {
                long j = this.LIZJ;
                long j2 = this.LIZ;
                if (j == j2) {
                    return -1;
                }
                if (i3 + j > j2) {
                    i3 = (int) (j2 - j);
                }
                nRead(this.LIZIZ, j, bArr, i, i3);
                this.LIZJ += i3;
                return i3;
            }
        }
        throw new IOException("released!");
    }
}
