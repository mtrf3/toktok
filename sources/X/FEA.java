package X;

import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FEA extends Handler {
    public final FEJ LIZ;

    public FEA(FE8 fe8) {
        super(C16880lQ.LLJJJJ());
        this.LIZ = fe8;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIJ(msg, "msg");
        super.handleMessage(msg);
        Object obj = msg.obj;
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            int i = msg.arg1;
            int i2 = msg.what;
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                this.LIZ.LIZ(i, str);
                return;
            }
            this.LIZ.LIZJ(i, str);
        }
    }
}
