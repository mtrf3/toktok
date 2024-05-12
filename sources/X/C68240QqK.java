package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.QqK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68240QqK extends BroadcastReceiver {
    public final C68241QqL LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final void LIZIZ() {
        this.LIZ.LJI();
        this.LIZ.LIZIZ().LJFF();
        this.LIZ.LIZIZ().LJFF();
        if (this.LIZIZ) {
            this.LIZ.LIZJ().LJIILIIL.LIZ("Unregistering connectivity change receiver");
            this.LIZIZ = false;
            this.LIZJ = false;
            try {
                C16880lQ.LJJLIIIJL(this.LIZ.LJIIJJI.LIZ, this);
            } catch (IllegalArgumentException e) {
                this.LIZ.LIZJ().LJFF.LIZIZ(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public C68240QqK(C68241QqL c68241QqL) {
        this.LIZ = c68241QqL;
    }

    public final void LIZ(Intent intent) {
        this.LIZ.LJI();
        String action = intent.getAction();
        this.LIZ.LIZJ().LJIILIIL.LIZIZ(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            C68186QpS c68186QpS = this.LIZ.LIZIZ;
            C68241QqL.LJJIJIIJI(c68186QpS);
            boolean LJIIIZ = c68186QpS.LJIIIZ();
            if (this.LIZJ != LJIIIZ) {
                this.LIZJ = LJIIIZ;
                this.LIZ.LIZIZ().LJIILIIL(new RunnableC68295QrD(this, LJIIIZ));
                return;
            }
            return;
        }
        this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(action, "NetworkBroadcastReceiver received unknown action");
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
