package X;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.Qhn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67711Qhn implements InterfaceC67707Qhj {
    public final int LJLIL;
    public final AbstractC67709Qhl LJLILLLLZI;
    public final InterfaceC67707Qhj LJLJI;
    public final /* synthetic */ C67710Qhm LJLJJI;

    public C67711Qhn(C67710Qhm c67710Qhm, int i, C67756QiW c67756QiW, InterfaceC67707Qhj interfaceC67707Qhj) {
        this.LJLJJI = c67710Qhm;
        this.LJLIL = i;
        this.LJLILLLLZI = c67756QiW;
        this.LJLJI = interfaceC67707Qhj;
    }

    @Override // X.InterfaceC67712Qho
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        String.valueOf(connectionResult);
        this.LJLJJI.LJIIL(connectionResult, this.LJLIL);
    }
}
