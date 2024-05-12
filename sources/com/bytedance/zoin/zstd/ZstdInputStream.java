package com.bytedance.zoin.zstd;

import X.YM9;
import com.bytedance.compression.zstd.ZstdDictDecompress;
import java.io.InputStream;

/* loaded from: classes16.dex */
public class ZstdInputStream extends com.bytedance.compression.zstd.ZstdInputStream {
    public boolean finalize;

    @Override // com.bytedance.compression.zstd.ZstdInputStream
    public void finalize() {
        if (this.finalize) {
            close();
        }
    }

    @Override // com.bytedance.compression.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return super.available();
    }

    @Override // com.bytedance.compression.zstd.ZstdInputStream
    public boolean getContinuous() {
        return super.getContinuous();
    }

    @Override // com.bytedance.compression.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return super.markSupported();
    }

    @Override // com.bytedance.compression.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        return super.read();
    }

    @Override // com.bytedance.compression.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    public ZstdInputStream(InputStream inputStream) {
        super(inputStream);
        this.finalize = true;
    }

    @Override // com.bytedance.compression.zstd.ZstdInputStream
    public /* bridge */ /* synthetic */ com.bytedance.compression.zstd.ZstdInputStream setContinuous(boolean z) {
        setContinuous(z);
        return this;
    }

    @Override // com.bytedance.compression.zstd.ZstdInputStream
    public /* bridge */ /* synthetic */ com.bytedance.compression.zstd.ZstdInputStream setDict(byte[] bArr) {
        setDict(bArr);
        return this;
    }

    public void setFinalize(boolean z) {
        this.finalize = z;
    }

    @Override // com.bytedance.compression.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        return super.skip(j);
    }

    @Override // com.bytedance.compression.zstd.ZstdInputStream
    public ZstdInputStream setContinuous(boolean z) {
        super.setContinuous(z);
        return this;
    }

    public ZstdInputStream setDict(YM9 ym9) {
        super.setDict((ZstdDictDecompress) ym9);
        return this;
    }

    @Override // com.bytedance.compression.zstd.ZstdInputStream
    public ZstdInputStream setDict(byte[] bArr) {
        super.setDict(bArr);
        return this;
    }

    @Override // com.bytedance.compression.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return super.read(bArr, i, i2);
    }
}
