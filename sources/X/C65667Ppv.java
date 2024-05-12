package X;

import defpackage.g0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.Ppv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65667Ppv<E> implements Iterator<E> {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ C65657Ppl LJLJJI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final E next() {
        if (this.LJLJJI.LJLJJL == this.LJLIL) {
            if (hasNext()) {
                int i = this.LJLILLLLZI;
                this.LJLJI = i;
                C65657Ppl c65657Ppl = this.LJLJJI;
                E e = (E) c65657Ppl.LJLJI[i];
                int i2 = i + 1;
                if (i2 >= c65657Ppl.LJLJL) {
                    i2 = -1;
                }
                this.LJLILLLLZI = i2;
                return e;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.LJLJJI.LJLJJL == this.LJLIL) {
            if (this.LJLJI >= 0) {
                z = true;
            } else {
                z = false;
            }
            g0.LJIIJ(z);
            this.LJLIL++;
            C65657Ppl c65657Ppl = this.LJLJJI;
            Object[] objArr = c65657Ppl.LJLJI;
            int i = this.LJLJI;
            c65657Ppl.LJFF((int) (c65657Ppl.LJLILLLLZI[i] >>> 32), objArr[i]);
            C65657Ppl c65657Ppl2 = this.LJLJJI;
            int i2 = this.LJLILLLLZI;
            c65657Ppl2.getClass();
            this.LJLILLLLZI = i2 - 1;
            this.LJLJI = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }

    public C65667Ppv(C65657Ppl c65657Ppl) {
        int i;
        this.LJLJJI = c65657Ppl;
        this.LJLIL = c65657Ppl.LJLJJL;
        if (c65657Ppl.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        this.LJLILLLLZI = i;
        this.LJLJI = -1;
    }
}
