package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Zbi, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90266Zbi implements Iterator<Map.Entry> {
    public int LJLIL = -1;
    public boolean LJLILLLLZI;
    public Iterator<Map.Entry> LJLJI;
    public final /* synthetic */ C90284Zc0 LJLJJI;

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map$Entry, java.lang.Object] */
    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry next() {
        this.LJLILLLLZI = true;
        int i = this.LJLIL + 1;
        this.LJLIL = i;
        if (i < this.LJLJJI.LJLILLLLZI.size()) {
            return ListProtector.get(this.LJLJJI.LJLILLLLZI, this.LJLIL);
        }
        return LIZ().next();
    }

    public final Iterator<Map.Entry> LIZ() {
        if (this.LJLJI == null) {
            this.LJLJI = this.LJLJJI.LJLJI.entrySet().iterator();
        }
        return this.LJLJI;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL + 1 < this.LJLJJI.LJLILLLLZI.size()) {
            return true;
        }
        if (!this.LJLJJI.LJLJI.isEmpty() && LIZ().hasNext()) {
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
                C90284Zc0 c90284Zc0 = this.LJLJJI;
                int i = this.LJLIL;
                this.LJLIL = i - 1;
                c90284Zc0.LIZLLL(i);
                return;
            }
            LIZ().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
