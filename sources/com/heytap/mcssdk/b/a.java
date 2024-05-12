package com.heytap.mcssdk.b;

import X.C16880lQ;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.f;
import com.zhiliaoapp.musically.R;

/* loaded from: classes28.dex */
public class a {
    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context, String str, String str2, int i) {
        NotificationManager notificationManager;
        if (context == null || (notificationManager = (NotificationManager) C16880lQ.LLILL(context, "notification")) == null) {
            return false;
        }
        notificationManager.createNotificationChannel(new NotificationChannel(str, str2, i));
        return true;
    }

    public void a(final Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        f.a(new Runnable() { // from class: com.heytap.mcssdk.b.a.1
            public void com_heytap_mcssdk_b_a$1__run$___twin___() {
                if (e.f().a()) {
                    return;
                }
                String string = context.getString(R.string.a);
                if (TextUtils.isEmpty(string)) {
                    string = "System Default Channel";
                }
                e.f().a(a.this.a(context, "Heytap PUSH", string, 3));
            }

            @Override // java.lang.Runnable
            public void run() {
                com_heytap_mcssdk_b_a$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_heytap_mcssdk_b_a$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_heytap_mcssdk_b_a$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
