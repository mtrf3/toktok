package com.adm.push;

import X.C16880lQ;
import X.C38354F3m;
import X.HG3;
import X.QRC;
import X.QRM;
import X.QSB;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.adm.push.AdmPushAdapter;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {
    public static long sLastSendTokenTimeStamp;
    public static String sLastToken;
    public Handler mHandler;

    private Handler getHandler(Context context) {
        if (this.mHandler == null) {
            final Context LLLLL = C16880lQ.LLLLL(context);
            this.mHandler = new Handler(LLLLL) { // from class: X.0GE
                public final Context LIZ;

                {
                    super(C16880lQ.LLJJJJ());
                    this.LIZ = C16880lQ.LLLLL(LLLLL);
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    super.handleMessage(message);
                    int i = message.what;
                    if (i != 1) {
                        if (i != 2) {
                            return;
                        }
                        try {
                            String str = (String) message.obj;
                            QRM.LJIIIIZZ();
                            QR4.LIZIZ(AdmPushAdapter.getAdmPush(), str, "");
                            QRM.LJFF().LJIILL(AdmPushAdapter.getAdmPush(), 102, (String) message.obj, "ADMMessageHandlerJob.AdmHandler return ERROR when register");
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("label", "onRegistrationError");
                                jSONObject.put("type", AdmPushAdapter.getAdmPush());
                                jSONObject.put("errorId", str);
                                QRM.LJIIIIZZ().getClass();
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                            }
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    try {
                        String str2 = (String) message.obj;
                        if (!TextUtils.isEmpty(str2)) {
                            QRM.LJIIIIZZ().LIZJ(this.LIZ, AdmPushAdapter.getAdmPush(), str2);
                        } else {
                            QRM.LJFF().LJIILL(AdmPushAdapter.getAdmPush(), 102, CardStruct.IStatusCode.DEFAULT, "token is empty");
                        }
                    } catch (Throwable th) {
                        QRM qrm = QRM.LJIIIIZZ;
                        qrm.LIZ.getClass();
                        if (!QSB.LIZ()) {
                            return;
                        }
                        HG3 hg3 = qrm.LIZ;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("ADMMessageHandlerJob.AdmHandler handleMessage error = ");
                        LIZ.append(th.getMessage());
                        X1D.LIZIZ(LIZ);
                        hg3.getClass();
                    }
                }
            };
        }
        return this.mHandler;
    }

    private void sendToken(Context context, String str) {
        try {
            HG3 hg3 = QRM.LJIIIIZZ.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ADMMessageHandlerJob sendToken = ");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            hg3.getClass();
            if (TextUtils.isEmpty(str)) {
                QRM.LJFF().LJIILL(AdmPushAdapter.getAdmPush(), 102, CardStruct.IStatusCode.DEFAULT, "ADMMessageHandlerJob token is empty");
            } else {
                getHandler(context).obtainMessage(1, str).sendToTarget();
            }
        } catch (Throwable th) {
            QRM qrm = QRM.LJIIIIZZ;
            qrm.LIZ.getClass();
            if (QSB.LIZ()) {
                HG3 hg32 = qrm.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ADMMessageHandlerJob sendToken error = ");
                LIZ2.append(Log.getStackTraceString(th));
                X1D.LIZIZ(LIZ2);
                hg32.getClass();
            }
        }
    }

    public void onMessage(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        QRM qrm = QRM.LJIIIIZZ;
        qrm.LIZ.getClass();
        if (QSB.LIZ()) {
            HG3 hg3 = qrm.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ADMMessageHandlerJob onMessage: ");
            LIZ.append(intent);
            X1D.LIZIZ(LIZ);
            hg3.getClass();
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI == null) {
            return;
        }
        try {
            String string = LLJJIJI.getString("payload");
            ((QRC) QRM.LJI()).LJ(AdmPushAdapter.getAdmPush(), string);
        } catch (Exception e) {
            HG3 hg32 = QRM.LJIIIIZZ.LIZ;
            e.getMessage();
            hg32.getClass();
        }
    }

    public void onRegistered(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sLastSendTokenTimeStamp < 2000 && C38354F3m.LIZJ(str, sLastToken)) {
            return;
        }
        sLastSendTokenTimeStamp = currentTimeMillis;
        sLastToken = str;
        sendToken(context, str);
    }

    public void onRegistrationError(Context context, String str) {
        QRM qrm = QRM.LJIIIIZZ;
        qrm.LIZ.getClass();
        if (QSB.LIZ()) {
            HG3 hg3 = qrm.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ADMMessageHandlerJob onRegistrationError: ");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            hg3.getClass();
        }
        getHandler(context).obtainMessage(2, str).sendToTarget();
    }

    public void onUnregistered(Context context, String str) {
        QRM qrm = QRM.LJIIIIZZ;
        qrm.LIZ.getClass();
        if (QSB.LIZ()) {
            HG3 hg3 = qrm.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ADMMessageHandlerJob unregisterPush: ");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            hg3.getClass();
        }
    }
}
