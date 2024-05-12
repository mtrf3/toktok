package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Wly, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83258Wly {
    public static final float LIZ(Context context) {
        o.LJIIIZ(context, "context");
        return C74275TDb.LIZIZ(context, 12.0f) + LIZIZ(context);
    }

    public static final float LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        int LJ = C81184Vtc.LJ(context);
        float LIZIZ = C74275TDb.LIZIZ(context, 12.0f);
        float LIZIZ2 = C74275TDb.LIZIZ(context, 20.0f);
        float LIZIZ3 = C74275TDb.LIZIZ(context, 52.0f);
        float LIZIZ4 = C74275TDb.LIZIZ(context, 80.0f);
        float f = (float) (((LJ - LIZIZ2) - (LIZIZ * 5)) / 5.3d);
        if (f < LIZIZ3) {
            return LIZIZ3;
        }
        if (f > LIZIZ4) {
            return LIZIZ4;
        }
        return f;
    }
}
