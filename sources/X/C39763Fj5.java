package X;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.HashSet;

/* renamed from: X.Fj5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39763Fj5 implements Handler.Callback {
    public static final C39763Fj5 LJLILLLLZI = new C39763Fj5();
    public static C39762Fj4 LJLJI = null;
    public static java.util.Map<IBinder, Service> LJLJJI;
    public Handler.Callback LJLIL;

    public final synchronized String LIZ(IBinder iBinder) {
        String str;
        if (LJLJJI == null) {
            try {
                Object LIZ = C36591EXr.LIZ();
                LJLJJI = (java.util.Map) C36508EUm.LIZ(LIZ.getClass(), "mServices").get(LIZ);
            } catch (Throwable unused) {
            }
        }
        java.util.Map<IBinder, Service> map = LJLJJI;
        str = null;
        if (map != null && map.get(iBinder) != null) {
            str = LJLJJI.get(iBinder).getClass().getName();
        }
        return str;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            if (((HashSet) C57772On.LIZ).contains(Integer.valueOf(message.what))) {
                LJLJI = C39762Fj4.LIZ(message);
            }
        } catch (Throwable unused) {
        }
        Handler.Callback callback = this.LJLIL;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }
}
