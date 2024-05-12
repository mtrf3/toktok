package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VSU {
    public static final /* synthetic */ int LIZ = 0;

    public static HashMap LIZ(String str, HHM localParam) {
        o.LJIIJ(localParam, "localParam");
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("unknown_reason", str);
        }
        String str2 = localParam.LJLILLLLZI;
        if (str2 != null) {
            hashMap.put("top_activity", str2);
        }
        String str3 = localParam.LJLJI;
        if (str3 != null) {
            hashMap.put("top_page", str3);
        }
        return hashMap;
    }
}
