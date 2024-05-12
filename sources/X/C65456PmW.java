package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PmW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65456PmW implements Iterator<Map.Entry<String, Object>> {
    public boolean LJLIL;
    public final C65457PmX LJLILLLLZI;
    public final Iterator<Map.Entry<String, Object>> LJLJI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI.hasNext() || this.LJLJI.hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Map.Entry<String, Object> next() {
        if (!this.LJLIL) {
            if (this.LJLILLLLZI.hasNext()) {
                return this.LJLILLLLZI.next();
            }
            this.LJLIL = true;
        }
        return this.LJLJI.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.LJLIL) {
            this.LJLJI.remove();
        }
        this.LJLILLLLZI.remove();
    }

    public C65456PmW(C65445PmL c65445PmL, C65455PmV c65455PmV) {
        c65455PmV.getClass();
        this.LJLILLLLZI = new C65457PmX(c65455PmV.LJLIL);
        this.LJLJI = c65445PmL.LJLIL.entrySet().iterator();
    }
}
