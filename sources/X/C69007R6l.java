package X;

import com.bytedance.lobby.auth.AuthResult;
import kotlin.jvm.internal.o;

/* renamed from: X.R6l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69007R6l {
    public static C69008R6m LIZIZ(R6I processor, AuthResult authResult, C69008R6m c69008R6m, String str) {
        o.LJIIIZ(processor, "processor");
        if (authResult == null) {
            return null;
        }
        if (c69008R6m == null) {
            c69008R6m = new C69008R6m();
        }
        c69008R6m.LIZLLL = str;
        return c69008R6m;
    }

    public static void LIZ(int i, int i2, String str, int i3, String str2) {
        if (i == 4) {
            Q13.LIZIZ("monitor_bind_thirdparty", i2, C68987R5r.LIZIZ(i3, str2, str));
        } else {
            Q13.LIZIZ("monitor_login_thirdparty", i2, C68987R5r.LIZIZ(i3, str2, str));
        }
    }
}
