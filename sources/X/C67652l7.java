package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import ujb.s;

/* renamed from: X.2l7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67652l7 {
    public static final java.util.Map<String, List<String>> LIZ = C113554cx.LJJLIIIIJ(new OSZ("local_notify_4_non_login_users", C47261Igj.LJJIJIIJI("71367915", "71367916")));
    public static List<String> LIZIZ;

    public static String LIZ(String str) {
        List LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6);
        if (LIZIZ == null) {
            Collection<List> values = ((LinkedHashMap) LIZ).values();
            ArrayList arrayList = new ArrayList();
            for (List list : values) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                ORS.LJJLIIIJILLIZJL(arrayList2, arrayList);
            }
            LIZIZ = arrayList;
        }
        if (LIZIZ != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : LJLJJL) {
                if (!((ArrayList) r3).contains(obj2)) {
                    arrayList3.add(obj2);
                }
            }
            return ORZ.LLD(arrayList3, ",", null, null, null, 62);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
