package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.2pj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70512pj {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C70522pk.LJLIL);

    public static final synchronized void LIZ(boolean z) {
        synchronized (C70512pj.class) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setShareHeadShow: ");
            LIZ2.append(z);
            C34B.LIZIZ("ShareStyle", X1D.LIZIZ(LIZ2));
            Iterator it = ((List) LIZ.getValue()).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ((List) LIZ.getValue()).clear();
        }
    }
}
