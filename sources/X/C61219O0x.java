package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.O0x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61219O0x extends BroadcastReceiver {
    public Context LIZ;
    public final AbstractC61220O0y LIZIZ;

    public C61219O0x(AbstractC61220O0y abstractC61220O0y) {
        this.LIZIZ = abstractC61220O0y;
    }

    public final void LIZ(Intent intent) {
        String str;
        android.net.Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.LIZIZ.LIZ();
            synchronized (this) {
                Context context = this.LIZ;
                if (context != null) {
                    C16880lQ.LJJLIIIJL(context, this);
                }
                this.LIZ = null;
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
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}
