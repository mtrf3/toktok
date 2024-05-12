package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24440xc<T> {
    public final InterfaceC24520xk LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        InterfaceC24520xk interfaceC24520xk = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkippableUpdater(composer=");
        LIZ.append(interfaceC24520xk);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C24440xc(InterfaceC24520xk interfaceC24520xk) {
        this.LIZ = interfaceC24520xk;
    }

    public final boolean equals(Object obj) {
        InterfaceC24520xk interfaceC24520xk = this.LIZ;
        if (!(obj instanceof C24440xc) || !o.LJ(interfaceC24520xk, ((C24440xc) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
