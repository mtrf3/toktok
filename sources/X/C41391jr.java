package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41391jr<T> implements C1J4<T> {
    public final float LIZ;
    public final float LIZIZ;
    public final T LIZJ;

    public C41391jr() {
        this(null, 7);
    }

    public final int hashCode() {
        int hashCode;
        T t = this.LIZJ;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        return Float.floatToIntBits(this.LIZIZ) + C47959Irz.LIZIZ(this.LIZ, hashCode * 31, 31);
    }

    @Override // X.C0Q2
    public final C0QF LIZ(C0QC converter) {
        final C0Q9 c0q9;
        o.LJIIIZ(converter, "converter");
        final float f = this.LIZ;
        final float f2 = this.LIZIZ;
        T t = this.LIZJ;
        if (t == null) {
            c0q9 = null;
        } else {
            c0q9 = (C0Q9) converter.LIZ().invoke(t);
        }
        return new C0QF(f, f2, c0q9) { // from class: X.1J9
            public final /* synthetic */ C1J3<V> LJLIL;

            @Override // X.C0QF
            public final boolean LIZ() {
                this.LJLIL.getClass();
                return false;
            }

            @Override // X.C0QF
            public final V LIZIZ(long j, V initialValue, V targetValue, V initialVelocity) {
                o.LJIIIZ(initialValue, "initialValue");
                o.LJIIIZ(targetValue, "targetValue");
                o.LJIIIZ(initialVelocity, "initialVelocity");
                return this.LJLIL.LIZIZ(j, initialValue, targetValue, initialVelocity);
            }

            @Override // X.C0QF
            public final V LIZJ(V initialValue, V targetValue, V initialVelocity) {
                o.LJIIIZ(initialValue, "initialValue");
                o.LJIIIZ(targetValue, "targetValue");
                o.LJIIIZ(initialVelocity, "initialVelocity");
                return this.LJLIL.LIZJ(initialValue, targetValue, initialVelocity);
            }

            @Override // X.C0QF
            public final V LIZLLL(long j, V initialValue, V targetValue, V initialVelocity) {
                o.LJIIIZ(initialValue, "initialValue");
                o.LJIIIZ(targetValue, "targetValue");
                o.LJIIIZ(initialVelocity, "initialVelocity");
                return this.LJLIL.LIZLLL(j, initialValue, targetValue, initialVelocity);
            }

            @Override // X.C0QF
            public final long LJII(V initialValue, V targetValue, V initialVelocity) {
                o.LJIIIZ(initialValue, "initialValue");
                o.LJIIIZ(targetValue, "targetValue");
                o.LJIIIZ(initialVelocity, "initialVelocity");
                return this.LJLIL.LJII(initialValue, targetValue, initialVelocity);
            }

            {
                C0QA c0qa;
                if (c0q9 != null) {
                    c0qa = new C0QA(f, f2, c0q9) { // from class: X.1JU
                        public final List<C41411jt> LIZ;

                        @Override // X.C0QA
                        public final C1J6 get(int i) {
                            return (C41411jt) ListProtector.get(this.LIZ, i);
                        }

                        {
                            C40517FvF LJJ = C78842Uww.LJJ(0, c0q9.LIZIZ());
                            ArrayList arrayList = new ArrayList(C32I.LJJL(LJJ, 10));
                            C118234kV it = LJJ.iterator();
                            while (it.LJLJI) {
                                arrayList.add(new C41411jt(f, f2, c0q9.LIZ(it.nextInt())));
                            }
                            this.LIZ = arrayList;
                        }
                    };
                } else {
                    c0qa = new C0QA(f, f2) { // from class: X.1JW
                        public final C41411jt LIZ;

                        @Override // X.C0QA
                        public final C1J6 get(int i) {
                            return this.LIZ;
                        }

                        {
                            this.LIZ = new C41411jt(f, f2, 4);
                        }
                    };
                }
                this.LJLIL = new C1J3<>(c0qa);
            }
        };
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C41391jr)) {
            return false;
        }
        C41391jr c41391jr = (C41391jr) obj;
        if (c41391jr.LIZ != this.LIZ || c41391jr.LIZIZ != this.LIZIZ || !o.LJ(c41391jr.LIZJ, this.LIZJ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C41391jr(java.lang.Object r4, int r5) {
        /*
            r3 = this;
            r0 = r5 & 1
            r2 = 0
            if (r0 == 0) goto L17
            r1 = 1065353216(0x3f800000, float:1.0)
        L7:
            r0 = r5 & 2
            if (r0 == 0) goto Le
            r2 = 1153138688(0x44bb8000, float:1500.0)
        Le:
            r0 = r5 & 4
            if (r0 == 0) goto L13
            r4 = 0
        L13:
            r3.<init>(r1, r2, r4)
            return
        L17:
            r1 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41391jr.<init>(java.lang.Object, int):void");
    }

    public C41391jr(float f, float f2, T t) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = t;
    }
}
