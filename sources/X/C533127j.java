package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.27j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C533127j<E> extends AbstractC61884OQm<E> implements InterfaceC37411dR<E> {
    public final InterfaceC37411dR<E> LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final E get(int i) {
        C00B.LIZ(i, this.LJLJJI);
        return this.LJLILLLLZI.get(this.LJLJI + i);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final List subList(int i, int i2) {
        C00B.LIZJ(i, i2, this.LJLJJI);
        InterfaceC37411dR<E> interfaceC37411dR = this.LJLILLLLZI;
        int i3 = this.LJLJI;
        return new C533127j(interfaceC37411dR, i + i3, i3 + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C533127j(InterfaceC37411dR<? extends E> source, int i, int i2) {
        o.LJIIIZ(source, "source");
        this.LJLILLLLZI = source;
        this.LJLJI = i;
        C00B.LIZJ(i, i2, source.size());
        this.LJLJJI = i2 - i;
    }
}
