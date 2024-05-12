package com.bytedance.compression.zstd;

import X.C06460Ne;
import X.C0NY;
import X.OHZ;
import X.X1D;
import X.YM8;
import X.YMA;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes16.dex */
public class ZstdInputStreamNoFinalizer extends FilterInputStream {
    public static final int srcBuffSize;
    public final YMA bufferPool;
    public long dstPos;
    public boolean frameFinished;
    public boolean isClosed;
    public boolean isContinuous;
    public boolean needRead;
    public final byte[] src;
    public final ByteBuffer srcByteBuffer;
    public long srcPos;
    public long srcSize;
    public final long stream;

    public static native long createDStream();

    private native int decompressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    public static native int freeDStream(long j);

    private native int initDStream(long j);

    public static native long recommendedDInSize();

    public static native long recommendedDOutSize();

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        if (!this.isClosed) {
            if (!this.needRead) {
                return 1;
            }
            return ((FilterInputStream) this).in.available();
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.bufferPool.getClass();
        freeDStream(this.stream);
        ((FilterInputStream) this).in.close();
    }

    public synchronized boolean getContinuous() {
        return this.isContinuous;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int readInternal;
        byte[] bArr = new byte[1];
        do {
            readInternal = readInternal(bArr, 0, 1);
        } while (readInternal == 0);
        if (readInternal == 1) {
            return bArr[0] & 255;
        }
        return -1;
    }

    static {
        OHZ.LJII();
        srcBuffSize = (int) recommendedDInSize();
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream) {
        this(inputStream, YM8.LIZ);
    }

    public synchronized ZstdInputStreamNoFinalizer setContinuous(boolean z) {
        this.isContinuous = z;
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) {
        zstdDictDecompress.acquireSharedLock();
        try {
            long loadFastDictDecompress = ZstdDecompress.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (Zstd.isError(loadFastDictDecompress)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Decompression error: ");
                LIZ.append(Zstd.getErrorName(loadFastDictDecompress));
                throw new IOException(X1D.LIZIZ(LIZ));
            }
        } finally {
            zstdDictDecompress.releaseSharedLock();
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        if (!this.isClosed) {
            if (j <= 0) {
                return 0L;
            }
            int recommendedDOutSize = (int) recommendedDOutSize();
            if (recommendedDOutSize > j) {
                recommendedDOutSize = (int) j;
            }
            ((YM8) this.bufferPool).getClass();
            try {
                byte[] extractArray = Zstd.extractArray(ByteBuffer.allocate(recommendedDOutSize));
                long j2 = j;
                while (j2 > 0) {
                    int read = read(extractArray, 0, (int) Math.min(recommendedDOutSize, j2));
                    if (read < 0) {
                        break;
                    }
                    j2 -= read;
                }
                return j - j2;
            } finally {
                this.bufferPool.getClass();
            }
        }
        throw new IOException("Stream closed");
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(byte[] bArr) {
        long loadDictDecompress = ZstdDecompress.loadDictDecompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(loadDictDecompress)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Decompression error: ");
            LIZ.append(Zstd.getErrorName(loadDictDecompress));
            throw new IOException(X1D.LIZIZ(LIZ));
        }
        return this;
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream, YMA yma) {
        super(inputStream);
        this.needRead = true;
        this.frameFinished = true;
        this.bufferPool = yma;
        int i = srcBuffSize;
        yma.getClass();
        ByteBuffer allocate = ByteBuffer.allocate(i);
        this.srcByteBuffer = allocate;
        if (allocate != null) {
            this.src = Zstd.extractArray(allocate);
            synchronized (this) {
                long createDStream = createDStream();
                this.stream = createDStream;
                initDStream(createDStream);
            }
            return;
        }
        throw new IOException(C0NY.LIZIZ("Cannot get ByteBuffer of size ", i, " from the BufferPool"));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int readInternal;
        if (i >= 0) {
            if (i2 <= bArr.length - i) {
                if (i2 == 0) {
                    return 0;
                }
                do {
                    readInternal = readInternal(bArr, i, i2);
                } while (readInternal == 0);
                return readInternal;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Requested length ");
        LIZ.append(i2);
        LIZ.append(" from offset ");
        LIZ.append(i);
        LIZ.append(" in buffer of size ");
        LIZ.append(bArr.length);
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LIZ));
    }

    public int readInternal(byte[] bArr, int i, int i2) {
        long j;
        if (!this.isClosed) {
            if (i >= 0 && i2 <= bArr.length - i) {
                int i3 = i + i2;
                long j2 = i;
                this.dstPos = j2;
                long j3 = -1;
                while (true) {
                    j = this.dstPos;
                    long j4 = i3;
                    if (j >= j4 || j3 >= j) {
                        break;
                    }
                    boolean z = false;
                    if (this.needRead && (((FilterInputStream) this).in.available() > 0 || this.dstPos == j2)) {
                        long read = ((FilterInputStream) this).in.read(this.src, 0, srcBuffSize);
                        this.srcSize = read;
                        this.srcPos = 0L;
                        if (read < 0) {
                            this.srcSize = 0L;
                            if (this.frameFinished) {
                                return -1;
                            }
                            if (this.isContinuous) {
                                long j5 = (int) (this.dstPos - j2);
                                this.srcSize = j5;
                                if (j5 <= 0) {
                                    return -1;
                                }
                                return (int) j5;
                            }
                            throw new IOException("Read error or truncated source");
                        }
                        this.frameFinished = false;
                    }
                    j3 = this.dstPos;
                    int decompressStream = decompressStream(this.stream, bArr, i3, this.src, (int) this.srcSize);
                    long j6 = decompressStream;
                    if (!Zstd.isError(j6)) {
                        if (decompressStream == 0) {
                            this.frameFinished = true;
                            if (this.srcPos == this.srcSize) {
                                z = true;
                            }
                            this.needRead = z;
                            return (int) (this.dstPos - j2);
                        }
                        if (this.dstPos < j4) {
                            z = true;
                        }
                        this.needRead = z;
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Decompression error: ");
                        LIZ.append(Zstd.getErrorName(j6));
                        throw new IOException(X1D.LIZIZ(LIZ));
                    }
                }
                return (int) (j - j2);
            }
            StringBuilder LIZJ = C06460Ne.LIZJ("Requested length ", i2, " from offset ", i, " in buffer of size ");
            LIZJ.append(bArr.length);
            throw new IndexOutOfBoundsException(X1D.LIZIZ(LIZJ));
        }
        throw new IOException("Stream closed");
    }
}
