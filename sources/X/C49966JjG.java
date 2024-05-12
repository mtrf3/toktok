package X;

import android.util.ArrayMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JjG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49966JjG {
    public static C49963JjD LIZ(Object obj) {
        ArrayMap<Object, C49963JjD> arrayMap = C49963JjD.LJFF;
        if (arrayMap.containsKey(obj)) {
            C49963JjD c49963JjD = arrayMap.get(obj);
            o.LJI(c49963JjD);
            return c49963JjD;
        }
        C49963JjD c49963JjD2 = new C49963JjD(obj);
        arrayMap.put(obj, c49963JjD2);
        return c49963JjD2;
    }
}
