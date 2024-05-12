package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class LLS<V> implements Callable {
    public static final LLS<V> LJLIL = new LLS<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Iterator it = ((ArrayList) LLR.LIZLLL).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            LLQ llq = LLR.LJIIJ;
            if (llq != null) {
                llq.LJJIJIIJIL(str);
            }
        }
        return C76800UCe.LIZ;
    }
}
