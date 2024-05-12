package X;

import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class QE9 extends QEG {
    public final CronetHttpURLConnection LJLJJI;
    public final PU3 LJLJJL;
    public final long LJLJJLL;
    public final ByteBuffer LJLJL;
    public final QEC LJLJLJ = new QEC(this);
    public long LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;

    @Override // X.QEG
    public final void LIZLLL() {
    }

    @Override // X.QEG
    public final void LIZIZ() {
        if (this.LJLJLLL >= this.LJLJJLL) {
        } else {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    public final void LJFF() {
        LIZ();
        this.LJLJL.flip();
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
                cronetHttpURLConnection2.setException(new IOException(C1DD.LJ("Unexpected request usage, caught in CronetFixedModeOutputStream, caused by ", e)));
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

    @Override // X.QEG
    public final AbstractC66664QEi LIZJ() {
        return this.LJLJLJ;
    }

    public final void LJ(int i) {
        if (this.LJLJLLL + i <= this.LJLJJLL) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expected ");
        LIZ.append(this.LJLJJLL - this.LJLJLLL);
        LIZ.append(" bytes but received ");
        LIZ.append(i);
        throw new ProtocolException(X1D.LIZIZ(LIZ));
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        LIZ();
        LJ(1);
        if (!this.LJLJL.hasRemaining()) {
            this.LJLL = false;
            LJFF();
        }
        this.LJLJL.put((byte) i);
        long j = this.LJLJLLL + 1;
        this.LJLJLLL = j;
        if (j == this.LJLJJLL) {
            LJFF();
        }
    }

    public QE9(CronetHttpURLConnection cronetHttpURLConnection, long j, PU3 pu3) {
        cronetHttpURLConnection.getClass();
        if (j >= 0) {
            this.LJLJJLL = j;
            this.LJLJL = ByteBuffer.allocate((int) Math.min(j, 16384));
            this.LJLJJI = cronetHttpURLConnection;
            this.LJLJJL = pu3;
            this.LJLJLLL = 0L;
            this.LJLL = true;
            this.LJLLI = false;
            return;
        }
        throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        LIZ();
        if (bArr.length - i >= i2 && i >= 0 && i2 >= 0) {
            LJ(i2);
            int i3 = i2;
            while (i3 > 0) {
                if (!this.LJLJL.hasRemaining()) {
                    this.LJLL = false;
                    LJFF();
                }
                int min = Math.min(i3, this.LJLJL.remaining());
                this.LJLJL.put(bArr, (i + i2) - i3, min);
                i3 -= min;
            }
            long j = this.LJLJLLL + i2;
            this.LJLJLLL = j;
            if (j == this.LJLJJLL) {
                LJFF();
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
