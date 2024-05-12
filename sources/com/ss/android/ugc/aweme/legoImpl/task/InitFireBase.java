package com.ss.android.ugc.aweme.legoImpl.task;

import X.C09900aA;
import X.C0RN;
import X.C16880lQ;
import X.C1DG;
import X.C1GE;
import X.C35274Dss;
import X.C48029It7;
import X.C63053Oor;
import X.C67195QYt;
import X.C67637Qgb;
import X.C67641Qgf;
import X.C67646Qgk;
import X.C68074Qne;
import X.C68154Qow;
import X.CallableC67219QZr;
import X.E2C;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F9J;
import X.FCD;
import X.FLL;
import X.InterfaceC36076EDw;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS78S1100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class InitFireBase implements EE1, InterfaceC36076EDw {
    @Override // X.EEY
    public final String key() {
        return "InitFireBase";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.InterfaceC36076EDw
    public final String[] deps() {
        return new String[]{"AccountInitializerTask"};
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        if (((Boolean) C35274Dss.LJIIIIZZ.getValue()).booleanValue()) {
            return EnumC36092EEm.FIRST_WINDOW_FOCUS;
        }
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C67646Qgk LIZLLL;
        C48029It7 c48029It7;
        try {
            o.LJIIIZ(context, "context");
            C67195QYt.LJFF(context);
        } catch (Exception e) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_reason", e.toString());
                C09900aA.LJI("firebase_initialize_error", jSONObject, null, null);
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            C16880lQ.LLLLIIL(e);
        }
        if (!FCD.LJI(context)) {
            return;
        }
        try {
            FirebaseMessaging.LIZJ().getClass();
            C67195QYt LIZIZ = C67195QYt.LIZIZ();
            LIZIZ.LIZ();
            F9J.LIZIZ(LIZIZ.LIZ, 0, "com.google.firebase.messaging").edit().putBoolean("export_to_big_query", true).apply();
        } catch (Exception e3) {
            C16880lQ.LLLLIIL(e3);
        }
        String serverDeviceId = AppLog.getServerDeviceId();
        C63053Oor LIZ = C63053Oor.LIZIZ.LIZ(context);
        if (!TextUtils.isEmpty(serverDeviceId)) {
            TokenCert cert = TokenCert.with("bpea-firebase_androidsdk_1992");
            o.LJIIIZ(cert, "cert");
            C1GE.LJIJJ(cert, "Firebase", "setUserId", new AqS78S1100000_11(LIZ, serverDeviceId, 12));
        }
        FirebaseAnalytics firebaseAnalytics = LIZ.LIZ;
        firebaseAnalytics.getClass();
        try {
            synchronized (FirebaseAnalytics.class) {
                if (firebaseAnalytics.LIZIZ == null) {
                    firebaseAnalytics.LIZIZ = new C48029It7(TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                c48029It7 = firebaseAnalytics.LIZIZ;
            }
            LIZLLL = C67637Qgb.LIZJ(new CallableC67219QZr(firebaseAnalytics), c48029It7);
        } catch (RuntimeException e4) {
            C68074Qne c68074Qne = firebaseAnalytics.LIZ;
            c68074Qne.getClass();
            c68074Qne.LIZIZ(new C68154Qow(c68074Qne, "Failed to schedule task for getAppInstanceId", null));
            LIZLLL = C67637Qgb.LIZLLL(e4);
        }
        LIZLLL.LJFF(C67641Qgf.LIZ, new E2C());
        LIZLLL.LJIILLIIL(new C1DG());
        UgCommonServiceImpl.LJIJ().LJIIJJI();
        FLL.LIZIZ();
    }
}
