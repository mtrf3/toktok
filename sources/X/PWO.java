package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public class PWO extends AbstractRunnableC64621PXt implements InterfaceC64581PWf {
    public final PWC LJLJI;
    public final /* synthetic */ PWE LJLJJI;

    @Override // X.AbstractRunnableC64621PXt
    public final void LIZIZ() {
        PWT pwt;
        PWT pwt2 = PWT.INTERNAL_ERROR;
        try {
            try {
                this.LJLJI.LIZJ(this);
                do {
                } while (this.LJLJI.LIZIZ(false, this));
                pwt = PWT.NO_ERROR;
                try {
                    try {
                        this.LJLJJI.LIZ(pwt, PWT.CANCEL);
                    } catch (IOException unused) {
                        PWT pwt3 = PWT.PROTOCOL_ERROR;
                        this.LJLJJI.LIZ(pwt3, pwt3);
                        PVA.LJ(this.LJLJI);
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        this.LJLJJI.LIZ(pwt, pwt2);
                    } catch (IOException unused2) {
                    }
                    PVA.LJ(this.LJLJI);
                    throw th;
                }
            } catch (IOException unused3) {
            }
        } catch (IOException unused4) {
            pwt = pwt2;
        } catch (Throwable th2) {
            th = th2;
            pwt = pwt2;
            this.LJLJJI.LIZ(pwt, pwt2);
            PVA.LJ(this.LJLJI);
            throw th;
        }
        PVA.LJ(this.LJLJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWO(PWE pwe, PWC pwc) {
        super("OkHttp %s", new Object[]{pwe.LJLJJI});
        this.LJLJJI = pwe;
        this.LJLJI = pwc;
    }
}
