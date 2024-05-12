package androidx.core.app;

import X.C06K;
import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class FcmJobIntentService extends JobIntentService {
    public void androidx_core_app_FcmJobIntentService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        androidx_core_app_FcmJobIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    @Override // androidx.core.app.JobIntentService
    public C06K dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void androidx_core_app_FcmJobIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(FcmJobIntentService fcmJobIntentService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        fcmJobIntentService.androidx_core_app_FcmJobIntentService__attachBaseContext$___twin___(context);
    }
}
