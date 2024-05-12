package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;

/* renamed from: X.ZXd, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class HandlerC90085ZXd extends Handler {
    public final C90087ZXf LIZ;
    public final String LIZIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC90096ZXo LIZIZ;
        AbstractC90096ZXo LIZIZ2;
        Messenger messenger = message.replyTo;
        int i = message.what;
        int i2 = message.arg1;
        Object obj = message.obj;
        Bundle data = message.getData();
        if (i != 7) {
            if (i != 8) {
                if (i != 9 || !(obj instanceof Intent)) {
                    return;
                }
                C90087ZXf c90087ZXf = this.LIZ;
                String str = this.LIZIZ;
                Intent intent = (Intent) obj;
                if (c90087ZXf.getSessionInfo(str) == null) {
                    return;
                }
                AbstractC90599Zh5 LIZJ = c90087ZXf.LIZJ(str);
                if (LIZJ == null) {
                    c90087ZXf.notifyRequestFailed(i2, 3);
                    return;
                } else {
                    LIZJ.LIZLLL(intent, new C90598Zh4(messenger, i2));
                    return;
                }
            }
            int i3 = data.getInt("volume", 0);
            String string = data.getString("routeId");
            if (i3 == 0 || string == null || (LIZIZ2 = this.LIZ.LIZIZ(string)) == null) {
                return;
            }
            LIZIZ2.LJIIIZ(i3);
            return;
        }
        int i4 = data.getInt("volume", -1);
        String string2 = data.getString("routeId");
        if (i4 < 0 || string2 == null || (LIZIZ = this.LIZ.LIZIZ(string2)) == null) {
            return;
        }
        LIZIZ.LJI(i4);
    }

    public HandlerC90085ZXd(C90087ZXf c90087ZXf, String str) {
        super(Looper.myLooper());
        this.LIZ = c90087ZXf;
        this.LIZIZ = str;
    }
}
