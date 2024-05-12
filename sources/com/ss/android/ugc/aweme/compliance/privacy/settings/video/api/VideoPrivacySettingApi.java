package com.ss.android.ugc.aweme.compliance.privacy.settings.video.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.SPL;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;

/* loaded from: classes13.dex */
public interface VideoPrivacySettingApi {
    public static final SPL LIZ = SPL.LIZ;

    @E4Q("/aweme/v1/aweme/modify/visibility/")
    AbstractC73672Svk<PrivateUrlModel> setVideoVisibility(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("type") int i);

    @InterfaceC195787mI
    @E4T("/tiktok/v1/caption/cla/")
    AbstractC73672Svk<BaseResponse> toggleAutoCaptionSetting(@InterfaceC64987Pex("aweme_id") String str, @InterfaceC64987Pex("enable_auto_caption") boolean z);

    @InterfaceC195787mI
    @E4T("/tiktok/privacy/item/settings/update/v1")
    AbstractC73672Svk<BaseResponse> updateVideoPrivacySetting(@InterfaceC64987Pex("aweme_id") String str, @InterfaceC64987Pex("field") String str2, @InterfaceC64987Pex("value") Integer num);
}
