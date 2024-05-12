package X;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.im.core.proto.SendMessageResponseBody;
import java.util.TimerTask;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.4eN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114434eN implements C4K3, C4ZO, C4ZB, InterfaceC76442zI {
    public static final C114434eN LJLIL = new C114434eN();
    public static final C64962gm LJLILLLLZI = C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()));
    public static volatile int LJLJI;
    public static volatile boolean LJLJJI;
    public static boolean LJLJJL;

    @Override // X.C4ZB
    public final void LIZJ(String str) {
    }

    public static void LJIIJJI() {
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("logoutSDK: ");
        C4ZL.LIZ();
        LIZ.append(C80763Ey.LIZIZ());
        LIZ.append(", ");
        C4ZL.LIZ();
        LIZ.append(C80763Ey.LIZLLL());
        LIZ.append(", ");
        LIZ.append(LJLJI);
        LIZ.append(C63308Osy.LJI().LJ);
        LIZ.append(", ");
        c114834f1.i("SDKManager", X1D.LIZIZ(LIZ));
        LJLJI = 0;
        if (!C63308Osy.LJI().LJ) {
            return;
        }
        C4ZL.LIZJ();
        c114834f1.i("SDKManager", "logoutSDK real");
        C4ZL.LIZJ();
        C114834f1.LJIIJJI("SendMessageLooper", "onSDKLogout");
        C4WW c4ww = (C4WW) C108094Mb.LIZIZ.getValue();
        c4ww.getClass();
        C4ZL.LIZJ();
        c114834f1.i("MsgSender_CQ", "clear");
        c4ww.LIZLLL().clear();
        HandlerC108084Ma handlerC108084Ma = (HandlerC108084Ma) C108094Mb.LIZ.getValue();
        handlerC108084Ma.getClass();
        C4ZL.LIZJ();
        c114834f1.i("MsgSender_MQ", "clear");
        ((java.util.Map) handlerC108084Ma.LIZ.getValue()).clear();
        C63308Osy.LJI().LJIIIIZZ();
        C4ZL.LIZIZ();
        C82873Nb.LJIILL();
    }

    public static void LJII(JSONObject jSONObject) {
        if (C114914f9.LIZ()) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("im_sdk_db_op_cost", Float.valueOf(0.005f));
        jSONObject2.put("im_sdk_db_op", Float.valueOf(0.005f));
        jSONObject2.put("im_sdk_conv_async_local", Float.valueOf(0.01f));
        jSONObject2.put("puller_wakeup_pull", Float.valueOf(0.05f));
        jSONObject2.put("imsdk_network_request", Float.valueOf(5.0E-5f));
        jSONObject.put("app_log_rate", jSONObject2.toString());
    }

    @Override // X.InterfaceC76442zI
    public final void LIZ(C76512zP c76512zP) {
        int i = C115224fe.LIZIZ[((EnumC115234ff) c76512zP.LJLILLLLZI).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C63383OuB LJFF = C63308Osy.LJI().LJFF();
            LJFF.getClass();
            C63322OtC.LIZIZ("IMUseCaseClient", "networkIsDisconnected");
            final C63686Oz4<SendMessageResponseBody> c63686Oz4 = LJFF.LJIILIIL;
            if (c63686Oz4.LIZJ.compareAndSet(false, true)) {
                c63686Oz4.LIZLLL.schedule(new TimerTask() { // from class: X.4eR
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            C63686Oz4.this.LIZJ();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                }, c63686Oz4.LIZIZ.LIZ);
            }
            C63322OtC.LJI("SendMessageQueue", "Pause queue", null);
            return;
        }
        C63383OuB LJFF2 = C63308Osy.LJI().LJFF();
        LJFF2.getClass();
        C63322OtC.LIZIZ("IMUseCaseClient", "networkIsResumed");
        LJFF2.LJIILIIL.LIZJ();
    }

    @Override // X.C4ZB
    public final void LIZIZ(C115104fS c115104fS) {
        int i = C115224fe.LIZ[c115104fS.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                return;
            }
            C63308Osy.LJI().LJIIIZ();
            return;
        }
        C63308Osy.LJI().LJIIJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    @Override // X.C4ZB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.common.wschannel.model.WsChannelMsg r11) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114434eN.LIZLLL(com.bytedance.common.wschannel.model.WsChannelMsg):void");
    }

    public final void LJI(boolean z) {
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ensure: ");
        LIZ.append(LJLJJI);
        LIZ.append(", ");
        LIZ.append(LJLJI);
        LIZ.append(", ");
        LIZ.append(C63308Osy.LJI().LJ);
        c114834f1.i("SDKManager", X1D.LIZIZ(LIZ));
        LJIIIIZZ(z);
        if (LJLJI != 1 && !C63308Osy.LJI().LJ) {
            LJIIJ(z);
        }
    }

    public final void LJIIIIZZ(boolean z) {
        try {
            synchronized (this) {
                LJLIL.LJIIIZ(z);
            }
        } catch (Throwable th) {
            C4ZL.LIZJ();
            C114834f1 c114834f1 = C114834f1.LIZ;
            c114834f1.LJIIL("init error", th);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_msg", C63272OsO.LIZ(th));
            jSONObject.put("error_stack", C63272OsO.LIZIZ(th));
            C4ZL.LIZJ();
            c114834f1.LJFF("im_sdk_init_error", jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v177, types: [X.4eT] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(boolean r16) {
        /*
            Method dump skipped, instructions count: 1239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114434eN.LJIIIZ(boolean):void");
    }

    public final void LJIIJ(boolean z) {
        boolean z2;
        if (!LJLJJI) {
            C4ZL.LIZJ();
            C114834f1.LJIIJJI("SDKManager", "loginSDK before init!");
            LJIIIIZZ(false);
            return;
        }
        if (LJLJJL) {
            C63308Osy.LJI().LIZLLL().LJJII = true;
            C114444eO LIZLLL = C63308Osy.LJI().LIZLLL();
            C4ZL.LIZIZ();
            LIZLLL.LJLJJL = C82873Nb.LJIIIZ().LJIIJJI.LIZJ;
        }
        C4ZL.LIZ();
        C4ZG c4zg = C4ZG.LJLIL;
        if (AV1.LJIILLIIL()) {
            C4ZL.LIZJ();
            C114834f1.LIZ.i("SDKManager", "loginSDK forbid by ftc");
            return;
        }
        C4ZL.LIZ();
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loginSDK: ");
        C4ZL.LIZ();
        LIZ.append(C80763Ey.LIZIZ());
        LIZ.append(", account_login: ");
        C4ZL.LIZ();
        LIZ.append(C80763Ey.LIZLLL());
        LIZ.append(", login_state: ");
        LIZ.append(LJLJI);
        LIZ.append(", imsdk_login: ");
        LIZ.append(C63308Osy.LJI().LJ);
        LIZ.append(' ');
        c114834f1.i("SDKManager", X1D.LIZIZ(LIZ));
        if (!C63308Osy.LJI().LJ) {
            C4ZL.LIZ();
            if (C80763Ey.LIZLLL() && C4ZH.LIZIZ()) {
                C4ZL.LIZ();
                if (c4zg.LLJJ() > 0) {
                    C4ZL.LIZJ();
                    c114834f1.i("SDKManager", "loginSDK real");
                    LJLJI = 1;
                    C4ZL.LIZIZ();
                    C82873Nb.LJFF();
                    if (C82893Nd.LIZIZ() == 4 || z) {
                        C63308Osy.LJI().LJII();
                        C4ZL.LIZIZ();
                        C82873Nb.LJ();
                        return;
                    }
                    if (C82893Nd.LIZIZ() == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        C3PV c3pv = C3PV.LJLIL;
                        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                            c3pv.invoke();
                            return;
                        } else {
                            XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C62842dM(c3pv, null), 3);
                            return;
                        }
                    }
                    if (C82893Nd.LIZIZ() == 3) {
                        C3PW c3pw = C3PW.LJLIL;
                        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                            c3pw.invoke();
                            return;
                        } else {
                            XKX.LIZLLL(LJLILLLLZI, null, null, new C62832dL(c3pw, null), 3);
                            return;
                        }
                    }
                    XKX.LIZLLL(LJLILLLLZI, null, null, new C3PS(null), 3);
                    return;
                }
            }
        }
        C4ZL.LIZJ();
        c114834f1.i("SDKManager", "loginSDK state not ready");
    }

    @Override // X.C4ZO
    public final void LJ(String str, String str2) {
        if (C33884DRo.LIZLLL()) {
            XKX.LIZLLL(LJLILLLLZI, null, null, new C66782ji(str, str2, null), 3);
        } else {
            LJIIL(str, str2);
        }
    }

    @Override // X.C4K3
    public final void LJFF(C4ZA type, C4ZM c4zm) {
        String str;
        o.LJIIIZ(type, "type");
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAccountChange: ");
        LIZ.append(type);
        LIZ.append(", ");
        if (c4zm != null) {
            str = c4zm.LIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        c114834f1.i("SDKManager", X1D.LIZIZ(LIZ));
        LJLJJL = true;
        if (type == C4ZA.LOGOUT || type == C4ZA.SWITCH) {
            LJIIJJI();
        } else {
            if (!C4ZH.LIZIZ()) {
                return;
            }
            LJIIJ(false);
        }
    }

    public final void LJIIL(String str, String str2) {
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("onTokenChanged: ", str, ", ", str2, ", ");
        LIZLLL.append(C63308Osy.LJI().LJ);
        c114834f1.i("SDKManager", X1D.LIZIZ(LIZLLL));
        if (str2 == null || str2.length() == 0) {
            if (C63308Osy.LJI().LJ) {
                LJIIJJI();
                return;
            }
            return;
        }
        if (C63308Osy.LJI().LJ) {
            C4ZL.LIZJ();
            c114834f1.i("SDKManager", "refreshSDKToken");
            C4ZL.LIZJ();
            c114834f1.i("SDKMessagePuller", "tokenPullMessage");
            if (!C4Z3.LIZ()) {
                return;
            }
            C4ZL.LIZJ();
            c114834f1.i("SDKMessagePuller", "tokenPullMessage real");
            C4Z3.LIZIZ = SystemClock.uptimeMillis();
            C63308Osy LJI = C63308Osy.LJI();
            synchronized (LJI) {
                LJI.LJIILIIL(6, null);
            }
            return;
        }
        LJIIJ(false);
    }
}
