package X;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import com.byted.cast.common.Logger;

/* renamed from: X.ZgM, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90554ZgM extends BluetoothGattServerCallback {
    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onMtuChanged(BluetoothDevice bluetoothDevice, int i) {
        Logger.i("BleServer", "onMtuChanged");
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onNotificationSent(BluetoothDevice bluetoothDevice, int i) {
        Logger.i("BleServer", "onNotificationSent");
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onServiceAdded(int i, BluetoothGattService bluetoothGattService) {
        Logger.i("BleServer", "onServiceAdded");
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        Logger.i("BleServer", "onConnectionStateChange");
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onExecuteWrite(BluetoothDevice bluetoothDevice, int i, boolean z) {
        Logger.i("BleServer", "onExecuteWrite");
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        Logger.i("BleServer", "onCharacteristicReadRequest");
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDescriptorReadRequest: ");
        LIZ.append(bluetoothDevice.getName());
        Logger.i("BleServer", X1D.LIZIZ(LIZ));
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCharacteristicWriteRequest: ");
        LIZ.append(bluetoothDevice.getName());
        Logger.i("BleServer", X1D.LIZIZ(LIZ));
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        Logger.i("BleServer", "onDescriptorWriteRequest");
    }
}
