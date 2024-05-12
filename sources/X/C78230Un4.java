package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Un4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78230Un4 {
    public final EnumC78220Umu LIZ;
    public final InterfaceC78233Un7 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78230Un4)) {
            return false;
        }
        C78230Un4 c78230Un4 = (C78230Un4) obj;
        return this.LIZ == c78230Un4.LIZ && o.LJ(this.LIZIZ, c78230Un4.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC78233Un7 interfaceC78233Un7 = this.LIZIZ;
        return hashCode + (interfaceC78233Un7 == null ? 0 : interfaceC78233Un7.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Renderer(engine=");
        LIZ.append(this.LIZ);
        LIZ.append(", adapter=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C78230Un4(EnumC78220Umu engine, InterfaceC78233Un7 interfaceC78233Un7) {
        o.LJIIIZ(engine, "engine");
        this.LIZ = engine;
        this.LIZIZ = interfaceC78233Un7;
    }
}
