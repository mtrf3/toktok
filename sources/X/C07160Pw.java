package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.ListIterator;
import kotlin.jvm.internal.IDqS2S0201000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07160Pw<S> {
    public final C0Q5<S> LIZ;
    public final String LIZIZ;
    public final ParcelableSnapshotMutableState LIZJ;
    public final ParcelableSnapshotMutableState LIZLLL;
    public final ParcelableSnapshotMutableState LJ;
    public final ParcelableSnapshotMutableState LJFF;
    public final ParcelableSnapshotMutableState LJI;
    public final C48211ur<C07160Pw<S>.d<?, ?>> LJII;
    public final C48211ur<C07160Pw<?>> LJIIIIZZ;
    public final ParcelableSnapshotMutableState LJIIIZ;
    public long LJIIJ;
    public final C44001o4 LJIIJJI;

    /* renamed from: X.0Pw$d */
    /* loaded from: classes.dex */
    public final class d<T, V extends C0Q9> implements InterfaceC24760y8<T> {
        public final C0QC<T, V> LJLIL;
        public final ParcelableSnapshotMutableState LJLILLLLZI;
        public final ParcelableSnapshotMutableState LJLJI;
        public final ParcelableSnapshotMutableState LJLJJI;
        public final ParcelableSnapshotMutableState LJLJJL;
        public final ParcelableSnapshotMutableState LJLJJLL;
        public final ParcelableSnapshotMutableState LJLJL;
        public final ParcelableSnapshotMutableState LJLJLJ;
        public V LJLJLLL;
        public final C41391jr LJLL;
        public final /* synthetic */ C07160Pw<S> LJLLI;

        public final C1J8<T, V> LIZJ() {
            return (C1J8) this.LJLJJI.getValue();
        }

        @Override // X.InterfaceC24760y8
        public final T getValue() {
            return this.LJLJLJ.getValue();
        }

        public final void LJII(T t, C1J4<T> animationSpec) {
            o.LJIIIZ(animationSpec, "animationSpec");
            if (!o.LJ(this.LJLILLLLZI.getValue(), t) || ((Boolean) this.LJLJL.getValue()).booleanValue()) {
                this.LJLILLLLZI.setValue(t);
                this.LJLJI.setValue(animationSpec);
                LJFF(this, null, !((Boolean) this.LJLJJL.getValue()).booleanValue(), 1);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.LJLJJL;
                Boolean bool = Boolean.FALSE;
                parcelableSnapshotMutableState.setValue(bool);
                this.LJLJJLL.setValue(Long.valueOf(((Number) this.LJLLI.LJ.getValue()).longValue()));
                this.LJLJL.setValue(bool);
            }
        }

        public final void LJI(T t, T t2, C1J4<T> animationSpec) {
            o.LJIIIZ(animationSpec, "animationSpec");
            this.LJLILLLLZI.setValue(t2);
            this.LJLJI.setValue(animationSpec);
            if (o.LJ(LIZJ().LIZJ, t) && o.LJ(LIZJ().LIZLLL, t2)) {
                return;
            }
            LJFF(this, t, false, 2);
        }

        public static void LJFF(d dVar, Object obj, boolean z, int i) {
            C0Q2 c0q2;
            Object obj2 = obj;
            if ((i & 1) != 0) {
                obj2 = dVar.getValue();
            }
            if ((i & 2) != 0 || !z) {
                c0q2 = (C0Q2) dVar.LJLJI.getValue();
            } else if (dVar.LJLJI.getValue() instanceof C41391jr) {
                c0q2 = (C0Q2) dVar.LJLJI.getValue();
            } else {
                c0q2 = dVar.LJLL;
            }
            dVar.LJLJJI.setValue(new C1J8(c0q2, dVar.LJLIL, obj2, dVar.LJLILLLLZI.getValue(), dVar.LJLJLLL));
            C07160Pw<S> c07160Pw = dVar.LJLLI;
            c07160Pw.LJI.setValue(Boolean.TRUE);
            if (c07160Pw.LJ()) {
                ListIterator<C07160Pw<S>.d<?, ?>> listIterator = c07160Pw.LJII.listIterator();
                long j = 0;
                while (true) {
                    C1IF c1if = (C1IF) listIterator;
                    if (c1if.hasNext()) {
                        d dVar2 = (d) c1if.next();
                        j = Math.max(j, dVar2.LIZJ().LJII);
                        long j2 = c07160Pw.LJIIJ;
                        dVar2.LJLJLJ.setValue(dVar2.LIZJ().LJ(j2));
                        dVar2.LJLJLLL = dVar2.LIZJ().LJI(j2);
                    } else {
                        c07160Pw.LJI.setValue(Boolean.FALSE);
                        return;
                    }
                }
            }
        }

        public d(C07160Pw this$0, T t, V initialVelocityVector, C0QC<T, V> typeConverter, String label) {
            o.LJIIIZ(this$0, "this$0");
            o.LJIIIZ(initialVelocityVector, "initialVelocityVector");
            o.LJIIIZ(typeConverter, "typeConverter");
            o.LJIIIZ(label, "label");
            this.LJLLI = this$0;
            this.LJLIL = typeConverter;
            ParcelableSnapshotMutableState LJJJIL = C78966Uyw.LJJJIL(t);
            this.LJLILLLLZI = LJJJIL;
            T t2 = null;
            ParcelableSnapshotMutableState LJJJIL2 = C78966Uyw.LJJJIL(C1JI.LJJIJIIJI(0.0f, 0.0f, null, 7));
            this.LJLJI = LJJJIL2;
            this.LJLJJI = C78966Uyw.LJJJIL(new C1J8((C0Q2) LJJJIL2.getValue(), typeConverter, t, LJJJIL.getValue(), initialVelocityVector));
            this.LJLJJL = C78966Uyw.LJJJIL(Boolean.TRUE);
            this.LJLJJLL = C78966Uyw.LJJJIL(0L);
            this.LJLJL = C78966Uyw.LJJJIL(Boolean.FALSE);
            this.LJLJLJ = C78966Uyw.LJJJIL(t);
            this.LJLJLLL = initialVelocityVector;
            Float f = C07180Py.LIZIZ.get(typeConverter);
            if (f != null) {
                float floatValue = f.floatValue();
                V invoke = typeConverter.LIZ().invoke(t);
                int LIZIZ = invoke.LIZIZ();
                for (int i = 0; i < LIZIZ; i++) {
                    invoke.LJ(floatValue, i);
                }
                t2 = this.LJLIL.LIZIZ().invoke(invoke);
            }
            this.LJLL = C1JI.LJJIJIIJI(0.0f, 0.0f, t2, 3);
        }
    }

    public C07160Pw() {
        throw null;
    }

    public final S LIZIZ() {
        return (S) this.LIZ.LIZ.getValue();
    }

    public final InterfaceC07150Pv<S> LIZJ() {
        return (InterfaceC07150Pv) this.LIZLLL.getValue();
    }

    public final S LIZLLL() {
        return (S) this.LIZJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJ() {
        return ((Boolean) this.LJIIIZ.getValue()).booleanValue();
    }

    public final void LJI() {
        this.LJFF.setValue(Long.MIN_VALUE);
        this.LIZ.LIZ.setValue(LIZLLL());
        this.LJ.setValue(0L);
        this.LIZ.LIZJ.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [V extends X.0Q9, X.0Q9] */
    public final void LJFF(long j) {
        if (((Number) this.LJFF.getValue()).longValue() == Long.MIN_VALUE) {
            this.LJFF.setValue(Long.valueOf(j));
            this.LIZ.LIZJ.setValue(Boolean.TRUE);
        }
        this.LJI.setValue(Boolean.FALSE);
        this.LJ.setValue(Long.valueOf(j - ((Number) this.LJFF.getValue()).longValue()));
        ListIterator<C07160Pw<S>.d<?, ?>> listIterator = this.LJII.listIterator();
        boolean z = true;
        while (true) {
            C1IF c1if = (C1IF) listIterator;
            if (!c1if.hasNext()) {
                break;
            }
            d dVar = (d) c1if.next();
            if (!((Boolean) dVar.LJLJJL.getValue()).booleanValue()) {
                long longValue = ((Number) this.LJ.getValue()).longValue() - ((Number) dVar.LJLJJLL.getValue()).longValue();
                dVar.LJLJLJ.setValue(dVar.LIZJ().LJ(longValue));
                dVar.LJLJLLL = dVar.LIZJ().LJI(longValue);
                C1J8 LIZJ = dVar.LIZJ();
                LIZJ.getClass();
                if (C07120Ps.LIZ(LIZJ, longValue)) {
                    dVar.LJLJJL.setValue(Boolean.TRUE);
                    dVar.LJLJJLL.setValue(0L);
                }
            }
            if (!((Boolean) dVar.LJLJJL.getValue()).booleanValue()) {
                z = false;
            }
        }
        ListIterator<C07160Pw<?>> listIterator2 = this.LJIIIIZZ.listIterator();
        while (true) {
            C1IF c1if2 = (C1IF) listIterator2;
            if (!c1if2.hasNext()) {
                break;
            }
            C07160Pw c07160Pw = (C07160Pw) c1if2.next();
            if (!o.LJ(c07160Pw.LIZLLL(), c07160Pw.LIZIZ())) {
                c07160Pw.LJFF(((Number) this.LJ.getValue()).longValue());
            }
            if (!o.LJ(c07160Pw.LIZLLL(), c07160Pw.LIZIZ())) {
                z = false;
            }
        }
        if (z) {
            LJI();
        }
    }

    /* renamed from: X.0Pw$a */
    /* loaded from: classes.dex */
    public final class a<T, V extends C0Q9> {
        public final C0QC<T, V> LIZ;
        public final String LIZIZ;
        public C07160Pw<S>.C0000a<T, V>.InterfaceC0002a<T, V> LIZJ;
        public final /* synthetic */ C07160Pw<S> LIZLLL;

        /* renamed from: X.0Pw$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0000a<T, V extends C0Q9> implements InterfaceC24760y8<T> {
            public final C07160Pw<S>.d<T, V> LJLIL;
            public InterfaceC88472Yns<? super InterfaceC07150Pv<S>, ? extends C1J4<T>> LJLILLLLZI;
            public InterfaceC88472Yns<? super S, ? extends T> LJLJI;
            public final /* synthetic */ C07160Pw<S>.a<T, V> LJLJJI;

            @Override // X.InterfaceC24760y8
            public final T getValue() {
                LIZJ(this.LJLJJI.LIZLLL.LIZJ());
                return this.LJLIL.getValue();
            }

            public final void LIZJ(InterfaceC07150Pv<S> segment) {
                o.LJIIIZ(segment, "segment");
                T invoke = this.LJLJI.invoke(segment.LIZJ());
                if (this.LJLJJI.LIZLLL.LJ()) {
                    this.LJLIL.LJI(this.LJLJI.invoke(segment.LIZIZ()), invoke, this.LJLILLLLZI.invoke(segment));
                } else {
                    this.LJLIL.LJII(invoke, this.LJLILLLLZI.invoke(segment));
                }
            }

            public C0000a(a this$0, C07160Pw<S>.d<T, V> dVar, InterfaceC88472Yns<? super InterfaceC07150Pv<S>, ? extends C1J4<T>> transitionSpec, InterfaceC88472Yns<? super S, ? extends T> interfaceC88472Yns) {
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(transitionSpec, "transitionSpec");
                this.LJLJJI = this$0;
                this.LJLIL = dVar;
                this.LJLILLLLZI = transitionSpec;
                this.LJLJI = interfaceC88472Yns;
            }
        }

        public final C0000a LIZ(InterfaceC88472Yns transitionSpec, InterfaceC88472Yns interfaceC88472Yns) {
            o.LJIIIZ(transitionSpec, "transitionSpec");
            C07160Pw<S>.C0000a<T, V>.InterfaceC0002a<T, V> c0000a = this.LIZJ;
            if (c0000a == null) {
                C07160Pw<S> c07160Pw = this.LIZLLL;
                c0000a = new C0000a<>(this, new d(c07160Pw, interfaceC88472Yns.invoke(c07160Pw.LIZIZ()), C78598Ut0.LJFF(this.LIZ, interfaceC88472Yns.invoke(this.LIZLLL.LIZIZ())), this.LIZ, this.LIZIZ), transitionSpec, interfaceC88472Yns);
                C07160Pw<S> c07160Pw2 = this.LIZLLL;
                this.LIZJ = c0000a;
                C07160Pw<S>.d<T, V> animation = c0000a.LJLIL;
                c07160Pw2.getClass();
                o.LJIIIZ(animation, "animation");
                c07160Pw2.LJII.add(animation);
            }
            C07160Pw<S> c07160Pw3 = this.LIZLLL;
            c0000a.LJLJI = interfaceC88472Yns;
            c0000a.LJLILLLLZI = transitionSpec;
            c0000a.LIZJ(c07160Pw3.LIZJ());
            return c0000a;
        }

        public a(C07160Pw this$0, C1JR typeConverter, String label) {
            o.LJIIIZ(this$0, "this$0");
            o.LJIIIZ(typeConverter, "typeConverter");
            o.LJIIIZ(label, "label");
            this.LIZLLL = this$0;
            this.LIZ = typeConverter;
            this.LIZIZ = label;
        }
    }

    public C07160Pw(C0Q5<S> transitionState, String str) {
        o.LJIIIZ(transitionState, "transitionState");
        this.LIZ = transitionState;
        this.LIZIZ = str;
        this.LIZJ = C78966Uyw.LJJJIL(LIZIZ());
        this.LIZLLL = C78966Uyw.LJJJIL(new C1JA(LIZIZ(), LIZIZ()));
        this.LJ = C78966Uyw.LJJJIL(0L);
        this.LJFF = C78966Uyw.LJJJIL(Long.MIN_VALUE);
        this.LJI = C78966Uyw.LJJJIL(Boolean.TRUE);
        this.LJII = new C48211ur<>();
        this.LJIIIIZZ = new C48211ur<>();
        this.LJIIIZ = C78966Uyw.LJJJIL(Boolean.FALSE);
        this.LJIIJJI = C78966Uyw.LJIJI(new IDqS420S0100000(this, (C07160Pw<EnumC06630Nv>) 79));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(S r9, X.InterfaceC24520xk r10, int r11) {
        /*
            r8 = this;
            r0 = -1097578271(0xffffffffbe9448e1, float:-0.28961852)
            X.1b3 r3 = r10.LJIL(r0)
            r0 = r11 & 14
            if (r0 != 0) goto Lab
            boolean r0 = r3.LJIJJ(r9)
            if (r0 == 0) goto La8
            r2 = 4
        L12:
            r2 = r2 | r11
        L13:
            r0 = r11 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L20
            boolean r0 = r3.LJIJJ(r8)
            if (r0 == 0) goto La4
            r0 = 32
        L1f:
            r2 = r2 | r0
        L20:
            r0 = r2 & 91
            r0 = r0 ^ 18
            if (r0 != 0) goto L2c
            boolean r0 = r3.LIZ()
            if (r0 != 0) goto La0
        L2c:
            boolean r0 = r8.LJ()
            if (r0 != 0) goto L81
            r1 = r2 & 14
            r0 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r8.LJIIIIZZ(r9, r3, r0)
            java.lang.Object r0 = r8.LIZIZ()
            boolean r0 = kotlin.jvm.internal.o.LJ(r9, r0)
            r2 = 0
            if (r0 == 0) goto L57
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r8.LJFF
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r6 = r0.longValue()
            r4 = -9223372036854775808
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L91
        L57:
            r0 = -3686930(0xffffffffffc7bdee, float:NaN)
            r3.LJJIIJ(r0)
            boolean r0 = r3.LJIJJ(r8)
            java.lang.Object r1 = r3.LJJJZ()
            if (r0 != 0) goto L70
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L79
        L70:
            X.2BS r1 = new X.2BS
            r0 = 0
            r1.<init>(r8, r0)
            r3.LJLJLLL(r1)
        L79:
            r3.LJJJJJ(r2)
            X.Ynr r1 = (X.InterfaceC88471Ynr) r1
            X.C24610xt.LJ(r8, r1, r3)
        L81:
            X.1b9 r2 = r3.LJJJJLI()
            if (r2 != 0) goto L88
        L87:
            return
        L88:
            kotlin.jvm.internal.IDqS2S0201000 r1 = new kotlin.jvm.internal.IDqS2S0201000
            r0 = 2
            r1.<init>(r8, r9, r11, r0)
            r2.LIZLLL = r1
            goto L87
        L91:
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r8.LJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L81
            goto L57
        La0:
            r3.LIZLLL()
            goto L81
        La4:
            r0 = 16
            goto L1f
        La8:
            r2 = 2
            goto L12
        Lab:
            r2 = r11
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07160Pw.LIZ(java.lang.Object, X.0xk, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [V extends X.0Q9, X.0Q9] */
    public final void LJII(long j, Object obj, Object obj2) {
        this.LJFF.setValue(Long.MIN_VALUE);
        this.LIZ.LIZJ.setValue(Boolean.FALSE);
        if (!LJ() || !o.LJ(LIZIZ(), obj) || !o.LJ(LIZLLL(), obj2)) {
            this.LIZ.LIZ.setValue(obj);
            this.LIZJ.setValue(obj2);
            this.LJIIIZ.setValue(Boolean.TRUE);
            this.LIZLLL.setValue(new C1JA(obj, obj2));
        }
        ListIterator<C07160Pw<?>> listIterator = this.LJIIIIZZ.listIterator();
        while (true) {
            C1IF c1if = (C1IF) listIterator;
            if (!c1if.hasNext()) {
                break;
            }
            C07160Pw c07160Pw = (C07160Pw) c1if.next();
            if (c07160Pw.LJ()) {
                c07160Pw.LJII(j, c07160Pw.LIZIZ(), c07160Pw.LIZLLL());
            }
        }
        ListIterator<C07160Pw<S>.d<?, ?>> listIterator2 = this.LJII.listIterator();
        while (true) {
            C1IF c1if2 = (C1IF) listIterator2;
            if (c1if2.hasNext()) {
                d dVar = (d) c1if2.next();
                dVar.LJLJLJ.setValue(dVar.LIZJ().LJ(j));
                dVar.LJLJLLL = dVar.LIZJ().LJI(j);
            } else {
                this.LJIIJ = j;
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(S s, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1598251902);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (((i2 & 91) ^ 18) != 0 || !LJIL.LIZ()) {
            if (!LJ() && !o.LJ(LIZLLL(), s)) {
                this.LIZLLL.setValue(new C1JA(LIZLLL(), s));
                this.LIZ.LIZ.setValue(LIZLLL());
                this.LIZJ.setValue(s);
                if (((Number) this.LJFF.getValue()).longValue() == Long.MIN_VALUE) {
                    this.LJI.setValue(Boolean.TRUE);
                }
                ListIterator<C07160Pw<S>.d<?, ?>> listIterator = this.LJII.listIterator();
                while (true) {
                    C1IF c1if = (C1IF) listIterator;
                    if (!c1if.hasNext()) {
                        break;
                    } else {
                        ((d) c1if.next()).LJLJL.setValue(Boolean.TRUE);
                    }
                }
            }
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS2S0201000(this, (C07160Pw<int>) s, i, 3);
    }
}
