package X;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: X.P9e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63982P9e extends FilterOutputStream {
    public long LJLIL;
    public long LJLILLLLZI;

    public final long count() {
        long j = this.LJLIL;
        long j2 = j - this.LJLILLLLZI;
        this.LJLILLLLZI = j;
        return j2;
    }

    public C63982P9e(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.LJLIL++;
        ((FilterOutputStream) this).out.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.LJLIL += i2;
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
