package com.ss.android.ugc.aweme.creatortools.creatorplus;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C25686A6g;
import X.C5H3;
import X.E4Q;
import X.EnumC221088m0;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public final class CreatorPlusApi {
    public static final C5H3<InterfaceC0026CreatorPlusApi> LIZ = C221108m2.LIZ(EnumC221088m0.NONE, C25686A6g.LJLIL);

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi$CreatorPlusApi, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0026CreatorPlusApi {
        @E4Q("/tiktok/v1/creator/plus/enroll")
        AbstractC73672Svk<BaseResponse> enrollForCreatorPlus();

        @E4Q("/tiktok/v1/creator/plus/features")
        AbstractC73672Svk<CreatorPlusFeaturesResponse> getCreatorPlusFeatures();
    }
}
