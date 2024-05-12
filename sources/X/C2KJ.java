package X;

import java.util.HashMap;

/* renamed from: X.2KJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2KJ {
    public static C2KS LIZ(String str) {
        if (str == null) {
            str = "";
        }
        HashMap hashMap = (HashMap) C2KS.LJ.getValue();
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new C2KS(str);
            hashMap.put(str, obj);
        }
        return (C2KS) obj;
    }
}
