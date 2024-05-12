package X;

import android.webkit.WebResourceResponse;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public final class NJJ implements NJM {
    public static volatile NJJ LIZIZ;
    public final java.util.Set<NJM> LIZ = new LinkedHashSet();

    public static NJJ LIZLLL() {
        if (LIZIZ == null) {
            synchronized (NJJ.class) {
                if (LIZIZ == null) {
                    LIZIZ = new NJJ();
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZJ() {
        if (C79004UzY.LJJIFFI(this.LIZ)) {
            return;
        }
        Iterator<NJM> it = this.LIZ.iterator();
        while (it.hasNext()) {
            NJM next = it.next();
            if ((next instanceof O43) && ((O43) next).LIZ) {
                it.remove();
            }
        }
    }

    @Override // X.NJM
    public final WebResourceResponse LIZ(String str) {
        HashSet hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.LIZ);
        }
        WebResourceResponse webResourceResponse = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext() && (webResourceResponse = ((NJM) it.next()).LIZ(str)) == null) {
        }
        return webResourceResponse;
    }

    public final void LIZIZ(O43 o43) {
        synchronized (this) {
            this.LIZ.add(o43);
        }
    }
}
