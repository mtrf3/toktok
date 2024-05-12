package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeApi;

/* renamed from: X.Lt7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55673Lt7 {
    public static final /* synthetic */ C55673Lt7 LIZ = new C55673Lt7();

    public static SafeInfoNoticeApi LIZ() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        return (SafeInfoNoticeApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(SafeInfoNoticeApi.class);
    }
}
