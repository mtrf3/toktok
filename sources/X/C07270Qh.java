package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07270Qh<T> {
    public final String LIZ;
    public final InterfaceC88471Ynr<T, T, T> LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SemanticsPropertyKey: ");
        LIZ.append(this.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C07270Qh(String str, InterfaceC88471Ynr<? super T, ? super T, ? extends T> mergePolicy) {
        o.LJIIIZ(mergePolicy, "mergePolicy");
        this.LIZ = str;
        this.LIZIZ = mergePolicy;
    }

    public final void LIZ(InterfaceC07280Qi thisRef, InterfaceC74236TBo<?> property, T t) {
        o.LJIIIZ(thisRef, "thisRef");
        o.LJIIIZ(property, "property");
        thisRef.LIZJ(this, t);
    }
}
