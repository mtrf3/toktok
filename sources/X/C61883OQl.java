package X;

import java.util.RandomAccess;
import kotlin.jvm.internal.o;

/* renamed from: X.OQl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61883OQl<E> extends AbstractC61884OQm<E> implements RandomAccess {
    public final AbstractC61884OQm<E> LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final E get(int i) {
        C61880OQi.LIZ(i, this.LJLJJI);
        return this.LJLILLLLZI.get(this.LJLJI + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C61883OQl(AbstractC61884OQm<? extends E> list, int i, int i2) {
        o.LJIIIZ(list, "list");
        this.LJLILLLLZI = list;
        this.LJLJI = i;
        C61880OQi.LIZJ(i, i2, list.LIZJ());
        this.LJLJJI = i2 - i;
    }
}
