package androidx.work.impl.background.systemalarm;

import X.C0VW;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C0VW.LIZIZ("ConstraintProxy");
    }

    /* loaded from: classes.dex */
    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                super.onReceive(context, intent);
            } else {
                C38523F9z.LIZ();
                super.onReceive(context, intent);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                super.onReceive(context, intent);
            } else {
                C38523F9z.LIZ();
                super.onReceive(context, intent);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                super.onReceive(context, intent);
            } else {
                C38523F9z.LIZ();
                super.onReceive(context, intent);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                super.onReceive(context, intent);
            } else {
                C38523F9z.LIZ();
                super.onReceive(context, intent);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            C0VW LIZ2 = C0VW.LIZ();
            C16880lQ.LLLZ("onReceive : %s", new Object[]{intent});
            LIZ2.getClass();
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            C16880lQ.LLLL(context, intent2);
            return;
        }
        C38523F9z.LIZ();
        C0VW LIZ3 = C0VW.LIZ();
        C16880lQ.LLLZ("onReceive : %s", new Object[]{intent});
        LIZ3.getClass();
        Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
        C16880lQ.LLLL(context, intent3);
    }
}
