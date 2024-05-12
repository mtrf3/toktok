package com.heytap.mcssdk.utils;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushService;

/* loaded from: classes28.dex */
public class DataMessageUtil {
    public static final String TYPE = "type";

    public void appArrive(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction(PushService.a.a.getReceiveSdkAction(context));
            intent.setPackage(PushService.a.a.getMcsPackageName(context));
            intent.putExtra("appPackage", context.getPackageName());
            intent.putExtra("messageID", str);
            intent.putExtra("type", 12312);
            C16880lQ.LLLL(context, intent);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("statisticMessage--Exception");
            LIZ.append(e.getMessage());
            d.e(X1D.LIZIZ(LIZ));
        }
    }
}
