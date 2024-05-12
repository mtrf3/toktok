package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;

/* loaded from: classes10.dex */
public class LUW extends Handler {
    public final /* synthetic */ LUX LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LIZ.LIZ("unknown", "background");
        } else {
            if (TextUtils.isEmpty(this.LIZ.LIZLLL) || TextUtils.isEmpty(this.LIZ.LIZIZ)) {
                return;
            }
            LUX lux = this.LIZ;
            if (lux.LIZLLL.equals(lux.LJ)) {
                LUX lux2 = this.LIZ;
                if (lux2.LIZIZ.equals(lux2.LIZJ)) {
                    return;
                }
            }
            LUX lux3 = this.LIZ;
            lux3.LIZ(lux3.LIZLLL, lux3.LIZIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LUW(LUX lux, Looper looper) {
        super(looper);
        this.LIZ = lux;
    }
}
