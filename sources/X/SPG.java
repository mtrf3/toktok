package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.api.VideoPrivacySettingApi;

/* loaded from: classes13.dex */
public final class SPG extends AbstractC65781Prl implements InterfaceC65784Pro<VideoPrivacySettingApi> {
    public static final SPG LJLIL = new SPG();

    public SPG() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.compliance.privacy.settings.video.api.VideoPrivacySettingApi] */
    @Override // X.InterfaceC65784Pro
    public final VideoPrivacySettingApi invoke() {
        VideoPrivacySettingApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(VideoPrivacySettingApi.class);
    }
}
