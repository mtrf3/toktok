package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.CmC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32312CmC {
    public static final /* synthetic */ int LIZ = 0;

    public static C32287Cln LIZ() {
        C32284Clk c32284Clk = new C32284Clk(C15380j0.LIZLLL());
        C78540Us4 c78540Us4 = new C78540Us4();
        Context LIZLLL = C15380j0.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "getContext()");
        UWO uwo = new UWO(LIZLLL);
        c32284Clk.LIZJ = 0;
        c32284Clk.LIZIZ = c78540Us4;
        c32284Clk.LIZ = uwo;
        return c32284Clk.LIZ();
    }

    public static C32420Cnw LIZIZ(String url, String hash) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(hash, "hash");
        return new C32420Cnw(hash, 0L, new String[]{url}, "", 0L, false);
    }
}
