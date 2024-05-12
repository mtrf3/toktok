package X;

import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.internal.IDqS30S0300000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a4e, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92060a4e {
    public static final W5F LIZIZ(Object obj) {
        if (obj instanceof Integer) {
            return W5U.LJ(((Number) obj).intValue());
        }
        if (obj instanceof File) {
            W5F LJI = W5U.LJI((File) obj);
            o.LJIIIIZZ(LJI, "load(obj)");
            return LJI;
        }
        if (obj instanceof String) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ((String) obj);
            o.LJIIIIZZ(LJIIIIZZ, "load(obj)");
            return LJIIIIZZ;
        }
        if (obj instanceof android.net.Uri) {
            return W5U.LJFF((android.net.Uri) obj);
        }
        if (obj instanceof C62562cu) {
            return W5U.LJIIIZ((C62562cu) obj);
        }
        return W5U.LJII(obj);
    }

    public static final void LIZ(Object obj, InterfaceC07790Sh interfaceC07790Sh, Integer num, InterfaceC70769Rq1 interfaceC70769Rq1, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        Integer num2 = num;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        InterfaceC70769Rq1 interfaceC70769Rq12 = interfaceC70769Rq1;
        o.LJIIIZ(obj, "obj");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1962626432);
        if ((i2 & 2) != 0) {
            interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
        }
        if ((i2 & 4) != 0) {
            num2 = Integer.valueOf(R.drawable.ip);
            i3 = i & (-897);
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            interfaceC70769Rq12 = null;
        }
        C24920yO.LIZ(new IDqS30S0300000_31(obj, num2, interfaceC70769Rq12, 6), interfaceC07790Sh2, new IDqS30S0300000_31(obj, num2, interfaceC70769Rq12, 7), LJIL, i3 & 112, 0);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92996aJk(obj, interfaceC07790Sh2, num2, interfaceC70769Rq12, i, i2);
    }
}
