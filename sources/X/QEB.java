package X;

import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class QEB extends InputStream {
    public final CronetHttpURLConnection LJLIL;
    public boolean LJLILLLLZI;
    public ByteBuffer LJLJI;
    public IOException LJLJJI;

    public final void LIZ() {
        if (this.LJLILLLLZI) {
            IOException iOException = this.LJLJJI;
            if (iOException == null) {
                return;
            } else {
                throw iOException;
            }
        }
        if (!LIZIZ()) {
            if (this.LJLJI == null) {
                int i = this.LJLIL.LJIJJLI;
                if (i < 8192) {
                    i = 32768;
                }
                this.LJLJI = ByteBuffer.allocateDirect(i);
            }
            this.LJLJI.clear();
            CronetHttpURLConnection cronetHttpURLConnection = this.LJLIL;
            ByteBuffer byteBuffer = this.LJLJI;
            QEI qei = cronetHttpURLConnection.LIZJ;
            if (qei != null) {
                qei.LJI(byteBuffer);
                cronetHttpURLConnection.LJFF(cronetHttpURLConnection.getReadTimeout());
            }
            IOException iOException2 = this.LJLJJI;
            if (iOException2 == null) {
                ByteBuffer byteBuffer2 = this.LJLJI;
                if (byteBuffer2 != null) {
                    byteBuffer2.flip();
                    return;
                }
                return;
            }
            throw iOException2;
        }
    }

    public final boolean LIZIZ() {
        ByteBuffer byteBuffer = this.LJLJI;
        if (byteBuffer != null && byteBuffer.hasRemaining()) {
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.LJLILLLLZI) {
            IOException iOException = this.LJLJJI;
            if (iOException == null) {
                return 0;
            }
            throw iOException;
        }
        if (!LIZIZ()) {
            return 0;
        }
        return this.LJLJI.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CronetHttpURLConnection cronetHttpURLConnection = this.LJLIL;
        if (cronetHttpURLConnection != null) {
            cronetHttpURLConnection.disconnect();
        }
        super.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        LIZ();
        if (LIZIZ()) {
            return this.LJLJI.get() & 255;
        }
        return -1;
    }

    public QEB(CronetHttpURLConnection cronetHttpURLConnection) {
        this.LJLIL = cronetHttpURLConnection;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            if (i2 == 0) {
                return 0;
            }
            LIZ();
            if (LIZIZ()) {
                int min = Math.min(this.LJLJI.limit() - this.LJLJI.position(), i2);
                this.LJLJI.get(bArr, i, min);
                return min;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException();
    }
}
