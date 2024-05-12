package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YcA, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87746YcA {
    public static final List<String> LIZ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        C19U.LIZLLL(arrayList, "TCP_HIT", "TCP_MISS", "HIT, HIT", "HIT, MISS");
        C19U.LIZLLL(arrayList, "MISS, HIT", "MISS, MISS", "HIT", "MISS");
        C19U.LIZLLL(arrayList, "TCP_MEM_HIT", "TCP_REFRESH_HIT", "TCP_REFRESH_MISS", "TCP_REFRESH_FAIL_HIT");
        arrayList.add("TCP_IMS_HIT");
        arrayList.add("TCP_NEGATIVE_HIT");
    }

    public static int LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        List<String> list = LIZ;
        o.LJI(list);
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            o.LJI(str);
            if (ujb.o.LJJJLIIL(str, str2, false)) {
                List<String> list2 = LIZ;
                o.LJI(list2);
                return ((ArrayList) list2).indexOf(str2) + 1;
            }
        }
        return 0;
    }

    public static String LIZIZ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        o.LJI(str);
        if (str.length() <= i) {
            return str;
        }
        String substring = str.substring(0, i - 1);
        o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
