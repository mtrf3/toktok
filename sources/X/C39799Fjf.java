package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Fjf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39799Fjf extends M56 {
    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        if (ujb.o.LJJJJIZL("user", host, true) && ujb.o.LJJJJIZL("/favorite/", path, true)) {
            return true;
        }
        return false;
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        String queryParameter = UriProtector.getQueryParameter(uri, "tab_name");
        String str = "";
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = UriProtector.getQueryParameter(uri, "mix_ids");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        String queryParameter3 = UriProtector.getQueryParameter(uri, "enter_from");
        if (queryParameter3 != null) {
            str = queryParameter3;
        }
        StringBuilder LIZLLL = C06540Nm.LIZLLL("aweme://favorite?tab_name=", queryParameter, "&push_ids=", queryParameter2, "&enter_from=");
        LIZLLL.append(str);
        C61200O0e.LIZLLL().LJII(X1D.LIZIZ(LIZLLL));
    }
}
