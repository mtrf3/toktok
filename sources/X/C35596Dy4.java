package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.hybridkit.experiment.TiktokInterceptThirdPartyCdnResourceConfigModel;

/* renamed from: X.Dy4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35596Dy4 {
    public static final TiktokInterceptThirdPartyCdnResourceConfigModel LIZ = new TiktokInterceptThirdPartyCdnResourceConfigModel(false, false, null);

    public static final TiktokInterceptThirdPartyCdnResourceConfigModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        TiktokInterceptThirdPartyCdnResourceConfigModel tiktokInterceptThirdPartyCdnResourceConfigModel = LIZ;
        TiktokInterceptThirdPartyCdnResourceConfigModel tiktokInterceptThirdPartyCdnResourceConfigModel2 = (TiktokInterceptThirdPartyCdnResourceConfigModel) LIZLLL.LJIIIIZZ("tiktok_intercept_third_party_cdn_resource_config", TiktokInterceptThirdPartyCdnResourceConfigModel.class, tiktokInterceptThirdPartyCdnResourceConfigModel);
        if (tiktokInterceptThirdPartyCdnResourceConfigModel2 == null) {
            return tiktokInterceptThirdPartyCdnResourceConfigModel;
        }
        return tiktokInterceptThirdPartyCdnResourceConfigModel2;
    }
}
