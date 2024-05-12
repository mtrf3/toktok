package X;

import Y.ARunnableS12S0101000_8;
import Y.ARunnableS9S0101000_5;
import Y.IDRunnableS6S0101000;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;

/* renamed from: X.CVa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31426CVa extends BroadcastReceiver {
    public final /* synthetic */ C47634Imk LIZ;

    public C31426CVa(C47634Imk c47634Imk) {
        this.LIZ = c47634Imk;
    }

    public final void LIZ(Intent intent) {
        if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            return;
        }
        String action = intent.getAction();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceive: ");
        LIZ.append(action);
        TTVideoEngineLog.d("HeadsetStateMonitor", X1D.LIZIZ(LIZ));
        String action2 = intent.getAction();
        action2.getClass();
        if (!action2.equals("android.intent.action.HEADSET_PLUG")) {
            if (!action2.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            if (intExtra == 2) {
                C47634Imk.LJI(this.LIZ.LIZIZ, new IDRunnableS6S0101000(10, this, 8));
                return;
            } else {
                if (intExtra != 0) {
                    return;
                }
                C47634Imk.LJI(this.LIZ.LIZIZ, new IDRunnableS6S0101000(8, this, 1));
                return;
            }
        }
        int intExtra2 = intent.getIntExtra("state", -1);
        if (intExtra2 == 1) {
            C47634Imk.LJI(this.LIZ.LIZIZ, new ARunnableS12S0101000_8(8, this, 5));
        } else {
            if (intExtra2 != 0) {
                return;
            }
            C47634Imk.LJI(this.LIZ.LIZIZ, new ARunnableS9S0101000_5(5, this, 21));
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
