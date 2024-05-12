package X;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.YUw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC87478YUw extends AbstractC87481YUz implements java.util.Set {
    public transient AbstractC87480YUy LJLILLLLZI;

    @Override // X.AbstractC87481YUz
    /* renamed from: zzd */
    public abstract YV5 iterator();

    public final AbstractC87480YUy zzg() {
        AbstractC87480YUy abstractC87480YUy = this.LJLILLLLZI;
        if (abstractC87480YUy == null) {
            YV3 LJIIJ = LJIIJ();
            this.LJLILLLLZI = LJIIJ;
            return LJIIJ;
        }
        return abstractC87480YUy;
    }

    public YV3 LJIIJ() {
        Object[] array = toArray();
        int length = array.length;
        if (length == 0) {
            return YV3.LJLJJL;
        }
        return new YV3(length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i;
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    @Override // X.AbstractC87481YUz, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static int LJIIIZ(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC87478YUw) && (this instanceof C87479YUx)) {
            obj.getClass();
            if ((obj instanceof C87479YUx) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static AbstractC87478YUw LJIILJJIL(int i, Object... objArr) {
        Object[] objArr2 = objArr;
        if (i != 0) {
            if (i != 1) {
                int LJIIIZ = LJIIIZ(i);
                Object[] objArr3 = new Object[LJIIIZ];
                int i2 = LJIIIZ - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr2[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
                        while (true) {
                            int i6 = rotateLeft & i2;
                            Object obj2 = objArr3[i6];
                            if (obj2 == null) {
                                objArr2[i4] = obj;
                                objArr3[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            }
                            if (!obj2.equals(obj)) {
                                rotateLeft++;
                            }
                        }
                    } else {
                        throw new NullPointerException(C64.LIZIZ("at index ", i5));
                    }
                }
                Arrays.fill(objArr2, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr2[0];
                    obj3.getClass();
                    return new YV0(obj3);
                }
                if (LJIIIZ(i4) >= LJIIIZ / 2) {
                    if (i4 <= 0) {
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    }
                    return new C87479YUx(i3, i2, i4, objArr2, objArr3);
                }
                return LJIILJJIL(i4, objArr2);
            }
            Object obj4 = objArr2[0];
            obj4.getClass();
            return new YV0(obj4);
        }
        return C87479YUx.LJLJLLL;
    }

    public static AbstractC87478YUw zzi(Object obj, Object obj2) {
        return LJIILJJIL(2, obj, obj2);
    }
}
