package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class PWX extends AbstractRunnableC64621PXt {
    public final /* synthetic */ PWE LJLJI;

    @Override // X.AbstractRunnableC64621PXt
    public final void LIZIZ() {
        PWE pwe = this.LJLJI;
        pwe.getClass();
        try {
            try {
                pwe.LL.LJFF(2, 0, false);
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            PWT pwt = PWT.PROTOCOL_ERROR;
            pwe.LIZ(pwt, pwt);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWX(PWE pwe, Object... objArr) {
        super("OkHttp %s ping", objArr);
        this.LJLJI = pwe;
    }
}
