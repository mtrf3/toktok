package X;

import com.byted.cast.common.CastLogger;
import com.byted.cast.common.api.IConnectListener;
import com.byted.cast.common.source.ServiceInfo;
import com.ss.chromecast.source.impl.ChromeCastSourceWrapper;

/* renamed from: X.Zjz, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90779Zjz implements InterfaceC90502ZfW {
    public final /* synthetic */ IConnectListener LIZ;
    public final /* synthetic */ ChromeCastSourceWrapper LIZIZ;

    public C90779Zjz(ChromeCastSourceWrapper chromeCastSourceWrapper, IConnectListener iConnectListener) {
        this.LIZIZ = chromeCastSourceWrapper;
        this.LIZ = iConnectListener;
    }

    public final void LIZ(ZY4 zy4, int i, int i2) {
        ServiceInfo serviceInfo = new ServiceInfo();
        if (zy4 != null) {
            serviceInfo.castId = zy4.LIZJ;
            serviceInfo.name = zy4.LIZLLL;
            serviceInfo.port = -1;
            serviceInfo.portMirror = -1;
            serviceInfo.protocols = "ChromeCast";
            serviceInfo.types = "ChromeCast";
        }
        CastLogger castLogger = this.LIZIZ.LJII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChromeCast onDisconnect serviceInfo:");
        LIZ.append(serviceInfo);
        LIZ.append(",what:");
        LIZ.append(i);
        LIZ.append(",extra:");
        LIZ.append(i2);
        castLogger.d("ChromeCastSourceWrapper", X1D.LIZIZ(LIZ));
        this.LIZ.onDisconnect(serviceInfo, i, i2);
    }
}
