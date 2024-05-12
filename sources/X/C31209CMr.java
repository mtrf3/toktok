package X;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: X.CMr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31209CMr {
    public static void LIZ(Context context) {
        Method declaredMethod;
        LIZIZ(context, 0, "live-app-core-sdk");
        LIZIZ(context, 0, "ttlive_live_user");
        LIZIZ(context, 0, "live_fans_comment_guide");
        LIZIZ(context, 0, "live_fans_club_tips");
        LIZIZ(context, 0, "extra_group");
        LIZIZ(context, 4, "pay_controll");
        LIZIZ(context, 4, "ttlive_sdk_shared_pref_cache");
        try {
            Class<?> cls = Class.forName("com.bytedance.android.livesdk.i18n.I18nDbManager");
            if (cls != null) {
                if (context == null) {
                    declaredMethod = cls.getDeclaredMethod("prepareInit", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(null, new Object[0]);
                } else {
                    declaredMethod = cls.getDeclaredMethod("prepareInit", Context.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(null, context);
                }
                declaredMethod.setAccessible(false);
            }
        } catch (Exception unused) {
        }
    }

    public static void LIZIZ(Context context, int i, String str) {
        if (context != null && str.length() > 0) {
            F9J.LIZIZ(context, i, str);
        }
    }
}
