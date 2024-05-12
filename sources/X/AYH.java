package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.api.AuthDeleteApi;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AYH extends AbstractC73941T0f<LinkedHashMap<String, String>, BaseResponse> {
    public final AuthDeleteApi LIZJ;

    public AYH() {
        Object obj;
        AuthDeleteApi.LIZ.getClass();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(AuthDeleteApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        this.LIZJ = (AuthDeleteApi) obj;
    }

    @Override // X.R30
    public final AbstractC73672Svk LJII(Object obj) {
        LinkedHashMap<String, String> req = (LinkedHashMap) obj;
        o.LJIIIZ(req, "req");
        return this.LIZJ.deleteAuthInfoApp(req).LJJL(T16.LIZ());
    }
}
