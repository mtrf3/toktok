package com.ss.android.ugc.aweme.compliance.business.phl;

import X.AbstractC73672Svk;
import X.C778533t;
import X.E8L;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;

/* loaded from: classes4.dex */
public final class PhlApi {
    public static final RealApi LIZ = (RealApi) RetrofitFactory.LIZLLL().create(C778533t.LIZ).create(RealApi.class);

    /* loaded from: classes4.dex */
    public interface RealApi {
        @E8L("/tiktok/privacy/highlights/videos/v1")
        AbstractC73672Svk<PhlVideosResponse> getPrivacyHighlightsVideos();
    }
}
