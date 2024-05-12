package X;

import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.Uhd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77893Uhd {
    public static int LIZ(InterfaceC78280Uns params, String str, int i) {
        o.LJIIJ(params, "params");
        if (!params.hasKey(str)) {
            return i;
        }
        if (params.get(str).getType() == EnumC78522Urm.Int) {
            return u.LJJIJIIJI(params, str, i);
        }
        if (params.get(str).getType() != EnumC78522Urm.Number) {
            return i;
        }
        return (int) u.LJJIJ(params, str, i);
    }

    public static Long LIZIZ(C77893Uhd c77893Uhd, InterfaceC78280Uns params, String str) {
        c77893Uhd.getClass();
        o.LJIIJ(params, "params");
        int i = C77894Uhe.LIZ[params.get(str).getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return Long.valueOf((long) params.getDouble(str));
        }
        return Long.valueOf(params.getInt(str));
    }
}
