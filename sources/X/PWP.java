package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class PWP extends AbstractRunnableC64621PXt {
    public final /* synthetic */ PWE LJLJI;

    @Override // X.AbstractRunnableC64621PXt
    public final void LIZIZ() {
        PWE pwe;
        boolean z;
        if (!PWY.LIZ().LIZJ.get()) {
            return;
        }
        synchronized (this.LJLJI) {
            pwe = this.LJLJI;
            long j = pwe.LJLLILLLL;
            long j2 = pwe.LJLLI;
            if (j < j2) {
                z = true;
            } else {
                pwe.LJLLI = j2 + 1;
                z = false;
            }
        }
        try {
            if (z) {
                PWT pwt = PWT.PROTOCOL_ERROR;
                pwe.LIZ(pwt, pwt);
            } else {
                try {
                    pwe.LL.LJFF(1, 0, false);
                } catch (IOException unused) {
                    PWT pwt2 = PWT.PROTOCOL_ERROR;
                    pwe.LIZ(pwt2, pwt2);
                }
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWP(PWE pwe) {
        super("OkHttp %s ping", new Object[]{pwe.LJLJJI});
        this.LJLJI = pwe;
    }
}
