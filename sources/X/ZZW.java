package X;

import com.byted.cast.common.Logger;
import com.byted.cast.common.api.CodecType;
import com.byted.cast.common.api.IMirroListener;
import com.byted.cast.common.sink.ClientInfo;
import com.byted.cast.common.sink.Statistics;
import com.byted.cast.common.source.ServiceInfo;
import java.util.HashMap;

/* loaded from: classes29.dex */
public final /* synthetic */ class ZZW {
    public static void LIZ(IMirroListener iMirroListener, String str, CodecType.ACODEC_ID acodec_id, byte[] bArr, int i, int i2, int i3, int i4, long j) {
    }

    public static void LIZJ(IMirroListener iMirroListener, int i, ClientInfo clientInfo) {
    }

    public static void LIZLLL(IMirroListener iMirroListener, int i, ServiceInfo serviceInfo) {
    }

    public static void LJ(IMirroListener iMirroListener, int i, ClientInfo clientInfo) {
    }

    public static void LJFF(IMirroListener iMirroListener, int i, ServiceInfo serviceInfo) {
    }

    public static void LJI(IMirroListener iMirroListener, int i, int i2, int i3) {
    }

    public static void LJII(IMirroListener iMirroListener, int i) {
    }

    public static void LJIIIIZZ(IMirroListener iMirroListener, int i) {
    }

    public static void LJIIIZ(IMirroListener iMirroListener, String str, Long l, HashMap hashMap) {
    }

    public static void LJIILIIL(IMirroListener iMirroListener, String str, CodecType.VCODEC_ID vcodec_id, byte[] bArr, int i, int i2, long j) {
    }

    public static boolean LJIIL(IMirroListener iMirroListener) {
        Logger.d("onStartMirrorAuthorization");
        return true;
    }

    public static void LJIIJ(IMirroListener iMirroListener, Statistics statistics) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStatistics:");
        LIZ.append(statistics.nx);
        Logger.d(X1D.LIZIZ(LIZ));
    }

    public static void LJIIJJI(IMirroListener iMirroListener, com.byted.cast.common.source.Statistics statistics) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStatistics:");
        LIZ.append(statistics.nx);
        Logger.d(X1D.LIZIZ(LIZ));
    }

    public static void LIZIZ(IMirroListener iMirroListener, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on authSDK id:");
        LIZ.append(i);
        LIZ.append(",status:");
        LIZ.append(i2);
        Logger.d("ServerListener", X1D.LIZIZ(LIZ));
    }

    public static void LJIILJJIL(IMirroListener iMirroListener, String str, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVolume:");
        LIZ.append(str);
        LIZ.append(i);
        Logger.d(X1D.LIZIZ(LIZ));
    }
}
