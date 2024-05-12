package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d5b.c;

/* loaded from: classes12.dex */
public class PMN extends Handler {
    public PMN(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PMO pmo = PMM.LIZJ;
        if (pmo == null) {
            return;
        }
        int i = message.what;
        Context context = (Context) message.obj;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            float LIZJ = c.LIZJ(context);
                            c.LIZLLL(context);
                            ((C33641Ts) pmo).LIZ(c.LIZIZ(context), LIZJ);
                        }
                        sendMessageDelayed(obtainMessage(i, context), PMM.LIZLLL);
                    }
                    float LIZJ2 = c.LIZJ(context);
                    c.LIZLLL(context);
                    ((C33641Ts) pmo).LIZ(-1L, LIZJ2);
                } else {
                    ((C33641Ts) pmo).LIZ(c.LIZIZ(context), -1.0f);
                }
            } else {
                c.LIZLLL(context);
                ((C33641Ts) pmo).LIZ(-1L, -1.0f);
            }
        } else {
            ((C33641Ts) pmo).LIZ(-1L, c.LIZJ(context));
        }
        sendMessageDelayed(obtainMessage(i, context), PMM.LIZLLL);
    }
}
