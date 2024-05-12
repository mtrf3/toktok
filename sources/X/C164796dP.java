package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.6dP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164796dP {
    public static final OSZ<String[], int[]> LIZ(C164906da... results) {
        int i;
        o.LJIIIZ(results, "results");
        ArrayList arrayList = new ArrayList(results.length);
        for (C164906da c164906da : results) {
            arrayList.add(c164906da.LIZ);
        }
        Object[] array = arrayList.toArray(new String[0]);
        ArrayList arrayList2 = new ArrayList(results.length);
        for (C164906da c164906da2 : results) {
            if (c164906da2.LIZIZ == EnumC61598OFm.GRANTED) {
                i = 0;
            } else {
                i = -1;
            }
            arrayList2.add(Integer.valueOf(i));
        }
        return new OSZ<>(array, ORZ.LLJ(arrayList2));
    }
}
