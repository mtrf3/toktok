package X;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class VJG {
    public static final HashMap<String, VJH> LIZ = new HashMap<>();

    public static VJH LIZ(Context context, String str) {
        HashMap<String, VJH> hashMap = LIZ;
        VJH vjh = hashMap.get(str);
        if (vjh == null) {
            VJH vjh2 = new VJH(C16880lQ.LLLLL(context), str);
            hashMap.put(str, vjh2);
            return vjh2;
        }
        return vjh;
    }
}
