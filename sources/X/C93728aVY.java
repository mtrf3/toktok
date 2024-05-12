package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.aVY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93728aVY {
    public static C94239adn LIZ;

    public static long LIZ() {
        C94239adn c94239adn = LIZ;
        long j = 0;
        if (c94239adn != null) {
            long j2 = c94239adn.LJLIL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("versionCode = ");
            LIZ2.append(j2);
            LIZ2.append(" it.versionName = ");
            LIZ2.append(c94239adn.LJLILLLLZI);
            C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ2));
            try {
                Iterator it = s.LJLJJL(c94239adn.LJLILLLLZI, new String[]{"."}, 0, 6).iterator();
                while (it.hasNext()) {
                    o.LJIIIIZZ(CastIntegerProtector.valueOf((String) it.next()), "Integer.valueOf(aVersion)");
                    j = r1.intValue() + (100 * j);
                }
            } catch (Throwable unused) {
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("versionCode = ");
            LIZ3.append(j);
            LIZ3.append(' ');
            C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ3));
        }
        return j;
    }
}
