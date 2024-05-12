package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8V6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8V6 extends C8V1<C8W0> implements C8VP {
    public C8W0 LJFF;

    @Override // X.C8V1, X.C8VP
    public final C8W0 build() {
        C8W0 c8w0 = this.LJFF;
        if (c8w0 == null) {
            c8w0 = (C8W0) C39557Ffl.LIZ(LIZJ()).newInstance();
        }
        o.LJIIIIZZ(c8w0, "instance ?: type.java.newInstance()");
        LIZIZ(c8w0);
        return c8w0;
    }
}
