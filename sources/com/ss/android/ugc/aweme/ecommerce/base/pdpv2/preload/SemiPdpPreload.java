package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.preload;

import X.C38827FLr;
import X.C70553RmX;
import X.C76L;
import X.InterfaceC88472Yns;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.api.PdpV2Api;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.PdpResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.SemiPdpRequest;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SemiPdpPreload implements X8M<PdpV2Api, C76L<PdpResponse>> {
    public static final C70553RmX Companion = new C70553RmX();

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        return true;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(0, "https://oec-api.tiktokv.com/", false, 5);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public C76L<PdpResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<PdpV2Api>, ? extends PdpV2Api> create) {
        SemiPdpRequest semiPdpRequest;
        o.LJIIIZ(create, "create");
        if (bundle != null) {
            semiPdpRequest = (SemiPdpRequest) bundle.getParcelable("pdp_request");
        } else {
            semiPdpRequest = null;
        }
        return create.invoke(PdpV2Api.class).getSemiProductPreload(semiPdpRequest);
    }
}
