package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import ujb.s;

/* renamed from: X.ESk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36454ESk {
    public static C36455ESl LIZ(String str) {
        C36455ESl c36455ESl;
        if (str == null) {
            return null;
        }
        List LJLJJL = s.LJLJJL(str, new String[]{"|"}, 0, 6);
        C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.NONE, new AqS156S0100000_6(LJLJJL, (List<EEY>) 134));
        try {
            int size = LJLJJL.size();
            if (size == 0) {
                return null;
            }
            if (size != 1) {
                if (size != 2) {
                    c36455ESl = new C36455ESl((List) LIZ.getValue(), CastLongProtector.parseLong((String) ListProtector.get(LJLJJL, 1)), CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 2)));
                } else {
                    c36455ESl = new C36455ESl((List) LIZ.getValue(), CastLongProtector.parseLong((String) ListProtector.get(LJLJJL, 1)), 0);
                }
                return c36455ESl;
            }
            return new C36455ESl((List) LIZ.getValue(), 0L, 0);
        } catch (Throwable unused) {
            return null;
        }
    }
}
