package X;

import android.content.Context;

/* loaded from: classes14.dex */
public final class UZJ<T> implements InterfaceC64592gB {
    public final /* synthetic */ UZM LJLIL;
    public final /* synthetic */ UZK LJLILLLLZI;
    public final /* synthetic */ UZI LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public UZJ(UZM uzm, UZK uzk, UZI uzi, Context context, int i) {
        this.LJLIL = uzm;
        this.LJLILLLLZI = uzk;
        this.LJLJI = uzi;
        this.LJLJJI = context;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        UZM uzm;
        Throwable th = (Throwable) obj;
        if ((th instanceof C276516r) && (uzm = this.LJLIL) != null) {
            ((C276516r) th).getErrorCode();
            uzm.LIZ("");
        }
        this.LJLILLLLZI.LJ(this.LJLJI, this.LJLJJI, "");
        C30868C9o.LIZJ(this.LJLJJL);
        UZK uzk = this.LJLILLLLZI;
        UZL uzl = UZL.NETWORK_ERROR;
        UZI uzi = this.LJLJI;
        uzk.getClass();
        UZK.LIZLLL(uzl, uzi);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("failed in sendClickDownloadEvent, e: ");
        LIZ.append(th);
        C0NB.LJ("DownloadPartneringGameMethod", X1D.LIZIZ(LIZ));
    }
}
