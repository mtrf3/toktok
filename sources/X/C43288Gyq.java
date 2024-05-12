package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.HashMap;

/* renamed from: X.Gyq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43288Gyq {
    public static C43288Gyq LIZ;

    public static C43288Gyq LIZ() {
        if (LIZ == null) {
            synchronized (C43288Gyq.class) {
                if (LIZ == null) {
                    LIZ = new C43288Gyq();
                }
            }
        }
        return LIZ;
    }

    public static boolean LIZIZ(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || !PatternProtector.compile("\\d+\\.\\d+\\.\\d+").matcher(str).matches()) {
            return false;
        }
        String[] split = EF7.LJII().split("\\.");
        String[] split2 = str.split("\\.");
        for (int i = 0; i < split.length; i++) {
            int parseInt = CastIntegerProtector.parseInt(split[i]);
            int parseInt2 = CastIntegerProtector.parseInt(split2[i]);
            if (parseInt < parseInt2) {
                SmartRoute buildRoute = SmartRouter.buildRoute(context, "//main/update_tips");
                buildRoute.withParam("debug_url", str2);
                buildRoute.withParam("version_required", str);
                buildRoute.addFlags(603979776);
                buildRoute.open();
                HashMap hashMap = new HashMap();
                hashMap.put("schema_url", str2);
                FMX.LJIIL("schema_update_toast_show", hashMap);
                return true;
            }
            if (parseInt > parseInt2) {
                break;
            }
        }
        return false;
    }
}
