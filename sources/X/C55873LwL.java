package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.LwL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55873LwL extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "friend_recommend";
    }

    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(host);
        LIZ.append(path);
        return o.LJ(X1D.LIZIZ(LIZ), "user/find_friends");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        int i;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        String queryParameter = UriProtector.getQueryParameter(uri, "inviteType");
        if (queryParameter == null) {
            queryParameter = "";
        }
        try {
            Integer valueOf = CastIntegerProtector.valueOf(queryParameter);
            o.LJIIIIZZ(valueOf, "valueOf(inviteType)");
            i = valueOf.intValue();
        } catch (Exception unused) {
            i = 1;
        }
        String queryParameter2 = UriProtector.getQueryParameter(uri, "puid");
        String LIZLLL = C55839Lvn.LIZLLL(queryParameter2, uri);
        Intent LJJIIJ = C77266UUc.LIZIZ.LJJIIJ(activity, i);
        if (LJJIIJ != null) {
            LJJIIJ.putExtra("bundle_puid", queryParameter2);
            LJJIIJ.putExtra("bundle_sec_puid", LIZLLL);
            LJJIIJ.putExtra("bundle_recommend_user_type", queryParameter2);
        }
        return LJJIIJ;
    }
}
