package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MG0 {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static final CopyOnWriteArrayList<MGM> LIZLLL = new CopyOnWriteArrayList<>();
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(MG1.LJLIL);

    public static void LIZ(Context context, String vipInfoSchema, java.util.Map map, Bundle bundle) {
        o.LJIIIZ(vipInfoSchema, "vipInfoSchema");
        if (vipInfoSchema.length() == 0 || context == null) {
            return;
        }
        android.net.Uri parse = UriProtector.parse(vipInfoSchema);
        Uri.Builder buildUpon = parse.buildUpon();
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!queryParameterNames.contains(str)) {
                buildUpon.appendQueryParameter(str, str2);
            }
        }
        String uri = buildUpon.build().toString();
        o.LJIIIIZZ(uri, "vipUriBuilder.build().toString()");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, uri);
        if (bundle != null) {
            buildRoute.withParam(bundle);
        }
        buildRoute.open();
    }
}
