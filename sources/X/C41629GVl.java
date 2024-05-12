package X;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.GVl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41629GVl {
    public static void LIZ(String str) {
        String str2;
        java.util.Map<String, List<InterfaceC41631GVn>> map = C41626GVi.LJLLILLLL;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        List list = (List) ((LinkedHashMap) map).get(str2);
        if (list != null) {
            list.clear();
        }
        C65777Prh.LIZJ(map).remove(str);
    }
}
