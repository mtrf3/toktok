package X;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.FhY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39668FhY implements InterfaceC40057Fnp {
    public InputStream LJLIL;
    public final ZipEntry LJLILLLLZI;
    public final ZipFile LJLJI;
    public final long LJLJJI;
    public boolean LJLJJL = true;
    public long LJLJJLL;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.LJLIL;
        if (inputStream != null) {
            inputStream.close();
            this.LJLJJL = false;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.LJLJJL;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return LJJJJLL(byteBuffer, this.LJLJJLL);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }

    public C39668FhY(ZipFile zipFile, ZipEntry zipEntry) {
        this.LJLJI = zipFile;
        this.LJLILLLLZI = zipEntry;
        this.LJLJJI = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.LJLIL = inputStream;
        if (inputStream != null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(zipEntry.getName());
        LIZ.append("'s InputStream is null");
        throw new IOException(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC40057Fnp
    public final int LJJJJLL(ByteBuffer byteBuffer, long j) {
        if (this.LJLIL != null) {
            int remaining = byteBuffer.remaining();
            long j2 = this.LJLJJI;
            long j3 = j2 - j;
            if (j3 <= 0) {
                return -1;
            }
            int i = (int) j3;
            if (remaining > i) {
                remaining = i;
            }
            InputStream inputStream = this.LJLIL;
            if (inputStream != null) {
                long j4 = this.LJLJJLL;
                if (j != j4) {
                    if (j > j2) {
                        j = j2;
                    }
                    if (j >= j4) {
                        inputStream.skip(j - j4);
                    } else {
                        inputStream.close();
                        InputStream inputStream2 = this.LJLJI.getInputStream(this.LJLILLLLZI);
                        this.LJLIL = inputStream2;
                        if (inputStream2 != null) {
                            inputStream2.skip(j);
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(this.LJLILLLLZI.getName());
                            LIZ.append("'s InputStream is null");
                            throw new IOException(X1D.LIZIZ(LIZ));
                        }
                    }
                    this.LJLJJLL = j;
                }
                if (byteBuffer.hasArray()) {
                    this.LJLIL.read(byteBuffer.array(), 0, remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                } else {
                    byte[] bArr = new byte[remaining];
                    this.LJLIL.read(bArr, 0, remaining);
                    byteBuffer.put(bArr, 0, remaining);
                }
                this.LJLJJLL += remaining;
                return remaining;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJLILLLLZI.getName());
            LIZ2.append("'s InputStream is null");
            throw new IOException(X1D.LIZIZ(LIZ2));
        }
        throw new IOException("InputStream is null");
    }
}
