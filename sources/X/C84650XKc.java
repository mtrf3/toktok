package X;

import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupport;

/* renamed from: X.XKc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84650XKc<T, R> extends AbstractC84652XKe {
    public final XKG<R> LJLJJL;
    public final InterfaceC88471Ynr<T, InterfaceC67352kd<? super R>, Object> LJLJJLL;

    @Override // X.XL0
    public final void LJJII(Throwable th) {
        if (this.LJLJJL.LJ()) {
            JobSupport LJJIII = LJJIII();
            XKG<R> xkg = this.LJLJJL;
            InterfaceC88471Ynr<T, InterfaceC67352kd<? super R>, Object> interfaceC88471Ynr = this.LJLJJLL;
            Object LJJJLIIL = LJJIII.LJJJLIIL();
            if (LJJJLIIL instanceof CompletedExceptionally) {
                xkg.LJFF(((CompletedExceptionally) LJJJLIIL).cause);
                return;
            }
            Object LIZ = C84667XKt.LIZ(LJJJLIIL);
            InterfaceC67352kd<R> LJIIJJI = xkg.LJIIJJI();
            try {
                InterfaceC67352kd LJJII = C78555UsJ.LJJII(C78555UsJ.LJIILIIL(interfaceC88471Ynr, LIZ, LJIIJJI));
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                XKV.LIZ(c76800UCe, LJJII, null);
            } catch (Throwable th2) {
                C79000UzU.LIZJ(th2, LJIIJJI);
                throw null;
            }
        }
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        LJJII(th);
        return C76800UCe.LIZ;
    }

    public C84650XKc(XKG xkg, C3C9 c3c9) {
        this.LJLJJL = xkg;
        this.LJLJJLL = c3c9;
    }
}
