package net.jpountz.lz4;

import X.C16880lQ;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import net.jpountz.lz4.LZ4FrameOutputStream;
import net.jpountz.xxhash.XXHash32;
import net.jpountz.xxhash.XXHashFactory;

/* loaded from: classes15.dex */
public class LZ4FrameInputStream extends FilterInputStream {
    public ByteBuffer buffer;
    public final XXHash32 checksum;
    public byte[] compressedBuffer;
    public final LZ4SafeDecompressor decompressor;
    public long expectedContentSize;
    public LZ4FrameOutputStream.FrameInfo frameInfo;
    public final byte[] headerArray;
    public final ByteBuffer headerBuffer;
    public int maxBlockSize;
    public byte[] rawBuffer;
    public final ByteBuffer readNumberBuff;
    public long totalContentSize;

    private boolean nextFrameInfo() {
        while (true) {
            int i = 0;
            do {
                int read = ((FilterInputStream) this).in.read(this.readNumberBuff.array(), i, 4 - i);
                if (read < 0) {
                    return false;
                }
                i += read;
            } while (i < 4);
            int i2 = this.readNumberBuff.getInt(0);
            if (i2 == 407708164) {
                readHeader();
                return true;
            }
            if ((i2 >>> 4) == 25481893) {
                skippableFrame();
            } else {
                throw new IOException("Stream unsupported");
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        throw new UnsupportedOperationException("reset not supported");
    }

    private void readBlock() {
        boolean z;
        byte[] bArr;
        int readInt = readInt(((FilterInputStream) this).in);
        if ((Integer.MIN_VALUE & readInt) == 0) {
            z = true;
        } else {
            z = false;
        }
        int i = readInt & Integer.MAX_VALUE;
        if (i == 0) {
            if (!this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM) || readInt(((FilterInputStream) this).in) == this.frameInfo.currentStreamHash()) {
                if (!this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE) || this.expectedContentSize == this.totalContentSize) {
                    this.frameInfo.finish();
                    return;
                }
                throw new IOException("Size check mismatch");
            }
            throw new IOException("Content checksum mismatch");
        }
        if (z) {
            bArr = this.compressedBuffer;
        } else {
            bArr = this.rawBuffer;
        }
        if (i <= this.maxBlockSize) {
            int i2 = 0;
            while (i2 < i) {
                int read = ((FilterInputStream) this).in.read(bArr, i2, i - i2);
                if (read >= 0) {
                    i2 += read;
                } else {
                    throw new IOException("Stream ended prematurely");
                }
            }
            if (!this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.BLOCK_CHECKSUM) || readInt(((FilterInputStream) this).in) == this.checksum.hash(bArr, 0, i, 0)) {
                if (z) {
                    try {
                        LZ4SafeDecompressor lZ4SafeDecompressor = this.decompressor;
                        byte[] bArr2 = this.rawBuffer;
                        i = lZ4SafeDecompressor.decompress(bArr, 0, i, bArr2, 0, bArr2.length);
                    } catch (LZ4Exception e) {
                        throw new IOException(e);
                    }
                }
                if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM)) {
                    this.frameInfo.updateStreamHash(this.rawBuffer, 0, i);
                }
                this.totalContentSize += i;
                this.buffer.limit(i);
                this.buffer.rewind();
                return;
            }
            throw new IOException("Block checksum mismatch");
        }
        throw new IOException(C16880lQ.LLLZI(Locale.ROOT, "Block size %s exceeded max: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(this.maxBlockSize)}));
    }

    private void readHeader() {
        this.headerBuffer.rewind();
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            int read2 = ((FilterInputStream) this).in.read();
            if (read2 >= 0) {
                byte b = (byte) (read & 255);
                LZ4FrameOutputStream.FLG fromByte = LZ4FrameOutputStream.FLG.fromByte(b);
                this.headerBuffer.put(b);
                byte b2 = (byte) (read2 & 255);
                LZ4FrameOutputStream.BD fromByte2 = LZ4FrameOutputStream.BD.fromByte(b2);
                this.headerBuffer.put(b2);
                this.frameInfo = new LZ4FrameOutputStream.FrameInfo(fromByte, fromByte2);
                if (fromByte.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE)) {
                    long readLong = readLong(((FilterInputStream) this).in);
                    this.expectedContentSize = readLong;
                    this.headerBuffer.putLong(readLong);
                }
                this.totalContentSize = 0L;
                byte hash = (byte) ((this.checksum.hash(this.headerArray, 0, this.headerBuffer.position(), 0) >> 8) & 255);
                int read3 = ((FilterInputStream) this).in.read();
                if (read3 >= 0) {
                    if (hash == ((byte) (read3 & 255))) {
                        int blockMaximumSize = this.frameInfo.getBD().getBlockMaximumSize();
                        this.maxBlockSize = blockMaximumSize;
                        this.compressedBuffer = new byte[blockMaximumSize];
                        byte[] bArr = new byte[blockMaximumSize];
                        this.rawBuffer = bArr;
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        this.buffer = wrap;
                        wrap.limit(0);
                        return;
                    }
                    throw new IOException("Stream frame descriptor corrupted");
                }
                throw new IOException("Stream ended prematurely");
            }
            throw new IOException("Stream ended prematurely");
        }
        throw new IOException("Stream ended prematurely");
    }

    private void skippableFrame() {
        int readInt = readInt(((FilterInputStream) this).in);
        byte[] bArr = new byte[1024];
        while (readInt > 0) {
            int read = ((FilterInputStream) this).in.read(bArr, 0, Math.min(readInt, 1024));
            if (read >= 0) {
                readInt -= read;
            } else {
                throw new IOException("Stream ended prematurely");
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.buffer.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && !nextFrameInfo()) {
                return -1;
            }
            readBlock();
        }
        return this.buffer.get() & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    public LZ4FrameInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().safeDecompressor(), XXHashFactory.fastestInstance().hash32());
    }

    private int readInt(InputStream inputStream) {
        int i = 0;
        do {
            int read = inputStream.read(this.readNumberBuff.array(), i, 4 - i);
            if (read >= 0) {
                i += read;
            } else {
                throw new IOException("Stream ended prematurely");
            }
        } while (i < 4);
        return this.readNumberBuff.getInt(0);
    }

    private long readLong(InputStream inputStream) {
        int i = 0;
        do {
            int read = inputStream.read(this.readNumberBuff.array(), i, 8 - i);
            if (read >= 0) {
                i += read;
            } else {
                throw new IOException("Stream ended prematurely");
            }
        } while (i < 8);
        return this.readNumberBuff.getLong(0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        throw new UnsupportedOperationException("mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && !nextFrameInfo()) {
                return 0L;
            }
            readBlock();
        }
        long min = Math.min(j, this.buffer.remaining());
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.position(byteBuffer.position() + ((int) min));
        return min;
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, XXHash32 xXHash32) {
        super(inputStream);
        byte[] bArr = new byte[15];
        this.headerArray = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.headerBuffer = wrap.order(byteOrder);
        this.buffer = null;
        this.rawBuffer = null;
        this.maxBlockSize = -1;
        this.expectedContentSize = -1L;
        this.totalContentSize = 0L;
        this.frameInfo = null;
        this.readNumberBuff = ByteBuffer.allocate(8).order(byteOrder);
        this.decompressor = lZ4SafeDecompressor;
        this.checksum = xXHash32;
        nextFrameInfo();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            while (this.buffer.remaining() == 0) {
                if (this.frameInfo.isFinished() && !nextFrameInfo()) {
                    return -1;
                }
                readBlock();
            }
            int min = Math.min(i2, this.buffer.remaining());
            this.buffer.get(bArr, i, min);
            return min;
        }
        throw new IndexOutOfBoundsException();
    }
}
