package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.search.pages.result.bot.repo.PollingApi;

/* renamed from: X.JcX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49549JcX implements InterfaceC49550JcY {
    @Override // X.InterfaceC49550JcY
    public final Object LJLLLLLL(java.util.Map map, C49547JcV c49547JcV) {
        PollingApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZIZ;
        return ((PollingApi) C770830u.LIZJ(str, "API_URL_PREFIX_API", LIZLLL, str).LIZ.LIZ(PollingApi.class)).getPollingData(map, c49547JcV);
    }
}
