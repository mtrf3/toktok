package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.EbD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36727EbD implements Handler.Callback {
    public final Handler LJLIL;

    public C36727EbD(Handler handler) {
        this.LJLIL = handler;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            if (!C36725EbB.LJLJI) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Handle message ");
                LIZ.append(message);
                X1D.LIZIZ(LIZ);
                F8X.LIZ();
            }
            this.LJLIL.handleMessage(message);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }
}
