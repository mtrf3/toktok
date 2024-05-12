package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Icn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47017Icn implements InterfaceC47034Id4 {
    public final InterfaceC47032Id2 LIZ;

    @Override // X.InterfaceC47032Id2
    public final void release() {
    }

    @Override // X.InterfaceC47034Id4
    public final int type() {
        return 1;
    }

    public C47017Icn(C47010Icg sessionProvider) {
        o.LJIIIZ(sessionProvider, "sessionProvider");
        this.LIZ = sessionProvider;
    }

    @Override // X.InterfaceC47034Id4
    public final boolean LIZ(C47007Icd c47007Icd) {
        if (c47007Icd == null) {
            return false;
        }
        c47007Icd.LJFF();
        return false;
    }

    @Override // X.InterfaceC47032Id2
    public final C47007Icd LIZIZ(IX4 ix4) {
        return this.LIZ.LIZIZ(ix4);
    }
}
