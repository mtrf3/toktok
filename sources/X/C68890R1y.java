package X;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: X.R1y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C68890R1y extends FilterOutputStream {
    public final OutputStream LJLIL;
    public ByteOrder LJLILLLLZI;

    public final void LIZ(int i) {
        this.LJLIL.write(i);
    }

    public final void LIZIZ(int i) {
        ByteOrder byteOrder = this.LJLILLLLZI;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.LJLIL.write((i >>> 0) & 255);
            this.LJLIL.write((i >>> 8) & 255);
            this.LJLIL.write((i >>> 16) & 255);
            this.LJLIL.write((i >>> 24) & 255);
            return;
        }
        if (byteOrder != ByteOrder.BIG_ENDIAN) {
            return;
        }
        this.LJLIL.write((i >>> 24) & 255);
        this.LJLIL.write((i >>> 16) & 255);
        this.LJLIL.write((i >>> 8) & 255);
        this.LJLIL.write((i >>> 0) & 255);
    }

    public final void LIZJ(short s) {
        ByteOrder byteOrder = this.LJLILLLLZI;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.LJLIL.write((s >>> 0) & 255);
            this.LJLIL.write((s >>> 8) & 255);
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            }
            this.LJLIL.write((s >>> 8) & 255);
            this.LJLIL.write((s >>> 0) & 255);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.LJLIL.write(bArr);
    }

    public C68890R1y(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.LJLIL = outputStream;
        this.LJLILLLLZI = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.LJLIL.write(bArr, i, i2);
    }
}
