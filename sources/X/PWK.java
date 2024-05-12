package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class PWK extends AbstractRunnableC64621PXt {
    public final /* synthetic */ PWF LJLJI;
    public final /* synthetic */ PWO LJLJJI;

    @Override // X.AbstractRunnableC64621PXt
    public final void LIZIZ() {
        try {
            this.LJLJJI.LJLJJI.LJLILLLLZI.LIZIZ(this.LJLJI);
        } catch (IOException e) {
            P9A p9a = P9A.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Http2Connection.Listener failure for ");
            LIZ.append(this.LJLJJI.LJLJJI.LJLJJI);
            p9a.LJIIJJI(4, X1D.LIZIZ(LIZ), e);
            try {
                this.LJLJI.LIZJ(PWT.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWK(PWO pwo, Object[] objArr, PWF pwf) {
        super("OkHttp %s stream %d", objArr);
        this.LJLJJI = pwo;
        this.LJLJI = pwf;
    }
}
