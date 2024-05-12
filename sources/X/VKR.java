package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class VKR implements Iterator {
    public int LJLIL = -1;
    public boolean LJLILLLLZI;
    public Iterator LJLJI;
    public final /* synthetic */ VKW LJLJJI;

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.LJLILLLLZI = true;
        int i = this.LJLIL + 1;
        this.LJLIL = i;
        if (i < this.LJLJJI.LJLILLLLZI.size()) {
            return ListProtector.get(this.LJLJJI.LJLILLLLZI, this.LJLIL);
        }
        return LIZ().next();
    }

    public final Iterator LIZ() {
        if (this.LJLJI == null) {
            this.LJLJI = this.LJLJJI.LJLJI.entrySet().iterator();
        }
        return this.LJLJI;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL + 1 < this.LJLJJI.LJLILLLLZI.size() || (!this.LJLJJI.LJLJI.isEmpty() && LIZ().hasNext())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            this.LJLJJI.LJI();
            if (this.LJLIL < this.LJLJJI.LJLILLLLZI.size()) {
                VKW vkw = this.LJLJJI;
                int i = this.LJLIL;
                this.LJLIL = i - 1;
                vkw.LJIIIZ(i);
                return;
            }
            LIZ().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public VKR(VKW vkw) {
        this.LJLJJI = vkw;
    }
}
