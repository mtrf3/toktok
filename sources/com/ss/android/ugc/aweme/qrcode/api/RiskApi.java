package com.ss.android.ugc.aweme.qrcode.api;

import X.AbstractC36908Ee8;
import X.C46104I7o;
import X.C76L;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC789838c;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.qrcode.model.RiskUrl;
import java.util.concurrent.ExecutionException;

/* loaded from: classes7.dex */
public final class RiskApi {
    public static final InterfaceC789838c LIZ = C46104I7o.LJIILL(Api.LIZ);

    /* loaded from: classes7.dex */
    public interface RealApi {
        @E8L("/aweme/v2/risk/url/")
        C76L<RiskUrl> getRiskUrlModel(@InterfaceC64986Pew("request_url") String str);
    }

    public static RiskUrl LIZ(String str) {
        try {
            return ((RealApi) LIZ.create(RealApi.class)).getRiskUrlModel(str).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }
}
