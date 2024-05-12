package X;

import java.util.concurrent.Executor;

/* renamed from: X.0p5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19150p5<Key, Value> {
    public final AbstractC19010or<Key, Value> LIZ;
    public final C19180p8 LIZIZ;
    public Executor LIZJ;
    public Executor LIZLLL;
    public AbstractC19140p4 LJ;
    public Key LJFF;

    public final AbstractC19190p9<Value> LIZ() {
        AbstractC19010or<Key, Value> abstractC19010or;
        int i;
        int i2;
        Executor executor = this.LIZJ;
        if (executor != null) {
            Executor executor2 = this.LIZLLL;
            if (executor2 != null) {
                AbstractC19010or<Key, Value> abstractC19010or2 = this.LIZ;
                AbstractC19140p4 abstractC19140p4 = this.LJ;
                C19180p8 c19180p8 = this.LIZIZ;
                Key key = this.LJFF;
                if (abstractC19010or2.LIZLLL() || !c19180p8.LIZJ) {
                    if (!abstractC19010or2.LIZLLL()) {
                        final AbstractC34671Xr abstractC34671Xr = (AbstractC34671Xr) abstractC19010or2;
                        abstractC19010or = new AbstractC34531Xd<Integer, Value>(abstractC34671Xr) { // from class: X.1nF
                            public final AbstractC34671Xr<Value> LIZJ;

                            @Override // X.AbstractC19010or
                            public final void LIZJ() {
                                this.LIZJ.LIZJ();
                            }

                            @Override // X.AbstractC19010or
                            public final boolean LJ() {
                                return this.LIZJ.LJ();
                            }

                            {
                                this.LIZJ = abstractC34671Xr;
                            }

                            @Override // X.AbstractC19010or
                            public final void LIZIZ(InterfaceC18990op interfaceC18990op) {
                                this.LIZJ.LIZIZ(interfaceC18990op);
                            }

                            @Override // X.AbstractC19010or
                            public final void LJFF(InterfaceC18990op interfaceC18990op) {
                                this.LIZJ.LJFF(interfaceC18990op);
                            }

                            @Override // X.AbstractC34531Xd
                            public final Integer LJIIIZ(int i3, Object obj) {
                                return Integer.valueOf(i3);
                            }

                            @Override // X.AbstractC34531Xd
                            public final void LJI(int i3, Object obj, int i4, Executor executor3, C34541Xe c34541Xe) {
                                this.LIZJ.LJI(1, i3 + 1, i4, executor3, c34541Xe);
                            }

                            @Override // X.AbstractC34531Xd
                            public final void LJII(int i3, Object obj, int i4, Executor executor3, C34541Xe c34541Xe) {
                                int i5 = i3 - 1;
                                if (i5 < 0) {
                                    this.LIZJ.LJI(2, i5, 0, executor3, c34541Xe);
                                    return;
                                }
                                int min = Math.min(i4, i5 + 1);
                                this.LIZJ.LJI(2, (i5 - min) + 1, min, executor3, c34541Xe);
                            }

                            @Override // X.AbstractC34531Xd
                            public final void LJIIIIZZ(Object obj, int i3, int i4, boolean z, Executor executor3, C34541Xe c34541Xe) {
                                Integer num = (Integer) obj;
                                if (num != null) {
                                    num.intValue();
                                }
                                AbstractC34671Xr<Value> abstractC34671Xr2 = this.LIZJ;
                                abstractC34671Xr2.getClass();
                                C34651Xp c34651Xp = new C34651Xp(abstractC34671Xr2, i4, c34541Xe);
                                abstractC34671Xr2.LJII();
                                C19000oq<T> c19000oq = c34651Xp.LIZ;
                                synchronized (c19000oq.LIZLLL) {
                                    c19000oq.LJ = executor3;
                                }
                            }
                        };
                        if (key != null) {
                            i = ((Integer) key).intValue();
                            return new C34551Xf((AbstractC34531Xd) abstractC19010or, executor, executor2, abstractC19140p4, c19180p8, key, i);
                        }
                        abstractC19010or2 = abstractC19010or;
                    }
                    abstractC19010or = abstractC19010or2;
                    i = -1;
                    return new C34551Xf((AbstractC34531Xd) abstractC19010or, executor, executor2, abstractC19140p4, c19180p8, key, i);
                }
                AbstractC34671Xr abstractC34671Xr2 = (AbstractC34671Xr) abstractC19010or2;
                if (key != null) {
                    i2 = ((Integer) key).intValue();
                } else {
                    i2 = 0;
                }
                return new C34701Xu(abstractC34671Xr2, executor, executor2, abstractC19140p4, c19180p8, i2);
            }
            throw new IllegalArgumentException("BackgroundThreadExecutor required");
        }
        throw new IllegalArgumentException("MainThreadExecutor required");
    }

    public C19150p5(AbstractC19010or<Key, Value> abstractC19010or, C19180p8 c19180p8) {
        if (abstractC19010or != null) {
            if (c19180p8 != null) {
                this.LIZ = abstractC19010or;
                this.LIZIZ = c19180p8;
                return;
            }
            throw new IllegalArgumentException("Config may not be null");
        }
        throw new IllegalArgumentException("DataSource may not be null");
    }
}
