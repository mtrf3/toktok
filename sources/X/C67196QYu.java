package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.QYu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C67196QYu implements QZ6 {
    public static final AtomicReference<C67196QYu> LIZ = new AtomicReference<>();

    @Override // X.QZ6
    public final void LIZ(boolean z) {
        synchronized (C67195QYt.LJIIIZ) {
            Iterator it = new ArrayList(C67195QYt.LJIIJJI.values()).iterator();
            while (it.hasNext()) {
                C67195QYt c67195QYt = (C67195QYt) it.next();
                if (c67195QYt.LJ.get()) {
                    Iterator it2 = ((CopyOnWriteArrayList) c67195QYt.LJIIIIZZ).iterator();
                    while (it2.hasNext()) {
                        ((QZ7) it2.next()).LIZ(z);
                    }
                }
            }
        }
    }
}
