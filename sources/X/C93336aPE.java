package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.pitaya.bdcomponentimpl.network.OKHttpWebSocketImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.aPE, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93336aPE extends AbstractC38911fr {
    public final /* synthetic */ OKHttpWebSocketImpl LJLILLLLZI;

    public C93336aPE(OKHttpWebSocketImpl oKHttpWebSocketImpl) {
        this.LJLILLLLZI = oKHttpWebSocketImpl;
    }

    @Override // X.AbstractC38911fr
    public final void LJJIJIIJI(PXH pxh, String str) {
        this.LJLILLLLZI.getStateCallback();
    }

    @Override // X.AbstractC38911fr
    public final void LJJIJIIJIL(PXH pxh, C64537PUn c64537PUn) {
        byte[] byteArray = c64537PUn.toByteArray();
        o.LJFF(byteArray, "bytes.toByteArray()");
        LJJIJIIJI(pxh, new String(byteArray, PVC.LIZ));
    }

    @Override // X.AbstractC38911fr
    public final void LJJIJIL(PXH webSocket, C64598PWw response) {
        o.LJIIJ(webSocket, "webSocket");
        o.LJIIJ(response, "response");
        OKHttpWebSocketImpl oKHttpWebSocketImpl = this.LJLILLLLZI;
        oKHttpWebSocketImpl.socket = webSocket;
        Npth.registerCrashCallback(oKHttpWebSocketImpl, CrashType.ALL);
        this.LJLILLLLZI.getStateCallback();
    }

    @Override // X.AbstractC38911fr
    public final void LJJ(PXH webSocket, int i, String reason) {
        o.LJIIJ(webSocket, "webSocket");
        o.LJIIJ(reason, "reason");
        this.LJLILLLLZI.getStateCallback();
    }

    @Override // X.AbstractC38911fr
    public final void LJJIJ(PXX webSocket, Throwable t, C64598PWw c64598PWw) {
        o.LJIIJ(webSocket, "webSocket");
        o.LJIIJ(t, "t");
        this.LJLILLLLZI.getStateCallback();
    }
}
