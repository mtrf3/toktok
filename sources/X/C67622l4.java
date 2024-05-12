package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2l4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67622l4 {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ(int i, int i2, int i3) {
        Integer num;
        if (i2 > 0) {
            return i2;
        }
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i3));
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJJIJIIJI) {
            if (((Number) obj).intValue() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            num = 0;
        } else {
            num = (Integer) Collections.min(arrayList);
        }
        o.LJIIIIZZ(num, "{\n            val list =…tions.min(list)\n        }");
        return num.intValue();
    }
}
