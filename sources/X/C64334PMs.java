package X;

import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.PMs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64334PMs implements PN8 {
    public final RandomAccessFile LIZ;

    @Override // X.PN8
    public final void close() {
        this.LIZ.close();
    }

    @Override // X.PN8
    public final long length() {
        return this.LIZ.length();
    }

    public C64334PMs(File file) {
        this.LIZ = new RandomAccessFile(file, "r");
    }

    @Override // X.PN8
    public final void seek(long j) {
        this.LIZ.seek(j);
    }

    @Override // X.PN8
    public final int LIZ(byte[] bArr, int i) {
        return this.LIZ.read(bArr, 0, i);
    }
}
