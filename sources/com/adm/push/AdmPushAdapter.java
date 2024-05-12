package com.adm.push;

import X.C16880lQ;
import X.C17860n0;
import X.C66994QRa;
import X.C66995QRb;
import X.C66996QRc;
import X.C67001QRh;
import X.C67007QRn;
import X.HG3;
import X.InterfaceC67012QRs;
import X.QM0;
import X.QRM;
import X.QSB;
import X.X1D;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class AdmPushAdapter implements InterfaceC67012QRs {
    public static int ADM_PUSH = -1;
    public static boolean sSupport;

    public boolean requestNotificationPermission(int i) {
        return false;
    }

    static {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            sSupport = true;
        } catch (Throwable th) {
            HG3 hg3 = QRM.LJIIIIZZ.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ADM not found");
            LIZ.append(th.getMessage());
            X1D.LIZIZ(LIZ);
            hg3.getClass();
        }
    }

    public static int getAdmPush() {
        if (ADM_PUSH == -1) {
            ADM_PUSH = C67007QRn.LJI(QM0.LIZ).LIZJ(AdmPushAdapter.class.getName());
        }
        return ADM_PUSH;
    }

    private boolean isSupport(Context context) {
        try {
            if (!sSupport) {
                return false;
            }
            if (!C17860n0.LIZ(context).LIZIZ()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.InterfaceC67012QRs
    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z;
        boolean z2;
        C67001QRh c67001QRh;
        String[] strArr;
        boolean z3 = false;
        try {
            InputStream open = context.getAssets().open("api_key.txt");
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            z = true;
        } catch (IOException e2) {
            C16880lQ.LLLLIIL(e2);
            z = false;
            QRM.LJIIIIZZ.LIZ.getClass();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(context.getPackageName());
        LIZ.append(".permission.RECEIVE_ADM_MESSAGE");
        List asList = Arrays.asList(X1D.LIZIZ(LIZ), "com.amazon.device.messaging.permission.RECEIVE", "android.permission.WAKE_LOCK");
        if (C66994QRa.LIZ == null) {
            synchronized (C66994QRa.class) {
                if (C66994QRa.LIZ == null && (strArr = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 4096).requestedPermissions) != null) {
                    C66994QRa.LIZ = Arrays.asList(strArr);
                }
            }
        }
        List<String> list = C66994QRa.LIZ;
        if (list == null || list.isEmpty()) {
            HG3 hg3 = QRM.LJIIIIZZ.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AdmPush error");
            LIZ2.append(".You need to declare permission(s) {");
            LIZ2.append(asList);
            LIZ2.append("} in AndroidManifest.xml");
            X1D.LIZIZ(LIZ2);
            hg3.getClass();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : asList) {
                if (!list.contains(obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                HG3 hg32 = QRM.LJIIIIZZ.LIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("AdmPush error");
                LIZ3.append(".You need to declare permission(s) {");
                LIZ3.append(arrayList);
                LIZ3.append("} in AndroidManifest.xml");
                X1D.LIZIZ(LIZ3);
                hg32.getClass();
            } else {
                z2 = true;
                boolean z4 = z & z2;
                C67001QRh c67001QRh2 = new C67001QRh("com.adm.push.ADMMessageHandler");
                String packageName = context.getPackageName();
                C66995QRb c66995QRb = c67001QRh2.LIZ;
                c66995QRb.LIZJ = packageName;
                C67001QRh c67001QRh3 = new C67001QRh("com.adm.push.ADMMessageHandlerJob");
                String packageName2 = context.getPackageName();
                C66995QRb c66995QRb2 = c67001QRh3.LIZ;
                c66995QRb2.LIZJ = packageName2;
                c66995QRb2.LIZLLL = "android.permission.BIND_JOB_SERVICE";
                boolean LIZIZ = C66994QRa.LIZIZ(context, "Adm push AndroidManifest.xml configure error", Arrays.asList(c66995QRb, c66995QRb2));
                c67001QRh = new C67001QRh("com.adm.push.ADMMessageHandler$Receiver");
                String packageName3 = context.getPackageName();
                C66995QRb c66995QRb3 = c67001QRh.LIZ;
                c66995QRb3.LIZJ = packageName3;
                c66995QRb3.LIZLLL = "com.amazon.device.messaging.permission.SEND";
                c67001QRh.LIZ(new C66996QRc(Arrays.asList("com.amazon.device.messaging.intent.REGISTRATION", "com.amazon.device.messaging.intent.RECEIVE"), Collections.singletonList(context.getPackageName())));
                if (C66994QRa.LIZ(context, "Adm push AndroidManifest.xml configure error", Collections.singletonList(c67001QRh.LIZ)) && LIZIZ) {
                    z3 = true;
                }
                return z3 & z4;
            }
        }
        z2 = false;
        boolean z42 = z & z2;
        C67001QRh c67001QRh22 = new C67001QRh("com.adm.push.ADMMessageHandler");
        String packageName4 = context.getPackageName();
        C66995QRb c66995QRb4 = c67001QRh22.LIZ;
        c66995QRb4.LIZJ = packageName4;
        C67001QRh c67001QRh32 = new C67001QRh("com.adm.push.ADMMessageHandlerJob");
        String packageName22 = context.getPackageName();
        C66995QRb c66995QRb22 = c67001QRh32.LIZ;
        c66995QRb22.LIZJ = packageName22;
        c66995QRb22.LIZLLL = "android.permission.BIND_JOB_SERVICE";
        boolean LIZIZ2 = C66994QRa.LIZIZ(context, "Adm push AndroidManifest.xml configure error", Arrays.asList(c66995QRb4, c66995QRb22));
        c67001QRh = new C67001QRh("com.adm.push.ADMMessageHandler$Receiver");
        String packageName32 = context.getPackageName();
        C66995QRb c66995QRb32 = c67001QRh.LIZ;
        c66995QRb32.LIZJ = packageName32;
        c66995QRb32.LIZLLL = "com.amazon.device.messaging.permission.SEND";
        c67001QRh.LIZ(new C66996QRc(Arrays.asList("com.amazon.device.messaging.intent.REGISTRATION", "com.amazon.device.messaging.intent.RECEIVE"), Collections.singletonList(context.getPackageName())));
        if (C66994QRa.LIZ(context, "Adm push AndroidManifest.xml configure error", Collections.singletonList(c67001QRh.LIZ))) {
            z3 = true;
        }
        return z3 & z42;
    }

    @Override // X.InterfaceC67012QRs
    public boolean isPushAvailable(Context context, int i) {
        QRM qrm = QRM.LJIIIIZZ;
        qrm.LIZ.getClass();
        if (QSB.LIZ()) {
            HG3 hg3 = qrm.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isPushAvailable: ");
            LIZ.append(isSupport(context));
            X1D.LIZIZ(LIZ);
            hg3.getClass();
        }
        return isSupport(context);
    }

    @Override // X.InterfaceC67012QRs
    public void registerPush(Context context, int i) {
        String str;
        if (context != null) {
            if (i != getAdmPush() || !isSupport(context)) {
                if (i != getAdmPush()) {
                    str = "register sender error";
                } else if (!isSupport(context)) {
                    str = "this device does not support adm sender";
                } else {
                    str = null;
                }
            } else {
                HG3 hg3 = QRM.LJIIIIZZ.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("registerPush: ");
                LIZ.append(i);
                X1D.LIZIZ(LIZ);
                hg3.getClass();
                C17860n0.LIZ(context).LIZJ();
                return;
            }
        } else {
            str = "context is empty";
        }
        QRM.LJFF().LJIILL(i, 101, CardStruct.IStatusCode.DEFAULT, str);
    }

    @Override // X.InterfaceC67012QRs
    public void unregisterPush(Context context, int i) {
        if (context == null || i != getAdmPush() || !isSupport(context)) {
            return;
        }
        HG3 hg3 = QRM.LJIIIIZZ.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unregisterPush: ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        hg3.getClass();
        C17860n0.LIZ(context).LIZLLL();
    }

    @Override // X.InterfaceC67012QRs
    public void setAlias(Context context, String str, int i) {
        if (context == null || i != getAdmPush() || !isSupport(context)) {
            return;
        }
        HG3 hg3 = QRM.LJIIIIZZ.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAlias: ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        hg3.getClass();
    }

    @Override // X.InterfaceC67012QRs
    public void trackPush(Context context, int i, Object obj) {
        if (context == null || i != getAdmPush() || !isSupport(context)) {
            return;
        }
        HG3 hg3 = QRM.LJIIIIZZ.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("trackPush: ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        hg3.getClass();
    }
}
