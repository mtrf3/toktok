package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.FWq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39112FWq implements InterfaceC39114FWs {
    @Override // X.InterfaceC39114FWs
    public final boolean LIZ(Message message) {
        Handler target = message.getTarget();
        if (target == null) {
            return false;
        }
        return target.getClass().getName().equals(HandlerC212798Wt.class.getName());
    }
}
