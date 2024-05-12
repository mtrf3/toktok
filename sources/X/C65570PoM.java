package X;

import java.io.Serializable;

/* renamed from: X.PoM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65570PoM<K> implements Serializable {
    public static final long serialVersionUID = 0;
    public final AbstractC65564PoG<K, ?> LJLIL;

    public Object readResolve() {
        return this.LJLIL.keySet();
    }

    public C65570PoM(AbstractC65564PoG<K, ?> abstractC65564PoG) {
        this.LJLIL = abstractC65564PoG;
    }
}
