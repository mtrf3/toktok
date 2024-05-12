package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.push.third.PushManager;
import com.ss.android.message.NotifyService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class QRP implements QR6 {
    public final java.util.Map<Integer, Boolean> LIZ = new ConcurrentHashMap();
    public final QRX LIZIZ = new QRX(this);

    public final boolean LIZ(Context context) {
        QRG.LIZIZ().getClass();
        java.util.Set set = null;
        boolean z = false;
        if (QRG.LJ()) {
            java.util.Map map = C67007QRn.LJI(context).LIZ;
            if (map != null) {
                set = ((HashMap) map).keySet();
            }
            Iterator it = set.iterator();
            z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (context != null) {
                    QRG.LIZIZ().getClass();
                    if (QRG.LJ() || !QRG.LIZLLL().LJJ()) {
                        Context LLLLL = C16880lQ.LLLLL(context);
                        if (C67007QRn.LJIIIIZZ(intValue) && LLLLL != null && PushManager.inst().isPushAvailable(LLLLL, intValue)) {
                            synchronized (this) {
                                Boolean bool = (Boolean) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(intValue));
                                if (bool == null || !bool.booleanValue()) {
                                    ((ConcurrentHashMap) this.LIZ).put(Integer.valueOf(intValue), Boolean.TRUE);
                                    if (C67007QRn.LJIIIIZZ(intValue) && LLLLL != null) {
                                        PushManager.inst().registerPush(LLLLL, intValue);
                                    }
                                }
                            }
                            z |= z2;
                        }
                    }
                }
                z2 = false;
                z |= z2;
            }
            Context LLLLL2 = C16880lQ.LLLLL(context);
            Intent intent = new Intent(LLLLL2, (Class<?>) NotifyService.class);
            try {
                QQS qqs = (QQS) QPG.LIZ(QQS.class);
                if (qqs == null || qqs.LJ()) {
                    C16880lQ.LLLL(LLLLL2, intent);
                }
                C16880lQ.LLLJL(LLLLL2, intent, new ServiceConnectionC67015QRv(LLLLL2), 1);
            } catch (Throwable unused) {
            }
        } else {
            java.util.Map map2 = C67007QRn.LJI(context).LIZ;
            if (map2 != null) {
                set = ((HashMap) map2).keySet();
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Integer) it2.next()).intValue();
                if (context != null) {
                    PushManager.inst().unregisterPush(C16880lQ.LLLLL(context), intValue2);
                }
            }
            ((ConcurrentHashMap) this.LIZ).clear();
        }
        return z;
    }
}
