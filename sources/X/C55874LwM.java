package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.AccountService;
import kotlin.jvm.internal.o;

/* renamed from: X.LwM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55874LwM extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "account");
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        super.LIZLLL(activity, uri, z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("//");
        LIZ.append(uri.getHost());
        LIZ.append(uri.getPath());
        SmartRouter.buildRoute(activity, X1D.LIZIZ(LIZ)).open();
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        if (AccountService.LJIJ().LJFF().isLogin()) {
            if (o.LJ(path, "/2sv")) {
                return SmartRouter.buildRoute(activity, "//account/login/auth/two_step_verification").buildIntent();
            }
            if (o.LJ(path, "/setting")) {
                return SmartRouter.buildRoute(activity, "//account/setting").buildIntent();
            }
            return null;
        }
        return null;
    }
}
