package X;

import Y.ARunnableS14S0101000_10;
import Y.ARunnableS14S0201000_11;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.NUi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59436NUi extends BroadcastReceiver {
    public static int LIZIZ = -1;
    public final NQP LIZ;

    public C59436NUi(NQP nqp) {
        int i;
        this.LIZ = nqp;
        if (C52450KiE.LIZ()) {
            C38995FSd.LJFF().submit(new RunnableC65317PkH(2, nqp));
        } else {
            LIZIZ = (!C52450KiE.LIZ() || (i = LIZIZ) == -1) ? nqp.LIZ() : i;
        }
    }

    public final void LIZ(Intent intent) {
        NQP nqp;
        if ((("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) || "android.media.STREAM_MUTE_CHANGED_ACTION".equals(intent.getAction())) && (nqp = this.LIZ) != null) {
            ARunnableS14S0101000_10 aRunnableS14S0101000_10 = new ARunnableS14S0101000_10(LIZIZ, nqp.LIZLLL, 9);
            if (C52450KiE.LIZ()) {
                C38995FSd.LJFF().submit(new ARunnableS14S0201000_11(0, nqp, aRunnableS14S0101000_10, 11));
            } else {
                LIZIZ = nqp.LIZ();
                aRunnableS14S0101000_10.run();
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
