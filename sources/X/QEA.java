package X;

import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class QEA extends QEG {
    public final CronetHttpURLConnection LJLJJI;
    public final PU3 LJLJJL;
    public final ByteBuffer LJLJJLL;
    public final QED LJLJL = new QED(this);
    public boolean LJLJLJ;

    @Override // X.QEG
    public final void LIZIZ() {
    }

    @Override // X.QEG
    public final void LIZLLL() {
    }

    @Override // X.QEG, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLILLLLZI = true;
        if (!this.LJLJLJ) {
            this.LJLJLJ = true;
            this.LJLJJLL.flip();
        }
    }

    public final void LJ() {
        if (!this.LJLJJLL.hasRemaining()) {
            LIZ();
            this.LJLJJLL.flip();
            int readTimeout = this.LJLJJI.getReadTimeout();
            try {
                this.LJLJJL.LIZ(readTimeout);
            } catch (SocketTimeoutException unused) {
                CronetHttpURLConnection cronetHttpURLConnection = this.LJLJJI;
                if (cronetHttpURLConnection != null) {
                    QEI qei = cronetHttpURLConnection.LIZJ;
                    if (qei != null) {
                        qei.LIZJ();
                    }
                    PU3 pu3 = this.LJLJJL;
                    pu3.LJLJI = false;
                    pu3.LIZ(readTimeout / 2);
                }
            } catch (Exception e) {
                CronetHttpURLConnection cronetHttpURLConnection2 = this.LJLJJI;
                if (cronetHttpURLConnection2 != null) {
                    cronetHttpURLConnection2.setException(new IOException(C1DD.LJ("Unexpected request usage, caught in CronetChunkedOutputStream, caused by ", e)));
                    PU3 pu32 = this.LJLJJL;
                    pu32.LJLJI = false;
                    pu32.LIZ(readTimeout / 2);
                }
            }
            IOException iOException = this.LJLIL;
            if (iOException == null) {
            } else {
                throw iOException;
            }
        }
    }

    @Override // X.QEG
    public final AbstractC66664QEi LIZJ() {
        return this.LJLJL;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        LJ();
        this.LJLJJLL.put((byte) i);
    }

    public QEA(CronetHttpURLConnection cronetHttpURLConnection, int i, PU3 pu3) {
        cronetHttpURLConnection.getClass();
        if (i > 0) {
            this.LJLJJLL = ByteBuffer.allocate(i);
            this.LJLJJI = cronetHttpURLConnection;
            this.LJLJJL = pu3;
            return;
        }
        throw new IllegalArgumentException("chunkLength should be greater than 0");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        LIZ();
        if (bArr.length - i >= i2 && i >= 0 && i2 >= 0) {
            int i3 = i2;
            while (i3 > 0) {
                int min = Math.min(i3, this.LJLJJLL.remaining());
                this.LJLJJLL.put(bArr, (i + i2) - i3, min);
                i3 -= min;
                LJ();
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
