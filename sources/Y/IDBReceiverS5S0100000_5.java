package Y;

import X.B35;
import X.B44;
import X.C28202B5a;
import X.C31024CFo;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C73943T0h;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class IDBReceiverS5S0100000_5 extends BroadcastReceiver {
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

    public final void LIZ$0(Intent intent) {
        B35 b35;
        if (intent == null || !"media_control".equals(intent.getAction())) {
            return;
        }
        int intExtra = intent.getIntExtra("control_type", 0);
        if (intExtra != 1) {
            if (intExtra != 2 || (b35 = ((LivePlayFragment) this.l0).LLIIIJ) == null) {
                return;
            }
            b35.lambda$setMuteNew$0(false, "pip");
            C28202B5a.LIZ().LIZIZ = false;
            C73943T0h.LIZ().LIZIZ(new B44(false, false));
            return;
        }
        B35 b352 = ((LivePlayFragment) this.l0).LLIIIJ;
        if (b352 == null) {
            return;
        }
        b352.lambda$setMuteNew$0(true, "pip");
        C28202B5a.LIZ().LIZIZ = true;
        C73943T0h.LIZ().LIZIZ(new B44(true, false));
    }

    public IDBReceiverS5S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onReceive$0(IDBReceiverS5S0100000_5 iDBReceiverS5S0100000_5, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS5S0100000_5.LIZ$0(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS5S0100000_5.LIZ$0(intent);
        }
    }

    public static final void onReceive$1(IDBReceiverS5S0100000_5 iDBReceiverS5S0100000_5, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ((C31024CFo) iDBReceiverS5S0100000_5.l0).getClass();
            C31024CFo c31024CFo = (C31024CFo) iDBReceiverS5S0100000_5.l0;
            c31024CFo.LJIIJJI = false;
            c31024CFo.LIZ(intent);
            return;
        }
        C38523F9z.LIZ();
        ((C31024CFo) iDBReceiverS5S0100000_5.l0).getClass();
        C31024CFo c31024CFo2 = (C31024CFo) iDBReceiverS5S0100000_5.l0;
        c31024CFo2.LJIIJJI = false;
        c31024CFo2.LIZ(intent);
    }
}
