package X;

import java.util.Collection;

/* renamed from: X.SwT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73717SwT<T, U extends Collection<? super T>> extends AbstractC73638SvC<U> implements L7V<U> {
    public final InterfaceC115714gR<T> LJLIL;
    public final J0W LJLILLLLZI = new J0W();

    @Override // X.L7V
    public final AbstractC73672Svk<U> LIZIZ() {
        return new C73718SwU(this.LJLIL, this.LJLILLLLZI);
    }

    public C73717SwT(InterfaceC115714gR interfaceC115714gR) {
        this.LJLIL = interfaceC115714gR;
    }

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super U> interfaceC73463SsN) {
        try {
            this.LJLIL.LIZ(new C73719SwV(interfaceC73463SsN, (Collection) this.LJLILLLLZI.call()));
        } catch (Throwable th) {
            V0N.LJJIL(th);
            EnumC73538Sta.error(th, interfaceC73463SsN);
        }
    }
}
