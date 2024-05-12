package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* loaded from: classes11.dex */
public final class O8Y {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, UrlModel urlModel, Long l, String str2) {
        List<String> list;
        if (urlModel != null) {
            list = urlModel.getUrlList();
        } else {
            list = null;
        }
        LIZIZ(str, list, l, str2);
    }

    public static void LIZIZ(String str, List list, Long l, String str2) {
        Boolean bool;
        long j;
        if (list == null || list.isEmpty() || 0 != 0 || (bool = Boolean.TRUE) == null) {
            return;
        }
        bool.booleanValue();
        C269313x c269313x = new C269313x();
        c269313x.LJFF = str;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        c269313x.LIZ = j;
        c269313x.LIZJ = list;
        c269313x.LIZLLL = str2;
        c269313x.LIZIZ = true;
        c269313x.LJ = null;
        c269313x.LJI = true;
        C61407O8d.LIZ().LIZJ(c269313x.LIZ());
    }
}
