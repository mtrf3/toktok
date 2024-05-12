package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.ZXm, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class HandlerC90094ZXm extends Handler {
    public final /* synthetic */ AbstractC90097ZXp LIZ;

    public HandlerC90094ZXm(AbstractC90097ZXp abstractC90097ZXp) {
        this.LIZ = abstractC90097ZXp;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            AbstractC90097ZXp abstractC90097ZXp = this.LIZ;
            abstractC90097ZXp.LJLJJLL = false;
            abstractC90097ZXp.LJIILJJIL(abstractC90097ZXp.LJLJJL);
            return;
        }
        AbstractC90097ZXp abstractC90097ZXp2 = this.LIZ;
        abstractC90097ZXp2.LJLJLJ = false;
        AbstractC90090ZXi abstractC90090ZXi = abstractC90097ZXp2.LJLJJI;
        if (abstractC90090ZXi == null) {
            return;
        }
        abstractC90090ZXi.LIZ(abstractC90097ZXp2, abstractC90097ZXp2.LJLJL);
    }
}
