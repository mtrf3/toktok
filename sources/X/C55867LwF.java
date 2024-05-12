package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.profile.ui.UserProfileFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.LwF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55867LwF extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "others_homepage";
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "profile");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        M62.LIZIZ.LIZIZ(uri, "personal_homepage", z);
        Intent LIZ = C61210O0o.LIZ.LIZ(activity, UserProfileFragment.class, null, null);
        o.LJI(LIZ);
        LIZ.putExtra("uid", UriProtector.getQueryParameter(uri, "id"));
        LIZ.putExtra("sec_user_id", C55839Lvn.LIZLLL(UriProtector.getQueryParameter(uri, "id"), uri));
        LIZ.putExtra("enter_from", UriProtector.getQueryParameter(uri, "enter_from"));
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "token_request_id");
        if (TextUtils.isEmpty(LLJJIJIIJIL)) {
            return LIZ;
        }
        if (!TextUtils.isEmpty(fromTokenType)) {
            C7ZV c7zv = new C7ZV();
            c7zv.LIZLLL = fromTokenType;
            c7zv.LJJLI = "click_button";
            c7zv.LJJLIIIJJIZ = uri.getLastPathSegment();
            c7zv.LJJLIIIJL = LLJJIJIIJIL;
            c7zv.LJIILIIL();
        }
        return LIZ;
    }
}
