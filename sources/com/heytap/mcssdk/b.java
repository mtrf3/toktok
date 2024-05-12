package com.heytap.mcssdk;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.d.c;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.mcssdk.utils.d;
import com.heytap.mcssdk.utils.f;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import java.util.List;

/* loaded from: classes28.dex */
public class b {
    public static void a(final Context context, final Intent intent, final IDataMessageCallBackService iDataMessageCallBackService) {
        if (context == null) {
            d.e("context is null , please check param of parseIntent()");
            return;
        }
        if (intent == null) {
            d.e("intent is null , please check param of parseIntent()");
            return;
        }
        if (iDataMessageCallBackService == null) {
            d.e("callback is null , please check param of parseIntent()");
        } else if (Utils.isSupportPushByClient(context)) {
            f.a(new Runnable() { // from class: com.heytap.mcssdk.b.1
                @Override // java.lang.Runnable
                public void run() {
                    com_heytap_mcssdk_b$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_heytap_mcssdk_b$1__run$___twin___() {
                    List<BaseMode> a = c.a(context, intent);
                    if (a == null) {
                        return;
                    }
                    for (BaseMode baseMode : a) {
                        if (baseMode != null) {
                            for (com.heytap.mcssdk.e.c cVar : PushService.a.a.getProcessors()) {
                                if (cVar != null) {
                                    cVar.a(context, baseMode, iDataMessageCallBackService);
                                }
                            }
                        }
                    }
                }

                public static void com_heytap_mcssdk_b$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_heytap_mcssdk_b$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } else {
            d.e("push is null ,please check system has push");
        }
    }
}
