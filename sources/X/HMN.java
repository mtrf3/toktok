package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HMN<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ HMO LIZ;
    public final /* synthetic */ InterfaceC88472Yns<C43933HMb, C76800UCe> LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ InterfaceC88472Yns<C43933HMb, C76800UCe> LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public HMN(HMO hmo, InterfaceC88472Yns<? super C43933HMb, C76800UCe> interfaceC88472Yns, long j, String str, InterfaceC88472Yns<? super C43933HMb, C76800UCe> interfaceC88472Yns2) {
        this.LIZ = hmo;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = interfaceC88472Yns2;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        Integer num = (Integer) c10k.LJIIJJI();
        if (num == null || num.intValue() != 0) {
            InterfaceC88472Yns<C43933HMb, C76800UCe> interfaceC88472Yns = this.LJ;
            this.LIZ.getClass();
            long currentTimeMillis = System.currentTimeMillis() - this.LIZJ;
            String str = this.LIZLLL;
            Object LJIIJJI = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "it.result");
            interfaceC88472Yns.invoke(new C43933HMb(((Number) LJIIJJI).intValue(), "LocalVideoLegalChecker", currentTimeMillis, str, "", false));
        } else if (HOA.LIZ()) {
            HMO hmo = this.LIZ;
            hmo.LJFF.post(new HMM(this.LIZIZ, hmo, this.LIZJ, this.LIZLLL));
        } else {
            InterfaceC88472Yns<C43933HMb, C76800UCe> interfaceC88472Yns2 = this.LIZIZ;
            this.LIZ.getClass();
            interfaceC88472Yns2.invoke(new C43933HMb(0, "LocalVideoLegalChecker", System.currentTimeMillis() - this.LIZJ, this.LIZLLL, "", true));
        }
        return C76800UCe.LIZ;
    }
}
