package X;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothProfile;

/* renamed from: X.But, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30303But implements BluetoothProfile.ServiceListener {
    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        BluetoothA2dp bluetoothA2dp;
        if (i == 2) {
            if (bluetoothProfile instanceof BluetoothA2dp) {
                bluetoothA2dp = (BluetoothA2dp) bluetoothProfile;
            } else {
                bluetoothA2dp = null;
            }
            C30306Buw.LIZ = bluetoothA2dp;
        }
    }
}
