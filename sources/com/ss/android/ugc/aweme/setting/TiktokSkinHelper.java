package com.ss.android.ugc.aweme.setting;

import X.C16880lQ;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class TiktokSkinHelper {
    public static boolean LIZ;

    public static void LIZ(Resources resources) {
        if (!LIZ) {
            return;
        }
        Configuration configuration = resources.getConfiguration();
        int i = configuration.uiMode;
        if ((i & 48) != 16) {
            configuration.uiMode = (i & (-49)) | 16;
            resources.updateConfiguration(configuration, null);
            if (Build.VERSION.SDK_INT < 26) {
                try {
                    Method declaredMethod = Class.forName("androidx.appcompat.app.ResourcesFlusher").getDeclaredMethod("flush", Resources.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(null, resources);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }
}
