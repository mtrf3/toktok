package com.bytedance.compression.zstd;

import X.C0NY;
import X.OHZ;
import X.X1D;
import X.YM8;
import X.YMA;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes16.dex */
public class ZstdOutputStreamNoFinalizer extends FilterOutputStream {
    public static final int dstSize;
    public final YMA bufferPool;
    public boolean closeFrameOnFlush;
    public final byte[] dst;
    public final ByteBuffer dstByteBuffer;
    public long dstPos;
    public boolean frameClosed;
    public boolean isClosed;
    public long srcPos;
    public final long stream;

    private native int compressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    public static native long createCStream();

    private native int endStream(long j, byte[] bArr, int i);

    private native int flushStream(long j, byte[] bArr, int i);

    public static native int freeCStream(long j);

    public static native long recommendedCOutSize();

    private native int resetCStream(long j);

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        close(true);
    }

    public synchronized void closeWithoutClosingParentStream() {
        close(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (com.bytedance.compression.zstd.Zstd.isError(r3) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        ((java.io.FilterOutputStream) r7).out.write(r7.dst, 0, (int) r7.dstPos);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r5 > 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        r7.frameClosed = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        ((java.io.FilterOutputStream) r7).out.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("Compression error: ");
        r1.append(com.bytedance.compression.zstd.Zstd.getErrorName(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        throw new java.io.IOException(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r5 = flushStream(r7.stream, r7.dst, com.bytedance.compression.zstd.ZstdOutputStreamNoFinalizer.dstSize);
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (com.bytedance.compression.zstd.Zstd.isError(r3) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        ((java.io.FilterOutputStream) r7).out.write(r7.dst, 0, (int) r7.dstPos);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r5 > 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("Compression error: ");
        r1.append(com.bytedance.compression.zstd.Zstd.getErrorName(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        throw new java.io.IOException(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:
    
        if (r7.closeFrameOnFlush != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
    
        r5 = endStream(r7.stream, r7.dst, com.bytedance.compression.zstd.ZstdOutputStreamNoFinalizer.dstSize);
        r3 = r5;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void flush() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.isClosed     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L89
            boolean r0 = r7.frameClosed     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L87
            boolean r0 = r7.closeFrameOnFlush     // Catch: java.lang.Throwable -> L91
            r6 = 0
            if (r0 == 0) goto L46
        Le:
            long r2 = r7.stream     // Catch: java.lang.Throwable -> L91
            byte[] r1 = r7.dst     // Catch: java.lang.Throwable -> L91
            int r0 = com.bytedance.compression.zstd.ZstdOutputStreamNoFinalizer.dstSize     // Catch: java.lang.Throwable -> L91
            int r5 = r7.endStream(r2, r1, r0)     // Catch: java.lang.Throwable -> L91
            long r3 = (long) r5     // Catch: java.lang.Throwable -> L91
            boolean r0 = com.bytedance.compression.zstd.Zstd.isError(r3)     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L2c
            java.io.OutputStream r4 = r7.out     // Catch: java.lang.Throwable -> L91
            byte[] r3 = r7.dst     // Catch: java.lang.Throwable -> L91
            long r1 = r7.dstPos     // Catch: java.lang.Throwable -> L91
            int r0 = (int) r1     // Catch: java.lang.Throwable -> L91
            r4.write(r3, r6, r0)     // Catch: java.lang.Throwable -> L91
            if (r5 > 0) goto Le
            goto L64
        L2c:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "Compression error: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = com.bytedance.compression.zstd.Zstd.getErrorName(r3)     // Catch: java.lang.Throwable -> L91
            r1.append(r0)     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L91
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L91
            throw r2     // Catch: java.lang.Throwable -> L91
        L46:
            long r2 = r7.stream     // Catch: java.lang.Throwable -> L91
            byte[] r1 = r7.dst     // Catch: java.lang.Throwable -> L91
            int r0 = com.bytedance.compression.zstd.ZstdOutputStreamNoFinalizer.dstSize     // Catch: java.lang.Throwable -> L91
            int r5 = r7.flushStream(r2, r1, r0)     // Catch: java.lang.Throwable -> L91
            long r3 = (long) r5     // Catch: java.lang.Throwable -> L91
            boolean r0 = com.bytedance.compression.zstd.Zstd.isError(r3)     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L6d
            java.io.OutputStream r4 = r7.out     // Catch: java.lang.Throwable -> L91
            byte[] r3 = r7.dst     // Catch: java.lang.Throwable -> L91
            long r1 = r7.dstPos     // Catch: java.lang.Throwable -> L91
            int r0 = (int) r1     // Catch: java.lang.Throwable -> L91
            r4.write(r3, r6, r0)     // Catch: java.lang.Throwable -> L91
            if (r5 > 0) goto L46
            goto L67
        L64:
            r0 = 1
            r7.frameClosed = r0     // Catch: java.lang.Throwable -> L91
        L67:
            java.io.OutputStream r0 = r7.out     // Catch: java.lang.Throwable -> L91
            r0.flush()     // Catch: java.lang.Throwable -> L91
            goto L87
        L6d:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "Compression error: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = com.bytedance.compression.zstd.Zstd.getErrorName(r3)     // Catch: java.lang.Throwable -> L91
            r1.append(r0)     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L91
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L91
            throw r2     // Catch: java.lang.Throwable -> L91
        L87:
            monitor-exit(r7)
            return
        L89:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "Stream closed"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L91
            throw r1     // Catch: java.lang.Throwable -> L91
        L91:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.compression.zstd.ZstdOutputStreamNoFinalizer.flush():void");
    }

    static {
        OHZ.LJII();
        dstSize = (int) recommendedCOutSize();
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream) {
        this(outputStream, YM8.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (com.bytedance.compression.zstd.Zstd.isError(r3) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        ((java.io.FilterOutputStream) r8).out.write(r8.dst, 0, (int) r8.dstPos);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r7 > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("Compression error: ");
        r1.append(com.bytedance.compression.zstd.Zstd.getErrorName(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        throw new java.io.IOException(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r9 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        ((java.io.FilterOutputStream) r8).out.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0008, code lost:
    
        if (r8.frameClosed == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000a, code lost:
    
        r7 = endStream(r8.stream, r8.dst, com.bytedance.compression.zstd.ZstdOutputStreamNoFinalizer.dstSize);
        r3 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void close(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.isClosed
            if (r0 == 0) goto L5
            return
        L5:
            r5 = 1
            boolean r0 = r8.frameClosed     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L28
        La:
            long r1 = r8.stream     // Catch: java.lang.Throwable -> L57
            byte[] r3 = r8.dst     // Catch: java.lang.Throwable -> L57
            int r0 = com.bytedance.compression.zstd.ZstdOutputStreamNoFinalizer.dstSize     // Catch: java.lang.Throwable -> L57
            int r7 = r8.endStream(r1, r3, r0)     // Catch: java.lang.Throwable -> L57
            long r3 = (long) r7     // Catch: java.lang.Throwable -> L57
            boolean r0 = com.bytedance.compression.zstd.Zstd.isError(r3)     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L2b
            java.io.OutputStream r6 = r8.out     // Catch: java.lang.Throwable -> L57
            byte[] r4 = r8.dst     // Catch: java.lang.Throwable -> L57
            long r2 = r8.dstPos     // Catch: java.lang.Throwable -> L57
            int r1 = (int) r2     // Catch: java.lang.Throwable -> L57
            r0 = 0
            r6.write(r4, r0, r1)     // Catch: java.lang.Throwable -> L57
            if (r7 > 0) goto La
        L28:
            if (r9 == 0) goto L4a
            goto L45
        L2b:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "Compression error: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = com.bytedance.compression.zstd.Zstd.getErrorName(r3)     // Catch: java.lang.Throwable -> L57
            r1.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L57
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L57
            throw r2     // Catch: java.lang.Throwable -> L57
        L45:
            java.io.OutputStream r0 = r8.out     // Catch: java.lang.Throwable -> L57
            r0.close()     // Catch: java.lang.Throwable -> L57
        L4a:
            r8.isClosed = r5
            X.YMA r0 = r8.bufferPool
            r0.getClass()
            long r0 = r8.stream
            freeCStream(r0)
            return
        L57:
            r2 = move-exception
            r8.isClosed = r5
            X.YMA r0 = r8.bufferPool
            r0.getClass()
            long r0 = r8.stream
            freeCStream(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.compression.zstd.ZstdOutputStreamNoFinalizer.close(boolean):void");
    }

    public synchronized ZstdOutputStreamNoFinalizer setChecksum(boolean z) {
        if (this.frameClosed) {
            long compressionChecksums = ZstdCompress.setCompressionChecksums(this.stream, z);
            if (Zstd.isError(compressionChecksums)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Compression param: ");
                LIZ.append(Zstd.getErrorName(compressionChecksums));
                throw new IOException(X1D.LIZIZ(LIZ));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setCloseFrameOnFlush(boolean z) {
        if (this.frameClosed) {
            this.closeFrameOnFlush = z;
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(byte[] bArr) {
        if (this.frameClosed) {
            long loadDictCompress = ZstdCompress.loadDictCompress(this.stream, bArr, bArr.length);
            if (Zstd.isError(loadDictCompress)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Compression param: ");
                LIZ.append(Zstd.getErrorName(loadDictCompress));
                throw new IOException(X1D.LIZIZ(LIZ));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLevel(int i) {
        if (this.frameClosed) {
            long compressionLevel = ZstdCompress.setCompressionLevel(this.stream, i);
            if (Zstd.isError(compressionLevel)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Compression param: ");
                LIZ.append(Zstd.getErrorName(compressionLevel));
                throw new IOException(X1D.LIZIZ(LIZ));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLong(int i) {
        if (this.frameClosed) {
            long compressionLong = ZstdCompress.setCompressionLong(this.stream, i);
            if (Zstd.isError(compressionLong)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Compression param: ");
                LIZ.append(Zstd.getErrorName(compressionLong));
                throw new IOException(X1D.LIZIZ(LIZ));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setWorkers(int i) {
        if (this.frameClosed) {
            long compressionWorkers = ZstdCompress.setCompressionWorkers(this.stream, i);
            if (Zstd.isError(compressionWorkers)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Compression param: ");
                LIZ.append(Zstd.getErrorName(compressionWorkers));
                throw new IOException(X1D.LIZIZ(LIZ));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) {
        if (this.frameClosed) {
            long loadFastDictCompress = ZstdCompress.loadFastDictCompress(this.stream, zstdDictCompress);
            if (Zstd.isError(loadFastDictCompress)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Compression param: ");
                LIZ.append(Zstd.getErrorName(loadFastDictCompress));
                throw new IOException(X1D.LIZIZ(LIZ));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, YMA yma) {
        super(outputStream);
        this.frameClosed = true;
        this.stream = createCStream();
        this.bufferPool = yma;
        int i = dstSize;
        yma.getClass();
        ByteBuffer allocate = ByteBuffer.allocate(i);
        this.dstByteBuffer = allocate;
        if (allocate != null) {
            this.dst = Zstd.extractArray(allocate);
            return;
        }
        throw new IOException(C0NY.LIZIZ("Cannot get ByteBuffer of size ", i, " from the BufferPool"));
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, int i) {
        this(outputStream, YM8.LIZ);
        ZstdCompress.setCompressionLevel(this.stream, i);
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, YMA yma, int i) {
        this(outputStream, yma);
        ZstdCompress.setCompressionLevel(this.stream, i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        if (!this.isClosed) {
            if (this.frameClosed) {
                long resetCStream = resetCStream(this.stream);
                if (!Zstd.isError(resetCStream)) {
                    this.frameClosed = false;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Compression error: cannot create header: ");
                    LIZ.append(Zstd.getErrorName(resetCStream));
                    throw new IOException(X1D.LIZIZ(LIZ));
                }
            }
            int i3 = i2 + i;
            this.srcPos = i;
            while (this.srcPos < i3) {
                long compressStream = compressStream(this.stream, this.dst, dstSize, bArr, i3);
                if (!Zstd.isError(compressStream)) {
                    long j = this.dstPos;
                    if (j > 0) {
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) j);
                    }
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Compression error: ");
                    LIZ2.append(Zstd.getErrorName(compressStream));
                    throw new IOException(X1D.LIZIZ(LIZ2));
                }
            }
        } else {
            throw new IOException("Stream closed");
        }
    }
}
