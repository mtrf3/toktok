package X;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.media.AudioManager;
import java.util.List;

/* renamed from: X.Byn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30545Byn {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r1.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ() {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r0 = 31
            if (r1 < r0) goto L17
            android.content.Context r1 = X.C15380j0.LIZLLL()
            if (r1 == 0) goto L1b
            java.lang.String r0 = "android.permission.BLUETOOTH_CONNECT"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto L1b
        L15:
            r2 = 1
        L16:
            return r2
        L17:
            r0 = 23
            if (r1 < r0) goto L16
        L1b:
            android.content.Context r1 = X.C15380j0.LIZLLL()
            if (r1 == 0) goto L16
            java.lang.String r0 = "android.permission.BLUETOOTH"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto L16
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30545Byn.LIZ():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r3.isWiredHeadsetOn() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ() {
        /*
            X.CFq r0 = X.C31026CFq.LIZ
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L25
            android.content.Context r1 = X.C15380j0.LIZLLL()
            r3 = 0
            if (r1 == 0) goto L2e
            java.lang.String r0 = "audio"
            java.lang.Object r1 = X.C16880lQ.LLILL(r1, r0)
        L15:
            boolean r0 = r1 instanceof android.media.AudioManager
            if (r0 == 0) goto L1c
            r3 = r1
            android.media.AudioManager r3 = (android.media.AudioManager) r3
        L1c:
            r2 = 0
            if (r3 == 0) goto L26
            boolean r0 = r3.isWiredHeadsetOn()
            if (r0 == 0) goto L26
        L25:
            r2 = 1
        L26:
            java.lang.String r1 = "wired headset is connected: "
            java.lang.String r0 = "HeadsetUtil"
            X.C0RN.LIZLLL(r1, r2, r0)
            return r2
        L2e:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30545Byn.LIZIZ():boolean");
    }

    public static boolean LIZJ() {
        AudioManager audioManager;
        BluetoothA2dp bluetoothA2dp;
        List<BluetoothDevice> connectedDevices;
        if (!LIZ()) {
            C0NB.LJIIIZ("HeadsetUtil", "no bluetooth permission");
        } else {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                if (defaultAdapter.isEnabled()) {
                    int profileConnectionState = defaultAdapter.getProfileConnectionState(2);
                    int profileConnectionState2 = defaultAdapter.getProfileConnectionState(1);
                    if (profileConnectionState == 2 || profileConnectionState2 == 2) {
                        C0NB.LJIIIZ("HeadsetUtil", "blue tooth connected");
                        return true;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("blue tooth disconnected. a2dpState: ");
                    LIZ.append(profileConnectionState);
                    LIZ.append(", headset: ");
                    LIZ.append(profileConnectionState2);
                    C0NB.LJIIIZ("HeadsetUtil", X1D.LIZIZ(LIZ));
                } else {
                    C0NB.LJIIIZ("HeadsetUtil", "bluetooth disable");
                }
            }
        }
        if (!LIZ()) {
            return false;
        }
        Context LIZLLL = C15380j0.LIZLLL();
        Object obj = null;
        if (LIZLLL != null) {
            obj = C16880lQ.LLILL(LIZLLL, "audio");
        }
        if (!(obj instanceof AudioManager) || (audioManager = (AudioManager) obj) == null || !audioManager.isBluetoothA2dpOn() || (bluetoothA2dp = C30306Buw.LIZ) == null || (connectedDevices = bluetoothA2dp.getConnectedDevices()) == null || connectedDevices.isEmpty()) {
            return false;
        }
        for (BluetoothDevice bluetoothDevice : connectedDevices) {
            BluetoothA2dp bluetoothA2dp2 = C30306Buw.LIZ;
            if (bluetoothA2dp2 != null && bluetoothA2dp2.isA2dpPlaying(bluetoothDevice)) {
                return true;
            }
        }
        return false;
    }
}
