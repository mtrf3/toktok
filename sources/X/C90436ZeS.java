package X;

import Y.IDRunnableS86S0100000_24;
import android.media.projection.MediaProjection;
import android.net.wifi.p2p.WifiP2pDevice;
import android.text.TextUtils;
import android.view.Surface;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.NetworkMonitor;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.IServerListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.wifidirect.WiFiP2PHelper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ZeS, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90436ZeS {
    public C90445Zeb LIZ;
    public ICastSource LIZIZ;
    public ICastSource LIZJ;
    public ICastSource LIZLLL;
    public C90499ZfT LJ;
    public CastLogger LJFF;
    public CastMonitor LJI;
    public TeaEventTrack LJII;
    public MirrorInfo LJIIIIZZ;
    public IMirrorListener LJIIIZ;
    public C90800ZkK LJIIJ;
    public int LJIIJJI = 1;
    public IServerListener LJIIL;

    public final void LJIIJ() {
        ICastSource iCastSource = this.LIZJ;
        if (iCastSource != null) {
            iCastSource.startRecorder();
        }
        ICastSource iCastSource2 = this.LIZIZ;
        if (iCastSource2 != null) {
            iCastSource2.startRecorder();
        }
    }

    public final void LJIIL() {
        ICastSource iCastSource = this.LIZJ;
        if (iCastSource != null) {
            iCastSource.stopRecorder();
        }
        ICastSource iCastSource2 = this.LIZIZ;
        if (iCastSource2 != null) {
            iCastSource2.stopRecorder();
        }
    }

    public static void LIZLLL(C90436ZeS c90436ZeS) {
        C90445Zeb c90445Zeb = c90436ZeS.LIZ;
        ServiceInfo serviceInfo = c90436ZeS.LJIIIIZZ.getServiceInfo();
        c90445Zeb.getClass();
        WifiP2pDevice wifiP2pDevice = new WifiP2pDevice();
        wifiP2pDevice.deviceAddress = serviceInfo.ip;
        if (!TextUtils.isEmpty(serviceInfo.name)) {
            wifiP2pDevice.deviceName = serviceInfo.name;
        }
        List<C90815ZkZ> list = c90445Zeb.LIZLLL;
        if (list != null && ((CopyOnWriteArrayList) list).size() != 0) {
            Iterator it = ((CopyOnWriteArrayList) c90445Zeb.LIZLLL).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C90444Zea c90444Zea = (C90444Zea) it.next();
                if (TextUtils.equals(c90444Zea.LIZ, serviceInfo.ip) && TextUtils.equals(c90444Zea.LIZIZ, serviceInfo.name)) {
                    wifiP2pDevice = null;
                    break;
                }
            }
        }
        CastLogger castLogger = c90436ZeS.LJFF;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("select wifi-p2p device:");
        LIZ.append(wifiP2pDevice);
        castLogger.d("MirrorController", X1D.LIZIZ(LIZ));
        if (wifiP2pDevice != null) {
            c90436ZeS.LJ.LIZ.connect(wifiP2pDevice);
            CastMonitor castMonitor = c90436ZeS.LJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("connect by wifi-p2p target device:");
            LIZ2.append(wifiP2pDevice);
            castMonitor.sendSourceEvent("wifi_p2p_connect", X1D.LIZIZ(LIZ2));
        }
    }

    public final void LIZIZ(Surface surface) {
        ICastSource iCastSource = this.LIZIZ;
        if (iCastSource != null) {
            iCastSource.addOutputSurface(surface);
        }
        ICastSource iCastSource2 = this.LIZLLL;
        if (iCastSource2 != null) {
            iCastSource2.addOutputSurface(surface);
        }
    }

    public final void LIZJ(int i) {
        ICastSource iCastSource = this.LIZIZ;
        if (iCastSource != null) {
            iCastSource.changeCameraID(i);
        }
        ICastSource iCastSource2 = this.LIZLLL;
        if (iCastSource2 != null) {
            iCastSource2.changeCameraID(i);
        }
    }

    public final void LJ(Surface surface) {
        ICastSource iCastSource = this.LIZIZ;
        if (iCastSource != null) {
            iCastSource.removeOutputSurface(surface);
        }
        ICastSource iCastSource2 = this.LIZLLL;
        if (iCastSource2 != null) {
            iCastSource2.removeOutputSurface(surface);
        }
    }

    public final void LJFF(ISurfaceListener iSurfaceListener) {
        ICastSource iCastSource = this.LIZIZ;
        if (iCastSource != null) {
            iCastSource.setInputSurfaceCallback(iSurfaceListener);
        }
        ICastSource iCastSource2 = this.LIZLLL;
        if (iCastSource2 != null) {
            iCastSource2.setInputSurfaceCallback(iSurfaceListener);
        }
    }

    public final void LJI(MediaProjection mediaProjection) {
        ICastSource iCastSource = this.LIZIZ;
        if (iCastSource != null) {
            iCastSource.setMediaProjection(mediaProjection);
        }
        ICastSource iCastSource2 = this.LIZJ;
        if (iCastSource2 != null) {
            iCastSource2.setMediaProjection(mediaProjection);
        }
        ICastSource iCastSource3 = this.LIZLLL;
        if (iCastSource3 != null) {
            iCastSource3.setMediaProjection(mediaProjection);
        }
    }

    public final void LJII(MirrorInfo mirrorInfo) {
        this.LJIIIIZZ = mirrorInfo;
        ICastSource iCastSource = this.LIZJ;
        if (iCastSource != null) {
            iCastSource.setMirrorInfo(mirrorInfo);
        }
        ICastSource iCastSource2 = this.LIZLLL;
        if (iCastSource2 != null) {
            iCastSource2.setMirrorInfo(mirrorInfo);
        }
    }

    public final void LJIIIIZZ(IMirrorListener iMirrorListener) {
        this.LJIIIZ = iMirrorListener;
        ICastSource iCastSource = this.LIZLLL;
        if (iCastSource != null) {
            iCastSource.setMirrorListener(iMirrorListener);
        }
        ICastSource iCastSource2 = this.LIZIZ;
        if (iCastSource2 != null) {
            iCastSource2.setMirrorListener(new C90902Zly(this));
        }
    }

    public final void LJIIIZ(String str) {
        CastLogger castLogger = this.LJFF;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startMirror mirrorInfo:");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", gitInfo:");
        LIZ.append("1.1086e87");
        castLogger.i("MirrorController", X1D.LIZIZ(LIZ));
        if (TextUtils.equals("UsbSource", str)) {
            ICastSource iCastSource = this.LIZLLL;
            if (iCastSource != null) {
                iCastSource.startMirror(this.LJIIIIZZ);
                return;
            }
            return;
        }
        MirrorInfo mirrorInfo = this.LJIIIIZZ;
        if (mirrorInfo == null || mirrorInfo.getServiceInfo() == null) {
            return;
        }
        ServiceInfo serviceInfo = this.LJIIIIZZ.getServiceInfo();
        if (serviceInfo != null && TextUtils.isEmpty(serviceInfo.connectID)) {
            CastMonitor castMonitor = this.LJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("byteCast_");
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("");
            LIZ3.append(serviceInfo.ip);
            LIZ3.append(System.currentTimeMillis());
            LIZ2.append(com.byted.cast.common.MD5.hexdigest(X1D.LIZIZ(LIZ3)));
            castMonitor.sourceConnectID = X1D.LIZIZ(LIZ2);
            serviceInfo.connectID = this.LJI.sourceConnectID;
        }
        CastLogger castLogger2 = this.LJFF;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("initConnectID: ");
        LIZ4.append(this.LJI.sourceConnectID);
        castLogger2.d("MirrorController", X1D.LIZIZ(LIZ4));
        TeaEventTrack teaEventTrack = this.LJII;
        if (teaEventTrack != null) {
            teaEventTrack.trackSourceMirrorEvent(str, "start");
        }
        if (TextUtils.equals("VastCast", str)) {
            ICastSource iCastSource2 = this.LIZJ;
            if (iCastSource2 != null) {
                iCastSource2.startRecorder();
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(this.LJIIIIZZ.getServiceInfo().ip)) {
            NetworkMonitor.setConnectionIpAdd(this.LJIIIIZZ.getServiceInfo().ip);
        }
        this.LJI.sendByteCastSourceEvent("bytecast_start_mirror", "", this.LJIIIIZZ.toString(), "");
        if (this.LJIIIIZZ.getServiceInfo().protocols.contains("ByteLink") || this.LJIIIIZZ.getServiceInfo().protocols.contains("RtcLink")) {
            this.LIZIZ.startMirror(this.LJIIIIZZ);
        } else if (this.LJIIIIZZ.getServiceInfo().protocols.contains("WIFIP2P") && this.LJ != null) {
            Dispatcher.getInstance().enqueue(new IDRunnableS86S0100000_24(this, 20));
        } else {
            CastLogger castLogger3 = this.LJFF;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("startMirror invalid protocol type:");
            LIZ5.append(this.LJIIIIZZ.getServiceInfo());
            castLogger3.e("MirrorController", X1D.LIZIZ(LIZ5));
        }
        if (Dispatcher.getInstance().taskIsAlive("ByteLink")) {
            return;
        }
        Dispatcher.getInstance().schedule("ByteLink", new RunnableC90194ZaY(1, this), this.LJIIJJI);
    }

    public final void LJIIJJI(String str) {
        WiFiP2PHelper wiFiP2PHelper;
        this.LJFF.d("MirrorController", "stopMirror");
        if (TextUtils.equals(str, "VastCast")) {
            ICastSource iCastSource = this.LIZJ;
            if (iCastSource != null) {
                iCastSource.stopRecorder();
                return;
            }
            return;
        }
        if (TextUtils.equals("UsbSource", str)) {
            ICastSource iCastSource2 = this.LIZLLL;
            if (iCastSource2 != null) {
                iCastSource2.stopMirror();
                return;
            }
            return;
        }
        this.LJI.sendByteCastSourceEvent("bytecast_stop_mirror", "", null, "");
        this.LIZIZ.stopMirror();
        C90499ZfT c90499ZfT = this.LJ;
        if (c90499ZfT != null && (wiFiP2PHelper = c90499ZfT.LIZ) != null) {
            wiFiP2PHelper.disConnect();
        }
        if (Dispatcher.getInstance().taskIsAlive("ByteLink")) {
            Dispatcher.getInstance().shutdownScheduleService("ByteLink");
        }
    }
}
