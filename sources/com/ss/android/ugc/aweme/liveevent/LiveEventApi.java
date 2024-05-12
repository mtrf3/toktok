package com.ss.android.ugc.aweme.liveevent;

import X.C76L;
import X.C770830u;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC789838c;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;

/* loaded from: classes2.dex */
public final class LiveEventApi {
    public static final InterfaceC789838c LIZ;

    /* loaded from: classes2.dex */
    public interface RealApi {
        @E4Q("/tiktok/event/list/v1")
        C76L<LiveEventResponse> getAnchorSelectionResponse(@InterfaceC64989Pez("host_user_id") String str, @InterfaceC64989Pez("query_type") int i, @InterfaceC64989Pez("offset") int i2, @InterfaceC64989Pez("count") int i3);
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = Api.LIZ;
        LIZ = C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str);
    }
}
