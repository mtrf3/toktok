package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Lvs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C55844Lvs extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "detail";
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        if (SC5.LIZIZ(str, "host", str2, "path", str, "item") || o.LJ(str, "musical")) {
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
        Intent LIZ = C55839Lvn.LIZ(activity, uri, new Intent(activity, (Class<?>) DetailActivity.class), z, UriProtector.getQueryParameter(uri, "id"));
        C55836Lvk.LIZ(uri, LIZ, z);
        LIZ.putExtra("refer", "web");
        LIZ.putExtra("id", UriProtector.getQueryParameter(uri, "id"));
        M62.LIZIZ.LIZIZ(uri, "detail", z);
        return LIZ;
    }
}
