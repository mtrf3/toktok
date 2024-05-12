package com.heytap.mcssdk.e;

import X.X1D;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.mcssdk.utils.d;
import com.heytap.mcssdk.utils.f;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.BaseMode;

/* loaded from: classes28.dex */
public class a implements c {
    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.heytap.mcssdk.c.b bVar, PushService pushService) {
        int i;
        String str;
        if (bVar == null) {
            str = "message is null , please check param of parseCommandMessage(2)";
        } else if (pushService == null) {
            str = "pushService is null , please check param of parseCommandMessage(2)";
        } else {
            if (pushService.getPushCallback() != null) {
                int e = bVar.e();
                if (e == 12287) {
                    ICallBackResultService pushCallback = pushService.getPushCallback();
                    if (pushCallback != null) {
                        pushCallback.onError(bVar.g(), bVar.f());
                        return;
                    }
                    return;
                }
                if (e == 12298) {
                    pushService.getPushCallback().onSetPushTime(bVar.g(), bVar.f());
                    return;
                }
                if (e == 12306) {
                    pushService.getPushCallback().onGetPushStatus(bVar.g(), Utils.parseInt(bVar.f()));
                    return;
                }
                if (e == 12309) {
                    pushService.getPushCallback().onGetNotificationStatus(bVar.g(), Utils.parseInt(bVar.f()));
                    return;
                }
                if (e == 12289) {
                    if (bVar.g() == 0) {
                        pushService.setRegisterID(bVar.f());
                    }
                    pushService.getPushCallback().onRegister(bVar.g(), bVar.f());
                    return;
                }
                if (e == 12290) {
                    pushService.getPushCallback().onUnRegister(bVar.g());
                    return;
                }
                switch (e) {
                    case 12316:
                    case 12317:
                        ISetAppNotificationCallBackService pushSetAppNotificationCallBack = pushService.getPushSetAppNotificationCallBack();
                        if (pushSetAppNotificationCallBack != null) {
                            pushSetAppNotificationCallBack.onSetAppNotificationSwitch(bVar.g());
                            return;
                        }
                        return;
                    case 12318:
                        try {
                            i = CastIntegerProtector.parseInt(bVar.f());
                        } catch (Exception unused) {
                            i = 0;
                        }
                        IGetAppNotificationCallBackService pushGetAppNotificationCallBack = pushService.getPushGetAppNotificationCallBack();
                        if (pushGetAppNotificationCallBack != null) {
                            pushGetAppNotificationCallBack.onGetAppNotificationSwitch(bVar.g(), i);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            str = "pushService.getPushCallback() is null , please check param of parseCommandMessage(2)";
        }
        d.e(str);
    }

    @Override // com.heytap.mcssdk.e.c
    public void a(Context context, BaseMode baseMode, IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4105) {
            final com.heytap.mcssdk.c.b bVar = (com.heytap.mcssdk.c.b) baseMode;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mcssdk-CallBackResultProcessor:");
            LIZ.append(bVar.toString());
            d.b(X1D.LIZIZ(LIZ));
            f.b(new Runnable() { // from class: com.heytap.mcssdk.e.a.1
                @Override // java.lang.Runnable
                public void run() {
                    com_heytap_mcssdk_e_a$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_heytap_mcssdk_e_a$1__run$___twin___() {
                    a.this.a(bVar, PushService.a.a);
                }

                public static void com_heytap_mcssdk_e_a$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ2;
                    try {
                        anonymousClass1.com_heytap_mcssdk_e_a$1__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
    }
}
