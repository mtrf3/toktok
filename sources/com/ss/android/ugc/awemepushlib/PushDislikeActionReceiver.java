package com.ss.android.ugc.awemepushlib;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C67228Qa0;
import X.C84763XOl;
import X.FMX;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class PushDislikeActionReceiver extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String queryParameter;
        if (intent == null || (str = C16880lQ.LLJJIJIIJIL(intent, "action_id")) == null) {
            str = "push_body";
        }
        String str7 = "";
        if (intent == null || (str2 = C16880lQ.LLJJIJIIJIL(intent, "url_string")) == null) {
            str2 = "";
        }
        if (intent == null || (str3 = C16880lQ.LLJJIJIIJIL(intent, "author_id")) == null) {
            str3 = "";
        }
        if (intent == null || (str4 = C16880lQ.LLJJIJIIJIL(intent, "user_id")) == null) {
            str4 = "";
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            C67228Qa0.LIZJ(str2, hashMap);
        }
        Uri parse = UriProtector.parse(str2);
        if (parse != null && (queryParameter = UriProtector.getQueryParameter(parse, "rec_type")) != null) {
            str7 = queryParameter;
        }
        hashMap.put("rec_type", str7);
        hashMap.put("author_id", str3);
        hashMap.put("push_channel", "GCM");
        hashMap.put("user_id", str4);
        if (AccountService.LJIJ().LJFF().isLogin()) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_login", str5);
        hashMap.put("position", str);
        FMX.LJIIL("push_click_dislike", hashMap);
        int i = -1;
        if (intent != null && intent.getIntExtra("need_clear_notification_push_id", -1) == -1) {
            return;
        }
        PushService pushService = new PushService();
        if (intent != null) {
            str6 = C16880lQ.LLJJIJIIJIL(intent, "cancel_TAG");
            i = intent.getIntExtra("need_clear_notification_push_id", -1);
        } else {
            str6 = null;
        }
        pushService.clearNotificationId(str6, context, i);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
