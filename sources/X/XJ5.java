package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.account.api.IChangeUnlinkAccountBindingsApi;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XJ5 {
    public static final /* synthetic */ XJ5 LIZ = new XJ5();
    public static final IChangeUnlinkAccountBindingsApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (IChangeUnlinkAccountBindingsApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(IChangeUnlinkAccountBindingsApi.class);
    }

    public static C10K LIZ(XJ6 productScene) {
        o.LJIIIZ(productScene, "productScene");
        IChangeUnlinkAccountBindingsApi iChangeUnlinkAccountBindingsApi = LIZIZ;
        String LJIIL = C78946Uyc.LJIIL(String.valueOf(productScene.getValue()));
        o.LJIIIIZZ(LJIIL, "encryptWithXor(\"${productScene.value}\")");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(EFJ.LIZJ);
        LIZ2.append("/passport/shark/safe_verify/v2/");
        String LIZLLL = AbstractC66965QPx.LIZLLL(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(LIZLLL, "getCsrfToken(CommonConst…REFIX_SI + SAFE_ENV_PATH)");
        return iChangeUnlinkAccountBindingsApi.checkSafeEnvV2(LJIIL, 1, LIZLLL);
    }
}
