package com.bytedance.push.third;

import X.C16880lQ;
import X.C67007QRn;
import X.InterfaceC67012QRs;
import X.QRM;
import X.QRT;
import X.QRZ;
import X.QS5;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public class PushManager implements InterfaceC67012QRs {
    public static volatile PushManager sPushManager;

    public boolean requestNotificationPermission(int i) {
        return false;
    }

    public static PushManager inst() {
        if (sPushManager == null) {
            synchronized (PushManager.class) {
                if (sPushManager == null) {
                    sPushManager = new PushManager();
                }
            }
        }
        return sPushManager;
    }

    @Override // X.InterfaceC67012QRs
    public boolean checkThirdPushConfig(String str, Context context) {
        Set keySet;
        boolean z;
        Map map = C67007QRn.LJI(context).LIZ;
        if (map == null) {
            keySet = null;
        } else {
            keySet = ((HashMap) map).keySet();
        }
        Iterator it = keySet.iterator();
        boolean z2 = true;
        boolean z3 = true;
        while (true) {
            z = false;
            if (it.hasNext()) {
                InterfaceC67012QRs LIZIZ = C67007QRn.LJI(context).LIZIZ(((Integer) it.next()).intValue());
                if (LIZIZ != null) {
                    try {
                        z3 &= LIZIZ.checkThirdPushConfig(str, context);
                    } catch (Throwable unused) {
                        z3 = false;
                    }
                }
            } else {
                try {
                    break;
                } catch (PackageManager.NameNotFoundException e) {
                    C16880lQ.LLLLIIL(e);
                    return z;
                }
            }
        }
        boolean LIZ = QRZ.LIZ(context) & z3;
        QS5 LIZIZ2 = QRT.LIZJ(context).LIZIZ();
        if (LIZIZ2 != null) {
            z2 = LIZIZ2.LIZ();
        }
        z = LIZ & z2;
        return z;
    }

    @Override // X.InterfaceC67012QRs
    public boolean isPushAvailable(Context context, int i) {
        InterfaceC67012QRs LIZIZ = C67007QRn.LJI(context).LIZIZ(i);
        if (LIZIZ != null) {
            try {
                return LIZIZ.isPushAvailable(context, i);
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    @Override // X.InterfaceC67012QRs
    public void registerPush(Context context, int i) {
        InterfaceC67012QRs LIZIZ = C67007QRn.LJI(context).LIZIZ(i);
        if (LIZIZ != null) {
            try {
                QRM.LJFF().LIZJ(i);
                LIZIZ.registerPush(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.InterfaceC67012QRs
    public void unregisterPush(Context context, int i) {
        InterfaceC67012QRs LIZIZ = C67007QRn.LJI(context).LIZIZ(i);
        if (LIZIZ != null) {
            try {
                LIZIZ.unregisterPush(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.InterfaceC67012QRs
    public void setAlias(Context context, String str, int i) {
        InterfaceC67012QRs LIZIZ = C67007QRn.LJI(context).LIZIZ(i);
        if (LIZIZ != null) {
            try {
                LIZIZ.setAlias(context, str, i);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.InterfaceC67012QRs
    public void trackPush(Context context, int i, Object obj) {
        InterfaceC67012QRs LIZIZ = C67007QRn.LJI(context).LIZIZ(i);
        if (LIZIZ != null) {
            try {
                LIZIZ.trackPush(context, i, obj);
            } catch (Throwable unused) {
            }
        }
    }
}
