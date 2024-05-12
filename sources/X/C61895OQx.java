package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.OQx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61895OQx<E> extends AbstractC61884OQm<E> implements RandomAccess {
    public final List<E> LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C61895OQx(List<? extends E> list) {
        this.LJLILLLLZI = list;
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final E get(int i) {
        C61880OQi.LIZ(i, this.LJLJJI);
        return (E) ListProtector.get(this.LJLILLLLZI, this.LJLJI + i);
    }
}
