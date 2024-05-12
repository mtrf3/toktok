package X;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.Qj4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67790Qj4 implements InterfaceC67948Qlc {
    public final /* synthetic */ InterfaceC67712Qho LJLIL;

    public C67790Qj4(InterfaceC67712Qho interfaceC67712Qho) {
        this.LJLIL = interfaceC67712Qho;
    }

    @Override // X.InterfaceC67948Qlc
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.LJLIL.onConnectionFailed(connectionResult);
    }
}
