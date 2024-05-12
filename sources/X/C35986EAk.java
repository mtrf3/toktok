package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ad.network.ScoreApi;

/* renamed from: X.EAk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35986EAk {
    public static final /* synthetic */ C35986EAk LIZ = new C35986EAk();

    public static ScoreApi LIZ() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return (ScoreApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(ScoreApi.class);
    }
}
