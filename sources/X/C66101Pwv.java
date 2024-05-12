package X;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.InputStream;

/* renamed from: X.Pwv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66101Pwv {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public byte LJ;
    public boolean LJFF;
    public long LJI;
    public byte[] LJII;
    public byte[] LJIIIIZZ;

    public static byte LIZ(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final void LIZIZ(BufferedOutputStream bufferedOutputStream) {
        byte b;
        byte[] bArr;
        if (this.LIZ) {
            b = (byte) 128;
        } else {
            b = 0;
        }
        if (this.LIZIZ) {
            b = (byte) (b | 64);
        }
        if (this.LIZJ) {
            b = (byte) (b | 32);
        }
        if (this.LIZLLL) {
            b = (byte) (b | 16);
        }
        bufferedOutputStream.write((byte) (b | (this.LJ & 15)));
        long j = this.LJI;
        if (j <= 125) {
            bArr = new byte[]{(byte) j};
        } else if (j <= 65535) {
            bArr = new byte[]{126, (byte) ((j >> 8) & 255), (byte) (j & 255)};
        } else {
            bArr = new byte[]{Byte.MAX_VALUE, (byte) ((j >> 56) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 8) & 255), (byte) (j & 255)};
        }
        if (this.LJFF) {
            bArr[0] = (byte) (128 | bArr[0]);
        }
        bufferedOutputStream.write(bArr, 0, bArr.length);
        if (!this.LJFF) {
            bufferedOutputStream.write(this.LJIIIIZZ, 0, (int) this.LJI);
            return;
        }
        throw new UnsupportedOperationException("Writing masked data not implemented");
    }
}
