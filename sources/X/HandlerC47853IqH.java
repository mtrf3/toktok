package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.IqH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC47853IqH extends Handler {
    public final WeakReference<C47854IqI> LIZ;

    public HandlerC47853IqH(C47854IqI c47854IqI) {
        super(C47756Ioi.LJII());
        this.LIZ = new WeakReference<>(c47854IqI);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC47869IqX interfaceC47869IqX;
        C47854IqI c47854IqI = this.LIZ.get();
        if (c47854IqI == null || (interfaceC47869IqX = c47854IqI.LIZLLL) == null || c47854IqI.LIZIZ) {
            return;
        }
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    c47854IqI.LIZLLL();
                    interfaceC47869IqX.LIZIZ((JSONObject) message.obj, null);
                    return;
                }
                c47854IqI.LIZLLL();
                interfaceC47869IqX.LIZIZ(null, (C47789IpF) message.obj);
                return;
            }
            c47854IqI.LIZLLL();
            interfaceC47869IqX.LIZ((C47789IpF) message.obj);
            return;
        }
        interfaceC47869IqX.onCancelled();
    }
}
