package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class FK8 extends BroadcastReceiver {
    public final /* synthetic */ ActivityC86117Xqz LIZ;
    public final /* synthetic */ C40103FoZ LIZIZ;

    public FK8(ActivityC86117Xqz activityC86117Xqz, C40103FoZ c40103FoZ) {
        this.LIZ = activityC86117Xqz;
        this.LIZIZ = c40103FoZ;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (!this.LIZ.isFinishing()) {
                this.LIZIZ.getClass();
            }
        } else {
            C38523F9z.LIZ();
            if (this.LIZ.isFinishing()) {
                return;
            }
            this.LIZIZ.getClass();
        }
    }
}
