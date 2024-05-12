package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GdF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41949GdF extends BroadcastReceiver {
    public static void LIZ() {
        if (C168586jW.LIZ) {
            return;
        }
        int LIZJ = C47636Imm.LIZJ();
        List<Integer> list = C168586jW.LIZIZ;
        Integer num = (Integer) ORZ.LLFII(list);
        if (num == null || LIZJ != num.intValue()) {
            ((ArrayList) list).add(Integer.valueOf(LIZJ));
        }
        int LIZ = C47636Imm.LIZ();
        List<Integer> list2 = C168586jW.LIZJ;
        Integer num2 = (Integer) ORZ.LLFII(list2);
        if (num2 == null || LIZ != num2.intValue()) {
            ((ArrayList) list2).add(Integer.valueOf(LIZ));
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
            LIZ();
        } else {
            C38523F9z.LIZ();
            LIZ();
        }
    }
}
