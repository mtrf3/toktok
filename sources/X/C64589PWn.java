package X;

import java.io.IOException;

/* renamed from: X.PWn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64589PWn extends AbstractRunnableC64621PXt {
    public final PX8 LJLJI;
    public final /* synthetic */ C64587PWl LJLJJI;

    @Override // X.AbstractRunnableC64621PXt
    public final void LIZIZ() {
        boolean z;
        this.LJLJJI.LJLJI.LJIIIIZZ();
        boolean z2 = false;
        try {
            try {
                z = true;
                try {
                    this.LJLJI.onResponse(this.LJLJJI, this.LJLJJI.LIZIZ());
                } catch (IOException e) {
                    e = e;
                    IOException LIZLLL = this.LJLJJI.LIZLLL(e);
                    if (z) {
                        P9A p9a = P9A.LIZ;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Callback failure for ");
                        LIZ.append(this.LJLJJI.LJ());
                        p9a.LJIIJJI(4, X1D.LIZIZ(LIZ), LIZLLL);
                    } else {
                        C64587PWl c64587PWl = this.LJLJJI;
                        c64587PWl.LJLJJI.callFailed(c64587PWl, LIZLLL);
                        this.LJLJI.onFailure(this.LJLJJI, LIZLLL);
                    }
                } catch (Throwable th) {
                    th = th;
                    z2 = true;
                    this.LJLJJI.LIZ(-1);
                    if (!z2) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("canceled due to ");
                        LIZ2.append(th);
                        this.LJLJI.onFailure(this.LJLJJI, new IOException(X1D.LIZIZ(LIZ2)));
                    }
                    throw th;
                }
            } finally {
                this.LJLJJI.LJLIL.LJLIL.LIZLLL(this);
            }
        } catch (IOException e2) {
            e = e2;
            z = false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64589PWn(C64587PWl c64587PWl, PX8 px8) {
        super("OkHttp %s", new Object[]{c64587PWl.LJLJJL.url().LJIJI()});
        this.LJLJJI = c64587PWl;
        this.LJLJI = px8;
    }
}
