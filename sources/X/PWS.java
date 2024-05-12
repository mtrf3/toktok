package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class PWS extends AbstractRunnableC64621PXt {
    public final boolean LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final /* synthetic */ PWE LJLJJLL;

    @Override // X.AbstractRunnableC64621PXt
    public final void LIZIZ() {
        PWE pwe = this.LJLJJLL;
        boolean z = this.LJLJI;
        int i = this.LJLJJI;
        int i2 = this.LJLJJL;
        pwe.getClass();
        try {
            try {
                pwe.LL.LJFF(i, i2, z);
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            PWT pwt = PWT.PROTOCOL_ERROR;
            pwe.LIZ(pwt, pwt);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWS(PWE pwe, int i, int i2) {
        super("OkHttp %s ping %08x%08x", new Object[]{pwe.LJLJJI, Integer.valueOf(i), Integer.valueOf(i2)});
        this.LJLJJLL = pwe;
        this.LJLJI = true;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }
}
