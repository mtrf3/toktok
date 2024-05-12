package X;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.PmM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65446PmM<K, V> extends AbstractMap<K, V> implements Cloneable {
    public int LJLIL;
    public Object[] LJLILLLLZI;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.LJLIL = 0;
        this.LJLILLLLZI = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        return new C65450PmQ(this);
    }

    @Override // java.util.AbstractMap
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C65446PmM<K, V> clone() {
        try {
            C65446PmM<K, V> c65446PmM = (C65446PmM) super.clone();
            Object[] objArr = this.LJLILLLLZI;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                c65446PmM.LJLILLLLZI = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return c65446PmM;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.LJLIL;
    }

    public final int LIZIZ(Object obj) {
        int i = this.LJLIL << 1;
        Object[] objArr = this.LJLILLLLZI;
        for (int i2 = 0; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return i2;
                }
            } else {
                if (obj.equals(obj2)) {
                    return i2;
                }
            }
        }
        return -2;
    }

    public final V LIZJ(int i) {
        V v;
        int i2 = this.LJLIL << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        int i3 = i + 1;
        if (i3 < 0) {
            v = null;
        } else {
            v = (V) this.LJLILLLLZI[i3];
        }
        Object[] objArr = this.LJLILLLLZI;
        int i4 = (i2 - i) - 2;
        if (i4 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i4);
        }
        this.LJLIL--;
        int i5 = i2 - 2;
        Object[] objArr2 = this.LJLILLLLZI;
        objArr2[i5] = null;
        objArr2[i5 + 1] = null;
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (-2 != LIZIZ(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.LJLIL << 1;
        Object[] objArr = this.LJLILLLLZI;
        for (int i2 = 1; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else {
                if (obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        int LIZIZ = LIZIZ(obj) + 1;
        if (LIZIZ < 0) {
            return null;
        }
        return (V) this.LJLILLLLZI[LIZIZ];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return LIZJ(LIZIZ(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int length;
        int LIZIZ = LIZIZ(k) >> 1;
        if (LIZIZ == -1) {
            LIZIZ = this.LJLIL;
        }
        if (LIZIZ >= 0) {
            int i = LIZIZ + 1;
            if (i >= 0) {
                Object[] objArr = this.LJLILLLLZI;
                int i2 = i << 1;
                if (objArr == null) {
                    length = 0;
                } else {
                    length = objArr.length;
                }
                V v2 = null;
                if (i2 > length) {
                    int i3 = ((length / 2) * 3) + 1;
                    if (i3 % 2 != 0) {
                        i3++;
                    }
                    if (i3 >= i2) {
                        i2 = i3;
                    }
                    int i4 = this.LJLIL;
                    if (i4 == 0 || i2 != objArr.length) {
                        Object[] objArr2 = new Object[i2];
                        this.LJLILLLLZI = objArr2;
                        if (i4 != 0) {
                            System.arraycopy(objArr, 0, objArr2, 0, i4 << 1);
                        }
                    }
                }
                int i5 = LIZIZ << 1;
                int i6 = i5 + 1;
                if (i6 >= 0) {
                    v2 = (V) this.LJLILLLLZI[i6];
                }
                Object[] objArr3 = this.LJLILLLLZI;
                objArr3[i5] = k;
                objArr3[i6] = v;
                if (i > this.LJLIL) {
                    this.LJLIL = i;
                }
                return v2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }
}
