package X;

import kotlinx.coroutines.CompletedExceptionally;

/* renamed from: X.XKi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84656XKi<T> extends AbstractC84652XKe {
    public final XKS<T> LJLJJL;

    public C84656XKi(C84659XKl c84659XKl) {
        this.LJLJJL = c84659XKl;
    }

    @Override // X.XL0
    public final void LJJII(Throwable th) {
        Object LJJJLIIL = LJJIII().LJJJLIIL();
        if (LJJJLIIL instanceof CompletedExceptionally) {
            XKS<T> xks = this.LJLJJL;
            C3C4 LIZ = C141335gf.LIZ(((CompletedExceptionally) LJJJLIIL).cause);
            C3C5.m7constructorimpl(LIZ);
            xks.resumeWith(LIZ);
            return;
        }
        XKS<T> xks2 = this.LJLJJL;
        Object LIZ2 = C84667XKt.LIZ(LJJJLIIL);
        C3C5.m7constructorimpl(LIZ2);
        xks2.resumeWith(LIZ2);
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        LJJII(th);
        return C76800UCe.LIZ;
    }
}
