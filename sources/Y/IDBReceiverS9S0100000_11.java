package Y;

import X.C0NB;
import X.C16880lQ;
import X.C30922CBq;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C79411VEp;
import X.C84763XOl;
import X.O5Y;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.live.livehostimpl.BgBroadcastService;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class IDBReceiverS9S0100000_11 extends BroadcastReceiver {
    public final int $t;
    public Object l0;

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

    public final void LIZ$0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("detect screen unlock, force redraw ");
        LIZ.append(this);
        O5Y.LJJJ("KryptonCanvasView", X1D.LIZIZ(LIZ));
        C79411VEp.LIZJ(new ARunnableS47S0100000_11(this, 110));
    }

    public IDBReceiverS9S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onReceive$0(IDBReceiverS9S0100000_11 iDBReceiverS9S0100000_11, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("BgBroadcastService", "mPostNotificationPermissionResultReceiver onReceive");
            }
            BgBroadcastService bgBroadcastService = (BgBroadcastService) iDBReceiverS9S0100000_11.l0;
            C16880lQ.LLLJIL(bgBroadcastService, bgBroadcastService.buildNotification(bgBroadcastService));
            return;
        }
        C38523F9z.LIZ();
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("BgBroadcastService", "mPostNotificationPermissionResultReceiver onReceive");
        }
        BgBroadcastService bgBroadcastService2 = (BgBroadcastService) iDBReceiverS9S0100000_11.l0;
        C16880lQ.LLLJIL(bgBroadcastService2, bgBroadcastService2.buildNotification(bgBroadcastService2));
    }

    public static final void onReceive$1(IDBReceiverS9S0100000_11 iDBReceiverS9S0100000_11, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS9S0100000_11.LIZ$0();
        } else {
            C38523F9z.LIZ();
            iDBReceiverS9S0100000_11.LIZ$0();
        }
    }
}
