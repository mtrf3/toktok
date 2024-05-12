package com.ss.android.ugc.aweme.fe.method.upload;

import X.C10K;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.fe.method.upload.config.UploadAuthConfig;

/* loaded from: classes7.dex */
public final class GetUploadConfigService {
    public final UploadConfigService LIZ = (UploadConfigService) RetrofitFactory.LIZLLL().create("/").create(UploadConfigService.class);

    /* loaded from: classes7.dex */
    public interface UploadConfigService {
        @E4Q("common/upload_settings")
        C10K<UploadAuthConfig> getUploadAuthConfig();

        @E4Q("common/play_url")
        C10K<Object> getUploadPlayUrlResponse(@InterfaceC64989Pez("video_id") String str);
    }
}
