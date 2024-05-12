package X;

import java.util.zip.Inflater;

/* loaded from: classes12.dex */
public final class PUK implements PUC {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public final PW3 LJLJI;
    public final Inflater LJLJJI;

    @Override // X.PUC, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLJJI.end();
        this.LJLILLLLZI = true;
        this.LJLJI.close();
    }

    @Override // X.PUC
    public final C64545PUv timeout() {
        return this.LJLJI.timeout();
    }

    public PUK(C64532PUi c64532PUi, Inflater inflater) {
        this.LJLJI = c64532PUi;
        this.LJLJJI = inflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[Catch: DataFormatException -> 0x00cf, TryCatch #0 {DataFormatException -> 0x00cf, blocks: (B:12:0x0048, B:34:0x0062, B:14:0x006e, B:16:0x0076, B:21:0x00c7, B:22:0x00ce, B:24:0x007e, B:26:0x0082, B:28:0x0088, B:31:0x0092), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062 A[SYNTHETIC] */
    @Override // X.PUC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(X.C64533PUj r8, long r9) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PUK.read(X.PUj, long):long");
    }
}
