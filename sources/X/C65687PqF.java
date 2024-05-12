package X;

import java.io.Serializable;

/* renamed from: X.PqF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65687PqF<E> implements Serializable {
    public final AbstractC65654Ppi<E> LJLIL;

    public Object readResolve() {
        return this.LJLIL.entrySet();
    }

    public C65687PqF(AbstractC65654Ppi<E> abstractC65654Ppi) {
        this.LJLIL = abstractC65654Ppi;
    }
}
