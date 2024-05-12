package X;

import java.net.ProtocolException;

/* renamed from: X.PVh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64557PVh extends AbstractC64556PVg {
    public long LJLJJL;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (X.PVA.LJIJI(r5, 100, java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L10;
     */
    @Override // X.PUC, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            boolean r0 = r5.LJLILLLLZI
            if (r0 == 0) goto L5
            return
        L5:
            long r3 = r5.LJLJJL
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L1c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 0
            r0 = 100
            boolean r0 = X.PVA.LJIJI(r5, r0, r2)     // Catch: java.io.IOException -> L18
            if (r0 != 0) goto L1c
        L18:
            r0 = 0
            r5.LIZ(r0, r1)
        L1c:
            r0 = 1
            r5.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64557PVh.close():void");
    }

    public C64557PVh(C64560PVk c64560PVk, long j) {
        super(c64560PVk);
        this.LJLJJL = j;
        if (j == 0) {
            LIZ(null, true);
        }
    }

    @Override // X.AbstractC64556PVg, X.PUC
    public final long read(C64533PUj c64533PUj, long j) {
        if (j >= 0) {
            if (!this.LJLILLLLZI) {
                long j2 = this.LJLJJL;
                if (j2 == 0) {
                    return -1L;
                }
                long read = super.read(c64533PUj, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.LJLJJL - read;
                    this.LJLJJL = j3;
                    if (j3 == 0) {
                        LIZ(null, true);
                    }
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                LIZ(protocolException, false);
                throw protocolException;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(C61845OOz.LIZ("byteCount < 0: ", j));
    }
}
