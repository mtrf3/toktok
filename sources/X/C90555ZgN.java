package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import com.byted.cast.common.Logger;
import com.byted.cast.common.Monitor;
import com.byted.cast.common.api.ICastSink;
import com.byted.cast.common.ble.BleData;
import com.byted.cast.common.ble.BleUtils;
import com.byted.cast.common.ble.WifiUtils;
import com.byted.cast.common.sink.ServiceInfo;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ZgN, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90555ZgN {
    public UUID LIZ;
    public ServiceInfo LIZIZ;
    public BleData LIZJ;
    public BluetoothLeAdvertiser LIZLLL;
    public BluetoothGattServer LJ;
    public BluetoothManager LJFF;
    public BluetoothAdapter LJI;
    public Context LJII;
    public String LJIIIIZZ;
    public List<String> LJIIIZ;
    public final ICastSink LJIIJ;
    public final ICastSink LJIIJJI;
    public String LJIIL;
    public boolean LJIILIIL;
    public AdvertiseCallback LJIILJJIL;
    public BluetoothGattServerCallback LJIILL;

    public final synchronized void LJ() {
        Logger.i("BleServer", "stopPublish");
        if (!LIZ()) {
            Logger.w("BleServer", "mBleEnabled is false or does not state permissions");
            return;
        }
        LIZIZ("Ble_Stop_Publish_Broadcast");
        BluetoothLeAdvertiser bluetoothLeAdvertiser = this.LIZLLL;
        if (bluetoothLeAdvertiser != null) {
            bluetoothLeAdvertiser.stopAdvertising(this.LJIILJJIL);
        }
        BluetoothGattServer bluetoothGattServer = this.LJ;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.close();
        }
        this.LJIILIIL = false;
    }

    public final void LIZJ() {
        ServiceInfo serviceInfo;
        AdvertiseSettings build = new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(3).setConnectable(true).build();
        ICastSink iCastSink = this.LJIIJ;
        if (iCastSink != null) {
            serviceInfo = iCastSink.getServiceInfo();
        } else {
            serviceInfo = null;
        }
        ServiceInfo serviceInfo2 = new ServiceInfo();
        this.LJIIL = "";
        if (serviceInfo != null && ((CopyOnWriteArrayList) this.LJIIIZ).contains("BDLink")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJIIL);
            LIZ.append("BDLink ");
            this.LJIIL = X1D.LIZIZ(LIZ);
            serviceInfo2.ip = serviceInfo.ip;
            serviceInfo2.port = serviceInfo.port;
            serviceInfo2.data = serviceInfo.data;
            serviceInfo2.bdlinkVersion = serviceInfo.bdlinkVersion;
        } else if (this.LJIIJJI != null && ((CopyOnWriteArrayList) this.LJIIIZ).contains("ByteLink") && serviceInfo != null) {
            serviceInfo2.ip = serviceInfo.ip;
        }
        if (this.LJIIJJI != null && ((CopyOnWriteArrayList) this.LJIIIZ).contains("ByteLink")) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJIIL);
            LIZ2.append("ByteLink ");
            this.LJIIL = X1D.LIZIZ(LIZ2);
            ServiceInfo serviceInfo3 = this.LJIIJJI.getServiceInfo();
            String str = serviceInfo3.name;
            if (str == null) {
                str = this.LJIIIIZZ;
            }
            serviceInfo2.name = str;
            serviceInfo2.portMirror = serviceInfo3.portMirror;
            serviceInfo2.width = serviceInfo3.width;
            serviceInfo2.height = serviceInfo3.height;
            serviceInfo2.fps = serviceInfo3.fps;
            serviceInfo2.features = serviceInfo3.features;
            serviceInfo2.deviceID = serviceInfo3.deviceID;
            serviceInfo2.bytelinkVersion = serviceInfo3.bytelinkVersion;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("startServer, bytelinkServiceInfo:");
            LIZ3.append(serviceInfo3);
            LIZ3.append(", combinedServiceInfo:");
            LIZ3.append(serviceInfo2);
            Logger.i("BleServer", X1D.LIZIZ(LIZ3));
        } else {
            serviceInfo2.name = this.LJIIIIZZ;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("startServer, bdlinkServiceInfo:");
        LIZ4.append(serviceInfo);
        LIZ4.append(", combinedServiceInfo:");
        LIZ4.append(serviceInfo2);
        Logger.i("BleServer", X1D.LIZIZ(LIZ4));
        this.LIZIZ = serviceInfo2;
        int intIp = BleUtils.getIntIp(serviceInfo2.ip);
        int netMaskInt = WifiUtils.getNetMaskInt(this.LJII);
        ServiceInfo serviceInfo4 = this.LIZIZ;
        this.LIZJ = new BleData(intIp, netMaskInt, serviceInfo4.port, serviceInfo4.portMirror);
        AdvertiseData build2 = new AdvertiseData.Builder().addManufacturerData(3, BleUtils.stringToByte(this.LIZIZ.name)).build();
        AdvertiseData build3 = new AdvertiseData.Builder().addManufacturerData(2, BleUtils.getSentData(this.LIZJ)).build();
        LIZIZ("Ble_Publish_Broadcast");
        BluetoothAdapter bluetoothAdapter = this.LJI;
        if (bluetoothAdapter != null) {
            this.LIZLLL = bluetoothAdapter.getBluetoothLeAdvertiser();
        }
        BluetoothLeAdvertiser bluetoothLeAdvertiser = this.LIZLLL;
        if (bluetoothLeAdvertiser == null) {
            Logger.w("BleServer", "mBluetoothLeAdvertiser is null");
            return;
        }
        bluetoothLeAdvertiser.startAdvertising(build, build2, build3, this.LJIILJJIL);
        BluetoothGattService bluetoothGattService = new BluetoothGattService(this.LIZ, 0);
        BluetoothManager bluetoothManager = this.LJFF;
        if (bluetoothManager != null) {
            this.LJ = bluetoothManager.openGattServer(this.LJII, this.LJIILL);
        }
        BluetoothGattServer bluetoothGattServer = this.LJ;
        if (bluetoothGattServer == null) {
            Logger.w("BleServer", "mBluetoothGattServer is null");
        } else {
            bluetoothGattServer.addService(bluetoothGattService);
            BleUtils.setBlePublish(true);
        }
    }

    public final boolean LIZ() {
        boolean isEnabledBle = BleUtils.isEnabledBle();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getGrayConfig, enableBLE: ");
        LIZ.append(isEnabledBle);
        Logger.d("BleServer", X1D.LIZIZ(LIZ));
        if (isEnabledBle && BleUtils.hasPublishPermissions(this.LJII)) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendEvent, event:");
        LIZ.append(str);
        Logger.i("BleServer", X1D.LIZIZ(LIZ));
        BluetoothAdapter bluetoothAdapter = this.LJI;
        if (bluetoothAdapter == null || this.LIZIZ == null || this.LIZJ == null) {
            Logger.w("BleServer", "sendEvent, data is null");
        } else {
            Monitor.sendCustomEvent("sink", str, C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "deviceName:%s, serviceName:%s, protocols:%s, bleData:%s", new Object[]{bluetoothAdapter.getName(), this.LIZIZ.name, this.LJIIL, this.LIZJ.toString()}));
        }
    }

    public C90555ZgN(ICastSink iCastSink, ICastSink iCastSink2) {
        this.LJIIJ = iCastSink;
        this.LJIIJJI = iCastSink2;
    }

    public final synchronized void LIZLLL(String str, List<String> list) {
        if (!LIZ()) {
            Logger.w("BleServer", "mBleEnabled is false or does not state permissions");
            return;
        }
        if (this.LJIILIIL) {
            Logger.w("BleServer", "has published");
            return;
        }
        if (!this.LJII.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            Logger.w("BleServer", "does not support ble");
            return;
        }
        Context context = this.LJII;
        Logger.i("BleServer", "isMultipleAdvertisementSupported");
        BluetoothManager bluetoothManager = (BluetoothManager) C16880lQ.LLILL(context, "bluetooth");
        this.LJFF = bluetoothManager;
        if (bluetoothManager != null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.LJI = defaultAdapter;
            if (this.LJFF != null && defaultAdapter != null && defaultAdapter.isEnabled() && this.LJI.isMultipleAdvertisementSupported()) {
                this.LJIIIIZZ = str;
                if (this.LJIIIZ == null) {
                    this.LJIIIZ = new CopyOnWriteArrayList();
                }
                ((CopyOnWriteArrayList) this.LJIIIZ).clear();
                ((CopyOnWriteArrayList) this.LJIIIZ).addAll(list);
                LIZJ();
                this.LJIILIIL = true;
                return;
            }
        }
        Logger.w("BleServer", "not init success");
    }
}
