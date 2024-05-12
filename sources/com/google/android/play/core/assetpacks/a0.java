package com.google.android.play.core.assetpacks;

import java.io.InputStream;

/* loaded from: classes7.dex */
public final class a0 extends InputStream {
    public final InputStream LJLIL;
    public long LJLILLLLZI;

    public a0(InputStream inputStream, long j) {
        this.LJLIL = inputStream;
        this.LJLILLLLZI = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.LJLIL.close();
        this.LJLILLLLZI = 0L;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.LJLILLLLZI;
        if (j <= 0) {
            return -1;
        }
        this.LJLILLLLZI = j - 1;
        return this.LJLIL.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.LJLILLLLZI;
        if (j <= 0) {
            return -1;
        }
        int read = this.LJLIL.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.LJLILLLLZI -= read;
        }
        return read;
    }
}
