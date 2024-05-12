package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class C65 extends BroadcastReceiver {
    public final /* synthetic */ BaseListFragmentPanel LIZ;

    public C65(BaseListFragmentPanel baseListFragmentPanel) {
        this.LIZ = baseListFragmentPanel;
    }

    public final void LIZ(Intent intent) {
        if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(intent.getAction())) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "reason");
            if ("homekey".equals(LLJJIJIIJIL) || "recentapps".equals(LLJJIJIIJIL)) {
                C36922EeM.LIZLLL(3, "SurfaceView", "SurfaceViewComponent.onReceive, Home key is pressed");
                this.LIZ.isHomePressed = true;
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
