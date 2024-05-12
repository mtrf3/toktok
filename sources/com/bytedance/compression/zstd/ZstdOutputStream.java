package com.bytedance.compression.zstd;

import X.YM8;
import X.YMA;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes16.dex */
public class ZstdOutputStream extends FilterOutputStream {
    public ZstdOutputStreamNoFinalizer inner;

    public void setFinalize(boolean z) {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inner.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.inner.flush();
    }

    public static long recommendedCOutSize() {
        return ZstdOutputStreamNoFinalizer.recommendedCOutSize();
    }

    public void finalize() {
        close();
    }

    public ZstdOutputStream(OutputStream outputStream) {
        this(outputStream, YM8.LIZ);
    }

    public ZstdOutputStream setChecksum(boolean z) {
        this.inner.setChecksum(z);
        return this;
    }

    public ZstdOutputStream setCloseFrameOnFlush(boolean z) {
        this.inner.setCloseFrameOnFlush(z);
        return this;
    }

    public ZstdOutputStream setDict(ZstdDictCompress zstdDictCompress) {
        this.inner.setDict(zstdDictCompress);
        return this;
    }

    public ZstdOutputStream setLevel(int i) {
        this.inner.setLevel(i);
        return this;
    }

    public ZstdOutputStream setLong(int i) {
        this.inner.setLong(i);
        return this;
    }

    public ZstdOutputStream setWorkers(int i) {
        this.inner.setWorkers(i);
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        this.inner.write(i);
    }

    public ZstdOutputStream setDict(byte[] bArr) {
        this.inner.setDict(bArr);
        return this;
    }

    public ZstdOutputStream(OutputStream outputStream, int i) {
        this(outputStream, YM8.LIZ);
        this.inner.setLevel(i);
    }

    public ZstdOutputStream(OutputStream outputStream, YMA yma) {
        super(outputStream);
        this.inner = new ZstdOutputStreamNoFinalizer(outputStream, yma);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.inner.write(bArr, i, i2);
    }
}
