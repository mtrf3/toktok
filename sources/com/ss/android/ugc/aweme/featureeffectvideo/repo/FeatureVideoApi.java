package com.ss.android.ugc.aweme.featureeffectvideo.repo;

import X.AbstractC73672Svk;
import X.C243789hW;
import X.E4Q;
import X.E8M;
import X.InterfaceC195787mI;
import X.InterfaceC64985Pev;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;

/* loaded from: classes5.dex */
public interface FeatureVideoApi {
    public static final C243789hW LIZ = C243789hW.LIZ;

    @InterfaceC195787mI
    @E8M("/tiktok/v1/sticker/featured_video/unbind/")
    AbstractC73672Svk<BaseResponse> deleteFeatureVideo(@InterfaceC64985Pev("effect_id") String str);

    @E4Q("/tiktok/v1/sticker/featured_video/candidates/")
    AbstractC73672Svk<StickerPropAwemeList> getFeatureVideoAwemeList(@InterfaceC64989Pez("effect_id") String str);

    @InterfaceC195787mI
    @E8M("/tiktok/v1/sticker/featured_video/bind/")
    AbstractC73672Svk<BaseResponse> saveFeatureVideo(@InterfaceC64985Pev("effect_id") String str, @InterfaceC64985Pev("aweme_id") String str2);
}
