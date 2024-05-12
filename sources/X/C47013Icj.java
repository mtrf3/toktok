package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Icj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47013Icj implements InterfaceC47034Id4 {
    public final InterfaceC47032Id2 LIZ;
    public C47007Icd LIZIZ;

    @Override // X.InterfaceC47032Id2
    public final void release() {
    }

    @Override // X.InterfaceC47034Id4
    public final int type() {
        return 2;
    }

    public C47013Icj(C47010Icg sessionProvider) {
        o.LJIIIZ(sessionProvider, "sessionProvider");
        this.LIZ = sessionProvider;
    }

    @Override // X.InterfaceC47034Id4
    public final boolean LIZ(C47007Icd c47007Icd) {
        if (c47007Icd != null) {
            c47007Icd.LJII();
        }
        this.LIZIZ = c47007Icd;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.LJIIIZ != false) goto L6;
     */
    @Override // X.InterfaceC47032Id2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47007Icd LIZIZ(X.IX4 r2) {
        /*
            r1 = this;
            X.Icd r0 = r1.LIZIZ
            if (r0 == 0) goto Lb
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.LJIIIZ
            if (r0 == 0) goto L13
        Lb:
            X.Id2 r0 = r1.LIZ
            X.Icd r0 = r0.LIZIZ(r2)
            r1.LIZIZ = r0
        L13:
            X.Icd r0 = r1.LIZIZ
            kotlin.jvm.internal.o.LJI(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47013Icj.LIZIZ(X.IX4):X.Icd");
    }
}
