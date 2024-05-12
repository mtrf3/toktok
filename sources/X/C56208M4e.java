package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.M4e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56208M4e extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        if (SC5.LIZIZ(str, "host", str2, "path", "microapp", str) || o.LJ("microgame", str)) {
            return true;
        }
        return false;
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        String queryParameter = UriProtector.getQueryParameter(uri, "schema_from");
        if (!TextUtils.equals(queryParameter, "splash") && !TextUtils.equals(queryParameter, "qr_code")) {
            TextUtils.equals(queryParameter, "ad_link");
        }
        UriProtector.getQueryParameter(uri, "position");
        C38499F9b.LIZ.LIZIZ().openMiniApp(activity, uri.toString(), new C227898wz());
    }
}
