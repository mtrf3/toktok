package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.LwB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55863LwB extends M56 {
    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        if (!INB.LIZIZ() || C53363Kwx.LIZJ()) {
            return false;
        }
        return o.LJ(host, "notification");
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        String queryParameter = UriProtector.getQueryParameter(uri, "multi_account_push_uid");
        String queryParameter2 = UriProtector.getQueryParameter(uri, "label");
        Intent LJJIJIIJI = C55888Lwa.LIZIZ.LJJIJIIJI(activity, queryParameter2);
        if (LJJIJIIJI == null) {
            C221018lt.LIZIZ("NewInboxNotificationCommand", "get PowerPage Intent is null on Push!!");
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            C16880lQ.LIZIZ(activity, C55871LwJ.LIZ(activity, LJJIJIIJI, queryParameter));
            return;
        }
        M62.LIZIZ.LIZIZ(uri, queryParameter2, z);
        if (C61017Nx7.LIZ().LIZIZ()) {
            C16880lQ.LIZIZ(activity, LJJIJIIJI);
        } else {
            activity.startActivities(new Intent[]{C51029K0z.LJIJI(activity), LJJIJIIJI});
        }
    }

    @Override // X.M56
    public final boolean LJ(android.net.Uri uri, String scheme, String host, String path) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(scheme, "scheme");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        String queryParameter = UriProtector.getQueryParameter(uri, "label");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("match uri = ");
        LIZ.append(uri);
        LIZ.append(", label = ");
        LIZ.append(queryParameter);
        C221018lt.LJFF("NewInboxNotificationCommand", X1D.LIZIZ(LIZ));
        if (INB.LIZIZ()) {
            if (C53363Kwx.LIZJ() && !o.LJ(queryParameter, "follow")) {
                return false;
            }
            return o.LJ(host, "notification");
        }
        return false;
    }
}
