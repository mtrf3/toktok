package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HWZ extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", "game", str);
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        if (C61017Nx7.LIZ().LIZIZ()) {
            C227898wz c227898wz = new C227898wz();
            IMiniAppService LIZIZ = C38499F9b.LIZ.LIZIZ();
            UriProtector.getQueryParameter(uri, "game_id");
            LIZIZ.openMiniApp(activity, "", c227898wz);
            return;
        }
        Intent LIZ = C40385Ft7.LIZ(activity);
        String queryParameter = UriProtector.getQueryParameter(uri, "game_id");
        LIZ.putExtra("jumpToGame", true);
        LIZ.putExtra("gameId", queryParameter);
        C16880lQ.LIZIZ(activity, LIZ);
    }
}
