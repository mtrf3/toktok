package X;

import java.util.concurrent.Executor;

/* renamed from: X.QEm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66668QEm extends AbstractC66666QEk {
    public final AbstractC66666QEk LIZ;

    @Override // X.AbstractC66666QEk
    public final Executor getExecutor() {
        return this.LIZ.getExecutor();
    }

    public C66668QEm(AbstractC66666QEk abstractC66666QEk) {
        super(abstractC66666QEk.getExecutor());
        this.LIZ = abstractC66666QEk;
    }

    @Override // X.AbstractC66666QEk
    public final void onRequestFinished(QE2 qe2) {
        this.LIZ.onRequestFinished(qe2);
    }
}
