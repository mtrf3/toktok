package X;

import Y.IDRunnableS1S1200000_24;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.ble.BleUtils;
import com.byted.cast.common.ble.WifiUtils;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Zew, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90466Zew extends ScanCallback {
    public final /* synthetic */ C90467Zex LIZ;

    public C90466Zew(C90467Zex c90467Zex) {
        this.LIZ = c90467Zex;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i) {
        boolean z;
        super.onScanFailed(i);
        C90467Zex c90467Zex = this.LIZ;
        CastLogger castLogger = c90467Zex.LJIIJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendErrorEvent, errorCode:");
        LIZ.append(i);
        LIZ.append(", event:");
        LIZ.append("Ble_Scan_Failure");
        castLogger.i("BleClient", X1D.LIZIZ(LIZ));
        BluetoothAdapter bluetoothAdapter = c90467Zex.LIZLLL;
        if (bluetoothAdapter == null || c90467Zex.LJI == null) {
            c90467Zex.LJIIJJI.w("BleClient", "bluetoothAdapter or context is null");
            return;
        }
        CastMonitor castMonitor = c90467Zex.LJIIJ;
        Locale locale = Locale.SIMPLIFIED_CHINESE;
        Object[] objArr = new Object[6];
        boolean z2 = false;
        objArr[0] = bluetoothAdapter.getName();
        objArr[1] = String.valueOf(i);
        objArr[2] = "xxx.xxx.xxx.xxx";
        objArr[3] = BleUtils.getStringIp(WifiUtils.getNetMaskInt(c90467Zex.LJI));
        List<String> list = c90467Zex.LJIILIIL;
        if (list != null && list.contains("BDLink")) {
            z = true;
        } else {
            z = false;
        }
        objArr[4] = Boolean.valueOf(z);
        List<String> list2 = c90467Zex.LJIILJJIL;
        if (list2 != null && list2.contains("ByteLink")) {
            z2 = true;
        }
        objArr[5] = Boolean.valueOf(z2);
        castMonitor.sendCustomEvent("source", "Ble_Scan_Failure", C16880lQ.LLLZI(locale, "deviceName:%s, errorCode:%s, localIp:%s, localNetMask:%s, bdlink:%s, bytelink:%s", objArr));
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        if (scanResult == null || scanResult.getScanRecord() == null) {
            this.LIZ.LJIIJJI.w("BleClient", "result or scan record is null");
            return;
        }
        byte[] manufacturerSpecificData = scanResult.getScanRecord().getManufacturerSpecificData(2);
        Dispatcher.getInstance().enqueue(new IDRunnableS1S1200000_24(this, BleUtils.byteToString(scanResult.getScanRecord().getManufacturerSpecificData(3)), BleUtils.getReceivedData(manufacturerSpecificData), 2));
    }
}
