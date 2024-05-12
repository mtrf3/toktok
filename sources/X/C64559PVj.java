package X;

import java.net.ProtocolException;

/* renamed from: X.PVj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64559PVj extends AbstractC64556PVg {
    public final C64626PXy LJLJJL;
    public long LJLJJLL;
    public boolean LJLJL;
    public final /* synthetic */ C64560PVk LJLJLJ;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
    
        if (X.PVA.LJIJI(r3, 100, java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L10;
     */
    @Override // X.PUC, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r3 = this;
            boolean r0 = r3.LJLILLLLZI
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r3.LJLJL
            if (r0 == 0) goto L18
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 0
            r0 = 100
            boolean r0 = X.PVA.LJIJI(r3, r0, r2)     // Catch: java.io.IOException -> L14
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r3.LIZ(r0, r1)
        L18:
            r0 = 1
            r3.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64559PVj.close():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64559PVj(C64560PVk c64560PVk, C64626PXy c64626PXy) {
        super(c64560PVk);
        this.LJLJLJ = c64560PVk;
        this.LJLJJLL = -1L;
        this.LJLJL = true;
        this.LJLJJL = c64626PXy;
    }

    @Override // X.AbstractC64556PVg, X.PUC
    public final long read(C64533PUj c64533PUj, long j) {
        if (j >= 0) {
            if (!this.LJLILLLLZI) {
                if (!this.LJLJL) {
                    return -1L;
                }
                long j2 = this.LJLJJLL;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        this.LJLJLJ.LIZJ.LLIIZ();
                    }
                    try {
                        this.LJLJJLL = this.LJLJLJ.LIZJ.LJLZ();
                        String trim = this.LJLJLJ.LIZJ.LLIIZ().trim();
                        if (this.LJLJJLL >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                            if (this.LJLJJLL == 0) {
                                this.LJLJL = false;
                                C64560PVk c64560PVk = this.LJLJLJ;
                                C64573PVx.LJ(c64560PVk.LIZ.LJLJLLL, this.LJLJJL, c64560PVk.LJIIIIZZ());
                                LIZ(null, true);
                            }
                            if (!this.LJLJL) {
                                return -1L;
                            }
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("expected chunk size and optional extensions but was \"");
                            LIZ.append(this.LJLJJLL);
                            LIZ.append(trim);
                            LIZ.append("\"");
                            throw new ProtocolException(X1D.LIZIZ(LIZ));
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long read = super.read(c64533PUj, Math.min(j, this.LJLJJLL));
                if (read != -1) {
                    this.LJLJJLL -= read;
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
