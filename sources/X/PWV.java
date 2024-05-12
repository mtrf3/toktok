package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class PWV extends AbstractRunnableC64621PXt {
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ PWE LJLJJL;

    @Override // X.AbstractRunnableC64621PXt
    public final void LIZIZ() {
        try {
            this.LJLJJL.LL.LJIIL(this.LJLJI, this.LJLJJI);
        } catch (IOException unused) {
            PWE pwe = this.LJLJJL;
            pwe.getClass();
            try {
                PWT pwt = PWT.PROTOCOL_ERROR;
                pwe.LIZ(pwt, pwt);
            } catch (IOException unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWV(PWE pwe, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.LJLJJL = pwe;
        this.LJLJI = i;
        this.LJLJJI = j;
    }
}
