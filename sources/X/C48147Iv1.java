package X;

import java.io.InputStream;

/* renamed from: X.Iv1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48147Iv1 extends AbstractC48148Iv2 {
    public final /* synthetic */ InputStream LIZ;
    public final /* synthetic */ C64598PWw LIZIZ;
    public final /* synthetic */ InterfaceC48133Iun LIZJ;
    public final /* synthetic */ PVM LIZLLL;

    @Override // X.X3T
    public final String LIZLLL() {
        return "";
    }

    @Override // X.X5J
    public final int LIZ() {
        return this.LIZIZ.LJLJI;
    }

    @Override // X.X5J
    public final void cancel() {
        InterfaceC48133Iun interfaceC48133Iun = this.LIZJ;
        if (interfaceC48133Iun != null && !interfaceC48133Iun.isCanceled()) {
            this.LIZJ.cancel();
        }
    }

    @Override // X.X5F
    public final void end() {
        try {
            PVM pvm = this.LIZLLL;
            if (pvm != null) {
                pvm.close();
            }
            InterfaceC48133Iun interfaceC48133Iun = this.LIZJ;
            if (interfaceC48133Iun != null && !interfaceC48133Iun.isCanceled()) {
                this.LIZJ.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.X5F
    public final InputStream LIZJ() {
        return this.LIZ;
    }

    @Override // X.X5J
    public final String LIZIZ(String str) {
        return this.LIZIZ.LIZ(str, null);
    }

    public C48147Iv1(InputStream inputStream, C64598PWw c64598PWw, C64587PWl c64587PWl, PVM pvm) {
        this.LIZ = inputStream;
        this.LIZIZ = c64598PWw;
        this.LIZJ = c64587PWl;
        this.LIZLLL = pvm;
    }
}
