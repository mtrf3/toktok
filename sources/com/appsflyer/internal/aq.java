package com.appsflyer.internal;

import X.C16880lQ;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes.dex */
public final class aq {
    public static Uri AFInAppEventParameterName(Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "android.intent.extra.REFERRER_NAME");
        if (LLJJIJIIJIL != null) {
            return UriProtector.parse(LLJJIJIIJIL);
        }
        return null;
    }
}
