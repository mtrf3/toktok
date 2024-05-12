package X;

import X.XJH;
import java.lang.Comparable;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class XJD<T extends XJH & Comparable<? super T>> {
    public T[] LIZ;
    public volatile /* synthetic */ int _size;

    public final void LIZ(T t) {
        t.LIZLLL((XJC) this);
        T[] tArr = this.LIZ;
        if (tArr == null) {
            tArr = (T[]) new XJH[4];
            this.LIZ = tArr;
        } else if (this._size >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            o.LJIIIIZZ(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            tArr = (T[]) ((XJH[]) copyOf);
            this.LIZ = tArr;
        }
        int i = this._size;
        this._size = i + 1;
        tArr[i] = t;
        t.setIndex(i);
        LIZLLL(i);
    }

    public final void LIZIZ(XJH xjh) {
        synchronized (this) {
            if (xjh.LIZJ() != null) {
                LIZJ(xjh.getIndex());
            }
        }
    }

    public final T LIZJ(int i) {
        T[] tArr = this.LIZ;
        o.LJI(tArr);
        this._size--;
        if (i < this._size) {
            LJ(i, this._size);
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                o.LJI(t);
                T t2 = tArr[i2];
                o.LJI(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    LJ(i, i2);
                    LIZLLL(i2);
                }
            }
            while (true) {
                int i3 = (i * 2) + 1;
                if (i3 >= this._size) {
                    break;
                }
                T[] tArr2 = this.LIZ;
                o.LJI(tArr2);
                int i4 = i3 + 1;
                if (i4 < this._size) {
                    T t3 = tArr2[i4];
                    o.LJI(t3);
                    T t4 = tArr2[i3];
                    o.LJI(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i3 = i4;
                    }
                }
                T t5 = tArr2[i];
                o.LJI(t5);
                T t6 = tArr2[i3];
                o.LJI(t6);
                if (((Comparable) t5).compareTo(t6) <= 0) {
                    break;
                }
                LJ(i, i3);
                i = i3;
            }
        }
        T t7 = tArr[this._size];
        o.LJI(t7);
        t7.LIZLLL(null);
        t7.setIndex(-1);
        tArr[this._size] = null;
        return t7;
    }

    public final void LIZLLL(int i) {
        while (i > 0) {
            T[] tArr = this.LIZ;
            o.LJI(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            o.LJI(t);
            T t2 = tArr[i];
            o.LJI(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            LJ(i, i2);
            i = i2;
        }
    }

    public final void LJ(int i, int i2) {
        T[] tArr = this.LIZ;
        o.LJI(tArr);
        T t = tArr[i2];
        o.LJI(t);
        T t2 = tArr[i];
        o.LJI(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
