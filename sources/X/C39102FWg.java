package X;

import android.os.Message;

/* renamed from: X.FWg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39102FWg implements InterfaceC39114FWs {
    @Override // X.InterfaceC39114FWs
    public final boolean LIZ(Message message) {
        Runnable callback;
        if (message.getTarget() == null || (callback = message.getCallback()) == null) {
            return false;
        }
        String name = callback.getClass().getName();
        boolean contains = name.contains("LoadedApk$ReceiverDispatcher");
        boolean contains2 = name.contains("LoadedApk$ServiceDispatcher");
        if (!contains && !contains2) {
            return false;
        }
        return true;
    }
}
