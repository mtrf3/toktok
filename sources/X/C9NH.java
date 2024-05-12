package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.9NH, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9NH {
    public static final HashMap<String, KUN> LIZ = new HashMap<>();

    public static KUN LIZ(Context context, String str) {
        HashMap<String, KUN> hashMap = LIZ;
        KUN kun = hashMap.get(str);
        if (kun == null) {
            KUN kun2 = new KUN(context, str);
            hashMap.put(str, kun2);
            return kun2;
        }
        return kun;
    }
}
