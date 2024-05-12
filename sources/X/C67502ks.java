package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67502ks {
    public static List LIZ(String str) {
        boolean z;
        OQY excludeSet = OQY.INSTANCE;
        o.LJIIIZ(excludeSet, "excludeSet");
        ArrayList arrayList = new ArrayList();
        java.util.Set LLJILLL = ORZ.LLJILLL(excludeSet);
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                for (String str2 : s.LJLJJL(str, new String[]{","}, 0, 6)) {
                    if (!ujb.o.LJJJJJL(str2)) {
                        int parseInt = CastIntegerProtector.parseInt(str2);
                        if (LLJILLL.contains(Integer.valueOf(parseInt))) {
                            LLJILLL.remove(Integer.valueOf(parseInt));
                        } else {
                            arrayList.add(Integer.valueOf(parseInt));
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }
}
