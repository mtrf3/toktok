package X;

import java.text.SimpleDateFormat;
import kotlin.jvm.internal.o;

/* renamed from: X.Tbr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74987Tbr {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static final void LIZ(String str, String log) {
        o.LJIIIZ(log, "log");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("OneVn_");
        LIZ2.append(str);
        C0NB.LIZIZ(X1D.LIZIZ(LIZ2), log);
    }

    public static final void LIZJ(String str, String log) {
        o.LJIIIZ(log, "log");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("OneVn_");
        LIZ2.append(str);
        C0NB.LJIIIZ(X1D.LIZIZ(LIZ2), log);
    }

    public static final void LIZIZ(String str, String str2, Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("OneVn_");
        LIZ2.append(str);
        C0NB.LJ(X1D.LIZIZ(LIZ2), str2);
    }
}
