package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OM4 implements Iterable<PQN>, InterfaceC90533gv {
    public final List<PQN> LJLIL;
    public final List<PQN> LJLILLLLZI;

    @Override // java.lang.Iterable
    public final Iterator<PQN> iterator() {
        List LJJIJIIJI;
        synchronized (this) {
            LJJIJIIJI = C47261Igj.LJJIJIIJI(this.LJLIL, this.LJLILLLLZI);
        }
        return ((ArrayList) C32I.LJJLI(LJJIJIIJI)).iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OM4(List<? extends PQN> eternalObservers) {
        o.LJIIIZ(eternalObservers, "eternalObservers");
        this.LJLIL = eternalObservers;
        this.LJLILLLLZI = new ArrayList();
    }
}
