package X;

import android.content.Context;
import android.util.Pair;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTraceImpl;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Nfz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59955Nfz {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(String str, String str2, HashMap queryMap) {
        o.LJIIIZ(queryMap, "queryMap");
        if (str2 != null) {
            queryMap.put("previous_page", str2);
        }
        if (str != null) {
            queryMap.put("enter_from", str);
        }
    }

    public static final void LIZ(Context context, String str, String str2, String str3, HashMap queryMap) {
        Object obj;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(queryMap, "queryMap");
        if (str2 != null) {
            queryMap.put("ad_id", str2);
        }
        if (str3 != null) {
            queryMap.put("creative_id", str3);
        }
        if (str != null) {
            queryMap.put("log_extra", str);
        }
        queryMap.put("user_agent", FLE.LIZIZ());
        queryMap.put("access", C16880lQ.LLJILJILJ(context));
        queryMap.put("package", context.getPackageName());
        Pair<String, Boolean> LIZ2 = C39247Fal.LIZ(context);
        if (LIZ2 != null && (obj = LIZ2.first) != null) {
            queryMap.put("google_aid", obj);
        }
        for (Map.Entry<String, Object> entry : EngagementTraceImpl.LIZIZ().LIZ().entrySet()) {
            queryMap.put(entry.getKey(), entry.getValue().toString());
        }
    }
}
