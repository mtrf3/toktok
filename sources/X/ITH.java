package X;

import com.google.android.play.core.assetpacks.t0;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes9.dex */
public final class ITH extends t0 {
    public static final ITH LIZJ = new ITH();

    public static final void LIZ(String str) {
        if (str == null) {
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) LIZJ.LIZ).iterator();
        while (it.hasNext()) {
            ((IUK) it.next()).accept(str);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) LIZJ.LIZIZ).get(str);
        if (copyOnWriteArraySet == null) {
            return;
        }
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((IUK) it2.next()).accept(str);
        }
    }
}
