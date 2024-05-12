package X;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.By7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30503By7 extends BroadcastReceiver {
    public static void LIZ(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1676458352:
                if (!action.equals("android.intent.action.HEADSET_PLUG") || !intent.hasExtra("state")) {
                    return;
                }
                int intExtra = intent.getIntExtra("state", 0);
                if (intExtra != 0 && intExtra != 1) {
                    return;
                }
                C30501By5.LIZ.LIZLLL();
                return;
            case -855499628:
                if (!action.equals("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED")) {
                    return;
                }
                break;
            case 487423555:
                if (!action.equals("android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED")) {
                    return;
                }
                break;
            case 1123270207:
                if (!action.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED")) {
                    return;
                }
                break;
            default:
                return;
        }
        C30501By5.LIZ.LIZLLL();
    }

    public static void LIZIZ(Context context) {
        BluetoothAdapter defaultAdapter;
        try {
            if (C30545Byn.LIZ() && C30306Buw.LIZ != null && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
                defaultAdapter.getProfileProxy(context, new C30303But(), 2);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initBluetoothA2dpProxy ");
            LIZ.append(e.getMessage());
            C0NB.LJ("HeadsetBroadcastReceiver", X1D.LIZIZ(LIZ));
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
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}
