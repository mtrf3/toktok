package net.jpountz.lz4;

import X.C16880lQ;
import X.X1D;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.XXHashFactory;

/* loaded from: classes15.dex */
public final class LZ4BlockInputStream extends FilterInputStream {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public byte[] buffer;
    public final Checksum checksum;
    public byte[] compressedBuffer;
    public final LZ4FastDecompressor decompressor;
    public boolean finished;
    public int o;
    public int originalLen;
    public final boolean stopOnEmptyBlock;

    private void refill() {
        try {
            readFully(this.compressedBuffer, LZ4BlockOutputStream.HEADER_LENGTH);
            int i = 0;
            while (true) {
                int i2 = LZ4BlockOutputStream.MAGIC_LENGTH;
                if (i < i2) {
                    if (this.compressedBuffer[i] == LZ4BlockOutputStream.MAGIC[i]) {
                        i++;
                    } else {
                        throw new IOException("Stream is corrupted");
                    }
                } else {
                    byte[] bArr = this.compressedBuffer;
                    int i3 = bArr[i2] & 255;
                    int i4 = i3 & 240;
                    int i5 = (i3 & 15) + 10;
                    if (i4 == 16 || i4 == 32) {
                        int readIntLE = SafeUtils.readIntLE(bArr, i2 + 1);
                        this.originalLen = SafeUtils.readIntLE(this.compressedBuffer, i2 + 5);
                        int readIntLE2 = SafeUtils.readIntLE(this.compressedBuffer, i2 + 9);
                        int i6 = this.originalLen;
                        if (i6 <= (1 << i5) && i6 >= 0 && readIntLE >= 0 && (i6 != 0 ? readIntLE != 0 : readIntLE == 0) && (i4 != 16 || i6 == readIntLE)) {
                            if (i6 == 0 && readIntLE == 0) {
                                if (readIntLE2 == 0) {
                                    if (!this.stopOnEmptyBlock) {
                                        refill();
                                        return;
                                    } else {
                                        this.finished = true;
                                        return;
                                    }
                                }
                                throw new IOException("Stream is corrupted");
                            }
                            byte[] bArr2 = this.buffer;
                            if (bArr2.length < i6) {
                                this.buffer = new byte[Math.max(i6, (bArr2.length * 3) / 2)];
                            }
                            if (i4 != 16) {
                                if (i4 == 32) {
                                    byte[] bArr3 = this.compressedBuffer;
                                    if (bArr3.length < readIntLE) {
                                        this.compressedBuffer = new byte[Math.max(readIntLE, (bArr3.length * 3) / 2)];
                                    }
                                    readFully(this.compressedBuffer, readIntLE);
                                    try {
                                        if (readIntLE != this.decompressor.decompress(this.compressedBuffer, 0, this.buffer, 0, this.originalLen)) {
                                            throw new IOException("Stream is corrupted");
                                        }
                                    } catch (LZ4Exception e) {
                                        throw new IOException("Stream is corrupted", e);
                                    }
                                } else {
                                    throw new AssertionError();
                                }
                            } else {
                                readFully(this.buffer, this.originalLen);
                            }
                            this.checksum.reset();
                            this.checksum.update(this.buffer, 0, this.originalLen);
                            if (((int) this.checksum.getValue()) == readIntLE2) {
                                this.o = 0;
                                return;
                            }
                            throw new IOException("Stream is corrupted");
                        }
                        throw new IOException("Stream is corrupted");
                    }
                    throw new IOException("Stream is corrupted");
                }
            }
        } catch (EOFException e2) {
            if (!this.stopOnEmptyBlock) {
                this.finished = true;
                return;
            }
            throw e2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.originalLen - this.o;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.finished) {
            return -1;
        }
        if (this.o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i = this.o;
        this.o = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new IOException("mark/reset not supported");
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(LZ4BlockInputStream.class));
        LIZ.append("(in=");
        LIZ.append(((FilterInputStream) this).in);
        LIZ.append(", decompressor=");
        LIZ.append(this.decompressor);
        LIZ.append(", checksum=");
        LIZ.append(this.checksum);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public LZ4BlockInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        if (j <= 0 || this.finished) {
            return 0L;
        }
        if (this.o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return 0L;
        }
        int min = (int) Math.min(j, this.originalLen - this.o);
        this.o += min;
        return min;
    }

    public LZ4BlockInputStream(InputStream inputStream, boolean z) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor(), XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), z);
    }

    private void readFully(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = ((FilterInputStream) this).in.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new EOFException("Stream ended prematurely");
            }
        }
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor) {
        this(inputStream, lZ4FastDecompressor, XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), true);
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum) {
        this(inputStream, lZ4FastDecompressor, checksum, true);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        SafeUtils.checkRange(bArr, i, i2);
        if (this.finished) {
            return -1;
        }
        if (this.o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        int min = Math.min(i2, this.originalLen - this.o);
        System.arraycopy(this.buffer, this.o, bArr, i, min);
        this.o += min;
        return min;
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum, boolean z) {
        super(inputStream);
        this.decompressor = lZ4FastDecompressor;
        this.checksum = checksum;
        this.stopOnEmptyBlock = z;
        this.buffer = new byte[0];
        this.compressedBuffer = new byte[LZ4BlockOutputStream.HEADER_LENGTH];
        this.originalLen = 0;
        this.o = 0;
    }
}
