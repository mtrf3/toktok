package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Icm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47016Icm implements InterfaceC47034Id4 {
    public final InterfaceC47032Id2 LIZ;
    public C47007Icd LIZIZ;

    @Override // X.InterfaceC47034Id4
    public final int type() {
        return 3;
    }

    @Override // X.InterfaceC47032Id2
    public final void release() {
        C47007Icd c47007Icd = this.LIZIZ;
        if (c47007Icd != null) {
            c47007Icd.LJFF();
        }
        this.LIZIZ = null;
    }

    public C47016Icm(C47010Icg sessionProvider) {
        o.LJIIIZ(sessionProvider, "sessionProvider");
        this.LIZ = sessionProvider;
    }

    @Override // X.InterfaceC47034Id4
    public final boolean LIZ(C47007Icd c47007Icd) {
        if (c47007Icd == null) {
            return false;
        }
        c47007Icd.LJII();
        this.LIZIZ = c47007Icd;
        return true;
    }

    @Override // X.InterfaceC47032Id2
    public final C47007Icd LIZIZ(IX4 ix4) {
        C47007Icd c47007Icd = this.LIZIZ;
        if (c47007Icd == null) {
            return this.LIZ.LIZIZ(ix4);
        }
        return c47007Icd;
    }
}
