package X;

import kotlin.jvm.internal.AqS171S0100000_5;

/* renamed from: X.Bzs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30612Bzs implements InterfaceC72822Si2 {
    public final /* synthetic */ C30611Bzr LJLIL;

    public C30612Bzs(C30611Bzr c30611Bzr) {
        this.LJLIL = c30611Bzr;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceiveJsEvent:");
        LIZ.append(c199097rd.LJLIL);
        LIZ.append("plugGamesInVideoLive =");
        C19U.LIZJ(LIZ, this.LJLIL.LJLJJL, LIZ, "GameCpVideoLive");
        C30611Bzr c30611Bzr = this.LJLIL;
        C30577BzJ.LIZLLL(true, c199097rd, c30611Bzr.LJLJI, c30611Bzr.LJLLILLLL, new AqS171S0100000_5(c30611Bzr, 788));
    }
}
