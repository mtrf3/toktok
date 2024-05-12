package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8T7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8T7 {
    public final InterfaceC88471Ynr<String, C188727au, C76800UCe> LIZ;
    public final InterfaceC88471Ynr<String, C188727au, C76800UCe> LIZIZ;

    public C8T7() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8T7)) {
            return false;
        }
        C8T7 c8t7 = (C8T7) obj;
        return o.LJ(this.LIZ, c8t7.LIZ) && o.LJ(this.LIZIZ, c8t7.LIZIZ);
    }

    public final int hashCode() {
        InterfaceC88471Ynr<String, C188727au, C76800UCe> interfaceC88471Ynr = this.LIZ;
        int hashCode = (interfaceC88471Ynr == null ? 0 : interfaceC88471Ynr.hashCode()) * 31;
        InterfaceC88471Ynr<String, C188727au, C76800UCe> interfaceC88471Ynr2 = this.LIZIZ;
        return hashCode + (interfaceC88471Ynr2 != null ? interfaceC88471Ynr2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ComponentMobCallBack(onShow=");
        LIZ.append(this.LIZ);
        LIZ.append(", onClick=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8T7(InterfaceC88471Ynr<? super String, ? super C188727au, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super String, ? super C188727au, C76800UCe> interfaceC88471Ynr2) {
        this.LIZ = interfaceC88471Ynr;
        this.LIZIZ = interfaceC88471Ynr2;
    }
}
