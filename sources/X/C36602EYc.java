package X;

import Y.ACallableS35S1200000_6;
import Y.AgS123S0100000_6;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.net.CommonApi;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EYc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36602EYc implements InterfaceC36604EYe {
    public final CommonApi LJLIL;

    public C36602EYc() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        this.LJLIL = (CommonApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, CommonApi.class);
    }

    @Override // X.InterfaceC36604EYe
    public final void LJ(String url, java.util.Map<String, String> map, InterfaceC36606EYg callback) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(callback, "callback");
        C10K.LIZJ(new ACallableS35S1200000_6(map, this, url, 4)).LJ(new AgS123S0100000_6(callback, 23), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC36604EYe
    public final void LIZ(String str, java.util.Map<String, String> map, boolean z, java.util.Map<String, String> map2, InterfaceC36606EYg interfaceC36606EYg) {
        C36603EYd.LIZ(this, str, map, interfaceC36606EYg);
    }

    @Override // X.InterfaceC36604EYe
    public final void LIZIZ(String url, java.util.Map<String, String> map, String str, JSONObject jSONObject, InterfaceC36606EYg callback) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(callback, "callback");
        C10K.LIZJ(new CallableC36601EYb(str, url, jSONObject, map, this)).LJ(new AgS123S0100000_6(callback, 24), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC36604EYe
    public final void LIZJ(String str, java.util.Map<String, String> map, String str2, JSONObject jSONObject, boolean z, java.util.Map<String, String> map2, InterfaceC36606EYg interfaceC36606EYg) {
        C36603EYd.LIZIZ(this, str, map, str2, jSONObject, interfaceC36606EYg);
    }
}
