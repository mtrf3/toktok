package X;

import java.io.OutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.XLp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84689XLp extends OutputStream {
    public int LJLIL;
    public boolean LJLJJI;
    public final int LJLJI = 32;
    public byte[] LJLILLLLZI = new byte[32];

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final String toString() {
        return new String(this.LJLILLLLZI, 0, this.LJLIL, PVC.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if ((r2 - r5) < 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r5) {
        /*
            r4 = this;
            byte[] r3 = r4.LJLILLLLZI
            int r0 = r3.length
            int r0 = r5 - r0
            if (r0 <= 0) goto L2c
            int r1 = r3.length
            boolean r0 = r4.LJLJJI
            if (r0 != 0) goto L12
            int r2 = r1 << 1
            int r0 = r2 - r5
            if (r0 >= 0) goto L13
        L12:
            r2 = r5
        L13:
            r1 = 2147483639(0x7ffffff7, float:NaN)
            int r0 = r2 - r1
            if (r0 <= 0) goto L21
            if (r5 < 0) goto L31
            if (r5 <= r1) goto L2d
            r2 = 2147483647(0x7fffffff, float:NaN)
        L21:
            byte[] r1 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r0 = "copyOf(primitiveBytes, newCapacity)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r4.LJLILLLLZI = r1
        L2c:
            return
        L2d:
            r2 = 2147483639(0x7ffffff7, float:NaN)
            goto L21
        L31:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84689XLp.LIZ(int):void");
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        LIZ(this.LJLIL + 1);
        byte[] bArr = this.LJLILLLLZI;
        int i2 = this.LJLIL;
        bArr[i2] = (byte) i;
        this.LJLIL = i2 + 1;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b, int i, int i2) {
        o.LJIIIZ(b, "b");
        if (i + i2 <= b.length) {
            LIZ(this.LJLIL + i2);
            System.arraycopy(b, i, this.LJLILLLLZI, this.LJLIL, i2);
            this.LJLIL += i2;
            return;
        }
        throw new IndexOutOfBoundsException("checkFromIndexSize error");
    }
}
