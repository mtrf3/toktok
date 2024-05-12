package X;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.3VZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VZ extends F9E {
    public final WeakReference<C109544Rq> LJLIL;
    public final List<C3VP> LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;

    public C3VZ() {
        throw null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)};
    }

    public C3VZ(WeakReference weakReference, List list, boolean z) {
        this.LJLIL = weakReference;
        this.LJLILLLLZI = list;
        this.LJLJI = z;
        this.LJLJJI = 0;
        C221108m2.LIZIZ(C161736Wj.LJLIL);
        C221108m2.LIZIZ(C161726Wi.LJLIL);
    }
}
