package X;

import android.app.Application;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class F8G {
    public static volatile F8G LIZJ;
    public final Application LIZ;
    public final HashMap<String, F8Y> LIZIZ;

    public F8G() {
        throw null;
    }

    public final void LIZ(F88 f88) {
        for (F8Y f8y : this.LIZIZ.values()) {
            if (f8y instanceof F8M) {
                for (F8Y f8y2 : ((F8M) f8y).LIZ) {
                    if (f8y2.LJ() == f88) {
                        f8y2.LIZLLL();
                    }
                }
            } else if (f8y.LJ() == f88) {
                f8y.LIZLLL();
            }
        }
    }

    public F8G(Application application, HashMap hashMap, F8W f8w) {
        this.LIZ = application;
        this.LIZIZ = hashMap;
        F8U.INSTANCE.init(application, null, f8w);
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((F8Y) it.next()).LIZJ(this.LIZ);
        }
    }
}
