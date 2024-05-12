package X;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fj2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39760Fj2 implements Handler.Callback {
    public static final C39760Fj2 LJLJI = new C39760Fj2();
    public static java.util.Map<IBinder, Service> LJLJJI;
    public final List<C39761Fj3> LJLIL = new ArrayList();
    public Handler.Callback LJLILLLLZI;

    public final synchronized String LIZ(IBinder iBinder) {
        String str;
        if (LJLJJI == null) {
            try {
                Object LIZLLL = EWB.LIZLLL();
                LJLJJI = (java.util.Map) C78934UyQ.LJIIL(LIZLLL.getClass(), "mServices").get(LIZLLL);
            } catch (Throwable unused) {
            }
        }
        java.util.Map<IBinder, Service> map = LJLJJI;
        if (map != null && map.get(iBinder) != null) {
            str = LJLJJI.get(iBinder).getClass().getName();
        } else {
            str = null;
        }
        return str;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (C39758Fj0.LIZIZ(message)) {
            if (message.arg2 != 9529) {
                try {
                    ((ArrayList) this.LJLIL).add(C39761Fj3.LIZ(message));
                    if (((ArrayList) this.LJLIL).size() > 100) {
                        ((ArrayList) this.LJLIL).subList(0, 50).clear();
                    }
                } catch (Throwable unused) {
                }
                message.arg2 = 9529;
            } else {
                return true;
            }
        }
        Handler.Callback callback = this.LJLILLLLZI;
        if (callback == null) {
            return false;
        }
        return callback.handleMessage(message);
    }
}
