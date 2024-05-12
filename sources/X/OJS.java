package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OJS<E> extends AbstractC61884OQm<E> implements OJP<E> {
    public final OJP<E> LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final E get(int i) {
        C61879OQh.LIZ(i, this.LJLJJI);
        return this.LJLILLLLZI.get(this.LJLJI + i);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final List subList(int i, int i2) {
        C61879OQh.LIZJ(i, i2, this.LJLJJI);
        OJP<E> ojp = this.LJLILLLLZI;
        int i3 = this.LJLJI;
        return new OJS(ojp, i + i3, i3 + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OJS(OJP<? extends E> source, int i, int i2) {
        o.LJIIIZ(source, "source");
        this.LJLILLLLZI = source;
        this.LJLJI = i;
        C61879OQh.LIZJ(i, i2, source.size());
        this.LJLJJI = i2 - i;
    }
}
