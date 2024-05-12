package com.bytedance.push.frontier;

import X.C66986QQs;
import X.C67007QRn;
import X.InterfaceC67012QRs;
import X.PT6;
import X.QM0;
import X.QR9;
import X.QRB;
import X.QRM;
import android.content.Context;
import com.bytedance.push.settings.PushOnlineSettings;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public class FrontierPushAdapter implements InterfaceC67012QRs {
    public static int FRONTIER_PUSH = -1;

    @Override // X.InterfaceC67012QRs
    public boolean checkThirdPushConfig(String str, Context context) {
        return true;
    }

    public boolean requestNotificationPermission(int i) {
        return false;
    }

    @Override // X.InterfaceC67012QRs
    public void setAlias(Context context, String str, int i) {
    }

    @Override // X.InterfaceC67012QRs
    public void trackPush(Context context, int i, Object obj) {
    }

    public static int getFrontierPush() {
        if (FRONTIER_PUSH == -1) {
            FRONTIER_PUSH = C67007QRn.LJI(QM0.LIZ).LIZJ(FrontierPushAdapter.class.getName());
        }
        return FRONTIER_PUSH;
    }

    @Override // X.InterfaceC67012QRs
    public boolean isPushAvailable(Context context, int i) {
        if (i != getFrontierPush()) {
            return false;
        }
        QR9 LIZIZ = QR9.LIZIZ(context);
        PushOnlineSettings pushOnlineSettings = (PushOnlineSettings) PT6.LIZ(LIZIZ.LJLILLLLZI, PushOnlineSettings.class);
        if (pushOnlineSettings != null) {
            LIZIZ.LJLJI = pushOnlineSettings.LJFF();
        }
        int i2 = LIZIZ.LJLJI;
        if (i2 == 0) {
            return false;
        }
        if ((i2 != 1 || LIZIZ.LJLIL.get() == null) && LIZIZ.LJLJI != 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC67012QRs
    public void registerPush(Context context, int i) {
        QR9 LIZIZ = QR9.LIZIZ(context);
        if (LIZIZ.LJLJI == 2) {
            AtomicReference<QRB> atomicReference = LIZIZ.LJLIL;
            Context context2 = LIZIZ.LJLILLLLZI;
            String str = LIZIZ.LJLJJI;
            if (C66986QQs.LJ == null) {
                synchronized (C66986QQs.class) {
                    if (C66986QQs.LJ == null) {
                        C66986QQs.LJ = new C66986QQs(context2, str);
                    }
                }
            }
            atomicReference.set(C66986QQs.LJ);
        }
        QRB qrb = LIZIZ.LJLIL.get();
        if (qrb != null) {
            LIZIZ.LJLJJL = true;
            qrb.LIZ(LIZIZ);
        }
        QRM.LJFF().LJI(getFrontierPush());
    }

    @Override // X.InterfaceC67012QRs
    public void unregisterPush(Context context, int i) {
        QR9 LIZIZ = QR9.LIZIZ(context);
        LIZIZ.LJLJJL = false;
        if (LIZIZ.LJLIL.get() != null) {
            LIZIZ.LJLIL.get().LIZIZ();
        }
    }
}
