package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.5Gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132105Gk {
    public static Context LIZ;
    public static C5HD LIZIZ = C135075Rv.LIZ;

    public static Context LIZ() {
        Context context = LIZ;
        if (context != null) {
            return context;
        }
        o.LJIJI("context");
        throw null;
    }

    public static final void LIZIZ(int i) {
        String string = LIZ().getString(i);
        o.LJIIIIZZ(string, "context.getString(strRes)");
        LIZJ(string);
    }

    public static final void LIZJ(String message) {
        o.LJIIIZ(message, "message");
        LIZIZ.LIZ(LIZ(), message);
    }
}
