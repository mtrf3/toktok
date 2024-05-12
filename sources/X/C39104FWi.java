package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.FWi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39104FWi implements InterfaceC39114FWs {
    @Override // X.InterfaceC39114FWs
    public final boolean LIZ(Message message) {
        boolean z;
        boolean z2;
        Handler target = message.getTarget();
        if (target == null) {
            return false;
        }
        String name = target.getClass().getName();
        Runnable callback = message.getCallback();
        boolean equals = name.equals("android.view.ViewRootImpl$ViewRootHandler");
        boolean z3 = target instanceof HandlerC46761IWv;
        if (callback != null && callback.getClass().getName().contains("androidx.fragment.app")) {
            z = true;
        } else {
            z = false;
        }
        if (target == C37179EiV.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean equals2 = name.equals("android.os.Handler");
        if (equals || z3 || z || z2 || !equals2) {
            return false;
        }
        return true;
    }
}
