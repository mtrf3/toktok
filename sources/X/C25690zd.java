package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25690zd<Key, Value> {
    public Object[] LIZ = new Object[16];
    public Object[] LIZIZ = new Object[16];
    public int LIZJ;

    public final int LIZ(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i = this.LIZJ - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.LIZ[i3];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    if (obj == obj2) {
                        return i3;
                    }
                    for (int i4 = i3 - 1; -1 < i4; i4--) {
                        Object obj3 = this.LIZ[i4];
                        if (obj3 == obj) {
                            return i4;
                        }
                        if (System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                    }
                    int i5 = i3 + 1;
                    int i6 = this.LIZJ;
                    while (true) {
                        if (i5 < i6) {
                            Object obj4 = this.LIZ[i5];
                            if (obj4 == obj) {
                                return i5;
                            }
                            if (System.identityHashCode(obj4) != identityHashCode) {
                                break;
                            }
                            i5++;
                        } else {
                            i5 = this.LIZJ;
                            break;
                        }
                    }
                    return -(i5 + 1);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final Value LIZIZ(Key key) {
        o.LJIIIZ(key, "key");
        int LIZ = LIZ(key);
        if (LIZ >= 0) {
            return (Value) this.LIZIZ[LIZ];
        }
        return null;
    }

    public final void LIZJ(Key key, Value value) {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        o.LJIIIZ(key, "key");
        int LIZ = LIZ(key);
        if (LIZ >= 0) {
            this.LIZIZ[LIZ] = value;
            return;
        }
        int i = -(LIZ + 1);
        int i2 = this.LIZJ;
        Object[] objArr3 = this.LIZ;
        if (i2 == objArr3.length) {
            z = true;
            objArr = new Object[i2 * 2];
        } else {
            z = false;
            objArr = objArr3;
        }
        int i3 = i + 1;
        C61898ORa.LJIIZILJ(i3, i, i2, objArr3, objArr);
        if (z) {
            C61898ORa.LJIJJ(this.LIZ, objArr, 0, 0, i, 6);
        }
        objArr[i] = key;
        this.LIZ = objArr;
        if (z) {
            objArr2 = new Object[this.LIZJ * 2];
        } else {
            objArr2 = this.LIZIZ;
        }
        C61898ORa.LJIIZILJ(i3, i, this.LIZJ, this.LIZIZ, objArr2);
        if (z) {
            C61898ORa.LJIJJ(this.LIZIZ, objArr2, 0, 0, i, 6);
        }
        objArr2[i] = value;
        this.LIZIZ = objArr2;
        this.LIZJ++;
    }
}
