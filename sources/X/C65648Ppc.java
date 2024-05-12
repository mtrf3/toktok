package X;

import defpackage.g0;
import java.io.Serializable;

/* renamed from: X.Ppc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65648Ppc<E> extends AbstractC65674Pq2<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public final E LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC65712Pqe
    public final E LIZLLL() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC65712Pqe
    public final int getCount() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C65648Ppc(int i, Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI = i;
        g0.LJIIIIZZ(i, "count");
    }
}
