package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Mz4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58590Mz4 {
    public ArrayList<String> LIZ;
    public ArrayList<String> LIZIZ;

    public static boolean LIZ(String str, ArrayList arrayList) {
        if (arrayList == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }
}
