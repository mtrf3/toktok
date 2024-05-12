package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.ttnet.org.chromium.net.f0;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class YV7 extends BroadcastReceiver {
    public static void LIZ(Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) && !"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) && (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
                return;
            }
        } else if (!"android.security.STORAGE_CHANGED".equals(intent.getAction())) {
            return;
        }
        try {
            f0.LJFF();
        } catch (KeyStoreException e) {
            C78939UyV.LJII("Unable to reload the default TrustManager", e);
        } catch (NoSuchAlgorithmException e2) {
            C78939UyV.LJII("Unable to reload the default TrustManager", e2);
        } catch (CertificateException e3) {
            C78939UyV.LJII("Unable to reload the default TrustManager", e3);
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
