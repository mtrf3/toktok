package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import kotlin.jvm.internal.o;

/* renamed from: X.Lw0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55852Lw0 extends M56 {
    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        return null;
    }

    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        if (ujb.o.LJJJJIZL("messages", host, true) && ujb.o.LJJJJIZL("/group", path, true)) {
            return true;
        }
        return false;
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        boolean LIZIZ = C61017Nx7.LIZ().LIZIZ();
        String queryParameter = UriProtector.getQueryParameter(uri, "invite_id");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (queryParameter.length() != 0 && ((RBX) HG3.LJIILL()).isLogin()) {
            if (!LIZIZ) {
                Intent LJIJI = C51029K0z.LJIJI(activity);
                LJIJI.putExtra("extra_from_deeplink", true);
                C16880lQ.LIZIZ(activity, LJIJI);
            }
            IMService.createIIMServicebyMonsterPlugin(false).getGroupChatService().LIZIZ(activity, queryParameter);
        }
    }
}
