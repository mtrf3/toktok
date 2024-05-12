package X;

import kotlin.jvm.internal.o;

/* renamed from: X.26n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C530926n<T> implements C0O9, InterfaceC41301ji<T> {
    public C35961b6<T> next;
    public final InterfaceC24600xs<T> policy;

    @Override // X.InterfaceC35811ar, X.InterfaceC24760y8
    public final T getValue() {
        return ((C35961b6) C0OF.LJIILLIIL(this.next, this)).LIZJ;
    }

    public final String toString() {
        C35961b6 c35961b6 = (C35961b6) C0OF.LJI(this.next);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MutableState(value=");
        LIZ.append(c35961b6.LIZJ);
        LIZ.append(")@");
        LIZ.append(hashCode());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC41301ji
    public final InterfaceC24600xs<T> LIZ() {
        return this.policy;
    }

    @Override // X.C0O9
    public final C0OB LJII() {
        return this.next;
    }

    @Override // X.C0O9
    public final void LJIIIIZZ(C0OB c0ob) {
        this.next = (C35961b6) c0ob;
    }

    @Override // X.InterfaceC35811ar
    public final void setValue(T t) {
        C0OA LJIIIIZZ;
        C35961b6 c35961b6 = (C35961b6) C0OF.LJI(this.next);
        if (!this.policy.LIZIZ(c35961b6.LIZJ, t)) {
            C35961b6<T> c35961b62 = this.next;
            synchronized (C0OF.LIZJ) {
                LJIIIIZZ = C0OF.LJIIIIZZ();
                ((C35961b6) C0OF.LJIILIIL(c35961b62, this, LJIIIIZZ, c35961b6)).LIZJ = t;
            }
            C0OF.LJIIL(LJIIIIZZ, this);
        }
    }

    public C530926n(T t, InterfaceC24600xs<T> policy) {
        o.LJIIIZ(policy, "policy");
        this.policy = policy;
        this.next = new C35961b6<>(t);
    }

    @Override // X.C0O9
    public final C0OB LJIIIZ(C0OB c0ob, C0OB c0ob2, C0OB c0ob3) {
        if (this.policy.LIZIZ(((C35961b6) c0ob2).LIZJ, ((C35961b6) c0ob3).LIZJ)) {
            return c0ob2;
        }
        this.policy.LIZ();
        return null;
    }
}
