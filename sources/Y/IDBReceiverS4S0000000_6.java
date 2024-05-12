package Y;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C39405FdJ;
import X.C84763XOl;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.safemode.SmartProtected.fastboot.TestCrash;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class IDBReceiverS4S0000000_6 extends BroadcastReceiver {
    public final int $t;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.$t) {
            case 0:
                onReceive$0(this, context, intent);
                return;
            case 1:
                onReceive$1(this, context, intent);
                return;
            default:
                super.onReceive(context, intent);
                return;
        }
    }

    public IDBReceiverS4S0000000_6(int i) {
        this.$t = i;
    }

    public static void LIZ$0(Intent intent) {
        Integer valueOf;
        if (intent == null || (valueOf = Integer.valueOf(intent.getIntExtra("type", 0))) == null) {
            return;
        }
        if (valueOf.intValue() != 1) {
            if (valueOf.intValue() != 2) {
                return;
            }
            C16880lQ.LLJJJIL("DemoTest");
            TestCrash.LIZ.getClass();
            TestCrash.triggerNativeCrash();
            return;
        }
        throw new OutOfMemoryError("java oom crash ");
    }

    public static void LIZ$1(Intent intent) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receiver broadcast >> ");
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C39405FdJ.LJFF.getClass();
        C39405FdJ.LIZIZ.evictAll();
        C39405FdJ.LIZJ.evictAll();
    }

    public static final void onReceive$0(IDBReceiverS4S0000000_6 iDBReceiverS4S0000000_6, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ$0(intent);
        } else {
            C38523F9z.LIZ();
            LIZ$0(intent);
        }
    }

    public static final void onReceive$1(IDBReceiverS4S0000000_6 iDBReceiverS4S0000000_6, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ$1(intent);
        } else {
            C38523F9z.LIZ();
            LIZ$1(intent);
        }
    }
}
