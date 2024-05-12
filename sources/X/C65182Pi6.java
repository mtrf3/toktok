package X;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.Pi6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65182Pi6 implements Closeable {
    public static final Logger LJLJL = Logger.getLogger(C65182Pi6.class.getName());
    public final RandomAccessFile LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public C65184Pi8 LJLJJI;
    public C65184Pi8 LJLJJL;
    public final byte[] LJLJJLL;

    public final synchronized boolean LIZJ() {
        boolean z;
        if (this.LJLJI != 0) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.LJLIL.close();
    }

    public final int LJI() {
        if (this.LJLJI == 0) {
            return 16;
        }
        C65184Pi8 c65184Pi8 = this.LJLJJL;
        int i = c65184Pi8.LIZ;
        int i2 = this.LJLJJI.LIZ;
        if (i >= i2) {
            return (i - i2) + 4 + c65184Pi8.LIZIZ + 16;
        }
        return (((i + 4) + c65184Pi8.LIZIZ) + this.LJLILLLLZI) - i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C16880lQ.LJLLJ(C65182Pi6.class));
        sb.append("[fileLength=");
        sb.append(this.LJLILLLLZI);
        sb.append(", size=");
        sb.append(this.LJLJI);
        sb.append(", first=");
        sb.append(this.LJLJJI);
        sb.append(", last=");
        sb.append(this.LJLJJL);
        sb.append(", element lengths=[");
        try {
            LIZIZ(new C65181Pi5(sb));
        } catch (IOException e) {
            LJLJL.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public C65182Pi6(File file) {
        byte[] bArr = new byte[16];
        this.LJLJJLL = bArr;
        if (!file.exists()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(file.getPath());
            LIZ.append(".tmp");
            File file2 = new File(X1D.LIZIZ(LIZ));
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                int i2 = 0;
                do {
                    int i3 = iArr[i];
                    bArr2[i2] = (byte) (i3 >> 24);
                    bArr2[i2 + 1] = (byte) (i3 >> 16);
                    bArr2[i2 + 2] = (byte) (i3 >> 8);
                    bArr2[i2 + 3] = (byte) i3;
                    i2 += 4;
                    i++;
                } while (i < 4);
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.LJLIL = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int LJ = LJ(bArr, 0);
        this.LJLILLLLZI = LJ;
        if (LJ <= randomAccessFile2.length()) {
            this.LJLJI = LJ(bArr, 4);
            int LJ2 = LJ(bArr, 8);
            int LJ3 = LJ(bArr, 12);
            this.LJLJJI = LIZLLL(LJ2);
            this.LJLJJL = LIZLLL(LJ3);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("File is truncated. Expected length: ");
        LIZ2.append(this.LJLILLLLZI);
        LIZ2.append(", Actual length: ");
        LIZ2.append(randomAccessFile2.length());
        throw new IOException(X1D.LIZIZ(LIZ2));
    }

    public final void LIZ(int i) {
        int i2 = i + 4;
        int LJI = this.LJLILLLLZI - LJI();
        if (LJI >= i2) {
            return;
        }
        int i3 = this.LJLILLLLZI;
        do {
            LJI += i3;
            i3 <<= 1;
        } while (LJI < i2);
        this.LJLIL.setLength(i3);
        this.LJLIL.getChannel().force(true);
        C65184Pi8 c65184Pi8 = this.LJLJJL;
        int LJIIJ = LJIIJ(c65184Pi8.LIZ + 4 + c65184Pi8.LIZIZ);
        if (LJIIJ < this.LJLJJI.LIZ) {
            FileChannel channel = this.LJLIL.getChannel();
            channel.position(this.LJLILLLLZI);
            long j = LJIIJ - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.LJLJJL.LIZ;
        int i5 = this.LJLJJI.LIZ;
        if (i4 < i5) {
            int i6 = (this.LJLILLLLZI + i4) - 16;
            LJIIJJI(i3, this.LJLJI, i5, i6);
            this.LJLJJL = new C65184Pi8(i6, this.LJLJJL.LIZIZ);
        } else {
            LJIIJJI(i3, this.LJLJI, i5, i4);
        }
        this.LJLILLLLZI = i3;
    }

    public final synchronized void LIZIZ(InterfaceC65076PgO interfaceC65076PgO) {
        int i = this.LJLJJI.LIZ;
        for (int i2 = 0; i2 < this.LJLJI; i2++) {
            C65184Pi8 LIZLLL = LIZLLL(i);
            interfaceC65076PgO.LIZ(new C65183Pi7(this, LIZLLL), LIZLLL.LIZIZ);
            i = LJIIJ(LIZLLL.LIZ + 4 + LIZLLL.LIZIZ);
        }
    }

    public final C65184Pi8 LIZLLL(int i) {
        if (i == 0) {
            return C65184Pi8.LIZJ;
        }
        this.LJLIL.seek(i);
        return new C65184Pi8(i, this.LJLIL.readInt());
    }

    public final int LJIIJ(int i) {
        int i2 = this.LJLILLLLZI;
        if (i < i2) {
            return i;
        }
        return (i + 16) - i2;
    }

    public static int LJ(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final void LJFF(int i, byte[] bArr, int i2) {
        int LJIIJ = LJIIJ(i);
        int i3 = LJIIJ + i2;
        int i4 = this.LJLILLLLZI;
        if (i3 <= i4) {
            this.LJLIL.seek(LJIIJ);
            this.LJLIL.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - LJIIJ;
        this.LJLIL.seek(LJIIJ);
        this.LJLIL.write(bArr, 0, i5);
        this.LJLIL.seek(16L);
        this.LJLIL.write(bArr, 0 + i5, i2 - i5);
    }

    public final void LJIIJJI(int i, int i2, int i3, int i4) {
        byte[] bArr = this.LJLJJLL;
        int i5 = 0;
        int[] iArr = {i, i2, i3, i4};
        int i6 = 0;
        do {
            int i7 = iArr[i5];
            bArr[i6] = (byte) (i7 >> 24);
            bArr[i6 + 1] = (byte) (i7 >> 16);
            bArr[i6 + 2] = (byte) (i7 >> 8);
            bArr[i6 + 3] = (byte) i7;
            i6 += 4;
            i5++;
        } while (i5 < 4);
        this.LJLIL.seek(0L);
        this.LJLIL.write(this.LJLJJLL);
    }
}
