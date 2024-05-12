package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.TDy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74298TDy {
    public static Drawable LIZ(float f, int i, Context context, boolean z) {
        int color = context.getResources().getColor(i);
        if (z) {
            TDY tdy = new TDY();
            tdy.LIZLLL(1);
            tdy.LIZIZ(color);
            tdy.LJ(color, 0);
            return tdy.LIZ();
        }
        TDY tdy2 = new TDY();
        tdy2.LIZLLL(0);
        tdy2.LIZIZ(color);
        tdy2.LIZJ(C74275TDb.LIZIZ(context, f));
        tdy2.LJ(color, 0);
        return tdy2.LIZ();
    }
}
