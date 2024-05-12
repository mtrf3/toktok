package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.settings.EcomCommonSparkInterceptorChannels;

/* renamed from: X.2d8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62702d8 {
    public static final String[] LIZ;

    static {
        EcomCommonSparkInterceptorChannels ecomCommonSparkInterceptorChannels = new EcomCommonSparkInterceptorChannels();
        EcomCommonSparkInterceptorChannels ecomCommonSparkInterceptorChannels2 = (EcomCommonSparkInterceptorChannels) SettingsManager.LIZLLL().LJIIIIZZ("ecom_common_spark_interceptor_channels", EcomCommonSparkInterceptorChannels.class, ecomCommonSparkInterceptorChannels);
        if (ecomCommonSparkInterceptorChannels2 != null) {
            ecomCommonSparkInterceptorChannels = ecomCommonSparkInterceptorChannels2;
        }
        LIZ = ecomCommonSparkInterceptorChannels.channels;
    }
}
