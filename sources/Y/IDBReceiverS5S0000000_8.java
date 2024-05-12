package Y;

import J.N;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C47850IqE;
import X.C64811Pc7;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.ttnet.org.chromium.base.PowerMonitor;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class IDBReceiverS5S0000000_8 extends BroadcastReceiver {
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
            case 2:
                onReceive$2(this, context, intent);
                return;
            default:
                super.onReceive(context, intent);
                return;
        }
    }

    public IDBReceiverS5S0000000_8(int i) {
        this.$t = i;
    }

    public final void LIZ$0(Intent intent) {
        if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        C64811Pc7 LJ = C64811Pc7.LJ();
        LJ.getClass();
        Message obtain = Message.obtain();
        obtain.obj = LJ;
        obtain.what = 6;
        C64811Pc7.LLD.sendMessage(obtain);
    }

    public static final void onReceive$0(IDBReceiverS5S0000000_8 iDBReceiverS5S0000000_8, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS5S0000000_8.LIZ$0(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS5S0000000_8.LIZ$0(intent);
        }
    }

    public static final void onReceive$1(IDBReceiverS5S0000000_8 iDBReceiverS5S0000000_8, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            PowerMonitor.LIZIZ.LIZ = intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED");
            N.MxETr4iO();
        } else {
            C38523F9z.LIZ();
            PowerMonitor.LIZIZ.LIZ = intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED");
            N.MxETr4iO();
        }
    }

    public static final void onReceive$2(IDBReceiverS5S0000000_8 iDBReceiverS5S0000000_8, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (iDBReceiverS5S0000000_8.isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                return;
            }
            C47850IqE.LIZ = System.currentTimeMillis();
            return;
        }
        C38523F9z.LIZ();
        if (iDBReceiverS5S0000000_8.isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        C47850IqE.LIZ = System.currentTimeMillis();
    }
}
