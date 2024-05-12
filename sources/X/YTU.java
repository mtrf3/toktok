package X;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.media.AudioManager;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class YTU extends BroadcastReceiver {
    public final AudioManager LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C87431YTb.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(YTZ.LJLIL);

    public final java.util.Set<InterfaceC87433YTd> LIZJ() {
        return (java.util.Set) this.LIZIZ.getValue();
    }

    public final java.util.Map<String, Boolean> LIZLLL() {
        return (java.util.Map) this.LIZJ.getValue();
    }

    public YTU(AudioManager audioManager) {
        this.LIZ = audioManager;
    }

    public final void LIZ(InterfaceC87433YTd interfaceC87433YTd) {
        LIZJ().add(interfaceC87433YTd);
        if (LIZLLL().get(interfaceC87433YTd.LIZIZ()) == null) {
            LIZLLL().put(interfaceC87433YTd.LIZIZ(), Boolean.FALSE);
        }
    }

    public final void LIZIZ(Intent intent) {
        String action;
        UsbDevice usbDevice;
        AudioManager audioManager;
        AudioManager audioManager2;
        BluetoothDevice bluetoothDevice;
        AudioManager audioManager3;
        if (intent != null && (action = intent.getAction()) != null) {
            int hashCode = action.hashCode();
            if (hashCode != -2114103349) {
                if (hashCode != -1676458352) {
                    if (hashCode != -301431627 || !action.equals("android.bluetooth.device.action.ACL_CONNECTED") || (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) == null) {
                        return;
                    }
                    YTW.LIZ().LJIIIIZZ("audio device connected, is supported device: downgrade");
                    int majorDeviceClass = bluetoothDevice.getBluetoothClass().getMajorDeviceClass();
                    int deviceClass = bluetoothDevice.getBluetoothClass().getDeviceClass();
                    if (C61780OMm.LJI || (audioManager3 = this.LIZ) == null || audioManager3.getMode() != 0 || majorDeviceClass != 1024) {
                        return;
                    }
                    if (deviceClass != 1048 && deviceClass != 1044) {
                        return;
                    }
                    EarphonePlayerControl.LJII().LJFF(false);
                    for (InterfaceC87433YTd interfaceC87433YTd : LIZJ()) {
                        YTW.LIZIZ(LIZLLL().get(interfaceC87433YTd.LIZIZ()), interfaceC87433YTd.LIZIZ());
                        interfaceC87433YTd.LIZ();
                    }
                    return;
                }
                if (!action.equals("android.intent.action.HEADSET_PLUG") || intent.getIntExtra("state", -1) != 1) {
                    return;
                }
                YTW.LIZ().LJIIIIZZ("audio device connected, is supported device: downgrade");
                if (C61780OMm.LJI || (audioManager2 = this.LIZ) == null || audioManager2.getMode() != 0) {
                    return;
                }
                EarphonePlayerControl.LJII().LJFF(false);
                for (InterfaceC87433YTd interfaceC87433YTd2 : LIZJ()) {
                    YTW.LIZIZ(LIZLLL().get(interfaceC87433YTd2.LIZIZ()), interfaceC87433YTd2.LIZIZ());
                    interfaceC87433YTd2.LIZ();
                }
                return;
            }
            if (!action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED") || (usbDevice = (UsbDevice) intent.getParcelableExtra("device")) == null) {
                return;
            }
            YTW.LIZ().LJIIIIZZ("audio device connected, is supported device: downgrade");
            int deviceClass2 = usbDevice.getDeviceClass();
            if (C61780OMm.LJI || (audioManager = this.LIZ) == null || audioManager.getMode() != 0 || deviceClass2 != 1) {
                return;
            }
            EarphonePlayerControl.LJII().LJFF(false);
            for (InterfaceC87433YTd interfaceC87433YTd3 : LIZJ()) {
                YTW.LIZIZ(LIZLLL().get(interfaceC87433YTd3.LIZIZ()), interfaceC87433YTd3.LIZIZ());
                interfaceC87433YTd3.LIZ();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZIZ(intent);
        }
    }
}
