package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.0TU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TU {
    public final C0TS LIZ = new C0TS();

    public static Drawable LIZ(int i, Context context) {
        Drawable LIZJ;
        if (context == null || i == -1) {
            return null;
        }
        C48693J9d c48693J9d = C259710f.LIZ.LIZLLL;
        if (c48693J9d != null && (LIZJ = c48693J9d.LIZJ(i, context)) != null) {
            return LIZJ;
        }
        return C20110qd.LIZ(context, i);
    }

    public final boolean LIZIZ(int i, boolean z) {
        C0TR c0tr = (C0TR) ((java.util.Map) this.LIZ.LIZ).get(Integer.valueOf(i));
        if (c0tr != null) {
            return c0tr.LIZ();
        }
        return z;
    }
}
