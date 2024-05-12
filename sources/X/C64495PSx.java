package X;

import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.net.ProtocolException;
import java.nio.ByteBuffer;

/* renamed from: X.PSx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64495PSx extends QEG {
    public final int LJLJJI;
    public final C64496PSy LJLJJL = new C64496PSy(this);
    public ByteBuffer LJLJJLL;
    public boolean LJLJL;

    @Override // X.QEG
    public final void LIZIZ() {
    }

    @Override // X.QEG
    public final void LIZLLL() {
        this.LJLJL = true;
        if (this.LJLJJLL.position() >= this.LJLJJI) {
            this.LJLJJLL.flip();
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length");
    }

    @Override // X.QEG
    public final AbstractC66664QEi LIZJ() {
        return this.LJLJJL;
    }

    public C64495PSx(CronetHttpURLConnection cronetHttpURLConnection) {
        cronetHttpURLConnection.getClass();
        this.LJLJJI = -1;
        this.LJLJJLL = ByteBuffer.allocate(16384);
    }

    public final void LJ(int i) {
        if (this.LJLJJI == -1 || this.LJLJJLL.position() + i <= this.LJLJJI) {
            if (!this.LJLJL) {
                if (this.LJLJJI != -1 || this.LJLJJLL.limit() - this.LJLJJLL.position() > i) {
                    return;
                }
                ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.LJLJJLL.capacity() * 2, this.LJLJJLL.capacity() + i));
                this.LJLJJLL.flip();
                allocate.put(this.LJLJJLL);
                this.LJLJJLL = allocate;
                return;
            }
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("exceeded content-length limit of ");
        throw new ProtocolException(C08380Uo.LIZ(LIZ, this.LJLJJI, " bytes", LIZ));
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        LIZ();
        LJ(1);
        this.LJLJJLL.put((byte) i);
    }

    public C64495PSx(CronetHttpURLConnection cronetHttpURLConnection, long j) {
        if (cronetHttpURLConnection != null) {
            if (j <= 2147483647L) {
                if (j >= 0) {
                    int i = (int) j;
                    this.LJLJJI = i;
                    this.LJLJJLL = ByteBuffer.allocate(i);
                    return;
                }
                throw new IllegalArgumentException("Content length < 0.");
            }
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        throw new NullPointerException("Argument connection cannot be null.");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        LIZ();
        LJ(i2);
        this.LJLJJLL.put(bArr, i, i2);
    }
}
