package X;

import java.io.IOException;

/* renamed from: X.PVf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64555PVf extends PUD {
    public boolean LJLIL;
    public long LJLILLLLZI;
    public final /* synthetic */ PWD LJLJI;

    @Override // X.PUD, X.PUC, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        PWD pwd = this.LJLJI;
        pwd.LIZIZ.LJIIIIZZ(false, pwd, this.LJLILLLLZI, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64555PVf(PWD pwd, PWG pwg) {
        super(pwg);
        this.LJLJI = pwd;
    }

    @Override // X.PUD, X.PUC
    public final long read(C64533PUj c64533PUj, long j) {
        try {
            long read = this.delegate.read(c64533PUj, j);
            if (read > 0) {
                this.LJLILLLLZI += read;
            }
            return read;
        } catch (IOException e) {
            if (!this.LJLIL) {
                this.LJLIL = true;
                PWD pwd = this.LJLJI;
                pwd.LIZIZ.LJIIIIZZ(false, pwd, this.LJLILLLLZI, e);
            }
            throw e;
        }
    }
}
