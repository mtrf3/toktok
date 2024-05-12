package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.share.silent.util.GetSAuthorizedListApi;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74832wh {
    public static final GetSAuthorizedListApi LIZ;

    public static C73454SsE LIZ() {
        return LIZ.shouldShowLemon8Entrance("post_page_scope_verify", "awrxudrcbk09y7wi").LJJL(T16.LIZ()).LJJLIIIJJI(5L, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ());
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZ = (GetSAuthorizedListApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, GetSAuthorizedListApi.class);
    }
}
