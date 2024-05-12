package X;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.Ix5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48275Ix5 extends BroadcastReceiver {
    public final Context LIZ;
    public final KeyguardManager LIZIZ;
    public final PowerManager LIZJ;
    public final WeakReference<InterfaceC48276Ix6> LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LIZIZ() {
        try {
            if (!this.LJFF) {
                this.LJFF = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                C16880lQ.LJJLIIIJILLIZJL(this, this.LIZ, intentFilter);
            }
        } catch (Exception unused) {
            this.LJFF = false;
        }
    }

    public final void LIZ(Intent intent) {
        InterfaceC48276Ix6 interfaceC48276Ix6 = this.LIZLLL.get();
        if (interfaceC48276Ix6 == null) {
            return;
        }
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            this.LJ = false;
            interfaceC48276Ix6.onScreenOff();
            return;
        }
        if ("android.intent.action.SCREEN_ON".equals(action)) {
            interfaceC48276Ix6.onScreenOn();
            if (this.LJ) {
                return;
            }
            try {
                KeyguardManager keyguardManager = this.LIZIZ;
                if (keyguardManager != null) {
                    if (keyguardManager.isKeyguardLocked()) {
                        return;
                    }
                }
                this.LJ = true;
                interfaceC48276Ix6.onScreenUserPresent(true);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (!"android.intent.action.USER_PRESENT".equals(action) || this.LJ) {
            return;
        }
        this.LJ = true;
        interfaceC48276Ix6.onScreenUserPresent(false);
    }

    public C48275Ix5(Context context, InterfaceC48276Ix6 interfaceC48276Ix6) {
        this.LIZ = C16880lQ.LLLLL(context);
        this.LIZJ = (PowerManager) C16880lQ.LLILL(context, "power");
        this.LIZIZ = (KeyguardManager) C16880lQ.LLILL(context, "keyguard");
        this.LIZLLL = new WeakReference<>(interfaceC48276Ix6);
        LIZIZ();
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
