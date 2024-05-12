package X;

import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;

/* renamed from: X.CGg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31042CGg extends AbstractC61537ODd {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;

    @Override // X.AbstractC61537ODd
    public final void LJIIIZ(LocalPackageModel localPackageModel) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("check update : ");
        LIZ.append(this.LIZ);
        LIZ.append("   onLocalNewestVersion");
        C0NB.LJ("GamePartnershipGeckoHandler", X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("check update : ");
        LIZ.append(this.LIZ);
        LIZ.append("   onUpdateFailed");
        C0NB.LJ("GamePartnershipGeckoHandler", X1D.LIZIZ(LIZ));
        String str2 = this.LIZ;
        Boolean bool = Boolean.FALSE;
        Boolean valueOf = Boolean.valueOf(this.LIZIZ);
        if (th == null || (str = th.getMessage()) == null) {
            str = "";
        }
        C30588BzU.LJIIIZ(bool, str2, str, valueOf, Boolean.valueOf(this.LIZJ));
        if (!this.LIZJ) {
            this.LIZLLL.invoke();
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("check update : ");
        LIZ.append(this.LIZ);
        LIZ.append("   onUpdateSuccess");
        C0NB.LJ("GamePartnershipGeckoHandler", X1D.LIZIZ(LIZ));
        C30588BzU.LJIIIZ(Boolean.TRUE, this.LIZ, "", Boolean.valueOf(this.LIZIZ), Boolean.valueOf(this.LIZJ));
    }

    public C31042CGg(String str, InterfaceC65784Pro interfaceC65784Pro, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = interfaceC65784Pro;
    }
}
