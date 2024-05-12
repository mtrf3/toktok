package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EYp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36615EYp {
    public static String LIZ(C64797Pbt c64797Pbt) {
        List<EJ6> LIZIZ = c64797Pbt.LIZ.LIZIZ("X-Tt-Logid");
        if (LIZIZ != null && LIZIZ.size() > 0) {
            Object obj = ListProtector.get(LIZIZ, 0);
            o.LJFF(obj, "headers[0]");
            String str = ((EJ6) obj).LIZIZ;
            if (str != null) {
                return str;
            }
        }
        return "";
    }
}
