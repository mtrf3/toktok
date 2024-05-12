package X;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.ArrayMap;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class EYH implements Runnable {
    public final EYJ LJLIL;
    public final Runnable LJLILLLLZI;

    public final void LIZ() {
        Runnable runnable;
        EYJ eyj = this.LJLIL;
        if (eyj != null) {
            EYK eyk = (EYK) eyj;
            eyk.getClass();
            if (C9QH.LIZIZ.booleanValue()) {
                if (EYI.LIZIZ == C36505EUj.LIZLLL) {
                    C36505EUj.LJ = true;
                }
                EYI.LIZIZ = C36505EUj.LIZLLL;
                if (!C36505EUj.LJ) {
                    try {
                        ArrayMap<Integer, WeakReference<Runnable>> arrayMap = EYI.LIZ;
                        if (!arrayMap.containsKey(Integer.valueOf(eyk.LIZ.hashCode())) || (runnable = arrayMap.get(Integer.valueOf(eyk.LIZ.hashCode())).get()) == null) {
                            arrayMap.put(Integer.valueOf(eyk.LIZ.hashCode()), new WeakReference<>(EYI.LIZJ.get(eyk.LIZ)));
                            runnable = arrayMap.get(Integer.valueOf(eyk.LIZ.hashCode())).get();
                        }
                        ((Drawable) eyk.LIZ).scheduleSelf(runnable, SystemClock.uptimeMillis() + 16);
                        return;
                    } catch (IllegalAccessException unused) {
                        if (0 != 0) {
                            return;
                        }
                    }
                }
            }
        }
        Runnable runnable2 = this.LJLILLLLZI;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public EYH(EYK eyk, Runnable runnable) {
        this.LJLIL = eyk;
        this.LJLILLLLZI = runnable;
    }
}
