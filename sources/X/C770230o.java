package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.30o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C770230o {
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    public static C770230o LIZ(android.net.Uri uri) {
        List list;
        List<String> list2;
        String host;
        if (uri == null || (host = uri.getHost()) == null || (list = s.LJLJJI(host, new char[]{'.'}, false, 6)) == null) {
            list = C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.add("/");
        if (uri == null || (list2 = uri.getPathSegments()) == null) {
            list2 = C61878OQg.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String it : list2) {
            o.LJFF(it, "it");
            List LJLJJI = s.LJLJJI(it, new char[]{'.'}, false, 6);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : LJLJJI) {
                if (((String) obj2).length() > 0) {
                    arrayList3.add(obj2);
                }
            }
            ORS.LJJLIIIJILLIZJL(arrayList3, arrayList2);
        }
        arrayList.addAll(arrayList2);
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames.isEmpty()) {
            return new C770230o(arrayList, null);
        }
        return new C770230o(arrayList, new ArrayList(queryParameterNames));
    }

    public C770230o(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
