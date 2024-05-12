package X;

import android.os.RemoteException;
import org.json.JSONObject;

/* renamed from: X.X2r, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84197X2r extends AbstractC84195X2p {
    public final /* synthetic */ InterfaceC84196X2q LIZ;

    @Override // X.AbstractC84195X2p
    public final int[] LIZ() {
        try {
            return this.LIZ.o0();
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC84194X2o
    public final String getEventPage() {
        try {
            return this.LIZ.getEventPage();
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return "";
        }
    }

    public C84197X2r(InterfaceC84196X2q interfaceC84196X2q) {
        this.LIZ = interfaceC84196X2q;
    }

    @Override // X.InterfaceC84194X2o
    public final void monitorLogSend(JSONObject jSONObject) {
        try {
            this.LIZ.G(jSONObject.toString());
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
