package X;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.QkW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C67880QkW implements InterfaceC67783Qix {
    public final /* synthetic */ AbstractC67863QkF LIZ;

    public C67880QkW(AbstractC67863QkF abstractC67863QkF) {
        this.LIZ = abstractC67863QkF;
    }

    @Override // X.InterfaceC67783Qix
    public final void LIZ(ConnectionResult connectionResult) {
        if (connectionResult.LJJJJZ()) {
            AbstractC67863QkF abstractC67863QkF = this.LIZ;
            abstractC67863QkF.LJIILIIL(null, abstractC67863QkF.LJJIII());
        } else {
            InterfaceC67948Qlc interfaceC67948Qlc = this.LIZ.LLD;
            if (interfaceC67948Qlc != null) {
                interfaceC67948Qlc.onConnectionFailed(connectionResult);
            }
        }
    }
}
