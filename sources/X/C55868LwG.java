package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.profile.ui.UserProfileFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.LwG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55868LwG extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "others_homepage";
    }

    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(host);
        LIZ.append(path);
        if (o.LJ(X1D.LIZIZ(LIZ), "user/profile") || o.LJ(host, "profile")) {
            return true;
        }
        return false;
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        String queryParameter = UriProtector.getQueryParameter(uri, "id");
        if (queryParameter == null) {
            queryParameter = UriProtector.getQueryParameter(uri, "uid");
        }
        String queryParameter2 = UriProtector.getQueryParameter(uri, "unique_id");
        String LIZLLL = C55839Lvn.LIZLLL(queryParameter, uri);
        Intent LIZ = C61210O0o.LIZ.LIZ(activity, UserProfileFragment.class, null, null);
        o.LJI(LIZ);
        LIZ.putExtra("uid", queryParameter);
        LIZ.putExtra("sec_user_id", LIZLLL);
        LIZ.putExtra("unique_id", queryParameter2);
        return LIZ;
    }
}
