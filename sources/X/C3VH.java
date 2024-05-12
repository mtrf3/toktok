package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3VH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VH extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C3VH LJLIL = new C3VH();

    public C3VH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3VI] */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C84683Ua perfMon = C84683Ua.LJFF;
        o.LJIIIZ(perfMon, "perfMon");
        C115114fT.LJI = perfMon;
        ?? r2 = new Object() { // from class: X.3VI
            public final C3VL LIZ = new C3VL(C3VK.LJLIL);
            public final C3VG LIZIZ = new C3VG(C3VJ.LJLIL);

            public final C3VL LIZ() {
                if (C115204fc.LIZ()) {
                    return this.LIZ;
                }
                return null;
            }

            public final C3VG LIZIZ() {
                if (C115204fc.LIZ()) {
                    return this.LIZIZ;
                }
                return null;
            }
        };
        C3VL LIZ = r2.LIZ();
        if (LIZ != null) {
            ((C169706lK) C115114fT.LIZIZ.getValue()).LIZ(LIZ);
        }
        C3VG LIZIZ = r2.LIZIZ();
        if (LIZIZ != null) {
            ((C169706lK) C115114fT.LJFF.getValue()).LIZ(LIZIZ);
        }
        return C76800UCe.LIZ;
    }
}
