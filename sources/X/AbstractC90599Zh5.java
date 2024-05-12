package X;

import Y.IDRunnableS2S0400000_24;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Zh5, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90599Zh5 extends AbstractC90096ZXo {
    public final Object LIZ = new Object();
    public Executor LIZIZ;
    public InterfaceC90093ZXl LIZJ;
    public C90089ZXh LIZLLL;
    public Collection<C90092ZXk> LJ;

    public String LJIIJ() {
        return null;
    }

    public String LJIIJJI() {
        return null;
    }

    public abstract void LJIILIIL(String str);

    public abstract void LJIILJJIL(String str);

    public abstract void LJIILL(List<String> list);

    public final void LJIIL(C90089ZXh c90089ZXh, Collection<C90092ZXk> collection) {
        if (c90089ZXh != null) {
            synchronized (this.LIZ) {
                Executor executor = this.LIZIZ;
                if (executor != null) {
                    executor.execute(new IDRunnableS2S0400000_24(this, this.LIZJ, c90089ZXh, collection, 1));
                } else {
                    this.LIZLLL = c90089ZXh;
                    this.LJ = new ArrayList(collection);
                }
            }
            return;
        }
        throw new NullPointerException("groupRoute must not be null");
    }

    public final void LJIILLIIL(Executor executor, InterfaceC90093ZXl interfaceC90093ZXl) {
        synchronized (this.LIZ) {
            if (executor != null) {
                if (interfaceC90093ZXl != null) {
                    this.LIZIZ = executor;
                    this.LIZJ = interfaceC90093ZXl;
                    Collection<C90092ZXk> collection = this.LJ;
                    if (collection != null && !collection.isEmpty()) {
                        C90089ZXh c90089ZXh = this.LIZLLL;
                        Collection<C90092ZXk> collection2 = this.LJ;
                        this.LIZLLL = null;
                        this.LJ = null;
                        this.LIZIZ.execute(new IDRunnableS2S0400000_24(this, interfaceC90093ZXl, c90089ZXh, collection2, 0));
                    }
                } else {
                    throw new NullPointerException("Listener shouldn't be null");
                }
            } else {
                throw new NullPointerException("Executor shouldn't be null");
            }
        }
    }
}
