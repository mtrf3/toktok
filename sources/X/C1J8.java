package X;

import X.C0Q9;
import kotlin.jvm.internal.o;

/* renamed from: X.1J8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1J8<T, V extends C0Q9> implements InterfaceC07130Pt<T, V> {
    public final C0QF<V> LIZ;
    public final C0QC<T, V> LIZIZ;
    public final T LIZJ;
    public final T LIZLLL;
    public final V LJ;
    public final V LJFF;
    public final V LJI;
    public final long LJII;
    public final V LJIIIIZZ;

    public C1J8() {
        throw null;
    }

    @Override // X.InterfaceC07130Pt
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TargetBasedAnimation: ");
        LIZ.append(this.LIZJ);
        LIZ.append(" -> ");
        LIZ.append(this.LIZLLL);
        LIZ.append(",initial velocity: ");
        LIZ.append(this.LJI);
        LIZ.append(", duration: ");
        LIZ.append(LIZIZ() / 1000000);
        LIZ.append(" ms");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC07130Pt
    public final long LIZIZ() {
        return this.LJII;
    }

    @Override // X.InterfaceC07130Pt
    public final C0QC<T, V> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC07130Pt
    public final T LJFF() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC07130Pt
    public final boolean LIZJ(long j) {
        return C07120Ps.LIZ(this, j);
    }

    @Override // X.InterfaceC07130Pt
    public final T LJ(long j) {
        if (!C07120Ps.LIZ(this, j)) {
            return (T) this.LIZIZ.LIZIZ().invoke(this.LIZ.LIZLLL(j, this.LJ, this.LJFF, this.LJI));
        }
        return this.LIZLLL;
    }

    @Override // X.InterfaceC07130Pt
    public final V LJI(long j) {
        if (!C07120Ps.LIZ(this, j)) {
            return this.LIZ.LIZIZ(j, this.LJ, this.LJFF, this.LJI);
        }
        return this.LJIIIIZZ;
    }

    public /* synthetic */ C1J8(C0Q2 c0q2, C0QC c0qc, Object obj, Object obj2) {
        this(c0q2, c0qc, obj, obj2, null);
    }

    public C1J8(C0Q2<T> animationSpec, C0QC<T, V> typeConverter, T t, T t2, V v) {
        V v2;
        o.LJIIIZ(animationSpec, "animationSpec");
        o.LJIIIZ(typeConverter, "typeConverter");
        C0QF<V> animationSpec2 = animationSpec.LIZ(typeConverter);
        o.LJIIIZ(animationSpec2, "animationSpec");
        this.LIZ = animationSpec2;
        this.LIZIZ = typeConverter;
        this.LIZJ = t;
        this.LIZLLL = t2;
        V invoke = typeConverter.LIZ().invoke(t);
        this.LJ = invoke;
        V invoke2 = typeConverter.LIZ().invoke(t2);
        this.LJFF = invoke2;
        if (v == null || (v2 = (V) C78946Uyc.LJIIIZ(v)) == null) {
            V invoke3 = typeConverter.LIZ().invoke(t);
            o.LJIIIZ(invoke3, "<this>");
            v2 = (V) invoke3.LIZJ();
        }
        this.LJI = v2;
        this.LJII = animationSpec2.LJII(invoke, invoke2, v2);
        this.LJIIIIZZ = animationSpec2.LIZJ(invoke, invoke2, v2);
    }
}
