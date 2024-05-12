package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class PWU extends AbstractRunnableC64621PXt {
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ PWT LJLJJI;
    public final /* synthetic */ PWE LJLJJL;

    @Override // X.AbstractRunnableC64621PXt
    public final void LIZIZ() {
        try {
            PWE pwe = this.LJLJJL;
            pwe.LL.LJI(this.LJLJI, this.LJLJJI);
        } catch (IOException unused) {
            PWE pwe2 = this.LJLJJL;
            pwe2.getClass();
            try {
                PWT pwt = PWT.PROTOCOL_ERROR;
                pwe2.LIZ(pwt, pwt);
            } catch (IOException unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWU(PWE pwe, Object[] objArr, int i, PWT pwt) {
        super("OkHttp %s stream %d", objArr);
        this.LJLJJL = pwe;
        this.LJLJI = i;
        this.LJLJJI = pwt;
    }
}
