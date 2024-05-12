package X;

import com.google.android.play.core.assetpacks.b0;
import java.io.InputStream;

/* renamed from: X.FxR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40653FxR extends AbstractC40652FxQ {
    public final AbstractC40652FxQ LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;

    public C40653FxR(b0 b0Var, long j, long j2) {
        this.LJLIL = b0Var;
        long LIZJ = LIZJ(j);
        this.LJLILLLLZI = LIZJ;
        this.LJLJI = LIZJ(LIZJ + j2);
    }

    @Override // X.AbstractC40652FxQ
    public final long LIZ() {
        return this.LJLJI - this.LJLILLLLZI;
    }

    @Override // X.AbstractC40652FxQ
    public final InputStream LIZIZ(long j, long j2) {
        long LIZJ = LIZJ(this.LJLILLLLZI);
        return this.LJLIL.LIZIZ(LIZJ, LIZJ(j2 + LIZJ) - LIZJ);
    }

    public final long LIZJ(long j) {
        if (j < 0) {
            return 0L;
        }
        return j > this.LJLIL.LIZ() ? this.LJLIL.LIZ() : j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
