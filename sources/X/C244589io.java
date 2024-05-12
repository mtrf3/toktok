package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.music.api.PinApi;
import kotlin.jvm.internal.o;

/* renamed from: X.9io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244589io {
    public static PinApi.PinOperatorApi LIZ() {
        if (PinApi.LIZ == null) {
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String str = EFJ.LIZJ;
            PinApi.LIZ = (PinApi.PinOperatorApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, PinApi.PinOperatorApi.class);
        }
        PinApi.PinOperatorApi pinOperatorApi = PinApi.LIZ;
        o.LJI(pinOperatorApi);
        return pinOperatorApi;
    }
}
