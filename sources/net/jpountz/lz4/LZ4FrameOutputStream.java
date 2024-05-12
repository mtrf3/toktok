package net.jpountz.lz4;

import X.C16880lQ;
import X.V0N;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import net.jpountz.xxhash.StreamingXXHash32;
import net.jpountz.xxhash.XXHash32;
import net.jpountz.xxhash.XXHashFactory;

/* loaded from: classes15.dex */
public class LZ4FrameOutputStream extends FilterOutputStream {
    public static final FLG.Bits[] DEFAULT_FEATURES = {FLG.Bits.BLOCK_INDEPENDENCE};
    public final ByteBuffer buffer;
    public final XXHash32 checksum;
    public final byte[] compressedBuffer;
    public final LZ4Compressor compressor;
    public FrameInfo frameInfo;
    public final ByteBuffer intLEBuffer;
    public final long knownSize;
    public final int maxBlockSize;

    /* loaded from: classes7.dex */
    public static class BD {
        public final BLOCKSIZE blockSizeValue;

        public int getBlockMaximumSize() {
            return 1 << ((this.blockSizeValue.getIndicator() * 2) + 8);
        }

        public byte toByte() {
            return (byte) ((this.blockSizeValue.getIndicator() & 7) << 4);
        }

        public BD(BLOCKSIZE blocksize) {
            this.blockSizeValue = blocksize;
        }

        public static BD fromByte(byte b) {
            int i = (b >>> 4) & 7;
            if ((b & 143) <= 0) {
                return new BD(BLOCKSIZE.valueOf(i));
            }
            throw new RuntimeException("Reserved fields must be 0");
        }
    }

    /* loaded from: classes15.dex */
    public static class FLG {
        public final BitSet bitSet;
        public final int version;

        private void validate() {
            if (!this.bitSet.get(Bits.RESERVED_0.position)) {
                if (!this.bitSet.get(Bits.RESERVED_1.position)) {
                    if (this.bitSet.get(Bits.BLOCK_INDEPENDENCE.position)) {
                        if (this.version == 1) {
                            return;
                        } else {
                            throw new RuntimeException(C16880lQ.LLLZI(Locale.ROOT, "Version %d is unsupported", new Object[]{Integer.valueOf(this.version)}));
                        }
                    }
                    throw new RuntimeException("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
                }
                throw new RuntimeException("Reserved1 field must be 0");
            }
            throw new RuntimeException("Reserved0 field must be 0");
        }

        public byte toByte() {
            return (byte) (this.bitSet.toByteArray()[0] | ((this.version & 3) << 6));
        }

        public int getVersion() {
            return this.version;
        }

        /* loaded from: classes15.dex */
        public enum Bits {
            RESERVED_0(0),
            RESERVED_1(1),
            CONTENT_CHECKSUM(2),
            CONTENT_SIZE(3),
            BLOCK_CHECKSUM(4),
            BLOCK_INDEPENDENCE(5);

            public final int position;

            public static Bits valueOf(String str) {
                return (Bits) V0N.LJJJ(Bits.class, str);
            }

            Bits(int i) {
                this.position = i;
            }
        }

        public static FLG fromByte(byte b) {
            byte b2 = (byte) (b & 192);
            return new FLG(b2 >>> 6, (byte) (b ^ b2));
        }

        public boolean isEnabled(Bits bits) {
            return this.bitSet.get(bits.position);
        }

        public FLG(int i, Bits... bitsArr) {
            this.bitSet = new BitSet(8);
            this.version = i;
            if (bitsArr != null) {
                for (Bits bits : bitsArr) {
                    this.bitSet.set(bits.position);
                }
            }
            validate();
        }

        public FLG(int i, byte b) {
            this.bitSet = BitSet.valueOf(new byte[]{b});
            this.version = i;
            validate();
        }
    }

    /* loaded from: classes15.dex */
    public static class FrameInfo {
        public final BD bd;
        public boolean finished;
        public final FLG flg;
        public final StreamingXXHash32 streamHash;

        public void finish() {
            this.finished = true;
        }

        public int currentStreamHash() {
            return this.streamHash.getValue();
        }

        public BD getBD() {
            return this.bd;
        }

        public FLG getFLG() {
            return this.flg;
        }

        public boolean isFinished() {
            return this.finished;
        }

        public boolean isEnabled(FLG.Bits bits) {
            return this.flg.isEnabled(bits);
        }

        public FrameInfo(FLG flg, BD bd) {
            StreamingXXHash32 streamingXXHash32;
            this.flg = flg;
            this.bd = bd;
            if (flg.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
                streamingXXHash32 = XXHashFactory.fastestInstance().newStreamingHash32(0);
            } else {
                streamingXXHash32 = null;
            }
            this.streamHash = streamingXXHash32;
        }

        public void updateStreamHash(byte[] bArr, int i, int i2) {
            this.streamHash.update(bArr, i, i2);
        }
    }

