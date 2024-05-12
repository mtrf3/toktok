package X;

import com.ss.android.ugc.aweme.net.IIESNetworkApi;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ETN {
    public static final IIESNetworkApi LIZ;

    static {
        String API_URL_PREFIX_SI = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        C65087PgZ c65087PgZ = (C65087PgZ) C46104I7o.LJIILLIIL(API_URL_PREFIX_SI);
        c65087PgZ.LIZJ = true;
        LIZ = (IIESNetworkApi) c65087PgZ.LJFF().LIZ.LIZ(IIESNetworkApi.class);
    }
}
