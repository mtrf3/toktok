package X;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class R20 extends MediaDataSource {
    public long LJLIL;
    public final /* synthetic */ C68889R1x LJLILLLLZI;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    public R20(C68889R1x c68889R1x) {
        this.LJLILLLLZI = c68889R1x;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.LJLIL;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + this.LJLILLLLZI.available()) {
                    return -1;
                }
                this.LJLILLLLZI.LIZ(j);
                this.LJLIL = j;
            }
            if (i2 > this.LJLILLLLZI.available()) {
                i2 = this.LJLILLLLZI.available();
            }
            int read = this.LJLILLLLZI.read(bArr, i, i2);
            if (read >= 0) {
                this.LJLIL += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.LJLIL = -1L;
        return -1;
    }
}
