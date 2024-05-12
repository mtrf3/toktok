package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHN implements Runnable {
    public static final FHN LJLIL = new FHN();

    public static void LIZ() {
        while (true) {
            try {
                String key = C38715FHj.LIZIZ.take();
                o.LJFF(key, "key");
                C38723FHr.LIZIZ.getClass();
                C38731FHz c38731FHz = C38731FHz.LIZIZ;
                int i = -1;
                if (c38731FHz.LIZ.LIZJ().contains(key)) {
                    i = c38731FHz.LIZ.LIZJ().getInt(key, -1);
                }
                ((HashMap) FHR.LIZIZ).put(key, Integer.valueOf(i));
            } catch (Throwable unused) {
                C38715FHj.LIZLLL = true;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
            throw null;
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }
}
