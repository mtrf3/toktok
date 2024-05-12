package X;

import android.webkit.WebResourceResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EqG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37660EqG {
    public static final List<String> LIZ = C47261Igj.LJJIJIL(".tiktok.com", ".tiktokv.com", ".tiktokcdn.com", ".tiktokcdn-us.com");

    public static C37659EqF LIZ(WebResourceResponse webResourceResponse, EnumC37658EqE loadFrom, Integer num) {
        o.LJIIIZ(loadFrom, "loadFrom");
        if (!o.LJ(webResourceResponse.getReasonPhrase(), "redirect")) {
            int statusCode = webResourceResponse.getStatusCode();
            if (300 <= statusCode && statusCode < 400) {
                return null;
            }
            return new C37659EqF(webResourceResponse, loadFrom, num);
        }
        return null;
    }
}
