package X;

import java.io.Serializable;

/* renamed from: X.PoJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65567PoJ<K, V> implements Serializable {
    public static final long serialVersionUID = 0;
    public final AbstractC65564PoG<K, V> LJLIL;

    public Object readResolve() {
        return this.LJLIL.entrySet();
    }

    public C65567PoJ(AbstractC65564PoG<K, V> abstractC65564PoG) {
        this.LJLIL = abstractC65564PoG;
    }
}
