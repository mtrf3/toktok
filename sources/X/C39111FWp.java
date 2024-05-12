package X;

import android.os.Message;

/* renamed from: X.FWp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39111FWp implements InterfaceC39114FWs {
    @Override // X.InterfaceC39114FWs
    public final boolean LIZ(Message message) {
        Runnable callback = message.getCallback();
        if (callback != null && callback.getClass().getName().contains("kotlinx.coroutines")) {
            return true;
        }
        return false;
    }
}
