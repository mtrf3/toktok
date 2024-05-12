package X;

import java.util.Iterator;

/* loaded from: classes14.dex */
public class UIY implements Iterable<Long>, InterfaceC90533gv {
    public final long LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI = 1;

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new C36963Ef1(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }

    public UIY(long j, long j2) {
        this.LJLIL = j;
        this.LJLILLLLZI = C78939UyV.LJIJI(j, j2, 1L);
    }
}
