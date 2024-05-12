package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Lvu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55846Lvu extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "detail";
    }

    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(host);
        LIZ.append(path);
        return o.LJ(X1D.LIZIZ(LIZ), "user/video");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        Intent intent = new Intent(activity, (Class<?>) DetailActivity.class);
        intent.putExtra("enter_from", "push");
        intent.putExtra("refer", "push");
        intent.putExtra("id", UriProtector.getQueryParameter(uri, "id"));
        intent.putExtra("cid", UriProtector.getQueryParameter(uri, "commentId"));
        M62.LIZIZ.LIZIZ(uri, "detail", z);
        return intent;
    }
}
