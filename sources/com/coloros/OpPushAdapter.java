package com.coloros;

import X.C16880lQ;
import X.C36929EeT;
import X.C66994QRa;
import X.C66995QRb;
import X.C66996QRc;
import X.C67001QRh;
import X.C67007QRn;
import X.HG3;
import X.InterfaceC67012QRs;
import X.QM0;
import X.QP5;
import X.QR4;
import X.QRM;
import X.QSB;
import X.R39;
import X.RunnableC91656Zy8;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes28.dex */
public class OpPushAdapter implements InterfaceC67012QRs, ICallBackResultService {
    public static int OP_PUSH = -1;
    public Context mContext;
    public String mRegisterId;

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onGetNotificationStatus(int i, int i2) {
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onGetPushStatus(int i, int i2) {
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onSetPushTime(int i, String str) {
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onUnRegister(int i) {
    }

    @Override // X.InterfaceC67012QRs
    public void setAlias(Context context, String str, int i) {
    }

    @Override // X.InterfaceC67012QRs
    public void trackPush(Context context, int i, Object obj) {
    }

    public static int getOpPush() {
        if (OP_PUSH == -1) {
            OP_PUSH = C67007QRn.LJI(QM0.LIZ).LIZJ(OpPushAdapter.class.getName());
        }
        return OP_PUSH;
    }

    public boolean requestNotificationPermission(int i) {
        try {
            QRM.LJII().getClass();
            R39.LIZJ("push_guide_request_oppo", null);
        } catch (Throwable unused) {
        }
        if (i != getOpPush()) {
            HG3 hg3 = QRM.LJIIIIZZ.LIZ;
            getOpPush();
            hg3.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("result_value", CardStruct.IStatusCode.DEFAULT);
                jSONObject.put("error_msg", "push_type is not for oppo");
                QRM.LJII().getClass();
                R39.LIZJ("push_guide_show_oppo", jSONObject);
            } catch (Throwable unused2) {
            }
            return false;
        }
        if (TextUtils.isEmpty(this.mRegisterId)) {
            QRM.LJIIIIZZ.LIZ.getClass();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("result_value", CardStruct.IStatusCode.DEFAULT);
                jSONObject2.put("error_msg", "oppo register failed or not registered");
                QRM.LJII().getClass();
                R39.LIZJ("push_guide_show_oppo", jSONObject2);
            } catch (Throwable unused3) {
            }
            return false;
        }
        if (1 != C36929EeT.LIZJ(this.mContext)) {
            HeytapPushManager.requestNotificationPermission();
            QRM.LJIIIIZZ.LIZ.getClass();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("result_value", "1");
                jSONObject3.put("error_msg", "success");
                QRM.LJII().getClass();
                R39.LIZJ("push_guide_show_oppo", jSONObject3);
            } catch (Throwable unused4) {
            }
            QP5.LIZ().LIZIZ(TimeUnit.SECONDS.toMillis(15L), new RunnableC91656Zy8(this));
        } else {
            QRM.LJIIIIZZ.LIZ.getClass();
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("result_value", CardStruct.IStatusCode.DEFAULT);
                jSONObject4.put("error_msg", "already has permission");
                QRM.LJII().getClass();
                R39.LIZJ("push_guide_show_oppo", jSONObject4);
            } catch (Throwable unused5) {
            }
        }
        return true;
    }

    @Override // X.InterfaceC67012QRs
    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z;
        Pair<String, String> LIZ = QRM.LJIIIIZZ().LIZ(getOpPush());
        if (LIZ == null || TextUtils.isEmpty((CharSequence) LIZ.first) || TextUtils.isEmpty((CharSequence) LIZ.second)) {
            QRM.LJIIIIZZ.LIZ.getClass();
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z & true;
        ArrayList arrayList = new ArrayList();
        C67001QRh c67001QRh = new C67001QRh("com.heytap.msp.push.service.DataMessageCallbackService");
        String packageName = context.getPackageName();
        C66995QRb c66995QRb = c67001QRh.LIZ;
        c66995QRb.LIZJ = packageName;
        c66995QRb.LIZLLL = "com.heytap.mcs.permission.SEND_PUSH_MESSAGE";
        c67001QRh.LIZ(new C66996QRc(Collections.singletonList("com.heytap.mcs.action.RECEIVE_MCS_MESSAGE"), null));
        c67001QRh.LIZ(new C66996QRc(Collections.singletonList("com.heytap.msp.push.RECEIVE_MCS_MESSAGE"), null));
        C66995QRb c66995QRb2 = c67001QRh.LIZ;
        C67001QRh c67001QRh2 = new C67001QRh("com.heytap.msp.push.service.CompatibleDataMessageCallbackService");
        String packageName2 = context.getPackageName();
        C66995QRb c66995QRb3 = c67001QRh2.LIZ;
        c66995QRb3.LIZJ = packageName2;
        c66995QRb3.LIZLLL = "com.coloros.mcs.permission.SEND_MCS_MESSAGE";
        c67001QRh2.LIZ(new C66996QRc(Collections.singletonList("com.coloros.mcs.action.RECEIVE_MCS_MESSAGE"), null));
        C66995QRb c66995QRb4 = c67001QRh2.LIZ;
        arrayList.add(c66995QRb2);
        arrayList.add(c66995QRb4);
        return z2 & C66994QRa.LIZIZ(context, "OPPOPush", arrayList);
    }

    @Override // X.InterfaceC67012QRs
    public boolean isPushAvailable(Context context, int i) {
        try {
            return HeytapPushManager.isSupportPush(context);
        } catch (Throwable th) {
            HG3 hg3 = QRM.LJIIIIZZ.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("register onSuccess registerId = ");
            LIZ.append(Log.getStackTraceString(th));
            X1D.LIZIZ(LIZ);
            hg3.getClass();
            return false;
        }
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onError(int i, String str) {
        HG3 hg3 = QRM.LJIIIIZZ.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError i = ");
        LIZ.append(i);
        LIZ.append("  error:");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        hg3.getClass();
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onRegister(int i, String str) {
        if (i == 0) {
            if (!TextUtils.isEmpty(str)) {
                HG3 hg3 = QRM.LJIIIIZZ.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("register onSuccess registerId = ");
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
                hg3.getClass();
                this.mRegisterId = str;
                QRM.LJIIIIZZ().LIZJ(this.mContext, getOpPush(), str);
                return;
            }
            QRM.LJFF().LJIILL(getOpPush(), 102, CardStruct.IStatusCode.DEFAULT, "token is empty");
            return;
        }
        HG3 hg32 = QRM.LJIIIIZZ.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("register onFailure resultCode ");
        LIZ2.append(i);
        LIZ2.append(" registerId = ");
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        hg32.getClass();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(i);
        LIZ3.append(" ");
        LIZ3.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ3);
        QRM.LJIIIIZZ();
        QR4.LIZIZ(getOpPush(), String.valueOf(i), LIZIZ);
        QRM.LJFF().LJIILL(getOpPush(), 104, String.valueOf(i), LIZIZ);
    }

    @Override // X.InterfaceC67012QRs
    public void registerPush(Context context, int i) {
        String str;
        if (context != null) {
            if (i != getOpPush() || !HeytapPushManager.isSupportPush(context)) {
                if (i != getOpPush()) {
                    str = "register channel error";
                } else {
                    str = "the phone does not support OP Push";
                }
            } else {
                this.mContext = C16880lQ.LLLLL(context);
                QRM qrm = QRM.LJIIIIZZ;
                qrm.LIZ.getClass();
                Pair<String, String> LIZ = QRM.LJIIIIZZ().LIZ(getOpPush());
                if (LIZ == null) {
                    QRM.LJFF().LJIILL(i, 106, CardStruct.IStatusCode.DEFAULT, "configuration error");
                    return;
                }
                try {
                    Context LLLLL = C16880lQ.LLLLL(context);
                    qrm.LIZ.getClass();
                    HeytapPushManager.init(LLLLL, QSB.LIZ());
                    HeytapPushManager.register(context, (String) LIZ.first, (String) LIZ.second, this);
                } catch (Throwable th) {
                    HG3 hg3 = QRM.LJIIIIZZ.LIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("op register push get exception=");
                    LIZ2.append(th.getMessage());
                    X1D.LIZIZ(LIZ2);
                    hg3.getClass();
                }
                HeytapPushManager.resumePush();
                return;
            }
        } else {
            str = "context is null";
        }
        QRM.LJFF().LJIILL(i, 101, CardStruct.IStatusCode.DEFAULT, str);
    }

    @Override // X.InterfaceC67012QRs
    public void unregisterPush(Context context, int i) {
        if (context == null || i != getOpPush() || !HeytapPushManager.isSupportPush(context)) {
            return;
        }
        QRM.LJIIIIZZ.LIZ.getClass();
        try {
            HeytapPushManager.pausePush();
            HeytapPushManager.unRegister();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
