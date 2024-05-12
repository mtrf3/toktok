package X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.Pqg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65714Pqg extends AbstractList<Integer> implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;
    public final int[] LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.LJLILLLLZI; i2 < this.LJLJI; i2++) {
            i = (i * 31) + this.LJLIL[i2];
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI - this.LJLILLLLZI;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.LJLJI - this.LJLILLLLZI) * 5);
        sb.append('[');
        sb.append(this.LJLIL[this.LJLILLLLZI]);
        int i = this.LJLILLLLZI;
        while (true) {
            i++;
            if (i < this.LJLJI) {
                sb.append(", ");
                sb.append(this.LJLIL[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.LJLIL;
            int intValue = ((Integer) obj).intValue();
            int i = this.LJLILLLLZI;
            int i2 = this.LJLJI;
            while (true) {
                if (i >= i2) {
                    break;
                }
                if (iArr[i] == intValue) {
                    if (i != -1) {
                        return true;
                    }
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C65714Pqg) {
            C65714Pqg c65714Pqg = (C65714Pqg) obj;
            int i = this.LJLJI - this.LJLILLLLZI;
            if (c65714Pqg.LJLJI - c65714Pqg.LJLILLLLZI != i) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (this.LJLIL[this.LJLILLLLZI + i2] != c65714Pqg.LJLIL[c65714Pqg.LJLILLLLZI + i2]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C76917UGr.LJFF(i, this.LJLJI - this.LJLILLLLZI);
        return Integer.valueOf(this.LJLIL[this.LJLILLLLZI + i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.LJLIL;
            int intValue = ((Integer) obj).intValue();
            int i = this.LJLILLLLZI;
            int i2 = this.LJLJI;
            while (true) {
                if (i >= i2) {
                    break;
                }
                if (iArr[i] == intValue) {
                    if (i >= 0) {
                        return i - this.LJLILLLLZI;
                    }
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.LJLIL;
            int intValue = ((Integer) obj).intValue();
            int i = this.LJLILLLLZI;
            int i2 = this.LJLJI - 1;
            while (true) {
                if (i2 < i) {
                    break;
                }
                if (iArr[i2] == intValue) {
                    if (i2 >= 0) {
                        return i2 - this.LJLILLLLZI;
                    }
                } else {
                    i2--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        C76917UGr.LJFF(i, this.LJLJI - this.LJLILLLLZI);
        int[] iArr = this.LJLIL;
        int i2 = this.LJLILLLLZI + i;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<Integer> subList(int i, int i2) {
        C76917UGr.LJIIIZ(i, i2, this.LJLJI - this.LJLILLLLZI);
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.LJLIL;
        int i3 = this.LJLILLLLZI;
        return new C65714Pqg(i + i3, i3 + i2, iArr);
    }

    public C65714Pqg(int i, int i2, int[] iArr) {
        this.LJLIL = iArr;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
