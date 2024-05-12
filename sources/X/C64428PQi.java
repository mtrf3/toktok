package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.PQi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64428PQi implements InterfaceC28215B5n {
    @Override // X.InterfaceC28215B5n
    public final java.util.Map<String, String> LIZ(PQZ pqz) {
        String str;
        String str2;
        if (!C34015DWp.LIZ) {
            return new LinkedHashMap();
        }
        PRV LIZ = PRZ.LIZ(pqz.LJLIL);
        String str3 = "-1";
        String str4 = "unknow";
        if (LIZ instanceof C64447PRb) {
            str = "-1";
        } else {
            C64446PRa[] c64446PRaArr = LIZ.LIZ;
            C64446PRa c64446PRa = null;
            if (c64446PRaArr != null) {
                int length = c64446PRaArr.length;
                int i = LIZ.LIZJ;
                if (i < length) {
                    c64446PRa = c64446PRaArr[i];
                }
            }
            if (c64446PRa == null) {
                str2 = "-1";
            } else {
                str4 = c64446PRa.LIZ;
                o.LJIIIIZZ(str4, "it.pidName");
                str2 = Q8U.LIZIZ(new Object[]{Float.valueOf(c64446PRa.LJI)}, 1, "%.3f", "format(format, *args)");
            }
            C64446PRa c64446PRa2 = LIZ.LIZIZ;
            if (c64446PRa2 != null) {
                str3 = Q8U.LIZIZ(new Object[]{Float.valueOf(c64446PRa2.LJI)}, 1, "%.3f", "format(format, *args)");
            }
            str = str3;
            str3 = str2;
        }
        return C113554cx.LJJLIIIIJ(new OSZ("cpu_type", str4), new OSZ("cpu_use", str3), new OSZ("total_cpu_use", str));
    }
}
