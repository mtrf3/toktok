package ms.bd.o;

import X.C16880lQ;
import android.media.AudioManager;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class z1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int i2;
        int LLLLLLZZ;
        AudioManager audioManager = (AudioManager) C16880lQ.LLILL(a.LIZIZ.LIZ, (String) k.a(16777217, 0, 0L, "2482af", new byte[]{34, 35, 79, 79, 81}));
        try {
            LLLLLLZZ = C16880lQ.LLLLLLZZ(audioManager, 3);
        } catch (Throwable unused) {
        }
        if (LLLLLLZZ > 0) {
            i2 = (audioManager.getStreamVolume(3) * 100) / LLLLLLZZ;
            return Integer.valueOf(i2);
        }
        i2 = -1;
        return Integer.valueOf(i2);
    }
}
