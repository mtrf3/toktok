package ms.bd.o;

import android.provider.Settings;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class d0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int i2;
        try {
            boolean z = false;
            i2 = 1;
            if (Settings.Global.getInt(a.LIZIZ.LIZ.getContentResolver(), (String) k.a(16777217, 0, 0L, "c086d7", new byte[]{115, 59, 89, 82, 87, 33, 110, 20, 86, 107, 125, 54, 78, 125, 84, 46}), 0) != 0) {
                z = true;
            }
            if (z) {
                i2 = 2;
            }
        } catch (Throwable unused) {
            i2 = -1;
        }
        return Integer.valueOf(i2);
    }
}
