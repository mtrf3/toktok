package net.jpountz.lz4;

import X.C16880lQ;
import X.KMP;
import X.X1D;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.XXHashFactory;

/* loaded from: classes15.dex */
public final class LZ4BlockOutputStream extends FilterOutputStream {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int HEADER_LENGTH;
    public static final byte[] MAGIC;
    public static final int MAGIC_LENGTH;
    public final int blockSize;
    public final byte[] buffer;
    public final Checksum checksum;
    public final byte[] compressedBuffer;
    public final int compressionLevel;
    public final LZ4Compressor compressor;
    public boolean finished;
    public int o;
    public final boolean syncFlush;

    static {
        byte[] bArr = {76, 90, 52, 66, 108, 111, 99, 107};
        MAGIC = bArr;
        int length = bArr.length;
        MAGIC_LENGTH = length;
        HEADER_LENGTH = length + 1 + 4 + 4 + 4;
    }

    private void ensureNotFinished() {
        if (!this.finished) {
        } else {
            throw new IllegalStateException("This stream is already closed");
        }
    }

    private void flushBufferedData() {
        int i;
        if (this.o == 0) {
            return;
        }
        this.checksum.reset();
        this.checksum.update(this.buffer, 0, this.o);
        int value = (int) this.checksum.getValue();
        LZ4Compressor lZ4Compressor = this.compressor;
        byte[] bArr = this.buffer;
        int i2 = this.o;
        byte[] bArr2 = this.compressedBuffer;
        int i3 = HEADER_LENGTH;
        int compress = lZ4Compressor.compress(bArr, 0, i2, bArr2, i3);
        int i4 = this.o;
        if (compress >= i4) {
            System.arraycopy(this.buffer, 0, this.compressedBuffer, i3, i4);
            i = 16;
        } else {
            i4 = compress;
            i = 32;
        }
        byte[] bArr3 = this.compressedBuffer;
        int i5 = MAGIC_LENGTH;
        bArr3[i5] = (byte) (i | this.compressionLevel);
        writeIntLE(i4, bArr3, i5 + 1);
        writeIntLE(this.o, this.compressedBuffer, i5 + 5);
        writeIntLE(value, this.compressedBuffer, i5 + 9);
        ((FilterOutputStream) this).out.write(this.compressedBuffer, 0, i3 + i4);
        this.o = 0;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.finished) {
            finish();
        }
        OutputStream outputStream = ((FilterOutputStream) this).out;
        if (outputStream != null) {
            outputStream.close();
            ((FilterOutputStream) this).out = null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (((FilterOutputStream) this).out != null) {
            if (this.syncFlush) {
                flushBufferedData();
            }
            ((FilterOutputStream) this).out.flush();
        }
    }

    public void finish() {
        ensureNotFinished();
        flushBufferedData();
        byte[] bArr = this.compressedBuffer;
        int i = MAGIC_LENGTH;
        bArr[i] = (byte) (this.compressionLevel | 16);
        writeIntLE(0, bArr, i + 1);
        writeIntLE(0, this.compressedBuffer, i + 5);
        writeIntLE(0, this.compressedBuffer, i + 9);
        ((FilterOutputStream) this).out.write(this.compressedBuffer, 0, HEADER_LENGTH);
        this.finished = true;
        ((FilterOutputStream) this).out.flush();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(LZ4BlockOutputStream.class));
        LIZ.append("(out=");
        LIZ.append(((FilterOutputStream) this).out);
        LIZ.append(", blockSize=");
        LIZ.append(this.blockSize);
        LIZ.append(", compressor=");
        LIZ.append(this.compressor);
        LIZ.append(", checksum=");
        LIZ.append(this.checksum);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public LZ4BlockOutputStream(OutputStream outputStream) {
        this(outputStream, 65536);
    }

    public static int compressionLevel(int i) {
        if (i >= 64) {
            if (i <= 33554432) {
                return Math.max(0, (32 - Integer.numberOfLeadingZeros(i - 1)) - 10);
            }
            throw new IllegalArgumentException(KMP.LJ("blockSize must be <= 33554432, got ", i));
        }
        throw new IllegalArgumentException(KMP.LJ("blockSize must be >= 64, got ", i));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        ensureNotFinished();
        if (this.o == this.blockSize) {
            flushBufferedData();
        }
        byte[] bArr = this.buffer;
        int i2 = this.o;
        this.o = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        ensureNotFinished();
        write(bArr, 0, bArr.length);
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i) {
        this(outputStream, i, LZ4Factory.fastestInstance().fastCompressor());
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i, LZ4Compressor lZ4Compressor) {
        this(outputStream, i, lZ4Compressor, XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), false);
    }

    public static void writeIntLE(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        SafeUtils.checkRange(bArr, i, i2);
        ensureNotFinished();
        while (true) {
            int i3 = this.o;
            int i4 = i3 + i2;
            int i5 = this.blockSize;
            if (i4 > i5) {
                int i6 = i5 - i3;
                System.arraycopy(bArr, i, this.buffer, i3, i5 - i3);
                this.o = this.blockSize;
                flushBufferedData();
                i += i6;
                i2 -= i6;
            } else {
                System.arraycopy(bArr, i, this.buffer, i3, i2);
                this.o += i2;
                return;
            }
        }
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i, LZ4Compressor lZ4Compressor, Checksum checksum, boolean z) {
        super(outputStream);
        this.blockSize = i;
        this.compressor = lZ4Compressor;
        this.checksum = checksum;
        this.compressionLevel = compressionLevel(i);
        this.buffer = new byte[i];
        byte[] bArr = new byte[lZ4Compressor.maxCompressedLength(i) + HEADER_LENGTH];
        this.compressedBuffer = bArr;
        this.syncFlush = z;
        this.o = 0;
        this.finished = false;
        System.arraycopy(MAGIC, 0, bArr, 0, MAGIC_LENGTH);
    }
}
