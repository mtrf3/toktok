package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0yF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24830yF<T> {
    public final InterfaceC24520xk LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        InterfaceC24520xk interfaceC24520xk = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Updater(composer=");
        LIZ.append(interfaceC24520xk);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C24830yF(InterfaceC24520xk interfaceC24520xk) {
        this.LIZ = interfaceC24520xk;
    }

    public final boolean equals(Object obj) {
        InterfaceC24520xk interfaceC24520xk = this.LIZ;
        if (!(obj instanceof C24830yF) || !o.LJ(interfaceC24520xk, ((C24830yF) obj).LIZ)) {
            return false;
        }
        return true;
    }

    public static final <V> void LIZ(InterfaceC24520xk interfaceC24520xk, V v, InterfaceC88471Ynr<? super T, ? super V, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        if (interfaceC24520xk.LJIJJLI() || !o.LJ(interfaceC24520xk.LJIILL(), v)) {
            interfaceC24520xk.LJJIII(v);
            interfaceC24520xk.LJJII(v, block);
        }
    }
}
