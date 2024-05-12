package com.ss.android.ugc.awemepushlib.os.receiver;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.bytedance.common.utility.Logger;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class ScreenReceiver extends BroadcastReceiver {
    public static String sExtra = null;
    public static int sFrom = -1;
    public static String sMsg;
    public Handler mHandler = new Handler(C16880lQ.LLJJJJ());

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public void sendPush(Context context, String str, int i, String str2) {
    }

    public void com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver__onReceive$___twin___(final Context context, Intent intent) {
        String action = intent.getAction();
        Logger.debug();
        if (!"android.intent.action.USER_PRESENT".equals(action) || sFrom < 0) {
            return;
        }
        try {
            this.mHandler.postDelayed(new Runnable() { // from class: com.ss.android.ugc.awemepushlib.os.receiver.ScreenReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver$1__run$___twin___() {
                    ScreenReceiver.this.sendPush(context, ScreenReceiver.sMsg, ScreenReceiver.sFrom, ScreenReceiver.sExtra);
                }

                public static void com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            }, 2000L);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(ScreenReceiver screenReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            screenReceiver.com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver__onReceive$___twin___(context, intent);
        } else {
            C38523F9z.LIZ();
            screenReceiver.com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(ScreenReceiver screenReceiver, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(screenReceiver, context, intent);
    }
}