    private void ensureNotFinished() {
        if (!this.frameInfo.isFinished()) {
        } else {
            throw new IllegalStateException("The stream is already closed");
        }
    }

    private void writeBlock() {
        byte[] bArr;
        int i;
        if (this.buffer.position() == 0) {
            return;
        }
        Arrays.fill(this.compressedBuffer, (byte) 0);
        int compress = this.compressor.compress(this.buffer.array(), 0, this.buffer.position(), this.compressedBuffer, 0);
        if (compress >= this.buffer.position()) {
            compress = this.buffer.position();
            bArr = Arrays.copyOf(this.buffer.array(), compress);
            i = LiveLayoutPreloadThreadPriority.DEFAULT;
        } else {
            bArr = this.compressedBuffer;
            i = 0;
        }
        this.intLEBuffer.putInt(0, i | compress);
        ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        ((FilterOutputStream) this).out.write(bArr, 0, compress);
        if (this.frameInfo.isEnabled(FLG.Bits.BLOCK_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.checksum.hash(bArr, 0, compress, 0));
            ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        }
        this.buffer.rewind();
    }

    private void writeEndMark() {
        this.intLEBuffer.putInt(0, 0);
        ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.frameInfo.currentStreamHash());
            ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        }
        this.frameInfo.finish();
    }

    private void writeHeader() {
        ByteBuffer order = ByteBuffer.allocate(15).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(407708164);
        order.put(this.frameInfo.getFLG().toByte());
        order.put(this.frameInfo.getBD().toByte());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_SIZE)) {
            order.putLong(this.knownSize);
        }
        order.put((byte) ((this.checksum.hash(order.array(), 4, order.position() - 4, 0) >> 8) & 255));
        ((FilterOutputStream) this).out.write(order.array(), 0, order.position());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.frameInfo.isFinished()) {
            flush();
            writeEndMark();
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (!this.frameInfo.isFinished()) {
            writeBlock();
        }
        super.flush();
    }

    /* loaded from: classes7.dex */
    public enum BLOCKSIZE {
        SIZE_64KB(4),
        SIZE_256KB(5),
        SIZE_1MB(6),
        SIZE_4MB(7);

        public final int indicator;

        public int getIndicator() {
            return this.indicator;
        }

        public static BLOCKSIZE valueOf(int i) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i == 7) {
                            return SIZE_4MB;
                        }
                        throw new IllegalArgumentException(C16880lQ.LLLZI(Locale.ROOT, "Block size must be 4-7. Cannot use value of [%d]", new Object[]{Integer.valueOf(i)}));
                    }
                    return SIZE_1MB;
                }
                return SIZE_256KB;
            }
            return SIZE_64KB;
        }

        public static BLOCKSIZE valueOf(String str) {
            return (BLOCKSIZE) V0N.LJJJ(BLOCKSIZE.class, str);
        }

        BLOCKSIZE(int i) {
            this.indicator = i;
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream) {
        this(outputStream, BLOCKSIZE.SIZE_4MB);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        ensureNotFinished();
        if (this.buffer.position() == this.maxBlockSize) {
            writeBlock();
        }
        byte b = (byte) i;
        this.buffer.put(b);
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(new byte[]{b}, 0, 1);
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize) {
        this(outputStream, blocksize, DEFAULT_FEATURES);
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, FLG.Bits... bitsArr) {
        this(outputStream, blocksize, -1L, bitsArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            ensureNotFinished();
            while (i2 > this.buffer.remaining()) {
                int remaining = this.buffer.remaining();
                this.buffer.put(bArr, i, remaining);
                if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
                    this.frameInfo.updateStreamHash(bArr, i, remaining);
                }
                writeBlock();
                i += remaining;
                i2 -= remaining;
            }
            this.buffer.put(bArr, i, i2);
            if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
                this.frameInfo.updateStreamHash(bArr, i, i2);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, long j, FLG.Bits... bitsArr) {
        super(outputStream);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.intLEBuffer = allocate.order(byteOrder);
        this.frameInfo = null;
        LZ4Compressor fastCompressor = LZ4Factory.fastestInstance().fastCompressor();
        this.compressor = fastCompressor;
        this.checksum = XXHashFactory.fastestInstance().hash32();
        FrameInfo frameInfo = new FrameInfo(new FLG(1, bitsArr), new BD(blocksize));
        this.frameInfo = frameInfo;
        int blockMaximumSize = frameInfo.getBD().getBlockMaximumSize();
        this.maxBlockSize = blockMaximumSize;
        this.buffer = ByteBuffer.allocate(blockMaximumSize).order(byteOrder);
        this.compressedBuffer = new byte[fastCompressor.maxCompressedLength(blockMaximumSize)];
        if (!this.frameInfo.getFLG().isEnabled(FLG.Bits.CONTENT_SIZE) || j >= 0) {
            this.knownSize = j;
            writeHeader();
            return;
        }
        throw new IllegalArgumentException("Known size must be greater than zero in order to use the known size feature");
    }
}
