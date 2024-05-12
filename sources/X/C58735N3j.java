package X;

import com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler;
import com.ss.android.ugc.aweme.qrcode.view.BridgeScanHandlerImpl;

/* renamed from: X.N3j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58735N3j implements InterfaceC58734N3i {
    public final /* synthetic */ InterfaceC58736N3k LIZ;

    @Override // X.InterfaceC58734N3i
    public final String LIZ() {
        return "";
    }

    public C58735N3j(InterfaceC58736N3k interfaceC58736N3k) {
        this.LIZ = interfaceC58736N3k;
    }

    @Override // X.InterfaceC58734N3i
    public final boolean LIZIZ(int i, String str) {
        IBridgeScanHandler LIZJ = BridgeScanHandlerImpl.LIZJ();
        if (LIZJ != null) {
            LIZJ.LIZ(this);
        }
        InterfaceC58736N3k interfaceC58736N3k = this.LIZ;
        if (str == null) {
            str = "";
        }
        interfaceC58736N3k.onSuccess(str);
        return true;
    }
}
