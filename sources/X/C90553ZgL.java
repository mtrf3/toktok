package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import com.byted.cast.common.Logger;
import com.byted.cast.common.Monitor;
import java.util.Locale;

/* renamed from: X.ZgL, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90553ZgL extends AdvertiseCallback {
    public final /* synthetic */ C90555ZgN LIZ;

    public C90553ZgL(C90555ZgN c90555ZgN) {
        this.LIZ = c90555ZgN;
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int i) {
        Logger.i("BleServer", "onStartFailure");
        C90555ZgN c90555ZgN = this.LIZ;
        c90555ZgN.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendErrorEvent, event: ");
        LIZ.append("Ble_Broadcast_Publis_Failure");
        LIZ.append(", errorCode:");
        LIZ.append(i);
        Logger.i("BleServer", X1D.LIZIZ(LIZ));
        BluetoothAdapter bluetoothAdapter = c90555ZgN.LJI;
        if (bluetoothAdapter == null || c90555ZgN.LIZIZ == null || c90555ZgN.LIZJ == null) {
            Logger.w("BleServer", "sendEvent, data is null");
        } else {
            Monitor.sendCustomEvent("sink", "Ble_Broadcast_Publis_Failure", C16880lQ.LLLZI(Locale.SIMPLIFIED_CHINESE, "deviceName:%s, serviceName:%s, protocols:%s, bleData:%s, errorCode:%s", new Object[]{bluetoothAdapter.getName(), c90555ZgN.LIZIZ.name, c90555ZgN.LJIIL, c90555ZgN.LIZJ.toString(), Integer.valueOf(i)}));
        }
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        Logger.i("BleServer", "onStartSuccess");
        this.LIZ.LIZIZ("Ble_Broadcast_Publis_Success");
    }
}
