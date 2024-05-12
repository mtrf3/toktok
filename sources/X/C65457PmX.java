package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.PmX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65457PmX implements Iterator<Map.Entry<String, Object>> {
    public int LJLIL = -1;
    public C65454PmU LJLILLLLZI;
    public Object LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public C65454PmU LJLJJLL;
    public final /* synthetic */ C65452PmS LJLJL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.LJLJJL) {
            this.LJLJJL = true;
            this.LJLJI = null;
            while (this.LJLJI == null) {
                int i = this.LJLIL + 1;
                this.LJLIL = i;
                if (i >= this.LJLJL.LJLILLLLZI.LIZLLL.size()) {
                    break;
                }
                C65453PmT c65453PmT = this.LJLJL.LJLILLLLZI;
                C65454PmU LIZ = c65453PmT.LIZ((String) ListProtector.get(c65453PmT.LIZLLL, this.LJLIL));
                this.LJLILLLLZI = LIZ;
                this.LJLJI = LIZ.LIZ(this.LJLJL.LJLIL);
            }
        }
        if (this.LJLJI != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C65454PmU c65454PmU = this.LJLJJLL;
        if (c65454PmU != null && !this.LJLJJI) {
            this.LJLJJI = true;
            c65454PmU.LIZLLL(this.LJLJL.LJLIL, null);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Map.Entry<String, Object> next() {
        if (hasNext()) {
            C65454PmU c65454PmU = this.LJLILLLLZI;
            this.LJLJJLL = c65454PmU;
            Object obj = this.LJLJI;
            this.LJLJJL = false;
            this.LJLJJI = false;
            this.LJLILLLLZI = null;
            this.LJLJI = null;
            return new C65458PmY(this.LJLJL, c65454PmU, obj);
        }
        throw new NoSuchElementException();
    }

    public C65457PmX(C65452PmS c65452PmS) {
        this.LJLJL = c65452PmS;
    }
}
