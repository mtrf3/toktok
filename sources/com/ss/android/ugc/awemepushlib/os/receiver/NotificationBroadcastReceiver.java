package com.ss.android.ugc.awemepushlib.os.receiver;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C38836FMa;
import X.C76917UGr;
import X.C84763XOl;
import X.FMX;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class NotificationBroadcastReceiver extends BroadcastReceiver {
    public static final String TYPE = "type";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map] */
    public void com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver__onReceive$___twin___(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        String action = intent.getAction();
        int intExtra = intent.getIntExtra("type", -1);
        if (intExtra != -1) {
            ((NotificationManager) C16880lQ.LLILL(context, "notification")).cancel(intExtra);
        }
        Intent intent2 = (Intent) intent.getParcelableExtra("contentIntentURI");
        if ("notification_clicked".equals(action) && intent2 != null) {
            try {
                intent2.getDataString();
                C16880lQ.LIZJ(context, intent2);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (!"notification_cancelled".equals(action)) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        if (C76917UGr.LJJIFFI(-1, "message_from", intent) == 10001) {
            hashMap.put("push_label", "non_login_push");
            hashMap.put("real_timestamp", String.valueOf(System.currentTimeMillis() / 1000));
            hashMap.put("rule_id", String.valueOf(C76917UGr.LJJIIZI(intent, "push_rule_id")));
            hashMap.put("show_rank", String.valueOf(C76917UGr.LJJIFFI(-1, "non_login_push_show_rank", intent)));
            hashMap.put("colorized", CardStruct.IStatusCode.DEFAULT);
            hashMap.put("has_image", CardStruct.IStatusCode.DEFAULT);
            hashMap.put("has_button", CardStruct.IStatusCode.DEFAULT);
            FMX.LJIILIIL("non_login_push_clear", hashMap, true);
            return;
        }
        if (intent2 != null) {
            hashMap2 = (Map) intent2.getSerializableExtra("log_data_extra_to_adsapp");
        }
        C38836FMa.LIZLLL("push_clear", hashMap2);
    }

    public static void com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(NotificationBroadcastReceiver notificationBroadcastReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            notificationBroadcastReceiver.com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver__onReceive$___twin___(context, intent);
        } else {
            C38523F9z.LIZ();
            notificationBroadcastReceiver.com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(NotificationBroadcastReceiver notificationBroadcastReceiver, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(notificationBroadcastReceiver, context, intent);
    }
}
