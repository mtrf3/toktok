package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.account.profilebadge.UserGetApi;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R3Z implements InterfaceC38012Evw {
    public R3Z(WeakReference<Context> contextRef, C38049EwX iesJsBridge) {
        o.LJIIIZ(contextRef, "contextRef");
        o.LJIIIZ(iesJsBridge, "iesJsBridge");
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        UserGetApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        ((UserGetApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, UserGetApi.class)).getSelf().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C68918R3a.LJLIL, C68919R3b.LJLIL);
    }
}
