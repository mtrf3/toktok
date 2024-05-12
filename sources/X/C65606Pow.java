package X;

import java.io.Serializable;

/* renamed from: X.Pow, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65606Pow<V> implements Serializable {
    public static final long serialVersionUID = 0;
    public final AbstractC65564PoG<?, V> LJLIL;

    public Object readResolve() {
        return this.LJLIL.values();
    }

    public C65606Pow(AbstractC65564PoG<?, V> abstractC65564PoG) {
        this.LJLIL = abstractC65564PoG;
    }
}
