package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YcB, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87747YcB {
    public final List<C87748YcC> LIZ;
    public final HashMap<String, Object> LIZIZ;
    public final List<C47462Ijy> LIZJ;
    public final List<String> LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:112:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZ() {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87747YcB.LIZ():org.json.JSONObject");
    }

    public final int LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        List<String> list = this.LIZLLL;
        o.LJI(list);
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            o.LJI(str);
            if (ujb.o.LJJJLIIL(str, str2, false)) {
                List<String> list2 = this.LIZLLL;
                o.LJI(list2);
                return ((ArrayList) list2).indexOf(str2) + 1;
            }
        }
        return 0;
    }

    public C87747YcB(List<C87748YcC> list, HashMap<String, Object> customMap, List<C47462Ijy> list2) {
        o.LJIIIZ(customMap, "customMap");
        this.LIZ = list;
        this.LIZIZ = customMap;
        this.LIZJ = list2;
        ArrayList arrayList = new ArrayList();
        this.LIZLLL = arrayList;
        C19U.LIZLLL(arrayList, "TCP_HIT", "TCP_MISS", "HIT, HIT", "HIT, MISS");
        C19U.LIZLLL(arrayList, "MISS, HIT", "MISS, MISS", "HIT", "MISS");
        C19U.LIZLLL(arrayList, "TCP_MEM_HIT", "TCP_REFRESH_HIT", "TCP_REFRESH_MISS", "TCP_REFRESH_FAIL_HIT");
        arrayList.add("TCP_IMS_HIT");
        arrayList.add("TCP_NEGATIVE_HIT");
    }
}
