package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.QFb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66683QFb implements Iterator {
    public final int LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public final /* synthetic */ C66684QFc LJLJJI;

    public final void LIZ() {
        if (!this.LJLJI) {
            this.LJLJI = true;
            C66684QFc c66684QFc = this.LJLJJI;
            int i = c66684QFc.LJLJI - 1;
            c66684QFc.LJLJI = i;
            if (i > 0 || !c66684QFc.LJLJJI) {
                return;
            }
            c66684QFc.LJLJJI = false;
            int size = ((ArrayList) c66684QFc.LJLIL).size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                if (ListProtector.get(c66684QFc.LJLIL, size) == null) {
                    ListProtector.remove(c66684QFc.LJLIL, size);
                }
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C66684QFc c66684QFc = this.LJLJJI;
        if (c66684QFc.LJLJJL) {
            c66684QFc.LJLILLLLZI.getClass();
        }
        int i = this.LJLILLLLZI;
        while (i < this.LJLIL && ListProtector.get(this.LJLJJI.LJLIL, i) == null) {
            i++;
        }
        if (i < this.LJLIL) {
            return true;
        }
        LIZ();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [E, java.lang.Object] */
    @Override // java.util.Iterator
    public final E next() {
        C66684QFc c66684QFc = this.LJLJJI;
        if (c66684QFc.LJLJJL) {
            c66684QFc.LJLILLLLZI.getClass();
        }
        while (true) {
            int i = this.LJLILLLLZI;
            if (i >= this.LJLIL || ListProtector.get(this.LJLJJI.LJLIL, i) != null) {
                break;
            }
            this.LJLILLLLZI++;
        }
        int i2 = this.LJLILLLLZI;
        if (i2 < this.LJLIL) {
            C66684QFc c66684QFc2 = this.LJLJJI;
            this.LJLILLLLZI = i2 + 1;
            return ListProtector.get(c66684QFc2.LJLIL, i2);
        }
        LIZ();
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public C66683QFb(C66684QFc c66684QFc) {
        this.LJLJJI = c66684QFc;
        c66684QFc.LJLJI++;
        this.LJLIL = ((ArrayList) c66684QFc.LJLIL).size();
    }
}
