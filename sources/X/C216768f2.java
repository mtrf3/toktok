package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8f2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216768f2 implements InterfaceC217158ff {
    public final C0MB<C1UB<AbstractC216708ew<AbstractC216018dp>>> LIZ = new C0MB<>();
    public final C0MB<InterfaceC216878fD> LIZIZ = new C0MB<>();

    @Override // X.InterfaceC217158ff
    public final void LIZ(AbstractC216708ew<AbstractC216018dp> item) {
        o.LJIIIZ(item, "item");
        C1UB<AbstractC216708ew<AbstractC216018dp>> LJ = this.LIZ.LJ(item.LIZJ(), null);
        if (LJ == null) {
            LJ = new C1UB<>(8);
            this.LIZ.LJI(item.LIZJ(), LJ);
        }
        item.LJIIIZ();
        LJ.LIZ(item);
    }
}
