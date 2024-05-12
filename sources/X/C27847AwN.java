package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AwN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27847AwN {
    public static C27954Ay6 LIZ(String key) {
        o.LJIIIZ(key, "key");
        HashMap<String, C27954Ay6> hashMap = C27954Ay6.LJLJLJ;
        C27954Ay6 c27954Ay6 = hashMap.get(key);
        if (c27954Ay6 == null) {
            C27954Ay6 c27954Ay62 = new C27954Ay6();
            hashMap.put(key, c27954Ay62);
            return c27954Ay62;
        }
        return c27954Ay6;
    }
}
