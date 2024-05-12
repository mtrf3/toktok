package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O8Z {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, UrlModel urlModel, Long l, String str2) {
        List<String> list;
        if (urlModel != null) {
            list = urlModel.getUrlList();
        } else {
            list = null;
        }
        LIZIZ(str, list, l, str2, null);
    }

    public static void LIZIZ(String trackLabel, List list, Long l, String str, JSONObject jSONObject) {
        Boolean bool;
        long j;
        o.LJIIIZ(trackLabel, "trackLabel");
        if (list == null || list.isEmpty() || (bool = Boolean.TRUE) == null) {
            return;
        }
        bool.booleanValue();
        C269313x c269313x = new C269313x();
        c269313x.LJFF = trackLabel;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        c269313x.LIZ = j;
        c269313x.LIZJ = list;
        c269313x.LIZLLL = str;
        c269313x.LIZIZ = true;
        c269313x.LJ = jSONObject;
        c269313x.LJI = true;
        C61408O8e.LIZ().LIZJ(c269313x.LIZ());
    }
}
