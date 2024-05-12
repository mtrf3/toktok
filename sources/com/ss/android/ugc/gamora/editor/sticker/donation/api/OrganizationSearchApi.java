package com.ss.android.ugc.gamora.editor.sticker.donation.api;

import X.AbstractC73638SvC;
import X.C60903NvH;
import X.E8L;
import X.InterfaceC64986Pew;
import X.X1D;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationSearchResultResponse;

/* loaded from: classes8.dex */
public final class OrganizationSearchApi {
    public static final Api LIZ;

    /* loaded from: classes8.dex */
    public interface Api {
        @E8L("/tiktok/v1/donation/ngo/search/")
        AbstractC73638SvC<OrganizationSearchResultResponse> getOrganizationList(@InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("count") int i2, @InterfaceC64986Pew("keyword") String str, @InterfaceC64986Pew("organization_type") String str2);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append("api-va.tiktokv.com");
        LIZ = (Api) C60903NvH.LJIIJJI().getNetworkService().createRetrofit(X1D.LIZIZ(LIZ2), true, Api.class);
    }
}
