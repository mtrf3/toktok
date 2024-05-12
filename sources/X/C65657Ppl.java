package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.Ppl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65657Ppl<E> extends AbstractSet<E> implements Serializable {
    public transient int[] LJLIL;
    public transient long[] LJLILLLLZI;
    public transient Object[] LJLJI;
    public transient float LJLJJI;
    public transient int LJLJJL;
    public transient int LJLJJLL;
    public transient int LJLJL;

    public final void LIZJ() {
        int LJ = C1FP.LJ(1.0f, 3);
        int[] iArr = new int[LJ];
        Arrays.fill(iArr, -1);
        this.LJLIL = iArr;
        this.LJLJJI = 1.0f;
        this.LJLJI = new Object[3];
        long[] jArr = new long[3];
        Arrays.fill(jArr, -1L);
        this.LJLILLLLZI = jArr;
        this.LJLJJLL = Math.max(1, (int) (LJ * 1.0f));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.LJLJJL++;
        Arrays.fill(this.LJLJI, 0, this.LJLJL, (Object) null);
        Arrays.fill(this.LJLIL, -1);
        Arrays.fill(this.LJLILLLLZI, -1L);
        this.LJLJL = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.LJLJL == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new C65667Ppv(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return Arrays.copyOf(this.LJLJI, this.LJLJL);
    }

    public C65657Ppl() {
        LIZJ();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        LIZJ();
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                add(objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.LJLJL);
        C65667Ppv c65667Ppv = new C65667Ppv(this);
        while (c65667Ppv.hasNext()) {
            objectOutputStream.writeObject(c65667Ppv.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        long[] jArr = this.LJLILLLLZI;
        Object[] objArr = this.LJLJI;
        int LJIJJLI = C1FP.LJIJJLI(e);
        int[] iArr = this.LJLIL;
        int length = (iArr.length - 1) & LJIJJLI;
        int i = this.LJLJL;
        int i2 = iArr[length];
        if (i2 == -1) {
            iArr[length] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (((int) (j >>> 32)) == LJIJJLI && C78886Uxe.LJIIIIZZ(e, objArr[i2])) {
                    return false;
                }
                int i3 = (int) j;
                if (i3 == -1) {
                    jArr[i2] = (j & (-4294967296L)) | (i & 4294967295L);
                    break;
                }
                i2 = i3;
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i4 = i + 1;
            int length2 = this.LJLILLLLZI.length;
            if (i4 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max < 0) {
                    max = Integer.MAX_VALUE;
                }
                if (max != length2) {
                    this.LJLJI = Arrays.copyOf(this.LJLJI, max);
                    long[] jArr2 = this.LJLILLLLZI;
                    int length3 = jArr2.length;
                    long[] copyOf = Arrays.copyOf(jArr2, max);
                    if (max > length3) {
                        Arrays.fill(copyOf, length3, max, -1L);
                    }
                    this.LJLILLLLZI = copyOf;
                }
            }
            this.LJLILLLLZI[i] = (LJIJJLI << 32) | 4294967295L;
            this.LJLJI[i] = e;
            this.LJLJL = i4;
            if (i >= this.LJLJJLL) {
                int[] iArr2 = this.LJLIL;
                int length4 = iArr2.length * 2;
                if (iArr2.length >= 1073741824) {
                    this.LJLJJLL = Integer.MAX_VALUE;
                } else {
                    int i5 = ((int) (length4 * this.LJLJJI)) + 1;
                    int[] iArr3 = new int[length4];
                    Arrays.fill(iArr3, -1);
                    long[] jArr3 = this.LJLILLLLZI;
                    int i6 = length4 - 1;
                    for (int i7 = 0; i7 < this.LJLJL; i7++) {
                        int i8 = (int) (jArr3[i7] >>> 32);
                        int i9 = i8 & i6;
                        int i10 = iArr3[i9];
                        iArr3[i9] = i7;
                        jArr3[i7] = (i8 << 32) | (i10 & 4294967295L);
                    }
                    this.LJLJJLL = i5;
                    this.LJLIL = iArr3;
                }
            }
            this.LJLJJL++;
            return true;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int LJIJJLI = C1FP.LJIJJLI(obj);
        int i = this.LJLIL[(r1.length - 1) & LJIJJLI];
        while (i != -1) {
            long j = this.LJLILLLLZI[i];
            if (((int) (j >>> 32)) == LJIJJLI && C78886Uxe.LJIIIIZZ(obj, this.LJLJI[i])) {
                return true;
            }
            i = (int) j;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return LJFF(C1FP.LJIJJLI(obj), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        Object[] objArr = this.LJLJI;
        int i = this.LJLJL;
        C76917UGr.LJIIIZ(0, i, objArr.length);
        if (tArr.length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArr, 0, tArr, 0, i);
        return tArr;
    }

    public final boolean LJFF(int i, Object obj) {
        long[] jArr;
        long j;
        int length = (r1.length - 1) & i;
        int i2 = this.LJLIL[length];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.LJLILLLLZI[i2] >>> 32)) == i && C78886Uxe.LJIIIIZZ(obj, this.LJLJI[i2])) {
                if (i3 == -1) {
                    this.LJLIL[length] = (int) this.LJLILLLLZI[i2];
                } else {
                    long[] jArr2 = this.LJLILLLLZI;
                    jArr2[i3] = (jArr2[i3] & (-4294967296L)) | (((int) jArr2[i2]) & 4294967295L);
                }
                int i4 = this.LJLJL - 1;
                if (i2 < i4) {
                    Object[] objArr = this.LJLJI;
                    objArr[i2] = objArr[i4];
                    objArr[i4] = null;
                    long[] jArr3 = this.LJLILLLLZI;
                    long j2 = jArr3[i4];
                    jArr3[i2] = j2;
                    jArr3[i4] = -1;
                    int[] iArr = this.LJLIL;
                    int length2 = ((int) (j2 >>> 32)) & (iArr.length - 1);
                    int i5 = iArr[length2];
                    if (i5 == i4) {
                        iArr[length2] = i2;
                    } else {
                        while (true) {
                            jArr = this.LJLILLLLZI;
                            j = jArr[i5];
                            int i6 = (int) j;
                            if (i6 == i4) {
                                break;
                            }
                            i5 = i6;
                        }
                        jArr[i5] = (4294967295L & i2) | (j & (-4294967296L));
                    }
                } else {
                    this.LJLJI[i2] = null;
                    this.LJLILLLLZI[i2] = -1;
                }
                this.LJLJL--;
                this.LJLJJL++;
                return true;
            }
            int i7 = (int) this.LJLILLLLZI[i2];
            if (i7 == -1) {
                return false;
            }
            i3 = i2;
            i2 = i7;
        }
    }
}
