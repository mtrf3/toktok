package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

/* loaded from: classes11.dex */
public final class O6T {
    public static Context LIZ;

    public static Intent LIZ(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                ReceiverRegisterCrashOptimizer.doHWReceiverFix();
            }
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 4);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, null, null, 4);
                }
                throw e;
            }
        }
        return C16880lQ.LJJLIIIJJI(context, broadcastReceiver, intentFilter, null);
    }
}
