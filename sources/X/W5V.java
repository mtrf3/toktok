package X;

import Y.ARunnableS9S0201000_6;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes15.dex */
public final class W5V extends C81734W5y {
    public final List<W6U> LIZIZ = new LinkedList();
    public final ConcurrentHashMap<W6U, List<SoftReference<FYV>>> LIZ = new ConcurrentHashMap<>();

    public static File LJII(W6U w6u) {
        File file;
        WEK LJ = W8E.LJII().LJIIIZ().LJ(w6u);
        if (LJ == null) {
            LJ = W8E.LJII().LJIILIIL().LJ(w6u);
        }
        if ((LJ instanceof WEK) && (file = LJ.LIZ) != null && file.exists()) {
            return file;
        }
        return null;
    }

    @Override // X.WE4
    public final void LJI(InterfaceC81735W5z interfaceC81735W5z) {
        W6U cacheKey = interfaceC81735W5z.getCacheKey();
        if (cacheKey == null) {
            return;
        }
        C38995FSd.LIZLLL().execute(new ARunnableS9S0201000_6(0, this, cacheKey, 10));
    }
}
