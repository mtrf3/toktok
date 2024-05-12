package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AXD {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(AXE.LJLIL);

    public static AXF LIZIZ() {
        return (AXF) LIZ.getValue();
    }

    public static boolean LIZ(String code, List list, boolean z) {
        o.LJIIIZ(code, "code");
        boolean z2 = false;
        if (C79004UzY.LJJIFFI(list)) {
            return false;
        }
        ArrayList arrayList = (ArrayList) list;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            String str = (String) ListProtector.get(list, size);
            if (TextUtils.equals(str, "zh-hant")) {
                ListProtector.set(list, size, "zh-Hant");
            }
            if (ujb.o.LJJJJIZL(str, code, true)) {
                if (z) {
                    arrayList.remove(str);
                }
                z2 = true;
            }
        }
        return z2;
    }
}
