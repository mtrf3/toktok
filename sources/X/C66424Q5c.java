package X;

import android.content.Context;
import m43.u;

/* renamed from: X.Q5c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66424Q5c {
    public static final C66424Q5c LIZ = new C66424Q5c();
    public static Q5F LIZIZ;

    public final synchronized Q5F LIZ(Context context) {
        if (context == null) {
            context = u.LIZJ();
        }
        if (LIZIZ == null) {
            LIZIZ = new Q5F(context, u.LIZLLL());
        }
        return LIZIZ;
    }
}
