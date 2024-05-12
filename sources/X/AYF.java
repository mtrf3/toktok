package X;

import com.ss.android.ugc.aweme.setting.api.AuthListApi;
import com.ss.android.ugc.aweme.setting.model.AuthAppInfoListResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AYF extends AbstractC73941T0f<C76800UCe, AuthAppInfoListResponse> {
    public final AuthListApi LIZJ;

    public AYF() {
        AuthListApi.LIZ.getClass();
        this.LIZJ = AYE.LIZ();
    }

    @Override // X.R30
    public final AbstractC73672Svk LJII(Object req) {
        o.LJIIIZ(req, "req");
        return this.LIZJ.getAuthInfoList().LJJL(T16.LIZ());
    }
}
