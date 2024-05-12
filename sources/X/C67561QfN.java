package X;

import android.os.RemoteException;

/* renamed from: X.QfN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67561QfN extends AbstractRunnableC67572QfY {
    public final /* synthetic */ byte[] LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ C67649Qgn LJLJJI;
    public final /* synthetic */ AbstractC67565QfR LJLJJL;
    public final /* synthetic */ C67555QfH LJLJJLL;

    /* JADX WARN: Type inference failed for: r4v1, types: [android.os.IInterface, X.QfS] */
    @Override // X.AbstractRunnableC67572QfY
    public final void LIZIZ() {
        try {
            C67555QfH c67555QfH = this.LJLJJLL;
            c67555QfH.LIZJ.LJIIL.v(C67555QfH.LIZ(c67555QfH, this.LJLILLLLZI, this.LJLJI), new BinderC67567QfT(this.LJLJJLL, this.LJLJJI));
        } catch (RemoteException e) {
            C67554QfG c67554QfG = this.LJLJJLL.LIZ;
            Object[] objArr = {this.LJLJJL};
            if (android.util.Log.isLoggable("PlayCore", 6)) {
                C67554QfG.LIZIZ(c67554QfG.LIZ, "requestIntegrityToken(%s)", objArr);
            } else {
                c67554QfG.getClass();
            }
            this.LJLJJI.LIZJ(new ETJ(-100, e));
        }
    }

    @Override // X.AbstractRunnableC67572QfY
    public final void LIZ(Exception exc) {
        if (exc instanceof C67580Qfg) {
            super.LIZ(new ETJ(-9, exc));
        } else {
            super.LIZ(exc);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67561QfN(C67555QfH c67555QfH, C67649Qgn c67649Qgn, byte[] bArr, Long l, C67649Qgn c67649Qgn2, C67562QfO c67562QfO) {
        super(c67649Qgn);
        this.LJLJJLL = c67555QfH;
        this.LJLILLLLZI = bArr;
        this.LJLJI = l;
        this.LJLJJI = c67649Qgn2;
        this.LJLJJL = c67562QfO;
    }
}
