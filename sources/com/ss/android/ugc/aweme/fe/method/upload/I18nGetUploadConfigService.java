package com.ss.android.ugc.aweme.fe.method.upload;

import X.C10K;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.X1D;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.fe.method.upload.config.I18nUploadAuthConfig;
import com.ss.android.ugc.aweme.fe.method.upload.response.I18nUploadResponse;

/* loaded from: classes7.dex */
public final class I18nGetUploadConfigService {
    public final UploadConfigService LIZ;

    /* loaded from: classes7.dex */
    public interface UploadConfigService {
        @E4Q("/aweme/v1/upload/authkey/")
        C10K<I18nUploadAuthConfig> getUploadAuthConfig();

        @E4Q("/aweme/v1/sign/gain/url/")
        C10K<I18nUploadResponse> getUploadPlayUrlResponse(@InterfaceC64989Pez("video_id") String str, @InterfaceC64989Pez("play_source") int i);
    }

    public I18nGetUploadConfigService() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append("api-va.tiktokv.com");
        LIZ.append('/');
        this.LIZ = (UploadConfigService) LIZLLL.create(X1D.LIZIZ(LIZ)).create(UploadConfigService.class);
    }
}
