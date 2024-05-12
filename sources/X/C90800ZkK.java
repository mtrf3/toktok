package X;

import android.text.TextUtils;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.SourceMonitorUtils;
import com.byted.cast.common.api.IConnectListener;
import com.byted.cast.common.async.ConcurrentSubject;
import com.byted.cast.common.source.ServiceInfo;

/* renamed from: X.ZkK, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90800ZkK implements IConnectListener {
    public final String LIZ;
    public final /* synthetic */ C90801ZkL LIZIZ;

    public C90800ZkK(C90801ZkL c90801ZkL, String str) {
        this.LIZIZ = c90801ZkL;
        this.LIZ = str;
        switch (str.hashCode()) {
            case -1803213502:
                if (!str.equals("ByteLink")) {
                }
                return;
            case 457686803:
                if (!str.equals("BDCloud")) {
                }
                return;
            case 483315961:
                if (!str.equals("ChromeCast")) {
                }
                return;
            case 1954691932:
                if (!str.equals("BDLink")) {
                }
                return;
            default:
                return;
        }
    }

    @Override // com.byted.cast.common.api.IConnectListener
    public final void onConnect(ServiceInfo serviceInfo, int i) {
        String str;
        C90445Zeb c90445Zeb;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("in onConnect, protocol: ");
        LIZ.append(this.LIZ);
        LIZ.append(", serviceInfo:");
        LIZ.append(serviceInfo);
        LIZ.append(", extra:");
        LIZ.append(i);
        String LIZIZ = X1D.LIZIZ(LIZ);
        this.LIZIZ.LIZIZ.d("ByteCastSourceImpl", LIZIZ);
        String str2 = "";
        if (TextUtils.equals(this.LIZ, "ByteLink")) {
            this.LIZIZ.LIZJ.sendByteCastSourceEvent("bytecast_mirror_on_connect_success", "", null, "");
        }
        this.LIZIZ.LIZJ.sendByteCastSourceEvent("bytecast_on_connect_success_protocol_v2", LIZIZ, null, "");
        SourceMonitorUtils sourceMonitor = this.LIZIZ.LIZJ.getSourceMonitor();
        String str3 = this.LIZ;
        if (serviceInfo == null) {
            str = "";
        } else {
            str = serviceInfo.castId;
        }
        sourceMonitor.trackByteCastConnectProtocol(str3, "success", str, 0, String.valueOf(i));
        SourceMonitorUtils sourceMonitorUtils = this.LIZIZ.LIZLLL.getSourceMonitorUtils();
        String str4 = this.LIZ;
        if (serviceInfo != null) {
            str2 = serviceInfo.castId;
        }
        sourceMonitorUtils.trackByteCastConnectProtocol(str4, "success", str2, 0, String.valueOf(i));
        C90801ZkL c90801ZkL = this.LIZIZ;
        ConcurrentSubject<C90429ZeL> concurrentSubject = c90801ZkL.LJJIJ;
        if (concurrentSubject != null) {
            concurrentSubject.notifyObserver(new C90429ZeL(1, serviceInfo, -1, i));
        } else {
            c90801ZkL.LIZIZ.d("ByteCastSourceImpl", "mConnectSubject is null");
        }
        if (TextUtils.equals(this.LIZ, "BDLink") && (c90445Zeb = this.LIZIZ.LJIJI) != null) {
            c90445Zeb.LJI = serviceInfo;
        }
    }

    @Override // com.byted.cast.common.api.IConnectListener
    public final void onDisconnect(ServiceInfo serviceInfo, int i, int i2) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDisconnect, protocol: ");
        LIZ.append(this.LIZ);
        LIZ.append(", serviceInfo:");
        LIZ.append(serviceInfo);
        LIZ.append(",,what:");
        LIZ.append(i);
        LIZ.append(",extra:");
        LIZ.append(i2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        this.LIZIZ.LIZIZ.d("ByteCastSourceImpl", LIZIZ);
        String str2 = "";
        if (TextUtils.equals(this.LIZ, "ByteLink")) {
            this.LIZIZ.LIZJ.sendByteCastSourceEvent("bytecast_mirror_on_disconnect", "", null, "");
            CastMonitor.WifiP2PType = "";
        }
        this.LIZIZ.LIZJ.sendByteCastSourceEvent("bytecast_on_disconnect_protocol_v2", LIZIZ, null, "");
        SourceMonitorUtils sourceMonitor = this.LIZIZ.LIZJ.getSourceMonitor();
        String str3 = this.LIZ;
        if (serviceInfo == null) {
            str = "";
        } else {
            str = serviceInfo.castId;
        }
        sourceMonitor.trackByteCastConnectProtocol(str3, "failure", str, i, String.valueOf(i2));
        SourceMonitorUtils sourceMonitorUtils = this.LIZIZ.LIZLLL.getSourceMonitorUtils();
        String str4 = this.LIZ;
        if (serviceInfo != null) {
            str2 = serviceInfo.castId;
        }
        sourceMonitorUtils.trackByteCastConnectProtocol(str4, "failure", str2, i, String.valueOf(i2));
        C90801ZkL c90801ZkL = this.LIZIZ;
        ConcurrentSubject<C90429ZeL> concurrentSubject = c90801ZkL.LJJIIZI;
        if (concurrentSubject != null) {
            concurrentSubject.notifyObserver(new C90429ZeL(2, serviceInfo, i, i2));
        } else {
            c90801ZkL.LIZIZ.d("ByteCastSourceImpl", "onDisconnect mDisconnectSubject is null");
        }
    }
}
