package X;

import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes12.dex */
public final class QZO extends QZV {
    public final java.util.Set<Class<?>> LIZ;
    public final java.util.Set<Class<?>> LIZIZ;
    public final java.util.Set<Class<?>> LIZJ;
    public final java.util.Set<Class<?>> LIZLLL;
    public final java.util.Set<Class<?>> LJ;
    public final java.util.Set<Class<?>> LJFF;
    public final QZQ LJI;

    @Override // X.QZV, X.QZQ
    public final <T> T LIZ(Class<T> cls) {
        if (this.LIZ.contains(cls)) {
            T t = (T) this.LJI.LIZ(cls);
            if (!cls.equals(PMT.class)) {
                return t;
            }
            return (T) new QZR(this.LJFF, (PMT) t);
        }
        throw new QZ9(C16880lQ.LLLZ("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    @Override // X.QZQ
    public final <T> C6Y7<java.util.Set<T>> LIZJ(Class<T> cls) {
        if (this.LJ.contains(cls)) {
            return this.LJI.LIZJ(cls);
        }
        throw new QZ9(C16880lQ.LLLZ("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    @Override // X.QZQ
    public final <T> C6Y7<T> LJ(Class<T> cls) {
        if (this.LIZIZ.contains(cls)) {
            return this.LJI.LJ(cls);
        }
        throw new QZ9(C16880lQ.LLLZ("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    @Override // X.QZV, X.QZQ
    public final <T> java.util.Set<T> LJI(Class<T> cls) {
        if (this.LIZLLL.contains(cls)) {
            return this.LJI.LJI(cls);
        }
        throw new QZ9(C16880lQ.LLLZ("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public QZO(QZT qzt, C67200QYy c67200QYy) {
        boolean z;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (QZW qzw : qzt.LIZIZ) {
            int i = qzw.LIZJ;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (qzw.LIZIZ == 2) {
                    hashSet4.add(qzw.LIZ);
                } else {
                    hashSet.add(qzw.LIZ);
                }
            } else if (i == 2) {
                hashSet3.add(qzw.LIZ);
            } else if (qzw.LIZIZ == 2) {
                hashSet5.add(qzw.LIZ);
            } else {
                hashSet2.add(qzw.LIZ);
            }
        }
        if (!qzt.LJFF.isEmpty()) {
            hashSet.add(PMT.class);
        }
        this.LIZ = Collections.unmodifiableSet(hashSet);
        this.LIZIZ = Collections.unmodifiableSet(hashSet2);
        this.LIZJ = Collections.unmodifiableSet(hashSet3);
        this.LIZLLL = Collections.unmodifiableSet(hashSet4);
        this.LJ = Collections.unmodifiableSet(hashSet5);
        this.LJFF = qzt.LJFF;
        this.LJI = c67200QYy;
    }
}
