package X;

import Y.IDRunnableS7S0101000_24;
import Y.IDRunnableS86S0100000_24;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.content.Context;
import android.os.Handler;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.bean.DeviceInfo;
import com.byted.cast.common.ble.BleData;
import com.byted.cast.common.ble.BleUtils;
import com.byted.cast.common.ble.WifiUtils;
import com.byted.cast.common.source.ServiceInfo;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Zex, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90467Zex {
    public ScanCallback LIZJ;
    public BluetoothAdapter LIZLLL;
    public boolean LJ;
    public BluetoothLeScanner LJFF;
    public Context LJI;
    public final ContextManager.CastContext LJIIIZ;
    public final CastMonitor LJIIJ;
    public final CastLogger LJIIJJI;
    public IBrowseListener LJIIL;
    public List<String> LJIILIIL;
    public List<String> LJIILJJIL;
    public final ICastSource LJIIZILJ;
    public final ICastSource LJIJ;
    public final Handler LIZ = new Handler();
    public final int LIZIZ = 3000;
    public volatile boolean LJII = true;
    public volatile boolean LJIIIIZZ = true;
    public final java.util.Map<String, ServiceInfo> LJIILL = new ConcurrentHashMap();
    public final java.util.Map<String, ServiceInfo> LJIILLIIL = new ConcurrentHashMap();

    public final boolean LIZ() {
        boolean z;
        boolean isEnabledBle = BleUtils.isEnabledBle(this.LJIIIZ);
        boolean hasBrowsePermissions = BleUtils.hasBrowsePermissions(this.LJI);
        BluetoothAdapter bluetoothAdapter = this.LIZLLL;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        CastLogger castLogger = this.LJIIJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getGrayConfig, enableBLE: ");
        LIZ.append(isEnabledBle);
        LIZ.append(", hasPermission: ");
        LIZ.append(hasBrowsePermissions);
        LIZ.append(", bluetoothAdapterEnabled: ");
        LIZ.append(z);
        castLogger.d("BleClient", X1D.LIZIZ(LIZ));
        if (isEnabledBle && hasBrowsePermissions && z) {
            return true;
        }
        return false;
    }

    public final void LJI() {
        if (this.LJFF != null) {
            if (this.LJIIIIZZ) {
                LJ("Ble_Start_Browse");
                this.LJIIIIZZ = false;
            }
            LJ("Ble_Start_Scan");
            try {
                this.LJFF.startScan(this.LIZJ);
                this.LIZ.postDelayed(new IDRunnableS86S0100000_24(this, 26), this.LIZIZ);
            } catch (Exception e) {
                this.LJIIJJI.e("BleClient", e.getMessage());
            }
        }
    }

    public final void LJ(String str) {
        boolean z;
        CastLogger castLogger = this.LJIIJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendSwitchEvent, event:");
        LIZ.append(str);
        castLogger.i("BleClient", X1D.LIZIZ(LIZ));
        BluetoothAdapter bluetoothAdapter = this.LIZLLL;
        if (bluetoothAdapter == null || this.LJI == null) {
            this.LJIIJJI.w("BleClient", "bluetoothAdapter or context is null");
            return;
        }
        CastMonitor castMonitor = this.LJIIJ;
        Locale locale = Locale.SIMPLIFIED_CHINESE;
        Object[] objArr = new Object[5];
        boolean z2 = false;
        objArr[0] = bluetoothAdapter.getName();
        objArr[1] = "xxx.xxx.xxx.xxx";
        objArr[2] = BleUtils.getStringIp(WifiUtils.getNetMaskInt(this.LJI));
        List<String> list = this.LJIILIIL;
        if (list != null && list.contains("BDLink")) {
            z = true;
        } else {
            z = false;
        }
        objArr[3] = Boolean.valueOf(z);
        List<String> list2 = this.LJIILJJIL;
        if (list2 != null && list2.contains("ByteLink")) {
            z2 = true;
        }
        objArr[4] = Boolean.valueOf(z2);
        castMonitor.sendCustomEvent("source", str, C16880lQ.LLLZI(locale, "deviceName:%s, localIp:%s, localNetMask:%s, bdlink:%s, bytelink:%s", objArr));
    }

    public final synchronized void LIZIZ(String str, BleData bleData) {
        boolean z;
        if (bleData == null) {
            this.LJIIJJI.w("BleClient", "bleData is null");
            return;
        }
        ServiceInfo LIZJ = LIZJ(str, bleData);
        if (LIZJ != null && !"0.0.0.0".equals(LIZJ.ip) && str != null) {
            if (WifiUtils.isInSameLAN(this.LJI, bleData.getIp(), bleData.getNetMask())) {
                this.LJIIJJI.w("BleClient", "is in the same lan");
                ((ConcurrentHashMap) this.LJIILLIIL).put(str, LIZJ);
                Dispatcher.getInstance().runOnMainThread(new IDRunnableS7S0101000_24(7, this, 2));
                z = true;
            } else {
                z = false;
            }
            ICastSource iCastSource = this.LJIIZILJ;
            if (iCastSource != null) {
                DeviceInfo sinkDeviceInfo = iCastSource.getSinkDeviceInfo(LIZJ.ip, LIZJ.port);
                CastLogger castLogger = this.LJIIJJI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("generateServiceInfo deviceInfo: ");
                LIZ.append(sinkDeviceInfo);
                castLogger.i("BleClient", X1D.LIZIZ(LIZ));
                if (sinkDeviceInfo != null) {
                    LIZJ.data = sinkDeviceInfo.data;
                }
                LIZJ.appendBdlinkDeviceInfo(sinkDeviceInfo);
                ((ConcurrentHashMap) this.LJIILL).put(str, LIZJ);
                Dispatcher.getInstance().runOnMainThread(new IDRunnableS7S0101000_24(5, this, 2));
            } else {
                if (z) {
                }
                return;
            }
            if (this.LJII) {
                LIZLLL(LIZJ, "Ble_Browse_Success");
                this.LJII = false;
            }
            LIZLLL(LIZJ, "Ble_Scan_Found");
            return;
        }
        this.LJIIJJI.w("BleClient", "serviceInfo is null or ip or name is invalid.");
    }

    public final ServiceInfo LIZJ(String str, BleData bleData) {
        if (bleData == null) {
            return null;
        }
        ServiceInfo serviceInfo = new ServiceInfo(str, BleUtils.getStringIp(bleData.getIp()), bleData.getPort(), "", bleData.getPortMirror(), -1, -1, -1);
        List<String> list = this.LJIILJJIL;
        if ((list != null && !list.contains("ByteLink")) || bleData.getPortMirror() <= 0) {
            serviceInfo.bytelinkEnabled = false;
        }
        List<String> list2 = this.LJIILIIL;
        if ((list2 != null && !list2.contains("BDLink")) || bleData.getPort() <= 0) {
            serviceInfo.bdlinkEnabled = false;
        }
        return serviceInfo;
    }

    public final void LIZLLL(ServiceInfo serviceInfo, String str) {
        boolean z;
        CastLogger castLogger = this.LJIIJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendScanEvent, event:");
        LIZ.append(str);
        castLogger.i("BleClient", X1D.LIZIZ(LIZ));
        BluetoothAdapter bluetoothAdapter = this.LIZLLL;
        if (bluetoothAdapter == null || this.LJI == null) {
            this.LJIIJJI.w("BleClient", "bluetoothAdapter or serviceInfo or context is null");
            return;
        }
        CastMonitor castMonitor = this.LJIIJ;
        Locale locale = Locale.SIMPLIFIED_CHINESE;
        Object[] objArr = new Object[6];
        boolean z2 = false;
        objArr[0] = bluetoothAdapter.getName();
        objArr[1] = serviceInfo.toString();
        objArr[2] = "xxx.xxx.xxx.xxx";
        objArr[3] = BleUtils.getStringIp(WifiUtils.getNetMaskInt(this.LJI));
        List<String> list = this.LJIILIIL;
        if (list != null && list.contains("BDLink")) {
            z = true;
        } else {
            z = false;
        }
        objArr[4] = Boolean.valueOf(z);
        List<String> list2 = this.LJIILJJIL;
        if (list2 != null && list2.contains("ByteLink")) {
            z2 = true;
        }
        objArr[5] = Boolean.valueOf(z2);
        castMonitor.sendCustomEvent("source", str, C16880lQ.LLLZI(locale, "deviceName:%s, serviceInfo:%s, localIp:%s, localNetMask:%s, bdlink:%s, bytelink:%s", objArr));
    }

    public final void LJFF(int i, Object... objArr) {
        if (i != 10011) {
            return;
        }
        Object obj = objArr[0];
        if (!(obj instanceof List)) {
            return;
        }
        Object obj2 = objArr[1];
        if (!(obj2 instanceof List)) {
            return;
        }
        this.LJIILIIL = (List) obj;
        this.LJIILJJIL = (List) obj2;
        CastLogger castLogger = this.LJIIJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OPTION_PROTOCOLS_ENABLED, link:");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", mirror:");
        LIZ.append(this.LJIILJJIL);
        castLogger.i("BleClient", X1D.LIZIZ(LIZ));
    }

    public C90467Zex(ContextManager.CastContext castContext, ICastSource iCastSource, ICastSource iCastSource2) {
        this.LJIIIZ = castContext;
        this.LJIIJ = ContextManager.getMonitor(castContext);
        this.LJIIJJI = ContextManager.getLogger(castContext);
        this.LJIIZILJ = iCastSource;
        this.LJIJ = iCastSource2;
    }
}
