package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0pB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19210pB<T> extends AbstractList<T> {
    public static final List LJLJLLL = new ArrayList();
    public int LJLIL;
    public final ArrayList<List<T>> LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;

    public final int LJFF() {
        int i = this.LJLIL;
        int size = this.LJLILLLLZI.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(this.LJLILLLLZI, i2);
            if (obj != null && obj != LJLJLLL) {
                break;
            }
            i += this.LJLJJLL;
        }
        return i;
    }

    public final int LJII() {
        int i = this.LJLJI;
        for (int size = this.LJLILLLLZI.size() - 1; size >= 0; size--) {
            Object obj = ListProtector.get(this.LJLILLLLZI, size);
            if (obj != null && obj != LJLJLLL) {
                break;
            }
            i += this.LJLJJLL;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLIL + this.LJLJJL + this.LJLJI;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leading ");
        LIZ.append(this.LJLIL);
        LIZ.append(", storage ");
        LIZ.append(this.LJLJJL);
        LIZ.append(", trailing ");
        LIZ.append(this.LJLJI);
        StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ));
        for (int i = 0; i < this.LJLILLLLZI.size(); i++) {
            sb.append(" ");
            sb.append(ListProtector.get(this.LJLILLLLZI, i));
        }
        return sb.toString();
    }

    public C19210pB() {
        this.LJLILLLLZI = new ArrayList<>();
        this.LJLJI = 0;
        this.LJLJJI = 0;
        this.LJLJJL = 0;
        this.LJLJJLL = 1;
        this.LJLJL = 0;
        this.LJLJLJ = 0;
    }

    public C19210pB(C19210pB<T> c19210pB) {
        this.LJLIL = c19210pB.LJLIL;
        this.LJLILLLLZI = new ArrayList<>(c19210pB.LJLILLLLZI);
        this.LJLJI = c19210pB.LJLJI;
        this.LJLJJI = c19210pB.LJLJJI;
        this.LJLJJL = c19210pB.LJLJJL;
        this.LJLJJLL = c19210pB.LJLJJLL;
        this.LJLJL = c19210pB.LJLJL;
        this.LJLJLJ = c19210pB.LJLJLJ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        if (i >= 0 && i < size()) {
            int i2 = i - this.LJLIL;
            if (i2 >= 0 && i2 < this.LJLJJL) {
                int i3 = this.LJLJJLL;
                int i4 = 0;
                if (i3 > 0) {
                    i4 = i2 / i3;
                    i2 %= i3;
                } else {
                    int size = this.LJLILLLLZI.size();
                    while (i4 < size) {
                        int size2 = ((List) ListProtector.get(this.LJLILLLLZI, i4)).size();
                        if (size2 > i2) {
                            break;
                        }
                        i2 -= size2;
                        i4++;
                    }
                }
                List list = (List) ListProtector.get(this.LJLILLLLZI, i4);
                if (list != null && list.size() != 0) {
                    return (T) ListProtector.get(list, i2);
                }
            }
            return null;
        }
        StringBuilder LJ = C7MY.LJ("Index: ", i, ", Size: ");
        LJ.append(size());
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ));
    }

    public final void LIZJ(int i, int i2) {
        int i3;
        int i4 = this.LJLIL / this.LJLJJLL;
        if (i < i4) {
            int i5 = 0;
            while (true) {
                i3 = i4 - i;
                if (i5 >= i3) {
                    break;
                }
                ListProtector.add(this.LJLILLLLZI, 0, null);
                i5++;
            }
            int i6 = i3 * this.LJLJJLL;
            this.LJLJJL += i6;
            this.LJLIL -= i6;
        } else {
            i = i4;
        }
        if (i2 >= this.LJLILLLLZI.size() + i) {
            int min = Math.min(this.LJLJI, ((i2 + 1) - (this.LJLILLLLZI.size() + i)) * this.LJLJJLL);
            for (int size = this.LJLILLLLZI.size(); size <= i2 - i; size++) {
                ArrayList<List<T>> arrayList = this.LJLILLLLZI;
                ListProtector.add(arrayList, arrayList.size(), null);
            }
            this.LJLJJL += min;
            this.LJLJI -= min;
        }
    }

    public final boolean LJIIIIZZ(int i, int i2) {
        Object obj;
        int i3 = this.LJLIL / i;
        if (i2 < i3 || i2 >= this.LJLILLLLZI.size() + i3 || (obj = ListProtector.get(this.LJLILLLLZI, i2 - i3)) == null || obj == LJLJLLL) {
            return false;
        }
        return true;
    }

    public final void LJIIJ(int i, List list, C34701Xu c34701Xu) {
        boolean z;
        int size = list.size();
        if (size != this.LJLJJLL) {
            int size2 = size();
            int i2 = this.LJLJJLL;
            if (i == size2 - (size2 % i2) && size < i2) {
                z = true;
            } else {
                z = false;
            }
            if (this.LJLJI == 0 && this.LJLILLLLZI.size() == 1 && size > this.LJLJJLL) {
                this.LJLJJLL = size;
            } else if (!z) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            }
        }
        int i3 = i / this.LJLJJLL;
        LIZJ(i3, i3);
        int i4 = i3 - (this.LJLIL / this.LJLJJLL);
        Object obj = ListProtector.get(this.LJLILLLLZI, i4);
        if (obj == null || obj == LJLJLLL) {
            ListProtector.set(this.LJLILLLLZI, i4, list);
            if (c34701Xu != null) {
                c34701Xu.LJIL(i, list.size());
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0NY.LIZIZ("Invalid position ", i, ": data already loaded"));
    }

    public final void LJIIIZ(int i, int i2, int i3, List list) {
        this.LJLIL = i;
        this.LJLILLLLZI.clear();
        this.LJLILLLLZI.add(list);
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = list.size();
        this.LJLJJLL = list.size();
        this.LJLJL = 0;
        this.LJLJLJ = 0;
    }
}
