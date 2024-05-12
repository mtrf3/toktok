package X;

import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import ms.bd.o.a;
import ms.bd.o.b;
import ms.bd.o.k2;

/* renamed from: X.Fhs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39688Fhs extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        try {
            Display defaultDisplay = ((WindowManager) C16880lQ.LLILL(a.LIZIZ.LIZ, "window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            k2.LIZ = point.x;
            k2.LIZIZ = point.y;
        } catch (Throwable unused) {
        }
        return k2.LIZ + "*" + k2.LIZIZ;
    }
}
