package com.ss.android.ugc.effectmanager.common.cachemanager;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TotalLengthOutputStream extends FilterOutputStream {
    public long length;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    public final long getLength() {
        return this.length;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalLengthOutputStream(OutputStream outStream) {
        super(outStream);
        o.LJIIJ(outStream, "outStream");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        this.length++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.length += i2;
    }
}
