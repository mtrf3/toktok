package X;

import com.bytedance.keva.Keva;
import defpackage.e1;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.71m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1791871m {
    public static final boolean LIZ = e1.LIZ(31744, "comment_keyboard_workaround", true, false);
    public static final long LIZIZ = TimeUnit.DAYS.toMillis(3);
    public static final Keva LIZJ;
    public static long LIZLLL;
    public static int LJ;

    static {
        Keva repo = Keva.getRepo("comment");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZJ = repo;
    }

    public static void LIZ(boolean z) {
        String str;
        if (!z) {
            str = "by_local";
        } else {
            str = "by_network";
        }
        try {
            HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ("wont_dismiss_type", str));
            C36922EeM.LIZLLL(2, "comment_keyboard_wont_dismiss", str);
            C09900aA.LJ("comment_keyboard_wont_dismiss", new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(LJJJLZIJ)));
        } catch (Throwable unused) {
        }
    }
}
