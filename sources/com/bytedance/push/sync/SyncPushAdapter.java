package com.bytedance.push.sync;

import X.C67007QRn;
import X.C67028QSi;
import X.C67029QSj;
import X.C67031QSl;
import X.InterfaceC67012QRs;
import X.QM0;
import X.QRM;
import android.content.Context;
import android.util.Log;
import com.bytedance.sync.SyncSDK;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class SyncPushAdapter implements InterfaceC67012QRs {
    public static int SYNC_PUSH = -1;

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

    public static int getSyncPush() {
        if (SYNC_PUSH == -1) {
            SYNC_PUSH = C67007QRn.LJI(QM0.LIZ).LIZJ(SyncPushAdapter.class.getName());
        }
        return SYNC_PUSH;
    }

    @Override // X.InterfaceC67012QRs
    public boolean isPushAvailable(Context context, int i) {
        C67028QSi.LIZIZ(context).getClass();
        try {
            Class.forName("com.bytedance.sync.SyncSDK");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // X.InterfaceC67012QRs
    public void registerPush(Context context, int i) {
        C67028QSi LIZIZ = C67028QSi.LIZIZ(context);
        LIZIZ.getClass();
        try {
            C67031QSl c67031QSl = new C67031QSl(21L);
            ((ArrayList) c67031QSl.LIZIZ).add(new C67029QSj(LIZIZ));
            LIZIZ.LJLIL = SyncSDK.registerBusiness(c67031QSl.LIZ());
            QRM.LJFF().LJI(getSyncPush());
        } catch (Throwable th) {
            QRM.LJFF().LJIILL(getSyncPush(), -1, "-1", Log.getStackTraceString(th));
        }
    }

    @Override // X.InterfaceC67012QRs
    public void unregisterPush(Context context, int i) {
        C67028QSi LIZIZ = C67028QSi.LIZIZ(context);
        LIZIZ.getClass();
        try {
            LIZIZ.LJLIL.remove();
        } catch (Throwable unused) {
        }
    }
}
