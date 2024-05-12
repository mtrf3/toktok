package X;

import android.webkit.URLUtil;
import kotlin.jvm.internal.o;

/* renamed from: X.NxG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61026NxG {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String url) {
        o.LJIIJ(url, "url");
        if (ujb.o.LJJJJJL(url)) {
            C39930Flm.LJ(null, "url.isBlank", 5);
            return false;
        }
        if (!URLUtil.isHttpUrl(url) && !URLUtil.isHttpsUrl(url)) {
            return false;
        }
        return true;
    }
}
