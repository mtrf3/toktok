package com.fcm;

import X.AbstractC67638Qgc;
import X.C66994QRa;
import X.C66995QRb;
import X.C66996QRc;
import X.C67001QRh;
import X.C67002QRi;
import X.C67007QRn;
import X.C67649Qgn;
import X.HG3;
import X.InterfaceC67012QRs;
import X.QM0;
import X.QRM;
import X.QSK;
import X.X1D;
import Y.IDRunnableS0S0201000;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.push_3rd_fcm_androidx.R$string;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes12.dex */
public class FcmPushAdapter implements InterfaceC67012QRs {
    public static int FCM_PUSH = -1;

    @Override // X.InterfaceC67012QRs
    public boolean isPushAvailable(Context context, int i) {
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

    public static int getFcmPush() {
        if (FCM_PUSH == -1) {
            FCM_PUSH = C67007QRn.LJI(QM0.LIZ).LIZJ(FcmPushAdapter.class.getName());
        }
        return FCM_PUSH;
    }

    @Override // X.InterfaceC67012QRs
    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z;
        String string = context.getResources().getString(R$string.google_api_key);
        String string2 = context.getResources().getString(R$string.google_app_id);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            z = true;
        } else {
            z = false;
            QRM.LJIIIIZZ.LIZ.getClass();
        }
        C67001QRh c67001QRh = new C67001QRh("com.fcm.service.SSGcmListenerService");
        c67001QRh.LIZ.LIZJ = context.getPackageName();
        c67001QRh.LIZ(new C66996QRc(Collections.singletonList("com.google.firebase.MESSAGING_EVENT"), null));
        C67001QRh c67001QRh2 = new C67001QRh("com.fcm.service.FcmRegistrationJobIntentService");
        String packageName = context.getPackageName();
        C66995QRb c66995QRb = c67001QRh2.LIZ;
        c66995QRb.LIZJ = packageName;
        c66995QRb.LIZLLL = "android.permission.BIND_JOB_SERVICE";
        return z & C66994QRa.LIZIZ(context, "Fcm Push error", Arrays.asList(c67001QRh.LIZ, c66995QRb));
    }

    @Override // X.InterfaceC67012QRs
    public void registerPush(Context context, int i) {
        String str;
        AbstractC67638Qgc<String> abstractC67638Qgc;
        if (context != null) {
            if (i != getFcmPush()) {
                if (i != getFcmPush()) {
                    str = "register sender error";
                } else {
                    str = null;
                }
            } else {
                HG3 hg3 = QRM.LJIIIIZZ.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("registerPush:");
                LIZ.append(i);
                X1D.LIZIZ(LIZ);
                hg3.getClass();
                try {
                    FirebaseMessaging LIZJ = FirebaseMessaging.LIZJ();
                    QSK qsk = LIZJ.LIZIZ;
                    if (qsk != null) {
                        abstractC67638Qgc = qsk.LIZIZ();
                    } else {
                        C67649Qgn c67649Qgn = new C67649Qgn();
                        LIZJ.LJII.execute(new IDRunnableS0S0201000(1, LIZJ, c67649Qgn, 4));
                        abstractC67638Qgc = c67649Qgn.LIZ;
                    }
                    abstractC67638Qgc.LIZIZ(new C67002QRi(context));
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
        } else {
            str = "context is null";
        }
        QRM.LJFF().LJIILL(i, 101, CardStruct.IStatusCode.DEFAULT, str);
    }

    @Override // X.InterfaceC67012QRs
    public void unregisterPush(Context context, int i) {
        if (context == null || i != getFcmPush()) {
            return;
        }
        QRM.LJIIIIZZ.LIZ.getClass();
    }
}
