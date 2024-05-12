package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nst, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60755Nst extends AbstractC65781Prl implements InterfaceC88472Yns<C61295O3v, C76800UCe> {
    public final /* synthetic */ C60753Nsr LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ QXX LJLJI;
    public final /* synthetic */ Runnable LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60755Nst(C60753Nsr c60753Nsr, long j, QXX qxx, RunnableC60754Nss runnableC60754Nss) {
        super(1);
        this.LJLIL = c60753Nsr;
        this.LJLILLLLZI = j;
        this.LJLJI = qxx;
        this.LJLJJI = runnableC60754Nss;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C61295O3v c61295O3v) {
        C61295O3v response = c61295O3v;
        o.LJIIJ(response, "response");
        byte[] S = response.S();
        if (S != null) {
            String str = new String(S, PVC.LIZ);
            C60757Nsv.LIZLLL(this.LJLIL.LIZIZ, response, true, this.LJLILLLLZI, null);
            this.LJLJI.LLLILZJ(VEH.LIZ(str));
        } else {
            this.LJLJJI.run();
        }
        return C76800UCe.LIZ;
    }
}
