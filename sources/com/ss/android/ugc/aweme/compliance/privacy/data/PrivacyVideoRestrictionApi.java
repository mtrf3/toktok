package com.ss.android.ugc.aweme.compliance.privacy.data;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.SPK;
import com.ss.android.ugc.aweme.compliance.api.model.PrivacyVideoRestrictionModel;

/* loaded from: classes13.dex */
public final class PrivacyVideoRestrictionApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(SPK.LJLIL);

    /* loaded from: classes13.dex */
    public interface API {
        @E4Q("/tiktok/privacy/item/restriction/v1")
        AbstractC73672Svk<PrivacyVideoRestrictionModel> fetchVideoRestriction(@InterfaceC64989Pez("aweme_id") String str);
    }
}
