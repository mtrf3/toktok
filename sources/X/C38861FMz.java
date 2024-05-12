package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.FMz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38861FMz {
    public static final java.util.Map<String, InterfaceC64427PQh> LIZ = new HashMap();
    public static FN0 LIZIZ = null;

    public static InterfaceC64427PQh LIZ(String str) {
        InterfaceC64427PQh c38860FMy;
        if (TextUtils.isEmpty(str)) {
            if (LIZIZ == null) {
                LIZIZ = new FN0();
            }
            return LIZIZ;
        }
        HashMap hashMap = (HashMap) LIZ;
        InterfaceC64427PQh interfaceC64427PQh = (InterfaceC64427PQh) hashMap.get(str);
        if (interfaceC64427PQh != null) {
            return interfaceC64427PQh;
        }
        if (!FN1.LIZ) {
            c38860FMy = new FN0();
        } else {
            str.getClass();
            if (!str.equals("homepage_hot") && !str.equals("system_launch")) {
                c38860FMy = new FN0();
            } else {
                c38860FMy = new C38860FMy();
            }
        }
        hashMap.put(str, c38860FMy);
        return c38860FMy;
    }
}
