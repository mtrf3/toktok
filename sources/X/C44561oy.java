package X;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.1oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C44561oy<K, V, T> extends AbstractC38681fU<K, V, T> {
    public final C44551ox<K, V> LJLJJI;
    public K LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;

    @Override // X.AbstractC38681fU, java.util.Iterator
    public final T next() {
        if (this.LJLJJI.LJLJJL == this.LJLJL) {
            if (this.LJLJI) {
                AbstractC38701fW<K, V, T> abstractC38701fW = this.LJLIL[this.LJLILLLLZI];
                this.LJLJJL = (K) abstractC38701fW.LJLIL[abstractC38701fW.LJLJI];
                this.LJLJJLL = true;
                return (T) super.next();
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC38681fU, java.util.Iterator
    public final void remove() {
        int i;
        if (this.LJLJJLL) {
            if (this.LJLJI) {
                AbstractC38701fW<K, V, T> abstractC38701fW = this.LJLIL[this.LJLILLLLZI];
                Object obj = abstractC38701fW.LJLIL[abstractC38701fW.LJLJI];
                C44551ox<K, V> c44551ox = this.LJLJJI;
                C65777Prh.LIZJ(c44551ox).remove(this.LJLJJL);
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                LIZLLL(i, this.LJLJJI.LJLJI, obj, 0);
            } else {
                C44551ox<K, V> c44551ox2 = this.LJLJJI;
                C65777Prh.LIZJ(c44551ox2).remove(this.LJLJJL);
            }
            this.LJLJJL = null;
            this.LJLJJLL = false;
            this.LJLJL = this.LJLJJI.LJLJJL;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44561oy(C44551ox<K, V> builder, AbstractC38701fW<K, V, T>[] abstractC38701fWArr) {
        super(builder.LJLJI, abstractC38701fWArr);
        o.LJIIIZ(builder, "builder");
        this.LJLJJI = builder;
        this.LJLJL = builder.LJLJJL;
    }

    public final void LIZLLL(int i, C14U<?, ?> c14u, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            AbstractC38701fW<K, V, T> abstractC38701fW = this.LJLIL[i2];
            Object[] objArr = c14u.LIZLLL;
            int length = objArr.length;
            abstractC38701fW.getClass();
            abstractC38701fW.LJLIL = objArr;
            abstractC38701fW.LJLILLLLZI = length;
            abstractC38701fW.LJLJI = 0;
            while (true) {
                AbstractC38701fW<K, V, T> abstractC38701fW2 = this.LJLIL[i2];
                if (!o.LJ(abstractC38701fW2.LJLIL[abstractC38701fW2.LJLJI], k)) {
                    this.LJLIL[i2].LJLJI += 2;
                } else {
                    this.LJLILLLLZI = i2;
                    return;
                }
            }
        } else {
            int i4 = 1 << ((i >> i3) & 31);
            if (c14u.LJII(i4)) {
                int LJFF = c14u.LJFF(i4);
                AbstractC38701fW<K, V, T> abstractC38701fW3 = this.LJLIL[i2];
                Object[] buffer = c14u.LIZLLL;
                int bitCount = Integer.bitCount(c14u.LIZ) * 2;
                abstractC38701fW3.getClass();
                o.LJIIIZ(buffer, "buffer");
                abstractC38701fW3.LJLIL = buffer;
                abstractC38701fW3.LJLILLLLZI = bitCount;
                abstractC38701fW3.LJLJI = LJFF;
                this.LJLILLLLZI = i2;
                return;
            }
            int LJIJI = c14u.LJIJI(i4);
            C14U<?, ?> LJIJ = c14u.LJIJ(LJIJI);
            AbstractC38701fW<K, V, T> abstractC38701fW4 = this.LJLIL[i2];
            Object[] buffer2 = c14u.LIZLLL;
            int bitCount2 = Integer.bitCount(c14u.LIZ) * 2;
            abstractC38701fW4.getClass();
            o.LJIIIZ(buffer2, "buffer");
            abstractC38701fW4.LJLIL = buffer2;
            abstractC38701fW4.LJLILLLLZI = bitCount2;
            abstractC38701fW4.LJLJI = LJIJI;
            LIZLLL(i, LJIJ, k, i2 + 1);
        }
    }
}
