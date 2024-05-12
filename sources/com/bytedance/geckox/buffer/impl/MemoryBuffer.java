package com.bytedance.geckox.buffer.impl;

import X.C16880lQ;
import X.C45804HyK;
import X.OEF;
import X.V3N;
import android.content.Context;
import com.bytedance.librarian.Librarian;
import java.io.File;

/* loaded from: classes11.dex */
public class MemoryBuffer implements OEF {
    private native long nCreate(String str, long j);

    private native void nFlush(long j, String str, long j2);

    private native void nRead(long j, long j2, byte[] bArr, int i, int i2);

    private native void nRelease(long j, long j2);

    private native void nWrite(long j, long j2, byte[] bArr, int i, int i2);

    @Override // X.OEF
    public final boolean LJJIFFI() {
        return false;
    }

    @Override // X.OEF
    public final File LJJIII() {
        return null;
    }

    @Override // X.OEF
    public final long length() {
        return 0L;
    }

    static {
        Context context = V3N.LJLIL;
        if (context == null) {
            C16880lQ.LLJJJIL("buffer");
        } else {
            Librarian.LJFF(context, "buffer");
        }
    }

    public final void finalize() {
        super.finalize();
        try {
            throw null;
        } catch (Exception e) {
            C45804HyK.LJJLIIIJJIZ(e);
        }
    }

    @Override // X.OEF
    public final void LJJII() {
        throw null;
    }

    @Override // X.OEF
    public final long position() {
        throw null;
    }

    @Override // X.OEF
    public final int read() {
        throw null;
    }

    @Override // X.OEF
    public final void release() {
        throw null;
    }

    @Override // X.OEF
    public final void position(long j) {
        throw null;
    }

    @Override // X.OEF
    public final int read(byte[] bArr) {
        throw null;
    }

    @Override // X.OEF
    public final synchronized long skip(long j) {
        throw null;
    }

    @Override // X.OEF
    public final void write(int i) {
        throw null;
    }

    @Override // X.OEF
    public final void write(byte[] bArr) {
        throw null;
    }

    @Override // X.OEF
    public final int LJJI(int i, byte[] bArr, int i2) {
        throw null;
    }

    @Override // X.OEF
    public final int read(byte[] bArr, int i, int i2) {
        throw null;
    }
}
