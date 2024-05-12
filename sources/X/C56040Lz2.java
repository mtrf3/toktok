package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: X.Lz2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56040Lz2 implements Iterator<View>, InterfaceC90533gv {
    public int LJLIL;
    public final /* synthetic */ ViewGroup LJLILLLLZI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL < this.LJLILLLLZI.getChildCount()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final View next() {
        ViewGroup viewGroup = this.LJLILLLLZI;
        int i = this.LJLIL;
        this.LJLIL = i + 1;
        return viewGroup.getChildAt(i);
    }

    public C56040Lz2(ViewGroup viewGroup) {
        this.LJLILLLLZI = viewGroup;
    }
}
