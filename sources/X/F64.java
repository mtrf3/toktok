package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ttnet.org.chromium.net.ProxyChangeListener;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class F64 extends BroadcastReceiver {
    public final ProxyChangeListener LIZ;

    public F64(ProxyChangeListener proxyChangeListener) {
        this.LIZ = proxyChangeListener;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener proxyChangeListener = this.LIZ;
                proxyChangeListener.LIZ.postDelayed(new F65(2, proxyChangeListener, intent), 1000L);
                return;
            }
            return;
        }
        C38523F9z.LIZ();
        if (!intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            return;
        }
        ProxyChangeListener proxyChangeListener2 = this.LIZ;
        proxyChangeListener2.LIZ.postDelayed(new F65(2, proxyChangeListener2, intent), 1000L);
    }
}
