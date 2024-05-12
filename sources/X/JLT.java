package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class JLT<E> {
    public final List<E> LIZ = new ArrayList();
    public boolean LIZIZ = false;
    public List<E> LIZJ = new ArrayList();

    public final synchronized List<E> LIZ() {
        if (this.LIZIZ) {
            this.LIZJ = new ArrayList(((ArrayList) this.LIZ).size());
            Iterator<E> it = ((ArrayList) this.LIZ).iterator();
            while (it.hasNext()) {
                ((ArrayList) this.LIZJ).add(it.next());
            }
            this.LIZIZ = false;
        }
        return this.LIZJ;
    }
}
