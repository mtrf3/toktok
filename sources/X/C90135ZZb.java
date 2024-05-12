package X;

import com.byted.cast.common.Logger;
import com.byted.cast.common.api.IServerListener;
import com.byted.cast.common.sink.CastInfo;
import com.byted.cast.common.sink.ClientInfo;
import com.byted.cast.common.sink.ServerInfo;
import com.byted.cast.common.sink.Statistics;

/* renamed from: X.ZZb, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final /* synthetic */ class C90135ZZb {
    public static void LIZ(IServerListener iServerListener, byte[] bArr, int i, int i2, int i3, int i4, long j) {
    }

    public static void LIZJ(IServerListener iServerListener, int i, CastInfo castInfo) {
    }

    public static void LJFF(IServerListener iServerListener, int i, String str, String str2) {
    }

    public static void LJI(IServerListener iServerListener, int i, String str, String str2) {
    }

    public static void LJII(IServerListener iServerListener, int i) {
    }

    public static void LJIIIIZZ(IServerListener iServerListener, int i, ServerInfo serverInfo) {
    }

    public static boolean LJIIIZ(IServerListener iServerListener) {
        Logger.d("onStartMirrorAuthorization");
        return true;
    }

    public static void LJIIJ(IServerListener iServerListener, int i) {
        Logger.d("onStartRecorder");
    }

    public static void LJIIJJI(IServerListener iServerListener, Statistics statistics) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStatistics:");
        LIZ.append(statistics.nx);
        Logger.d(X1D.LIZIZ(LIZ));
    }

    public static void LJIIL(IServerListener iServerListener, int i) {
        Logger.d("onStopRecorder");
    }

    public static void LIZIZ(IServerListener iServerListener, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on authSDK id:");
        LIZ.append(i);
        LIZ.append(",status:");
        LIZ.append(i2);
        Logger.d("ServerListener", X1D.LIZIZ(LIZ));
    }

    public static void LIZLLL(IServerListener iServerListener, int i, ClientInfo clientInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on connect id:");
        LIZ.append(i);
        LIZ.append(",info:");
        LIZ.append(clientInfo);
        Logger.d("ServerListener", X1D.LIZIZ(LIZ));
    }

    public static void LJ(IServerListener iServerListener, int i, ClientInfo clientInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on disconnect id:");
        LIZ.append(i);
        LIZ.append(",info:");
        LIZ.append(clientInfo);
        Logger.d("ServerListener", X1D.LIZIZ(LIZ));
    }
}
